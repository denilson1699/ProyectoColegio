
package Ventanas;

import Clases.Conexion;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class NewlDocenteTutorias extends javax.swing.JFrame {
    String dniTablaDocentes, nombreTablaDocentes, apellidoTablaDocentes;
    
           
    public NewlDocenteTutorias() {
    initComponents();
    setLocationRelativeTo(null);
    this.setResizable(false);

    dniTablaDocentes =ListaDocentes.dniTablaDocentes;
    nombreTablaDocentes=ListaDocentes.nombreTablaDocentes;
    apellidoTablaDocentes=ListaDocentes.apellidoTablaDocentes;
    label_titulo.setText("Información del Docente \n"+nombreTablaDocentes+" "+ apellidoTablaDocentes);
        

    txt_dni.requestFocus();
     
     Calendar calendario = Calendar.getInstance();      
     String Fecha = Integer.toString(calendario.get(Calendar.DATE)) + "/"
                + Integer.toString(calendario.get(Calendar.MONTH) + 1) + "/"
                + Integer.toString(calendario.get(Calendar.YEAR));
     label_fecha.setText(Fecha);
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
        cmb_Nivel = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_observaciones = new javax.swing.JTextArea();
        txt_nombre = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_estado = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_especialidad = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_dni = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_observacionesTuroria = new javax.swing.JTextArea();
        cmb_genero1 = new javax.swing.JComboBox<>();
        cmb_grado = new javax.swing.JComboBox<>();
        labelComentarioCaracter1 = new javax.swing.JLabel();
        labelComentarioCaracter2 = new javax.swing.JLabel();
        txt_estadoTutoria = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        botonRegistrar = new javax.swing.JButton();
        label_fecha = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        boton_BuscarDocente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_titulo.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(102, 102, 0));
        label_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo.setText("Información del Docente");
        getContentPane().add(label_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 648, -1));

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
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Correo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Dirección:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Especialidad:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Estado:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Observaciones Docente:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

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
        getContentPane().add(cmb_Nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 100, -1));

        txt_observaciones.setColumns(20);
        txt_observaciones.setRows(5);
        txt_observaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_observacionesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txt_observaciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 450, -1));

        txt_nombre.setBackground(new java.awt.Color(240, 240, 240));
        txt_nombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_nombre.setBorder(null);
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 136, 180, 20));

        txt_apellidos.setBackground(new java.awt.Color(240, 240, 240));
        txt_apellidos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_apellidos.setBorder(null);
        getContentPane().add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 136, 284, 20));

        txt_estado.setBackground(new java.awt.Color(240, 240, 240));
        txt_estado.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_estado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_estado.setText("Activo");
        txt_estado.setBorder(null);
        getContentPane().add(txt_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 86, 106, 20));

        txt_direccion.setBackground(new java.awt.Color(240, 240, 240));
        txt_direccion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_direccion.setBorder(null);
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 186, 390, 20));

        txt_especialidad.setBackground(new java.awt.Color(240, 240, 240));
        txt_especialidad.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_especialidad.setBorder(null);
        getContentPane().add(txt_especialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 510, 20));

        txt_correo.setBackground(new java.awt.Color(240, 240, 240));
        txt_correo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_correo.setBorder(null);
        getContentPane().add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 236, 550, 20));

        txt_telefono.setBackground(new java.awt.Color(240, 240, 240));
        txt_telefono.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_telefono.setBorder(null);
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 87, 20));

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
        getContentPane().add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 86, 150, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Doc Ident");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Nivel:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, -1, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Fecha:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 340, -1, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Observaciones Tutoria:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, -1, -1));

        txt_observacionesTuroria.setColumns(20);
        txt_observacionesTuroria.setRows(5);
        txt_observacionesTuroria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_observacionesTuroriaKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(txt_observacionesTuroria);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 450, -1));

        cmb_genero1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));
        getContentPane().add(cmb_genero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        getContentPane().add(cmb_grado, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, 100, -1));

        labelComentarioCaracter1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelComentarioCaracter1.setForeground(new java.awt.Color(255, 0, 0));
        labelComentarioCaracter1.setText("* maximo 200 caracteres");
        getContentPane().add(labelComentarioCaracter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, -1, -1));

        labelComentarioCaracter2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelComentarioCaracter2.setForeground(new java.awt.Color(255, 0, 0));
        labelComentarioCaracter2.setText("* maximo 200 caracteres");
        getContentPane().add(labelComentarioCaracter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 460, -1, -1));

        txt_estadoTutoria.setBackground(new java.awt.Color(240, 240, 240));
        txt_estadoTutoria.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_estadoTutoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_estadoTutoria.setText("Activo");
        txt_estadoTutoria.setBorder(null);
        getContentPane().add(txt_estadoTutoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 280, 106, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Estado:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 280, -1, 20));

        botonRegistrar.setText("Registrar Tutoria");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 160, -1));

        label_fecha.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        label_fecha.setForeground(new java.awt.Color(153, 0, 0));
        label_fecha.setText("jLabel17");
        getContentPane().add(label_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 340, 100, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Grado:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, -1, 20));

        boton_BuscarDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        boton_BuscarDocente.setBorder(null);
        boton_BuscarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_BuscarDocenteActionPerformed(evt);
            }
        });
        getContentPane().add(boton_BuscarDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 30, 30));

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

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        // AGREGAR DATOS DE UN NUEVO PROFESOR:
    int  contador=0;
    String GradoTutoria,NivelTutoria,EstadoTutoria,ObservacionesTutoria;
    EstadoTutoria=txt_estadoTutoria.getText().trim();
    GradoTutoria   =cmb_grado.getSelectedItem().toString();
    NivelTutoria   =cmb_Nivel.getSelectedItem().toString();
        
         // vaidamos que no existan campos en blanco
   
        if(cmb_genero1.getSelectedItem().equals("Seleccionar"))
        {
            JOptionPane.showMessageDialog(null, "Falta seleccionar Género");
            contador++;
        }
        if(cmb_Nivel.getSelectedItem().equals("Seleccionar"))
        {
            JOptionPane.showMessageDialog(null, "Falta seleccionar Género");
            contador++;
        }
        if(cmb_grado.getSelectedItem().equals("Seleccionar"))
        {
            JOptionPane.showMessageDialog(null, "Falta seleccionar Género");
            contador++;
        }
         if(EstadoTutoria.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta ingresar estado de la Tutoría");
            txt_estadoTutoria.requestFocus();
            txt_estadoTutoria.setBackground(new Color(255,255,255));
            contador++;
        }
         
        // Cuando todos los campos estan llenados
        if(contador==0)
        {  // pregusntar si se desea guardar la actualizacion
            String validarDni="null";
            try
            {
                
                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1= cn1.prepareStatement("select Dni_doc from tabla_docentes where Dni_doc ='"+txt_dni.getText().trim()+"'");
                ResultSet resul1=pst1.executeQuery();
                if(resul1.next())
                {
                 validarDni=resul1.getString("Dni_doc");
                }
                 cn1.close();
            }catch (Exception e) {}
          if(validarDni.equals(txt_dni.getText().trim())){
         
            int mensaje=JOptionPane.showConfirmDialog(null,"Guardar Registro",null,JOptionPane.YES_NO_OPTION);
            if(mensaje==JOptionPane.YES_OPTION)
            {
              try
             {
                 //AGREGAR DATOS A LA TABLA DE TUTORIAS                         
             Connection cn2=Conexion.Conectar();
             PreparedStatement pst2= cn2.prepareStatement("insert into tabla_tutorias values (?,?,?,?,?,?,?,?,?)");
             pst2.setInt(1,0);
             pst2.setString(2,txt_dni.getText().trim());
             pst2.setString(3,txt_nombre.getText().trim());
             pst2.setString(4,txt_apellidos.getText().trim());
             pst2.setString(5,GradoTutoria );
             pst2.setString(6,NivelTutoria);
             pst2.setString(7,EstadoTutoria);
             pst2.setString(8,txt_observacionesTuroria.getText().trim());
             pst2.setString(9,label_fecha.getText());
             pst2.executeUpdate();
             cn2.close();
             }
        catch (SQLException ex) {JOptionPane.showMessageDialog(null, "Error al registrar Datos \n contacte al Administrador","",JOptionPane.WARNING_MESSAGE);
             System.err.println("error al registrar nuevo Docente: "+ex);}
              
             //ACTUALIZAR DATOS EN LA TABLA DE DOCENTES  
             try
             {
             Connection cn3=Conexion.Conectar();
             PreparedStatement pst3= cn3.prepareStatement("update tabla_Docentes set Tutoria where Dni_doc='"+txt_dni.getText().trim()+"'");
             pst3.setString(1,"Si");
             pst3.executeUpdate();
             cn3.close(); 
              }
        catch (SQLException ex) {JOptionPane.showMessageDialog(null, "Error al registrar Datos \n contacte al Administrador","",JOptionPane.WARNING_MESSAGE);
             System.err.println("error al registrar nuevo Docente: "+ex);}
             // preguntar si desea generar un nuevo registro
             int mensaje2=JOptionPane.showConfirmDialog(null,"Registro exitoso continuar [S/N]:",null,JOptionPane.YES_NO_OPTION);
             if(mensaje==JOptionPane.YES_OPTION)
             {// recuperadmos metodo para blanquiar campos
             LimpiarCampos();
             }else{
             ListaDocentes listaDocentes=new ListaDocentes();
             listaDocentes.setVisible(true);
             this.dispose();
             }
             
             }else
             {// si no se desea gabra nuevo producto
             JOptionPane.showMessageDialog(null, "REGISTRO CANCELADO");
             }
             }else{// validar s desea guardar producto
              JOptionPane.showMessageDialog(null, "Dni "+txt_dni.getText().trim()+" no registrado");
             }
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void boton_BuscarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_BuscarDocenteActionPerformed
        // TODO add your handling code here:
        String validarDni="0";
         try {
             
         Connection cn= Conexion.Conectar();
         PreparedStatement pst= cn.prepareStatement("select Dni_doc from tabla_docentes where Dni_doc ='"+txt_dni.getText().trim()+"'");
         ResultSet resul=pst.executeQuery(); 
         if(resul.next()){
            validarDni=resul.getString("Dni_doc");
         }
           cn.close();
         }catch (Exception e) {
                 }
         
         System.out.println("validar dni"+validarDni);
         System.out.println("txt dni"+txt_dni.getText().trim());
         if(validarDni.equals(txt_dni.getText().trim())){
         try {
             
         
         Connection cn2= Conexion.Conectar();
         PreparedStatement pst2= cn2.prepareStatement("select Dni_doc, Nombre_doc,Apellidos_doc,"
                 + "Genero_doc,Telf_doc,Correo_doc,Direccion_doc,Especialidad_doc,Estado_doc,"
                 + "Observaciones from tabla_docentes where Dni_doc='"+validarDni+"'");
         ResultSet resul2=pst2.executeQuery(); 
         if(resul2.next()){
           txt_dni.setText(resul2.getString("Dni_doc"));
           txt_nombre.setText(resul2.getString("Nombre_doc"));
           txt_apellidos.setText(resul2.getString("Apellidos_doc"));
           txt_correo.setText(resul2.getString("Correo_doc"));
           txt_direccion.setText(resul2.getString("Direccion_doc"));
           txt_telefono.setText(resul2.getString("Telf_doc"));
           txt_estado.setText(resul2.getString("Estado_doc"));
           txt_especialidad.setText(resul2.getString("Especialidad_doc"));
           txt_observaciones.setText(resul2.getString("Observaciones"));
           
           String genero=resul2.getString("Genero_doc");
           if(genero.equals("Masculino")){
               cmb_genero1.setSelectedIndex(1);
           }
           if(genero.equals("Femenino")){
               cmb_genero1.setSelectedIndex(2);
           }  
          
          cn2.close();
            }
        }catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error,al buscar información \n contacte al administrador");
            System.err.println("error al buscar docente de la tabla: "+e); }
         }    
      else{
          int mensaje=JOptionPane.showConfirmDialog(null,"no hay registro \n ¿Desea registrar Datos del Docente?",null,JOptionPane.YES_NO_OPTION);
          if(mensaje==JOptionPane.YES_OPTION)
          {
              NewDocente nuevoDocente= new NewDocente();
              nuevoDocente.setVisible(true);
          }
         
         } 
    }//GEN-LAST:event_boton_BuscarDocenteActionPerformed

    private void txt_observacionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_observacionesKeyReleased
        String texto=txt_observaciones.getText().trim();
        int Cantidad=texto.length();
        labelComentarioCaracter1.setText("* maximo 200/"+Integer.toString(Cantidad));          // TODO add your handling code here:
    }//GEN-LAST:event_txt_observacionesKeyReleased

    private void txt_observacionesTuroriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_observacionesTuroriaKeyReleased
        // TODO add your handling code here:
                String texto=txt_observacionesTuroria.getText().trim();
        int Cantidad=texto.length();
        labelComentarioCaracter2.setText("* maximo 200/"+Integer.toString(Cantidad));  
    }//GEN-LAST:event_txt_observacionesTuroriaKeyReleased

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
                new NewlDocenteTutorias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton boton_BuscarDocente;
    private javax.swing.JComboBox<String> cmb_Nivel;
    private javax.swing.JComboBox<String> cmb_genero1;
    private javax.swing.JComboBox<String> cmb_grado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelComentarioCaracter1;
    private javax.swing.JLabel labelComentarioCaracter2;
    private javax.swing.JLabel label_fecha;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_especialidad;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_estadoTutoria;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextArea txt_observaciones;
    private javax.swing.JTextArea txt_observacionesTuroria;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

 
 public void LimpiarCampos(){
 txt_apellidos.setText("");
 txt_correo.setText("");
 txt_direccion.setText("");
 txt_dni.setText("");
 txt_especialidad.setText("");
 txt_estado.setText("Activo");
 txt_estadoTutoria.setText("Activo");
 txt_nombre.setText("");
 txt_observaciones.setText("");
 txt_observacionesTuroria.setText("");
 txt_telefono.setText("");
 cmb_Nivel.setSelectedIndex(0);
 cmb_genero1.setSelectedIndex(0);
 cmb_grado.setSelectedIndex(0);
 }
}
