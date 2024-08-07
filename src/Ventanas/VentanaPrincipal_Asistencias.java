
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


public class VentanaPrincipal_Asistencias extends javax.swing.JFrame {
    DefaultTableModel MODEL_TABLA_ESTUDIANTES =new DefaultTableModel();
    
    int pase=0; String GradoBuscarCMBox;
    public VentanaPrincipal_Asistencias() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        
        label_nombreLogin.setText(Login.Nombre);
        label_apellidoLogin.setText(Login.apellidos);
        
       Hilo_hora horaAutomatica = new Hilo_hora();
       horaAutomatica.start();
       
    Boton_actualizarAsistenciaEST.setVisible(false);
    Boton_guardarAsistenciaEST.setVisible(false);

    
        panel_BuscarAsistenciaDocentes.setVisible(false);
        panel_BuscarAsistenciaestudiantes.setVisible(false);    
        cmb_curso.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        label_nombreLogin = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        label_apellidoLogin = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelFechaLogin = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        label_horaLogin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BotonRegistraAsistenciaDocente = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA_ASISTENCIA_ESTUDIANTES = new javax.swing.JTable();
        label_tituloAsistencia_Estudiates = new javax.swing.JLabel();
        Boton_guardarAsistenciaEST = new javax.swing.JButton();
        Boton_actualizarAsistenciaEST = new javax.swing.JButton();
        panel_BuscarAsistenciaestudiantes = new javax.swing.JPanel();
        Boton_Buscar = new javax.swing.JButton();
        txt_fechaAsistenciaEstudiantes = new com.toedter.calendar.JDateChooser();
        cmb_curso = new javax.swing.JComboBox<>();
        panel_BuscarAsistenciaDocentes = new javax.swing.JPanel();
        txt_filtro = new javax.swing.JTextField();
        jcmb_tipoFiltro = new javax.swing.JComboBox<>();
        Boton_BuscarFechaDocentes = new javax.swing.JButton();
        txt_fechaAsistenciaDocentes = new com.toedter.calendar.JDateChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        Menu_4años1 = new javax.swing.JMenuItem();
        Menu_5años1 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        Menu_1eroPrimaria1 = new javax.swing.JMenuItem();
        Menu_2doPrimaria1 = new javax.swing.JMenuItem();
        Menu_3roPrimaria1 = new javax.swing.JMenuItem();
        Menu_4toPrimaria1 = new javax.swing.JMenuItem();
        Menu_5toPrimaria1 = new javax.swing.JMenuItem();
        Menu_6toPrimaria1 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        Menu_1eroSecundaria1 = new javax.swing.JMenuItem();
        Menu_2doSecundaria1 = new javax.swing.JMenuItem();
        Menu_3roSecundaria1 = new javax.swing.JMenuItem();
        Menu_4toSecundaria1 = new javax.swing.JMenuItem();
        Menu_5toSecundaria1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(102, 102, 0));
        jLabel11.setText("Nombre    :");

        label_nombreLogin.setText(" ");

        jLabel6.setForeground(new java.awt.Color(102, 102, 0));
        jLabel6.setText("Apellidos  :");

        label_apellidoLogin.setText(" ");

        jLabel10.setForeground(new java.awt.Color(102, 102, 0));
        jLabel10.setText("Fecha :");

        labelFechaLogin.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelFechaLogin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelFechaLogin.setText(" ");

        jLabel9.setForeground(new java.awt.Color(102, 102, 0));
        jLabel9.setText("Hora   :");

        label_horaLogin.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        label_horaLogin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_horaLogin.setText(" ");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImgenUserLogin.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Asistencia I.E");

        BotonRegistraAsistenciaDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AistenciaDocente.png"))); // NOI18N
        BotonRegistraAsistenciaDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistraAsistenciaDocenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_apellidoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nombreLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addGap(170, 170, 170)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFechaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_horaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonRegistraAsistenciaDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label_nombreLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_apellidoLogin))
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(labelFechaLogin, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(label_horaLogin))
                        .addContainerGap(27, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(BotonRegistraAsistenciaDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jInternalFrame1.setVisible(true);

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

        label_tituloAsistencia_Estudiates.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        label_tituloAsistencia_Estudiates.setForeground(new java.awt.Color(102, 102, 0));
        label_tituloAsistencia_Estudiates.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_tituloAsistencia_Estudiates.setText("Asistencia");

        Boton_guardarAsistenciaEST.setBackground(new java.awt.Color(0, 51, 153));
        Boton_guardarAsistenciaEST.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Boton_guardarAsistenciaEST.setForeground(new java.awt.Color(255, 255, 255));
        Boton_guardarAsistenciaEST.setText("Guardar");
        Boton_guardarAsistenciaEST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_guardarAsistenciaESTActionPerformed(evt);
            }
        });

        Boton_actualizarAsistenciaEST.setBackground(new java.awt.Color(0, 51, 153));
        Boton_actualizarAsistenciaEST.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Boton_actualizarAsistenciaEST.setForeground(new java.awt.Color(255, 255, 255));
        Boton_actualizarAsistenciaEST.setText("Actulizar");
        Boton_actualizarAsistenciaEST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_actualizarAsistenciaESTActionPerformed(evt);
            }
        });

        Boton_Buscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Boton_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        Boton_Buscar.setText("Buscar");
        Boton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_BuscarActionPerformed(evt);
            }
        });

        txt_fechaAsistenciaEstudiantes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_fechaAsistenciaEstudiantesFocusGained(evt);
            }
        });
        txt_fechaAsistenciaEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_fechaAsistenciaEstudiantesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_BuscarAsistenciaestudiantesLayout = new javax.swing.GroupLayout(panel_BuscarAsistenciaestudiantes);
        panel_BuscarAsistenciaestudiantes.setLayout(panel_BuscarAsistenciaestudiantesLayout);
        panel_BuscarAsistenciaestudiantesLayout.setHorizontalGroup(
            panel_BuscarAsistenciaestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_BuscarAsistenciaestudiantesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmb_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                .addComponent(txt_fechaAsistenciaEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Boton_Buscar)
                .addGap(19, 19, 19))
        );
        panel_BuscarAsistenciaestudiantesLayout.setVerticalGroup(
            panel_BuscarAsistenciaestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BuscarAsistenciaestudiantesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_BuscarAsistenciaestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmb_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_BuscarAsistenciaestudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Boton_Buscar)
                        .addComponent(txt_fechaAsistenciaEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout panel_BuscarAsistenciaDocentesLayout = new javax.swing.GroupLayout(panel_BuscarAsistenciaDocentes);
        panel_BuscarAsistenciaDocentes.setLayout(panel_BuscarAsistenciaDocentesLayout);
        panel_BuscarAsistenciaDocentesLayout.setHorizontalGroup(
            panel_BuscarAsistenciaDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BuscarAsistenciaDocentesLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jcmb_tipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
                .addComponent(txt_fechaAsistenciaDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton_BuscarFechaDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        panel_BuscarAsistenciaDocentesLayout.setVerticalGroup(
            panel_BuscarAsistenciaDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BuscarAsistenciaDocentesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_BuscarAsistenciaDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_BuscarAsistenciaDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Boton_BuscarFechaDocentes, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_fechaAsistenciaDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_BuscarAsistenciaDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_filtro, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jcmb_tipoFiltro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(label_tituloAsistencia_Estudiates, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addComponent(Boton_actualizarAsistenciaEST, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton_guardarAsistenciaEST, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel_BuscarAsistenciaDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_BuscarAsistenciaestudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 467, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_tituloAsistencia_Estudiates)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_BuscarAsistenciaDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_BuscarAsistenciaestudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_guardarAsistenciaEST, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_actualizarAsistenciaEST, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        jDesktopPane2.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconasistenciaDocentes.png"))); // NOI18N
        jMenu1.setText("Docentes");
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu3);
        jMenuBar1.add(jMenu2);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconasistenciaEstudiante.png"))); // NOI18N
        jMenu8.setText("Estudiante ");
        jMenu8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenu9.setText("Inicial");

        Menu_4años1.setText("4 Años");
        Menu_4años1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_4años1ActionPerformed(evt);
            }
        });
        jMenu9.add(Menu_4años1);

        Menu_5años1.setText("5 Años");
        Menu_5años1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_5años1ActionPerformed(evt);
            }
        });
        jMenu9.add(Menu_5años1);

        jMenu8.add(jMenu9);

        jMenu10.setText("Primaria");

        Menu_1eroPrimaria1.setText("1ro Primaria");
        Menu_1eroPrimaria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_1eroPrimaria1ActionPerformed(evt);
            }
        });
        jMenu10.add(Menu_1eroPrimaria1);

        Menu_2doPrimaria1.setText("2do Primaria");
        Menu_2doPrimaria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_2doPrimaria1ActionPerformed(evt);
            }
        });
        jMenu10.add(Menu_2doPrimaria1);

        Menu_3roPrimaria1.setText("3ro Primaria");
        Menu_3roPrimaria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_3roPrimaria1ActionPerformed(evt);
            }
        });
        jMenu10.add(Menu_3roPrimaria1);

        Menu_4toPrimaria1.setText("4to Primaria");
        Menu_4toPrimaria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_4toPrimaria1ActionPerformed(evt);
            }
        });
        jMenu10.add(Menu_4toPrimaria1);

        Menu_5toPrimaria1.setText("5to Primaria");
        Menu_5toPrimaria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_5toPrimaria1ActionPerformed(evt);
            }
        });
        jMenu10.add(Menu_5toPrimaria1);

        Menu_6toPrimaria1.setText("6to Primaria");
        Menu_6toPrimaria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_6toPrimaria1ActionPerformed(evt);
            }
        });
        jMenu10.add(Menu_6toPrimaria1);

        jMenu8.add(jMenu10);

        jMenu11.setText("Secundaria");

        Menu_1eroSecundaria1.setText("1ro Secundaria");
        Menu_1eroSecundaria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_1eroSecundaria1ActionPerformed(evt);
            }
        });
        jMenu11.add(Menu_1eroSecundaria1);

        Menu_2doSecundaria1.setText("2do Secundaria");
        Menu_2doSecundaria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_2doSecundaria1ActionPerformed(evt);
            }
        });
        jMenu11.add(Menu_2doSecundaria1);

        Menu_3roSecundaria1.setText("3ro Secundaria");
        Menu_3roSecundaria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_3roSecundaria1ActionPerformed(evt);
            }
        });
        jMenu11.add(Menu_3roSecundaria1);

        Menu_4toSecundaria1.setText("4to Secundaria");
        Menu_4toSecundaria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_4toSecundaria1ActionPerformed(evt);
            }
        });
        jMenu11.add(Menu_4toSecundaria1);

        Menu_5toSecundaria1.setText("5to Secundaria");
        Menu_5toSecundaria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_5toSecundaria1ActionPerformed(evt);
            }
        });
        jMenu11.add(Menu_5toSecundaria1);

        jMenu8.add(jMenu11);

        jMenuBar1.add(jMenu8);

        jInternalFrame1.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jDesktopPane2)
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(65, 65, 65))
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jInternalFrame1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        pase=1;
    }//GEN-LAST:event_formWindowClosed

    private void Menu_5toSecundaria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_5toSecundaria1ActionPerformed
        // TODO add your handling code here:
        label_tituloAsistencia_Estudiates.setText("5TO de Secundaria");
      reuperarListaEstudiante("tabla_quinto_secundaria");
      GradoBuscarCMBox="5TO de Secundaria";
      
        panel_BuscarAsistenciaDocentes.setVisible(false);
        panel_BuscarAsistenciaestudiantes.setVisible(true);
        llenarcomboBoxCursoSecundaria();

        
    }//GEN-LAST:event_Menu_5toSecundaria1ActionPerformed

    private void Menu_4toSecundaria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_4toSecundaria1ActionPerformed
        // TODO add your handling code here:
        label_tituloAsistencia_Estudiates.setText("4TO de Secundaria");
      reuperarListaEstudiante("tabla_cuarto_secundaria");
      GradoBuscarCMBox="4TO de Secundaria";
        panel_BuscarAsistenciaDocentes.setVisible(false);
        panel_BuscarAsistenciaestudiantes.setVisible(true);
        llenarcomboBoxCursoSecundaria();
    }//GEN-LAST:event_Menu_4toSecundaria1ActionPerformed

    private void Menu_3roSecundaria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_3roSecundaria1ActionPerformed
        // TODO add your handling code here:
        label_tituloAsistencia_Estudiates.setText("3ERO de Secundaria");
      reuperarListaEstudiante("tabla_tercero_secundaria");
      GradoBuscarCMBox="3ERO de Secundaria";
        panel_BuscarAsistenciaDocentes.setVisible(false);
        panel_BuscarAsistenciaestudiantes.setVisible(true);
        llenarcomboBoxCursoSecundaria();
    }//GEN-LAST:event_Menu_3roSecundaria1ActionPerformed

    private void Menu_2doSecundaria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_2doSecundaria1ActionPerformed
        // TODO add your handling code here:
        label_tituloAsistencia_Estudiates.setText("2DO de Secundaria");
      reuperarListaEstudiante("tabla_segundo_secundaria");
      GradoBuscarCMBox="2DO de Secundaria";
        panel_BuscarAsistenciaDocentes.setVisible(false);
        panel_BuscarAsistenciaestudiantes.setVisible(true);
        llenarcomboBoxCursoSecundaria();
    }//GEN-LAST:event_Menu_2doSecundaria1ActionPerformed

    private void Menu_1eroSecundaria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_1eroSecundaria1ActionPerformed
        // TODO add your handling code here:
        label_tituloAsistencia_Estudiates.setText("1ERO de Secundaria");
      reuperarListaEstudiante("tabla_primero_secundaria");
      GradoBuscarCMBox="1ERO de Secundaria";
        panel_BuscarAsistenciaDocentes.setVisible(false);
        panel_BuscarAsistenciaestudiantes.setVisible(true);
        llenarcomboBoxCursoSecundaria();
    }//GEN-LAST:event_Menu_1eroSecundaria1ActionPerformed

    private void Menu_6toPrimaria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_6toPrimaria1ActionPerformed
        // TODO add your handling code here:
        label_tituloAsistencia_Estudiates.setText("6TO de Primaria");
      reuperarListaEstudiante("tabla_sexto_primaria");
      GradoBuscarCMBox="6TO de Primaria";
        panel_BuscarAsistenciaDocentes.setVisible(false);
        panel_BuscarAsistenciaestudiantes.setVisible(true);
        llenarcomboBoxCursoPrimaria();
    }//GEN-LAST:event_Menu_6toPrimaria1ActionPerformed

    private void Menu_5toPrimaria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_5toPrimaria1ActionPerformed
        // TODO add your handling code here:
        label_tituloAsistencia_Estudiates.setText("5TO de Primaria");
      reuperarListaEstudiante("tabla_quinto_primaria");
      GradoBuscarCMBox="5TO de Primaria";
        panel_BuscarAsistenciaDocentes.setVisible(false);
        panel_BuscarAsistenciaestudiantes.setVisible(true);
        llenarcomboBoxCursoPrimaria();
    }//GEN-LAST:event_Menu_5toPrimaria1ActionPerformed

    private void Menu_4toPrimaria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_4toPrimaria1ActionPerformed
        // TODO add your handling code here:
        label_tituloAsistencia_Estudiates.setText("4TO de Primaria");
      reuperarListaEstudiante("tabla_cuarto_primaria");
      GradoBuscarCMBox="4TO de Primaria";
        panel_BuscarAsistenciaDocentes.setVisible(false);
        panel_BuscarAsistenciaestudiantes.setVisible(true);
        llenarcomboBoxCursoPrimaria();
    }//GEN-LAST:event_Menu_4toPrimaria1ActionPerformed

    private void Menu_3roPrimaria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_3roPrimaria1ActionPerformed
        // TODO add your handling code here:
        label_tituloAsistencia_Estudiates.setText("3ERO de Primaria");
      reuperarListaEstudiante("tabla_tercero_primaria");
      GradoBuscarCMBox="3ERO de Primaria";
        panel_BuscarAsistenciaDocentes.setVisible(false);
        panel_BuscarAsistenciaestudiantes.setVisible(true);
        llenarcomboBoxCursoPrimaria();
    }//GEN-LAST:event_Menu_3roPrimaria1ActionPerformed

    private void Menu_2doPrimaria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_2doPrimaria1ActionPerformed
        // TODO add your handling code here:
        label_tituloAsistencia_Estudiates.setText("2DO de Primaria");
      reuperarListaEstudiante("tabla_segundo_primaria");
      GradoBuscarCMBox="2DO de Primaria";
        panel_BuscarAsistenciaDocentes.setVisible(false);
        panel_BuscarAsistenciaestudiantes.setVisible(true);
        llenarcomboBoxCursoPrimaria();
    }//GEN-LAST:event_Menu_2doPrimaria1ActionPerformed

    private void Menu_1eroPrimaria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_1eroPrimaria1ActionPerformed
        // TODO add your handling code here:
        label_tituloAsistencia_Estudiates.setText("1ERO de Primaria");
      reuperarListaEstudiante("tabla_primero_primaria");
      GradoBuscarCMBox="1ERO de Primaria";
        panel_BuscarAsistenciaDocentes.setVisible(false);
        panel_BuscarAsistenciaestudiantes.setVisible(true);
        llenarcomboBoxCursoPrimaria();
    }//GEN-LAST:event_Menu_1eroPrimaria1ActionPerformed

    private void Menu_5años1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_5años1ActionPerformed
        // TODO add your handling code here: 
        label_tituloAsistencia_Estudiates.setText("5 Años Inicial");
      reuperarListaEstudiante("tabla_5años_inicial");
      GradoBuscarCMBox="5 Años Inicial";
        panel_BuscarAsistenciaDocentes.setVisible(false);
        panel_BuscarAsistenciaestudiantes.setVisible(true);
        llenarcomboBoxCursoInicial();
    }//GEN-LAST:event_Menu_5años1ActionPerformed

    private void Menu_4años1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_4años1ActionPerformed
        // TODO add your handling code here:
        label_tituloAsistencia_Estudiates.setText("4 Años Inicial");
      reuperarListaEstudiante("tabla_4años_inicial");
      GradoBuscarCMBox="4 Años Inicial";
        panel_BuscarAsistenciaDocentes.setVisible(false);
        panel_BuscarAsistenciaestudiantes.setVisible(true);
        llenarcomboBoxCursoInicial();
    }//GEN-LAST:event_Menu_4años1ActionPerformed

    private void BotonRegistraAsistenciaDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistraAsistenciaDocenteActionPerformed
        // TODO add your handling code here:
        RegistrarAsistenciaDocente men= new RegistrarAsistenciaDocente();
        men.setVisible(true);
    }//GEN-LAST:event_BotonRegistraAsistenciaDocenteActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        panel_BuscarAsistenciaDocentes.setVisible(true);
        panel_BuscarAsistenciaestudiantes.setVisible(false);

        label_tituloAsistencia_Estudiates.setText("Registro de Asistencias de la plana Docente");
         String[] TitulosSecundaria={"DNI","NOMBRE","APELLIDOS","HORA","FECHA"};  
     //agregamos datos la tabla estudiantes del 1 secundaria
     try {
         String consulta="select Dni_doc,Nombre_doc,Apellidos_doc,Hora,Fecha from tabla_asistencia_docentes";
         Connection cn1= Conexion.Conectar();
         PreparedStatement pst1=cn1.prepareStatement(consulta);
         ResultSet result1=pst1.executeQuery();
         MODEL_TABLA_ESTUDIANTES=new DefaultTableModel(null,TitulosSecundaria);
         TABLA_ASISTENCIA_ESTUDIANTES=new JTable(MODEL_TABLA_ESTUDIANTES);
         jScrollPane1.setViewportView(TABLA_ASISTENCIA_ESTUDIANTES);
         
           TABLA_ASISTENCIA_ESTUDIANTES.getColumnModel().getColumn(0).setMaxWidth(120);
           TABLA_ASISTENCIA_ESTUDIANTES.getColumnModel().getColumn(3).setMaxWidth(80);
           TABLA_ASISTENCIA_ESTUDIANTES.getColumnModel().getColumn(4).setMaxWidth(80);
          while(result1.next()){
             Object[] columna=new Object[5];
             for(int i=0;i<5;i++){
                columna[i]=result1.getObject(i+1);
             }
             MODEL_TABLA_ESTUDIANTES.addRow(columna);
         }
          cn1.close();
         
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al reecuperar asistencias de los docente");
                               System.err.println("ERROR, al rellenar tabla de asistencia de docentes:"+e); }
 
     Boton_guardarAsistenciaEST.setVisible(false);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void Boton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_BuscarActionPerformed
    SimpleDateFormat dFormat= new SimpleDateFormat("dd/M/yyyy");
    String fechaAsistencia ="%"+dFormat.format(txt_fechaAsistenciaEstudiantes.getDate())+"%";
        
     String[] TitulosSecundaria={"ID","DNI","NOMBRE","APELLIDOS","GRADO","CURSO","FECHA","F/T/A"};  
     //agregamos datos la tabla estudiantes del 1 secundaria
     try {
         Connection cn1= Conexion.Conectar();
         PreparedStatement pst1=cn1.prepareStatement("select * from tabla_asistencia_estudiantes where Grado='"+GradoBuscarCMBox+"' and Fecha like"+'"'+fechaAsistencia+'"');
                 ResultSet result1=pst1.executeQuery();
         MODEL_TABLA_ESTUDIANTES=new DefaultTableModel(null,TitulosSecundaria);
         TABLA_ASISTENCIA_ESTUDIANTES=new JTable(MODEL_TABLA_ESTUDIANTES);
         jScrollPane1.setViewportView(TABLA_ASISTENCIA_ESTUDIANTES);
         
           TABLA_ASISTENCIA_ESTUDIANTES.getColumnModel().getColumn(0).setMaxWidth(50);
           TABLA_ASISTENCIA_ESTUDIANTES.getColumnModel().getColumn(2).setPreferredWidth(100);
           TABLA_ASISTENCIA_ESTUDIANTES.getColumnModel().getColumn(3).setPreferredWidth(180);
           TABLA_ASISTENCIA_ESTUDIANTES.getColumnModel().getColumn(4).setPreferredWidth(120);
           TABLA_ASISTENCIA_ESTUDIANTES.getColumnModel().getColumn(6).setMaxWidth(50);
           while(result1.next())
           {
            Object[] columna1=new Object[8];
             for(int i=0;i<8;i++)
                {
                columna1[i]=result1.getObject(i+1);
                }
             MODEL_TABLA_ESTUDIANTES.addRow(columna1);
            }
           
              MODEL_TABLA_ESTUDIANTES.addRow(new Object[]{"","","","","","Actualizar","si/no",""});
            TABLA_ASISTENCIA_ESTUDIANTES.setModel(MODEL_TABLA_ESTUDIANTES);
             
          cn1.close();
         
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos de los estudantes para la sistencia");
                               System.err.println("ERROR, al rellenar tabla para la actulizacion sistencia de estudiante:"+e); }
   
      Boton_guardarAsistenciaEST.setVisible(false);
     Boton_actualizarAsistenciaEST.setVisible(true);


    }//GEN-LAST:event_Boton_BuscarActionPerformed

    private void Boton_guardarAsistenciaESTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_guardarAsistenciaESTActionPerformed
    int ultimaFila=TABLA_ASISTENCIA_ESTUDIANTES.getRowCount();
    String Validador= (MODEL_TABLA_ESTUDIANTES.getValueAt(ultimaFila-1,5).toString());
    String curso=cmb_curso.getSelectedItem().toString();
    int contador=0;
  
    if(!Validador.equalsIgnoreCase("si"))
      {  JOptionPane.showMessageDialog(null, "Ingrese la palabra 'si'");
         contador++;   
      }
    
    if(curso.equals("-Seleccionar Curso-"))
    {
        JOptionPane.showMessageDialog(null, "Selecione un curso");
        contador++;
    }
    if(contador==0){
    int mensaje=JOptionPane.showConfirmDialog(null,"Guadar Asistencia",null,JOptionPane.YES_NO_OPTION);
     if(mensaje==JOptionPane.YES_OPTION)
     {
    try {
      Connection cn= Conexion.Conectar();
      PreparedStatement pst= cn.prepareStatement("insert into tabla_asistencia_estudiantes values (?,?,?,?,?,?,?,?)");
          
      for(int i=0;i<TABLA_ASISTENCIA_ESTUDIANTES.getRowCount()-1;i++)
      {
      

      String dni=(String)MODEL_TABLA_ESTUDIANTES.getValueAt(i,0);
      String nombre=(String)MODEL_TABLA_ESTUDIANTES.getValueAt(i,1);
      String apellidos=(String)MODEL_TABLA_ESTUDIANTES.getValueAt(i,2);
      String grado=(String)MODEL_TABLA_ESTUDIANTES.getValueAt(i,3);
      String fecha=(String)MODEL_TABLA_ESTUDIANTES.getValueAt(i,4);
      String situcaion=(String)MODEL_TABLA_ESTUDIANTES.getValueAt(i,5);
            pst.setInt(1,0);
            pst.setString(2,dni);
            pst.setString(3,nombre);
            pst.setString(4,apellidos);
            pst.setString(5,grado);
            pst.setString(6,curso);
            pst.setString(7,fecha);
            pst.setString(8,situcaion.toUpperCase());
            pst.executeUpdate();
      }
      cn.close();
     JOptionPane.showMessageDialog(null,"Asistencia registrada Exitosamente");
  }  catch (Exception e) {JOptionPane.showMessageDialog(null, "Error  al Guardar asistencia asegurece de completar todos los campos \n                     contacte al administrador",null, JOptionPane.WARNING_MESSAGE);
                            System.err.println("erro registrar asistencia estudiantes:"+e);  }
  }
  else
    {
      JOptionPane.showMessageDialog(null, "REGISTRO CANCELADO");
       }
   }
        

   
    }//GEN-LAST:event_Boton_guardarAsistenciaESTActionPerformed

    private void Boton_actualizarAsistenciaESTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_actualizarAsistenciaESTActionPerformed
        int ultimaFila=TABLA_ASISTENCIA_ESTUDIANTES.getRowCount();
      String Validador= (MODEL_TABLA_ESTUDIANTES.getValueAt(ultimaFila-1,7).toString());
      if(Validador.equalsIgnoreCase("si"))
      {
        int mensaje=JOptionPane.showConfirmDialog(null,"Actualizar Asistencia",null,JOptionPane.YES_NO_OPTION);
        if(mensaje==JOptionPane.YES_OPTION)
        {
    try {
      Connection cn= Conexion.Conectar();
          
      for(int i=0;i<TABLA_ASISTENCIA_ESTUDIANTES.getRowCount()-1;i++)
      {
      int id=(int)MODEL_TABLA_ESTUDIANTES.getValueAt(i,0);
      String dni=(String)MODEL_TABLA_ESTUDIANTES.getValueAt(i,1);
      String nombre=(String)MODEL_TABLA_ESTUDIANTES.getValueAt(i,2);
      String apellidos=(String)MODEL_TABLA_ESTUDIANTES.getValueAt(i,3);
      String grado=(String)MODEL_TABLA_ESTUDIANTES.getValueAt(i,4);
      String curso=(String)MODEL_TABLA_ESTUDIANTES.getValueAt(i,5);
      String fecha=(String)MODEL_TABLA_ESTUDIANTES.getValueAt(i,6);
      String situcaion=(String)MODEL_TABLA_ESTUDIANTES.getValueAt(i,7);
      
      PreparedStatement pst= cn.prepareStatement("update tabla_asistencia_estudiantes set Dni_est=?,Nombre_est=?,"
              + " Apellidos_est=?,Grado=?,Curso=?,Fecha=?,situacion=? where Id_tabla_asistencia_est='"+id+"'");
      
            pst.setString(1,dni);
            pst.setString(2,nombre);
            pst.setString(3,apellidos);
            pst.setString(4,grado);
            pst.setString(5,curso);
            pst.setString(6,fecha);
            pst.setString(7,situcaion.toUpperCase());
            pst.executeUpdate();
      }
      cn.close();
     JOptionPane.showMessageDialog(null,"Actualización Exitosa");
  }  catch (Exception e) {JOptionPane.showMessageDialog(null, "Error Guardar asistencia \n contacte al administrador",null, JOptionPane.WARNING_MESSAGE);
                            System.err.println("erro registrar asistencia estudiantes:"+e);  }
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

    private void txt_fechaAsistenciaEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_fechaAsistenciaEstudiantesMouseClicked
        
     // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaAsistenciaEstudiantesMouseClicked

    private void txt_fechaAsistenciaEstudiantesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_fechaAsistenciaEstudiantesFocusGained
               // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaAsistenciaEstudiantesFocusGained

    private void txt_filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtroActionPerformed

    }//GEN-LAST:event_txt_filtroActionPerformed

    private void txt_filtroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroKeyReleased

        try
        {// en texto escrito a consultar en la tabla
            String texto="%"+txt_filtro.getText().trim()+"%";

            // secuberra el tipo de filtro
            String filtroSelec=jcmb_tipoFiltro.getSelectedItem().toString();

            // ETIQUETAS DE EMCABEZADO DE TABLA
            String[] titulos={"DNI", "NOMBRE", "APELLIDOS", "FECHA ", "HORA"};
            MODEL_TABLA_ESTUDIANTES=new DefaultTableModel(null,titulos);

            // FUNCIONES DEPENDIENDO DEL TIPO DE FILTRO ELEGIDO
            switch (filtroSelec)
            {//*********** FILTRO PARA NOMBRE DE CLIENTES ************
                case"Nombre":

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1= cn1.prepareStatement("select * from tabla_asistencia_docentes where Nombre_doc like"+'"'+texto+'"');
                String[] fila1= new String[5];
                ResultSet resul1=pst1.executeQuery();
                TABLA_ASISTENCIA_ESTUDIANTES = new JTable(MODEL_TABLA_ESTUDIANTES);
                jScrollPane1.setViewportView(TABLA_ASISTENCIA_ESTUDIANTES);

                //recuperar valores de BD A LA TABLA
                while(resul1.next())
                {
                    fila1[0]=resul1.getString("Dni_doc");
                    fila1[1]=resul1.getString("Nombre_doc");
                    fila1[2]=resul1.getString("Apellidos_doc");
                    fila1[3]=resul1.getString("Fecha");
                    fila1[4]=resul1.getString("Hora");
                    MODEL_TABLA_ESTUDIANTES.addRow(fila1);
                }
                cn1.close();

                    break;
                    //********** FILTRO DE APELLIDOS DE CLIENTES **********
                    case"Apellidos":

                Connection cn2= Conexion.Conectar();
                PreparedStatement pst2= cn2.prepareStatement("select * from tabla_asistencia_docentes where Apellidos_doc like"+'"'+texto+'"');
                String[] fila2= new String[5];
                ResultSet resul2=pst2.executeQuery();
                TABLA_ASISTENCIA_ESTUDIANTES = new JTable(MODEL_TABLA_ESTUDIANTES);
                jScrollPane1.setViewportView(TABLA_ASISTENCIA_ESTUDIANTES);

                //recuperar valores de BD A LA TABLA
                while(resul2.next())
                {
                    fila2[0]=resul2.getString("Dni_doc");
                    fila2[1]=resul2.getString("Nombre_doc");
                    fila2[2]=resul2.getString("Apellidos_doc");
                    fila2[3]=resul2.getString("Fecha");
                    fila2[4]=resul2.getString("Hora");
                    MODEL_TABLA_ESTUDIANTES.addRow(fila2);
                }
                cn2.close();

                        break;

                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                case"DNI":
                Connection cn3= Conexion.Conectar();
                PreparedStatement pst3= cn3.prepareStatement("select * from tabla_asistencia_docentes where Dni_doc like"+'"'+texto+'"');
                String[] fila3= new String[5];
                ResultSet resul3=pst3.executeQuery();
                TABLA_ASISTENCIA_ESTUDIANTES = new JTable(MODEL_TABLA_ESTUDIANTES);
                jScrollPane1.setViewportView(TABLA_ASISTENCIA_ESTUDIANTES);

                //recuperar valores de BD A LA TABLA
                while(resul3.next())
                {
                    fila3[0]=resul3.getString("Dni_doc");
                    fila3[1]=resul3.getString("Nombre_doc");
                    fila3[2]=resul3.getString("Apellidos_doc");
                    fila3[3]=resul3.getString("Fecha");
                    fila3[4]=resul3.getString("Hora");
                    MODEL_TABLA_ESTUDIANTES.addRow(fila3);
                }
                cn3.close();
                break;

                            }

                        } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error al filtar "+jcmb_tipoFiltro.getSelectedItem().toString()+"","",JOptionPane.ERROR_MESSAGE);
                            System.err.println("error al filtar la busqueda: "+e); }
    }//GEN-LAST:event_txt_filtroKeyReleased

    private void jcmb_tipoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_tipoFiltroActionPerformed
        // TODO add your handling code here:
        txt_filtro.setText("");
        txt_filtro.requestFocus();
    }//GEN-LAST:event_jcmb_tipoFiltroActionPerformed

    private void Boton_BuscarFechaDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_BuscarFechaDocentesActionPerformed
    SimpleDateFormat dFormat= new SimpleDateFormat("dd/M/yyyy");
    String fechaAsistencia ="%"+dFormat.format(txt_fechaAsistenciaDocentes.getDate())+"%";

        
            String[] titulos={"DNI", "NOMBRE", "APELLIDOS", "FECHA ", "HORA"};
            MODEL_TABLA_ESTUDIANTES=new DefaultTableModel(null,titulos);

     //agregamos datos la tabla estudiantes del 1 secundaria
     try {
                        Connection cn1= Conexion.Conectar();
                PreparedStatement pst1= cn1.prepareStatement("select * from tabla_asistencia_docentes where Fecha like"+'"'+fechaAsistencia+'"');
                String[] fila1= new String[5];
                ResultSet resul1=pst1.executeQuery();
                TABLA_ASISTENCIA_ESTUDIANTES = new JTable(MODEL_TABLA_ESTUDIANTES);
                jScrollPane1.setViewportView(TABLA_ASISTENCIA_ESTUDIANTES);

                //recuperar valores de BD A LA TABLA
                while(resul1.next())
                {
                    fila1[0]=resul1.getString("Dni_doc");
                    fila1[1]=resul1.getString("Nombre_doc");
                    fila1[2]=resul1.getString("Apellidos_doc");
                    fila1[3]=resul1.getString("Fecha");
                    fila1[4]=resul1.getString("Hora");
                    MODEL_TABLA_ESTUDIANTES.addRow(fila1);
                }
                cn1.close();
         
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar asistencia de los docentes ");
                               System.err.println("ERROR, recuperar datos de fecha de asistencia docentes:"+e); }
   
      Boton_guardarAsistenciaEST.setVisible(false);
     Boton_actualizarAsistenciaEST.setVisible(false);
    }//GEN-LAST:event_Boton_BuscarFechaDocentesActionPerformed

    private void txt_fechaAsistenciaDocentesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_fechaAsistenciaDocentesFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaAsistenciaDocentesFocusGained

    private void txt_fechaAsistenciaDocentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_fechaAsistenciaDocentesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaAsistenciaDocentesMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
        ModificarAsistenciaDocente mes = new ModificarAsistenciaDocente();
        mes.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       this.dispose();


    }//GEN-LAST:event_formWindowClosing


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal_Asistencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonRegistraAsistenciaDocente;
    private javax.swing.JButton Boton_Buscar;
    private javax.swing.JButton Boton_BuscarFechaDocentes;
    private javax.swing.JButton Boton_actualizarAsistenciaEST;
    private javax.swing.JButton Boton_guardarAsistenciaEST;
    private javax.swing.JMenuItem Menu_1eroPrimaria1;
    private javax.swing.JMenuItem Menu_1eroSecundaria1;
    private javax.swing.JMenuItem Menu_2doPrimaria1;
    private javax.swing.JMenuItem Menu_2doSecundaria1;
    private javax.swing.JMenuItem Menu_3roPrimaria1;
    private javax.swing.JMenuItem Menu_3roSecundaria1;
    private javax.swing.JMenuItem Menu_4años1;
    private javax.swing.JMenuItem Menu_4toPrimaria1;
    private javax.swing.JMenuItem Menu_4toSecundaria1;
    private javax.swing.JMenuItem Menu_5años1;
    private javax.swing.JMenuItem Menu_5toPrimaria1;
    private javax.swing.JMenuItem Menu_5toSecundaria1;
    private javax.swing.JMenuItem Menu_6toPrimaria1;
    private javax.swing.JTable TABLA_ASISTENCIA_ESTUDIANTES;
    private javax.swing.JComboBox<String> cmb_curso;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcmb_tipoFiltro;
    private javax.swing.JLabel labelFechaLogin;
    private javax.swing.JLabel label_apellidoLogin;
    private javax.swing.JLabel label_horaLogin;
    private javax.swing.JLabel label_nombreLogin;
    private javax.swing.JLabel label_tituloAsistencia_Estudiates;
    private javax.swing.JPanel panel_BuscarAsistenciaDocentes;
    private javax.swing.JPanel panel_BuscarAsistenciaestudiantes;
    private com.toedter.calendar.JDateChooser txt_fechaAsistenciaDocentes;
    private com.toedter.calendar.JDateChooser txt_fechaAsistenciaEstudiantes;
    private javax.swing.JTextField txt_filtro;
    // End of variables declaration//GEN-END:variables


    //******METODO PARA AGREGAR CHECHBOX********
 public void addChechBox (int column,JTable table){
   TableColumn tc=table.getColumnModel().getColumn(column);
   tc.setCellEditor(table.getDefaultEditor(Boolean.class));
   tc.setCellRenderer(table.getDefaultRenderer(Boolean.class));
   
 }
