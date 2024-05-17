
package EscaleraSerpientes;

import javax.swing.JOptionPane;



public class Ventana extends javax.swing.JFrame {

    
    public Ventana() {
        initComponents();
       setLocationRelativeTo(null);
        
       this.cbJugadores.actionPerformed(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbtnDiez = new javax.swing.JButton();
        jbtnTrece = new javax.swing.JButton();
        jbtnQuince = new javax.swing.JButton();
        cbJugadores = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPrimer = new javax.swing.JTextField();
        txtSegundo = new javax.swing.JTextField();
        txtTercer = new javax.swing.JTextField();
        txtCuarto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbFicha1 = new javax.swing.JComboBox<>();
        cbFicha3 = new javax.swing.JComboBox<>();
        cbFicha2 = new javax.swing.JComboBox<>();
        cbFicha4 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INICIO");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("MENU DE INICIO");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("ELEGIR NÚMERO DE JUGADORES");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("ELEGIR TAMAÑO DEL TABLERO");

        jbtnDiez.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnDiez.setText("10 x 10");
        jbtnDiez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDiezActionPerformed(evt);
            }
        });

        jbtnTrece.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnTrece.setText("13 x 13");
        jbtnTrece.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTreceActionPerformed(evt);
            }
        });

        jbtnQuince.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnQuince.setText("15 x 15");
        jbtnQuince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnQuinceActionPerformed(evt);
            }
        });

        cbJugadores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbJugadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4" }));
        cbJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJugadoresActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("PRIMER JUGADOR");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("SEGUNDO JUGADOR");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("TERCER JUGADOR");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("CUARTO JUGADOR");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("FICHA ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("FICHA");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("FICHA");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("FICHA");

        cbFicha1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbFicha1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X", "O", "▲", "▬", " " }));
        cbFicha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFicha1ActionPerformed(evt);
            }
        });

        cbFicha3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbFicha3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X", "O", "▲", "▬", " " }));
        cbFicha3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFicha3ActionPerformed(evt);
            }
        });

        cbFicha2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbFicha2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X", "O", "▲", "▬", " " }));
        cbFicha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFicha2ActionPerformed(evt);
            }
        });

        cbFicha4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbFicha4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X", "O", "▲", "▬", " " }));
        cbFicha4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFicha4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(cbJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPrimer, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8)
                            .addComponent(cbFicha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSegundo))
                            .addComponent(jLabel9)
                            .addComponent(cbFicha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTercer))
                            .addComponent(jLabel10)
                            .addComponent(cbFicha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbFicha4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCuarto))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnDiez)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnTrece)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnQuince)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTercer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbFicha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbFicha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbFicha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbFicha4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnDiez)
                    .addComponent(jbtnTrece)
                    .addComponent(jbtnQuince))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJugadoresActionPerformed
       switch (this.cbJugadores.getSelectedIndex()) {
            case 0:
                this.cambiarJ3(false);
                this.cambiarJ4(false);
                break;
            case 1:
                this.cambiarJ3(true);
                this.cambiarJ4(false);
                break;
            case 2:
                this.cambiarJ3(true);
                this.cambiarJ4(true);
                break;
            default:
                break;
        }

    }

    private void cambiarJ3(boolean estado){
        this.jLabel8.setVisible(estado);
            this.jLabel10.setVisible(estado);
            this.txtTercer.setVisible(estado);
            this.jLabel6.setVisible(estado);
            this.cbFicha3.setVisible(estado);
    }
    private void cambiarJ4(boolean estado){
        this.jLabel9.setVisible(estado);
            this.jLabel11.setVisible(estado);
            this.txtCuarto.setVisible(estado);
            this.jLabel7.setVisible(estado);
            this.cbFicha4.setVisible(estado);
    
    }//GEN-LAST:event_cbJugadoresActionPerformed

    private void jbtnDiezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDiezActionPerformed
 
        String numeroJugadores = (String) cbJugadores.getSelectedItem();
        Jugador jugador1 =new Jugador();
        Jugador jugador2 =new Jugador();
        Jugador jugador3 =new Jugador();
        Jugador jugador4 =new Jugador();
        String ficha1="0", ficha2="0", ficha3="0", ficha4="0";

        switch(numeroJugadores){
            case "2": 
                 
                if(txtPrimer.getText().equals("")||txtSegundo.getText().equals("")){
                    JOptionPane.showMessageDialog(rootPane, "Debe asignar los nombres");
                   
                }else if(txtPrimer.getText().equals(txtSegundo.getText())){
                    JOptionPane.showMessageDialog(rootPane, "Los nombres no pueden ser iguales");
                    
                }else if(cbFicha1.getSelectedItem().equals(cbFicha2.getSelectedItem())){
                    JOptionPane.showMessageDialog(rootPane, "Las fichas no pueden ser iguales");
                    
                }else{
                    
                    jugador1.setNombre(txtPrimer.getText());
                    ficha1= (String) cbFicha1.getSelectedItem();
                    jugador1.setFicha(ficha1);
                    
                    jugador2.setNombre(txtSegundo.getText());
                    ficha2= (String) cbFicha2.getSelectedItem();
                    jugador2.setFicha(ficha2);
                    
                    Tablero10x10 juego =new Tablero10x10();
                    juego.setJugadores2(jugador1, jugador2);
                    dispose();
                    juego.setVisible(true);
                   
                }
                break;
            case "3":
                if(txtPrimer.getText().equals("")||txtSegundo.getText().equals("")||
                        txtTercer.getText().equals("")){
                    JOptionPane.showMessageDialog(rootPane, "Debe asignar los nombres");
                }else if(txtPrimer.getText().equals(txtSegundo.getText())||
                        txtPrimer.getText().equals(txtTercer.getText())||
                        txtSegundo.getText().equals(txtTercer.getText())){
                    JOptionPane.showMessageDialog(rootPane, "Los nombres no pueden ser iguales");
                }else if(cbFicha1.getSelectedItem().equals(cbFicha2.getSelectedItem())||
                        cbFicha1.getSelectedItem().equals(cbFicha4.getSelectedItem())||
                        cbFicha2.getSelectedItem().equals(cbFicha4.getSelectedItem())){
                    JOptionPane.showMessageDialog(rootPane, "Las fichas no pueden ser iguales");
                }else{
                    jugador1.setNombre(txtPrimer.getText());
                    ficha1= (String) cbFicha1.getSelectedItem();
                    jugador1.setFicha(ficha1);
                    
                    jugador2.setNombre(txtSegundo.getText()); 
                    ficha2= (String) cbFicha2.getSelectedItem();
                    jugador2.setFicha(ficha2);
                    
                    jugador3.setNombre(txtTercer.getText()); 
                    ficha3= (String) cbFicha4.getSelectedItem();
                    jugador3.setFicha(ficha3);
                    
                    Tablero10x10 juego =new Tablero10x10();
                    juego.setJugadores3(jugador1, jugador2, jugador3);
                    dispose();
                    juego.setVisible(true);
                
                }
                
                break;
            case "4":
                if(txtPrimer.getText().equals("")||txtSegundo.getText().equals("")||
                        txtTercer.getText().equals("")||txtCuarto.getText().equals("")){
                    JOptionPane.showMessageDialog(rootPane, "Debe asignar los nombres");
                }else if(txtPrimer.getText().equals(txtSegundo.getText())||
                        txtPrimer.getText().equals(txtTercer.getText())||
                        txtSegundo.getText().equals(txtTercer.getText())||
                        txtCuarto.getText().equals(txtPrimer.getText())||
                        txtCuarto.getText().equals(txtSegundo.getText())||
                        txtCuarto.getText().equals(txtTercer.getText())){
                    JOptionPane.showMessageDialog(rootPane, "Los nombres no pueden ser iguales");
                }else if(cbFicha1.getSelectedItem()==(cbFicha2.getSelectedItem())||
                        cbFicha1.getSelectedItem()==(cbFicha4.getSelectedItem())||
                        cbFicha2.getSelectedItem()==(cbFicha4.getSelectedItem())||
                        cbFicha4.getSelectedItem()==(cbFicha3.getSelectedItem())||
                        cbFicha3.getSelectedItem()==(cbFicha1.getSelectedItem())||
                        cbFicha3.getSelectedItem()==(cbFicha2.getSelectedItem())){
                    JOptionPane.showMessageDialog(rootPane, "Las fichas no pueden ser iguales");
                }else{
                    jugador1.setNombre(txtPrimer.getText()); 
                    ficha1= (String) cbFicha1.getSelectedItem();
                    jugador1.setFicha(ficha1);

                    jugador2.setNombre(txtSegundo.getText()); 
                    ficha2= (String) cbFicha2.getSelectedItem();
                    jugador2.setFicha(ficha2);

                    jugador3.setNombre(txtTercer.getText()); 
                    ficha3= (String) cbFicha3.getSelectedItem();
                    jugador3.setFicha(ficha3);

                    jugador4.setNombre(txtCuarto.getText()); 
                    ficha4= (String) cbFicha4.getSelectedItem();
                    jugador4.setFicha(ficha4);
                    
                    Tablero10x10 juego =new Tablero10x10();
                    juego.setJugadores4(jugador1, jugador2, jugador3, jugador4);
                    dispose();
                    juego.setVisible(true);
                }
                
                break;
                
        }                   

        

    }//GEN-LAST:event_jbtnDiezActionPerformed

    private void jbtnTreceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTreceActionPerformed
        String numeroJugadores = (String) cbJugadores.getSelectedItem();
        Jugador jugador1 =new Jugador();
        Jugador jugador2 =new Jugador();
        Jugador jugador3 =new Jugador();
        Jugador jugador4 =new Jugador();
        String ficha1="0", ficha2="0", ficha3="0", ficha4="0";

        switch(numeroJugadores){
            case "2": 
                 
                if(txtPrimer.getText().equals("")||txtSegundo.getText().equals("")){
                    JOptionPane.showMessageDialog(rootPane, "Debe asignar los nombres");
                   
                }else if(txtPrimer.getText().equals(txtSegundo.getText())){
                    JOptionPane.showMessageDialog(rootPane, "Los nombres no pueden ser iguales");
                    
                }else if(cbFicha1.getSelectedItem().equals(cbFicha2.getSelectedItem())){
                    JOptionPane.showMessageDialog(rootPane, "Las fichas no pueden ser iguales");
                    
                }else{
                    
                    jugador1.setNombre(txtPrimer.getText());
                    ficha1= (String) cbFicha1.getSelectedItem();
                    jugador1.setFicha(ficha1);
                    
                    jugador2.setNombre(txtSegundo.getText());
                    ficha2= (String) cbFicha2.getSelectedItem();
                    jugador2.setFicha(ficha2);
                    
                    Tablero13x13 juego =new Tablero13x13();
                    juego.setJugadores2(jugador1, jugador2);
                    dispose();
                    juego.setVisible(true);
                   
                }
                break;
            case "3":
                if(txtPrimer.getText().equals("")||txtSegundo.getText().equals("")||
                        txtTercer.getText().equals("")){
                    JOptionPane.showMessageDialog(rootPane, "Debe asignar los nombres");
                }else if(txtPrimer.getText().equals(txtSegundo.getText())||
                        txtPrimer.getText().equals(txtTercer.getText())||
                        txtSegundo.getText().equals(txtTercer.getText())){
                    JOptionPane.showMessageDialog(rootPane, "Los nombres no pueden ser iguales");
                }else if(cbFicha1.getSelectedItem().equals(cbFicha2.getSelectedItem())||
                        cbFicha1.getSelectedItem().equals(cbFicha4.getSelectedItem())||
                        cbFicha2.getSelectedItem().equals(cbFicha4.getSelectedItem())){
                    JOptionPane.showMessageDialog(rootPane, "Las fichas no pueden ser iguales");
                }else{
                    jugador1.setNombre(txtPrimer.getText());
                    ficha1= (String) cbFicha1.getSelectedItem();
                    jugador1.setFicha(ficha1);
                    
                    jugador2.setNombre(txtSegundo.getText()); 
                    ficha2= (String) cbFicha2.getSelectedItem();
                    jugador2.setFicha(ficha2);
                    
                    jugador3.setNombre(txtTercer.getText()); 
                    ficha3= (String) cbFicha4.getSelectedItem();
                    jugador3.setFicha(ficha3);
                    
                    Tablero13x13 juego =new Tablero13x13();
                    juego.setJugadores3(jugador1, jugador2, jugador3);
                    dispose();
                    juego.setVisible(true);
                
                }
                
                break;
            case "4":
                if(txtPrimer.getText().equals("")||txtSegundo.getText().equals("")||
                        txtTercer.getText().equals("")||txtCuarto.getText().equals("")){
                    JOptionPane.showMessageDialog(rootPane, "Debe asignar los nombres");
                }else if(txtPrimer.getText().equals(txtSegundo.getText())||
                        txtPrimer.getText().equals(txtTercer.getText())||
                        txtSegundo.getText().equals(txtTercer.getText())||
                        txtCuarto.getText().equals(txtPrimer.getText())||
                        txtCuarto.getText().equals(txtSegundo.getText())||
                        txtCuarto.getText().equals(txtTercer.getText())){
                    JOptionPane.showMessageDialog(rootPane, "Los nombres no pueden ser iguales");
                }else if(cbFicha1.getSelectedItem()==(cbFicha2.getSelectedItem())||
                        cbFicha1.getSelectedItem()==(cbFicha4.getSelectedItem())||
                        cbFicha2.getSelectedItem()==(cbFicha4.getSelectedItem())||
                        cbFicha4.getSelectedItem()==(cbFicha3.getSelectedItem())||
                        cbFicha3.getSelectedItem()==(cbFicha1.getSelectedItem())||
                        cbFicha3.getSelectedItem()==(cbFicha2.getSelectedItem())){
                    JOptionPane.showMessageDialog(rootPane, "Las fichas no pueden ser iguales");
                }else{
                    jugador1.setNombre(txtPrimer.getText()); 
                    ficha1= (String) cbFicha1.getSelectedItem();
                    jugador1.setFicha(ficha1);

                    jugador2.setNombre(txtSegundo.getText()); 
                    ficha2= (String) cbFicha2.getSelectedItem();
                    jugador2.setFicha(ficha2);

                    jugador3.setNombre(txtTercer.getText()); 
                    ficha3= (String) cbFicha3.getSelectedItem();
                    jugador3.setFicha(ficha3);

                    jugador4.setNombre(txtCuarto.getText()); 
                    ficha4= (String) cbFicha4.getSelectedItem();
                    jugador4.setFicha(ficha4);
                    
                    Tablero13x13 juego =new Tablero13x13();
                    juego.setJugadores4(jugador1, jugador2, jugador3, jugador4);
                    dispose();
                    juego.setVisible(true);
                }
                
                break;
                
        }     
    }//GEN-LAST:event_jbtnTreceActionPerformed

    private void cbFicha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFicha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFicha1ActionPerformed

    private void cbFicha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFicha2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFicha2ActionPerformed

    private void cbFicha3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFicha3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFicha3ActionPerformed

    private void cbFicha4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFicha4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFicha4ActionPerformed

    private void jbtnQuinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnQuinceActionPerformed
       String numeroJugadores = (String) cbJugadores.getSelectedItem();
        Jugador jugador1 =new Jugador();
        Jugador jugador2 =new Jugador();
        Jugador jugador3 =new Jugador();
        Jugador jugador4 =new Jugador();
        String ficha1="0", ficha2="0", ficha3="0", ficha4="0";

        switch(numeroJugadores){
            case "2": 
                 
                if(txtPrimer.getText().equals("")||txtSegundo.getText().equals("")){
                    JOptionPane.showMessageDialog(rootPane, "Debe asignar los nombres");
                   
                }else if(txtPrimer.getText().equals(txtSegundo.getText())){
                    JOptionPane.showMessageDialog(rootPane, "Los nombres no pueden ser iguales");
                    
                }else if(cbFicha1.getSelectedItem().equals(cbFicha2.getSelectedItem())){
                    JOptionPane.showMessageDialog(rootPane, "Las fichas no pueden ser iguales");
                    
                }else{
                    
                    jugador1.setNombre(txtPrimer.getText());
                    ficha1= (String) cbFicha1.getSelectedItem();
                    jugador1.setFicha(ficha1);
                    
                    jugador2.setNombre(txtSegundo.getText());
                    ficha2= (String) cbFicha2.getSelectedItem();
                    jugador2.setFicha(ficha2);
                    
                    Tablero15x15 juego =new Tablero15x15();
                    juego.setJugadores2(jugador1, jugador2);
                    dispose();
                    juego.setVisible(true);
                   
                }
                break;
            case "3":
                if(txtPrimer.getText().equals("")||txtSegundo.getText().equals("")||
                        txtTercer.getText().equals("")){
                    JOptionPane.showMessageDialog(rootPane, "Debe asignar los nombres");
                }else if(txtPrimer.getText().equals(txtSegundo.getText())||
                        txtPrimer.getText().equals(txtTercer.getText())||
                        txtSegundo.getText().equals(txtTercer.getText())){
                    JOptionPane.showMessageDialog(rootPane, "Los nombres no pueden ser iguales");
                }else if(cbFicha1.getSelectedItem().equals(cbFicha2.getSelectedItem())||
                        cbFicha1.getSelectedItem().equals(cbFicha4.getSelectedItem())||
                        cbFicha2.getSelectedItem().equals(cbFicha4.getSelectedItem())){
                    JOptionPane.showMessageDialog(rootPane, "Las fichas no pueden ser iguales");
                }else{
                    jugador1.setNombre(txtPrimer.getText());
                    ficha1= (String) cbFicha1.getSelectedItem();
                    jugador1.setFicha(ficha1);
                    
                    jugador2.setNombre(txtSegundo.getText()); 
                    ficha2= (String) cbFicha2.getSelectedItem();
                    jugador2.setFicha(ficha2);
                    
                    jugador3.setNombre(txtTercer.getText()); 
                    ficha3= (String) cbFicha4.getSelectedItem();
                    jugador3.setFicha(ficha3);
                    
                    Tablero15x15 juego =new Tablero15x15();
                    juego.setJugadores3(jugador1, jugador2, jugador3);
                    dispose();
                    juego.setVisible(true);
                
                }
                
                break;
            case "4":
                if(txtPrimer.getText().equals("")||txtSegundo.getText().equals("")||
                        txtTercer.getText().equals("")||txtCuarto.getText().equals("")){
                    JOptionPane.showMessageDialog(rootPane, "Debe asignar los nombres");
                }else if(txtPrimer.getText().equals(txtSegundo.getText())||
                        txtPrimer.getText().equals(txtTercer.getText())||
                        txtSegundo.getText().equals(txtTercer.getText())||
                        txtCuarto.getText().equals(txtPrimer.getText())||
                        txtCuarto.getText().equals(txtSegundo.getText())||
                        txtCuarto.getText().equals(txtTercer.getText())){
                    JOptionPane.showMessageDialog(rootPane, "Los nombres no pueden ser iguales");
                }else if(cbFicha1.getSelectedItem()==(cbFicha2.getSelectedItem())||
                        cbFicha1.getSelectedItem()==(cbFicha4.getSelectedItem())||
                        cbFicha2.getSelectedItem()==(cbFicha4.getSelectedItem())||
                        cbFicha4.getSelectedItem()==(cbFicha3.getSelectedItem())||
                        cbFicha3.getSelectedItem()==(cbFicha1.getSelectedItem())||
                        cbFicha3.getSelectedItem()==(cbFicha2.getSelectedItem())){
                    JOptionPane.showMessageDialog(rootPane, "Las fichas no pueden ser iguales");
                }else{
                    jugador1.setNombre(txtPrimer.getText()); 
                    ficha1= (String) cbFicha1.getSelectedItem();
                    jugador1.setFicha(ficha1);

                    jugador2.setNombre(txtSegundo.getText()); 
                    ficha2= (String) cbFicha2.getSelectedItem();
                    jugador2.setFicha(ficha2);

                    jugador3.setNombre(txtTercer.getText()); 
                    ficha3= (String) cbFicha3.getSelectedItem();
                    jugador3.setFicha(ficha3);

                    jugador4.setNombre(txtCuarto.getText()); 
                    ficha4= (String) cbFicha4.getSelectedItem();
                    jugador4.setFicha(ficha4);
                    
                    Tablero15x15 juego =new Tablero15x15();
                    juego.setJugadores4(jugador1, jugador2, jugador3, jugador4);
                    dispose();
                    juego.setVisible(true);
                }
                
                break;
                
        }     
    }//GEN-LAST:event_jbtnQuinceActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ButtonGroup;
    private javax.swing.JComboBox<String> cbFicha1;
    private javax.swing.JComboBox<String> cbFicha2;
    private javax.swing.JComboBox<String> cbFicha3;
    private javax.swing.JComboBox<String> cbFicha4;
    private javax.swing.JComboBox<String> cbJugadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnDiez;
    private javax.swing.JButton jbtnQuince;
    private javax.swing.JButton jbtnTrece;
    private javax.swing.JTextField txtCuarto;
    private javax.swing.JTextField txtPrimer;
    private javax.swing.JTextField txtSegundo;
    private javax.swing.JTextField txtTercer;
    // End of variables declaration//GEN-END:variables
}
