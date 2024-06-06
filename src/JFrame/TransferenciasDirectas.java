package JFrame;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TransferenciasDirectas extends javax.swing.JFrame {

    public Usuario cliente;
    DecimalFormat frmt = new DecimalFormat();
    
    public TransferenciasDirectas(Usuario cliente) {
        initComponents();
        this.setLocationRelativeTo(null);
        frmt.setMaximumFractionDigits(2);
        this.cliente = cliente;
         switch(cliente.getCantidadCuentas()){
            case 1:
                cmbCuentas.addItem(String.valueOf(cliente.getCuenta(0)));
            break;
            case 2:
                cmbCuentas.addItem(String.valueOf(cliente.getCuenta(0)));
                cmbCuentas.addItem(String.valueOf(cliente.getCuenta(1)));
            break;
            case 3:
                cmbCuentas.addItem(String.valueOf(cliente.getCuenta(0)));
                cmbCuentas.addItem(String.valueOf(cliente.getCuenta(1)));
                cmbCuentas.addItem(String.valueOf(cliente.getCuenta(2)));
            break;
            case 4:
                cmbCuentas.addItem(String.valueOf(cliente.getCuenta(0)));
                cmbCuentas.addItem(String.valueOf(cliente.getCuenta(1)));
                cmbCuentas.addItem(String.valueOf(cliente.getCuenta(2)));
                cmbCuentas.addItem(String.valueOf(cliente.getCuenta(3)));
         }   
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
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbCuentas = new javax.swing.JComboBox<>();
        lblValidCuenta = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        txtSimboloDolar = new javax.swing.JLabel();
        lblMontoatransferir = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lblValMonto = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblNum = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        lblValNum = new javax.swing.JLabel();
        lblNom = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblValNom = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Transferencias directas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 440, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 237, 480, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Elija la cuenta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 220, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Nro.Cuenta");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        cmbCuentas.setBackground(new java.awt.Color(255, 255, 255));
        cmbCuentas.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        cmbCuentas.setForeground(new java.awt.Color(0, 51, 51));
        cmbCuentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cmbCuentas.setSelectedItem(this);
        cmbCuentas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbCuentas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TransferenciasDirectas.this.itemStateChanged(evt);
            }
        });
        jPanel1.add(cmbCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 350, 300, 40));
        jPanel1.add(lblValidCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 270, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Saldo Disponible");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, -1, -1));

        lblSaldo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblSaldo.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 150, 30));

        txtSimboloDolar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtSimboloDolar.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(txtSimboloDolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, 60, 30));

        lblMontoatransferir.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblMontoatransferir.setForeground(new java.awt.Color(0, 51, 51));
        lblMontoatransferir.setText("Monto a Transferir");
        jPanel1.add(lblMontoatransferir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 180, 30));

        txtMonto.setBackground(new java.awt.Color(255, 255, 255));
        txtMonto.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtMonto.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 180, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, 70, 30));
        jPanel1.add(lblValMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 180, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("Datos del benefeciario");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 230, 30));

        lblNum.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblNum.setForeground(new java.awt.Color(0, 51, 51));
        lblNum.setText("Nro. Cuenta");
        jPanel1.add(lblNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 120, 30));

        txtNum.setBackground(new java.awt.Color(255, 255, 255));
        txtNum.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtNum.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 300, 30));
        jPanel1.add(lblValNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 590, 230, 20));

        lblNom.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblNom.setForeground(new java.awt.Color(0, 51, 51));
        lblNom.setText("Nombre");
        jPanel1.add(lblNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 620, 120, 30));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 620, 300, 30));
        jPanel1.add(lblValNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 660, 220, 20));

        btnContinuar.setBackground(new java.awt.Color(0, 51, 153));
        btnContinuar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 700, 280, 50));

        btnVolver.setBackground(new java.awt.Color(153, 0, 0));
        btnVolver.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 700, 280, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        try{
            int contadorFila=0;
            int contadorColumna=0;
            boolean Validar1=false;
            boolean onlyNum=false;
            boolean onlyLetNombre=false;
            boolean comb=false;
            boolean validCuentaDestino=false;
            String numeroCuentaEmisor=cliente.getCuenta(cmbCuentas.getSelectedIndex()-1);
            String numeroCuentaDestino=txtNum.getText();
            String nombre=txtNombre.getText();
            float montoPagado=-1;
            //String cuentaClienteEmisor=cliente.getNumeroDeCuenta(cmbCuentas.getSelectedIndex()-1);
            

            if(txtMonto.getText().isEmpty()){
                lblMontoatransferir.setText("*Campo obligatorio");
            } else{
                try {
                    float monto=Float.parseFloat(txtMonto.getText());
                    if(monto<0){
                        lblMontoatransferir.setText("*Dato no válido");
                    } else{
                        if(monto>(cliente.getSaldo((cmbCuentas.getSelectedIndex())-1))-0.4){
                            lblMontoatransferir.setText("*Saldo insuficiente");
                        }
                        else{
                            Validar1=true;
                            lblMontoatransferir.setText("");
                            montoPagado=monto;
                        }
                    }
                } catch (Exception e) {

                    lblMontoatransferir.setText("*Dato no válido");
                }
            }

            if(numeroCuentaDestino.isEmpty()){
                lblNum.setText("*Campo obligatorio");
            } else {
                for (int i = 0; i < numeroCuentaDestino.length(); i++) {
                    if (Character.isAlphabetic(numeroCuentaDestino.charAt(i))) {
                        onlyNum = false;
                        lblNum.setText("*Dato no válido");

                    } else {
                        onlyNum = true;
                        lblNum.setText("");
                    }
                }
                    if(onlyNum){
                        ArrayList<String> archivo = cliente.leerArchivo();
                        contadorFila = 0;
                        String cuentaDest = txtNum.getText();
                        for (int j = 0; j < archivo.size(); j++) {
                             String fila = archivo.get(j);
                             String[] columnas = fila.split(";");
                            
                             if (columnas.length > 2) {
                                 contadorColumna=0;
                                 for (String columna : columnas) {
                                     if (columna.equals(cuentaDest)) {
                                        validCuentaDestino = true;
                                        break;
                                    }
                                     contadorColumna++;
                                 }
                             }
                            if (validCuentaDestino) {
                            break;
                        }
                         contadorFila++;
                     }
                 }
                 if (!validCuentaDestino) {
                     JOptionPane.showMessageDialog(null, "Usuario no encontrado\n"
                             + "Verifique el número de cuenta",
                             "Error", JOptionPane.WARNING_MESSAGE);
                 }
             }

             if (cmbCuentas.getSelectedIndex() == 0) {
                 lblValidCuenta.setText("*Seleccione una cuenta");
             } else {
                 comb = true;
                 lblValidCuenta.setText("");

             }

             if (nombre.isEmpty()) {
                 lblNom.setText("*Campo obligatorio");
            } else{
                for (int i=0;i<nombre.length();i++){
                    if(Character.isDigit(nombre.charAt(i))){
                        onlyLetNombre=false;
                        lblNom.setText("*Dato no válido");
                    } else{
                        onlyLetNombre=true;
                        lblNom.setText("");
                    }
                }
            }
            
            
          
            if(Validar1 && onlyNum && onlyLetNombre && comb && validCuentaDestino) {

                 ConfirmacionPagos newframe = new ConfirmacionPagos(
                         this.cliente, montoPagado, numeroCuentaEmisor, numeroCuentaDestino,
                         contadorFila,contadorColumna,
                         (cmbCuentas.getSelectedIndex() - 1), nombre, "Directa");
                 newframe.setVisible(true);
                 dispose();

             }

        }catch(Exception e){                  

        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuPrincipal pantallaVolver = new MenuPrincipal(this.cliente);
        pantallaVolver.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void TransferecniasDirectas(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TransferecniasDirectas
        // TODO add your handling code here:
    }//GEN-LAST:event_TransferecniasDirectas
    
    private void itemStateChanged(java.awt.event.ItemEvent evt) {                                  
        switch (cmbCuentas.getSelectedIndex()){
            case 0:
            lblSaldo.setText("0");
            txtSimboloDolar.setText("");
            break;
            case 1:
            lblSaldo.setText(String.valueOf(frmt.format(cliente.getSaldo(0))));
            String moneda = String.valueOf(cliente.getMoneda(0));
                if ("BOLIVIANOS".equals(moneda)) {
                    txtSimboloDolar.setText("Bs");
                } else if ("DOLARES".equals(moneda)) {
                    txtSimboloDolar.setText("US$");
                } else if ("EUROS".equals(moneda)) {
                    txtSimboloDolar.setText("£");
                } else {
                    txtSimboloDolar.setText("");
                }
            break;
            case 2:
            lblSaldo.setText(String.valueOf(frmt.format(cliente.getSaldo(1))));
            String moneda1 = String.valueOf(cliente.getMoneda(1));
                if ("BOLIVIANOS".equals(moneda1)) {
                    txtSimboloDolar.setText("Bs");
                } else if ("DOLARES".equals(moneda1)) {
                    txtSimboloDolar.setText("US$");
                } else if ("EUROS".equals(moneda1)) {
                    txtSimboloDolar.setText("£");
                } else {
                    txtSimboloDolar.setText("");
                }
            break;
            case 3:
            lblSaldo.setText(String.valueOf(frmt.format(cliente.getSaldo(2))));
            String moneda2 = String.valueOf(cliente.getMoneda(2));
                if ("BOLIVIANOS".equals(moneda2)) {
                    txtSimboloDolar.setText("Bs");
                } else if ("DOLARES".equals(moneda2)) {
                    txtSimboloDolar.setText("US$");
                } else if ("EUROS".equals(moneda2)) {
                    txtSimboloDolar.setText("£");
                } else {
                    txtSimboloDolar.setText("");
                }
            break;
            case 4:
            lblSaldo.setText(String.valueOf(frmt.format(cliente.getSaldo(3))));
            String moneda3 = String.valueOf(cliente.getMoneda(3));
                if ("BOLIVIANOS".equals(moneda3)) {
                    txtSimboloDolar.setText("Bs");
                } else if ("DOLARES".equals(moneda3)) {
                    txtSimboloDolar.setText("US$");
                } else if ("EUROS".equals(moneda3)) {
                    txtSimboloDolar.setText("£");
                } else {
                    txtSimboloDolar.setText("");
                }
            break;
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
            java.util.logging.Logger.getLogger(TransferenciasDirectas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransferenciasDirectas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransferenciasDirectas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransferenciasDirectas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransferenciasDirectas(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbCuentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLbanco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblMontoatransferir;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblValMonto;
    private javax.swing.JLabel lblValNom;
    private javax.swing.JLabel lblValNum;
    private javax.swing.JLabel lblValidCuenta;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNum;
    private javax.swing.JLabel txtSimboloDolar;
    // End of variables declaration//GEN-END:variables
}
