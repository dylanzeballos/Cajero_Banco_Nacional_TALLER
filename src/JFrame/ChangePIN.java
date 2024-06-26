/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrame;

import javax.swing.JOptionPane;

public class ChangePIN extends javax.swing.JFrame {
    
    Usuario cliente;
    

    /**
     * Creates new form ChangePIN
     */
    public ChangePIN(Usuario cliente) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.cliente=cliente;
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
        jPanel2 = new javax.swing.JPanel();
        LBLTITULOCAMBIAR = new javax.swing.JLabel();
        iconcambiocontra = new javax.swing.JLabel();
        lblnuevacontraseña = new javax.swing.JLabel();
        textfielcontrasenianueva = new javax.swing.JPasswordField();
        lblvalnueva = new javax.swing.JLabel();
        lblconfirmarcontraseña = new javax.swing.JLabel();
        textfielconfirmacontra = new javax.swing.JPasswordField();
        lblvalconfirmada = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();

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

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBLTITULOCAMBIAR.setBackground(new java.awt.Color(0, 0, 204));
        LBLTITULOCAMBIAR.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        LBLTITULOCAMBIAR.setForeground(new java.awt.Color(0, 51, 51));
        LBLTITULOCAMBIAR.setText("CAMBIO DE CONTRASEÑA");
        jPanel2.add(LBLTITULOCAMBIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 336, 60));

        iconcambiocontra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-change-password-58.png"))); // NOI18N
        jPanel2.add(iconcambiocontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 60, 80));

        lblnuevacontraseña.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblnuevacontraseña.setForeground(new java.awt.Color(0, 51, 51));
        lblnuevacontraseña.setText("NUEVA CONTRASEÑA");
        jPanel2.add(lblnuevacontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 107, -1, 43));

        textfielcontrasenianueva.setBackground(new java.awt.Color(255, 255, 255));
        textfielcontrasenianueva.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        textfielcontrasenianueva.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(textfielcontrasenianueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 350, 40));

        lblvalnueva.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblvalnueva.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(lblvalnueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 350, 20));

        lblconfirmarcontraseña.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblconfirmarcontraseña.setForeground(new java.awt.Color(0, 51, 51));
        lblconfirmarcontraseña.setText("CONFIRMAR CONTRASEÑA");
        jPanel2.add(lblconfirmarcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 43));

        textfielconfirmacontra.setBackground(new java.awt.Color(255, 255, 255));
        textfielconfirmacontra.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        textfielconfirmacontra.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(textfielconfirmacontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 350, 40));

        lblvalconfirmada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblvalconfirmada.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(lblvalconfirmada, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 350, 20));

        btnVolver.setBackground(new java.awt.Color(153, 0, 0));
        btnVolver.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel2.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 280, 50));

        btnConfirmar.setBackground(new java.awt.Color(0, 51, 153));
        btnConfirmar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jPanel2.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 280, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 700, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {
        MenuPrincipal pantallaVolver = new MenuPrincipal(this.cliente);
        pantallaVolver.setVisible(true);
        dispose();
    }

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {
        // Obtiene la nueva contraseña y la confirmación de la contraseña ingresada por el usuario.
        String nuevaContraseña = textfielcontrasenianueva.getText();
        String confirmarContraseña = textfielconfirmacontra.getText();
        boolean validarContr = false;    
        
        // Realiza varias validaciones:
        if (nuevaContraseña.isEmpty() || confirmarContraseña.isEmpty()) {
            // Verifica si alguno de los campos está vacío y muestra un mensaje de error si es así.
            lblvalnueva.setText("*Campos obligatorios");
            lblvalconfirmada.setText("");
        } else if (nuevaContraseña.length() < 8 || confirmarContraseña.length() < 8) {
            // Verifica si ambas contraseñas tienen al menos 8 caracteres y muestra un mensaje de error si no es así.
            lblvalnueva.setText("*Digite al menos 8 caracteres");
            lblvalconfirmada.setText("");
        } else if (!nuevaContraseña.equals(confirmarContraseña)) {
            // Verifica si las contraseñas coinciden y muestra un mensaje de error si no coinciden.
            lblvalconfirmada.setText("*Las contraseñas no coinciden");
            lblvalnueva.setText("");
        } else {
            // Si todas las validaciones son exitosas, establece validarContr a true.
            validarContr = true;
            lblvalnueva.setText("");
            lblvalconfirmada.setText("");
        }

        if (validarContr) {
            // Llama al método cambiarContrasenia del objeto cliente para cambiar la contraseña.
            cliente.cambiarContrasenia(nuevaContraseña);
            // Muestra un mensaje de confirmación.
            JOptionPane.showMessageDialog(this, "Contraseña actualizada correctamente.Vuelva a iniciar sesion");
            // Cierra la aplicación.para volver a iniciar sesion con la nueva contraseña
            System.exit(0);
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
            java.util.logging.Logger.getLogger(ChangePIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePIN(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBLTITULOCAMBIAR;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel iconcambiocontra;
    private javax.swing.JLabel jLbanco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblconfirmarcontraseña;
    private javax.swing.JLabel lblnuevacontraseña;
    private javax.swing.JLabel lblvalconfirmada;
    private javax.swing.JLabel lblvalnueva;
    private javax.swing.JPasswordField textfielconfirmacontra;
    private javax.swing.JPasswordField textfielcontrasenianueva;
    // End of variables declaration//GEN-END:variables
}
