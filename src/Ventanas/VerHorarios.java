

package Ventanas;

import Clases.Conexion;
import static Ventanas.VentanaPrincipal_Horarios.jDesktopPane1;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class VerHorarios extends javax.swing.JInternalFrame {

    DefaultTableModel MODEL_TABLA_CURSOS= new DefaultTableModel();
    public VerHorarios() {
        initComponents();
        setSize(1177, 607);
        this.setMaximizable(true);
        
                // creamos evento a la tabla
        TABLA_CURSOS.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e)
        {
            int filaPoint=TABLA_CURSOS.rowAtPoint(e.getPoint());
            if(filaPoint>-1)
            {
                String idTablacurso=(String)MODEL_TABLA_CURSOS.getValueAt(filaPoint,0);
                
                RecuperarInfoClik(idTablacurso);
                System.out.println("asdasd::"+idTablacurso);
            }
        }
        });
        panel_buscar.setVisible(true);
        boton_actualizar.setVisible(false);
        
        Calendar cal=Calendar.getInstance();
        String año=Integer.toString(cal.get(Calendar.YEAR));
        int añoInt=Integer.parseInt(año);
        
        for(int i=añoInt ;i>=2018;i--)
        {
            cmb_año.addItem(Integer.toString(i));
        }
        
        cmb_Nivel.setEnabled(false);
        cmb_grado.setEnabled(false);
        Boton_buscar.setEnabled(false);
        panel_informacionCursoHistorico.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_buscar = new javax.swing.JPanel();
        cmb_Nivel = new javax.swing.JComboBox<>();
        cmb_grado = new javax.swing.JComboBox<>();
        Boton_buscar = new javax.swing.JButton();
        cmb_año = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA_CURSOS = new javax.swing.JTable();
        panel_informacionCursoHistorico = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TXT_CODIGO_CURSO = new javax.swing.JTextField();
        TXT_INICI_CLASE = new javax.swing.JTextField();
        TXT_FIN_CLASE = new javax.swing.JTextField();
        TXT_GRADO = new javax.swing.JTextField();
        TXT_NIVEL = new javax.swing.JTextField();
        TXT_DNI_DOCENTE = new javax.swing.JTextField();
        TXT_DESCRIPCION = new javax.swing.JTextField();
        TXT_NOMBRE_DOCENETE = new javax.swing.JTextField();
        TXT_APELLIDOS_DOCENTE = new javax.swing.JTextField();
        TXT_FECHA_REGISTRO = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        label_id_tabla = new javax.swing.JLabel();
        boton_actualizar = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cmb_dia = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        cmb_Nivel.setForeground(new java.awt.Color(153, 0, 51));
        cmb_Nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-NIVEL-", "Inicial", "Primaria", "Secundaria" }));
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

        cmb_grado.setForeground(new java.awt.Color(153, 0, 51));
        cmb_grado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-GRADO-" }));
        cmb_grado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_grado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_gradoActionPerformed(evt);
            }
        });

        Boton_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        Boton_buscar.setText("Buscar");
        Boton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_buscarActionPerformed(evt);
            }
        });

        cmb_año.setForeground(new java.awt.Color(153, 0, 51));
        cmb_año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-AÑO-" }));
        cmb_año.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_añoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_buscarLayout = new javax.swing.GroupLayout(panel_buscar);
        panel_buscar.setLayout(panel_buscarLayout);
        panel_buscarLayout.setHorizontalGroup(
            panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_buscarLayout.createSequentialGroup()
                .addComponent(cmb_año, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmb_Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmb_grado, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Boton_buscar)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        panel_buscarLayout.setVerticalGroup(
            panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_buscarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_buscar)
                    .addComponent(cmb_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro Histórico de Curso y Horarios de Clase");

        TABLA_CURSOS.setBackground(new java.awt.Color(0, 102, 102));
        TABLA_CURSOS.setForeground(new java.awt.Color(51, 0, 0));
        TABLA_CURSOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID CURSO", "DESCRIPCIÓN", "INICIO CLASE", "FIN CLASE", "GRADO", "NIVEL", "DNI DOCENTE", "NOMBRE DOCENTE", "APELLIDOS DOCENTE", "FECHA REGISTRO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TABLA_CURSOS.setGridColor(new java.awt.Color(204, 204, 0));
        TABLA_CURSOS.setSelectionBackground(new java.awt.Color(204, 204, 0));
        TABLA_CURSOS.setSelectionForeground(new java.awt.Color(0, 102, 102));
        jScrollPane1.setViewportView(TABLA_CURSOS);
        if (TABLA_CURSOS.getColumnModel().getColumnCount() > 0) {
            TABLA_CURSOS.getColumnModel().getColumn(0).setMaxWidth(80);
            TABLA_CURSOS.getColumnModel().getColumn(1).setPreferredWidth(150);
            TABLA_CURSOS.getColumnModel().getColumn(2).setPreferredWidth(50);
            TABLA_CURSOS.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("CÓDIGO          :");

        jLabel3.setText("DESCRIPCIÓN :");

        jLabel4.setText("INICIO CLASE :");

        jLabel5.setText("FIN CLASE       :");

        jLabel6.setText("GRADO  :");

        jLabel7.setText("NIVEL  :");

        jLabel8.setText("DNI DOCENTE             :");

        jLabel9.setText("NOMBRE DOCENTE     :");

        jLabel10.setText("APELLIDOS DOCENTE :");

        jLabel11.setText("FECHA REGISTRO       :");

        TXT_CODIGO_CURSO.setEditable(false);
        TXT_CODIGO_CURSO.setForeground(new java.awt.Color(0, 102, 102));

        TXT_INICI_CLASE.setEditable(false);
        TXT_INICI_CLASE.setForeground(new java.awt.Color(0, 102, 102));

        TXT_FIN_CLASE.setEditable(false);
        TXT_FIN_CLASE.setForeground(new java.awt.Color(0, 102, 102));

        TXT_GRADO.setEditable(false);
        TXT_GRADO.setForeground(new java.awt.Color(0, 102, 102));

        TXT_NIVEL.setEditable(false);
        TXT_NIVEL.setForeground(new java.awt.Color(0, 102, 102));

        TXT_DNI_DOCENTE.setEditable(false);
        TXT_DNI_DOCENTE.setForeground(new java.awt.Color(0, 102, 102));

        TXT_DESCRIPCION.setEditable(false);
        TXT_DESCRIPCION.setForeground(new java.awt.Color(0, 102, 102));

        TXT_NOMBRE_DOCENETE.setEditable(false);
        TXT_NOMBRE_DOCENETE.setForeground(new java.awt.Color(0, 102, 102));

        TXT_APELLIDOS_DOCENTE.setEditable(false);
        TXT_APELLIDOS_DOCENTE.setForeground(new java.awt.Color(0, 102, 102));

        TXT_FECHA_REGISTRO.setEditable(false);
        TXT_FECHA_REGISTRO.setForeground(new java.awt.Color(0, 102, 102));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Informacion del curso ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Información del docente ");

        label_id_tabla.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_id_tabla.setForeground(new java.awt.Color(204, 0, 0));

        boton_actualizar.setBackground(new java.awt.Color(0, 51, 102));
        boton_actualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boton_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        boton_actualizar.setText("Actualizar");
        boton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_actualizarActionPerformed(evt);
            }
        });

        label.setText("ID:");

        jLabel14.setText("DÍA   :");

        cmb_dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" }));

        javax.swing.GroupLayout panel_informacionCursoHistoricoLayout = new javax.swing.GroupLayout(panel_informacionCursoHistorico);
        panel_informacionCursoHistorico.setLayout(panel_informacionCursoHistoricoLayout);
        panel_informacionCursoHistoricoLayout.setHorizontalGroup(
            panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                                        .addComponent(label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(label_id_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TXT_CODIGO_CURSO, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TXT_FIN_CLASE)
                                    .addComponent(TXT_INICI_CLASE)
                                    .addComponent(TXT_DESCRIPCION, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TXT_GRADO, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXT_NIVEL)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_informacionCursoHistoricoLayout.createSequentialGroup()
                        .addGap(0, 85, Short.MAX_VALUE)
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                                .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXT_DNI_DOCENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_NOMBRE_DOCENETE, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_APELLIDOS_DOCENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_FECHA_REGISTRO, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(226, 226, 226))
        );
        panel_informacionCursoHistoricoLayout.setVerticalGroup(
            panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(label_id_tabla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(TXT_CODIGO_CURSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TXT_GRADO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(TXT_NIVEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(TXT_DNI_DOCENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(TXT_NOMBRE_DOCENETE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(TXT_APELLIDOS_DOCENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(TXT_FECHA_REGISTRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmb_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(boton_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, Short.MAX_VALUE))
        );

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lapiz.png"))); // NOI18N
        jMenu2.setText("Editar");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_informacionCursoHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_informacionCursoHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_actualizarActionPerformed
        // TODO add your handling code here:
     String Id_curso,Descripcion_curso,Inicio_clase,fin_clase,Grado,Nivel,Dni_doc,Nombre_doc,Apellidos_doc,FechaRegistro,Dia;
     int contador=0;
         Id_curso=TXT_CODIGO_CURSO.getText().trim();
         Descripcion_curso= TXT_DESCRIPCION.getText().trim();
         Inicio_clase=  TXT_INICI_CLASE.getText().trim();
         fin_clase= TXT_FIN_CLASE.getText().trim();
         Grado= TXT_GRADO.getText().trim();
         Nivel= TXT_NIVEL.getText().trim();
         Dni_doc=TXT_DNI_DOCENTE.getText().trim();
         Nombre_doc= TXT_NOMBRE_DOCENETE.getText().trim();
         Apellidos_doc=  TXT_APELLIDOS_DOCENTE.getText().trim();
         FechaRegistro= TXT_FECHA_REGISTRO.getText().trim();
         Dia=cmb_dia.getSelectedItem().toString();
                 
         if(Dia.equals("-Seleccionar-")|| Id_curso.equals("") || Descripcion_curso.equals("") || Inicio_clase.equals("") || fin_clase.equals("") || Grado.equals("") || Nivel.equals("") || Dni_doc.equals("") || Nombre_doc.equals("") || Apellidos_doc.equals("") || FechaRegistro.equals(""))
         {
           JOptionPane.showMessageDialog(null,"Complete todos los campos");
           contador++;
         }
         if(contador==0)
         {
             int mensaje=JOptionPane.showConfirmDialog(null,"Guardar los Cambios",null,JOptionPane.YES_NO_OPTION);
             if(mensaje==JOptionPane.YES_OPTION)
             {
                 try {
                     Connection cn=Conexion.Conectar();
                     PreparedStatement  pst=cn.prepareStatement("update  tabla_cursos set Id_curso=?, Descripcion_curso=?,Dia=?,Inicio_clase=?,fin_clase=?,Grado=?,"
                                                    + "Nivel=?,Dni_doc=?, Nombre_doc=?,Apellidos_doc=?, FechaRegistro=? where id_tabla_curso ='"+label_id_tabla.getText().trim()+"'");
                     pst.setString(1,Id_curso);
                     pst.setString(2,Descripcion_curso);
                     pst.setString(3,Dia);
                     pst.setString(4,Inicio_clase);
                     pst.setString(5,fin_clase);
                     pst.setString(6,Grado);
                     pst.setString(7,Nivel);
                     pst.setString(8,Dni_doc);
                     pst.setString(9,Nombre_doc);
                     pst.setString(10,Apellidos_doc);
                     pst.setString(11,FechaRegistro);
                     pst.executeUpdate();
                     cn.close();
                     JOptionPane.showMessageDialog(null,"Actualización exitosa");
                     actualizarVentana();
                 } catch (Exception e) { JOptionPane.showMessageDialog(null,"error, al actualizar datos, contate al administrador");
                              System.err.println("error, al actualizar datos: "+e);}
             }
             else
             {
              JOptionPane.showMessageDialog(null,"Cancelado...");
             }
         }
             
         
    }//GEN-LAST:event_boton_actualizarActionPerformed

    private void cmb_NivelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_NivelItemStateChanged
        // TODO add your handling code here:
        if(evt.getSource()==cmb_Nivel){

            cmb_grado.setEnabled(true);
            String seleccion=cmb_Nivel.getSelectedItem().toString();
            if(seleccion.equalsIgnoreCase("-NIVEL-")){
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
        Boton_buscar.setEnabled(false);  
    }//GEN-LAST:event_cmb_NivelActionPerformed

    private void Boton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_buscarActionPerformed
        // TODO add your handling code here:
        String grado=cmb_grado.getSelectedItem().toString();
        String año="%"+cmb_año.getSelectedItem().toString()+"%";
 
     
           try {
        Connection cn=Conexion.Conectar();
        PreparedStatement pst=cn.prepareStatement("select *from tabla_cursos where Grado='"+grado+"'and FechaRegistro like"+'"'+año+'"');
        ResultSet resul=pst.executeQuery();
        String[] titulos={"ID","CÓDIGO CURSO","DESCRIPCIÓN","INICIO CLASE","FIN CLASE","DIA","GRADO","NIVEL"," DOCENTE"};
        MODEL_TABLA_CURSOS= new DefaultTableModel(null,titulos);
        TABLA_CURSOS=new JTable(MODEL_TABLA_CURSOS);
        jScrollPane1.setViewportView(TABLA_CURSOS);
              
             TABLA_CURSOS.getColumnModel().getColumn(0).setMaxWidth(40);
             TABLA_CURSOS.getColumnModel().getColumn(2).setPreferredWidth(200);
             TABLA_CURSOS.setRowHeight(30);
             String fila[]=new String[9];
        while(resul.next())
        {
            fila[0]=resul.getString("id_tabla_curso");
            fila[1]=resul.getString("Id_curso");
            fila[2]=resul.getString("Descripcion_curso");
            fila[3]=resul.getString("Inicio_clase");
            fila[4]=resul.getString("fin_clase");
            fila[5]=resul.getString("Dia");
            fila[6]=resul.getString("Grado");
            fila[7]=resul.getString("Nivel");
            fila[8]=resul.getString("Nombre_doc")+" "+resul.getString("Apellidos_doc");
            
            MODEL_TABLA_CURSOS.addRow(fila);
        }
        cn.close();
          // creamos evento a la tabla
        TABLA_CURSOS.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e)
        {
            int filaPoint=TABLA_CURSOS.rowAtPoint(e.getPoint());
            if(filaPoint>-1)
            {
                String idTablacurso=(String)MODEL_TABLA_CURSOS.getValueAt(filaPoint,0);
                RecuperarInfoClik(idTablacurso);
                System.out.println("busacarz::"+idTablacurso);
            }
        }
        });
        
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"error, al recuperar información, contate al administrador");
                              System.err.println("error, al recuperar infromacion de los cursos: "+e);}
    
    
    
 
    }//GEN-LAST:event_Boton_buscarActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:

        TXT_CODIGO_CURSO.setEditable(true);
        TXT_DESCRIPCION.setEditable(true);
        TXT_INICI_CLASE.setEditable(true);
        TXT_FIN_CLASE.setEditable(true);
        TXT_GRADO.setEditable(true);
        TXT_NIVEL.setEditable(true);
        TXT_DNI_DOCENTE.setEditable(true);
        TXT_NOMBRE_DOCENETE.setEditable(true);
        TXT_APELLIDOS_DOCENTE.setEditable(true);
        TXT_FECHA_REGISTRO.setEditable(true);

        TXT_CODIGO_CURSO.setBackground(new Color(255,255,204));
        TXT_DESCRIPCION.setBackground(new Color(255,255,204));
        TXT_INICI_CLASE.setBackground(new Color(255,255,204));
        TXT_FIN_CLASE.setBackground(new Color(255,255,204));
        TXT_GRADO.setBackground(new Color(255,255,204));
        TXT_NIVEL.setBackground(new Color(255,255,204));
        TXT_DNI_DOCENTE.setBackground(new Color(255,255,204));
        TXT_NOMBRE_DOCENETE.setBackground(new Color(255,255,204));
        TXT_APELLIDOS_DOCENTE.setBackground(new Color(255,255,204));
        TXT_FECHA_REGISTRO.setBackground(new Color(255,255,204));
        TXT_DESCRIPCION.requestFocus();

        boton_actualizar.setVisible(true);

    }//GEN-LAST:event_jMenu2MouseClicked

    private void cmb_añoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_añoActionPerformed

        cmb_Nivel.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_añoActionPerformed

    private void cmb_gradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_gradoActionPerformed

        Boton_buscar.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_gradoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_buscar;
    private javax.swing.JTable TABLA_CURSOS;
    private javax.swing.JTextField TXT_APELLIDOS_DOCENTE;
    private javax.swing.JTextField TXT_CODIGO_CURSO;
    private javax.swing.JTextField TXT_DESCRIPCION;
    private javax.swing.JTextField TXT_DNI_DOCENTE;
    private javax.swing.JTextField TXT_FECHA_REGISTRO;
    private javax.swing.JTextField TXT_FIN_CLASE;
    private javax.swing.JTextField TXT_GRADO;
    private javax.swing.JTextField TXT_INICI_CLASE;
    private javax.swing.JTextField TXT_NIVEL;
    private javax.swing.JTextField TXT_NOMBRE_DOCENETE;
    private javax.swing.JButton boton_actualizar;
    private javax.swing.JComboBox<String> cmb_Nivel;
    private javax.swing.JComboBox<String> cmb_año;
    private javax.swing.JComboBox<String> cmb_dia;
    private javax.swing.JComboBox<String> cmb_grado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label_id_tabla;
    private javax.swing.JPanel panel_buscar;
    private javax.swing.JPanel panel_informacionCursoHistorico;
    // End of variables declaration//GEN-END:variables

   // recuperar datos con el clic en la tabla
     public void RecuperarInfoClik(String id_tabla_curso)
    {
        panel_informacionCursoHistorico.setVisible(true);
    try {
        Connection cn=Conexion.Conectar();
        PreparedStatement pst=cn.prepareStatement("select * from tabla_cursos where id_tabla_curso='"+id_tabla_curso+"'");
        ResultSet resul=pst.executeQuery();
        if(resul.next())
        {
           label_id_tabla.setText(resul.getString("id_tabla_curso"));
           TXT_CODIGO_CURSO.setText(resul.getString("Id_curso"));
           TXT_DESCRIPCION.setText(resul.getString("Descripcion_curso"));
           TXT_INICI_CLASE.setText(resul.getString("Inicio_clase"));
           TXT_FIN_CLASE.setText(resul.getString("fin_clase"));
           TXT_GRADO.setText(resul.getString("Grado"));
           TXT_NIVEL.setText(resul.getString("Nivel"));
           TXT_DNI_DOCENTE.setText(resul.getString("Dni_doc"));
           TXT_NOMBRE_DOCENETE.setText(resul.getString("Nombre_doc"));
           TXT_APELLIDOS_DOCENTE.setText(resul.getString("Apellidos_doc"));
           TXT_FECHA_REGISTRO.setText(resul.getString("FechaRegistro"));
           
           String dia=resul.getString("Dia");
           switch(dia)
           {
               case "Lunes": cmb_dia.setSelectedIndex(1);break;
               case "Martes": cmb_dia.setSelectedIndex(2);break;
               case "Miércoles": cmb_dia.setSelectedIndex(3);break;
               case "Jueves": cmb_dia.setSelectedIndex(4);break;
               case "Viernes": cmb_dia.setSelectedIndex(5);break;
               case "Sábado": cmb_dia.setSelectedIndex(6);break;
               case "Domingo": cmb_dia.setSelectedIndex(7);break;
               default:
                   cmb_dia.setSelectedIndex(0);break;
           }
        }
        cn.close();

        
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"error, al recuperar información, contate al administrador");
                              System.err.println("error, al recuperar informacion de los cursos clik: "+e);}
    }
    
     public void actualizarVentana(){
         this.setVisible(false);
        VerHorarios mens= new VerHorarios();
        jDesktopPane1.add(mens);
        mens.setVisible(true);
     }
     

}
