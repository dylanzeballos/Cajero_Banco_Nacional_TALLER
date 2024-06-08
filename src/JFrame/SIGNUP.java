/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrame;

import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class SIGNUP extends javax.swing.JFrame {

    /**
     * Creates new form SIGNUP
     */
    public SIGNUP() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    /**
    * Anexa una cadena de texto al archivo "usuarios.txt".
    * 
    * Este método abre el archivo "usuarios.txt" en modo append (anexar),
    * escribe una nueva línea con la cadena de texto proporcionada y luego cierra el archivo.
    * 
    * @param fila La cadena de texto que se desea anexar al archivo. Se espera que esta cadena
    *             contenga los datos de un usuario en un formato específico.
    * @return     Un valor booleano que indica si la operación fue exitosa. Devuelve `true`
    *             si la cadena se anexa correctamente al archivo, y `false` si ocurre un error.
    */
    public boolean anexar (String fila){
        boolean r= false;
        
        try {
            PrintWriter fileOut;
            fileOut= new PrintWriter(new FileWriter("usuarios.txt", true));
            fileOut.println(fila);
            fileOut.close();
            r=true;   
        } catch (Exception e) {
            System.out.println("Error");
        }
        return r;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        datospersonales = new javax.swing.JLabel();
        fechanacimiento = new javax.swing.JLabel();
        dia = new javax.swing.JTextField();
        mes = new javax.swing.JTextField();
        anio = new javax.swing.JTextField();
        nombretitular = new javax.swing.JLabel();
        nomb = new javax.swing.JTextField();
        lblNombreA = new javax.swing.JLabel();
        carnetidentidad = new javax.swing.JLabel();
        cariden = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        telef = new javax.swing.JTextField();
        creacioncuenta = new javax.swing.JLabel();
        tipocaja = new javax.swing.JLabel();
        caja = new javax.swing.JComboBox<>();
        monedas = new javax.swing.JLabel();
        moneda = new javax.swing.JComboBox<>();
        abonoinicial = new javax.swing.JLabel();
        abono = new javax.swing.JFormattedTextField();
        lblAbonoI = new javax.swing.JLabel();
        datosacceso = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        user = new javax.swing.JFormattedTextField();
        contraseña = new javax.swing.JLabel();
        pin = new javax.swing.JPasswordField();
        lblMensaje = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        Registrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLbanco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        datospersonales.setText("Datos Personales");
        jPanel1.add(datospersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 400, -1));

        fechanacimiento.setBackground(new java.awt.Color(51, 51, 51));
        fechanacimiento.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        fechanacimiento.setForeground(new java.awt.Color(0, 51, 51));
        fechanacimiento.setText("FECHA DE NACIMIENTO:");
        jPanel1.add(fechanacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, -1));

        dia.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 45, 30));

        mes.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, 45, 30));

        anio.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 290, 70, 30));

        nombretitular.setBackground(new java.awt.Color(51, 51, 51));
        nombretitular.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        nombretitular.setForeground(new java.awt.Color(0, 51, 51));
        nombretitular.setText("NOMBRE DEL TITULAR:");
        jPanel1.add(nombretitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 180, 40));

        nomb.setBackground(new java.awt.Color(255, 255, 255));
        nomb.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(nomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 230, 35));
        jPanel1.add(lblNombreA, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 190, 20));

        carnetidentidad.setBackground(new java.awt.Color(51, 51, 51));
        carnetidentidad.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        carnetidentidad.setForeground(new java.awt.Color(0, 51, 51));
        carnetidentidad.setText("CARNET DE IDENTIDAD:");
        jPanel1.add(carnetidentidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 180, 40));

        cariden.setBackground(new java.awt.Color(255, 255, 255));
        cariden.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(cariden, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 230, 35));
        jPanel1.add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 190, 20));

        telefono.setBackground(new java.awt.Color(51, 51, 51));
        telefono.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        telefono.setForeground(new java.awt.Color(0, 51, 51));
        telefono.setText("TELEFONO:");
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 80, 40));

        telef.setBackground(new java.awt.Color(255, 255, 255));
        telef.setForeground(new java.awt.Color(0, 51, 51));
        telef.setToolTipText("");
        telef.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(telef, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 250, 35));

        creacioncuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        creacioncuenta.setText("Informacion Cuenta");
        jPanel1.add(creacioncuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 400, -1));

        tipocaja.setBackground(new java.awt.Color(51, 51, 51));
        tipocaja.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        tipocaja.setForeground(new java.awt.Color(0, 51, 51));
        tipocaja.setText("TIPO:");
        jPanel1.add(tipocaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, -1, -1));

        caja.setBackground(new java.awt.Color(255, 255, 255));
        caja.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        caja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AHORROS ", "CORRIENTE" }));
        caja.setName("BOLIVIANOS\n"); // NOI18N
        jPanel1.add(caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 210, 30));

        monedas.setBackground(new java.awt.Color(51, 51, 51));
        monedas.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        monedas.setForeground(new java.awt.Color(0, 51, 51));
        monedas.setText("MONEDA:");
        jPanel1.add(monedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, -1, -1));

        moneda.setBackground(new java.awt.Color(255, 255, 255));
        moneda.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        moneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BOLIVIANOS", "DOLARES", "EUROS" }));
        moneda.setName("BOLIVIANOS\n"); // NOI18N
        jPanel1.add(moneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 210, 30));

        abonoinicial.setBackground(new java.awt.Color(51, 51, 51));
        abonoinicial.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        abonoinicial.setForeground(new java.awt.Color(0, 51, 51));
        abonoinicial.setText("ABONO INICIAL:");
        jPanel1.add(abonoinicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 120, 40));

        abono.setBackground(new java.awt.Color(255, 255, 255));
        abono.setForeground(new java.awt.Color(0, 51, 51));
        abono.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        abono.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                abonoCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jPanel1.add(abono, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 180, 35));
        jPanel1.add(lblAbonoI, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 190, 20));

        datosacceso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        datosacceso.setText("Datos de acceso");
        jPanel1.add(datosacceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, 400, -1));

        usuario.setBackground(new java.awt.Color(51, 51, 51));
        usuario.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        usuario.setForeground(new java.awt.Color(0, 51, 51));
        usuario.setText("USUARIO");
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, 90, 40));

        user.setBackground(new java.awt.Color(255, 255, 255));
        user.setForeground(new java.awt.Color(0, 51, 51));
        user.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        user.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                userCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, 300, 35));

        contraseña.setBackground(new java.awt.Color(51, 51, 51));
        contraseña.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        contraseña.setForeground(new java.awt.Color(0, 51, 51));
        contraseña.setText("CONTRASEÑA");
        jPanel1.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 110, 40));

        pin.setBackground(new java.awt.Color(255, 255, 255));
        pin.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 620, 300, 35));
        jPanel1.add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 660, 190, 20));

        Cancelar.setBackground(new java.awt.Color(153, 0, 0));
        Cancelar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(153, 153, 153));
        Cancelar.setText("CANCELAR");
        Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelarMouseClicked(evt);
            }
        });
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 700, 230, 50));

        Registrar.setBackground(new java.awt.Color(0, 51, 153));
        Registrar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        Registrar.setText("CONFIRMAR");
        Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarMouseClicked(evt);
            }
        });
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 700, 230, 50));

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbanco.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLbanco.setForeground(new java.awt.Color(204, 204, 204));
        jLbanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lOGOA.png"))); // NOI18N
        jLbanco.setText("BANCO NACIONAL");
        jPanel4.add(jLbanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 410, 190));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 180));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_userCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_userCaretPositionChanged

    private void CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseClicked
        
    }//GEN-LAST:event_CancelarMouseClicked

    private void RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarMouseClicked
       // TODO add your handling code here:
    }//GEN-LAST:event_RegistrarMouseClicked

    private void abonoCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_abonoCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_abonoCaretPositionChanged

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // Método para manejar el evento del botón Cancelar
        // Cierra el formulario de registro
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        // Verifica si todos los campos están llenos y son válidos

        // Resetear etiquetas de error
        boolean validarAbono = false;
        boolean validarCedula = false;
        boolean validarNombre = false;
        boolean validarUsuarioContr = false;
        
        // Validar que el campo de carnet de identidad no esté vacío
        if(cariden.getText().isEmpty()){
            lblCedula.setText("*Campo obligatorio");
        } else{
            for (int i = 0; i < cariden.getText().length(); i++) {
                if (Character.isAlphabetic(cariden.getText().charAt(i))) {
                    validarCedula = false;
                    lblCedula.setText("*Dato no válido");
                } else {
                    validarCedula = true;
                    lblCedula.setText("");
                }
            }
        }
        
        // Validar que el campo de abono inicial no esté vacío y sea un número positivo
        if (abono.getText().isEmpty()) {
            lblAbonoI.setText("*Campo obligatorio");
        } else {
            try {
                float numeroIngreso = Float.parseFloat(abono.getText());
                if (numeroIngreso < 0) {
                    lblAbonoI.setText("*Digite un número positivo");
                } else {
                    validarAbono = true;
                    lblAbonoI.setText("");
                }
            } catch (Exception e) {
                lblAbonoI.setText("*Dato no válido");
            }
        }
        // Validar que el campo de nombre no esté vacío
        if (nomb.getText().isEmpty()) {
            lblNombreA.setText("*Campo obligatorio");
        } else {
            for (int i = 0; i < nomb.getText().length(); i++) {
                if (Character.isDigit(nomb.getText().charAt(i))) {
                    validarNombre = false;
                    lblNombreA.setText("*Dato no válido");
                } else {
                    validarNombre = true;
                    lblNombreA.setText("");
                }
            }
        }
        
        // Validar que el campo de usuario no esté vacío
        // Validar que el campo de pin no esté vacío
        if (user.getText().isEmpty() || pin.getText().isEmpty()) {
            lblMensaje.setText("*Campos obligatorios");
        } else {
            if (user.getText().length() < 8
                    || pin.getText().length() < 8) {
                lblMensaje.setText("*Digite al menos 8 caracteres");
            } else {
                validarUsuarioContr = true;
                lblMensaje.setText("");
            }

        }
        //Asigna un numero de cuenta aleatorio despues de validar los campos anteriores 
        if (validarAbono && validarCedula && validarNombre && validarUsuarioContr) {
            String numCuenta = "";
            for(int i=0;i<10;i++){
                numCuenta=numCuenta+ String.valueOf((int) Math.round(Math.random() * 8 + 1));
            }
            //Selecciona el tipo de cuenta de el combobox
            String tipoCuenta;
            if (caja.getSelectedIndex() == 0) {
                tipoCuenta = "0";
            } else {
                tipoCuenta = "1";
            }
            //Selecciona la moneda de el combobox
            String monedaSeleccionada;
            if(moneda.getSelectedIndex()== 0){
                monedaSeleccionada = "0";
            } else if(moneda.getSelectedIndex()== 1){
                monedaSeleccionada = "1";
            } else {
                monedaSeleccionada = "2";
            }
            // Crear la cadena con los datos del nuevo usuario 
            String fila = user.getText() + ";" + pin.getText() + ";"
                    + nomb.getText() + ";" + numCuenta+";" + tipoCuenta +";" 
                    + abono.getText()+ ";" + monedaSeleccionada;
            //Despues de agregar el usuario al archivo regresa a la pantalla de login
            if (anexar(fila)) {
                JOptionPane.showMessageDialog(null, "Se ha agregado un usuario\n"
                        + "Inicie sesión por favor",
                        "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                Login pantallaLogin = new Login();
                pantallaLogin.setVisible(true);
                dispose();

            } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error",
                            "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
            
        }

       
    }//GEN-LAST:event_RegistrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SIGNUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SIGNUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SIGNUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SIGNUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SIGNUP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Registrar;
    private javax.swing.JFormattedTextField abono;
    private javax.swing.JLabel abonoinicial;
    private javax.swing.JTextField anio;
    private javax.swing.JComboBox<String> caja;
    private javax.swing.JTextField cariden;
    private javax.swing.JLabel carnetidentidad;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel creacioncuenta;
    private javax.swing.JLabel datosacceso;
    private javax.swing.JLabel datospersonales;
    private javax.swing.JTextField dia;
    private javax.swing.JLabel fechanacimiento;
    private javax.swing.JLabel jLbanco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblAbonoI;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblNombreA;
    private javax.swing.JTextField mes;
    private javax.swing.JComboBox<String> moneda;
    private javax.swing.JLabel monedas;
    private javax.swing.JTextField nomb;
    private javax.swing.JLabel nombretitular;
    private javax.swing.JPasswordField pin;
    private javax.swing.JTextField telef;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel tipocaja;
    private javax.swing.JFormattedTextField user;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
