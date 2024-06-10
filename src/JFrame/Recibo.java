/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrame;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Recibo extends javax.swing.JFrame {

    public Usuario usuario;
    public Recibo(Usuario cliente,float valor, String numCuenta, String tipoOperacion) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.usuario=cliente;
        LocalDate fechaActual=LocalDate.now();
        LocalTime horaActual = LocalTime.now();
        // Formatear la hora actual a hh:mm:ss
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormateada = horaActual.format(formatter);
        // Cambia el mensaje dependiendo del tipo de operación
        if (tipoOperacion.equalsIgnoreCase("deposito")) {
            lblDepositoExitoso.setText("¡Deposito exitoso!");
        } else if (tipoOperacion.equalsIgnoreCase("retiro")) {
            lblDepositoExitoso.setText("¡Retiro exitoso!");
        }
        
        // Obtener la moneda de la cuenta y mostrar el símbolo correspondiente
        String moneda = cliente.getMonedaDeCuenta(numCuenta);
        if (moneda != null) {
            switch (moneda.toLowerCase()) {
                case "bolivianos":
                    txtSimboloDolar.setText("Bs");
                    break;
                case "dolares":
                    txtSimboloDolar.setText("USD");
                    break;
                case "euros":
                    txtSimboloDolar.setText("EUR");
                    break;
                default:
                    txtSimboloDolar.setText("");
                    break;
            }
        }
        lblBeneficiario.setText("Ordenante");
        lblNombre.setText(cliente.getNombreCompleto());
        lblValor.setText(String.valueOf(valor));
        lblCuenta.setText(numCuenta);
        txtFecha.setText(String.valueOf(fechaActual));
        txtHora.setText(horaFormateada);
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
        iconcheck = new javax.swing.JLabel();
        lblDepositoExitoso = new javax.swing.JLabel();
        txtvalor = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        txtSimboloDolar = new javax.swing.JLabel();
        txtdesde = new javax.swing.JLabel();
        lblCuenta = new javax.swing.JLabel();
        lblBeneficiario = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        lblhora = new javax.swing.JLabel();
        txtHora = new javax.swing.JLabel();
        btnMenuPrincipal = new javax.swing.JButton();
        bntSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconcheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-accept-67.png"))); // NOI18N
        jPanel1.add(iconcheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, 80));

        lblDepositoExitoso.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblDepositoExitoso.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(lblDepositoExitoso, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 260, 40));

        txtvalor.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        txtvalor.setForeground(new java.awt.Color(0, 51, 51));
        txtvalor.setText("Monto");
        jPanel1.add(txtvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, 35));

        lblValor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblValor.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 110, 35));

        txtSimboloDolar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSimboloDolar.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(txtSimboloDolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 60, 35));

        txtdesde.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        txtdesde.setForeground(new java.awt.Color(0, 51, 51));
        txtdesde.setText("Cuenta");
        jPanel1.add(txtdesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, 35));

        lblCuenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCuenta.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(lblCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 210, 35));

        lblBeneficiario.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblBeneficiario.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(lblBeneficiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 110, 35));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 260, 90));

        lblfecha.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblfecha.setForeground(new java.awt.Color(0, 51, 51));
        lblfecha.setText("FECHA");
        jPanel1.add(lblfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 90, 35));

        txtFecha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 225, 120, 30));

        lblhora.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblhora.setForeground(new java.awt.Color(0, 51, 51));
        lblhora.setText("HORA");
        jPanel1.add(lblhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 90, 35));

        txtHora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtHora.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 225, 130, 30));

        btnMenuPrincipal.setBackground(new java.awt.Color(0, 51, 153));
        btnMenuPrincipal.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnMenuPrincipal.setText("Menu Principal");
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 569, 180, 41));

        bntSalir.setBackground(new java.awt.Color(153, 0, 0));
        bntSalir.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        bntSalir.setText("Salir");
        bntSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalirActionPerformed(evt);
            }
        });
        jPanel1.add(bntSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 569, 180, 41));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        MenuPrincipal menuPrincipal = new MenuPrincipal(this.usuario);
        menuPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void bntSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bntSalirActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recibo(null,-1,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSalir;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JLabel iconcheck;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBeneficiario;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblDepositoExitoso;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblhora;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtHora;
    private javax.swing.JLabel txtSimboloDolar;
    private javax.swing.JLabel txtdesde;
    private javax.swing.JLabel txtvalor;
    // End of variables declaration//GEN-END:variables
}
