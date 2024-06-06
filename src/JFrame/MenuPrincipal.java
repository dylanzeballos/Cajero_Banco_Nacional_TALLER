package JFrame;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
        
public class MenuPrincipal extends javax.swing.JFrame {
    
    public Usuario cliente;

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal(Usuario cliente) {
        initComponents();
        DecimalFormat frmt = new DecimalFormat();
        frmt.setMaximumFractionDigits(2);
        this.cliente=cliente;
        this.setLocationRelativeTo(null);
        
        lblBienvenido.setText("Bienvenido,");
        txtNombreCliente.setText(cliente.getNombreCompleto());
        
        LocalDate fechaActualIngreso = LocalDate.now();
        LocalTime horaActual = LocalTime.now();
        String ingresoFechaHora = "Ultimo ingreso: "+String.valueOf(fechaActualIngreso)+
                                  " a las "+String.valueOf(horaActual).substring(0, 8);
        txtHoraFecha.setText(String.valueOf(ingresoFechaHora));
        switch(cliente.getCantidadCuentas()){
            case 1:
                txtTipoCuenta4.setVisible(false);txtmoneda4.setVisible(false); txtSaldoCuenta4.setVisible(false); txtNumeroCuenta4.setVisible(false); imgFlechaAccesoCuenta4.setVisible(false);
                txtTipoCuenta3.setVisible(false);txtmoneda3.setVisible(false); txtSaldoCuenta3.setVisible(false); txtNumeroCuenta3.setVisible(false); imgFlechaAccesoCuenta3.setVisible(false);
                txtTipoCuenta2.setVisible(false); txtmoneda2.setVisible(false); txtSaldoCuenta2.setVisible(false); txtNumeroCuenta2.setVisible(false); imgFlechaAccesoCuenta2.setVisible(false);
                
                txtNumeroCuenta1.setText("N° "+String.valueOf(cliente.getCuenta(0)));
                txtSaldoCuenta1.setText(String.valueOf(frmt.format(cliente.getSaldo(0))));
                txtTipoCuenta1.setText(cliente.getTipoCuentas(0));
                txtmoneda1.setText(cliente.getMoneda(0));
                break;
            case 2:
                txtTipoCuenta4.setVisible(false); txtmoneda4.setVisible(false);txtSaldoCuenta4.setVisible(false); txtNumeroCuenta4.setVisible(false); imgFlechaAccesoCuenta4.setVisible(false);
                txtTipoCuenta3.setVisible(false); txtmoneda3.setVisible(false);txtSaldoCuenta3.setVisible(false); txtNumeroCuenta3.setVisible(false); imgFlechaAccesoCuenta3.setVisible(false);
                
                txtNumeroCuenta1.setText("N° "+String.valueOf(cliente.getCuenta(0)));
                txtSaldoCuenta1.setText(String.valueOf(frmt.format(cliente.getSaldo(0))));
                txtTipoCuenta1.setText(cliente.getTipoCuentas(0));
                txtmoneda1.setText(cliente.getMoneda(0));
                
                txtNumeroCuenta2.setText("N° "+String.valueOf(cliente.getCuenta(1)));
                txtSaldoCuenta2.setText(String.valueOf(frmt.format(cliente.getSaldo(1))));
                txtTipoCuenta2.setText(cliente.getTipoCuentas(1));
                txtmoneda2.setText(cliente.getMoneda(1));
                break;
            case 3:
                txtTipoCuenta4.setVisible(false);txtmoneda4.setVisible(false); txtSaldoCuenta4.setVisible(false); txtNumeroCuenta4.setVisible(false); imgFlechaAccesoCuenta4.setVisible(false);
                
                txtNumeroCuenta1.setText("N° "+String.valueOf(cliente.getCuenta(0)));
                txtSaldoCuenta1.setText(String.valueOf(frmt.format(cliente.getSaldo(0))));
                txtTipoCuenta1.setText(cliente.getTipoCuentas(0));
                txtmoneda1.setText(cliente.getMoneda(0));
                
                txtNumeroCuenta2.setText("N° "+String.valueOf(cliente.getCuenta(1)));
                txtSaldoCuenta2.setText(String.valueOf(frmt.format(cliente.getSaldo(1))));
                txtTipoCuenta2.setText(cliente.getTipoCuentas(1));
                txtmoneda2.setText(cliente.getMoneda(1));
                
                txtNumeroCuenta3.setText("N° "+String.valueOf(cliente.getCuenta(2)));
                txtSaldoCuenta3.setText(String.valueOf(frmt.format(cliente.getSaldo(2))));
                txtTipoCuenta3.setText(cliente.getTipoCuentas(2));
                txtmoneda3.setText(cliente.getMoneda(2));
                break;
            default:
                txtNumeroCuenta1.setText("N° "+String.valueOf(cliente.getCuenta(0)));
                txtSaldoCuenta1.setText(String.valueOf(frmt.format(cliente.getSaldo(0))));
                txtTipoCuenta1.setText(cliente.getTipoCuentas(0));
                txtmoneda1.setText(cliente.getMoneda(0));
                
                txtNumeroCuenta2.setText("N° "+String.valueOf(cliente.getCuenta(1)));
                txtSaldoCuenta2.setText(String.valueOf(frmt.format(cliente.getSaldo(1))));
                txtTipoCuenta2.setText(cliente.getTipoCuentas(1));
                txtmoneda2.setText(cliente.getMoneda(1));
                
                txtNumeroCuenta3.setText("N° "+String.valueOf(cliente.getCuenta(2)));
                txtSaldoCuenta3.setText(String.valueOf(frmt.format(cliente.getSaldo(2))));
                txtTipoCuenta3.setText(cliente.getTipoCuentas(2));
                txtmoneda3.setText(cliente.getMoneda(2));
                
                txtNumeroCuenta4.setText("N° "+String.valueOf(cliente.getCuenta(3)));
                txtSaldoCuenta4.setText(String.valueOf(frmt.format(cliente.getSaldo(3))));
                txtTipoCuenta4.setText(cliente.getTipoCuentas(3));
                txtmoneda4.setText(cliente.getMoneda(3));
                
                btnNuevaCuenta.setVisible(false);
        }
        float saldoTotalBolivianos = 0.0f;
        for (int i = 0; i < cliente.getCantidadCuentas(); i++) {
            float saldo = cliente.getSaldo(i);
            String moneda = cliente.getMoneda(i);
            saldoTotalBolivianos += cliente.convertirABolivianos(saldo, moneda);
        }
        txtsaldototal.setText(frmt.format(saldoTotalBolivianos)+ "      BS.");
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
        jPaneltitulo = new javax.swing.JPanel();
        jLbanco = new javax.swing.JLabel();
        jLogMenu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblBienvenido = new javax.swing.JLabel();
        jiconuser = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JLabel();
        txtHoraFecha = new javax.swing.JLabel();
        jPanelencabezadooperaciones = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLogosaldo = new javax.swing.JLabel();
        txtsaldototal = new javax.swing.JLabel();
        jPaneloperaciones = new javax.swing.JPanel();
        jloperacio = new javax.swing.JLabel();
        btnretiro = new javax.swing.JPanel();
        jlblogoRetirar = new javax.swing.JLabel();
        jlblretirtext = new javax.swing.JLabel();
        btndeposito = new javax.swing.JPanel();
        jlblogoRetirar4 = new javax.swing.JLabel();
        jlblretirtext4 = new javax.swing.JLabel();
        btntranferenciadirecta = new javax.swing.JPanel();
        jlblogoRetirar1 = new javax.swing.JLabel();
        jlblretirtext1 = new javax.swing.JLabel();
        btntransferenciainter = new javax.swing.JPanel();
        jlblogoRetirar3 = new javax.swing.JLabel();
        jlblretirtext3 = new javax.swing.JLabel();
        jlblretirtext6 = new javax.swing.JLabel();
        btntransferenciacuenta = new javax.swing.JPanel();
        jlblretirtext2 = new javax.swing.JLabel();
        jlblretirtext7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btncambiarcontra = new javax.swing.JPanel();
        jlblretirtext5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMisCuentas = new javax.swing.JLabel();
        btnNuevaCuenta = new javax.swing.JPanel();
        txtSimboloNuevaCuenta = new javax.swing.JLabel();
        btnInfoCuenta1 = new javax.swing.JPanel();
        txtTipoCuenta1 = new javax.swing.JLabel();
        txtNumeroCuenta1 = new javax.swing.JLabel();
        txtmoneda1 = new javax.swing.JLabel();
        txtSaldoCuenta1 = new javax.swing.JLabel();
        imgFlechaAccesoCuenta1 = new javax.swing.JLabel();
        btnInfoCuenta2 = new javax.swing.JPanel();
        txtTipoCuenta2 = new javax.swing.JLabel();
        txtNumeroCuenta2 = new javax.swing.JLabel();
        txtmoneda2 = new javax.swing.JLabel();
        txtSaldoCuenta2 = new javax.swing.JLabel();
        imgFlechaAccesoCuenta2 = new javax.swing.JLabel();
        btnInfoCuenta3 = new javax.swing.JPanel();
        txtTipoCuenta3 = new javax.swing.JLabel();
        txtNumeroCuenta3 = new javax.swing.JLabel();
        txtmoneda3 = new javax.swing.JLabel();
        txtSaldoCuenta3 = new javax.swing.JLabel();
        imgFlechaAccesoCuenta3 = new javax.swing.JLabel();
        btnInfoCuenta4 = new javax.swing.JPanel();
        txtTipoCuenta4 = new javax.swing.JLabel();
        txtNumeroCuenta4 = new javax.swing.JLabel();
        txtmoneda4 = new javax.swing.JLabel();
        txtSaldoCuenta4 = new javax.swing.JLabel();
        imgFlechaAccesoCuenta4 = new javax.swing.JLabel();
        jButSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1000, 800));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPaneltitulo.setBackground(new java.awt.Color(0, 51, 153));
        jPaneltitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbanco.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLbanco.setForeground(new java.awt.Color(204, 204, 204));
        jLbanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lOGOA.png"))); // NOI18N
        jLbanco.setText("BANCO NACIONAL");
        jPaneltitulo.add(jLbanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 380, 160));

        jLogMenu.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLogMenu.setForeground(new java.awt.Color(0, 51, 51));
        jLogMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-6-53.png"))); // NOI18N
        jPaneltitulo.add(jLogMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, 50, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu principal");
        jPaneltitulo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, 120, 40));

        jPanel1.add(jPaneltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 170));

        lblBienvenido.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(lblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 290, 30));

        jiconuser.setBackground(new java.awt.Color(0, 20, 117));
        jiconuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/perfilorig.png"))); // NOI18N
        jPanel1.add(jiconuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 70, 100));

        txtNombreCliente.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        txtNombreCliente.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 330, 30));
        jPanel1.add(txtHoraFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 290, 30));

        jPanelencabezadooperaciones.setBackground(new java.awt.Color(204, 204, 255));
        jPanelencabezadooperaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLogosaldo.setBackground(new java.awt.Color(255, 255, 255));
        jLogosaldo.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLogosaldo.setForeground(new java.awt.Color(0, 51, 51));
        jLogosaldo.setText("TOTAL");
        jPanel5.add(jLogosaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 50));

        txtsaldototal.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtsaldototal.setForeground(new java.awt.Color(0, 51, 51));
        jPanel5.add(txtsaldototal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 150, 30));

        jPanelencabezadooperaciones.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 270, 50));

        jPanel1.add(jPanelencabezadooperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 330, 110));

        jPaneloperaciones.setBackground(new java.awt.Color(204, 204, 255));
        jPaneloperaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jloperacio.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jloperacio.setForeground(new java.awt.Color(0, 51, 51));
        jloperacio.setText("Seleccione la operacion que desea realizar");
        jPaneloperaciones.add(jloperacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 380, 50));

        btnretiro.setBackground(new java.awt.Color(0, 51, 153));
        btnretiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnretiroMousePressed(evt);
            }
        });
        btnretiro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblogoRetirar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-cash-withdrawal-64.png"))); // NOI18N
        btnretiro.add(jlblogoRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 80));

        jlblretirtext.setForeground(new java.awt.Color(255, 255, 255));
        jlblretirtext.setText("Retiro");
        btnretiro.add(jlblretirtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 40, 20));

        jPaneloperaciones.add(btnretiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, 120));

        btndeposito.setBackground(new java.awt.Color(0, 51, 153));
        btndeposito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btndepositoMousePressed(evt);
            }
        });
        btndeposito.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblogoRetirar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-initiate-money-transfer-80.png"))); // NOI18N
        btndeposito.add(jlblogoRetirar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 70));

        jlblretirtext4.setForeground(new java.awt.Color(255, 255, 255));
        jlblretirtext4.setText("Deposito");
        btndeposito.add(jlblretirtext4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 50, 30));

        jPaneloperaciones.add(btndeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 120, 120));

        btntranferenciadirecta.setBackground(new java.awt.Color(0, 51, 153));
        btntranferenciadirecta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btntranferenciadirectaMousePressed(evt);
            }
        });
        btntranferenciadirecta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblogoRetirar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-transfer-money-64.png"))); // NOI18N
        btntranferenciadirecta.add(jlblogoRetirar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 60, 70));

        jlblretirtext1.setForeground(new java.awt.Color(255, 255, 255));
        jlblretirtext1.setText("Transferencia");
        btntranferenciadirecta.add(jlblretirtext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 80, 40));

        jPaneloperaciones.add(btntranferenciadirecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 120, 120));

        btntransferenciainter.setBackground(new java.awt.Color(0, 51, 153));
        btntransferenciainter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btntransferenciainterMousePressed(evt);
            }
        });
        btntransferenciainter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblogoRetirar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-bank-64.png"))); // NOI18N
        btntransferenciainter.add(jlblogoRetirar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 70));

        jlblretirtext3.setForeground(new java.awt.Color(255, 255, 255));
        jlblretirtext3.setText("Interbancaria");
        btntransferenciainter.add(jlblretirtext3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        jlblretirtext6.setForeground(new java.awt.Color(255, 255, 255));
        jlblretirtext6.setText("Transferencia ");
        btntransferenciainter.add(jlblretirtext6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 20));

        jPaneloperaciones.add(btntransferenciainter, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 120, 120));

        btntransferenciacuenta.setBackground(new java.awt.Color(0, 51, 153));
        btntransferenciacuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btntransferenciacuentaMousePressed(evt);
            }
        });
        btntransferenciacuenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblretirtext2.setForeground(new java.awt.Color(255, 255, 255));
        jlblretirtext2.setText("Cuenta a Cuenta");
        btntransferenciacuenta.add(jlblretirtext2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 90, 20));

        jlblretirtext7.setForeground(new java.awt.Color(255, 255, 255));
        jlblretirtext7.setText("Transferencia ");
        btntransferenciacuenta.add(jlblretirtext7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, 20));

        jLabel2.setBackground(new java.awt.Color(0, 51, 153));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-money-transfer-64.png"))); // NOI18N
        jLabel2.setLabelFor(btntransferenciacuenta);
        btntransferenciacuenta.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, 60));

        jPaneloperaciones.add(btntransferenciacuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 120, 120));

        btncambiarcontra.setBackground(new java.awt.Color(0, 51, 153));
        btncambiarcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btncambiarcontraMousePressed(evt);
            }
        });
        btncambiarcontra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblretirtext5.setForeground(new java.awt.Color(255, 255, 255));
        jlblretirtext5.setText("Cambiar contraseña");
        btncambiarcontra.add(jlblretirtext5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-password-reset-64.png"))); // NOI18N
        btncambiarcontra.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 70, 60));

        jPaneloperaciones.add(btncambiarcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 120, 120));

        jPanel1.add(jPaneloperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 490, 360));

        txtMisCuentas.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        txtMisCuentas.setForeground(new java.awt.Color(0, 51, 51));
        txtMisCuentas.setText("MIS CUENTAS");
        jPanel1.add(txtMisCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 190, 40));

        btnNuevaCuenta.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevaCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNuevaCuentaMousePressed(evt);
            }
        });
        btnNuevaCuenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSimboloNuevaCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-plus-24.png"))); // NOI18N
        txtSimboloNuevaCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtSimboloNuevaCuentaMousePressed(evt);
            }
        });
        btnNuevaCuenta.add(txtSimboloNuevaCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, -1));

        jPanel1.add(btnNuevaCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 40, 30));

        btnInfoCuenta1.setBackground(new java.awt.Color(255, 255, 255));
        btnInfoCuenta1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(222, 222, 222)));
        btnInfoCuenta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnInfoCuenta1MousePressed(evt);
            }
        });
        btnInfoCuenta1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTipoCuenta1.setBackground(new java.awt.Color(255, 255, 255));
        btnInfoCuenta1.add(txtTipoCuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 80, 20));

        txtNumeroCuenta1.setBackground(new java.awt.Color(255, 255, 255));
        btnInfoCuenta1.add(txtNumeroCuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 15, 110, 20));

        txtmoneda1.setBackground(new java.awt.Color(255, 255, 255));
        btnInfoCuenta1.add(txtmoneda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 15, 100, 20));

        txtSaldoCuenta1.setBackground(new java.awt.Color(255, 255, 255));
        btnInfoCuenta1.add(txtSaldoCuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 15, 70, 20));

        imgFlechaAccesoCuenta1.setBackground(new java.awt.Color(255, 255, 255));
        imgFlechaAccesoCuenta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconoFlechaDerechaContinuar.png"))); // NOI18N
        btnInfoCuenta1.add(imgFlechaAccesoCuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 15, 20, 30));

        jPanel1.add(btnInfoCuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 410, 50));

        btnInfoCuenta2.setBackground(new java.awt.Color(255, 255, 255));
        btnInfoCuenta2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(222, 222, 222)));
        btnInfoCuenta2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTipoCuenta2.setBackground(new java.awt.Color(255, 255, 255));
        btnInfoCuenta2.add(txtTipoCuenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 20));

        txtNumeroCuenta2.setBackground(new java.awt.Color(255, 255, 255));
        btnInfoCuenta2.add(txtNumeroCuenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 20, 110, 20));

        txtmoneda2.setBackground(new java.awt.Color(255, 255, 255));
        btnInfoCuenta2.add(txtmoneda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 20, 100, 20));

        txtSaldoCuenta2.setBackground(new java.awt.Color(255, 255, 255));
        btnInfoCuenta2.add(txtSaldoCuenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 70, 20));

        imgFlechaAccesoCuenta2.setBackground(new java.awt.Color(255, 255, 255));
        imgFlechaAccesoCuenta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconoFlechaDerechaContinuar.png"))); // NOI18N
        imgFlechaAccesoCuenta2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgFlechaAccesoCuenta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imgFlechaAccesoCuenta2MousePressed(evt);
            }
        });
        btnInfoCuenta2.add(imgFlechaAccesoCuenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 20, 30));

        jPanel1.add(btnInfoCuenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 410, 60));

        btnInfoCuenta3.setBackground(new java.awt.Color(255, 255, 255));
        btnInfoCuenta3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(222, 222, 222)));
        btnInfoCuenta3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInfoCuenta3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTipoCuenta3.setBackground(new java.awt.Color(255, 255, 255));
        btnInfoCuenta3.add(txtTipoCuenta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 20));

        txtNumeroCuenta3.setBackground(new java.awt.Color(255, 255, 255));
        btnInfoCuenta3.add(txtNumeroCuenta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 20, 110, 20));

        txtmoneda3.setBackground(new java.awt.Color(255, 255, 255));
        btnInfoCuenta3.add(txtmoneda3, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 20, 100, 20));

        txtSaldoCuenta3.setBackground(new java.awt.Color(255, 255, 255));
        btnInfoCuenta3.add(txtSaldoCuenta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 70, 20));

        imgFlechaAccesoCuenta3.setBackground(new java.awt.Color(255, 255, 255));
        imgFlechaAccesoCuenta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconoFlechaDerechaContinuar.png"))); // NOI18N
        imgFlechaAccesoCuenta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imgFlechaAccesoCuenta3MousePressed(evt);
            }
        });
        btnInfoCuenta3.add(imgFlechaAccesoCuenta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 15, 20, 30));

        jPanel1.add(btnInfoCuenta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 410, 60));

        btnInfoCuenta4.setBackground(new java.awt.Color(255, 255, 255));
        btnInfoCuenta4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(222, 222, 222)));
        btnInfoCuenta4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTipoCuenta4.setBackground(new java.awt.Color(255, 255, 255));
        btnInfoCuenta4.add(txtTipoCuenta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 20));

        txtNumeroCuenta4.setBackground(new java.awt.Color(255, 255, 255));
        btnInfoCuenta4.add(txtNumeroCuenta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 20, 110, 20));

        txtmoneda4.setBackground(new java.awt.Color(255, 255, 255));
        btnInfoCuenta4.add(txtmoneda4, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 20, 100, 20));

        txtSaldoCuenta4.setBackground(new java.awt.Color(255, 255, 255));
        btnInfoCuenta4.add(txtSaldoCuenta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 70, 20));

        imgFlechaAccesoCuenta4.setBackground(new java.awt.Color(255, 255, 255));
        imgFlechaAccesoCuenta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconoFlechaDerechaContinuar.png"))); // NOI18N
        imgFlechaAccesoCuenta4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgFlechaAccesoCuenta4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imgFlechaAccesoCuenta4MousePressed(evt);
            }
        });
        btnInfoCuenta4.add(imgFlechaAccesoCuenta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 20, 30));

        jPanel1.add(btnInfoCuenta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 410, 60));

        jButSalir.setBackground(new java.awt.Color(204, 0, 0));
        jButSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButSalir.setText("Salir");
        jButSalir.setBorder(null);
        jButSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jButSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 700, 270, 60));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 353, 280, 10));

        jLbackground.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

    private void jButSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButSalirActionPerformed

    private void btnInfoCuenta1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoCuenta1MousePressed
        Movimientos pantallaCuenta1 = new Movimientos(cliente,0);
        pantallaCuenta1.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnInfoCuenta1MousePressed

    private void imgFlechaAccesoCuenta2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgFlechaAccesoCuenta2MousePressed
        Movimientos pantallaCuenta2=new Movimientos(cliente, 1);
        pantallaCuenta2.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_imgFlechaAccesoCuenta2MousePressed

    private void imgFlechaAccesoCuenta3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgFlechaAccesoCuenta3MousePressed
        Movimientos pantallaCuenta3=new Movimientos(cliente, 2);
        pantallaCuenta3.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_imgFlechaAccesoCuenta3MousePressed

    private void imgFlechaAccesoCuenta4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgFlechaAccesoCuenta4MousePressed
        Movimientos pantallaCuenta4=new Movimientos(cliente, 3);
        pantallaCuenta4.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_imgFlechaAccesoCuenta4MousePressed

    private void btncambiarcontraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncambiarcontraMousePressed
        ChangePIN cambiocontra = new ChangePIN(this.cliente);
        cambiocontra.setVisible(true);
        dispose();
    }//GEN-LAST:event_btncambiarcontraMousePressed

    private void btndepositoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndepositoMousePressed
        Depositos depositos = new Depositos(this.cliente);
        depositos.setVisible(true);
        dispose();
    }//GEN-LAST:event_btndepositoMousePressed

    private void txtSimboloNuevaCuentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSimboloNuevaCuentaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSimboloNuevaCuentaMousePressed

    private void btnNuevaCuentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaCuentaMousePressed
        NuevaCuenta addAccount = new NuevaCuenta(cliente);
        addAccount.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNuevaCuentaMousePressed

    private void btntransferenciacuentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntransferenciacuentaMousePressed
        TransferenciasCuentaCuenta pantallaCuentaCuenta = new TransferenciasCuentaCuenta(this.cliente);
        pantallaCuentaCuenta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btntransferenciacuentaMousePressed

    private void btntransferenciainterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntransferenciainterMousePressed
        TransferenciasInterbancarias transinter = new TransferenciasInterbancarias(this.cliente);
        transinter.setVisible(true);
        dispose();
    }//GEN-LAST:event_btntransferenciainterMousePressed

    private void btntranferenciadirectaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntranferenciadirectaMousePressed
        TransferenciasDirectas transdir = new TransferenciasDirectas(this.cliente);
        transdir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btntranferenciadirectaMousePressed

    private void btnretiroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnretiroMousePressed
        Retiro retiro = new Retiro(this.cliente);
        retiro.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnretiroMousePressed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnInfoCuenta1;
    private javax.swing.JPanel btnInfoCuenta2;
    private javax.swing.JPanel btnInfoCuenta3;
    private javax.swing.JPanel btnInfoCuenta4;
    private javax.swing.JPanel btnNuevaCuenta;
    private javax.swing.JPanel btncambiarcontra;
    private javax.swing.JPanel btndeposito;
    private javax.swing.JPanel btnretiro;
    private javax.swing.JPanel btntranferenciadirecta;
    private javax.swing.JPanel btntransferenciacuenta;
    private javax.swing.JPanel btntransferenciainter;
    private javax.swing.JLabel imgFlechaAccesoCuenta1;
    private javax.swing.JLabel imgFlechaAccesoCuenta2;
    private javax.swing.JLabel imgFlechaAccesoCuenta3;
    private javax.swing.JLabel imgFlechaAccesoCuenta4;
    private javax.swing.JButton jButSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLbackground;
    private javax.swing.JLabel jLbanco;
    private javax.swing.JLabel jLogMenu;
    private javax.swing.JLabel jLogosaldo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelencabezadooperaciones;
    private javax.swing.JPanel jPaneloperaciones;
    private javax.swing.JPanel jPaneltitulo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jiconuser;
    private javax.swing.JLabel jlblogoRetirar;
    private javax.swing.JLabel jlblogoRetirar1;
    private javax.swing.JLabel jlblogoRetirar3;
    private javax.swing.JLabel jlblogoRetirar4;
    private javax.swing.JLabel jlblretirtext;
    private javax.swing.JLabel jlblretirtext1;
    private javax.swing.JLabel jlblretirtext2;
    private javax.swing.JLabel jlblretirtext3;
    private javax.swing.JLabel jlblretirtext4;
    private javax.swing.JLabel jlblretirtext5;
    private javax.swing.JLabel jlblretirtext6;
    private javax.swing.JLabel jlblretirtext7;
    private javax.swing.JLabel jloperacio;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel txtHoraFecha;
    private javax.swing.JLabel txtMisCuentas;
    private javax.swing.JLabel txtNombreCliente;
    private javax.swing.JLabel txtNumeroCuenta1;
    private javax.swing.JLabel txtNumeroCuenta2;
    private javax.swing.JLabel txtNumeroCuenta3;
    private javax.swing.JLabel txtNumeroCuenta4;
    private javax.swing.JLabel txtSaldoCuenta1;
    private javax.swing.JLabel txtSaldoCuenta2;
    private javax.swing.JLabel txtSaldoCuenta3;
    private javax.swing.JLabel txtSaldoCuenta4;
    private javax.swing.JLabel txtSimboloNuevaCuenta;
    private javax.swing.JLabel txtTipoCuenta1;
    private javax.swing.JLabel txtTipoCuenta2;
    private javax.swing.JLabel txtTipoCuenta3;
    private javax.swing.JLabel txtTipoCuenta4;
    private javax.swing.JLabel txtmoneda1;
    private javax.swing.JLabel txtmoneda2;
    private javax.swing.JLabel txtmoneda3;
    private javax.swing.JLabel txtmoneda4;
    private javax.swing.JLabel txtsaldototal;
    // End of variables declaration//GEN-END:variables
}
