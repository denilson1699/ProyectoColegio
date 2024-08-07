
package Ventanas;

import Clases.Conexion;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


public class ModificarAsistenciaDocente extends javax.swing.JFrame {
    DefaultTableModel MODEL_TABLA_ESTUDIANTES =new DefaultTableModel();
    
    int pase=0; String GradoBuscarCMBox;
    public ModificarAsistenciaDocente() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        
        
        
       
         Boton_actualizarAsistenciaEST.setVisible(true);

    
        panel_BuscarAsistenciaDocentes.setVisible(true);
        reuperarListaEstudiante();
         
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_BuscarAsistenciaDocentes = new javax.swing.JPanel();
        txt_filtro = new javax.swing.JTextField();
        jcmb_tipoFiltro = new javax.swing.JComboBox<>();
        Boton_BuscarFechaDocentes = new javax.swing.JButton();
        txt_fechaAsistenciaDocentes = new com.toedter.calendar.JDateChooser();
        label_tituloAsistencia_Estudiates = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA_ASISTENCIA_ESTUDIANTES = new javax.swing.JTable();
        Boton_actualizarAsistenciaEST = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        txt_filtro.setBackground(new java.awt.Color(255, 255, 204));
        txt_filtro.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_filtro.setForeground(new java.awt.Color(0, 102, 102));
        txt_filtro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_filtro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtroActionPerformed(evt);
            }
        });
        txt_filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroKeyReleased(evt);
            }
        });

        jcmb_tipoFiltro.setBackground(new java.awt.Color(0, 51, 51));
        jcmb_tipoFiltro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcmb_tipoFiltro.setForeground(new java.awt.Color(255, 255, 255));
        jcmb_tipoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Nombre", "Apellidos" }));
        jcmb_tipoFiltro.setBorder(null);
        jcmb_tipoFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcmb_tipoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_tipoFiltroActionPerformed(evt);
            }
        });

        Boton_BuscarFechaDocentes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Boton_BuscarFechaDocentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        Boton_BuscarFechaDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_BuscarFechaDocentesActionPerformed(evt);
            }
        });

        txt_fechaAsistenciaDocentes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_fechaAsistenciaDocentesFocusGained(evt);
            }
        });
        txt_fechaAsistenciaDocentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_fechaAsistenciaDocentesMouseClicked(evt);
            }
        });

        label_tituloAsistencia_Estudiates.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        label_tituloAsistencia_Estudiates.setForeground(new java.awt.Color(102, 102, 0));
        label_tituloAsistencia_Estudiates.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_tituloAsistencia_Estudiates.setText("Asistencia");

        TABLA_ASISTENCIA_ESTUDIANTES.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TABLA_ASISTENCIA_ESTUDIANTES);

        Boton_actualizarAsistenciaEST.setBackground(new java.awt.Color(0, 51, 153));
        Boton_actualizarAsistenciaEST.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Boton_actualizarAsistenciaEST.setForeground(new java.awt.Color(255, 255, 255));
        Boton_actualizarAsistenciaEST.setText("Actulizar");
        Boton_actualizarAsistenciaEST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_actualizarAsistenciaESTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_BuscarAsistenciaDocentesLayout = new javax.swing.GroupLayout(panel_BuscarAsistenciaDocentes);
        panel_BuscarAsistenciaDocentes.setLayout(panel_BuscarAsistenciaDocentesLayout);
        panel_BuscarAsistenciaDocentesLayout.setHorizontalGroup(
            panel_BuscarAsistenciaDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_BuscarAsistenciaDocentesLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(panel_BuscarAsistenciaDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_BuscarAsistenciaDocentesLayout.createSequentialGroup()
                        .addComponent(Boton_actualizarAsistenciaEST, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_BuscarAsistenciaDocentesLayout.createSequentialGroup()
                        .addComponent(label_tituloAsistencia_Estudiates, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_BuscarAsistenciaDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_BuscarAsistenciaDocentesLayout.createSequentialGroup()
                            .addComponent(jcmb_tipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_fechaAsistenciaDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Boton_BuscarFechaDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_BuscarAsistenciaDocentesLayout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
        );
        panel_BuscarAsistenciaDocentesLayout.setVerticalGroup(
            panel_BuscarAsistenciaDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BuscarAsistenciaDocentesLayout.createSequentialGroup()
                .addComponent(label_tituloAsistencia_Estudiates)
                .addGap(17, 17, 17)
                .addGroup(panel_BuscarAsistenciaDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_BuscarAsistenciaDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Boton_BuscarFechaDocentes, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_fechaAsistenciaDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_BuscarAsistenciaDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcmb_tipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_filtro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Boton_actualizarAsistenciaEST, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(panel_BuscarAsistenciaDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel_BuscarAsistenciaDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        pase=1;
    }//GEN-LAST:event_formWindowClosed

    private void Boton_actualizarAsistenciaESTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_actualizarAsistenciaESTActionPerformed
        int ultimaFila=TABLA_ASISTENCIA_ESTUDIANTES.getRowCount();
      String Validador= (MODEL_TABLA_ESTUDIANTES.getValueAt(ultimaFila-1,9).toString());
      if(Validador.equalsIgnoreCase("si"))
      {
        int mensaje=JOptionPane.showConfirmDialog(null,"Actualizar Asistencia",null,JOptionPane.YES_NO_OPTION);
        if(mensaje==JOptionPane.YES_OPTION)
        {
    try {
      Connection cn= Conexion.Conectar();
          
      for(int i=0;i<TABLA_ASISTENCIA_ESTUDIANTES.getRowCount()-1;i++)
      {
      String id=(String)MODEL_TABLA_ESTUDIANTES.getValueAt(i,0);
      String dni=(String)MODEL_TABLA_ESTUDIANTES.getValueAt(i,1);
      String nombre=(String)MODEL_TABLA_ESTUDIANTES.getValueAt(i,2);
      String apellidos=(String)MODEL_TABLA_ESTUDIANTES.getValueAt(i,3);
      String nivel=(String)MODEL_TABLA_ESTUDIANTES.getValueAt(i,4);
      String grado=(String)MODEL_TABLA_ESTUDIANTES.getValueAt(i,5);
      String curso=(String)MODEL_TABLA_ESTUDIANTES.getValueAt(i,6);
      String fecha=(String)MODEL_TABLA_ESTUDIANTES.getValueAt(i,7);
      String hora=(String)MODEL_TABLA_ESTUDIANTES.getValueAt(i,8);
      String situcaion=(String)MODEL_TABLA_ESTUDIANTES.getValueAt(i,9);
      
      
      PreparedStatement pst= cn.prepareStatement("update tabla_asistencia_docentes set Dni_doc=?,Nombre_doc=?,"
              + " Apellidos_doc=?,Nivel=?,Grado=?,Curso=?,Fecha=?,Hora=?,Estado=? where Id_tabla_asistencia_doc='"+id+"'");
      
            pst.setString(1,dni);
            pst.setString(2,nombre);
            pst.setString(3,apellidos);
            pst.setString(4,nivel);
            pst.setString(5,grado);
            pst.setString(6,curso);
            pst.setString(7,fecha);
            pst.setString(8,hora);
            pst.setString(9,situcaion.toUpperCase());
            pst.executeUpdate();
      }
      cn.close();
     JOptionPane.showMessageDialog(null,"Actualización Exitosa");
  }  catch (Exception e) {JOptionPane.showMessageDialog(null, "Error Actualizar asistencia \n contacte al administrador",null, JOptionPane.WARNING_MESSAGE);
                            System.err.println("erro actualizar asistencia docentes:"+e);  }
  }
  else
    {
      JOptionPane.showMessageDialog(null, "REGISTRO CANCELADO");
       }
   }
        

  else
    {
      JOptionPane.showMessageDialog(null, "Ingrese la palabra 'si'");
       }


    }//GEN-LAST:event_Boton_actualizarAsistenciaESTActionPerformed

    private void txt_filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtroActionPerformed

    }//GEN-LAST:event_txt_filtroActionPerformed

    private void txt_filtroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroKeyReleased

        try
        {// en texto escrito a consultar en la tabla
            String texto="%"+txt_filtro.getText().trim()+"%";

            // secuberra el tipo de filtro
            String filtroSelec=jcmb_tipoFiltro.getSelectedItem().toString();

            // ETIQUETAS DE EMCABEZADO DE TABLA
            String[] titulos={"ID","DNI", "NOMBRE", "APELLIDOS", "NIVEL","GRADO","CURSO","FECHA ", "HORA","ESTADO"};
            MODEL_TABLA_ESTUDIANTES=new DefaultTableModel(null,titulos);

            // FUNCIONES DEPENDIENDO DEL TIPO DE FILTRO ELEGIDO
            switch (filtroSelec)
            {//*********** FILTRO PARA NOMBRE DE CLIENTES ************
                case"Nombre":

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1= cn1.prepareStatement("select * from tabla_asistencia_docentes where Nombre_doc like"+'"'+texto+'"');
                String[] fila1= new String[10];
                ResultSet resul1=pst1.executeQuery();
                TABLA_ASISTENCIA_ESTUDIANTES = new JTable(MODEL_TABLA_ESTUDIANTES);
                jScrollPane1.setViewportView(TABLA_ASISTENCIA_ESTUDIANTES);

                //recuperar valores de BD A LA TABLA
                while(resul1.next())
                {
                    fila1[0]=resul1.getString("Id_tabla_asistencia_doc");
                    fila1[1]=resul1.getString("Dni_doc");
                    fila1[2]=resul1.getString("Nombre_doc");
                    fila1[3]=resul1.getString("Apellidos_doc");
                    fila1[4]=resul1.getString("Nivel");
                    fila1[5]=resul1.getString("Grado");
                    fila1[6]=resul1.getString("Curso");
                    fila1[7]=resul1.getString("Fecha");
                    fila1[8]=resul1.getString("Hora");
                    fila1[9]=resul1.getString("Estado");
                    MODEL_TABLA_ESTUDIANTES.addRow(fila1);
                }
                MODEL_TABLA_ESTUDIANTES.addRow(new Object[]{"","","","","","","","Actualizar ","si/no",""});
                TABLA_ASISTENCIA_ESTUDIANTES.setModel(MODEL_TABLA_ESTUDIANTES);
                cn1.close();

                    break;
                    //********** FILTRO DE APELLIDOS DE CLIENTES **********
                    case"Apellidos":

                Connection cn2= Conexion.Conectar();
                PreparedStatement pst2= cn2.prepareStatement("select * from tabla_asistencia_docentes where Apellidos_doc like"+'"'+texto+'"');
                String[] fila2= new String[10];
                ResultSet resul2=pst2.executeQuery();
                TABLA_ASISTENCIA_ESTUDIANTES = new JTable(MODEL_TABLA_ESTUDIANTES);
                jScrollPane1.setViewportView(TABLA_ASISTENCIA_ESTUDIANTES);

                //recuperar valores de BD A LA TABLA
                while(resul2.next())
                {
                    fila2[0]=resul2.getString("Id_tabla_asistencia_doc");
                    fila2[1]=resul2.getString("Dni_doc");
                    fila2[2]=resul2.getString("Nombre_doc");
                    fila2[3]=resul2.getString("Apellidos_doc");
                    fila2[4]=resul2.getString("Nivel");
                    fila2[5]=resul2.getString("Grado");
                    fila2[6]=resul2.getString("Curso");
                    fila2[7]=resul2.getString("Fecha");
                    fila2[8]=resul2.getString("Hora");
                    fila2[9]=resul2.getString("Estado");
                    MODEL_TABLA_ESTUDIANTES.addRow(fila2);
                }
                MODEL_TABLA_ESTUDIANTES.addRow(new Object[]{"","","","","","","","Actualizar ","si/no",""});
                TABLA_ASISTENCIA_ESTUDIANTES.setModel(MODEL_TABLA_ESTUDIANTES);
                cn2.close();

                        break;

                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                case"DNI":
                Connection cn3= Conexion.Conectar();
                PreparedStatement pst3= cn3.prepareStatement("select * from tabla_asistencia_docentes where Dni_doc like"+'"'+texto+'"');
                String[] fila3= new String[10];
                ResultSet resul3=pst3.executeQuery();
                TABLA_ASISTENCIA_ESTUDIANTES = new JTable(MODEL_TABLA_ESTUDIANTES);
                jScrollPane1.setViewportView(TABLA_ASISTENCIA_ESTUDIANTES);

                //recuperar valores de BD A LA TABLA
                while(resul3.next())
                {
                    fila3[0]=resul3.getString("Id_tabla_asistencia_doc");
                    fila3[1]=resul3.getString("Dni_doc");
                    fila3[2]=resul3.getString("Nombre_doc");
                    fila3[3]=resul3.getString("Apellidos_doc");
                    fila3[4]=resul3.getString("Nivel");
                    fila3[5]=resul3.getString("Grado");
                    fila3[6]=resul3.getString("Curso");
                    fila3[7]=resul3.getString("Fecha");
                    fila3[8]=resul3.getString("Hora");
                    fila3[9]=resul3.getString("Estado");
                    MODEL_TABLA_ESTUDIANTES.addRow(fila3);
                }
                MODEL_TABLA_ESTUDIANTES.addRow(new Object[]{"","","","","","","","Actualizar ","si/no",""});
                TABLA_ASISTENCIA_ESTUDIANTES.setModel(MODEL_TABLA_ESTUDIANTES);
                cn3.close();
                break;

                            }

                        } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error al filtar "+jcmb_tipoFiltro.getSelectedItem().toString()+"","",JOptionPane.ERROR_MESSAGE);
                            System.err.println("error al filtar la busqueda: "+e); }
        
     Boton_actualizarAsistenciaEST.setEnabled(true);
    }//GEN-LAST:event_txt_filtroKeyReleased

    private void jcmb_tipoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_tipoFiltroActionPerformed
        // TODO add your handling code here:
        txt_filtro.setText("");
        txt_filtro.requestFocus();
    }//GEN-LAST:event_jcmb_tipoFiltroActionPerformed

    private void Boton_BuscarFechaDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_BuscarFechaDocentesActionPerformed
    SimpleDateFormat dFormat= new SimpleDateFormat("dd/M/yyyy");
    String fechaAsistencia ="%"+dFormat.format(txt_fechaAsistenciaDocentes.getDate())+"%";

        
            String[] titulos={"ID","DNI", "NOMBRE", "APELLIDOS","NIVEL", "GRADO","CURSO","FECHA ", "HORA","ESTADO"};
            MODEL_TABLA_ESTUDIANTES=new DefaultTableModel(null,titulos);

     //agregamos datos la tabla estudiantes del 1 secundaria
     try {
                        Connection cn1= Conexion.Conectar();
                PreparedStatement pst1= cn1.prepareStatement("select * from tabla_asistencia_docentes where Fecha like"+'"'+fechaAsistencia+'"');
                String[] fila1= new String[10];
                ResultSet resul1=pst1.executeQuery();
                TABLA_ASISTENCIA_ESTUDIANTES = new JTable(MODEL_TABLA_ESTUDIANTES);
                jScrollPane1.setViewportView(TABLA_ASISTENCIA_ESTUDIANTES);

                //recuperar valores de BD A LA TABLA
                while(resul1.next())
                {
                    fila1[0]=resul1.getString("Id_tabla_asistencia_doc");
                    fila1[1]=resul1.getString("Dni_doc");
                    fila1[2]=resul1.getString("Nombre_doc");
                    fila1[3]=resul1.getString("Apellidos_doc");
                    fila1[4]=resul1.getString("Nivel");
                    fila1[5]=resul1.getString("Grado");
                    fila1[6]=resul1.getString("Curso");
                    fila1[7]=resul1.getString("Fecha");
                    fila1[8]=resul1.getString("Hora");
                    fila1[9]=resul1.getString("Estado");
                    MODEL_TABLA_ESTUDIANTES.addRow(fila1);
                }
                MODEL_TABLA_ESTUDIANTES.addRow(new Object[]{"","","","","","","","Actualizar ","si/no",""});
                TABLA_ASISTENCIA_ESTUDIANTES.setModel(MODEL_TABLA_ESTUDIANTES);
                cn1.close();
         
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar asistencia de los docentes ");
                               System.err.println("ERROR, recuperar datos de fecha de asistencia docentes:"+e); }

     Boton_actualizarAsistenciaEST.setEnabled(true);
    }//GEN-LAST:event_Boton_BuscarFechaDocentesActionPerformed

    private void txt_fechaAsistenciaDocentesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_fechaAsistenciaDocentesFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaAsistenciaDocentesFocusGained

    private void txt_fechaAsistenciaDocentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_fechaAsistenciaDocentesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaAsistenciaDocentesMouseClicked


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarAsistenciaDocente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_BuscarFechaDocentes;
    private javax.swing.JButton Boton_actualizarAsistenciaEST;
    private javax.swing.JTable TABLA_ASISTENCIA_ESTUDIANTES;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcmb_tipoFiltro;
    private javax.swing.JLabel label_tituloAsistencia_Estudiates;
    private javax.swing.JPanel panel_BuscarAsistenciaDocentes;
    private com.toedter.calendar.JDateChooser txt_fechaAsistenciaDocentes;
    private javax.swing.JTextField txt_filtro;
    // End of variables declaration//GEN-END:variables


