package Ventanas;

import Clases.Conexion;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class examen_Respuesta_RespustaLibre1 extends javax.swing.JInternalFrame {

    public examen_Respuesta_RespustaLibre1() {
        initComponents();
        
                Calendar Calendario=Calendar.getInstance(); 
        labelFecha.setText(Integer.toString(Calendario.get(Calendar.DATE))+"/"+
                                    Integer.toString(Calendario.get(Calendar.MONTH)+1)+"/"+
                                    Integer.toString(Calendario.get(Calendar.YEAR)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        txt_codigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        txt_PREG1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_PREG2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_PREG3 = new javax.swing.JTextField();
        txt_PREG4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_PREG5 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_respu2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_respu1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_respu3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txt_respu4 = new javax.swing.JTextArea();
        Boton_Buscar = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        txt_respu5 = new javax.swing.JTextArea();
        Boton_EnviarExamen = new javax.swing.JButton();
        label_nota = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        labelTipo = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_dni = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

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

        txt_descripcion.setBackground(new java.awt.Color(204, 204, 255));
        txt_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_descripcionKeyTyped(evt);
            }
        });

        txt_PREG1.setBackground(new java.awt.Color(204, 204, 255));
        txt_PREG1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PREG1KeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Pregunta 02:");

        txt_PREG2.setBackground(new java.awt.Color(204, 204, 255));
        txt_PREG2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PREG2KeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Pregunta 03:");

        txt_PREG3.setBackground(new java.awt.Color(204, 204, 255));
        txt_PREG3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PREG3KeyTyped(evt);
            }
        });

        txt_PREG4.setBackground(new java.awt.Color(204, 204, 255));
        txt_PREG4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PREG4KeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Pregunta 04:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Pregunta 05:");

        txt_PREG5.setEditable(false);
        txt_PREG5.setBackground(new java.awt.Color(255, 255, 255));
        txt_PREG5.setEnabled(false);
        txt_PREG5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PREG5KeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Respuestas de Examen con Respuestas Libres");

        txt_respu2.setColumns(20);
        txt_respu2.setRows(5);
        jScrollPane1.setViewportView(txt_respu2);

        txt_respu1.setColumns(20);
        txt_respu1.setRows(5);
        jScrollPane2.setViewportView(txt_respu1);

        txt_respu3.setColumns(20);
        txt_respu3.setRows(5);
        jScrollPane4.setViewportView(txt_respu3);

        txt_respu4.setColumns(20);
        txt_respu4.setRows(5);
        jScrollPane5.setViewportView(txt_respu4);

        Boton_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        Boton_Buscar.setText("Buscar");
        Boton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_BuscarActionPerformed(evt);
            }
        });

        txt_respu5.setColumns(20);
        txt_respu5.setRows(5);
        jScrollPane6.setViewportView(txt_respu5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1191, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 1171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(6, 6, 6)
                            .addComponent(txt_PREG1, javax.swing.GroupLayout.PREFERRED_SIZE, 1093, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(6, 6, 6)
                            .addComponent(txt_PREG2, javax.swing.GroupLayout.PREFERRED_SIZE, 1093, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(6, 6, 6)
                            .addComponent(txt_PREG3, javax.swing.GroupLayout.PREFERRED_SIZE, 1093, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(6, 6, 6)
                            .addComponent(txt_PREG4, javax.swing.GroupLayout.PREFERRED_SIZE, 1093, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(6, 6, 6)
                            .addComponent(txt_PREG5, javax.swing.GroupLayout.PREFERRED_SIZE, 1093, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4)
                                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(Boton_Buscar)
                                    .addGap(441, 441, 441)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4)
                                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1073, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1073, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1081, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1073, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1073, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 1, Short.MAX_VALUE)
                    .addComponent(jLabel16)
                    .addGap(3, 3, 3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Boton_Buscar)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(11, 11, 11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel2))
                        .addComponent(txt_PREG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel4))
                        .addComponent(txt_PREG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel6))
                        .addComponent(txt_PREG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(11, 11, 11)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel10))
                        .addComponent(txt_PREG4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(8, 8, 8)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addComponent(txt_PREG5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 99, Short.MAX_VALUE)))
        );

        jScrollPane3.setViewportView(jPanel1);

        Boton_EnviarExamen.setText("Enviar Examen");
        Boton_EnviarExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EnviarExamenActionPerformed(evt);
            }
        });

        label_nota.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        label_nota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel17.setText("Tipo:");

        labelTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelTipo.setForeground(new java.awt.Color(153, 0, 0));
        labelTipo.setText("Examen");

        jLabel18.setText("Fecha:");

        labelFecha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(153, 0, 0));

        txt_apellidos.setBorder(null);

        txt_nombre.setBorder(null);

        txt_dni.setBorder(null);

        jLabel15.setText("Dni:");

        jLabel13.setText("Nombre:");

        jLabel14.setText("Apellido:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1210, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(Boton_EnviarExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(label_nota, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel13)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Boton_EnviarExamen))
                    .addComponent(label_nota, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
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

    private void txt_PREG2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PREG2KeyTyped
        if(txt_PREG2.getText().length()>=200){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_PREG2KeyTyped

    private void txt_PREG3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PREG3KeyTyped
if(txt_PREG3.getText().length()>=200){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
        }    }//GEN-LAST:event_txt_PREG3KeyTyped

    private void txt_PREG4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PREG4KeyTyped
if(txt_PREG4.getText().length()>=200){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
        }    }//GEN-LAST:event_txt_PREG4KeyTyped

    private void txt_PREG5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PREG5KeyTyped
if(txt_PREG5.getText().length()>=200){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_PREG5KeyTyped

    private void txt_descripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_descripcionKeyTyped
        // TODO add your handling code here:  
        if(txt_descripcion.getText().length()>=50){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_txt_descripcionKeyTyped

    private void Boton_EnviarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EnviarExamenActionPerformed


    String Codigo ,Descripcion,Pregunta1,Pregunta2,Pregunta3,Pregunta4,Pregunta5, Respuesta1,Respuesta2,Respuesta3,Respuesta4,Respuesta5;
    int  contador=0;
     
    // recuperadmos datos de los jtextfield
    Codigo      =txt_codigo.getText().trim();//.toUpperCase();;
    Descripcion   =txt_descripcion.getText().trim();
    Pregunta1 =txt_PREG1.getText().trim();
    Pregunta2 =txt_PREG2.getText().trim();
    Pregunta3 =txt_PREG3.getText().trim();
    Pregunta4 =txt_PREG4.getText().trim();
    Pregunta5 =txt_PREG5.getText().trim();
    
    Respuesta1=txt_respu1.getText().trim();
    Respuesta2=txt_respu2.getText().trim();
    Respuesta3=txt_respu3.getText().trim();
    Respuesta4=txt_respu4.getText().trim();
    Respuesta5=txt_respu5.getText().trim();
    
    String dni=txt_dni.getText().trim();
    String Nombre=txt_nombre.getText().trim();
    String apellidos=txt_apellidos.getText().trim();
    String fecha=labelFecha.getText().trim();
    String tipo=labelTipo.getText().trim();
    
         if(Respuesta1.equals("")||Respuesta2.equals("")||Respuesta3.equals("")||Respuesta4.equals("")||Respuesta5.equals(""))
    {
        JOptionPane.showMessageDialog(null,"Complete todas las respuesta");
        contador++;
    }
        if(contador==0)
        {  // pregusntar si se desea guardar la actualizacion
      
            try
            {
             String validardni="", nombre1="", apellidos1="", nota1="";
             Connection cn1= Conexion.Conectar();
             PreparedStatement pst1= cn1.prepareStatement("select Nota,Dni,Nombre,Apellidos from tabla_examen_respuestalibre where Codigo='"+Codigo+"' and Dni='"+dni+"'");
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
        int mensaje=JOptionPane.showConfirmDialog(null,"Guardar Respuestas ",null,JOptionPane.YES_NO_OPTION);
        if(mensaje==JOptionPane.YES_OPTION)
        {
                     try
                     {
                      Connection cn=Conexion.Conectar();
                      PreparedStatement pst= cn.prepareStatement("insert into tabla_examen_respuestalibre values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                      pst.setInt(1,0);
                      pst.setString(2,Codigo);
                      pst.setString(3,Descripcion);
                      pst.setString(4,Pregunta1 );
                      pst.setString(5,Respuesta1);
                      pst.setString(6,Pregunta2 );
                      pst.setString(7,Respuesta2);
                      pst.setString(8,Pregunta3 );
                      pst.setString(9,Respuesta3);
                      pst.setString(10,Pregunta4);
                      pst.setString(11,Respuesta4);
                      pst.setString(12,Pregunta5);
                      pst.setString(13,Respuesta5);
                      pst.setString(14,tipo);
                      pst.setString(15,fecha);
                      pst.setString(16,dni);
                      pst.setString(17,Nombre);
                      pst.setString(18,apellidos);
                      pst.setString(19,"");
                      pst.executeUpdate();
                      cn.close();
                      
                      JOptionPane.showMessageDialog(null,"Respuestas Registradas exitosamente");
                      
                     Boton_EnviarExamen.setEnabled(false);
                     } catch (Exception e)
                        {
                            JOptionPane.showMessageDialog(null, "Error al registrar Respuestas \n contacte al Administrador","",JOptionPane.WARNING_MESSAGE);
                            System.err.println("error al registrar  Respuesta del examens: "+e);
                        }
                    }else
             {// si no se desea gabra nuevo producto
                 JOptionPane.showMessageDialog(null, "Canelado...");
                  }
                }

            }catch (SQLException ex) {}
        }

    }//GEN-LAST:event_Boton_EnviarExamenActionPerformed

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
            PreparedStatement pst=cn.prepareStatement("select *from tabla_examen_respuestalibre where Codigo='"+codigo+"' and Tipo='Modelo'");
            ResultSet rs= pst.executeQuery();
            if(rs.next())
            {
                txt_descripcion.setText(rs.getString("Descripcion"));
                txt_PREG1.setText(rs.getString("Pregunta1"));
                txt_PREG2.setText(rs.getString("Pregunta2"));
                txt_PREG3.setText(rs.getString("Pregunta3"));
                txt_PREG4.setText(rs.getString("Pregunta4"));
                txt_PREG5.setText(rs.getString("Pregunta5"));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"No se encontro examen con el código "+codigo);
            }
            cn.close();
            
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"Error al recuperar preguntas del exmane ");
                               System.err.println("error, al recuperar preguntas Libres");}
       }


    }//GEN-LAST:event_Boton_BuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Buscar;
    private javax.swing.JButton Boton_EnviarExamen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JLabel label_nota;
    private javax.swing.JTextField txt_PREG1;
    private javax.swing.JTextField txt_PREG2;
    private javax.swing.JTextField txt_PREG3;
    private javax.swing.JTextField txt_PREG4;
    private javax.swing.JTextField txt_PREG5;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextArea txt_respu1;
    private javax.swing.JTextArea txt_respu2;
    private javax.swing.JTextArea txt_respu3;
    private javax.swing.JTextArea txt_respu4;
    private javax.swing.JTextArea txt_respu5;
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
     
     
    }
}
