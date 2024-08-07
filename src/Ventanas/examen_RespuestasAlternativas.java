package Ventanas;

import Clases.Conexion;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

public class examen_RespuestasAlternativas extends javax.swing.JInternalFrame {
String R1,R2,R3,R4,R5;
    public examen_RespuestasAlternativas() {
        initComponents();    
        
        Calendar Calendario=Calendar.getInstance(); 
        labelFecha.setText(Integer.toString(Calendario.get(Calendar.DATE))+"/"+
                                    Integer.toString(Calendario.get(Calendar.MONTH)+1)+"/"+
                                    Integer.toString(Calendario.get(Calendar.YEAR)));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        txt_codigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        txt_PREG1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_PREG2 = new javax.swing.JTextField();
        txt_PREG3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_PREG4 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_PREG5 = new javax.swing.JTextField();
        Boton_Buscar = new javax.swing.JButton();
        txt_alternativa1 = new javax.swing.JRadioButton();
        txt_alternativa2 = new javax.swing.JRadioButton();
        txt_alternativa3 = new javax.swing.JRadioButton();
        txt_alternativa4 = new javax.swing.JRadioButton();
        txt_alternativa5 = new javax.swing.JRadioButton();
        txt_alternativa6 = new javax.swing.JRadioButton();
        txt_alternativa7 = new javax.swing.JRadioButton();
        txt_alternativa8 = new javax.swing.JRadioButton();
        txt_alternativa9 = new javax.swing.JRadioButton();
        txt_alternativa10 = new javax.swing.JRadioButton();
        txt_alternativa11 = new javax.swing.JRadioButton();
        txt_alternativa12 = new javax.swing.JRadioButton();
        txt_alternativa13 = new javax.swing.JRadioButton();
        txt_alternativa14 = new javax.swing.JRadioButton();
        txt_alternativa15 = new javax.swing.JRadioButton();
        botonEviarRespuestas = new javax.swing.JButton();
        labelTipo = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txt_nombre1 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txt_apellidos1 = new javax.swing.JTextField();
        txt_dni1 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        labelFecha1 = new javax.swing.JLabel();
        label_nota = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        txt_codigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Pregunta 01:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Descripcion:");

        txt_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_descripcionKeyTyped(evt);
            }
        });

        txt_PREG1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PREG1KeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Respuesta de  Examen Con alternativas");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Pregunta 02:");

        txt_PREG2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PREG2KeyTyped(evt);
            }
        });

        txt_PREG3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PREG3KeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Pregunta 03:");

        txt_PREG4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PREG4KeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Pregunta 04:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Pregunta 05:");

        txt_PREG5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PREG5KeyTyped(evt);
            }
        });

        Boton_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        Boton_Buscar.setText("Buscar");
        Boton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_BuscarActionPerformed(evt);
            }
        });

        buttonGroup1.add(txt_alternativa1);

        buttonGroup1.add(txt_alternativa2);

        buttonGroup1.add(txt_alternativa3);

        buttonGroup2.add(txt_alternativa4);

        buttonGroup2.add(txt_alternativa5);

        buttonGroup2.add(txt_alternativa6);

        buttonGroup3.add(txt_alternativa7);

        buttonGroup3.add(txt_alternativa8);

        buttonGroup3.add(txt_alternativa9);

        buttonGroup4.add(txt_alternativa10);

        buttonGroup4.add(txt_alternativa11);

        buttonGroup4.add(txt_alternativa12);

        buttonGroup5.add(txt_alternativa13);

        buttonGroup5.add(txt_alternativa14);

        buttonGroup5.add(txt_alternativa15);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 1054, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel22))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(10, 10, 10)
                                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Boton_Buscar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_PREG1, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_PREG2, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_PREG3, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_PREG4, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_PREG5, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(txt_alternativa1)
                        .addGap(91, 91, 91)
                        .addComponent(txt_alternativa2)
                        .addGap(91, 91, 91)
                        .addComponent(txt_alternativa3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(txt_alternativa4)
                        .addGap(91, 91, 91)
                        .addComponent(txt_alternativa5)
                        .addGap(91, 91, 91)
                        .addComponent(txt_alternativa6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(txt_alternativa7)
                        .addGap(93, 93, 93)
                        .addComponent(txt_alternativa8)
                        .addGap(89, 89, 89)
                        .addComponent(txt_alternativa9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(txt_alternativa10)
                        .addGap(93, 93, 93)
                        .addComponent(txt_alternativa11)
                        .addGap(95, 95, 95)
                        .addComponent(txt_alternativa12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(txt_alternativa13)
                        .addGap(96, 96, 96)
                        .addComponent(txt_alternativa14)
                        .addGap(93, 93, 93)
                        .addComponent(txt_alternativa15)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Boton_Buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_PREG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_alternativa1)
                            .addComponent(txt_alternativa2)
                            .addComponent(txt_alternativa3)))
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_PREG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_alternativa4)
                    .addComponent(txt_alternativa5)
                    .addComponent(txt_alternativa6))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_PREG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_alternativa8)
                    .addComponent(txt_alternativa9)
                    .addComponent(txt_alternativa7))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_PREG4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_alternativa12)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_alternativa10)
                        .addComponent(txt_alternativa11)))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_PREG5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_alternativa14)
                    .addComponent(txt_alternativa15)
                    .addComponent(txt_alternativa13))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        botonEviarRespuestas.setText("Enviar Respuestas");
        botonEviarRespuestas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEviarRespuestasActionPerformed(evt);
            }
        });

        labelTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelTipo.setForeground(new java.awt.Color(153, 0, 0));
        labelTipo.setText("Modelo");

        jLabel29.setText("Tipo:");

        labelFecha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(153, 0, 0));

        jLabel30.setText("Fecha:");

        jLabel31.setText("Nombre:");

        jLabel32.setText("Apellido:");

        jLabel33.setText("Dni:");

        jLabel36.setText("Dni:");

        txt_nombre1.setBorder(null);

        jLabel35.setText("Apellido:");

        txt_apellidos1.setBorder(null);

        txt_dni1.setBorder(null);

        jLabel34.setText("Nombre:");

        labelFecha1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelFecha1.setForeground(new java.awt.Color(153, 0, 0));

        label_nota.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        label_nota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_dni1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_apellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(labelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(101, 101, 101)
                .addComponent(botonEviarRespuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_nota, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(500, 500, 500)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)))
                    .addContainerGap(720, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel36)
                                    .addComponent(txt_dni1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel34)
                                    .addComponent(txt_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel35)
                                .addComponent(txt_apellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(botonEviarRespuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_nota, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(230, 230, 230)
                    .addComponent(jLabel33)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel31)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel32)
                    .addContainerGap(245, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_PREG1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PREG1KeyTyped
       // ingresar maximo 2 caracteres
        if(txt_PREG1.getText().length()>=200){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }

    }//GEN-LAST:event_txt_PREG1KeyTyped

    private void txt_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyTyped
       // ingresar maximo 8 caracteres
        if(txt_codigo.getText().length()>=8){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_txt_codigoKeyTyped

    private void txt_descripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_descripcionKeyTyped
        // TODO add your handling code here:  
        if(txt_descripcion.getText().length()>=50){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_txt_descripcionKeyTyped

    private void botonEviarRespuestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEviarRespuestasActionPerformed


    String Codigo ,Descripcion,Pregunta1,Pregunta2,Pregunta3,Pregunta4,Pregunta5,
           Alternativa11,Alternativa12,Alternativa13,Respuesta1,
           Alternativa21,Alternativa22,Alternativa23,Respuesta2,
           Alternativa31,Alternativa32,Alternativa33,Respuesta3,
           Alternativa41,Alternativa42,Alternativa43,Respuesta4,
           Alternativa51,Alternativa52,Alternativa53,Respuesta5;
    int  contador=0;
     
    // recuperadmos datos de los jtextfield
    Codigo      =txt_codigo.getText().trim();//.toUpperCase();;
    Descripcion   =txt_descripcion.getText().trim();
        if(Codigo.equals("")||Descripcion.equals(""))
    {
        JOptionPane.showMessageDialog(null,"Ingrese código/ Descripción");
        contador++;
    }
    
    Pregunta1 =txt_PREG1.getText().trim();
    Alternativa11=txt_alternativa1.getText().trim();
    Alternativa12=txt_alternativa2.getText().trim();
    Alternativa13=txt_alternativa3.getText().trim();
    if(Pregunta1.equals("")||Alternativa11.equals("")||Alternativa12.equals("")||Alternativa13.equals(""))
    {
        JOptionPane.showMessageDialog(null,"Ingrese todos los campos de la Pregunta 01");
        contador++;
    }
    
    Pregunta2 =txt_PREG2.getText().trim();
    Alternativa21=txt_alternativa4.getText().trim();
    Alternativa22=txt_alternativa5.getText().trim();
    Alternativa23=txt_alternativa6.getText().trim();
    if(Pregunta2.equals("")||Alternativa21.equals("")||Alternativa22.equals("")||Alternativa23.equals(""))
    {
        JOptionPane.showMessageDialog(null,"Ingrese todos los campos de la Pregunta 02");
        contador++;
    }    
    
    Pregunta3 =txt_PREG3.getText().trim();
    Alternativa31=txt_alternativa7.getText().trim();
    Alternativa32=txt_alternativa8.getText().trim();
    Alternativa33=txt_alternativa9.getText().trim();
        if(Pregunta3.equals("")||Alternativa31.equals("")||Alternativa32.equals("")||Alternativa33.equals(""))
    {
        JOptionPane.showMessageDialog(null,"Ingrese todos los campos de la Pregunta 03");
        contador++;
    }
    
    Pregunta4 =txt_PREG4.getText().trim();
    Alternativa41=txt_alternativa10.getText().trim();
    Alternativa42=txt_alternativa11.getText().trim();
    Alternativa43=txt_alternativa12.getText().trim(); 
        if(Pregunta4.equals("")||Alternativa41.equals("")||Alternativa42.equals("")||Alternativa43.equals(""))
    {
        JOptionPane.showMessageDialog(null,"Ingrese todos los campos de la Pregunta 04");
        contador++;
    }
    
    Pregunta5 =txt_PREG5.getText().trim();
    Alternativa51=txt_alternativa13.getText().trim();
    Alternativa52=txt_alternativa14.getText().trim();
    Alternativa53=txt_alternativa15.getText().trim();
        if(Pregunta5.equals("")||Alternativa51.equals("")||Alternativa52.equals("")||Alternativa53.equals(""))
    {
        JOptionPane.showMessageDialog(null,"Ingrese todos los campos de la Pregunta 05");
        contador++;
    }
        
        String dni=txt_dni1.getText().trim();
        String nombre=txt_nombre1.getText().trim();
        String apellidos=txt_apellidos1.getText().trim();
        
       if(dni.equals("")||nombre.equals("")||apellidos.equals(""))
    {
        JOptionPane.showMessageDialog(null,"Ingrese datos personales");
        contador++;
    }
   String Respuesta01=null,Respuesta02=null,Respuesta03 = null,Respuesta04 = null,Respuesta05 = null;
   
  if(txt_alternativa1.isSelected()){ 
    Respuesta01=txt_alternativa1.getText().trim();
    }
  if(txt_alternativa2.isSelected()){
    Respuesta01=txt_alternativa2.getText().trim();
    }
  if(txt_alternativa3.isSelected()){
    Respuesta01=txt_alternativa3.getText().trim();
    }

    if(txt_alternativa4.isSelected()){ 
    Respuesta02=txt_alternativa4.getText().trim();
    }
  if(txt_alternativa5.isSelected()){
    Respuesta02=txt_alternativa5.getText().trim();
    }
  if(txt_alternativa6.isSelected()){
    Respuesta02=txt_alternativa6.getText().trim();
    }
  
      if(txt_alternativa7.isSelected()){ 
    Respuesta03=txt_alternativa7.getText().trim();
    }
  if(txt_alternativa8.isSelected()){
    Respuesta03=txt_alternativa8.getText().trim();
    }
  if(txt_alternativa9.isSelected()){
    Respuesta03=txt_alternativa9.getText().trim();
    }
  
      if(txt_alternativa10.isSelected()){ 
    Respuesta04=txt_alternativa10.getText().trim();
    }
  if(txt_alternativa11.isSelected()){
    Respuesta04=txt_alternativa11.getText().trim();
    }
  if(txt_alternativa12.isSelected()){
    Respuesta04=txt_alternativa12.getText().trim();
    }
  
      if(txt_alternativa13.isSelected()){ 
    Respuesta05=txt_alternativa13.getText().trim();
    }
  if(txt_alternativa14.isSelected()){
    Respuesta05=txt_alternativa14.getText().trim();
    }
  if(txt_alternativa15.isSelected()){
    Respuesta05=txt_alternativa15.getText().trim();
    }
        System.out.println("respuesta1:"+Respuesta01);
        System.out.println("respuesta2:"+Respuesta02);
        System.out.println("respuesta3:"+Respuesta03);
        System.out.println("respuesta4:"+Respuesta04);
        System.out.println("respuesta5:"+Respuesta05);
     if(Respuesta01.equals("")||Respuesta02.equals("")||Respuesta03.equals("")||Respuesta04.equals("")||Respuesta05.equals(""))
     {
       JOptionPane.showMessageDialog(null,"seleciones respuesta");
        contador++;
     }
        
        if(contador==0)
        {  // pregusntar si se desea guardar la actualizacion
      
            try
            {
             String validardni="", nombre1="", apellidos1="", nota1="";
             Connection cn1= Conexion.Conectar();
             PreparedStatement pst1= cn1.prepareStatement("select Nota,Dni,Nombre,Apellidos from tabla_examen_alternativas where Codigo='"+Codigo+"' and Dni='"+dni+"'");
                ResultSet resul1=pst1.executeQuery();
                if(resul1.next())
                {
                    validardni=resul1.getString("Dni");
                    nombre1=resul1.getString("Nombre");
                    apellidos1=resul1.getString("Apellidos");
                    nota1=resul1.getString("Nota");
                    // validamos que el dni o se repita
                    if (dni.equals(validardni))
                    {
                        JOptionPane.showMessageDialog(null, "Examen ya realizado \n "
                                                        + "- Nombre    :"+nombre1+"\n"+
                                                          "- Apellidos :"+apellidos1+"\n"+
                                                          "- Nota      :"+nota1+"\n");
                        label_nota.setText("Nota: "+nota1);
                    }
                }else{
        int mensaje=JOptionPane.showConfirmDialog(null,"Guardar examen ",null,JOptionPane.YES_NO_OPTION);
        if(mensaje==JOptionPane.YES_OPTION)
        {
            try
                     {
                      Connection cn=Conexion.Conectar();
                      PreparedStatement pst= cn.prepareStatement("insert into tabla_examen_alternativas values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                      pst.setInt(1,0);
                      pst.setString(2,Codigo);
                      pst.setString(3,Descripcion);
                      
                      pst.setString(4,Pregunta1 );
                      pst.setString(5,Alternativa11 );
                      pst.setString(6,Alternativa12 );
                      pst.setString(7,Alternativa13 );
                      pst.setString(8,Respuesta01 );
                                            
                      pst.setString(9,Pregunta2 );
                      pst.setString(10,Alternativa21 );
                      pst.setString(11,Alternativa22 );
                      pst.setString(12,Alternativa23 );
                      pst.setString(13,Respuesta02 );
                             
                      pst.setString(14,Pregunta3 );
                      pst.setString(15,Alternativa31 );
                      pst.setString(16,Alternativa32 );
                      pst.setString(17,Alternativa33 );
                      pst.setString(18,Respuesta03 );
                              
                      pst.setString(19,Pregunta4 );
                      pst.setString(20,Alternativa41 );
                      pst.setString(21,Alternativa42 );
                      pst.setString(22,Alternativa43 );
                      pst.setString(23,Respuesta04 );
                              
                      pst.setString(24,Pregunta5 );
                      pst.setString(25,Alternativa51 );
                      pst.setString(26,Alternativa52 );
                      pst.setString(27,Alternativa53 );
                      pst.setString(28,Respuesta05 );
                      
                      
                      pst.setString(29,labelTipo.getText().trim() );
                      pst.setString(30,labelFecha.getText().trim() );
                      pst.setString(31,dni);
                      pst.setString(32, nombre);
                      pst.setString(33,apellidos);
                      int nota=0;
                      if(Respuesta01.equalsIgnoreCase(R1)){nota++;}
                      if(Respuesta02.equalsIgnoreCase(R2)){nota++;}
                      if(Respuesta03.equalsIgnoreCase(R3)){nota++;}
                      if(Respuesta04.equalsIgnoreCase(R4)){nota++;}
                      if(Respuesta05.equalsIgnoreCase(R5)){nota++;}
                      int notaMostrar=nota*4;
                      pst.setInt(34,notaMostrar);
                      if(notaMostrar<=10){
                      label_nota.setText(String.valueOf(notaMostrar));
                      label_nota.setForeground(Color.red);}
                      else{
                      label_nota.setText(String.valueOf(notaMostrar));
                      label_nota.setForeground(Color.GREEN);}
                      pst.executeUpdate();
                      cn.close();
                JOptionPane.showConfirmDialog(null,"Respuestas Registradas Exitosamente");
                botonEviarRespuestas.setEnabled(true);
                        } catch (Exception e)
                        {
                            JOptionPane.showMessageDialog(null, "Error al registrar Respuestas \n contacte al Administrador","",JOptionPane.WARNING_MESSAGE);
                            System.err.println("error al registrar nuevas respuestas: "+e);
                        }
                    }else
             {// si no se desea gabra nuevo producto
                 JOptionPane.showMessageDialog(null, "REGISTRO CANCELADO");
                  }
                }

            }catch (SQLException ex) {}
        }

    }//GEN-LAST:event_botonEviarRespuestasActionPerformed

    private void txt_PREG2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PREG2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PREG2KeyTyped

    private void txt_PREG3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PREG3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PREG3KeyTyped

    private void txt_PREG4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PREG4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PREG4KeyTyped

    private void txt_PREG5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PREG5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PREG5KeyTyped

    private void Boton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_BuscarActionPerformed
        int contador=0;
        String codigo=txt_codigo.getText().trim();
        if(codigo.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Ingreso código de  examen");
            contador++;

        }

        if(contador==0)
        {
            try {
                Connection cn= Conexion.Conectar();
                PreparedStatement pst=cn.prepareStatement("select *from tabla_examen_alternativas where Codigo='"+codigo+"' and Tipo='Modelo'");
                ResultSet rs= pst.executeQuery();
                if(rs.next())
                {
                    txt_descripcion.setText(rs.getString("Descripcion"));
                    txt_PREG1.setText(rs.getString("Pregunta1"));
                    txt_alternativa1.setText(rs.getString("Alternativa11"));
                    txt_alternativa2.setText(rs.getString("Alternativa12"));
                    txt_alternativa3.setText(rs.getString("Alternativa13"));
                    
                    txt_PREG2.setText(rs.getString("Pregunta2"));
                    txt_alternativa4.setText(rs.getString("Alternativa21"));
                    txt_alternativa5.setText(rs.getString("Alternativa22"));
                    txt_alternativa6.setText(rs.getString("Alternativa23"));
                    
                    txt_PREG3.setText(rs.getString("Pregunta3"));
                    txt_alternativa7.setText(rs.getString("Alternativa31"));
                    txt_alternativa8.setText(rs.getString("Alternativa32"));
                    txt_alternativa9.setText(rs.getString("Alternativa33"));
                    
                    txt_PREG4.setText(rs.getString("Pregunta4"));
                    txt_alternativa10.setText(rs.getString("Alternativa41"));
                    txt_alternativa11.setText(rs.getString("Alternativa42"));
                    txt_alternativa12.setText(rs.getString("Alternativa43"));
                    
                    txt_PREG5.setText(rs.getString("Pregunta5"));
                    txt_alternativa13.setText(rs.getString("Alternativa51"));
                    txt_alternativa14.setText(rs.getString("Alternativa52"));
                    txt_alternativa15.setText(rs.getString("Alternativa53"));
                    
                    R1=rs.getString("Respuesta1");
                    R2=rs.getString("Respuesta2");
                    R3=rs.getString("Respuesta3");
                    R4=rs.getString("Respuesta4");
                    R5=rs.getString("Respuesta5");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"No se encontro examen con el código "+codigo);
                }
                cn.close();

            } catch (Exception e) {JOptionPane.showMessageDialog(null,"Error al recuprar preguntas del exmane V/F");
                System.err.println("error, al recuperar preguntas V/F:"+e);}
        }
    }//GEN-LAST:event_Boton_BuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Buscar;
    private javax.swing.JButton botonEviarRespuestas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelFecha1;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JLabel label_nota;
    private javax.swing.JTextField txt_PREG1;
    private javax.swing.JTextField txt_PREG2;
    private javax.swing.JTextField txt_PREG3;
    private javax.swing.JTextField txt_PREG4;
    private javax.swing.JTextField txt_PREG5;
    private javax.swing.JRadioButton txt_alternativa1;
    private javax.swing.JRadioButton txt_alternativa10;
    private javax.swing.JRadioButton txt_alternativa11;
    private javax.swing.JRadioButton txt_alternativa12;
    private javax.swing.JRadioButton txt_alternativa13;
    private javax.swing.JRadioButton txt_alternativa14;
    private javax.swing.JRadioButton txt_alternativa15;
    private javax.swing.JRadioButton txt_alternativa2;
    private javax.swing.JRadioButton txt_alternativa3;
    private javax.swing.JRadioButton txt_alternativa4;
    private javax.swing.JRadioButton txt_alternativa5;
    private javax.swing.JRadioButton txt_alternativa6;
    private javax.swing.JRadioButton txt_alternativa7;
    private javax.swing.JRadioButton txt_alternativa8;
    private javax.swing.JRadioButton txt_alternativa9;
    private javax.swing.JTextField txt_apellidos1;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_dni1;
    private javax.swing.JTextField txt_nombre1;
    // End of variables declaration//GEN-END:variables

    
    public void LimpiarCampos()
    {
     txt_PREG1.setText("");
     txt_PREG2.setText("");
     txt_PREG3.setText("");
     txt_PREG4.setText("");
     txt_PREG5.setText("");
     txt_codigo.setText("");
     txt_descripcion.setText("");
     
    R1="";
    R2="";
    R3="";
    R4="";
    R5="";
     
     txt_alternativa1.setText("");
     txt_alternativa2.setText("");
     txt_alternativa3.setText("");
     
     txt_alternativa4.setText("");
     txt_alternativa5.setText("");
     txt_alternativa6.setText("");
     
     txt_alternativa7.setText("");
     txt_alternativa8.setText("");
     txt_alternativa9.setText("");
     
     txt_alternativa10.setText("");
     txt_alternativa11.setText("");
     txt_alternativa12.setText("");
     
     txt_alternativa13.setText("");
     txt_alternativa14.setText("");
     txt_alternativa15.setText("");
     
     
    }
}