public void reuperarListaEstudiante()
{
        Calendar Calendario=Calendar.getInstance();
        String fechaActual="%"+Integer.toString(Calendario.get(Calendar.DATE))+"/"+
                                    Integer.toString(Calendario.get(Calendar.MONTH)+1)+"/"+
                                    Integer.toString(Calendario.get(Calendar.YEAR))+"%";
        try
        {   String[] titulos={"ID","DNI", "NOMBRE", "APELLIDOS", "NIVEL","GRADO","CURSO","FECHA ", "HORA","ESTADO"};
            MODEL_TABLA_ESTUDIANTES=new DefaultTableModel(null,titulos);

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1= cn1.prepareStatement("select * from tabla_asistencia_docentes where Fecha like"+'"'+fechaActual+'"');
                String[] fila1= new String[10];
                ResultSet resul1=pst1.executeQuery();
                TABLA_ASISTENCIA_ESTUDIANTES = new JTable(MODEL_TABLA_ESTUDIANTES);
                jScrollPane1.setViewportView(TABLA_ASISTENCIA_ESTUDIANTES);

                //recuperar valores de BD A LA TABLA
                while(resul1.next())
                {
                    fila1[0]=resul1.getString("Id_tabla_asistencia_doc");
                    fila1[1]=resul1.getString("Dni_doc");
                    fila1[2]=resul1.getString("Nombre_doc");
                    fila1[3]=resul1.getString("Apellidos_doc");
                    fila1[4]=resul1.getString("Nivel");
                    fila1[5]=resul1.getString("Grado");
                    fila1[6]=resul1.getString("Curso");
                    fila1[7]=resul1.getString("Fecha");
                    fila1[8]=resul1.getString("Hora");
                    fila1[9]=resul1.getString("Estado");
                    MODEL_TABLA_ESTUDIANTES.addRow(fila1);
                }
                MODEL_TABLA_ESTUDIANTES.addRow(new Object[]{"","","","","","","","Actualizar ","si/no",""});
                TABLA_ASISTENCIA_ESTUDIANTES.setModel(MODEL_TABLA_ESTUDIANTES);
                cn1.close();

            } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error al recuperar asistencia de docentes",null,JOptionPane.ERROR_MESSAGE);
                            System.err.println("error al recuperar información  de asistencia de coentes: "+e); }
        
     Boton_actualizarAsistenciaEST.setEnabled(true);

}


}
