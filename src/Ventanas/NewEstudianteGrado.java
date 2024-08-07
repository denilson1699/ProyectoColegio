
package Ventanas;

import java.awt.Color;
import java.util.Calendar;
import javax.swing.JOptionPane;
import Clases.Conexion;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.plaf.OptionPaneUI;

public class NewEstudianteGrado extends javax.swing.JFrame {

    public NewEstudianteGrado() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        Calendar calendario= Calendar.getInstance();
        String fecha=Integer.toString(calendario.get(Calendar.DATE))+"/"+
                Integer.toString(calendario.get((Calendar.MONTH))+1)+"/"+
                Integer.toString(calendario.get(Calendar.YEAR));
        label_fecha.setText(fecha);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_dniEstudiante = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_domicilio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmb_genero = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txt_fechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        cmb_Nivel = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cmb_grado = new javax.swing.JComboBox<>();
        label_fecha = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_observaciones = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        label_iconEstudiante = new javax.swing.JLabel();
        botonRegistrarEstudiante = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Doc identidad:");

        txt_dniEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dniEstudianteKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Apellidos:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Domicilio:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Genero:");

        cmb_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Fecha Nacimiento:");

        txt_fechaNacimiento.setForeground(new java.awt.Color(0, 102, 102));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Nivel:");

