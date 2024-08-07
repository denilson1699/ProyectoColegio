
package Ventanas;

import Clases.Conexion;
import java.awt.Desktop;
import java.awt.Rectangle;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

// para el archivo excel
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ventana_DescargarExamenes extends javax.swing.JFrame {
    DefaultTableModel MODEL_RespustasExamenes= new     DefaultTableModel ();
  private final String ruta=System.getProperty("user.home");
    public Ventana_DescargarExamenes() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
      
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo_radioBoton = new javax.swing.ButtonGroup();
        label_tituloAsistencia_Estudiates = new javax.swing.JLabel();
        jScrollPane_Tabla_respuestasExamenes = new javax.swing.JScrollPane();
        Tabla_RespuestasExamenes = new javax.swing.JTable();
        Boton_DescargarExamen = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        Boton_Examenes = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        RB_examenResp_Libres = new javax.swing.JRadioButton();
        RB_EXAMEN_Alternativas = new javax.swing.JRadioButton();
        RB_EXAMEN_VF = new javax.swing.JRadioButton();
        jProgressBar1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        label_tituloAsistencia_Estudiates.setFont(new java.awt.Font("Broadway", 1, 18)); // NOI18N
        label_tituloAsistencia_Estudiates.setForeground(new java.awt.Color(102, 102, 0));
        label_tituloAsistencia_Estudiates.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_tituloAsistencia_Estudiates.setText("Ver Respuestas y Notas ");

        Tabla_RespuestasExamenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane_Tabla_respuestasExamenes.setViewportView(Tabla_RespuestasExamenes);

        Boton_DescargarExamen.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        Boton_DescargarExamen.setText("Descargar");
        Boton_DescargarExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_DescargarExamenActionPerformed(evt);
            }
        });

        jLabel1.setText("Código de Examen");

        txt_codigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Boton_Examenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        Boton_Examenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ExamenesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boton_Examenes)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(Boton_Examenes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Grupo_radioBoton.add(RB_examenResp_Libres);
        RB_examenResp_Libres.setText("Respuestas Libres");
        RB_examenResp_Libres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_examenResp_LibresActionPerformed(evt);
            }
        });

        Grupo_radioBoton.add(RB_EXAMEN_Alternativas);
        RB_EXAMEN_Alternativas.setText("Alternativas");
        RB_EXAMEN_Alternativas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_EXAMEN_AlternativasActionPerformed(evt);
            }
        });

        Grupo_radioBoton.add(RB_EXAMEN_VF);
        RB_EXAMEN_VF.setText("Verdadedor/Falso");
        RB_EXAMEN_VF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_EXAMEN_VFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RB_EXAMEN_VF)
                .addGap(18, 18, 18)
                .addComponent(RB_EXAMEN_Alternativas)
                .addGap(18, 18, 18)
                .addComponent(RB_examenResp_Libres)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RB_EXAMEN_Alternativas)
                    .addComponent(RB_EXAMEN_VF)
                    .addComponent(RB_examenResp_Libres))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jProgressBar1.setBackground(new java.awt.Color(240, 240, 240));
        jProgressBar1.setForeground(new java.awt.Color(204, 0, 0));
        jProgressBar1.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(label_tituloAsistencia_Estudiates, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Boton_DescargarExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(398, 398, 398)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane_Tabla_respuestasExamenes, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_tituloAsistencia_Estudiates)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane_Tabla_respuestasExamenes, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Boton_DescargarExamen)))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RB_EXAMEN_VFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_EXAMEN_VFActionPerformed


    }//GEN-LAST:event_RB_EXAMEN_VFActionPerformed

    private void RB_examenResp_LibresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_examenResp_LibresActionPerformed



    }//GEN-LAST:event_RB_examenResp_LibresActionPerformed

    private void RB_EXAMEN_AlternativasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_EXAMEN_AlternativasActionPerformed


    }//GEN-LAST:event_RB_EXAMEN_AlternativasActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

