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

public class examen_RespustaLibre extends javax.swing.JInternalFrame {

    public examen_RespustaLibre() {
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
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        labelTipo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

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

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Pregunta 02:");

        txt_PREG2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PREG2KeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Pregunta 03:");

        txt_PREG3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PREG3KeyTyped(evt);
            }
        });

        txt_PREG4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PREG4KeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Pregunta 04:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Pregunta 05:");

        txt_PREG5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PREG5KeyTyped(evt);
            }
        });

        jButton1.setText("GUARDAR ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Registrar Examen con Respuestas Libres");

        labelTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelTipo.setForeground(new java.awt.Color(153, 0, 0));
        labelTipo.setText("Modelo");

        jLabel13.setText("Tipo:");

        jLabel15.setText("Fecha:");

        labelFecha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(316, 316, 316)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_descripcion))
                            .addComponent(txt_PREG3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1089, Short.MAX_VALUE)
                            .addComponent(txt_PREG4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1089, Short.MAX_VALUE)
                            .addComponent(txt_PREG5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1089, Short.MAX_VALUE)
                            .addComponent(txt_PREG1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_PREG2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_PREG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_PREG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_PREG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_PREG4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_PREG5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


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
    
        if(contador==0)
        {  // pregusntar si se desea guardar la actualizacion
      
            try
            {
             String validarcodigo;
             Connection cn1= Conexion.Conectar();
             PreparedStatement pst1= cn1.prepareStatement("select Codigo from tabla_examen_respuestalibre where Codigo='"+Codigo+"'");
                ResultSet resul1=pst1.executeQuery();
                if(resul1.next())
                {
                    validarcodigo=resul1.getString("Codigo");
                    // validamos que el dni o se repita
                    if (Codigo.equals(validarcodigo))
                    {
                        JOptionPane.showMessageDialog(null, "Código "+Codigo+" ya registrado");
                    }
                }else{// validar s desea guardar producto
        int mensaje=JOptionPane.showConfirmDialog(null,"Guardar examen ",null,JOptionPane.YES_NO_OPTION);
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
                      pst.setString(5,"");
                      pst.setString(6,Pregunta2 );
                      pst.setString(7,"");
                      pst.setString(8,Pregunta3 );
                      pst.setString(9,"");
                      pst.setString(10,Pregunta4);
                      pst.setString(11,"");
                      pst.setString(12,Pregunta5);
                      pst.setString(13,"");
                      pst.setString(14,labelTipo.getText().trim());
                      pst.setString(15,labelFecha.getText().trim());
                      pst.setString(16,"");
                      pst.setString(17,"");
                      pst.setString(18,"");
                      pst.setString(19,"");
                      pst.executeUpdate();
                      cn.close();
                       // preguntar si desea generar un nuevo registro
                            int mensaje2=JOptionPane.showConfirmDialog(null,"Registro exitoso continuar [S/N]:",null,JOptionPane.YES_NO_OPTION);
                            if(mensaje==JOptionPane.YES_OPTION)
                            {// recuperadmos metodo para blanquiar campos
                                LimpiarCampos();

                            }
                        } catch (Exception e)
                        {
                            JOptionPane.showMessageDialog(null, "Error al registrar Datos \n contacte al Administrador","",JOptionPane.WARNING_MESSAGE);
                            System.err.println("error al registrar nuevo Docente: "+e);
                        }
                    }else
             {// si no se desea gabra nuevo producto
                 JOptionPane.showMessageDialog(null, "REGISTRO CANCELADO");
                  }
                }

            }catch (SQLException ex) {}
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JTextField txt_PREG1;
    private javax.swing.JTextField txt_PREG2;
    private javax.swing.JTextField txt_PREG3;
    private javax.swing.JTextField txt_PREG4;
    private javax.swing.JTextField txt_PREG5;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_descripcion;
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