        cmb_Nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Inicial", "Primaria", "Secundaria" }));
        cmb_Nivel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_NivelItemStateChanged(evt);
            }
        });
        cmb_Nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_NivelActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Grado:");

        cmb_grado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        label_fecha.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        label_fecha.setForeground(new java.awt.Color(153, 0, 0));
        label_fecha.setText("jLabel17");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Fecha Registro:");

        txt_observaciones.setColumns(20);
        txt_observaciones.setRows(5);
        jScrollPane1.setViewportView(txt_observaciones);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("* maximo 200 caracteres");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Observaciones");

        label_iconEstudiante.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_iconEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconUser.png"))); // NOI18N
        label_iconEstudiante.setText("PERFIL");
        label_iconEstudiante.setToolTipText("");
        label_iconEstudiante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_iconEstudiante.setVerifyInputWhenFocusTarget(false);
        label_iconEstudiante.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        botonRegistrarEstudiante.setText("Registrar Datos del Estudianes");
        botonRegistrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarEstudianteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 868, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 53, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(10, 10, 10)
                            .addComponent(txt_dniEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(71, 71, 71)
                            .addComponent(jLabel6)
                            .addGap(28, 28, 28)
                            .addComponent(cmb_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(67, 67, 67)
                            .addComponent(jLabel7)
                            .addGap(10, 10, 10)
                            .addComponent(txt_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(10, 10, 10)
                            .addComponent(txt_domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(30, 30, 30)
                                    .addComponent(cmb_Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(94, 94, 94)
                                    .addComponent(jLabel12)
                                    .addGap(23, 23, 23)
                                    .addComponent(cmb_grado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(7, 7, 7)
                                    .addComponent(jLabel14))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(82, 82, 82)
                            .addComponent(label_iconEstudiante))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(botonRegistrarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(337, 337, 337)
                            .addComponent(jLabel17)
                            .addGap(20, 20, 20)
                            .addComponent(label_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 53, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 29, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel1))
                        .addComponent(txt_dniEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(jLabel6))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(cmb_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(jLabel7))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(txt_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(11, 11, 11)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))))
                    .addGap(11, 11, 11)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel4))
                        .addComponent(txt_domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(3, 3, 3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmb_Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmb_grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(52, 52, 52)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel14))
                            .addGap(6, 6, 6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(label_iconEstudiante))
                    .addGap(11, 11, 11)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(botonRegistrarEstudiante)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 29, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_NivelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_NivelItemStateChanged
        // TODO add your handling code here:
        if(evt.getSource()==cmb_Nivel){
            String seleccion=cmb_Nivel.getSelectedItem().toString();//recuperar el texto selecionado y converirlo a string
            if(seleccion.equalsIgnoreCase("Primaria")){
                cmb_grado.removeAllItems();
                cmb_grado.addItem("Seleccionar");
                cmb_grado.addItem("1er Primaria");
                cmb_grado.addItem("2do Primaria");
                cmb_grado.addItem("3er Primaria");
                cmb_grado.addItem("4to Primaria");
                cmb_grado.addItem("5to Primaria");
                cmb_grado.addItem("6to Primaria");
            }else
            if(seleccion.equalsIgnoreCase("Secundaria")){
                cmb_grado.removeAllItems();
                cmb_grado.addItem("Seleccionar");
                cmb_grado.addItem("1er Secundaria");
                cmb_grado.addItem("2do Secundaria");
                cmb_grado.addItem("3er Secundaria");
                cmb_grado.addItem("4to Secundaria");
                cmb_grado.addItem("5to Secundaria");
            }else
            if(seleccion.equalsIgnoreCase("Inicial")){
                cmb_grado.removeAllItems();
                cmb_grado.addItem("Seleccionar");
                cmb_grado.addItem("4 años");
                cmb_grado.addItem("5 años");
            }
        }
    }//GEN-LAST:event_cmb_NivelItemStateChanged

    private void cmb_NivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_NivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_NivelActionPerformed

    private void botonRegistrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarEstudianteActionPerformed
        // TODO add your handling code here:
        String Dni_est ,Nombre_est,Apellidos_est,Genero_est,FNacimiento_est,Nivel,Grado,Domicilio_est,FechaRegistro;
        int contador=0;
        Dni_est=txt_dniEstudiante.getText().trim();
        Nombre_est=txt_nombre.getText().trim();
        Apellidos_est=txt_apellidos.getText().trim();
        Genero_est=cmb_genero.getSelectedItem().toString();
        FNacimiento_est=txt_fechaNacimiento.getDateFormatString();
        Nivel=cmb_Nivel.getSelectedItem().toString();
        Grado=cmb_grado.getSelectedItem().toString();
        Domicilio_est=txt_domicilio.getText().trim();
        FechaRegistro=label_fecha.getText().trim();
        
         if(Dni_est.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar el DNI ");
            txt_dniEstudiante.requestFocus();
            txt_dniEstudiante.setBackground(new Color(250,150,150));
            contador++;
        }    
         if(Nombre_est.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar Nombre ");
            txt_nombre.requestFocus();
            txt_nombre.setBackground(new Color(250,150,150));
            contador++;
        }        
         if(Apellidos_est.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar Apellidos ");
            txt_apellidos.requestFocus();
            txt_apellidos.setBackground(new Color(250,150,150));
            contador++;
        }        
         if(cmb_genero.getSelectedItem().equals("Seleccionar"))
        {
            JOptionPane.showMessageDialog(null, "Falta Selecionar Género");
            contador++;
        }        
         if(FNacimiento_est.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar Ingresar Fecha de Nacimiento");
            txt_fechaNacimiento.requestFocus();
            txt_fechaNacimiento.setBackground(new Color(250,150,150));
            contador++;
        }         
         if(cmb_Nivel.getSelectedItem().equals("Seleccionar"))
        {
            JOptionPane.showMessageDialog(null, "Falta Selecionar Nivel");
            contador++;
        }       
         if(cmb_grado.getSelectedItem().equals("Seleccionar"))
        {
            JOptionPane.showMessageDialog(null, "Falta Selecionar Grado");
            contador++;
        }          
         if(Domicilio_est.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar el Domicilio");
            txt_domicilio.requestFocus();
            txt_domicilio.setBackground(new Color(250,150,150));
            contador++;
        }       
        
       if(contador==0){
       try {
           String validarDni="";
           Connection cn1 =Conexion.Conectar();
           PreparedStatement pst1=cn1.prepareStatement("select Dni_est from tabla_estudiante where Dni_est= '"+Dni_est+"'");
           ResultSet resul1=pst1.executeQuery();
           if(resul1.next())
           {
              validarDni=resul1.getString("Dni_est");
              
           }
           if(validarDni.equals(Dni_est))
              {
                JOptionPane.showMessageDialog(null, "Dni "+Dni_est+" ya registrado",null, JOptionPane.WARNING_MESSAGE);
                txt_dniEstudiante.requestFocus();
                txt_dniEstudiante.setBackground(new Color(250,150,150));
              }
           else{
           int mensaje=JOptionPane.showConfirmDialog(null,"Guardar Registro",null,JOptionPane.YES_NO_OPTION);
            if(mensaje==JOptionPane.YES_OPTION)
              {
              try{
              Connection cn2=Conexion.Conectar();
              PreparedStatement pst2=cn2.prepareStatement("insert into tabla_estudiante values (?,?,?,?,?,?,?,?,?,?)");
              pst2.setString(1,Dni_est);
              pst2.setString(2,Nombre_est);
              pst2.setString(3,Apellidos_est);
              pst2.setString(4,Genero_est);
              pst2.setString(5,FNacimiento_est);
              pst2.setString(6,Nivel);
              pst2.setString(7,Grado);
              pst2.setString(8,Domicilio_est);
              pst2.setString(9,FechaRegistro);
              pst2.setString(10,txt_observaciones.getText().trim());
              pst2.executeUpdate();
              cn2.close();
              // preguntar par volver a ingresar datos
              int mensaje2=JOptionPane.showConfirmDialog(null,"Registro exitoso continuar [S/N]:",null,JOptionPane.YES_NO_OPTION);
              if(mensaje==JOptionPane.YES_OPTION)
                { 
                LimpiarCampos();
                }
              }catch(Exception e){JOptionPane.showMessageDialog(null, "Erro al registrar datos del estudiante \n contacte al administrador",null, JOptionPane.WARNING_MESSAGE);
                                  System.err.println("erro al registra datos del nuevo estudiante");}
              }
              
            else
              {
            JOptionPane.showMessageDialog(null, "REGISTRO CANCELADO");
              }
           }
       }catch (SQLException ex) {}
        
       }
      
        
    }//GEN-LAST:event_botonRegistrarEstudianteActionPerformed

    private void txt_dniEstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dniEstudianteKeyTyped
       // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(txt_dniEstudiante.getText().length()>=8){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }

    }//GEN-LAST:event_txt_dniEstudianteKeyTyped

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
            java.util.logging.Logger.getLogger(NewEstudianteGrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewEstudianteGrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewEstudianteGrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewEstudianteGrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewEstudianteGrado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrarEstudiante;
    private javax.swing.JComboBox<String> cmb_Nivel;
    private javax.swing.JComboBox<String> cmb_genero;
    private javax.swing.JComboBox<String> cmb_grado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_fecha;
    private javax.swing.JLabel label_iconEstudiante;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_dniEstudiante;
    private javax.swing.JTextField txt_domicilio;
    private com.toedter.calendar.JDateChooser txt_fechaNacimiento;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextArea txt_observaciones;
    // End of variables declaration//GEN-END:variables

// limiar campos 
    public void LimpiarCampos(){
        txt_apellidos.setText("");
        txt_dniEstudiante.setText("");
        txt_domicilio.setText("");
        txt_nombre.setText("");
        txt_observaciones.setText("");
        cmb_Nivel.setSelectedIndex(0);
        cmb_genero.setSelectedIndex(0);
        cmb_grado.setSelectedIndex(0);
    }
}
