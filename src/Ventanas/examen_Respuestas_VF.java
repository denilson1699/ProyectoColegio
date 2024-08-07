
package Ventanas;

import Clases.Conexion;
import static Ventanas.Ventana_RealizarExamen.jDesktopPane1;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class examen_Respuestas_VF extends javax.swing.JInternalFrame {
String R1, R2,R3,R4,R5;
    public examen_Respuestas_VF() {
        initComponents();
        
        Calendar Calendario=Calendar.getInstance(); 
        labelFecha.setText(Integer.toString(Calendario.get(Calendar.DATE))+"/"+
                                    Integer.toString(Calendario.get(Calendar.MONTH)+1)+"/"+
                                    Integer.toString(Calendario.get(Calendar.YEAR)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_codigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        txt_PREG1 = new javax.swing.JTextField();
        txt_RESP1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_PREG2 = new javax.swing.JTextField();
        txt_RESP2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_RESP3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_PREG3 = new javax.swing.JTextField();
        txt_PREG4 = new javax.swing.JTextField();
        txt_RESP4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_RESP5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_PREG5 = new javax.swing.JTextField();
        Boton_EnviarExamen = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        Boton_Buscar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_dni = new javax.swing.JTextField();
        label_nota = new javax.swing.JLabel();
        labelTipo = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();

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

        jLabel3.setText("Repuesta V/F");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Descripcion:");

        txt_descripcion.setEditable(false);
        txt_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_descripcionKeyTyped(evt);
            }
        });

        txt_PREG1.setEnabled(false);
        txt_PREG1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PREG1KeyTyped(evt);
            }
        });

        txt_RESP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RESP1ActionPerformed(evt);
            }
        });
        txt_RESP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_RESP1KeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Pregunta 02:");

        jLabel5.setText("Repuesta V/F");

        txt_PREG2.setEnabled(false);
        txt_PREG2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PREG2KeyTyped(evt);
            }
        });

        txt_RESP2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_RESP2KeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Pregunta 03:");

        txt_RESP3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_RESP3KeyTyped(evt);
            }
        });

        jLabel8.setText("Repuesta V/F");

        txt_PREG3.setEnabled(false);
        txt_PREG3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PREG3KeyTyped(evt);
            }
        });

        txt_PREG4.setEnabled(false);
        txt_PREG4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PREG4KeyTyped(evt);
            }
        });

        txt_RESP4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_RESP4KeyTyped(evt);
            }
        });

        jLabel9.setText("Repuesta V/F");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Pregunta 04:");

        txt_RESP5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_RESP5KeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Pregunta 05:");

        jLabel12.setText("Repuesta V/F");

        txt_PREG5.setEnabled(false);
        txt_PREG5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PREG5KeyTyped(evt);
            }
        });

        Boton_EnviarExamen.setText("Enviar Examen");
        Boton_EnviarExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EnviarExamenActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Respuesta de Examen Verdadero / Falso ");

        Boton_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        Boton_Buscar.setText("Buscar");
        Boton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_BuscarActionPerformed(evt);
            }
        });

        jLabel13.setText("Nombre:");

        jLabel14.setText("Apellido:");

        jLabel15.setText("Dni:");

        txt_nombre.setBorder(null);

        txt_apellidos.setBorder(null);

        txt_dni.setBorder(null);

        label_nota.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        label_nota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        labelTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelTipo.setForeground(new java.awt.Color(153, 0, 0));
        labelTipo.setText("Examen");

        jLabel17.setText("Tipo:");

        jLabel18.setText("Fecha:");

        labelFecha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(200, 200, 200)
                                        .addComponent(Boton_EnviarExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label_nota, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_RESP5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txt_RESP1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txt_RESP2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txt_RESP3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txt_RESP4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Boton_Buscar)
                                        .addGap(384, 384, 384)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE))
                                    .addComponent(txt_PREG3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_PREG4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_PREG5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_PREG1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_PREG2, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_Buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_PREG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_RESP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_PREG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_RESP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_PREG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_RESP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_PREG4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_RESP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_PREG5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_RESP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_nota, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Boton_EnviarExamen)
                                .addGap(9, 9, 9)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_RESP1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_RESP1KeyTyped

       // ingresar maximo 1 caracteres
        if(txt_RESP1.getText().length()>=1){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_txt_RESP1KeyTyped

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

    private void txt_RESP2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_RESP2KeyTyped
        if(txt_RESP2.getText().length()>=1){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_txt_RESP2KeyTyped

    private void txt_RESP3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_RESP3KeyTyped
     if(txt_RESP3.getText().length()>=1){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_txt_RESP3KeyTyped

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

    private void txt_RESP4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_RESP4KeyTyped
               if(txt_RESP4.getText().length()>=1){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_txt_RESP4KeyTyped

    private void txt_RESP5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_RESP5KeyTyped
                if(txt_RESP5.getText().length()>=1){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_txt_RESP5KeyTyped

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
          if(Codigo.equals(""))
    {
        JOptionPane.showMessageDialog(null,"ingrese código del examen");
        contador++;
    }
    Pregunta1 =txt_PREG1.getText().trim();
    Pregunta2 =txt_PREG2.getText().trim();
    Pregunta3 =txt_PREG3.getText().trim();
    Pregunta4 =txt_PREG4.getText().trim();
    Pregunta5 =txt_PREG5.getText().trim();
    
    Respuesta1=txt_RESP1.getText().trim();
    Respuesta2=txt_RESP2.getText().trim();
    Respuesta3=txt_RESP3.getText().trim();
    Respuesta4=txt_RESP4.getText().trim();
    Respuesta5=txt_RESP5.getText().trim();
       if(Respuesta1.equals("")||Respuesta2.equals("")||Respuesta3.equals("")||Respuesta4.equals("")||Respuesta5.equals(""))
    {
        JOptionPane.showMessageDialog(null,"Complete todas las respuesta");
        contador++;
    }
    
    String dni=txt_dni.getText().trim();
    String nombre=txt_nombre.getText().trim();
    String apellidos=txt_apellidos.getText().trim();
    
    if(dni.equals("")||nombre.equals("")||apellidos.equals(""))
    {
        JOptionPane.showMessageDialog(null,"Complete datos personales");
        contador++;
    }
    
        if(contador==0)
        { 
            try
            {
             String validardni="", nombre1="", apellidos1="", nota1="";
             Connection cn1= Conexion.Conectar();
             PreparedStatement pst1= cn1.prepareStatement("select Nota,Dni,Nombre,Apellidos from tabla_examenes_vf where Codigo='"+Codigo+"' and Dni='"+dni+"'");
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
                     {int nota=0;
                      Connection cn=Conexion.Conectar();
                      PreparedStatement pst= cn.prepareStatement("insert into tabla_examenes_vf values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
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
                      pst.setString(14,labelTipo.getText().trim());
                      pst.setString(15,labelFecha.getText().trim());
                      pst.setString(16,txt_dni.getText().trim());
                      pst.setString(17,txt_nombre.getText().trim());
                      pst.setString(18,txt_apellidos.getText().trim());
                      if(Respuesta1.equalsIgnoreCase(R1)){nota++;}
                      if(Respuesta2.equalsIgnoreCase(R2)){nota++;}
                      if(Respuesta3.equalsIgnoreCase(R3)){nota++;}
                      if(Respuesta4.equalsIgnoreCase(R4)){nota++;}
                      if(Respuesta5.equalsIgnoreCase(R5)){nota++;}
                      int MostrarNota=nota*4;
                      pst.setInt(19,MostrarNota);
                      pst.executeUpdate();
                      cn.close();
                      if(MostrarNota<=10){
                      label_nota.setText(String.valueOf(MostrarNota));
                      label_nota.setForeground(Color.red);
                      }  else{
                      label_nota.setText(String.valueOf(MostrarNota));
                      label_nota.setForeground(Color.GREEN);
                      }
                      JOptionPane.showMessageDialog(null,"Examen Registrado exitosamente");
                      Boton_EnviarExamen.setEnabled(false);

                      } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Error al registrar Respuestas \n contacte al Administrador","",JOptionPane.WARNING_MESSAGE);
                            System.err.println("error al registrar respuesta V/F: "+e);
                        }
        }else{       JOptionPane.showMessageDialog(null, "Cancelado...");}
        
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
            PreparedStatement pst=cn.prepareStatement("select *from tabla_examenes_vf where Codigo='"+codigo+"' and Tipo='Modelo'");
            ResultSet rs= pst.executeQuery();
            if(rs.next())
            {
                txt_descripcion.setText(rs.getString("Descripcion"));
                txt_PREG1.setText(rs.getString("Pregunta1"));
                txt_PREG2.setText(rs.getString("Pregunta2"));
                txt_PREG3.setText(rs.getString("Pregunta3"));
                txt_PREG4.setText(rs.getString("Pregunta4"));
                txt_PREG5.setText(rs.getString("Pregunta5"));
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
                               System.err.println("error, al recuperar preguntas V/F");}
       }

    }//GEN-LAST:event_Boton_BuscarActionPerformed

    private void txt_RESP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RESP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RESP1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Buscar;
    private javax.swing.JButton Boton_EnviarExamen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JLabel label_nota;
    private javax.swing.JTextField txt_PREG1;
    private javax.swing.JTextField txt_PREG2;
    private javax.swing.JTextField txt_PREG3;
    private javax.swing.JTextField txt_PREG4;
    private javax.swing.JTextField txt_PREG5;
    private javax.swing.JTextField txt_RESP1;
    private javax.swing.JTextField txt_RESP2;
    private javax.swing.JTextField txt_RESP3;
    private javax.swing.JTextField txt_RESP4;
    private javax.swing.JTextField txt_RESP5;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables

    
    public void LimpiarCampos()
    {
     txt_PREG1.setText("");
     txt_PREG2.setText("");
     txt_PREG3.setText("");
     txt_PREG4.setText("");
     txt_PREG5.setText("");
     
     txt_RESP1.setText("");
     txt_RESP2.setText("");
     txt_RESP3.setText("");
     txt_RESP4.setText("");
     txt_RESP5.setText("");
     
     txt_codigo.setText("");
     txt_descripcion.setText("");
     
     
    }
}