public class Hilo_hora extends Thread{
    @Override
     public void run()
    {
        while(pase==0)
        {
            Calendar Calendario=Calendar.getInstance();
            // FECHA AUTOMATICA
            labelFechaLogin.setText(Integer.toString(Calendario.get(Calendar.DATE))+"/"+
                                    Integer.toString(Calendario.get(Calendar.MONTH)+1)+"/"+
                                    Integer.toString(Calendario.get(Calendar.YEAR)));
            //HORA AUTOMATICA
            String hora=Integer.toString(Calendario.get(Calendar.HOUR_OF_DAY));
            String horaAutomatica=hora+":"+Integer.toString(Calendario.get(Calendar.MINUTE))+":"+
                                           Integer.toString(Calendario.get(Calendar.SECOND)); 
            //AM O PM
         if (Integer.parseInt(hora)<=12){
            label_horaLogin.setText(horaAutomatica+" AM");
            }
         else{
            label_horaLogin.setText(horaAutomatica+" PM");
            }
        
            //ACTUALIZAR HORA Y FECHA 
         try {
             Hilo_hora.sleep(1000);
            } catch (InterruptedException e) {System.err.println("error hilo hora ventana principal horarios");}
        }    
    }  
}


public void reuperarListaEstudiante(String grado)
{Calendar Calendario=Calendar.getInstance();
    // FECHA AUTOMATICA
    String fecha=Integer.toString(Calendario.get(Calendar.DATE))+"/"+
                                    Integer.toString(Calendario.get(Calendar.MONTH)+1)+"/"+
                                    Integer.toString(Calendario.get(Calendar.YEAR));
    String año="%"+Integer.toString(Calendario.get(Calendar.YEAR))+"%";
     String[] TitulosSecundaria={"DNI","NOMBRE","APELLIDOS","GRADO","FECHA","F/T/A"};  
     //agregamos datos la tabla estudiantes del 1 secundaria
     try {
         String consulta="select Dni_est,Nombre_est,Apellidos_est from "+grado+" where FechaRegistro like'"+año+"'";
         Connection cn1= Conexion.Conectar();
         PreparedStatement pst1=cn1.prepareStatement(consulta);
         ResultSet result1=pst1.executeQuery();
         MODEL_TABLA_ESTUDIANTES=new DefaultTableModel(null,TitulosSecundaria);
         TABLA_ASISTENCIA_ESTUDIANTES=new JTable(MODEL_TABLA_ESTUDIANTES);
         jScrollPane1.setViewportView(TABLA_ASISTENCIA_ESTUDIANTES);
          //          addChechBox(5, TABLA_ASISTENCIA_ESTUDIANTES);  
           TABLA_ASISTENCIA_ESTUDIANTES.getColumnModel().getColumn(0).setMaxWidth(120);
           TABLA_ASISTENCIA_ESTUDIANTES.getColumnModel().getColumn(2).setPreferredWidth(200);
           TABLA_ASISTENCIA_ESTUDIANTES.getColumnModel().getColumn(3).setPreferredWidth(100);
           TABLA_ASISTENCIA_ESTUDIANTES.getColumnModel().getColumn(4).setMaxWidth(120);
           TABLA_ASISTENCIA_ESTUDIANTES.getColumnModel().getColumn(5).setMaxWidth(50);
           while(result1.next())
           {
            Object[] columna=new Object[6];
             for(int i=0;i<3;i++){
                columna[i]=result1.getObject(i+1);
             }
             columna[3]=label_tituloAsistencia_Estudiates.getText().trim();
             columna[4]=fecha;
             MODEL_TABLA_ESTUDIANTES.addRow(columna);
            }
          
              MODEL_TABLA_ESTUDIANTES.addRow(new Object[]{"","","","Guardar ","si/no",""});
            TABLA_ASISTENCIA_ESTUDIANTES.setModel(MODEL_TABLA_ESTUDIANTES);
             
          cn1.close();
         
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos de los estudantes para la sistencia");
                               System.err.println("ERROR, al rellenar tabla para la sistencia de estudiante:"+e); }
   
     Boton_guardarAsistenciaEST.setVisible(true);
     Boton_actualizarAsistenciaEST.setVisible(false);
}



public void llenarcomboBoxCursoPrimaria(){
            cmb_curso.setVisible(true);
        cmb_curso.removeAllItems();
        cmb_curso.addItem("-Seleccionar Curso-");
        cmb_curso.addItem("Personal Social");
        cmb_curso.addItem("Educación Física");  
        cmb_curso.addItem("Arte y cultura"); 
        cmb_curso.addItem("Comunicación");  
        cmb_curso.addItem("Matemática");
        cmb_curso.addItem("Ciencia y Tecnología"); 
        cmb_curso.addItem("Educacíon Religiosa");
 
    }
public void llenarcomboBoxCursoSecundaria(){
        cmb_curso.setVisible(true);
        cmb_curso.removeAllItems();
        cmb_curso.addItem("-Seleccionar Curso-");
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
    }

public void llenarcomboBoxCursoInicial(){
            cmb_curso.setVisible(true);
        cmb_curso.removeAllItems();
        cmb_curso.addItem("-Seleccionar Curso-");
        cmb_curso.addItem("curso 1");
        cmb_curso.addItem("curso 2");  
        cmb_curso.addItem("curso 3"); 
 }


}
