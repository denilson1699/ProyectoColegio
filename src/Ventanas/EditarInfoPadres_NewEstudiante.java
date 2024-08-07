
package Ventanas;

import Clases.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class EditarInfoPadres_NewEstudiante extends javax.swing.JFrame {
    
     String editarPadreNewEstudiante ;    
    public EditarInfoPadres_NewEstudiante() {
    initComponents();
    setLocationRelativeTo(null);
    this.setResizable(false);
    editarPadreNewEstudiante=NewEstudiante.editarPadreNewEstudiante;  
        System.out.println("recuperado dni:"+editarPadreNewEstudiante);
    txt_dni.requestFocus();
    Calendar calendario = Calendar.getInstance();      
    String Fecha = Integer.toString(calendario.get(Calendar.DATE)) + "/"
                + Integer.toString(calendario.get(Calendar.MONTH) + 1) + "/"
                + Integer.toString(calendario.get(Calendar.YEAR));
     labelFecha.setText(Fecha);
   
    RecuperarDatos(editarPadreNewEstudiante);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmb_genero = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_observaciones = new javax.swing.JTextArea();
        txt_nombre = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_estado = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_situcion = new javax.swing.JTextField();
        botonActualizar = new javax.swing.JButton();
        txt_dni = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_telefono1 = new javax.swing.JTextField();
        txt_parentesco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_titulo.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        label_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo.setText("Nuevo Registro");
        getContentPane().add(label_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 648, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 60, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Apellidos:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("género:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("teléfono:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Correo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Dirección:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Parentesco:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Observaciones");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        cmb_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));
        getContentPane().add(cmb_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, 20));

        txt_observaciones.setColumns(20);
        txt_observaciones.setRows(5);
        jScrollPane1.setViewportView(txt_observaciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 580, 70));

        txt_nombre.setBackground(new java.awt.Color(255, 255, 204));
        txt_nombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_nombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 150, -1));

        txt_apellidos.setBackground(new java.awt.Color(255, 255, 204));
        txt_apellidos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_apellidos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 284, 20));

        txt_estado.setBackground(new java.awt.Color(255, 255, 204));
        txt_estado.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_estado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_estado.setText("Activo");
        txt_estado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txt_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 106, 20));

        txt_direccion.setBackground(new java.awt.Color(255, 255, 204));
        txt_direccion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_direccion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 280, 20));

        txt_correo.setBackground(new java.awt.Color(255, 255, 204));
        txt_correo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_correo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 280, 20));

        txt_situcion.setBackground(new java.awt.Color(255, 255, 204));
        txt_situcion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_situcion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txt_situcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 210, 20));

        botonActualizar.setText("Actualizar Datos ");
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(botonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 160, -1));

        txt_dni.setBackground(new java.awt.Color(255, 255, 204));
        txt_dni.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_dni.setForeground(new java.awt.Color(204, 0, 0));
        txt_dni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_dni.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 150, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Doc Ident");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Fecha Registro:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, -1, 20));

        labelFecha.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(153, 0, 0));
        labelFecha.setText("jLabel12");
        getContentPane().add(labelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 70, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("* maximo 200 caracteres");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Situación:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Estado:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, 20));

        txt_telefono1.setBackground(new java.awt.Color(255, 255, 204));
        txt_telefono1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_telefono1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txt_telefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 87, 20));

        txt_parentesco.setBackground(new java.awt.Color(255, 255, 204));
        txt_parentesco.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_parentesco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txt_parentesco, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 210, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
    // AGREGAR DATOS DE UN NUEVO PROFESOR:

    String Dni_doc  ,Nombre_doc,Apellidos_doc,Genero_doc,Telf_doc,Correo_doc,
            Direccion_doc,Estado_doc,Observaciones,Parentesco_pad,Situacion_pad,FechaRegistro;
    int  contador=0;
     
    // recuperadmos datos de los jtextfield
    Dni_doc      =txt_dni.getText().trim().toUpperCase();;
    Nombre_doc   =txt_nombre.getText().trim();
    Apellidos_doc =txt_apellidos.getText().trim();
    Genero_doc   =cmb_genero.getSelectedItem().toString();
    Telf_doc     =txt_situcion.getText().trim();
    Correo_doc   =txt_correo.getText().trim();
    Direccion_doc =txt_direccion.getText().trim();
    Estado_doc   =txt_estado.getText().trim();
    FechaRegistro=labelFecha.getText().trim();
    Parentesco_pad =txt_parentesco.getText().trim();
    Situacion_pad   =txt_situcion.getText().trim();
    
         // vaidamos que no existan campos en blanco
        if(Dni_doc.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar el DNI ");
            txt_dni.requestFocus();
            txt_dni.setBackground(new Color(250,150,150));
            contador++;
        }
        if(Nombre_doc.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar el Nombre ");
            txt_nombre.requestFocus();
            txt_nombre.setBackground(new Color(250,150,150));
            contador++;
        }
        if(Apellidos_doc.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar Apellidos ");
            txt_apellidos.requestFocus();
            txt_apellidos.setBackground(new Color(250,150,150));
            contador++;
        }

        if(Telf_doc.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar telefono");
            txt_situcion.requestFocus();
            txt_situcion.setBackground(new Color(250,150,150));
            contador++;
        }
        if(Correo_doc.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar correo electronico");
            txt_correo.requestFocus();
            txt_correo.setBackground(new Color(250,150,150));
            contador++;
        } if(Direccion_doc.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta ingresar la Dirección");
            txt_direccion.requestFocus();
            txt_direccion.setBackground(new Color(250,150,150));
            contador++;
        }
       
        if(Estado_doc.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta ingresar el Estado");
            txt_estado.requestFocus();
            txt_estado.setBackground(new Color(250,150,150));
            contador++;
        }
        if(cmb_genero.getSelectedItem().equals("Seleccionar"))
        {
            JOptionPane.showMessageDialog(null, "Falta seleccionar Género");
            contador++;
        }
         if(Parentesco_pad.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta ingresar Parentesto");
            txt_parentesco.requestFocus();
            txt_parentesco.setBackground(new Color(250,150,150));
            contador++;
        }
         if(Situacion_pad.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta ingresar Situción");
            txt_situcion.requestFocus();
            txt_situcion.setBackground(new Color(250,150,150));
            contador++;
        }
        // Cuando todos los campos estan llenados
        if(contador==0)
        {  // pregusntar si se desea guardar la actualizacion
      
        try
        {
            int mensaje=JOptionPane.showConfirmDialog(null,"Actualizar Datos...",null,JOptionPane.YES_NO_OPTION);
            if(mensaje==JOptionPane.YES_OPTION)
            {
             Connection cn1= Conexion.Conectar();
             PreparedStatement pst1= cn1.prepareStatement("update tabla_padres set Dni_pad=?,Nombre_pad=?,Apellidos_pad=?,Genero_pad=?,Telf_pad=?,Correo_pad=?,"
                     + "Direccion_pad=?,Estado_pad=?,FechaRegistro=?,Observaciones=?,Parentesco_pad=?,Situacion_pad=? where Dni_pad='"+Dni_doc+"'");
             pst1.setString(1,Dni_doc);
             pst1.setString(2,Nombre_doc);
             pst1.setString(3,Apellidos_doc );
             pst1.setString(4,Genero_doc);
             pst1.setString(5,Telf_doc );
             pst1.setString(6,Correo_doc);
             pst1.setString(7,Direccion_doc );
             pst1.setString(8,Estado_doc);
             pst1.setString(9,FechaRegistro);
             pst1.setString(10,txt_observaciones.getText().trim());
             pst1.setString(11,Parentesco_pad);
             pst1.setString(12,Situacion_pad);
             pst1.executeUpdate();
             cn1.close();
             JOptionPane.showMessageDialog(null,"Actualización exitosa");
             this.dispose();

            } 
             else  {  JOptionPane.showMessageDialog(null, "REGISTRO CANCELADO");   }
         
        } catch (SQLException e){ JOptionPane.showMessageDialog(null, "Error al Atualizar Datos, contacte al Administrador","",JOptionPane.WARNING_MESSAGE);
                                System.err.println("error al Actualizar datos del padre: "+e); }
         }
        
    }//GEN-LAST:event_botonActualizarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarInfoPadres_NewEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JComboBox<String> cmb_genero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextArea txt_observaciones;
    private javax.swing.JTextField txt_parentesco;
    private javax.swing.JTextField txt_situcion;
    private javax.swing.JTextField txt_telefono1;
    // End of variables declaration//GEN-END:variables

 
 // limiar todos los campos
 public void LimpiarCampos()
 {
EditarInfoPadres_NewEstudiante MENSAJERO=new EditarInfoPadres_NewEstudiante();
this.dispose();
MENSAJERO.setVisible(true);
 }
 
 
 public void RecuperarDatos(String dni)
 {
     try 
     {
        Connection cn1=Conexion.Conectar();
        PreparedStatement pst1=cn1.prepareStatement("select *from tabla_padres where Dni_pad='"+dni+"'");
        ResultSet resul1=pst1.executeQuery();
        if(resul1.next())
        {
            txt_apellidos.setText("  "+resul1.getString("Apellidos_pad"));
            txt_correo.setText("  "+resul1.getString("Correo_pad"));
            txt_direccion.setText("  "+resul1.getString("Direccion_pad"));
            txt_dni.setText("  "+resul1.getString("Dni_pad"));
            txt_estado.setText("  "+resul1.getString("Estado_pad"));
            txt_nombre.setText("  "+resul1.getString("Nombre_pad"));
            txt_observaciones.setText("  "+resul1.getString("Observaciones"));
            txt_parentesco.setText("  "+resul1.getString("Parentesco_pad"));
            txt_situcion.setText("  "+resul1.getString("Situacion_pad"));
            txt_telefono1.setText("  "+resul1.getString("Telf_pad"));
            labelFecha.setText(" "+resul1.getString("FechaRegistro"));
            String genero=resul1.getString("Genero_pad");
            if(genero.equals("Masculino"))
            {
               cmb_genero.setSelectedIndex(1);
            }
            if(genero.equals("Femenino"))
            {
               cmb_genero.setSelectedIndex(2);
            }                
            
        }
        cn1.close();
        
     } catch (Exception e) {JOptionPane.showMessageDialog(null,"erro al recuperar infromación");
                            System.err.println("error al recuperar datos del padre:"+e);}
     
 }
 
}
