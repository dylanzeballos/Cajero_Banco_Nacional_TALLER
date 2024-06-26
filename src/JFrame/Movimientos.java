/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrame;

import java.text.DecimalFormat;

public class Movimientos extends javax.swing.JFrame {

    Usuario cliente;
    int indiceDeCuenta;
    
    public Movimientos(Usuario cliente, int indice) {
        initComponents();
        this.setLocationRelativeTo(this);
         DecimalFormat frmt=new DecimalFormat();
        frmt.setMaximumFractionDigits(2);
        txtMovimientos.setFocusable(false);
        this.cliente = cliente;
        this.indiceDeCuenta = indice;
        txtImgNumeroDeCuenta.setText("N°"+String.valueOf(cliente.getCuenta(indiceDeCuenta)));
        txtSaldoCuenta.setText(String.valueOf(frmt.format(cliente.getSaldo(indiceDeCuenta))));
        txtImgTipoDeCuenta.setText(String.valueOf(cliente.getTipoCuentas(indiceDeCuenta)));
        txtmoneda.setText(String.valueOf(cliente.getMoneda(indiceDeCuenta)));
        
        cargarMovimientos();
    }
    
    private void cargarMovimientos() {
        String movimientos = cliente.getMovimientos(indiceDeCuenta);
        txtMovimientos.setText(movimientos);
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
        txtTituloInformacionCuenta = new javax.swing.JLabel();
        txtSaldoDisponible = new javax.swing.JLabel();
        txtSaldoCuenta = new javax.swing.JLabel();
        icontipocuenta = new javax.swing.JLabel();
        txtImgTipoDeCuenta = new javax.swing.JLabel();
        iconnumerocuenta = new javax.swing.JLabel();
        txtImgNumeroDeCuenta = new javax.swing.JLabel();
        iconmoneda = new javax.swing.JLabel();
        txtmoneda = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMovimientos = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLbanco = new javax.swing.JLabel();
        jButMenuPrin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTituloInformacionCuenta.setBackground(new java.awt.Color(0, 20, 117));
        txtTituloInformacionCuenta.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        txtTituloInformacionCuenta.setForeground(new java.awt.Color(0, 51, 51));
        txtTituloInformacionCuenta.setText("Informacion de cuenta");
        jPanel2.add(txtTituloInformacionCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 290, 40));

        txtSaldoDisponible.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtSaldoDisponible.setForeground(new java.awt.Color(0, 51, 51));
        txtSaldoDisponible.setText("Saldo disponible");
        jPanel2.add(txtSaldoDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 170, 30));

        txtSaldoCuenta.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jPanel2.add(txtSaldoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 180, 30));

        icontipocuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-6-53.png"))); // NOI18N
        jPanel2.add(icontipocuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 50, 60));

        txtImgTipoDeCuenta.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jPanel2.add(txtImgTipoDeCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 180, 30));

        iconnumerocuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconoNumeros.png"))); // NOI18N
        jPanel2.add(iconnumerocuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 20, 30));

        txtImgNumeroDeCuenta.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jPanel2.add(txtImgNumeroDeCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 180, 30));

        iconmoneda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-withdrawal-50.png"))); // NOI18N
        jPanel2.add(iconmoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 50, 60));

        txtmoneda.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jPanel2.add(txtmoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 180, 30));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-list-68.png"))); // NOI18N

        jLabel4.setBackground(new java.awt.Color(0, 0, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("ULTIMOS MOVIMIENTOS");

        jScrollPane2.setBackground(new java.awt.Color(153, 153, 153));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        txtMovimientos.setEditable(false);
        txtMovimientos.setBackground(new java.awt.Color(255, 255, 255));
        txtMovimientos.setColumns(20);
        txtMovimientos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtMovimientos.setForeground(new java.awt.Color(102, 102, 102));
        txtMovimientos.setRows(5);
        jScrollPane2.setViewportView(txtMovimientos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(315, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 880, 380));

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbanco.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLbanco.setForeground(new java.awt.Color(204, 204, 204));
        jLbanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lOGOA.png"))); // NOI18N
        jLbanco.setText("BANCO NACIONAL");
        jPanel4.add(jLbanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 410, 190));

        jButMenuPrin.setBackground(new java.awt.Color(0, 51, 102));
        jButMenuPrin.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButMenuPrin.setForeground(new java.awt.Color(204, 204, 204));
        jButMenuPrin.setText("Menu principal");
        jButMenuPrin.setBorder(null);
        jButMenuPrin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButMenuPrinActionPerformed(evt);
            }
        });
        jPanel4.add(jButMenuPrin, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 160, 50));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButMenuPrinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButMenuPrinActionPerformed
        MenuPrincipal menuprincipal = new MenuPrincipal(this.cliente);
        menuprincipal.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButMenuPrinActionPerformed

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
            java.util.logging.Logger.getLogger(Movimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Movimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Movimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Movimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Movimientos(null, 0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconmoneda;
    private javax.swing.JLabel iconnumerocuenta;
    private javax.swing.JLabel icontipocuenta;
    private javax.swing.JButton jButMenuPrin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLbanco;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel txtImgNumeroDeCuenta;
    private javax.swing.JLabel txtImgTipoDeCuenta;
    private javax.swing.JTextArea txtMovimientos;
    private javax.swing.JLabel txtSaldoCuenta;
    private javax.swing.JLabel txtSaldoDisponible;
    private javax.swing.JLabel txtTituloInformacionCuenta;
    private javax.swing.JLabel txtmoneda;
    // End of variables declaration//GEN-END:variables
}

