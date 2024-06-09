/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrame;

import java.text.DecimalFormat;

/**
 * Clase TransferenciasCuentaCuenta.
 * Permite realizar transferencias de dinero entre las cuentas del usuario.
 */
public class TransferenciasCuentaCuenta extends javax.swing.JFrame {

    Usuario cliente;
    DecimalFormat frmt = new DecimalFormat();
    int indiceComboBox;
    /**
     * Constructor de la clase TransferenciasCuentaCuenta.
     * Inicializa los componentes de la GUI y establece la localización de la ventana en el centro de la pantalla.
     * También configura las cuentas del cliente en los ComboBoxes.
     *
     * @param cliente El objeto Usuario que representa al cliente que está realizando una transferencia.
     */
    public TransferenciasCuentaCuenta(Usuario cliente) {
        initComponents();
        this.setLocationRelativeTo(null);
        frmt.setMaximumFractionDigits(2);
        this.cliente = cliente;
         // Agrega las cuentas del cliente al ComboBox de cuentas de origen
        switch (cliente.getCantidadCuentas()) {
            case 1:
                cmbCuentasUsuarioOrigen.addItem(cliente.getTipoCuentas(0) + ": #" + String.valueOf(cliente.getCuenta(0)));
                break;
            case 2:
                cmbCuentasUsuarioOrigen.addItem(cliente.getTipoCuentas(0) + ": #" + String.valueOf(cliente.getCuenta(0)));
                cmbCuentasUsuarioOrigen.addItem(cliente.getTipoCuentas(1) + ": #" + String.valueOf(cliente.getCuenta(1)));
                break;
            case 3:
                cmbCuentasUsuarioOrigen.addItem(cliente.getTipoCuentas(0) + ": #" + String.valueOf(cliente.getCuenta(0)));
                cmbCuentasUsuarioOrigen.addItem(cliente.getTipoCuentas(1) + ": #" + String.valueOf(cliente.getCuenta(1)));
                cmbCuentasUsuarioOrigen.addItem(cliente.getTipoCuentas(2) + ": #" + String.valueOf(cliente.getCuenta(2)));
                break;
            case 4:
                cmbCuentasUsuarioOrigen.addItem(cliente.getTipoCuentas(0) + ": #" + String.valueOf(cliente.getCuenta(0)));
                cmbCuentasUsuarioOrigen.addItem(cliente.getTipoCuentas(1) + ": #" + String.valueOf(cliente.getCuenta(1)));
                cmbCuentasUsuarioOrigen.addItem(cliente.getTipoCuentas(2) + ": #" + String.valueOf(cliente.getCuenta(2)));
                cmbCuentasUsuarioOrigen.addItem(cliente.getTipoCuentas(3) + ": #" + String.valueOf(cliente.getCuenta(3)));
                break;
        }
        // Oculta varios componentes de la GUI al inicio
        txtSaldo.setVisible(false);
        txtSaldoOrigen.setVisible(false);
        txtValorTransferencia.setVisible(false);
        txtSimboloDolar.setVisible(false);
        txtFieldDineroTransferencia.setVisible(false);
        btnValidar2.setVisible(false);
        txtSubtituloDestino.setVisible(false);
        txtSeleccioneCuenta.setVisible(false);
        cmbCuentasUsuarioDestino.setVisible(false);
        btnValidar3.setVisible(false);
        btnConfirmar.setVisible(false);
        txtError1.setVisible(false);
        txtError2.setVisible(false);
        txtError3.setVisible(false);
        
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
        txtTituloTransferencia = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtCuentaOrigen = new javax.swing.JLabel();
        txtSeleccioneCuenta = new javax.swing.JLabel();
        cmbCuentasUsuarioOrigen = new javax.swing.JComboBox<>();
        btnValidar1 = new javax.swing.JButton();
        txtError1 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JLabel();
        txtSaldoOrigen = new javax.swing.JLabel();
        txtSimboloDolar = new javax.swing.JLabel();
        txtValorTransferencia = new javax.swing.JLabel();
        txtFieldDineroTransferencia = new javax.swing.JTextField();
        btnValidar2 = new javax.swing.JButton();
        txtError2 = new javax.swing.JLabel();
        txtSubtituloDestino = new javax.swing.JLabel();
        txtSubtituloResumen = new javax.swing.JLabel();
        cmbCuentasUsuarioDestino = new javax.swing.JComboBox<>();
        btnValidar3 = new javax.swing.JButton();
        txtError3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLbanco = new javax.swing.JLabel();
        btnVolver = new javax.swing.JPanel();
        txtVolver = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JPanel();
        txtConfirmar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTituloTransferencia.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        txtTituloTransferencia.setForeground(new java.awt.Color(0, 51, 51));
        txtTituloTransferencia.setText("Transferir a Cuenta Propia");
        jPanel1.add(txtTituloTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 660, 20));

