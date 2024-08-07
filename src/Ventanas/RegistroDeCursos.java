

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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class RegistroDeCursos extends javax.swing.JInternalFrame {

    DefaultTableModel MODEL_TABLA_CURSOS= new DefaultTableModel();
    public RegistroDeCursos() {
        initComponents();
        setSize(1177, 607);
        this.setMaximizable(true);
        RecuperarInfoCursos();
        
                // creamos evento a la tabla
        TABLA_CURSOS.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e)
        {
            int filaPoint=TABLA_CURSOS.rowAtPoint(e.getPoint());
            if(filaPoint>-1)
            {
                int idTablacurso=(int)MODEL_TABLA_CURSOS.getValueAt(filaPoint,0);
                
                System.out.println("---"+idTablacurso);
                RecuperarInfoClik(idTablacurso);
            }
        }
        });
        panel_buscar.setVisible(false);
        
        boton_actualizar.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        panel_buscar = new javax.swing.JPanel();
        cmb_filtros = new javax.swing.JComboBox<>();
        txt_infoBuscar = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

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
                .addGap(10, 10, 10)
                .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                                .addComponent(label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label_id_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXT_CODIGO_CURSO, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TXT_FIN_CLASE, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(TXT_INICI_CLASE, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(TXT_DESCRIPCION, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TXT_GRADO, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXT_NIVEL)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(59, 59, 59))
                    .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                                .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXT_DNI_DOCENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_NOMBRE_DOCENETE, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_APELLIDOS_DOCENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_FECHA_REGISTRO, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boton_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(69, Short.MAX_VALUE))))
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
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_id_tabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                                .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(TXT_CODIGO_CURSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TXT_GRADO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(TXT_NIVEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73))
                    .addGroup(panel_informacionCursoHistoricoLayout.createSequentialGroup()
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(TXT_DNI_DOCENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(TXT_NOMBRE_DOCENETE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(TXT_APELLIDOS_DOCENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(TXT_FECHA_REGISTRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_informacionCursoHistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cmb_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_actualizar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        cmb_filtros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Curso", "Docente" }));

        txt_infoBuscar.setBackground(new java.awt.Color(204, 255, 204));
        txt_infoBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_infoBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_infoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_infoBuscarActionPerformed(evt);
            }
        });
        txt_infoBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_infoBuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panel_buscarLayout = new javax.swing.GroupLayout(panel_buscar);
        panel_buscar.setLayout(panel_buscarLayout);
        panel_buscarLayout.setHorizontalGroup(
            panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_buscarLayout.createSequentialGroup()
                .addComponent(cmb_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_infoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_buscarLayout.setVerticalGroup(
            panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_buscarLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_infoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        jMenu1.setText("Buscar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_informacionCursoHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(173, 173, 173)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_informacionCursoHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void txt_infoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_infoBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_infoBuscarActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        panel_buscar.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void txt_infoBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_infoBuscarKeyReleased
        // TODO add your handling code here:
      try {
        String texto="%"+txt_infoBuscar.getText().trim()+"%";
        String tipoFiltro=cmb_filtros.getSelectedItem().toString();
        
         String[] titulos={"ID","CÓDIGO CURSO","DESCRIPCIÓN","INICIO CLASE","FIN CLASE","DÍA","GRADO","NIVEL","DNI DOCENTE"};
        MODEL_TABLA_CURSOS= new DefaultTableModel(null,titulos);
      
       
        switch(tipoFiltro)
        {
        case "Curso":
         Connection cn=Conexion.Conectar();
        PreparedStatement pst=cn.prepareStatement("select id_tabla_curso ,Id_curso, Descripcion_curso,Inicio_clase,fin_clase,Dia,Grado,"
                                                    + "Nivel,Dni_doc from tabla_cursos where Descripcion_curso like"+'"'+texto+'"');
        ResultSet resul=pst.executeQuery();
         TABLA_CURSOS=new JTable(MODEL_TABLA_CURSOS);
        jScrollPane1.setViewportView(TABLA_CURSOS);
              
        while(resul.next())
        {
            Object[] fila1 =new Object[9];
            for(int i=0;i<9;i++)
            {
                fila1[i]=resul.getObject(i+1);
            }
            MODEL_TABLA_CURSOS.addRow(fila1);
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
                int idTablacurso=(int)MODEL_TABLA_CURSOS.getValueAt(filaPoint,0);
                RecuperarInfoClik(idTablacurso);
            }
        }
        });
        break;

        case "Docente":
            
        Connection cn2=Conexion.Conectar();
        PreparedStatement pst2=cn2.prepareStatement("select id_tabla_curso ,Id_curso, Descripcion_curso,Inicio_clase,fin_clase,Dia,Grado,"
                                                    + "Nivel,Dni_doc from tabla_cursos where Nombre_doc like"+'"'+texto+'"');
        ResultSet resul2=pst2.executeQuery();
        TABLA_CURSOS=new JTable(MODEL_TABLA_CURSOS);
        jScrollPane1.setViewportView(TABLA_CURSOS);
              
        while(resul2.next())
        {
            Object[] fila2 =new Object[9];
            for(int i=0;i<9;i++)
            {
                fila2[i]=resul2.getObject(i+1);
            }
            MODEL_TABLA_CURSOS.addRow(fila2);
        }
        cn2.close();
                        // creamos evento a la tabla
        TABLA_CURSOS.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e)
        {
            int filaPoint=TABLA_CURSOS.rowAtPoint(e.getPoint());
            if(filaPoint>-1)
            {
                int idTablacurso=(int)MODEL_TABLA_CURSOS.getValueAt(filaPoint,0);
                RecuperarInfoClik(idTablacurso);
            }
        }
        });
        break;

        }
        
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"error, al filtar "+cmb_filtros.getSelectedItem().toString());
                              System.err.println("error, al filtar cursos: "+e);}
    }//GEN-LAST:event_txt_infoBuscarKeyReleased

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JComboBox<String> cmb_dia;
    private javax.swing.JComboBox<String> cmb_filtros;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label_id_tabla;
    private javax.swing.JPanel panel_buscar;
    private javax.swing.JPanel panel_informacionCursoHistorico;
    private javax.swing.JTextField txt_infoBuscar;
    // End of variables declaration//GEN-END:variables

    public void RecuperarInfoCursos()
    {
    try {
        Connection cn=Conexion.Conectar();
        PreparedStatement pst=cn.prepareStatement("select id_tabla_curso ,Id_curso, Descripcion_curso,Inicio_clase,fin_clase,Dia, Grado,"
                                                    + "Nivel,Dni_doc from tabla_cursos");
        ResultSet resul=pst.executeQuery();
        String[] titulos={"ID","CÓDIGO CURSO","DESCRIPCIÓN","INICIO CLASE","FIN CLASE","DIA","GRADO","NIVEL","DNI DOCENTE"};
        MODEL_TABLA_CURSOS= new DefaultTableModel(null,titulos);
        TABLA_CURSOS=new JTable(MODEL_TABLA_CURSOS);
        jScrollPane1.setViewportView(TABLA_CURSOS);
              
             TABLA_CURSOS.getColumnModel().getColumn(0).setMaxWidth(40);
             TABLA_CURSOS.getColumnModel().getColumn(2).setPreferredWidth(200);
             TABLA_CURSOS.setRowHeight(30);
        while(resul.next())
        {
            Object[] fila =new Object[9];
            for(int i=0;i<9;i++)
            {
                fila[i]=resul.getObject(i+1);
            }
            MODEL_TABLA_CURSOS.addRow(fila);
        }
        cn.close();

        
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"error, al recuperar información, contate al administrador");
                              System.err.println("error, al recuperar infromacion de los cursos: "+e);}
    }
    
    
    // recuperar datos con el clic en la tabla
     public void RecuperarInfoClik(int id_tabla_curso)
    {
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
        RegistroDeCursos mens= new RegistroDeCursos();
        jDesktopPane1.add(mens);
        mens.setVisible(true);
     }
     

}