this.dispose();

    }//GEN-LAST:event_formWindowClosing

    private void Boton_ExamenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ExamenesActionPerformed
        String tabla=""; int contador=0;
   
        String codigo=txt_codigo.getText().trim();
        
        if(RB_EXAMEN_VF.isSelected())
        {
            tabla="tabla_examenes_vf";
            contador=0;
        }
        
        if(RB_EXAMEN_Alternativas.isSelected())
        {
            tabla="tabla_examen_alternativas";
            contador=0;
        }
        
        if(RB_examenResp_Libres.isSelected())
        {
            tabla="tabla_examen_respuestalibre";
            contador=0;
        }
            
        if(tabla.equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Seleciones un tipo de Examen");
            contador++;
        }
        
   
        if(codigo.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Ingreso código de  examen");
            contador++;
        }

        if(contador==0)
        {
            String[] titulos={"Código", "Descripcción", "Fecha","Dni","Nombre","Apellidos","Nota"};
            MODEL_RespustasExamenes=new DefaultTableModel(null,titulos);
            // buscar el la tabla de esmanes con alternativas
          
            try {
                Connection cn= Conexion.Conectar();
                PreparedStatement pst=cn.prepareStatement("select *from "+tabla+" where Codigo='"+codigo+"' ");
                String[] fila1= new String[7];
                ResultSet rs=pst.executeQuery();
                Tabla_RespuestasExamenes = new JTable(MODEL_RespustasExamenes);
                jScrollPane_Tabla_respuestasExamenes.setViewportView(Tabla_RespuestasExamenes);
        
                while(rs.next())
                {
                    fila1[0]=rs.getString("Codigo");
                    fila1[1]=rs.getString("Descripcion");
                    fila1[2]=rs.getString("Fecha");
                    fila1[3]=rs.getString("Dni");
                    fila1[4]=rs.getString("Nombre");
                    fila1[5]=rs.getString("Apellidos");
                    fila1[6]=rs.getString("Nota");
                    MODEL_RespustasExamenes.addRow(fila1);
                }
                cn.close();

                } catch (Exception e) {JOptionPane.showMessageDialog(null,"Error al recuprar Respuestas de examane");
                System.err.println("error, al recuperar respuestas "+e);}
        
            
    
    }

        
        
        
        
    }//GEN-LAST:event_Boton_ExamenesActionPerformed

    private void Boton_DescargarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_DescargarExamenActionPerformed

         try {
      
              HSSFWorkbook workbook=new HSSFWorkbook();
              HSSFSheet hoja=workbook.createSheet();
                 
              HSSFRow fila = hoja.createRow(0);
              fila.createCell(0).setCellValue("Código");
              fila.createCell(1).setCellValue("Descripcción");
              fila.createCell(2).setCellValue("Fecha");
              fila.createCell(3).setCellValue("Dni");
              fila.createCell(4).setCellValue("Nombre");
              fila.createCell(5).setCellValue("Apellidos");
              fila.createCell(6).setCellValue("Nota");
              
             // jProgressBar1.setMaximum(Tabla_RespuestasExamenes.getRowCount());
              HSSFRow filas;
              
              for(int i=0;i<Tabla_RespuestasExamenes.getRowCount();i++)
              {
                 
              filas = hoja.createRow((i+1));
              filas.createCell(0).setCellValue(Tabla_RespuestasExamenes.getValueAt(i,0).toString());
              filas.createCell(1).setCellValue(Tabla_RespuestasExamenes.getValueAt(i,1).toString());
              filas.createCell(2).setCellValue(Tabla_RespuestasExamenes.getValueAt(i,2).toString());
              filas.createCell(3).setCellValue(Tabla_RespuestasExamenes.getValueAt(i,3).toString());
              filas.createCell(4).setCellValue(Tabla_RespuestasExamenes.getValueAt(i,4).toString());
              filas.createCell(5).setCellValue(Tabla_RespuestasExamenes.getValueAt(i,5).toString());
              filas.createCell(6).setCellValue(Tabla_RespuestasExamenes.getValueAt(i,6).toString());
                    
              }
            try {
                workbook.write(new FileOutputStream(new File(ruta+"//Excel.xls")));
                Desktop.getDesktop().open(new File(ruta+"//Excel.xls"));
            } catch (Exception e) { System.err.println("erro al descarr datos de examenes:"+e); }
            
            jProgressBar1.setText("Se descargo Exitosamente las respuestas del examen");
             JOptionPane.showMessageDialog(null,""); 
        } catch (Exception e) {System.err.println("erro al descargar excel:"+e);     }
     
     /*   
         
        // CRAMOS UN NUEVO LIBRO
        Workbook libro = new XSSFWorkbook();
        
        // CREAMOS UNA HOJA
        Sheet hoja=libro.createSheet("Hoja1");
        
        // CREAMOS UNA FILA
        Row fila=hoja.createRow(0);
        
        // CREAMOS UNA CELDA
        Cell celda=fila.createCell(0);
        
        // AÑADIMOS EL TEXTO
        celda.setCellValue("UNO");
        
              fila.createCell(0).setCellValue("Código");
              fila.createCell(1).setCellValue("Descripcción");
              fila.createCell(2).setCellValue("Fecha");
              fila.createCell(3).setCellValue("Dni");
              fila.createCell(4).setCellValue("Nombre");
              fila.createCell(5).setCellValue("Apellidos");
              fila.createCell(6).setCellValue("Nota");
        //GUARDAR EL ARCHIVO
        //nombre del archivo
        String file="Examen.xlsx";
        try {
            FileOutputStream out=new FileOutputStream(file);
            libro.write(out);
            out.close();
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ventana_DescargarExamenes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.err.println("error desacrar excel: "+ex);;
        }
        
        */
       

    }//GEN-LAST:event_Boton_DescargarExamenActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_DescargarExamenes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_DescargarExamen;
    private javax.swing.JButton Boton_Examenes;
    private javax.swing.ButtonGroup Grupo_radioBoton;
    private javax.swing.JRadioButton RB_EXAMEN_Alternativas;
    private javax.swing.JRadioButton RB_EXAMEN_VF;
    private javax.swing.JRadioButton RB_examenResp_Libres;
    private javax.swing.JTable Tabla_RespuestasExamenes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jProgressBar1;
    private javax.swing.JScrollPane jScrollPane_Tabla_respuestasExamenes;
    private javax.swing.JLabel label_tituloAsistencia_Estudiates;
    private javax.swing.JTextField txt_codigo;
    // End of variables declaration//GEN-END:variables
}
