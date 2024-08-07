

package Ventanas;

import Clases.Conexion;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;

// para el autocompletado
import com.mxrck.autocompleter.TextAutoCompleter;
        
import static Ventanas.VentanaPrincipal_Horarios.jDesktopPane1;
import java.util.Calendar;

public class NewRegistroDeCursos extends javax.swing.JInternalFrame {
    private TextAutoCompleter ac_DniDocente,ac_NombreDocente,ac_ApellidoDocente, ac_DescripcionCurso;
    
    public NewRegistroDeCursos() {
        initComponents();
        setSize(1177, 607);
        this.setMaximizable(true);
        
        
        try {
        ac_DniDocente=new TextAutoCompleter(TXT_DNI_DOCENTE);
        ac_NombreDocente=new TextAutoCompleter(TXT_NOMBRE_DOCENETE);
        ac_ApellidoDocente=new TextAutoCompleter(TXT_APELLIDOS_DOCENTE);
            Connection cc= Conexion.Conectar();
            PreparedStatement p=cc.prepareStatement("select *from tabla_docentes");
            ResultSet rr=p.executeQuery();
            while(rr.next())
            {
                ac_DniDocente.addItem(rr.getString("Dni_doc"));
                ac_NombreDocente.addItem(rr.getString("Nombre_doc"));
                ac_ApellidoDocente.addItem(rr.getString("Apellidos_doc"));
            }
             cc.close();
        } catch (Exception e) { System.err.println("erro al rellenar info para el autompletaado de dni docentes");}
        
        
        
        
        try {
           ac_DescripcionCurso=new TextAutoCompleter(TXT_DESCRIPCION);
            Connection cc= Conexion.Conectar();
            PreparedStatement p=cc.prepareStatement("select Descripcion_curso from tabla_cursos");
            ResultSet rr=p.executeQuery();
            while(rr.next())
            {
                ac_DescripcionCurso.addItem(rr.getString("Descripcion_curso"));
            }
             cc.close();
        } catch (Exception e) { System.err.println("erro al rellenar info para el autompletaado de dni docentes");}
        
        
        cmb_grado.setEnabled(false);
        Calendar Cal=Calendar.getInstance();
        String fecha=Integer.toString(Cal.get(Calendar.DATE))+"/"+
                Integer.toString(Cal.get(Calendar.MONTH)+1)+"/"+
                Integer.toString(Cal.get(Calendar.YEAR));
        TXT_FECHA_REGISTRO.setText(fecha);
                
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panel_informacionCursoHistorico = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TXT_CODIGO_CURSO = new javax.swing.JTextField();
        TXT_INICI_CLASE = new javax.swing.JTextField();
        TXT_FIN_CLASE = new javax.swing.JTextField();
        TXT_DNI_DOCENTE = new javax.swing.JTextField();
        TXT_DESCRIPCION = new javax.swing.JTextField();
        TXT_NOMBRE_DOCENETE = new javax.swing.JTextField();
        TXT_APELLIDOS_DOCENTE = new javax.swing.JTextField();
        TXT_FECHA_REGISTRO = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        boton_actualizar = new javax.swing.JButton();
        cmb_grado = new javax.swing.JComboBox<>();
        cmb_Nivel = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        cmb_dia = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        Boton_editarApellidos = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        boton_editarNombre = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Curso y Horario de Clase");

        jLabel2.setText("ID CURSO        :");

        jLabel3.setText("DESCRIPCIÓN :");

        jLabel4.setText("INICIO CLASE :");

        jLabel5.setText("FIN CLASE       :");

        jLabel7.setText("NIVEL               :");

        jLabel8.setText("DNI DOCENTE             :");

        jLabel9.setText("NOMBRE DOCENTE     :");

        jLabel10.setText("APELLIDOS DOCENTE :");

        jLabel11.setText("FECHA REGISTRO       :");

        TXT_CODIGO_CURSO.setBackground(new java.awt.Color(204, 204, 204));
        TXT_CODIGO_CURSO.setForeground(new java.awt.Color(153, 0, 51));
        TXT_CODIGO_CURSO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_CODIGO_CURSOKeyTyped(evt);
            }
        });

        TXT_INICI_CLASE.setBackground(new java.awt.Color(204, 204, 204));
        TXT_INICI_CLASE.setForeground(new java.awt.Color(153, 0, 51));
        TXT_INICI_CLASE.setText("00:00 AM / 00:00 PM");
        TXT_INICI_CLASE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_INICI_CLASEActionPerformed(evt);
            }
        });

        TXT_FIN_CLASE.setBackground(new java.awt.Color(204, 204, 204));
        TXT_FIN_CLASE.setForeground(new java.awt.Color(153, 0, 51));
        TXT_FIN_CLASE.setText("00:00 PM / 00:00 PM");

        TXT_DNI_DOCENTE.setBackground(new java.awt.Color(204, 204, 204));
        TXT_DNI_DOCENTE.setForeground(new java.awt.Color(153, 0, 51));

        TXT_DESCRIPCION.setBackground(new java.awt.Color(204, 204, 204));
        TXT_DESCRIPCION.setForeground(new java.awt.Color(153, 0, 51));

        TXT_NOMBRE_DOCENETE.setEditable(false);
        TXT_NOMBRE_DOCENETE.setBackground(new java.awt.Color(204, 204, 204));
        TXT_NOMBRE_DOCENETE.setForeground(new java.awt.Color(153, 0, 51));

        TXT_APELLIDOS_DOCENTE.setEditable(false);
        TXT_APELLIDOS_DOCENTE.setBackground(new java.awt.Color(204, 204, 204));
        TXT_APELLIDOS_DOCENTE.setForeground(new java.awt.Color(153, 0, 51));

        TXT_FECHA_REGISTRO.setBackground(new java.awt.Color(204, 204, 204));
        TXT_FECHA_REGISTRO.setForeground(new java.awt.Color(153, 0, 51));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Informacion del curso ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Información del docente ");

        boton_actualizar.setBackground(new java.awt.Color(0, 51, 102));
        boton_actualizar.setText("Registrar Datos");
        boton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_actualizarActionPerformed(evt);
            }
        });

        cmb_grado.setForeground(new java.awt.Color(153, 0, 51));
        cmb_grado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cmb_grado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cmb_Nivel.setForeground(new java.awt.Color(153, 0, 51));
        cmb_Nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Inicial", "Primaria", "Secundaria" }));
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

        jLabel14.setText("GRADO            :");

        cmb_dia.setForeground(new java.awt.Color(153, 0, 51));
        cmb_dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" }));

        jLabel15.setText("DÍA                  :");

        Boton_editarApellidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lapiz.png"))); // NOI18N
        Boton_editarApellidos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        Boton_editarApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_editarApellidosActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        boton_editarNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lapiz.png"))); // NOI18N
        boton_editarNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        boton_editarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_editarNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_informacionCursoHistoricoLayout = new javax.swing.GroupLayout(panel_informacionCursoHistorico);
        panel_informacionCursoHistorico.setLayout(panel_informacionCursoHistoricoLayout);
        panel_informacionCursoHistoricoLayout.setHorizontalGroup(
            panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TXT_CODIGO_CURSO, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(TXT_FIN_CLASE)
                            .addComponent(TXT_INICI_CLASE)
                            .addComponent(TXT_DESCRIPCION)
                            .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmb_grado, 0, 137, Short.MAX_VALUE)
                                    .addComponent(cmb_Nivel, 0, 137, Short.MAX_VALUE)
                                    .addComponent(cmb_dia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(173, 173, 173)
                .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                                .addComponent(TXT_DNI_DOCENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                                .addComponent(TXT_NOMBRE_DOCENETE, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton_editarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TXT_FECHA_REGISTRO, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                                .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(boton_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TXT_APELLIDOS_DOCENTE, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Boton_editarApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 52, Short.MAX_VALUE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        panel_informacionCursoHistoricoLayout.setVerticalGroup(
            panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TXT_CODIGO_CURSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TXT_DESCRIPCION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TXT_INICI_CLASE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TXT_FIN_CLASE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cmb_grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cmb_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(TXT_DNI_DOCENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(TXT_NOMBRE_DOCENETE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(boton_editarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(TXT_APELLIDOS_DOCENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Boton_editarApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(TXT_FECHA_REGISTRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_informacionCursoHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(panel_informacionCursoHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_NivelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_NivelItemStateChanged
        // TODO add your handling code here:
            if(evt.getSource()==cmb_Nivel){
                
            cmb_grado.setEnabled(true);
            String seleccion=cmb_Nivel.getSelectedItem().toString();
            if(seleccion.equalsIgnoreCase("Seleccionar")){
                cmb_grado.removeAllItems();
                cmb_grado.addItem("Seleccionar");
            cmb_grado.setEnabled(false);
            }else 
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

    private void TXT_CODIGO_CURSOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_CODIGO_CURSOKeyTyped
        // TODO add your handling code here:
        if(TXT_CODIGO_CURSO.getText().length()>=6){
           evt.consume(); //no permitir ingresar mas letras
            Toolkit.getDefaultToolkit().beep();// enviar un sonido indicando que no se permite
       }
    }//GEN-LAST:event_TXT_CODIGO_CURSOKeyTyped

    private void boton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_actualizarActionPerformed
        // TODO add your handling code here:
     String Id_curso,Descripcion_curso,Inicio_clase,fin_clase,Grado,Nivel,Dni_doc,Nombre_doc,Apellidos_doc,FechaRegistro,  Dia;
     int contador=0;
         Id_curso=TXT_CODIGO_CURSO.getText().trim();
         Descripcion_curso= TXT_DESCRIPCION.getText().trim();
         Inicio_clase=  TXT_INICI_CLASE.getText().trim();
         fin_clase= TXT_FIN_CLASE.getText().trim();
         Grado= cmb_grado.getSelectedItem().toString();
         Nivel= cmb_Nivel.getSelectedItem().toString();
         Dni_doc=TXT_DNI_DOCENTE.getText().trim();
         Nombre_doc= TXT_NOMBRE_DOCENETE.getText().trim();
         Apellidos_doc=  TXT_APELLIDOS_DOCENTE.getText().trim();
         FechaRegistro= TXT_FECHA_REGISTRO.getText().trim();
         Dia=cmb_dia.getSelectedItem().toString();
         
         if(Dia.equals("-Seleccionar-")||Id_curso.equals("") || Descripcion_curso.equals("") || Inicio_clase.equals("") || fin_clase.equals("") || Grado.equals("") || Nivel.equals("") || Dni_doc.equals("") || Nombre_doc.equals("") || Apellidos_doc.equals("") || FechaRegistro.equals(""))
         {
           JOptionPane.showMessageDialog(null,"Complete todos los campos");
           contador++;
         }
         if(contador==0)
         {
             int mensaje=JOptionPane.showConfirmDialog(null,"Registrar información",null,JOptionPane.YES_NO_OPTION);
             if(mensaje==JOptionPane.YES_OPTION)
             {
                 try {
                     Connection cn=Conexion.Conectar();
                     PreparedStatement  pst=cn.prepareStatement("insert into tabla_cursos  values(?,?,?,?,?,?,?,?,?,?,?,?)");
                     pst.setInt(1,0);
                     pst.setString(2,Id_curso);
                     pst.setString(3,Descripcion_curso);
                     pst.setString(4,Dia);
                     pst.setString(5,Inicio_clase);
                     pst.setString(6,fin_clase);
                     pst.setString(7,Grado);
                     pst.setString(8,Nivel);
                     pst.setString(9,Dni_doc);
                     pst.setString(10,Nombre_doc);
                     pst.setString(11,Apellidos_doc);
                     pst.setString(12,FechaRegistro);
                     pst.executeUpdate();
                     cn.close();
                     // preguntar si desea generar un nuevo registro
                            int mensaje2=JOptionPane.showConfirmDialog(null,"Registro exitoso continuar [S/N]:",null,JOptionPane.YES_NO_OPTION);
                            if(mensaje==JOptionPane.YES_OPTION)
                            {// recuperadmos metodo para blanquiar campos
                                actualizarVentana();
                            }
                 } catch (Exception e) { JOptionPane.showMessageDialog(null,"error, al Registrar datos, contate al administrador");
                              System.err.println("error, al registrar datos: "+e);}
             }
             else
             {
              JOptionPane.showMessageDialog(null,"Cancelado...");
             }
         }


    }//GEN-LAST:event_boton_actualizarActionPerformed

    private void boton_editarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_editarNombreActionPerformed
        TXT_NOMBRE_DOCENETE.setEditable(true);
        TXT_NOMBRE_DOCENETE.requestFocus();
        
    }//GEN-LAST:event_boton_editarNombreActionPerformed

    private void Boton_editarApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_editarApellidosActionPerformed
        TXT_APELLIDOS_DOCENTE.setEditable(true);
        TXT_APELLIDOS_DOCENTE.requestFocus();

    }//GEN-LAST:event_Boton_editarApellidosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn= Conexion.Conectar();
            PreparedStatement pst=cn.prepareStatement("select *from tabla_docentes where Dni_doc='"+TXT_DNI_DOCENTE.getText().trim()+"'");
            ResultSet resul=pst.executeQuery();
            if(resul.next())
            {
                TXT_NOMBRE_DOCENETE.setText(resul.getString("Nombre_doc"));
                TXT_APELLIDOS_DOCENTE.setText(resul.getString("Apellidos_doc"));
            }
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"Error al buscar datos, Contacte al administrador");
                               System.err.println("Error, al recuperar datos del docente:"+e);}
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TXT_INICI_CLASEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_INICI_CLASEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_INICI_CLASEActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_editarApellidos;
    private javax.swing.JTextField TXT_APELLIDOS_DOCENTE;
    private javax.swing.JTextField TXT_CODIGO_CURSO;
    private javax.swing.JTextField TXT_DESCRIPCION;
    private javax.swing.JTextField TXT_DNI_DOCENTE;
    private javax.swing.JTextField TXT_FECHA_REGISTRO;
    private javax.swing.JTextField TXT_FIN_CLASE;
    private javax.swing.JTextField TXT_INICI_CLASE;
    private javax.swing.JTextField TXT_NOMBRE_DOCENETE;
    private javax.swing.JButton boton_actualizar;
    private javax.swing.JButton boton_editarNombre;
    private javax.swing.JComboBox<String> cmb_Nivel;
    private javax.swing.JComboBox<String> cmb_dia;
    private javax.swing.JComboBox<String> cmb_grado;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panel_informacionCursoHistorico;
    // End of variables declaration//GEN-END:variables


      public void actualizarVentana(){
         this.setVisible(false);
        NewRegistroDeCursos mens= new NewRegistroDeCursos();
        jDesktopPane1.add(mens);
        mens.setVisible(true);
     }
    
}
