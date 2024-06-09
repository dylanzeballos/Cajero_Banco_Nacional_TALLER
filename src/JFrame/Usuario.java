package JFrame;
import java.io.*;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Usuario {
    private int fila;
    private String nombreUsuario;
    private String password;
    private String nombreCompleto;
    private ArrayList<String> cuentas;
    private ArrayList<String> tipoCuentas;
    private ArrayList<Float> saldos;
    private ArrayList<String> movimientos;
    private ArrayList<String> monedas;
    private static Map<String, Float> tiposDeCambio;
    private Map<String, ArrayList<String>> movimientosPorCuenta; // Nuevos movimientos por cuenta
    
    static {
        tiposDeCambio = new HashMap<>();
        // Ejemplos de tipos de cambio iniciales
        tiposDeCambio.put("BOLIVIANOS-DOLARES", 0.14f);
        tiposDeCambio.put("BOLIVIANOS-EUROS", 0.12f);
        tiposDeCambio.put("DOLARES-BOLIVIANOS", 7.07f);
        tiposDeCambio.put("DOLARES-EUROS", 0.85f);
        tiposDeCambio.put("EUROS-BOLIVIANOS", 8.33f);
        tiposDeCambio.put("EUROS-DOLARES", 1.18f);
    }
    
    public Usuario(int contador,String nombreUsuario, String password, String nombreCompleto, 
                   ArrayList<String> cuentas, ArrayList<String> tipoCuentas,
                   ArrayList<Float> saldos, ArrayList<String> movimientos, ArrayList<String> monedas) {
        this.fila = fila;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
        this.cuentas = cuentas;
        this.tipoCuentas = tipoCuentas;
        this.saldos = saldos;
        this.movimientos = movimientos;
        this.monedas = monedas;
        this.movimientosPorCuenta = new HashMap<>();
        
        // Inicializa la estructura de datos para cada cuenta
        for (String cuenta : cuentas) {
            movimientosPorCuenta.put(cuenta, new ArrayList<>());
        }
        
        // Carga los movimientos existentes desde el archivo
        cargarMovimientos();
    }
    
    public int getFila() {
        return fila;
    }
    
    public String getNombreCompleto() {
        return this.nombreCompleto;
    }
    
    
    public String getCuenta(int indice) {
        return cuentas.get(indice);
    }
    
    public float getSaldo(int indice) {
        return saldos.get(indice);
    }
    
    public String getTipoCuentas(int indice) {
        if(tipoCuentas.get(indice).equals("0")){
            return "AHORROS";
        }else{
            return "CORRIENTE";
        }
    }
    
    public String getMoneda(int indice) {
        if(monedas.get(indice).equals("0")){
            return "BOLIVIANOS";
        } else if (monedas.get(indice).equals("1")){
            return "DOLARES";
        }else{
            return "EUROS";
        }
    }
    
    public void addMoneda(String moneda) {
        this.monedas.add(moneda);
    }
    
    public static float obtenerTipoDeCambio(String origen, String destino) {
        if (origen.equals(destino)) {
            return 1.0f;
        }
        return tiposDeCambio.getOrDefault(origen + "-" + destino, 1.0f);
    }
    
    public void setSaldos(float Saldos, int indice) {
        this.saldos.set(indice, Saldos);
    }
    
    public int getCantidadCuentas(){
        return(this.cuentas.size());
    }
    
    public void addCuenta(String cuenta){
        this.cuentas.add(cuenta);
        this.movimientosPorCuenta.put(cuenta, new ArrayList<>());
    }

    public void addTipo(String tipo){
        this.tipoCuentas.add(tipo);
    }
   
    public void addSaldo(Float saldo){
        this.saldos.add(saldo);
    }
    
    public synchronized void addMovimiento(String tipoOperacion, String beneficiario, float monto, int indice){
        String cuenta = getCuenta(indice);
        String moneda = getMoneda(indice);
        String movimiento = String.format("%s; %s; %s; %.2f %s",getFormattedDateTime(), tipoOperacion, beneficiario, monto, moneda);

        // Verifica si el movimiento ya está registrado en memoria
        if (!movimientosPorCuenta.get(cuenta).contains(movimiento)) {
            movimientosPorCuenta.get(cuenta).add(0, movimiento);
            if (movimientosPorCuenta.get(cuenta).size() > 15) {
                movimientosPorCuenta.get(cuenta).remove(15);
            }
            guardarMovimientoEnArchivo(movimiento, cuenta, moneda);
        }
    }
    
    private void guardarMovimientoEnArchivo(String movimiento, String cuenta, String moneda) {
        String archivoMovimientos = cuenta + moneda + "movimientos.txt";
        try (PrintWriter out = new PrintWriter(new FileWriter(archivoMovimientos, true))) {
            out.println(movimiento);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private String getFormattedDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }


    private void cargarMovimientos() {
        for (String cuenta : cuentas) {
            String moneda = getMoneda(cuentas.indexOf(cuenta));
            String archivoMovimientos = cuenta + moneda + "movimientos.txt";
            ArrayList<String> movimientosCuenta = movimientosPorCuenta.get(cuenta);
            try (Scanner scanner = new Scanner(new FileReader(archivoMovimientos))) {
                while (scanner.hasNextLine()) {
                    movimientosCuenta.add(scanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    
    public String getMovimientos(int indice){
        String cuenta = getCuenta(indice);
        ArrayList<String> movimientosCuenta = movimientosPorCuenta.get(cuenta);
        StringBuilder movimientos = new StringBuilder();
        for (String movimiento : movimientosCuenta) {
            movimientos.append(movimiento).append("\n");
        }
        return movimientos.toString();
    }
    
    public void cambiarContrasenia(String nuevaContraseña) {
        this.password = nuevaContraseña;
        actualizarArchivo();
    }
    
    private void actualizarArchivo() {
        ArrayList<String> archivo = leerArchivo();
        for (int i = 0; i < archivo.size(); i++) {
            String[] datos = archivo.get(i).split(";");
            if (datos[0].equals(this.nombreUsuario)) {
                archivo.set(i, escribirFilaNueva());
                break;
            }
        }
        escribirArchivo(archivo, "usuarios.txt");
    }
    
    private void escribirArchivo(ArrayList<String> archivo, String nombreArchivo) {
        try (PrintWriter fileOut = new PrintWriter(new FileWriter(nombreArchivo, false))) {
            for (String filaLectura : archivo) {
                fileOut.println(filaLectura);
            }
        } catch (IOException ex) {
            System.out.println("Error IOException: " + ex.getMessage());
        }
    }
    
    public boolean anexar(ArrayList<String> archivo, String nombreArchivo) {
        boolean r = false;
        try {
            PrintWriter fileOut;
            fileOut = new PrintWriter(new FileWriter(nombreArchivo, false));
            for (String filaLectura : archivo) {
                fileOut.println(filaLectura);
            }
            fileOut.close();
            r = true;
        } catch (IOException ex) {
            System.out.println("Error IOException" + ex.getMessage());
        }
        return r;
    }
    
    public ArrayList<String> leerArchivo() {
        ArrayList<String> archivo = new ArrayList<>();
        try {
            Scanner lector = new Scanner(new FileReader("usuarios.txt"));
            while (lector.hasNextLine()) {
                archivo.add(lector.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error FileNotFoundException");
        }
        return archivo;
    }
    
    public String escribirFilaNueva() {
        String filaEscrita;
        filaEscrita = this.nombreUsuario + ";" + this.password + ";" + this.nombreCompleto;
        for (int i = 0; i < getCantidadCuentas(); i++) {
            filaEscrita += ";" + cuentas.get(i) + ";" + tipoCuentas.get(i) + ";" + saldos.get(i) + ";" + monedas.get(i);
        }
        return filaEscrita;
    }
    
    public ArrayList<String> sobrescribirArchivo(ArrayList<String> archivo, int fila, String mensaje) {
        archivo.set(fila, mensaje);
        return archivo;
    }
    
    
    public float convertirABolivianos(float saldo, String moneda) {
        float tasaCambio = 1.0f; // Default, if it's already in bolivianos
        if (moneda.equals("DOLARES")) {
            tasaCambio = Usuario.obtenerTipoDeCambio("DOLARES", "BOLIVIANOS");
        } else if (moneda.equals("EUROS")) {
            tasaCambio = Usuario.obtenerTipoDeCambio("EUROS", "BOLIVIANOS");
        }
        return saldo * tasaCambio;
    }
}
