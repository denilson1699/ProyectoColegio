
package Ventanas;

import Clases.Conexion;
import java.awt.Color;
import java.awt.Label;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class NewPadreCargo extends javax.swing.JFrame {
    String dniTablaPadre, nombreTablaPadre, apellidoTablaPadre, cargoComiteBandera;
    
           
    public NewPadreCargo() {
    initComponents();
    setLocationRelativeTo(null);
    this.setResizable(false);
    dniTablaPadre =ListaPadres.dniTablaPadres;
    nombreTablaPadre=ListaPadres.nombreTablaPadres;
    apellidoTablaPadre=ListaPadres.apellidoTablaPadres;
   
        
    if(cargoComiteBandera==""){

    }else if (cargoComiteBandera=="nuevo Cargo"){

        
    }

    
    txt_dni.requestFocus();
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
        txt_dni = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        boton_BuscraPadre = new javax.swing.JButton();
        label_titulo = new javax.swing.JLabel();
        labelCargo = new javax.swing.JLabel();
        cmb_genero1 = new javax.swing.JComboBox<>();
        labelFecha = new javax.swing.JLabel();
        labelComentarioCaracter = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_telefono1 = new javax.swing.JTextField();
        txt_cargo = new javax.swing.JTextField();
        botonRegistrar = new javax.swing.JButton();

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 640, 80));

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

        txt_dni.setBackground(new java.awt.Color(240, 240, 240));
        txt_dni.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_dni.setForeground(new java.awt.Color(204, 0, 0));
        txt_dni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_dni.setBorder(null);
        txt_dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dniKeyTyped(evt);
            }
        });
        getContentPane().add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 150, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Doc Ident");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 20));

        boton_BuscraPadre.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        boton_BuscraPadre.setForeground(new java.awt.Color(255, 0, 51));
        boton_BuscraPadre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        boton_BuscraPadre.setBorder(null);
        boton_BuscraPadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_BuscraPadreActionPerformed(evt);
            }
        });
        getContentPane().add(boton_BuscraPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 30, 20));

        label_titulo.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(102, 102, 0));
        label_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo.setText("Registrar Cargo");
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

        txt_telefono1.setBackground(new java.awt.Color(240, 240, 240));
        txt_telefono1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_telefono1.setBorder(null);
        getContentPane().add(txt_telefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 87, 20));

        txt_cargo.setBackground(new java.awt.Color(240, 240, 240));
        txt_cargo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_cargo.setBorder(null);
        getContentPane().add(txt_cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 110, 20));

        botonRegistrar.setText("Registrar Datos");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 160, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_BuscraPadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_BuscraPadreActionPerformed
    String Dni_doc=txt_dni.getText().trim();
      String validarDni="";
        try
            {
              
                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1= cn1.prepareStatement("select Dni_pad from tabla_padres where Dni_pad='"+Dni_doc+"'");
                ResultSet resul1=pst1.executeQuery();
                if(resul1.next())
                {
                validarDni=resul1.getString("Dni_pad");
                }
            }catch (Exception e) {}
                    // validamos que el dni o se repita
                if (Dni_doc.equals(validarDni))
                 {
                        try {
         Connection cn= Conexion.Conectar();
         PreparedStatement pst= cn.prepareStatement("select Dni_pad, Nombre_pad,Apellidos_pad,"
                 + "Genero_pad,Telf_pad,Correo_pad,Direccion_pad,Estado_pad,"
                 + "FechaRegistro, Observaciones from tabla_padres where Dni_pad='"+txt_dni.getText().trim()+"'");
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
        }catch (Exception e) {JOptionPane.showMessageDialog(null, "no se encontro infromación, contacte al administrador");
            System.err.println("error al buscar docente de la tabla: "+e);}
                        
                        
        }else{
          JOptionPane.showMessageDialog(null, "Dni "+Dni_doc+" no Encontrado\n            Registrar Datos...");
           NewPadre nuevoRegistroPadre= new NewPadre();
           nuevoRegistroPadre.setVisible(true);
          }
                
 
    }//GEN-LAST:event_boton_BuscraPadreActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        // AGREGAR DATOS DE UN NUEVO PROFESOR:

        String Dni_doc  ,Nombre_doc,Apellidos_doc,Genero_doc,Telf_doc,Correo_doc,
        Direccion_doc,Estado_doc,Observaciones;
        int  contador=0;

        // recuperadmos datos de los jtextfield
        Dni_doc      =txt_dni.getText().trim().toUpperCase();;
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
            txt_telefono1.requestFocus();
            txt_telefono1.setBackground(new Color(250,150,150));
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
        if(cmb_genero1.getSelectedItem().equals("Seleccionar"))
        {
            JOptionPane.showMessageDialog(null, "Falta seleccionar Género");
            contador++;
        }

        // Cuando todos los campos estan llenados
        if(contador==0)
        {  // pregusntar si se desea guardar la actualizacion
            int mensaje=JOptionPane.showConfirmDialog(null,"Guardar Registro",null,JOptionPane.YES_NO_OPTION);
            if(mensaje==JOptionPane.YES_OPTION)
              {
            try
            {
                Connection cn=Conexion.Conectar();
                PreparedStatement pst= cn.prepareStatement("insert into tabla_cargospadres values (?,?,?,?,?,?,?)");
                pst.setInt(1,0);
                pst.setString(2,Dni_doc);
                pst.setString(3,Nombre_doc);
                pst.setString(4,Apellidos_doc);
                pst.setString(5, txt_cargo.getText().trim());
                pst.setString(6,labelFecha.getText());
                pst.setString(7,txt_observaciones.getText().trim());
                pst.executeUpdate();
                cn.close();
                // preguntar si desea generar un nuevo registro
                int mensaje2=JOptionPane.showConfirmDialog(null,"Registro exitoso continuar [S/N]:",null,JOptionPane.YES_NO_OPTION);
                if(mensaje==JOptionPane.YES_OPTION)
                  {// recuperadmos metodo para blanquiar campos
                  LimpiarCampos();
                  }
               } catch (Exception e){ JOptionPane.showMessageDialog(null, "Error al registrar Datos \n contacte al Administrador","",JOptionPane.WARNING_MESSAGE);
                            System.err.println("error al registrar nuevo Docente: "+e); }
           }else
               {// si no se desea gabra nuevo producto
               JOptionPane.showMessageDialog(null, "REGISTRO CANCELADO");
               }
       }

    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void txt_observacionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_observacionesKeyReleased
        String texto=txt_observaciones.getText().trim();
        int Cantidad=texto.length();
        labelComentarioCaracter.setText("* maximo 200/"+Integer.toString(Cantidad));           // TODO add your handling code here:
    }//GEN-LAST:event_txt_observacionesKeyReleased

    private void txt_dniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dniKeyTyped
       // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(txt_dni.getText().length()>=8){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_txt_dniKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewPadreCargo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton boton_BuscraPadre;
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
    private javax.swing.JTextField txt_cargo;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextArea txt_observaciones;
    private javax.swing.JTextField txt_telefono1;
    // End of variables declaration//GEN-END:variables

 // limiar todos los campos
 public void LimpiarCampos(){
     txt_apellidos.setText("");
     txt_correo.setText("");
     txt_direccion.setText("");
     txt_dni.setText("");
     txt_estado.setText("Activo");
     txt_nombre.setText("");
     cmb_genero1.setSelectedIndex(0);
     txt_observaciones.setText("");
     txt_telefono1.setText("");
     txt_cargo.setText("");
 }
}