        txtCuentaOrigen.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        txtCuentaOrigen.setForeground(new java.awt.Color(0, 51, 51));
        txtCuentaOrigen.setText("CUENTA ORIGEN");
        jPanel1.add(txtCuentaOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 130, 30));

        txtSeleccioneCuenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtSeleccioneCuenta.setForeground(new java.awt.Color(102, 102, 102));
        txtSeleccioneCuenta.setText("Seleccione la cuenta origen:");
        jPanel1.add(txtSeleccioneCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 250, 20));

        cmbCuentasUsuarioOrigen.setBackground(new java.awt.Color(204, 204, 204));
        cmbCuentasUsuarioOrigen.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        cmbCuentasUsuarioOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cmbCuentasUsuarioOrigen.setName("BOLIVIANOS\n"); // NOI18N
        cmbCuentasUsuarioOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCuentasUsuarioOrigenActionPerformed(evt);
            }
        });
        jPanel1.add(cmbCuentasUsuarioOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 280, 35));

        btnValidar1.setBackground(new java.awt.Color(204, 204, 204));
        btnValidar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconoVistoSmall.png"))); // NOI18N
        btnValidar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnValidar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnValidar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 280, 30, 35));

        txtError1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtError1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 280, 20));

        txtSaldo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtSaldo.setForeground(new java.awt.Color(0, 51, 51));
        txtSaldo.setText("Saldo disponible:");
        jPanel1.add(txtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 190, 30));

        txtSaldoOrigen.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        txtSaldoOrigen.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(txtSaldoOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 140, 40));

        txtSimboloDolar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        txtSimboloDolar.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.add(txtSimboloDolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 80, 50));

        txtValorTransferencia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtValorTransferencia.setForeground(new java.awt.Color(102, 102, 102));
        txtValorTransferencia.setText("Valor a transferir:");
        jPanel1.add(txtValorTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, -1, 20));

        txtFieldDineroTransferencia.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtFieldDineroTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 120, 35));

        btnValidar2.setBackground(new java.awt.Color(204, 204, 204));
        btnValidar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconoVistoSmall.png"))); // NOI18N
        btnValidar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnValidar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnValidar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 30, 35));

        txtError2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtError2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 180, 20));

        txtSubtituloDestino.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        txtSubtituloDestino.setForeground(new java.awt.Color(0, 51, 51));
        txtSubtituloDestino.setText("CUENTA DESTINO");
        jPanel1.add(txtSubtituloDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 140, 30));

        txtSubtituloResumen.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtSubtituloResumen.setForeground(new java.awt.Color(102, 102, 102));
        txtSubtituloResumen.setText("Seleccione la cuenta destino:");
        jPanel1.add(txtSubtituloResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, -1, 20));

        cmbCuentasUsuarioDestino.setBackground(new java.awt.Color(204, 204, 204));
        cmbCuentasUsuarioDestino.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        cmbCuentasUsuarioDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cmbCuentasUsuarioDestino.setName("BOLIVIANOS\n"); // NOI18N
        jPanel1.add(cmbCuentasUsuarioDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 570, 280, 35));

        btnValidar3.setBackground(new java.awt.Color(204, 204, 204));
        btnValidar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconoVistoSmall.png"))); // NOI18N
        btnValidar3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnValidar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidar3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnValidar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 570, 30, 35));

        txtError3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtError3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 610, 280, 20));

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbanco.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLbanco.setForeground(new java.awt.Color(204, 204, 204));
        jLbanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lOGOA.png"))); // NOI18N
        jLbanco.setText("BANCO NACIONAL");
        jPanel4.add(jLbanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 410, 190));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 180));

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

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {
    }
    /**
     * Maneja el evento de clic en el texto para volver al menú principal.
     * @param evt El evento de clic del ratón.
     */
    private void txtVolverMouseClicked(java.awt.event.MouseEvent evt) {
       MenuPrincipal pantMenu=new MenuPrincipal(this.cliente);
       pantMenu.setVisible(true);
       dispose();
    }
    /**
     * Maneja el evento de selección de una cuenta de origen del ComboBox.
     * @param evt El evento de acción.
     */
    private void cmbCuentasUsuarioOrigenActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedIndex = cmbCuentasUsuarioOrigen.getSelectedIndex();
        txtSaldo.setVisible(true);
        txtSaldoOrigen.setVisible(true);
        txtSimboloDolar.setVisible(true);
        /**
        * Actualiza el saldo y la moneda de la cuenta seleccionada.
        * @param indice El índice de la cuenta seleccionada.
        */
        switch (selectedIndex) {
            case 0:
                txtSaldoOrigen.setText("0.00");
                txtSimboloDolar.setText("");
                break;
            case 1:
                txtSaldoOrigen.setText(String.valueOf(frmt.format(cliente.getSaldo(0))));  
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
                indiceComboBox = 0;
                for (int i = 0; i < cliente.getCantidadCuentas(); i++) {
                    if (i != indiceComboBox) {
                       cmbCuentasUsuarioDestino.addItem(cliente.getTipoCuentas(i) + ": #" + String.valueOf(cliente.getCuenta(i)));
                    }
                }

                break;
            case 2:
                txtSaldoOrigen.setText(String.valueOf(frmt.format(cliente.getSaldo(1))));
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
                indiceComboBox = 1;
                for (int i = 0; i < cliente.getCantidadCuentas(); i++) {
                    if (i != indiceComboBox) {
                        cmbCuentasUsuarioDestino.addItem(cliente.getTipoCuentas(i) + ": #" + String.valueOf(cliente.getCuenta(i)));
                    }
                }
                break;
            case 3:
                txtSaldoOrigen.setText(String.valueOf(frmt.format(cliente.getSaldo(2))));
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
                indiceComboBox = 2;
                for (int i = 0; i < cliente.getCantidadCuentas(); i++) {
                    if (i != indiceComboBox) {
                        cmbCuentasUsuarioDestino.addItem(cliente.getTipoCuentas(i) + ": #" + String.valueOf(cliente.getCuenta(i)));
                    }
                }
                break;
            case 4:
                txtSaldoOrigen.setText(String.valueOf(frmt.format(cliente.getSaldo(3))));
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
                indiceComboBox = 3;
                for (int i = 0; i < cliente.getCantidadCuentas(); i++) {
                    if (i != indiceComboBox) {
                        cmbCuentasUsuarioDestino.addItem(cliente.getTipoCuentas(i) + ": #" + String.valueOf(cliente.getCuenta(i)));
                    }
                }
                break;
        }
    }
    /**
     * Valida la selección de la cuenta de origen.
     * @param evt El evento de acción.
     */
    private void btnValidar1ActionPerformed(java.awt.event.ActionEvent evt) {
        if(cmbCuentasUsuarioOrigen.getSelectedIndex()==0){
            txtError1.setVisible(true);
        }else{
            txtError1.setVisible(false);
            cmbCuentasUsuarioOrigen.setEnabled(false);
            btnValidar1.setEnabled(false);
            txtValorTransferencia.setVisible(true);
            txtSimboloDolar.setVisible(true);
            txtFieldDineroTransferencia.setVisible(true);
            btnValidar2.setVisible(true);
            txtFieldDineroTransferencia.setText("");
        }
    }
    /**
     * Valida el monto ingresado para la transferencia.
     * @param evt El evento de acción.
     */
    private void btnValidar2ActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            if(Float.parseFloat(txtFieldDineroTransferencia.getText())<=cliente.getSaldo(indiceComboBox)){
                txtFieldDineroTransferencia.setEnabled(false);
                btnValidar2.setEnabled(false);
                txtError2.setVisible(false);
                txtSubtituloDestino.setVisible(true);
                txtSeleccioneCuenta.setVisible(true);
                cmbCuentasUsuarioDestino.setVisible(true);
                btnValidar3.setVisible(true);
            }else{
                txtError2.setVisible(true);
            }
        }catch (NumberFormatException e){
            txtError2.setVisible(true);
        }
    }
    /**
     * Valida la selección de la cuenta de destino.
     * @param evt El evento de acción.
     */
    private void btnValidar3ActionPerformed(java.awt.event.ActionEvent evt) {
         if(cmbCuentasUsuarioDestino.getSelectedIndex()==0){
            txtError3.setText("*Campo Requerido");
            txtError3.setVisible(true);
        }else{
            txtError3.setVisible(false);
            cmbCuentasUsuarioDestino.setEnabled(false);
            btnValidar3.setEnabled(false);
            btnConfirmar.setVisible(true);
        }
    }
    /**
     * Confirma la transferencia y navega a la pantalla de confirmación.
     * @param evt El evento de clic del ratón.
     */
    private void btnConfirmarMousePressed(java.awt.event.MouseEvent evt) {
        switch (cmbCuentasUsuarioOrigen.getSelectedIndex()) {
            case 1:
                switch (cmbCuentasUsuarioDestino.getSelectedIndex()) {
                    case 1:
                        ConfirmacionPagos newframe = new ConfirmacionPagos(this.cliente, 0, 1,
                                Float.parseFloat(txtFieldDineroTransferencia.getText()));
                        newframe.setVisible(true);
                        dispose();
                        break;
                    case 2:
                        ConfirmacionPagos newframe1 = new ConfirmacionPagos(this.cliente, 0, 2,
                                Float.parseFloat(txtFieldDineroTransferencia.getText()));
                        newframe1.setVisible(true);
                        dispose();
                        break;
                    case 3:
                        ConfirmacionPagos newframe2 = new ConfirmacionPagos(this.cliente, 0, 3,
                                Float.parseFloat(txtFieldDineroTransferencia.getText()));
                        newframe2.setVisible(true);
                        dispose();
                        break;
                }
                break;
            case 2:
                switch (cmbCuentasUsuarioDestino.getSelectedIndex()) {
                    case 1:
                        ConfirmacionPagos newframe = new ConfirmacionPagos(this.cliente, 1, 0,
                                Float.parseFloat(txtFieldDineroTransferencia.getText()));
                        newframe.setVisible(true);
                        dispose();
                        break;
                    case 2:
                        ConfirmacionPagos newframe1 = new ConfirmacionPagos(this.cliente, 1, 2,
                                Float.parseFloat(txtFieldDineroTransferencia.getText()));
                        newframe1.setVisible(true);
                        dispose();
                        break;
                    case 3:
                        ConfirmacionPagos newframe2 = new ConfirmacionPagos(this.cliente, 1, 3,
                                Float.parseFloat(txtFieldDineroTransferencia.getText()));
                        newframe2.setVisible(true);
                        dispose();
                        break;
                }
                break;
            case 3:
                switch (cmbCuentasUsuarioDestino.getSelectedIndex()) {
                    case 1:
                        ConfirmacionPagos newframe = new ConfirmacionPagos(this.cliente, 2, 0,
                                Float.parseFloat(txtFieldDineroTransferencia.getText()));
                        newframe.setVisible(true);
                        dispose();
                        break;
                    case 2:
                        ConfirmacionPagos newframe1 = new ConfirmacionPagos(this.cliente, 2, 1,
                                Float.parseFloat(txtFieldDineroTransferencia.getText()));
                        newframe1.setVisible(true);
                        dispose();
                        break;
                    case 3:
                        ConfirmacionPagos newframe2 = new ConfirmacionPagos(this.cliente, 2, 3,
                                Float.parseFloat(txtFieldDineroTransferencia.getText()));
                        newframe2.setVisible(true);
                        dispose();
                        break;
                }
                break;
            case 4:
                switch (cmbCuentasUsuarioDestino.getSelectedIndex()) {
                    case 1:
                        ConfirmacionPagos newframe = new ConfirmacionPagos(this.cliente, 3, 0,
                                Float.parseFloat(txtFieldDineroTransferencia.getText()));
                        newframe.setVisible(true);
                        dispose();
                        break;
                    case 2:
                        ConfirmacionPagos newframe1 = new ConfirmacionPagos(this.cliente, 3, 1,
                                Float.parseFloat(txtFieldDineroTransferencia.getText()));
                        newframe1.setVisible(true);
                        dispose();
                        break;
                    case 3:
                        ConfirmacionPagos newframe2 = new ConfirmacionPagos(this.cliente, 3, 2,
                                Float.parseFloat(txtFieldDineroTransferencia.getText()));
                        newframe2.setVisible(true);
                        dispose();
                        break;
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
            java.util.logging.Logger.getLogger(TransferenciasCuentaCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransferenciasCuentaCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransferenciasCuentaCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransferenciasCuentaCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransferenciasCuentaCuenta(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnConfirmar;
    private javax.swing.JButton btnValidar1;
    private javax.swing.JButton btnValidar2;
    private javax.swing.JButton btnValidar3;
    private javax.swing.JPanel btnVolver;
    private javax.swing.JComboBox<String> cmbCuentasUsuarioDestino;
    private javax.swing.JComboBox<String> cmbCuentasUsuarioOrigen;
    private javax.swing.JLabel jLbanco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtConfirmar;
    private javax.swing.JLabel txtCuentaOrigen;
    private javax.swing.JLabel txtError1;
    private javax.swing.JLabel txtError2;
    private javax.swing.JLabel txtError3;
    private javax.swing.JTextField txtFieldDineroTransferencia;
    private javax.swing.JLabel txtSaldo;
    private javax.swing.JLabel txtSaldoOrigen;
    private javax.swing.JLabel txtSeleccioneCuenta;
    private javax.swing.JLabel txtSimboloDolar;
    private javax.swing.JLabel txtSubtituloDestino;
    private javax.swing.JLabel txtSubtituloResumen;
    private javax.swing.JLabel txtTituloTransferencia;
    private javax.swing.JLabel txtValorTransferencia;
    private javax.swing.JLabel txtVolver;
    // End of variables declaration//GEN-END:variables
}
