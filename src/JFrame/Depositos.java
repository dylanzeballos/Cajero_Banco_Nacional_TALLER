/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrame;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;



public class Depositos extends javax.swing.JFrame {

    Usuario cliente;
    DecimalFormat frmt = new DecimalFormat();
    int indiceComboBox;
    
    public Depositos(Usuario cliente) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.cliente = cliente;
        
        for (int i = 0; i < cliente.getCantidadCuentas(); i++) {
            cmbCuentasUsuarioOrigen.addItem(cliente.getTipoCuentas(i) + ": #" + String.valueOf(cliente.getCuenta(i)));
        }

        txtSaldo.setVisible(false);
        txtSaldoOrigen.setVisible(false);
        txtValorTransferencia.setVisible(false);
        txtSimboloDolar.setVisible(false);
        txtFieldDineroTransferencia.setVisible(false);
        txtSeleccioneCuenta.setVisible(false);
        txtError1.setVisible(false);
        txtError2.setVisible(false);
        
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
        jPanel4 = new javax.swing.JPanel();
        jLbanco = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtCuentaOrigen = new javax.swing.JLabel();
        txtSeleccioneCuenta = new javax.swing.JLabel();
        cmbCuentasUsuarioOrigen = new javax.swing.JComboBox<>();
        txtError1 = new javax.swing.JLabel();
        btnValidar1 = new javax.swing.JButton();
        txtSaldo = new javax.swing.JLabel();
        txtSaldoOrigen = new javax.swing.JLabel();
        txtSimboloDolar = new javax.swing.JLabel();
        txtValorTransferencia = new javax.swing.JLabel();
        txtFieldDineroTransferencia = new javax.swing.JTextField();
        txtError2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JPanel();
        txtVolver = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JPanel();
        txtConfirmar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbanco.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLbanco.setForeground(new java.awt.Color(204, 204, 204));
        jLbanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lOGOA.png"))); // NOI18N
        jLbanco.setText("BANCO NACIONAL");
        jPanel4.add(jLbanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 410, 190));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 180));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("DEPOSITOS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 220, 60));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 260, 20));

        txtCuentaOrigen.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        txtCuentaOrigen.setForeground(new java.awt.Color(0, 51, 51));
        txtCuentaOrigen.setText("CUENTA DESTINO");
        jPanel1.add(txtCuentaOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 240, 30));

        txtSeleccioneCuenta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtSeleccioneCuenta.setForeground(new java.awt.Color(0, 51, 51));
        txtSeleccioneCuenta.setText("Seleccione la cuenta destino:");
        jPanel1.add(txtSeleccioneCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 320, 20));

        cmbCuentasUsuarioOrigen.setBackground(new java.awt.Color(204, 204, 204));
        cmbCuentasUsuarioOrigen.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        cmbCuentasUsuarioOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cmbCuentasUsuarioOrigen.setName("BOLIVIANOS\n"); // NOI18N
        cmbCuentasUsuarioOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCuentasUsuarioOrigenActionPerformed(evt);
            }
        });
        jPanel1.add(cmbCuentasUsuarioOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 250, 30));

        txtError1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtError1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 280, 20));

        btnValidar1.setBackground(new java.awt.Color(204, 204, 204));
        btnValidar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconoVistoSmall.png"))); // NOI18N
        btnValidar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnValidar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnValidar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 30, 30));

        txtSaldo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtSaldo.setForeground(new java.awt.Color(0, 51, 51));
        txtSaldo.setText("Saldo disponible:");
        jPanel1.add(txtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 200, 30));

        txtSaldoOrigen.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jPanel1.add(txtSaldoOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 160, 35));

        txtSimboloDolar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jPanel1.add(txtSimboloDolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, 60, 40));

        txtValorTransferencia.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtValorTransferencia.setForeground(new java.awt.Color(0, 51, 51));
        txtValorTransferencia.setText("Valor a depositar:");
        jPanel1.add(txtValorTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, -1, 40));

        txtFieldDineroTransferencia.setBackground(new java.awt.Color(255, 255, 255));
        txtFieldDineroTransferencia.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtFieldDineroTransferencia.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(txtFieldDineroTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, 150, 30));

        txtError2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtError2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 510, 180, 20));

        btnVolver.setBackground(new java.awt.Color(153, 0, 0));
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
        });

        txtVolver.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        txtVolver.setText("Volver");
        txtVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtVolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnVolverLayout = new javax.swing.GroupLayout(btnVolver);
        btnVolver.setLayout(btnVolverLayout);
        btnVolverLayout.setHorizontalGroup(
            btnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnVolverLayout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(txtVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        btnVolverLayout.setVerticalGroup(
            btnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVolverLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtVolver)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 660, 210, 60));

        btnConfirmar.setBackground(new java.awt.Color(0, 51, 153));
        btnConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnConfirmarMousePressed(evt);
            }
        });

        txtConfirmar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        txtConfirmar.setText("Confirmar");

        javax.swing.GroupLayout btnConfirmarLayout = new javax.swing.GroupLayout(btnConfirmar);
        btnConfirmar.setLayout(btnConfirmarLayout);
        btnConfirmarLayout.setHorizontalGroup(
            btnConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnConfirmarLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(txtConfirmar)
                .addGap(46, 46, 46))
        );
        btnConfirmarLayout.setVerticalGroup(
            btnConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnConfirmarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtConfirmar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 660, 190, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCuentasUsuarioOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCuentasUsuarioOrigenActionPerformed
        int selectedIndex = cmbCuentasUsuarioOrigen.getSelectedIndex();
        if (selectedIndex > 0) {
            txtSaldo.setVisible(true);
            txtSaldoOrigen.setVisible(true);
            txtValorTransferencia.setVisible(true);
            txtSimboloDolar.setVisible(true);
            txtFieldDineroTransferencia.setVisible(true);
            txtSeleccioneCuenta.setVisible(true);
            txtError1.setVisible(false);
            txtError2.setVisible(false);

            float saldoDisponible = cliente.getSaldo(selectedIndex - 1);
            txtSaldoOrigen.setText(String.valueOf(saldoDisponible));

            String moneda = String.valueOf(cliente.getMoneda(selectedIndex-1));
            if ("BOLIVIANOS".equals(moneda)) {
            txtSimboloDolar.setText("Bs");
            } else if ("DOLARES".equals(moneda)) {
            txtSimboloDolar.setText("US$");
            } else if ("EUROS".equals(moneda)) {
            txtSimboloDolar.setText("£");
            } else {
            txtSimboloDolar.setText("");
            }
        } else {
            txtSaldo.setVisible(false);
            txtSaldoOrigen.setVisible(false);
            txtValorTransferencia.setVisible(false);
            txtSimboloDolar.setVisible(false);
            txtFieldDineroTransferencia.setVisible(false);
        }
    }//GEN-LAST:event_cmbCuentasUsuarioOrigenActionPerformed

    private void btnValidar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidar1ActionPerformed
        if(cmbCuentasUsuarioOrigen.getSelectedIndex()==0){
            txtError1.setVisible(true);
        }else{
            txtError1.setVisible(false);
            cmbCuentasUsuarioOrigen.setEnabled(false);
            btnValidar1.setEnabled(false);
            txtValorTransferencia.setVisible(true);
            txtSimboloDolar.setVisible(true);
            txtFieldDineroTransferencia.setVisible(true);
            txtFieldDineroTransferencia.setText("");
        }
    }//GEN-LAST:event_btnValidar1ActionPerformed

    private void txtVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtVolverMouseClicked
        MenuPrincipal pantMenu=new MenuPrincipal(this.cliente);
        pantMenu.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_txtVolverMouseClicked

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverMouseClicked

    private void btnConfirmarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMousePressed
        try {
            // Get the deposit value from the text field
            float valorDeposito = Float.parseFloat(txtFieldDineroTransferencia.getText());

            // Validate the deposit value
            if (valorDeposito <= 0) {
                txtError2.setText("El valor debe ser mayor a 0");
                txtError2.setVisible(true);
                return;
            }

            // Get the selected account index
            int cuentaSeleccionada = cmbCuentasUsuarioOrigen.getSelectedIndex();
            if (cuentaSeleccionada <= 0) { // Assuming the first item is a placeholder
                txtError2.setText("Seleccione una cuenta válida");
                txtError2.setVisible(true);
                return;
            }

            // Adjust index for zero-based array access
            int ajustaIndex = cuentaSeleccionada - 1;

            // Update the user's balance
            cliente.setSaldos(cliente.getSaldo(ajustaIndex) + valorDeposito, ajustaIndex);

            // Log the transaction
            String movimiento = LocalDate.now() + "\nDeposito de efectivo\n" + "- $" + valorDeposito + "\n\n" + cliente.getMovimientos(ajustaIndex);
            cliente.addMovimiento(movimiento, ajustaIndex);

            // Update the user's data in the file
            ArrayList<String> archivo = cliente.leerArchivo();
            archivo.get(cliente.getFila());
            String nuevaFila = cliente.escribirFilaNueva();
            cliente.anexar(cliente.sobrescribirArchivo(archivo, cliente.getFila(), nuevaFila), "usuarios.txt");

            // Show the receipt
            Recibo recibo = new Recibo(cliente, valorDeposito, cliente.getCuenta(ajustaIndex));
            recibo.setVisible(true);
            this.dispose();
        } catch (NumberFormatException e) {
            txtError2.setText("Ingrese un valor válido");
            txtError2.setVisible(true);
        }
    }//GEN-LAST:event_btnConfirmarMousePressed

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
            java.util.logging.Logger.getLogger(Depositos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Depositos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Depositos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Depositos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Depositos(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnConfirmar;
    private javax.swing.JButton btnValidar1;
    private javax.swing.JPanel btnVolver;
    private javax.swing.JComboBox<String> cmbCuentasUsuarioOrigen;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLbanco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtConfirmar;
    private javax.swing.JLabel txtCuentaOrigen;
    private javax.swing.JLabel txtError1;
    private javax.swing.JLabel txtError2;
    private javax.swing.JTextField txtFieldDineroTransferencia;
    private javax.swing.JLabel txtSaldo;
    private javax.swing.JLabel txtSaldoOrigen;
    private javax.swing.JLabel txtSeleccioneCuenta;
    private javax.swing.JLabel txtSimboloDolar;
    private javax.swing.JLabel txtValorTransferencia;
    private javax.swing.JLabel txtVolver;
    // End of variables declaration//GEN-END:variables
}
