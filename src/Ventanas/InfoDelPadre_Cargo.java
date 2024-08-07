
package Ventanas;

import Clases.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class InfoDelPadre_Cargo extends javax.swing.JFrame {
    String dniTablaPadre, nombreTablaPadre, apellidoTablaPadre, cargoComiteBandera;
    
           
    public InfoDelPadre_Cargo() {
    initComponents();
    setLocationRelativeTo(null);
    this.setResizable(false);
    dniTablaPadre =ListaPadres.dniTablaPadres;
    nombreTablaPadre=ListaPadres.nombreTablaPadres;
    apellidoTablaPadre=ListaPadres.apellidoTablaPadres;

    cargoComiteBandera=ListaPadres.cargoComite;
    switch(cargoComiteBandera){
        case "Padre sin Cargo":
              cmb_comite.setVisible(false);
              labelCargo.setVisible(false);
              break;

        default:
              cmb_comite.setVisible(true);
              labelCargo.setVisible(true);
              cmb_comite.addItem(cargoComiteBandera);
              break;
    }
        
    if(cargoComiteBandera==""){

    }else if (cargoComiteBandera=="nuevo Cargo"){

        
    }
    label_titulo.setText("Información del Padre \n"+nombreTablaPadre+" "+ apellidoTablaPadre);
        System.out.println("dni ingresado"+dniTablaPadre);
    // recuperamos y mostramos la infromacion del docente elegido
    BuscardorDePadre(dniTablaPadre);
    
    txt_nombre.requestFocus();
    txt_dni.setEnabled(false);
    Calendar calendario = Calendar.getInstance();      
     String Fecha = Integer.toString(calendario.get(Calendar.DATE)) + "/"
                + Integer.toString(calendario.get(Calendar.MONTH) + 1) + "/"
                + Integer.toString(calendario.get(Calendar.YEAR));
     labelFecha.setText(Fecha);
   
    
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_observaciones = new javax.swing.JTextArea();
        txt_nombre = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_estado = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        boton_actualizar = new javax.swing.JButton();
        Boton_eliminar = new javax.swing.JButton();
        txt_dni = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        boton_editar = new javax.swing.JButton();
        label_titulo = new javax.swing.JLabel();
        labelCargo = new javax.swing.JLabel();
        cmb_genero1 = new javax.swing.JComboBox<>();
        labelFecha = new javax.swing.JLabel();
        labelComentarioCaracter = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmb_comite = new javax.swing.JComboBox<>();
        txt_telefono1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 60, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Apellidos:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("género:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Fecha Registro:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Correo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Dirección:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Estado:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Observaciones");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        txt_observaciones.setColumns(20);
        txt_observaciones.setRows(5);
        txt_observaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_observacionesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txt_observaciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 640, -1));

        txt_nombre.setBackground(new java.awt.Color(240, 240, 240));
        txt_nombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_nombre.setBorder(null);
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 136, 180, 20));

        txt_apellidos.setBackground(new java.awt.Color(240, 240, 240));
        txt_apellidos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_apellidos.setBorder(null);
        getContentPane().add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 284, 20));

        txt_estado.setBackground(new java.awt.Color(240, 240, 240));
        txt_estado.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_estado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_estado.setText("Activo");
        txt_estado.setBorder(null);
        getContentPane().add(txt_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 106, 20));

        txt_direccion.setBackground(new java.awt.Color(240, 240, 240));
        txt_direccion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_direccion.setBorder(null);
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 380, 20));

        txt_correo.setBackground(new java.awt.Color(240, 240, 240));
        txt_correo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_correo.setBorder(null);
        getContentPane().add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 250, 20));

        boton_actualizar.setText("Actualizar Datos");
        boton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(boton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, -1));

        Boton_eliminar.setBackground(new java.awt.Color(250, 150, 150));
        Boton_eliminar.setText("Eliminar Datos");
        Boton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, -1, -1));

        txt_dni.setBackground(new java.awt.Color(240, 240, 240));
        txt_dni.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_dni.setForeground(new java.awt.Color(204, 0, 0));
        txt_dni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_dni.setBorder(null);
        getContentPane().add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 150, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Doc Ident");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 20));

        boton_editar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        boton_editar.setForeground(new java.awt.Color(255, 0, 51));
        boton_editar.setText("editar");
        boton_editar.setBorder(null);
        boton_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_editarActionPerformed(evt);
            }
        });
        getContentPane().add(boton_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 30, 20));

        label_titulo.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(102, 102, 0));
        label_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo.setText("Información del Padre");
        getContentPane().add(label_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 648, -1));

        labelCargo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelCargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCargo.setText("Cargo:");
        getContentPane().add(labelCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, -1, 20));

        cmb_genero1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));
        getContentPane().add(cmb_genero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        labelFecha.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(153, 0, 0));
        labelFecha.setText("jLabel12");
        getContentPane().add(labelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 70, 20));

        labelComentarioCaracter.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelComentarioCaracter.setForeground(new java.awt.Color(255, 0, 0));
        labelComentarioCaracter.setText("* maximo 200 caracteres");
        getContentPane().add(labelComentarioCaracter, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("teléfono:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, 20));

        getContentPane().add(cmb_comite, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 100, -1));

        txt_telefono1.setBackground(new java.awt.Color(240, 240, 240));
        txt_telefono1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_telefono1.setBorder(null);
        getContentPane().add(txt_telefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 87, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_actualizarActionPerformed
    // PARA ACTUALIZAR DATOS DEL DOCENTE:
    String Dni_doc  ,Nombre_doc,Apellidos_doc,Genero_doc,Telf_doc,Correo_doc,Direccion_doc,Estado_doc,Observaciones;
    int  contador=0;
     
    // recuperadmos datos de los jtextfield
    Dni_doc      =txt_dni.getText().trim();
    Nombre_doc   =txt_nombre.getText().trim();
    Apellidos_doc =txt_apellidos.getText().trim();
    Genero_doc   =cmb_genero1.getSelectedItem().toString();
    Telf_doc     =txt_telefono1.getText().trim();
    Correo_doc   =txt_correo.getText().trim();
    Direccion_doc =txt_direccion.getText().trim();
    Estado_doc   =txt_estado.getText().trim();
         // vaidamos que no existan campos en blanco
        if(Dni_doc.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar el DNI ");
            txt_dni.requestFocus();
            txt_dni.setBackground(new Color(255,255,255));
            contador++;
        }
        if(Nombre_doc.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar el Nombre ");
            txt_nombre.requestFocus();
            txt_nombre.setBackground(new Color(255,255,255));
            contador++;
        }
        if(Apellidos_doc.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar Apellidos ");
            txt_apellidos.requestFocus();
            txt_apellidos.setBackground(new Color(255,255,255));
            contador++;
        }

        if(Telf_doc.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar telefono");
            txt_telefono1.requestFocus();
            txt_telefono1.setBackground(new Color(255,255,255));
            contador++;
        }
        if(Correo_doc.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar correo electronico");
            txt_correo.requestFocus();
            txt_correo.setBackground(new Color(255,255,255));
            contador++;
        } if(Direccion_doc.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta ingresar la Dirección");
            txt_direccion.requestFocus();
            txt_direccion.setBackground(new Color(255,255,255));
            contador++;
        }
        if(Estado_doc.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta ingresar el Estado");
            txt_estado.requestFocus();
            txt_estado.setBackground(new Color(255,255,255));
            contador++;
        }
       
     
        // Cuando todos los campos estan llenados
        if(contador==0)
        {  // pregusntar si se desea guardar la actualizacion
        int mensaje=JOptionPane.showConfirmDialog(null,"Guardar Cambio?",null,JOptionPane.YES_NO_OPTION);
        if(mensaje==JOptionPane.YES_OPTION)
        {
        // actualizar datos en la bse de datos
            try {
            Connection cn=Conexion.Conectar();
            PreparedStatement pst = cn.prepareStatement("update tabla_padres set Dni_pad =?,Nombre_pad=?,Apellidos_pad=?,"
                + "Genero_pad=?,Telf_pad=?,Correo_pad=?,Direccion_pad=?,Estado_pad=?,FechaRegistro=?,Observaciones=? where Dni_pad ='"+dniTablaPadre+"'");
            pst.setString(1,Dni_doc);
            pst.setString(2,Nombre_doc);
            pst.setString(3,Apellidos_doc );
            pst.setString(4,Genero_doc);
            pst.setString(5,Telf_doc);
            pst.setString(6,Correo_doc);
            pst.setString(7,Direccion_doc);
            pst.setString(8,Estado_doc);
            pst.setString(9,labelFecha.getText());
            pst.setString(10,txt_observaciones.getText().trim());
            pst.executeUpdate();
            cn.close();
            JOptionPane.showMessageDialog(null,"Actualización exitosa");
            ListaPadres listaPadres = new ListaPadres();
            listaPadres.setVisible(true);
            this.dispose();
            }catch (SQLException ex)
                {
                    JOptionPane.showMessageDialog(null, "Error al Actualizar datos \n Contacte al Administrador","",JOptionPane.WARNING_MESSAGE);
                    System.err.println("error al actualizar: "+ex);
                }
            }else
            {// no se desea actualizar datos
                JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN CANCELADA");
            }
        }
        
    }//GEN-LAST:event_boton_actualizarActionPerformed

    private void boton_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_editarActionPerformed
        // TODO add your handling code here:
     txt_dni.setEnabled(true);
    }//GEN-LAST:event_boton_editarActionPerformed

    private void Boton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_eliminarActionPerformed
        // TODO add your handling code here:
      try {
          int mensaje=JOptionPane.showConfirmDialog(null,"Eliminar Datos...",null,JOptionPane.YES_NO_OPTION);
          if(mensaje==JOptionPane.YES_OPTION)
          {
            Connection cn=Conexion.Conectar();
            PreparedStatement pst=cn.prepareStatement("delete from tabla_padres where Dni_pad=?");
            pst.setString(1,txt_dni.getText().trim());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Eliminado");
            ListaPadres listaPadres = new ListaPadres();
            listaPadres.setVisible(true);
            this.dispose();
           }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error al eliminar Datos \n Contacte al Administrador");
            System.err.println("error al eliminar registro: "+e);
        }     

    }//GEN-LAST:event_Boton_eliminarActionPerformed

    private void txt_observacionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_observacionesKeyReleased
        String texto=txt_observaciones.getText().trim();
        int Cantidad=texto.length();
        labelComentarioCaracter.setText("* maximo 200/"+Integer.toString(Cantidad));
       
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_observacionesKeyReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoDelPadre_Cargo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_eliminar;
    private javax.swing.JButton boton_actualizar;
    private javax.swing.JButton boton_editar;
    private javax.swing.JComboBox<String> cmb_comite;
    private javax.swing.JComboBox<String> cmb_genero1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCargo;
    private javax.swing.JLabel labelComentarioCaracter;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextArea txt_observaciones;
    private javax.swing.JTextField txt_telefono1;
    // End of variables declaration//GEN-END:variables

 // METODO PARA ACTUALIZAR LA VENTADA DE INFROFROMACION DEL DOCENETE
 public void ActualizarVentana()
 {
     this.setVisible(false);
     InfoDelPadre_Cargo mensajero= new InfoDelPadre_Cargo();
     mensajero.setVisible(true);
 }
 
 // METODO PARA BUSACR Y MOSTAR DATOS DEL DOCENTE 
 public void BuscardorDePadre(String dniUsuario){
    try {
         Connection cn= Conexion.Conectar();
         PreparedStatement pst= cn.prepareStatement("select Dni_pad, Nombre_pad,Apellidos_pad,"
                 + "Genero_pad,Telf_pad,Correo_pad,Direccion_pad,Estado_pad,"
                 + "FechaRegistro, Observaciones from tabla_padres where Dni_pad='"+dniUsuario+"'");
         ResultSet resul=pst.executeQuery(); 
         if(resul.next()){
           txt_dni.setText("  "+resul.getString("Dni_pad"));
           txt_nombre.setText("  "+resul.getString("Nombre_pad"));
           txt_apellidos.setText("  "+resul.getString("Apellidos_pad"));
           txt_correo.setText("  "+resul.getString("Correo_pad"));
           txt_direccion.setText("  "+resul.getString("Direccion_pad"));
           txt_telefono1.setText("  "+resul.getString("Telf_pad"));
           txt_estado.setText("  "+resul.getString("Estado_pad"));
           txt_observaciones.setText("  "+resul.getString("Observaciones"));
           labelFecha.setText(resul.getString("FechaRegistro"));
           
           String genero=resul.getString("Genero_pad");
           if(genero.equals("Masculino")){
               cmb_genero1.setSelectedIndex(1);
           }
           if(genero.equals("Femenino")){
               cmb_genero1.setSelectedIndex(2);
           }  
          
          cn.close();
         }
        }catch (Exception e) {
             JOptionPane.showMessageDialog(null, "no se encontro infromación, contacte al administrador");
            System.err.println("error al buscar docente de la tabla: "+e);
     }
 } 
}
