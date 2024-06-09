/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrame;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NuevaCuenta extends javax.swing.JFrame {

    private Usuario cliente;// Almacena el objeto Usuario, que contiene la información del cliente
    private int tipo;// Almacena el tipo de cuenta (e.g., cuenta corriente, cuenta de ahorro)
    private String numCuenta="";// Almacena el número de cuenta generado
    private float saldoInicial; // Almacena el saldo inicial de la nueva cuenta
    private int moneda;// Almacena el tipo de moneda (bolivianos, dólares, euros)
    /**
     * Constructor de la clase NuevaCuenta.
     * Inicializa los componentes de la GUI y establece la localización de la ventana en el centro de la pantalla.
     *
     * @param cliente El objeto Usuario que representa al cliente que está creando una nueva cuenta.
     */
    public NuevaCuenta(Usuario cliente) {
        initComponents();
        this.cliente = cliente;
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLbanco = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        titulonuevacuenta = new javax.swing.JLabel();
        lbltipocuenta = new javax.swing.JLabel();
        tipocaja = new javax.swing.JComboBox<>();
        lbltipomoneda = new javax.swing.JLabel();
        tipomoneda = new javax.swing.JComboBox<>();
        lblabonoini = new javax.swing.JLabel();
        textfieldabono = new javax.swing.JTextField();
        cancelarbut = new javax.swing.JButton();
        añadirbutton = new javax.swing.JButton();
        lblValidMonto = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbanco.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLbanco.setForeground(new java.awt.Color(204, 204, 204));
        jLbanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lOGOA.png"))); // NOI18N
        jLbanco.setText("BANCO NACIONAL");
        jPanel2.add(jLbanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, -10, 470, 170));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        titulonuevacuenta.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        titulonuevacuenta.setForeground(new java.awt.Color(0, 51, 51));
        titulonuevacuenta.setText("Añadir nueva cuenta");

        lbltipocuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbltipocuenta.setText("Elige el tipo de cuenta");

        tipocaja.setBackground(new java.awt.Color(255, 255, 255));
        tipocaja.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        tipocaja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AHORROS ", "CORRIENTE" }));
        tipocaja.setName("BOLIVIANOS\n"); // NOI18N

        lbltipomoneda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbltipomoneda.setText("Elige el tipo de moneda");

        tipomoneda.setBackground(new java.awt.Color(255, 255, 255));
        tipomoneda.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        tipomoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BOLIVIANOS", "DOLARES", "EUROS" }));
        tipomoneda.setName("BOLIVIANOS\n"); // NOI18N

        lblabonoini.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblabonoini.setText("Ingrese su abono inicial");

        textfieldabono.setBackground(new java.awt.Color(255, 255, 255));

        cancelarbut.setBackground(new java.awt.Color(204, 0, 0));
        cancelarbut.setForeground(new java.awt.Color(255, 255, 255));
        cancelarbut.setText("Cancelar");
        cancelarbut.setBorder(null);
        cancelarbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarbutMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelarbutMousePressed(evt);
            }
        });
        cancelarbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarbutActionPerformed(evt);
            }
        });

        añadirbutton.setBackground(new java.awt.Color(0, 51, 204));
        añadirbutton.setForeground(new java.awt.Color(255, 255, 255));
        añadirbutton.setText("Añadir");
        añadirbutton.setBorder(null);
        añadirbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                añadirbuttonMouseClicked(evt);
            }
        });
        añadirbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirbuttonActionPerformed(evt);
            }
        });

        lblValidMonto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(añadirbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(tipocaja, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(titulonuevacuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textfieldabono, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipomoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblabonoini, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(lblValidMonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltipomoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltipocuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelarbut, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(titulonuevacuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltipocuenta)
                .addGap(18, 18, 18)
                .addComponent(tipocaja, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbltipomoneda)
                .addGap(18, 18, 18)
                .addComponent(tipomoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lblabonoini)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textfieldabono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValidMonto, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarbut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añadirbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 500, 440));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 115, 500, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/t5yiz5tn.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * Maneja la acción del botón de cancelar.
    * Abre la ventana principal del menú y cierra la ventana actual.
    *
    * @param evt Evento de acción que desencadena la apertura de la ventana principal del menú.
    */
    private void cancelarbutActionPerformed(java.awt.event.ActionEvent evt) {
        MenuPrincipal menuprincipal = new MenuPrincipal(cliente);
        menuprincipal.setVisible(true); // Muestra la ventana del menú principal
        dispose();// Cierra la ventana actual
    }
    
    /**
    * Maneja la acción del botón de añadir.
    * Valida y procesa la adición de una nueva cuenta para el usuario.
    *
    * @param evt Evento de acción que desencadena la validación y adición de una nueva cuenta.
    */
    private void añadirbuttonActionPerformed(java.awt.event.ActionEvent evt) {
        boolean validMonto=false;
        try {
            // Intenta parsear el texto del campo de abono a un float
            float monto = Float.parseFloat(textfieldabono.getText());
            if (monto < 0) {
                lblValidMonto.setText("*Introduzca una cantidad positiva");
            } else {
                    validMonto = true;
                    lblValidMonto.setText("");
                    saldoInicial = monto;  
            }
        } catch (Exception e) {

            lblValidMonto.setText("*Cantidad no válida");
        }
        
        if(validMonto){
            // Determina el tipo de cuenta seleccionado
            if(tipocaja.getSelectedIndex() == 0){
                this.tipo = 0;
            }else{
               this.tipo = 1;
            }
            
            // Determina la moneda seleccionada
            if(tipomoneda.getSelectedIndex()==0){
                this.moneda = 0;
            }else if (tipomoneda.getSelectedIndex()== 1){
                this.moneda = 1;
            } else {
                this.moneda =2;
            }
            
             // Genera un número de cuenta aleatorio de 10 dígitos
            for (int i = 0; i < 10; i++) {
                numCuenta = numCuenta + String.valueOf((int) Math.round(Math.random() * 8 + 1));
            }
            // Agrega la nueva cuenta al usuario
            cliente.addCuenta(numCuenta);
            cliente.addTipo(String.valueOf(tipo));
            cliente.addSaldo(saldoInicial);
            cliente.addMoneda(String.valueOf(moneda));
            // Actualiza la información del usuario en el archivo
            ArrayList<String> archivo = cliente.leerArchivo();
            String datosUsuario = archivo.get(cliente.getFila());
            datosUsuario = datosUsuario + ";" + numCuenta + ";" + tipo + ";" + saldoInicial + ";" + moneda;

            archivo.set(cliente.getFila(), datosUsuario);
            cliente.anexar(archivo, "usuarios.txt");
            // Muestra un mensaje de confirmación
            JOptionPane.showMessageDialog(null, "Se ha agregado una cuenta\n",
                    "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            // Abre la ventana del menú principal y cierra la ventana actual
            MenuPrincipal menuPrincipal = new MenuPrincipal(cliente);
            menuPrincipal.setVisible(true);
            dispose();
        }        
    }

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
            java.util.logging.Logger.getLogger(NuevaCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaCuenta(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadirbutton;
    private javax.swing.JButton cancelarbut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLbanco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblValidMonto;
    private javax.swing.JLabel lblabonoini;
    private javax.swing.JLabel lbltipocuenta;
    private javax.swing.JLabel lbltipomoneda;
    private javax.swing.JTextField textfieldabono;
    private javax.swing.JComboBox<String> tipocaja;
    private javax.swing.JComboBox<String> tipomoneda;
    private javax.swing.JLabel titulonuevacuenta;
    // End of variables declaration//GEN-END:variables
}
