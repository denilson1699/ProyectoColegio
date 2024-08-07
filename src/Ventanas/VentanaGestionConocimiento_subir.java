
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

public class VentanaGestionConocimiento_subir extends javax.swing.JFrame {

     String fecha;

    public VentanaGestionConocimiento_subir() {
        initComponents();
        setResizable(false);
        this.setLocationRelativeTo(null);
        Calendar cale= Calendar.getInstance();
        fecha=Integer.toString(cale.get(Calendar.DAY_OF_MONTH))+"/"+
                Integer.toString(cale.get(Calendar.MONDAY)+1)+"/"+
                Integer.toString(cale.get(Calendar.YEAR));
        txt_fecha.setText(fecha);
        
        label_FotoArchivo.setVisible(false);
                
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        boton_editarFecha = new javax.swing.JButton();
        Boton_subir = new javax.swing.JButton();
        txt_ruta = new javax.swing.JTextField();
        label_FotoArchivo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_descripcion = new javax.swing.JTextArea();
        label_tituloAsistencia_Estudiates = new javax.swing.JLabel();
        labelComentarioCaracter = new javax.swing.JLabel();
        Label_NombreArchivo = new javax.swing.JLabel();
        Boton_subirArchivo = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Fecha:");

        txt_fecha.setEditable(false);
        txt_fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fechaKeyTyped(evt);
            }
        });

        boton_editarFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lapiz.png"))); // NOI18N
        boton_editarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_editarFechaActionPerformed(evt);
            }
        });

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

        txt_ruta.setBackground(new java.awt.Color(204, 204, 204));
        txt_ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rutaActionPerformed(evt);
            }
        });

        label_FotoArchivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Descripción:");

        txt_descripcion.setColumns(20);
        txt_descripcion.setRows(5);
        txt_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_descripcionKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txt_descripcion);

        label_tituloAsistencia_Estudiates.setFont(new java.awt.Font("Broadway", 1, 18)); // NOI18N
        label_tituloAsistencia_Estudiates.setForeground(new java.awt.Color(102, 102, 0));
        label_tituloAsistencia_Estudiates.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_tituloAsistencia_Estudiates.setText("Subir nuevo Archivo PDF");

        labelComentarioCaracter.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelComentarioCaracter.setForeground(new java.awt.Color(255, 0, 0));
        labelComentarioCaracter.setText("*");

        Label_NombreArchivo.setForeground(new java.awt.Color(153, 0, 0));
        Label_NombreArchivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(263, 263, 263)
                                    .addComponent(jLabel4)
                                    .addGap(4, 4, 4)
                                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(boton_editarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelComentarioCaracter, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Label_NombreArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_ruta, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Boton_subir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(label_tituloAsistencia_Estudiates, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(label_FotoArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(label_tituloAsistencia_Estudiates)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_editarFecha))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelComentarioCaracter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_subir)
                    .addComponent(txt_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_NombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(label_FotoArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 510, -1));

        Boton_subirArchivo.setText("Subir Archivo");
        Boton_subirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_subirArchivoActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_subirArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_subirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_subirActionPerformed
    
            label_FotoArchivo.setVisible(true);
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

    private void Boton_subirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_subirArchivoActionPerformed
        // TODO add your handling code here:
        String Descripcion , FechaRegistro;
        int contador=0;
        //datos del estudiante
        Descripcion=txt_descripcion.getText().trim();
        FechaRegistro=txt_fecha.getText().trim();
        
        if(txt_descripcion.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta ingresar descripcion del archivo");
            txt_descripcion.requestFocus();
            txt_descripcion.setBackground(new Color(250,150,150));
            contador++;
        }
        if(txt_ruta.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta Selecionar un archivo PDF");
            txt_ruta.requestFocus();
            txt_ruta.setBackground(new Color(250,150,150));
            contador++;
        }
        if(FechaRegistro.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar fecha");
            txt_fecha.setBackground(new Color(250,150,150));
            contador++;
        }
        
        if(contador==0){
            
                    int mensaje=JOptionPane.showConfirmDialog(null,"Subir Nuevo Archivo",null,JOptionPane.YES_NO_OPTION);
                    if(mensaje==JOptionPane.YES_OPTION)
                    {
                        try{FileInputStream archivoFoto;
                            Connection cn2=Conexion.Conectar();
                            PreparedStatement pst2=cn2.prepareStatement("insert into tabla_geston_conocimiento values (?,?,?,?)");
                            pst2.setInt(1,0);
                            pst2.setString(2,Descripcion );
                            pst2.setString(3,FechaRegistro);
                            archivoFoto=new FileInputStream(txt_ruta.getText());
                            pst2.setBinaryStream(4,archivoFoto);
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

        

    }//GEN-LAST:event_Boton_subirArchivoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();

    }//GEN-LAST:event_formWindowClosing

    private void txt_rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rutaActionPerformed

    private void txt_descripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_descripcionKeyReleased
        String texto=txt_descripcion.getText().trim();
        int Cantidad=texto.length();
        labelComentarioCaracter.setText("* 100/"+Integer.toString(Cantidad));

        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descripcionKeyReleased

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
            java.util.logging.Logger.getLogger(VentanaGestionConocimiento_subir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaGestionConocimiento_subir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaGestionConocimiento_subir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaGestionConocimiento_subir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaGestionConocimiento_subir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_subir;
    private javax.swing.JButton Boton_subirArchivo;
    private javax.swing.JLabel Label_NombreArchivo;
    private javax.swing.JButton boton_editarFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelComentarioCaracter;
    private javax.swing.JLabel label_FotoArchivo;
    private javax.swing.JLabel label_tituloAsistencia_Estudiates;
    private javax.swing.JTextArea txt_descripcion;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_ruta;
    // End of variables declaration//GEN-END:variables

public void LimpiarCampos()
{
 txt_fecha.setText(fecha);
 txt_fecha.setBackground(new Color(255,255,255));
 txt_descripcion.setText("");
 txt_descripcion.setBackground(new Color(255,255,255));
 txt_ruta.setText("");
 txt_ruta.setBackground(new Color(255,255,255));
 Label_NombreArchivo.setText("");
 labelComentarioCaracter.setText("");
 label_FotoArchivo.setVisible(false);
 
}


}
