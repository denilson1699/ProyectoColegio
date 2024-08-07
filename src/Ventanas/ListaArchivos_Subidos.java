
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

public class ListaArchivos_Subidos extends javax.swing.JFrame {

     String fecha;
     DefaultTableModel Model_TablaListaArchivos=new DefaultTableModel();
     
    public ListaArchivos_Subidos() {
        initComponents();
        setResizable(false);
        this.setLocationRelativeTo(null);
        Calendar cale= Calendar.getInstance();
        fecha=Integer.toString(cale.get(Calendar.DAY_OF_MONTH))+"/"+
                Integer.toString(cale.get(Calendar.MONDAY)+1)+"/"+
                Integer.toString(cale.get(Calendar.YEAR));
        String[] Titulos={"Código","Descripción","Fecha"};
        try {
            Connection cn= Conexion.Conectar();
            PreparedStatement pst=cn.prepareStatement("select codigo ,Descripcion,FechaRegistro from tabla_aprendizaje");
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
        txt_codigo = new javax.swing.JTextField();
        jScrollPane_tablalistaArchivos = new javax.swing.JScrollPane();
        Tabla_listaArchivos = new javax.swing.JTable();
        cmb_tipo = new javax.swing.JComboBox<>();
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

        txt_codigo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_codigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_codigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_codigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoKeyTyped(evt);
            }
        });

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

        cmb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Descripcion", "Fecha" }));
        cmb_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_tipoActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_codigoMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(Boton_descargar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane_tablalistaArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_FotoArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmb_tipo)
                    .addComponent(txt_codigo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_FotoArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane_tablalistaArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_descargar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_codigoMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
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

    private void txt_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyTyped

    }//GEN-LAST:event_txt_codigoKeyTyped

    private void txt_codigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyReleased
   try
        {// en texto escrito a consultar en la tabla
            String texto="%"+txt_codigo.getText().trim()+"%";

            // secuberra el tipo de filtro
            String filtroSelec=cmb_tipo.getSelectedItem().toString();

            // ETIQUETAS DE EMCABEZADO DE TABLA
            String[] titulos={"Código", "Descripcción", "Fecha"};
            Model_TablaListaArchivos=new DefaultTableModel(null,titulos);

            // FUNCIONES DEPENDIENDO DEL TIPO DE FILTRO ELEGIDO
            switch (filtroSelec)
            {//*********** FILTRO PARA NOMBRE DE CLIENTES ************
                case"Codigo":

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1= cn1.prepareStatement("select codigo ,Descripcion,FechaRegistro from tabla_aprendizaje where codigo like"+'"'+texto+'"');
                String[] fila1= new String[3];
                ResultSet resul1=pst1.executeQuery();
                Tabla_listaArchivos = new JTable(Model_TablaListaArchivos);
                jScrollPane_tablalistaArchivos.setViewportView(Tabla_listaArchivos);

                //recuperar valores de BD A LA TABLA
                while(resul1.next())
                {
                    fila1[0]=resul1.getString("codigo");
                    fila1[1]=resul1.getString("Descripcion");
                    fila1[2]=resul1.getString("FechaRegistro");
                    Model_TablaListaArchivos.addRow(fila1);
                }
                cn1.close();

                // EVENTO EN LA TABLA
                Tabla_listaArchivos.addMouseListener(new MouseAdapter()
                    {
                        @Override
                        public void mouseClicked(MouseEvent e)
                        {// recuperar celda celecionada
                            int fila_poin=Tabla_listaArchivos.rowAtPoint(e.getPoint());
                            if(fila_poin>-1)
                            { //recuperar codigo de la celda celecionda
                                String CODIGO= (String)Model_TablaListaArchivos.getValueAt(fila_poin,0);
                                txt_codigoMostrar.setText(CODIGO);

                            }
                        }
                    });
                    break;
                    //********** FILTRO DE APELLIDOS DE CLIENTES **********
                    case"Descripcion":


                Connection cn2= Conexion.Conectar();
                PreparedStatement pst2= cn2.prepareStatement("select codigo ,Descripcion,FechaRegistro from tabla_aprendizaje where Descripcion like"+'"'+texto+'"');
                String[] fila2= new String[3];
                ResultSet resul2=pst2.executeQuery();
                Tabla_listaArchivos = new JTable(Model_TablaListaArchivos);
                jScrollPane_tablalistaArchivos.setViewportView(Tabla_listaArchivos);

                //recuperar valores de BD A LA TABLA
                while(resul2.next())
                {
                    fila2[0]=resul2.getString("codigo");
                    fila2[1]=resul2.getString("Descripcion");
                    fila2[2]=resul2.getString("FechaRegistro");
                    Model_TablaListaArchivos.addRow(fila2);
                }
                cn2.close();

                // EVENTO EN LA TABLA
                Tabla_listaArchivos.addMouseListener(new MouseAdapter()
                    {
                        @Override
                        public void mouseClicked(MouseEvent e)
                        {// recuperar celda celecionada
                            int fila_poin=Tabla_listaArchivos.rowAtPoint(e.getPoint());
                            if(fila_poin>-1)
                            { //recuperar codigo de la celda celecionda
                                String CODIGO= (String)Model_TablaListaArchivos.getValueAt(fila_poin,0);
                                txt_codigoMostrar.setText(CODIGO);

                            }
                        }
                    });
                        break;

                        case"Fecha":

                            Connection cn3= Conexion.Conectar();
                PreparedStatement pst3= cn3.prepareStatement("select codigo ,Descripcion,FechaRegistro from tabla_aprendizaje where FechaRegistro like"+'"'+texto+'"');
                String[] fila3= new String[3];
                ResultSet resul3=pst3.executeQuery();
                Tabla_listaArchivos = new JTable(Model_TablaListaArchivos);
                jScrollPane_tablalistaArchivos.setViewportView(Tabla_listaArchivos);

                //recuperar valores de BD A LA TABLA
                while(resul3.next())
                {
                    fila3[0]=resul3.getString("codigo");
                    fila3[1]=resul3.getString("Descripcion");
                    fila3[2]=resul3.getString("FechaRegistro");
                    Model_TablaListaArchivos.addRow(fila3);
                }
                cn3.close();

                // EVENTO EN LA TABLA
                Tabla_listaArchivos.addMouseListener(new MouseAdapter()
                    {
                        @Override
                        public void mouseClicked(MouseEvent e)
                        {// recuperar celda celecionada
                            int fila_poin=Tabla_listaArchivos.rowAtPoint(e.getPoint());
                            if(fila_poin>-1)
                            { //recuperar codigo de la celda celecionda
                                String CODIGO= (String)Model_TablaListaArchivos.getValueAt(fila_poin,0);
                                txt_codigoMostrar.setText(CODIGO);

                            }
                        }
                    });
                   break;
                       
            }

                    } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error al filtar "+cmb_tipo.getSelectedItem().toString()+"","",JOptionPane.ERROR_MESSAGE);
                        System.err.println("error al filtar la busqueda: "+e); }         


    }//GEN-LAST:event_txt_codigoKeyReleased

    private void cmb_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_tipoActionPerformed
        txt_codigo.requestFocus();

    }//GEN-LAST:event_cmb_tipoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        this.dispose();
        VentanaPrinciapal_Aprendizaje mensajero= new VentanaPrinciapal_Aprendizaje();
        mensajero.setVisible(true);
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
            java.util.logging.Logger.getLogger(ListaArchivos_Subidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaArchivos_Subidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaArchivos_Subidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaArchivos_Subidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaArchivos_Subidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_descargar;
    private javax.swing.JTable Tabla_listaArchivos;
    private javax.swing.JComboBox<String> cmb_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane_tablalistaArchivos;
    private javax.swing.JLabel label_FotoArchivo;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_codigoMostrar;
    private javax.swing.JTextField txt_descripcion;
    // End of variables declaration//GEN-END:variables

public void LimpiarCampos()
{
 txt_codigo.setText("");
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





