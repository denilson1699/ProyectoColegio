
package Ventanas;

import Clases.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VentanaPrinciapal_Aprendizaje extends javax.swing.JFrame {

     String fecha;

    public VentanaPrinciapal_Aprendizaje() {
        initComponents();
        setResizable(false);
        this.setLocationRelativeTo(null);
        Calendar cale= Calendar.getInstance();
        fecha=Integer.toString(cale.get(Calendar.DAY_OF_MONTH))+"/"+
                Integer.toString(cale.get(Calendar.MONDAY)+1)+"/"+
                Integer.toString(cale.get(Calendar.YEAR));
        txt_fecha.setText(fecha);
                
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Boton_subir = new javax.swing.JButton();
        txt_ruta = new javax.swing.JTextField();
        label_FotoArchivo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_desscripcion = new javax.swing.JTextField();
        txt_codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        boton_editarFecha = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_observaciones = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        labelComentarioCaracter = new javax.swing.JLabel();
        Boton_subirArchivo = new javax.swing.JButton();
        Label_NombreArchivo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cmb_Nivel = new javax.swing.JComboBox<>();
        cmb_grado = new javax.swing.JComboBox<>();
        cmb_curso = new javax.swing.JComboBox<>();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton_subir.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Boton_subir.setForeground(new java.awt.Color(255, 0, 51));
        Boton_subir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/subir.png"))); // NOI18N
        Boton_subir.setText("Subir");
        Boton_subir.setBorder(null);
        Boton_subir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_subirActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_subir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 75, -1));
        getContentPane().add(txt_ruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 309, -1));

        label_FotoArchivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(label_FotoArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 64, 45));

        jLabel2.setText("Descripción:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 108, -1, -1));

        txt_desscripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_desscripcionKeyTyped(evt);
            }
        });
        getContentPane().add(txt_desscripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 105, 392, -1));

        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 64, 90, -1));

        jLabel3.setText("Código:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 67, -1, -1));

        jLabel4.setText("Fecha:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 67, -1, -1));

        txt_fecha.setEditable(false);
        txt_fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fechaKeyTyped(evt);
            }
        });
        getContentPane().add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 64, 90, -1));

        boton_editarFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lapiz.png"))); // NOI18N
        boton_editarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_editarFechaActionPerformed(evt);
            }
        });
        getContentPane().add(boton_editarFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 64, 26, -1));

        txt_observaciones.setColumns(20);
        txt_observaciones.setRows(5);
        txt_observaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_observacionesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txt_observaciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 459, 58));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Observaciones/Comentario");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        labelComentarioCaracter.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelComentarioCaracter.setForeground(new java.awt.Color(255, 0, 0));
        labelComentarioCaracter.setText("* maximo 200 caracteres");
        getContentPane().add(labelComentarioCaracter, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        Boton_subirArchivo.setText("Subir Nuevo Archivo");
        Boton_subirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_subirArchivoActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_subirArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 190, 30));

        Label_NombreArchivo.setForeground(new java.awt.Color(153, 0, 0));
        Label_NombreArchivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Label_NombreArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 334, 11));

        jButton1.setText("Archivos Almacenados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        cmb_Nivel.setBackground(new java.awt.Color(51, 51, 255));
        cmb_Nivel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmb_Nivel.setForeground(new java.awt.Color(255, 255, 255));
        cmb_Nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-NIVEL-", "Inicial", "Primaria", "Secundaria" }));
        cmb_Nivel.setBorder(null);
        cmb_Nivel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        getContentPane().add(cmb_Nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        cmb_grado.setBackground(new java.awt.Color(51, 51, 255));
        cmb_grado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmb_grado.setForeground(new java.awt.Color(255, 255, 255));
        cmb_grado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-GRADO-" }));
        cmb_grado.setBorder(null);
        getContentPane().add(cmb_grado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 140, -1));

        cmb_curso.setBackground(new java.awt.Color(51, 51, 255));
        cmb_curso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmb_curso.setForeground(new java.awt.Color(255, 255, 255));
        cmb_curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-CURSO-" }));
        cmb_curso.setBorder(null);
        getContentPane().add(cmb_curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 170, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_subirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_subirActionPerformed
        // Recuperamos y mostramos la imagen selecionada en la pc
       JOptionPane.showMessageDialog(null,"recuerda que solo puedes subir PDF");
        FileNameExtensionFilter filtro=new FileNameExtensionFilter("Formatos de Archivo JPEG(*.JPG;*.JPEG;*.PDF;*.PPTX;*.DOCX)","jpg","jpeg","pdf","pptx","docx");
        JFileChooser archivo= new JFileChooser();
                
        archivo.addChoosableFileFilter(filtro);
        archivo.setDialogTitle("Abrir Archivo");
        File ruta=new File ("C:\\Users\\Usuario\\Desktop");
        archivo.setCurrentDirectory(ruta);
        int ventana=archivo.showOpenDialog(null);
        if(ventana==JFileChooser.APPROVE_OPTION)
        {
            File file=archivo.getSelectedFile();
            txt_ruta.setText(String.valueOf(file));
            String nombrerchivo=archivo.getSelectedFile().getName();
            Label_NombreArchivo.setText(nombrerchivo);
            ImageIcon imagenPerfilEst= new ImageIcon("src/imagenes/pdf.png");// crear objeto imagen
            Icon icono_fondo= new ImageIcon(imagenPerfilEst.getImage().getScaledInstance(label_FotoArchivo.getWidth(),
                label_FotoArchivo.getHeight(),Image.SCALE_DEFAULT ));// ajustar la imagen a las dimensiones del jlabel_fondo
        label_FotoArchivo.setIcon(icono_fondo);// insertar la imagenFondo
        this.repaint();//confirmar que la imagen se vea
        }

        // Guardamos la imagen en la base de datos

    }//GEN-LAST:event_Boton_subirActionPerformed

    private void txt_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyTyped
        if(txt_codigo.getText().length()>=8)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        
    }//GEN-LAST:event_txt_codigoKeyTyped

    private void txt_desscripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_desscripcionKeyTyped
        if(txt_desscripcion.getText().length()>=20)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        
    }//GEN-LAST:event_txt_desscripcionKeyTyped

    private void txt_fechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fechaKeyTyped
              if(txt_fecha.getText().length()>=10)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        
    }//GEN-LAST:event_txt_fechaKeyTyped

    private void boton_editarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_editarFechaActionPerformed
        txt_fecha.setEditable(true);
    }//GEN-LAST:event_boton_editarFechaActionPerformed

    private void txt_observacionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_observacionesKeyReleased
        // TODO add your handling code here:
        String texto=txt_observaciones.getText().trim();
        int Cantidad=texto.length();
        labelComentarioCaracter.setText("* maximo 200/"+Integer.toString(Cantidad));

    }//GEN-LAST:event_txt_observacionesKeyReleased

    private void Boton_subirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_subirArchivoActionPerformed
        // TODO add your handling code here:
        String Descripcion ,codigo ,FechaRegistro,comentario,Nivel,Grado,Curso;
        int contador=0;
        //datos del estudiante
        Descripcion=txt_desscripcion.getText().trim();
        codigo=txt_codigo.getText().trim();
        FechaRegistro=txt_fecha.getText().trim();
        comentario=txt_observaciones.getText().trim();
        
        if(txt_desscripcion.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta ingresar descripcion del archivo");
            txt_desscripcion.setBackground(new Color(250,150,150));
            contador++;
        }
        if(codigo.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta ingresar codigo para el archivo ");
            txt_codigo.requestFocus();
            txt_codigo.setBackground(new Color(250,150,150));
            contador++;
        }
        if(FechaRegistro.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar Nombre del estudiante ");
            txt_fecha.requestFocus();
            txt_fecha.setBackground(new Color(250,150,150));
            contador++;
        }
         Nivel=cmb_Nivel.getSelectedItem().toString();
        Grado=cmb_grado.getSelectedItem().toString();
        Curso=cmb_curso.getSelectedItem().toString();
        
        if(Nivel.equals("-NIVEL-"))
        {
            JOptionPane.showMessageDialog(null,"Selecione el nivel");
            contador++;
        }
        if(Grado.equals("-GRADO-"))
        {
            JOptionPane.showMessageDialog(null,"Selecione el Grado");
            contador++;
        }
        if(Curso.equals("-CURSO-"))
        {
            JOptionPane.showMessageDialog(null,"Selecione el Curso");
            contador++;
        }
        
        if(contador==0){
            try {
                String validarCodigo="";
                Connection cn1 =Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select codigo from tabla_aprendizaje where codigo='"+codigo+"'");
                ResultSet resul1=pst1.executeQuery();
                if(resul1.next())
                {
                    validarCodigo=resul1.getString("codigo");

                }
                if(validarCodigo.equals(codigo))
                {
                    JOptionPane.showMessageDialog(null, "Código "+codigo+" ya registrado",null, JOptionPane.WARNING_MESSAGE);
                    txt_codigo.requestFocus();
                    txt_codigo.setBackground(new Color(250,150,150));
                }
                else{
                    int mensaje=JOptionPane.showConfirmDialog(null,"Subir Nuevo Archivo",null,JOptionPane.YES_NO_OPTION);
                    if(mensaje==JOptionPane.YES_OPTION)
                    {
                        try{FileInputStream archivoFoto;
                            Connection cn2=Conexion.Conectar();
                            PreparedStatement pst2=cn2.prepareStatement("insert into tabla_aprendizaje values (?,?,?,?,?,?,?,?)");
                            pst2.setInt(1,0);
                            pst2.setString(2,codigo );
                            pst2.setString(3,Descripcion);
                            pst2.setString(4,comentario);
                            pst2.setString(5,FechaRegistro);
                            pst2.setString(6,Grado);
                            pst2.setString(7,Curso);
                            archivoFoto=new FileInputStream(txt_ruta.getText());
                            pst2.setBinaryStream(8,archivoFoto);
                            pst2.executeUpdate();
                            cn2.close();
                            // preguntar par volver a ingresar datos
                            int mensaje2=JOptionPane.showConfirmDialog(null,"Archivo guardao Exitosamente continuar [S/N]:",null,JOptionPane.YES_NO_OPTION);
                            if(mensaje==JOptionPane.YES_OPTION)
                            {
                                LimpiarCampos();
                            }
                        }catch(Exception e){JOptionPane.showMessageDialog(null, "Error al subir archivo \n contacte al administrador",null, JOptionPane.WARNING_MESSAGE);
                            System.err.println("erro al subir archivo nuevo:"+e);}
                    }

                    else
                    {
                        JOptionPane.showMessageDialog(null, "REGISTRO CANCELADO");
                    }
                }
            }catch (SQLException ex) {}

        }

    }//GEN-LAST:event_Boton_subirArchivoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        ListaArchivos_Subidos men=new ListaArchivos_Subidos();
        men.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        this.dispose();

    }//GEN-LAST:event_formWindowClosing

    private void cmb_NivelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_NivelItemStateChanged
        if(evt.getSource()==cmb_Nivel){

            cmb_grado.setEnabled(true);
            String seleccion=cmb_Nivel.getSelectedItem().toString();
            if(seleccion.equalsIgnoreCase("-NIVEL-")){
                cmb_grado.removeAllItems();
                cmb_grado.addItem("-GRADO-");
                cmb_grado.setEnabled(false);
            }else
            if(seleccion.equalsIgnoreCase("Primaria")){
                cmb_grado.removeAllItems();
                cmb_grado.addItem("-GRADO-");
                cmb_grado.addItem("1er Primaria");
                cmb_grado.addItem("2do Primaria");
                cmb_grado.addItem("3er Primaria");
                cmb_grado.addItem("4to Primaria");
                cmb_grado.addItem("5to Primaria");
                cmb_grado.addItem("6to Primaria");

                cmb_curso.removeAllItems();
                cmb_curso.addItem("-CURSO-");
                cmb_curso.addItem("Personal Social");
                cmb_curso.addItem("Educación Física");
                cmb_curso.addItem("Arte y cultura");
                cmb_curso.addItem("Comunicación");
                cmb_curso.addItem("Matemática");
                cmb_curso.addItem("Ciencia y Tecnología");
                cmb_curso.addItem("Educacíon Religiosa");
            }else
            if(seleccion.equalsIgnoreCase("Secundaria")){
                cmb_grado.removeAllItems();
                cmb_grado.addItem("-GRADO-");
                cmb_grado.addItem("1er Secundaria");
                cmb_grado.addItem("2do Secundaria");
                cmb_grado.addItem("3er Secundaria");
                cmb_grado.addItem("4to Secundaria");
                cmb_grado.addItem("5to Secundaria");

                cmb_curso.removeAllItems();
                cmb_curso.addItem("-CURSO-");
                cmb_curso.addItem("Matemática");
                cmb_curso.addItem("Comunicación");
                cmb_curso.addItem("Inglés");
                cmb_curso.addItem("Arte");
                cmb_curso.addItem("Historia, Geografía y Economía");
                cmb_curso.addItem("Formación Ciudadana y Cívica");
                cmb_curso.addItem("Persona, Familia y Relaciones Humanas");
                cmb_curso.addItem("Educación Física");
                cmb_curso.addItem("Educación Religiosa");
                cmb_curso.addItem("Ciencia, Tecnología y Ambiente");
                cmb_curso.addItem("Educación para el Trabajo");
            }else
            if(seleccion.equalsIgnoreCase("Inicial")){
                cmb_grado.removeAllItems();
                cmb_grado.addItem("-GRADO-");
                cmb_grado.addItem("4 años");
                cmb_grado.addItem("5 años");

                cmb_curso.removeAllItems();
                cmb_curso.addItem("-CURSO-");
                cmb_curso.addItem("curso 1");
                cmb_curso.addItem("curso 2");
                cmb_curso.addItem("curso 3");
            }
        }

    }//GEN-LAST:event_cmb_NivelItemStateChanged

    private void cmb_NivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_NivelActionPerformed

        cmb_curso.setEnabled(true);
        cmb_grado.setEnabled(true);
    }//GEN-LAST:event_cmb_NivelActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrinciapal_Aprendizaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrinciapal_Aprendizaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrinciapal_Aprendizaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrinciapal_Aprendizaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrinciapal_Aprendizaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_subir;
    private javax.swing.JButton Boton_subirArchivo;
    private javax.swing.JLabel Label_NombreArchivo;
    private javax.swing.JButton boton_editarFecha;
    private javax.swing.JComboBox<String> cmb_Nivel;
    private javax.swing.JComboBox<String> cmb_curso;
    private javax.swing.JComboBox<String> cmb_grado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelComentarioCaracter;
    private javax.swing.JLabel label_FotoArchivo;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_desscripcion;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextArea txt_observaciones;
    private javax.swing.JTextField txt_ruta;
    // End of variables declaration//GEN-END:variables

public void LimpiarCampos()
{
 txt_codigo.setText("");
 txt_desscripcion.setText("");
 txt_fecha.setText(fecha);
 txt_observaciones.setText("");
 txt_ruta.setText("");
 Label_NombreArchivo.setText("");
 cmb_Nivel.setSelectedIndex(0);
 cmb_curso.setSelectedIndex(0);
 cmb_grado.setSelectedIndex(0);
}


}
