
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

public class NewDocente extends javax.swing.JFrame {
    
           
    public NewDocente() {
    initComponents();
    setLocationRelativeTo(null);
    this.setResizable(false);
        

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

        label_titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmb_genero = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_observaciones = new javax.swing.JTextArea();
        txt_nombre = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_estado = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_especialidad = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        botonRegistrar = new javax.swing.JButton();
        txt_dni = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmb_tutoria = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        labelComentarioCaracter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_titulo.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        label_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo.setText("Nuevo Registro");
        getContentPane().add(label_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 648, -1));

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
        jLabel4.setText("teléfono:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Correo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Dirección:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Especialidad:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Estado:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Observaciones");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        cmb_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));
        getContentPane().add(cmb_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        txt_observaciones.setColumns(20);
        txt_observaciones.setRows(5);
        txt_observaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_observacionesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txt_observaciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 622, -1));

        txt_nombre.setBackground(new java.awt.Color(255, 255, 204));
        txt_nombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_nombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 136, 150, 20));

        txt_apellidos.setBackground(new java.awt.Color(255, 255, 204));
        txt_apellidos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_apellidos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 136, 284, 20));

        txt_estado.setBackground(new java.awt.Color(255, 255, 204));
        txt_estado.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_estado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_estado.setText("Activo");
        txt_estado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txt_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 106, 20));

        txt_direccion.setBackground(new java.awt.Color(255, 255, 204));
        txt_direccion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_direccion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 186, 380, 20));

        txt_especialidad.setBackground(new java.awt.Color(255, 255, 204));
        txt_especialidad.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_especialidad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txt_especialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 510, 20));

        txt_correo.setBackground(new java.awt.Color(255, 255, 204));
        txt_correo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_correo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 236, 260, 20));

        txt_telefono.setBackground(new java.awt.Color(255, 255, 204));
        txt_telefono.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_telefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 236, 87, 20));

        botonRegistrar.setText("Registrar Datos");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        txt_dni.setBackground(new java.awt.Color(255, 255, 204));
        txt_dni.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_dni.setForeground(new java.awt.Color(204, 0, 0));
        txt_dni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_dni.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dniKeyTyped(evt);
            }
        });
        getContentPane().add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 86, 150, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Doc Ident");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Tutoria:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, 20));

        cmb_tutoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Si", "No" }));
        getContentPane().add(cmb_tutoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Fecha Registro:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, 20));

        labelFecha.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(153, 0, 0));
        labelFecha.setText("jLabel12");
        getContentPane().add(labelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 70, 20));

        labelComentarioCaracter.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelComentarioCaracter.setForeground(new java.awt.Color(255, 0, 0));
        labelComentarioCaracter.setText("* maximo 200 caracteres");
        getContentPane().add(labelComentarioCaracter, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
    // AGREGAR DATOS DE UN NUEVO PROFESOR:

    String Dni_doc  ,Nombre_doc,Apellidos_doc,Genero_doc,Telf_doc,Correo_doc,
            Direccion_doc,Especialidad_doc,Estado_doc,Observaciones, tutoria;
    int  contador=0;
     
    // recuperadmos datos de los jtextfield
    Dni_doc      =txt_dni.getText().trim().toUpperCase();;
    Nombre_doc   =txt_nombre.getText().trim();
    Apellidos_doc =txt_apellidos.getText().trim();
    Genero_doc   =cmb_genero.getSelectedItem().toString();
    Telf_doc     =txt_telefono.getText().trim();
    Correo_doc   =txt_correo.getText().trim();
    Direccion_doc =txt_direccion.getText().trim();
    Especialidad_doc=txt_especialidad.getText().trim();
    Estado_doc   =txt_estado.getText().trim();
    tutoria=cmb_tutoria.getSelectedItem().toString();
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
            txt_telefono.requestFocus();
            txt_telefono.setBackground(new Color(250,150,150));
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
        if(Especialidad_doc.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta ingresar la Especialidad");
            txt_especialidad.requestFocus();
            txt_especialidad.setBackground(new Color(250,150,150));
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
        if(cmb_tutoria.getSelectedItem().equals("Seleccionar"))
        {
            JOptionPane.showMessageDialog(null, "Falta seleccionar tuoria");
            contador++;
        }
     
        // Cuando todos los campos estan llenados
        if(contador==0)
        {  // pregusntar si se desea guardar la actualizacion
      
            try
            {
             String validarDni;
             Connection cn1= Conexion.Conectar();
             PreparedStatement pst1= cn1.prepareStatement("select Dni_doc from tabla_docentes where Dni_doc ='"+Dni_doc+"'");
                ResultSet resul1=pst1.executeQuery();
                if(resul1.next())
                {
                    validarDni=resul1.getString("Dni_cliente");
                    // validamos que el dni o se repita
                    if (Dni_doc.equals(validarDni))
                    {
                        JOptionPane.showMessageDialog(null, "Dni "+Dni_doc+" ya registrado");
                    }
                }else{// validar s desea guardar producto
        int mensaje=JOptionPane.showConfirmDialog(null,"Guardar Registro",null,JOptionPane.YES_NO_OPTION);
        if(mensaje==JOptionPane.YES_OPTION)
        {
                     try
                     {
                      Connection cn=Conexion.Conectar();
                      PreparedStatement pst= cn.prepareStatement("insert into tabla_docentes values (?,?,?,?,?,?,?,?,?,?,?,?)");
                      pst.setString(1,Dni_doc);
                      pst.setString(2,Nombre_doc);
                      pst.setString(3,Apellidos_doc );
                      pst.setString(4, Genero_doc);
                      pst.setString(5,Telf_doc );
                      pst.setString(6,Correo_doc);
                      pst.setString(7,Direccion_doc );
                      pst.setString(8,Especialidad_doc);
                      pst.setString(9,Estado_doc);
                      pst.setString(10,txt_observaciones.getText().trim());
                      pst.setString(11,tutoria);
                      pst.setString(12,labelFecha.getText());
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

    }//GEN-LAST:event_botonRegistrarActionPerformed


    private void txt_observacionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_observacionesKeyReleased
        String texto=txt_observaciones.getText().trim();
        int Cantidad=texto.length();
        labelComentarioCaracter.setText("* maximo 200/"+Integer.toString(Cantidad));   
        // TODO add your handling code here:
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
                new NewDocente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JComboBox<String> cmb_genero;
    private javax.swing.JComboBox<String> cmb_tutoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelComentarioCaracter;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_especialidad;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextArea txt_observaciones;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

 // METODO PARA ACTUALIZAR LA VENTADA DE INFROFROMACION DEL DOCENETE
 public void ActualizarVentana()
 {
     this.setVisible(false);
     NewDocente mensajero= new NewDocente();
     mensajero.setVisible(true);
 }
 
 // METODO PARA BUSACR Y MOSTAR DATOS DEL DOCENTE 
 public void BuscardorDeClientes(String dniUsuario){
    try {
         Connection cn= Conexion.Conectar();
         PreparedStatement pst= cn.prepareStatement("select Dni_doc, Nombre_doc,Apellidos_doc,"
                 + "Genero_doc,Telf_doc,Correo_doc,Direccion_doc,Especialidad_doc,Estado_doc,Observaciones from tabla_docentes where Dni_doc='"+dniUsuario+"'");
         ResultSet resul=pst.executeQuery(); 
         if(resul.next()){
           txt_dni.setText(resul.getString("Dni_doc"));
           txt_nombre.setText(resul.getString("Nombre_doc"));
           txt_apellidos.setText(resul.getString("Apellidos_doc"));
           txt_correo.setText(resul.getString("Correo_doc"));
           txt_direccion.setText(resul.getString("Direccion_doc"));
           txt_telefono.setText(resul.getString("Telf_doc"));
           txt_estado.setText(resul.getString("Estado_doc"));
           txt_especialidad.setText(resul.getString("Especialidad_doc"));
           txt_observaciones.setText(resul.getString("Observaciones"));
           
           String genero=resul.getString("Genero_doc");
           if(genero.equals("Masculino")){
               cmb_genero.setSelectedIndex(1);
           }
           if(genero.equals("Femenino")){
               cmb_genero.setSelectedIndex(2);
           }  
          cn.close();
         }
        }catch (Exception e) {
             JOptionPane.showMessageDialog(null, "no se encontro infromación, contacte al administrador");
            System.err.println("error al buscar docente de la tabla: "+e);
     }
 } 
 
 // limiar todos los campos
 public void LimpiarCampos(){
     txt_apellidos.setText("");
     txt_correo.setText("");
     txt_direccion.setText("");
     txt_dni.setText("");
     txt_especialidad.setText("");
     txt_estado.setText("Activo");
     txt_nombre.setText("");
     txt_observaciones.setText("");
     txt_telefono.setText("");
 }
}
