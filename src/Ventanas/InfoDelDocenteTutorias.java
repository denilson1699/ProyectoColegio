
package Ventanas;

import Clases.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class InfoDelDocenteTutorias extends javax.swing.JFrame {
    String dniTablaDocentes, nombreTablaDocentes, apellidoTablaDocentes, id_tutoria;
    
           
    public InfoDelDocenteTutorias() {
    initComponents();
    setLocationRelativeTo(null);
    this.setResizable(false);

    dniTablaDocentes =ListaDocentes.dniTablaDocentes;
    nombreTablaDocentes=ListaDocentes.nombreTablaDocentes;
    apellidoTablaDocentes=ListaDocentes.apellidoTablaDocentes;
    label_titulo.setText("Información del Docente \n"+nombreTablaDocentes+" "+ apellidoTablaDocentes);
        
    // recuperamos y mostramos la infromacion del docente elegido
    BuscardorDeClientes(dniTablaDocentes);
    txt_nombre.requestFocus();
     txt_dni.setEnabled(false);
     
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
        boton_actualizar = new javax.swing.JButton();
        Boton_eliminar = new javax.swing.JButton();
        txt_dni = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        boton_editar = new javax.swing.JButton();
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
        label_fecha = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        label_idTutoria = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

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
        jLabel9.setText("Observaciones");
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

        boton_actualizar.setText("Actualizar Datos");
        boton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(boton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, -1, -1));

        Boton_eliminar.setBackground(new java.awt.Color(250, 150, 150));
        Boton_eliminar.setText("Eliminar Datos");
        Boton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, -1));

        txt_dni.setBackground(new java.awt.Color(240, 240, 240));
        txt_dni.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_dni.setForeground(new java.awt.Color(204, 0, 0));
        txt_dni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_dni.setBorder(null);
        getContentPane().add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 86, 150, 20));

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

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Nivel:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, -1, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Grado:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, -1, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Observaciones");
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
        getContentPane().add(labelComentarioCaracter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        labelComentarioCaracter2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelComentarioCaracter2.setForeground(new java.awt.Color(255, 0, 0));
        labelComentarioCaracter2.setText("* maximo 200 caracteres");
        getContentPane().add(labelComentarioCaracter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 340, -1, -1));

        txt_estadoTutoria.setBackground(new java.awt.Color(240, 240, 240));
        txt_estadoTutoria.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_estadoTutoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_estadoTutoria.setText("Activo");
        txt_estadoTutoria.setBorder(null);
        getContentPane().add(txt_estadoTutoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 280, 106, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Estado:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 280, -1, 20));

        label_fecha.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        label_fecha.setForeground(new java.awt.Color(153, 0, 0));
        label_fecha.setText("jLabel17");
        getContentPane().add(label_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 240, 100, 20));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Fecha Tutoria:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 240, -1, 20));

        label_idTutoria.setText("jLabel18");
        getContentPane().add(label_idTutoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel18.setText("Id_Tutoria:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_editarActionPerformed
        // TODO add your handling code here:
     txt_dni.setEnabled(true);
    }//GEN-LAST:event_boton_editarActionPerformed

    private void boton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_actualizarActionPerformed
        // PARA ACTUALIZAR DATOS DEL DOCENTE:
        String Dni_doc  ,Nombre_doc,Apellidos_doc,Genero_doc,Telf_doc,Correo_doc,Direccion_doc,Especialidad_doc,Estado_doc,Observaciones;
        int  contador=0;
        String GradoTutoria,NivelTutoria,EstadoTutoria,ObservacionesTutoria;
        // recuperadmos datos de los jtextfield
        Dni_doc      =txt_dni.getText().trim();
        Nombre_doc   =txt_nombre.getText().trim();
        Apellidos_doc =txt_apellidos.getText().trim();
        Genero_doc   =cmb_genero1.getSelectedItem().toString();
        Telf_doc     =txt_telefono.getText().trim();
        Correo_doc   =txt_correo.getText().trim();
        Direccion_doc =txt_direccion.getText().trim();
        Especialidad_doc=txt_especialidad.getText().trim();
        Estado_doc   =txt_estado.getText().trim();
        EstadoTutoria=txt_estadoTutoria.getText().trim();
        NivelTutoria   =cmb_Nivel.getSelectedItem().toString();
        GradoTutoria   =cmb_grado.getSelectedItem().toString();
        
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
            txt_telefono.requestFocus();
            txt_telefono.setBackground(new Color(255,255,255));
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
        if(Especialidad_doc.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta ingresar la Especialidad");
            txt_especialidad.requestFocus();
            txt_especialidad.setBackground(new Color(255,255,255));
            contador++;
        }
        if(Estado_doc.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta ingresar el Estado");
            txt_estado.requestFocus();
            txt_estado.setBackground(new Color(255,255,255));
            contador++;
        }
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
        
        
        if(contador==0)
        {  // pregusntar si se desea guardar la actualizacion
            int mensaje=JOptionPane.showConfirmDialog(null,"¿Conservar Cambio?",null,JOptionPane.YES_NO_OPTION);
            if(mensaje==JOptionPane.YES_OPTION)
            {
                // ACTUALIZAR DATOS DEL DOCENTE
                try {
                    Connection cn=Conexion.Conectar();
                    PreparedStatement pst = cn.prepareStatement("update tabla_docentes set Dni_doc=?,Nombre_doc=?,Apellidos_doc=?,"
                        + "Genero_doc=?,Telf_doc=?,Correo_doc=?,Direccion_doc=?,Especialidad_doc=?,Estado_doc=?,Observaciones=? where Dni_doc ='"+dniTablaDocentes+"'");
                    pst.setString(1,Dni_doc);
                    pst.setString(2,Nombre_doc);
                    pst.setString(3,Apellidos_doc );
                    pst.setString(4,Genero_doc);
                    pst.setString(5,Telf_doc);
                    pst.setString(6,Correo_doc);
                    pst.setString(7,Direccion_doc);
                    pst.setString(8,Especialidad_doc);
                    pst.setString(9,Estado_doc);
                    pst.setString(10,txt_observaciones.getText().trim());
                    pst.executeUpdate();
                    cn.close();
                }catch (SQLException ex)
                {
                    JOptionPane.showMessageDialog(null, "Error al Actualizar datos del docente\n Contacte al Administrador","",JOptionPane.WARNING_MESSAGE);
                    System.err.println("error al actualizar datos docente: "+ex);
                }
                //ACTUALIZAR DATOS DE TUTORIA
                try {
                    Connection cn1=Conexion.Conectar();
                    PreparedStatement pst1 = cn1.prepareStatement("update tabla_tutorias set Id_Tutoria=?,Dni_doc=?,Grado=?,"
                        + "Nivel=?,Estado=?,Observaciones=? where Dni_doc ='"+dniTablaDocentes+"' and Id_Tutoria='"+label_idTutoria.getText()+"'");
                    pst1.setInt(1,0);
                    pst1.setString(2,Dni_doc);
                    pst1.setString(3,GradoTutoria );
                    pst1.setString(4,NivelTutoria);
                    pst1.setString(5,EstadoTutoria);
                    pst1.setString(6,txt_observacionesTuroria.getText().trim());
                    pst1.executeUpdate();
                    cn1.close();

                    JOptionPane.showMessageDialog(null,"Actualización exitosa");
                    ListaDocentes listadocentes = new ListaDocentes();
                    listadocentes.setVisible(true);

                    this.dispose();
                }catch (SQLException ex)
                {
                    JOptionPane.showMessageDialog(null, "Error al Actualizar datos tutoria\n Contacte al Administrador","",JOptionPane.WARNING_MESSAGE);
                    System.err.println("error al actualizar datos tutoria: "+ex);
                }

            }else
            {// no se desea actualizar datos
                JOptionPane.showMessageDialog(null, "ACTUALIZACIÓN CANCELADA");
            }
        }

    }//GEN-LAST:event_boton_actualizarActionPerformed

    private void Boton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_eliminarActionPerformed
        // ELIMINAR DATOS DEL DOCENTE:
        try {
            int mensaje=JOptionPane.showConfirmDialog(null,"¿Eliminar Datos del Docente?",null,JOptionPane.YES_NO_OPTION);
            if(mensaje==JOptionPane.YES_OPTION)
            {
                Connection cn=Conexion.Conectar();
                PreparedStatement pst=cn.prepareStatement("delete from tabla_docentes where Dni_doc=?");

                pst.setString(1,txt_dni.getText().trim());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                ListaDocentes listaDocentes = new ListaDocentes();
                listaDocentes.setVisible(true);
                this.dispose();
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar Datos \n Contacte al Administrador");
            System.err.println("error al eliminar registro: "+e);
        }
        // eliminar datos de la tutoria
        try {
            int mensaje=JOptionPane.showConfirmDialog(null,"¿Eliminar Datos De Tutoria?",null,JOptionPane.YES_NO_OPTION);
            if(mensaje==JOptionPane.YES_OPTION)
            {
                Connection cn=Conexion.Conectar();
                PreparedStatement pst=cn.prepareStatement("delete from tabla_tutorias where Dni_doc=?");

                pst.setString(1,txt_dni.getText().trim());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                ListaDocentes listaDocentes = new ListaDocentes();
                listaDocentes.setVisible(true);
                this.dispose();
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar Datos de Tutoria \n Contacte al Administrador");
            System.err.println("error al eliminar registro: "+e);
        }

    }//GEN-LAST:event_Boton_eliminarActionPerformed

    private void cmb_NivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_NivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_NivelActionPerformed

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

    private void txt_observacionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_observacionesKeyReleased
        String texto=txt_observaciones.getText().trim();
        int Cantidad=texto.length();
        labelComentarioCaracter1.setText("* maximo 200/"+Integer.toString(Cantidad));
       
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_observacionesKeyReleased

    private void txt_observacionesTuroriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_observacionesTuroriaKeyReleased
        String texto=txt_observacionesTuroria.getText().trim();
        int Cantidad=texto.length();
        labelComentarioCaracter2.setText("* maximo 200/"+Integer.toString(Cantidad));
       
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_observacionesTuroriaKeyReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoDelDocenteTutorias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_eliminar;
    private javax.swing.JButton boton_actualizar;
    private javax.swing.JButton boton_editar;
    private javax.swing.JComboBox<String> cmb_Nivel;
    private javax.swing.JComboBox<String> cmb_genero1;
    private javax.swing.JComboBox<String> cmb_grado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelComentarioCaracter1;
    private javax.swing.JLabel labelComentarioCaracter2;
    private javax.swing.JLabel label_fecha;
    private javax.swing.JLabel label_idTutoria;
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

 // METODO PARA ACTUALIZAR LA VENTADA DE INFROFROMACION DEL DOCENETE
 public void ActualizarVentana()
 {
     this.setVisible(false);
     InfoDelDocenteTutorias mensajero= new InfoDelDocenteTutorias();
     mensajero.setVisible(true);
 }
 
 // METODO PARA BUSACR Y MOSTAR DATOS DEL DOCENTE 
 public void BuscardorDeClientes(String dniUsuario){
    try {
         Connection cn= Conexion.Conectar();
         PreparedStatement pst= cn.prepareStatement("select Dni_doc, Nombre_doc,Apellidos_doc,"
                 + "Genero_doc,Telf_doc,Correo_doc,Direccion_doc,Especialidad_doc,Estado_doc,"
                 + "Observaciones from tabla_docentes where Dni_doc='"+dniUsuario+"'");
         ResultSet resul=pst.executeQuery(); 
         if(resul.next()){
           txt_dni.setText("  "+resul.getString("Dni_doc"));
           txt_nombre.setText("  "+resul.getString("Nombre_doc"));
           txt_apellidos.setText("  "+resul.getString("Apellidos_doc"));
           txt_correo.setText("  "+resul.getString("Correo_doc"));
           txt_direccion.setText("  "+resul.getString("Direccion_doc"));
           txt_telefono.setText("  "+resul.getString("Telf_doc"));
           txt_estado.setText("  "+resul.getString("Estado_doc"));
           txt_especialidad.setText("  "+resul.getString("Especialidad_doc"));
           txt_observaciones.setText(resul.getString("Observaciones"));
           
           String generoDocente=resul.getString("Genero_doc");             
           if(generoDocente.equals("Masculino")){
               cmb_genero1.setSelectedIndex(1);
           }
           if(generoDocente.equals("Femenino")){
               cmb_genero1.setSelectedIndex(2);
           }  
          cn.close();

         }}catch (Exception e) {
             JOptionPane.showMessageDialog(null, "no se encontro infromación del docente, contacte al administrador");
            System.err.println("error al buscar docente de la tabla: "+e);
            }
      try {
         Connection cn2= Conexion.Conectar();
         PreparedStatement pst2= cn2.prepareStatement("select Id_Tutoria, Estado,Observaciones,Nivel,Grado ,fecha_Tutoria from tabla_tutorias where Dni_doc='"+dniUsuario+"'");
         ResultSet resul2=pst2.executeQuery(); 
         if(resul2.next()){
           txt_estadoTutoria.setText(resul2.getString("Estado"));
           txt_observacionesTuroria.setText(resul2.getString("Observaciones"));
           label_fecha.setText(resul2.getString("fecha_Tutoria"));
           label_idTutoria.setText(resul2.getString("Id_Tutoria"));// recuperar id de tutoria
           
           String NivelTutoria=resul2.getString("Nivel");
           String GradoTutoria=resul2.getString("Grado");
           if(NivelTutoria.equals("Inicial")){
               cmb_Nivel.setSelectedIndex(1);
               if(GradoTutoria.equals("4 años")){
                  cmb_grado.setSelectedIndex(1);}
               if(GradoTutoria.equals("5 años")){
                  cmb_grado.setSelectedIndex(2);}
           }
           if(NivelTutoria.equals("Primaria")){
               cmb_Nivel.setSelectedIndex(2);
               if(GradoTutoria.equals("1er Primaria")){
                  cmb_grado.setSelectedIndex(1);}
               if(GradoTutoria.equals("2do Primaria")){
                  cmb_grado.setSelectedIndex(2);}
               if(GradoTutoria.equals("3er Primaria")){
                  cmb_grado.setSelectedIndex(3);}
               if(GradoTutoria.equals("4to Primarias")){
                  cmb_grado.setSelectedIndex(4);}
               if(GradoTutoria.equals("5to Primaria")){
                  cmb_grado.setSelectedIndex(5);}
               if(GradoTutoria.equals("6to Primaria")){
                  cmb_grado.setSelectedIndex(6);}  
           }
           if(NivelTutoria.equals("Secundaria")){
               cmb_Nivel.setSelectedIndex(3);
               if(GradoTutoria.equals("1er Secundaria")){
                  cmb_grado.setSelectedIndex(1);}
               if(GradoTutoria.equals("2do Secundaria")){
                  cmb_grado.setSelectedIndex(2);}
               if(GradoTutoria.equals("3er Secundaria")){
                  cmb_grado.setSelectedIndex(3);}
               if(GradoTutoria.equals("4to Secundaria")){
                  cmb_grado.setSelectedIndex(4);}
               if(GradoTutoria.equals("5to Secundaria")){
                  cmb_grado.setSelectedIndex(5);}
           } 
           
          cn2.close();
         }
    }catch (Exception e) {
             JOptionPane.showMessageDialog(null, "no se encontro información de Tutoria, contacte al administrador");
            System.err.println("error al buscar datos de Tutoria: "+e);
     }
 } 
}
