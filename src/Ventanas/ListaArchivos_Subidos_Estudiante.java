
package Ventanas;

import Clases.Conexion;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultTreeModel;

public class ListaArchivos_Subidos_Estudiante extends javax.swing.JFrame {

     String fecha;
     DefaultTableModel Model_TablaListaArchivos=new DefaultTableModel();
     
    public ListaArchivos_Subidos_Estudiante() {
        initComponents();
        setResizable(false);
        this.setLocationRelativeTo(null);
        Calendar cale= Calendar.getInstance();
        fecha=Integer.toString(cale.get(Calendar.DAY_OF_MONTH))+"/"+
                Integer.toString(cale.get(Calendar.MONDAY)+1)+"/"+
                Integer.toString(cale.get(Calendar.YEAR));
        String dniest=Login.usuario;
        String gradoActual="";
        try {
            Connection cn0= Conexion.Conectar();
            PreparedStatement pst0=cn0.prepareStatement("select Grado_Actual from tabla_estudiante where Dni_est='"+dniest+"'");
            ResultSet resul0=pst0.executeQuery();
            if(resul0.next())
            {
                gradoActual=resul0.getString("Grado_Actual");
            }
              cn0.close();
            } catch (Exception e) {}
        
        String[] Titulos={"Código","Descripción","Fecha"};
        try {
            String año= "%"+Integer.toString(cale.get(Calendar.YEAR))+"%";
            Connection cn= Conexion.Conectar();
            PreparedStatement pst=cn.prepareStatement("select codigo ,Descripcion,FechaRegistro from tabla_aprendizaje where Grado='"+gradoActual+"' and FechaRegistro like"+'"'+año+'"');
            ResultSet resul=pst.executeQuery();
            Model_TablaListaArchivos=new DefaultTableModel(null, Titulos);
            Tabla_listaArchivos=new JTable(Model_TablaListaArchivos);
            jScrollPane_tablalistaArchivos.setViewportView(Tabla_listaArchivos);
            while(resul.next())
            {Object [] columna= new Object[3];
                for(int i=0 ;i<3;i++)
                {
                    columna[i]=resul.getObject(i+1);
                }
                Model_TablaListaArchivos.addRow(columna);
            }
            // evento a la tabla
            Tabla_listaArchivos .addMouseListener(new MouseAdapter()
            {@Override
             public void mouseClicked(MouseEvent e)
             {
                 int filaPoin=Tabla_listaArchivos.rowAtPoint(e.getPoint());
                 if(filaPoin>-1)
                 {
                   String codigo=(String)Model_TablaListaArchivos.getValueAt(filaPoin,0);
                   txt_codigoMostrar.setText(codigo);
                   String descipcion=(String)Model_TablaListaArchivos.getValueAt(filaPoin,1);
                   txt_descripcion.setText(descipcion);
                 }
             }
            
            });
            
            cn.close();
            } catch (Exception e) {JOptionPane.showMessageDialog(null, "Error al Recuperar información de todos los archivos \n contacte al administrador",null, JOptionPane.WARNING_MESSAGE);
                            System.err.println("erro al recuperar todos los archivo almacenados en bd:"+e);  }
    
    
   // txt_descripcion.setEnabled(false);
   // txt_codigoMostrar.setEnabled(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Boton_descargar = new javax.swing.JButton();
        txt_codigoMostrar = new javax.swing.JTextField();
        label_FotoArchivo = new javax.swing.JLabel();
        jScrollPane_tablalistaArchivos = new javax.swing.JScrollPane();
        Tabla_listaArchivos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Boton_descargar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Boton_descargar.setForeground(new java.awt.Color(255, 0, 51));
        Boton_descargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Descargar.png"))); // NOI18N
        Boton_descargar.setText("Descargar");
        Boton_descargar.setBorder(null);
        Boton_descargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_descargarActionPerformed(evt);
            }
        });

        txt_codigoMostrar.setEditable(false);
        txt_codigoMostrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_codigoMostrar.setForeground(new java.awt.Color(255, 102, 0));
        txt_codigoMostrar.setText("       ");
        txt_codigoMostrar.setBorder(null);
        txt_codigoMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoMostrarActionPerformed(evt);
            }
        });

        label_FotoArchivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Tabla_listaArchivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Descripción", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane_tablalistaArchivos.setViewportView(Tabla_listaArchivos);

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lista de Archivos Almacenados ");

        txt_descripcion.setEditable(false);
        txt_descripcion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_descripcion.setForeground(new java.awt.Color(255, 102, 0));
        txt_descripcion.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane_tablalistaArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_FotoArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txt_codigoMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Boton_descargar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(label_FotoArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane_tablalistaArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_descargar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_codigoMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_descargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_descargarActionPerformed
        String codigo, descripcion;
        codigo=txt_codigoMostrar.getText().trim();
        descripcion=txt_descripcion.getText().trim();
        if(codigo.equals("")||descripcion.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Selecione un archivo de la tabla");
        }
        else{
        
        try {

        DescargarArchivo(codigo,descripcion);
              
        } catch (Exception e) 
        { JOptionPane.showMessageDialog(null, "Error al descargar archivo contacte al administrador",null, JOptionPane.WARNING_MESSAGE);
      System.err.println("erro al descargar archivo de la bd:"+e);  }
        }
//      ejecutar_archivoPDF(txt_codigoMostrar.getText().trim());
    }//GEN-LAST:event_Boton_descargarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        this.dispose();
           Listado_de_Aplicaciones_Estudiante principal= new Listado_de_Aplicaciones_Estudiante();
            principal.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void txt_codigoMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoMostrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(ListaArchivos_Subidos_Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaArchivos_Subidos_Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaArchivos_Subidos_Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaArchivos_Subidos_Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaArchivos_Subidos_Estudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_descargar;
    private javax.swing.JTable Tabla_listaArchivos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane_tablalistaArchivos;
    private javax.swing.JLabel label_FotoArchivo;
    private javax.swing.JTextField txt_codigoMostrar;
    private javax.swing.JTextField txt_descripcion;
    // End of variables declaration//GEN-END:variables

public void LimpiarCampos()
{
 txt_codigoMostrar.setText("");
}

    public void ejecutar_archivoPDF(String codigo) {

        byte[] b = null;

        try {
            Connection cn=Conexion.Conectar();
            PreparedStatement pst=cn.prepareStatement("select Archivo from tabla_aprendizaje where codigo='"+codigo+"'");
            ResultSet resul=pst.executeQuery();
            
            while(resul.next()) {
                b = resul.getBytes("Archivo");
            }
            InputStream bos = new ByteArrayInputStream(b);

            int tamanoInput = bos.available();
            byte[] datosPDF = new byte[tamanoInput];
            bos.read(datosPDF, 0, tamanoInput);
       String ruta=System.getProperty("user.home"); // ruta de consola  user.home/Desktop/Bv
  
            OutputStream out = new FileOutputStream(ruta+"/Desktop "+"new.pdf");
            out.write(datosPDF);

            //abrir archivo
            out.close();
            bos.close();
            pst.close();
            resul.close();
            cn.close();
            System.out.println("abriendo");

        } catch (IOException | NumberFormatException | SQLException ex) {
            System.out.println("Error al abrir archivo PDF " + ex.getMessage());
        }
    }
    //++++++++++++++++++++ segunda opcion *************
// descargar archivo
    public static void DescargarArchivo(String codigo, String descripcion)
    {
        try {
          
            Connection cn=Conexion.Conectar();
            PreparedStatement pst=cn.prepareStatement("select Archivo from tabla_aprendizaje where codigo='"+codigo+"'");
            ResultSet resul=pst.executeQuery();
            while(resul.next()) 
            {
                Blob blob = resul.getBlob("Archivo");
                InputStream is=blob.getBinaryStream();
                GuardarImagenDisco(is, descripcion);
                
            }
            cn.close();
            
        } catch (Exception e) {System.err.println("erro descrAgar archivo:"+e);   }
    }
    
    // guardar imagen
    public static void GuardarImagenDisco(InputStream x, String Descripcion) throws FileNotFoundException, IOException
    {
        try {
         
         String ruta=System.getProperty("user.home"); // ruta de consola  user.home/Desktop/Bv
    
        BufferedInputStream ingreso=new BufferedInputStream(x);
        BufferedOutputStream salida=new BufferedOutputStream(new FileOutputStream(ruta+"/Desktop/ "+Descripcion+".pdf"));
        byte[] bytes= new byte[8096];
        int len=0;
        while((len=ingreso.read(bytes))>0)
        {
            salida.write(bytes,0, len);
        }
        salida.flush();
        salida.close();
        ingreso.close();
        JOptionPane.showMessageDialog(null,"Archivo descargado con Exito \n"+ruta+"/Desktop ");
         Desktop.getDesktop().open(new File(ruta+"/Desktop/ "+Descripcion+".pdf"));// abrir el archivo automaticamente
        } catch (Exception e) {System.err.println("erro guardar archivo disco:"+e);      }
    }

}





