
package Ventanas;

import java.awt.Color;
import java.util.Calendar;
import javax.swing.JOptionPane;
import Clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.OptionPaneUI;

public class NewEstudiante extends javax.swing.JFrame {
public static String editarPadreNewEstudiante;
    public NewEstudiante() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        Calendar calendario= Calendar.getInstance();
        String fecha=Integer.toString(calendario.get(Calendar.DATE))+"/"+
                Integer.toString(calendario.get((Calendar.MONTH))+1)+"/"+
                Integer.toString(calendario.get(Calendar.YEAR));
        label_fecha.setText(fecha);
        jCheckBox_padre.setSelected(true);
        jCheckBox_madre.setSelected(true);
        jTabbedPane_infoApoderado.setVisible(false);
        jTabbedPane_infoApoderado.setEnabled(false);
        jRadioButton_apoderado.setVisible(false);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoRadioBoton = new javax.swing.ButtonGroup();
        jScrollPane_panell = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        panelInfoEstudiante = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_dniEstudiante = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_domicilio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmb_genero = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txt_fechaNacimiento = new com.toedter.calendar.JDateChooser();
        label_fecha = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_observaciones = new javax.swing.JTextArea();
        labelComentarioCaracter = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        label_FotoEstudiante = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jCheckBox_madre = new javax.swing.JCheckBox();
        jCheckBox_apoderado = new javax.swing.JCheckBox();
        jCheckBox_padre = new javax.swing.JCheckBox();
        boton_InsertarFotolEstudiante = new javax.swing.JButton();
        txt_rutaFoto = new javax.swing.JTextField();
        jTabbedPane_info_Madre = new javax.swing.JTabbedPane();
        jPanel_infoMadre4 = new javax.swing.JPanel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        txt_observacionesMADRE4 = new javax.swing.JTextArea();
        txt_nombreMadre4 = new javax.swing.JTextField();
        txt_apellidosMadre4 = new javax.swing.JTextField();
        txt_estadoMADRE4 = new javax.swing.JTextField();
        txt_direccionMADRE4 = new javax.swing.JTextField();
        txt_correoMADRE4 = new javax.swing.JTextField();
        txt_telefonoMADRE4 = new javax.swing.JTextField();
        txt_DniMadre4 = new javax.swing.JTextField();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        labelFechaREGISTROMADRE4 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        boton_BuscraMadre = new javax.swing.JButton();
        boton_editarMadre = new javax.swing.JButton();
        jTabbedPane_infoPadre = new javax.swing.JTabbedPane();
        jPanel_infoPadre3 = new javax.swing.JPanel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txt_observacionesPADRE3 = new javax.swing.JTextArea();
        txt_nombrePadre3 = new javax.swing.JTextField();
        txt_apellidos_padre3 = new javax.swing.JTextField();
        txt_estadoPADRE3 = new javax.swing.JTextField();
        txt_direccionPADRE3 = new javax.swing.JTextField();
        txt_correoPADRE3 = new javax.swing.JTextField();
        txt_telefonoPADRE3 = new javax.swing.JTextField();
        txt_dniPadre3 = new javax.swing.JTextField();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        labelFechaREGISTROPADRE3 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        boton_BuscraPadre = new javax.swing.JButton();
        boton_editarPadre = new javax.swing.JButton();
        jTabbedPane_infoApoderado = new javax.swing.JTabbedPane();
        jPanel_infoApoderado2 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txt_observacionesApoderado2 = new javax.swing.JTextArea();
        txt_nombreApoderado2 = new javax.swing.JTextField();
        txt_apellidos_Apoderado2 = new javax.swing.JTextField();
        txt_Parentesto = new javax.swing.JTextField();
        txt_direccionApoderado2 = new javax.swing.JTextField();
        txt_correoApoderado2 = new javax.swing.JTextField();
        txt_telefonoApoderado2 = new javax.swing.JTextField();
        txt_dniApoderado2 = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        labelFechaREGISTROApoderado2 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        boton_BuscraApoderado = new javax.swing.JButton();
        boton_editarApoderado = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton_padre = new javax.swing.JRadioButton();
        jRadioButton_apoderado = new javax.swing.JRadioButton();
        jRadioButton_madre = new javax.swing.JRadioButton();
        botonRegistrarEstudiante = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Doc ident:");

        txt_dniEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dniEstudianteKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Domicilio:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Genero:");

        cmb_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Fecha Nacimiento:");

        txt_fechaNacimiento.setForeground(new java.awt.Color(0, 102, 102));

        label_fecha.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        label_fecha.setForeground(new java.awt.Color(153, 0, 0));
        label_fecha.setText("jLabel17");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Fecha Registro:");

        txt_observaciones.setColumns(20);
        txt_observaciones.setRows(5);
        txt_observaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_observacionesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txt_observaciones);

        labelComentarioCaracter.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelComentarioCaracter.setForeground(new java.awt.Color(255, 0, 0));
        labelComentarioCaracter.setText("* maximo 200 caracteres");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Observaciones/Comentario");

        label_FotoEstudiante.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_FotoEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconUser.png"))); // NOI18N
        label_FotoEstudiante.setText("PERFIL ESTUDIANTE");
        label_FotoEstudiante.setToolTipText("");
        label_FotoEstudiante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_FotoEstudiante.setVerifyInputWhenFocusTarget(false);
        label_FotoEstudiante.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Apellidos:");

        jCheckBox_madre.setText("Madre");
        jCheckBox_madre.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox_madreStateChanged(evt);
            }
        });
        jCheckBox_madre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_madreActionPerformed(evt);
            }
        });

        jCheckBox_apoderado.setText("Apoderado");
        jCheckBox_apoderado.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox_apoderadoStateChanged(evt);
            }
        });
        jCheckBox_apoderado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_apoderadoActionPerformed(evt);
            }
        });

        jCheckBox_padre.setText("Padre");
        jCheckBox_padre.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox_padreStateChanged(evt);
            }
        });
        jCheckBox_padre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_padreActionPerformed(evt);
            }
        });

        boton_InsertarFotolEstudiante.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        boton_InsertarFotolEstudiante.setForeground(new java.awt.Color(255, 0, 51));
        boton_InsertarFotolEstudiante.setText("Insertar");
        boton_InsertarFotolEstudiante.setBorder(null);
        boton_InsertarFotolEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_InsertarFotolEstudianteActionPerformed(evt);
            }
        });

        txt_rutaFoto.setEditable(false);
        txt_rutaFoto.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        txt_rutaFoto.setBorder(null);

        javax.swing.GroupLayout panelInfoEstudianteLayout = new javax.swing.GroupLayout(panelInfoEstudiante);
        panelInfoEstudiante.setLayout(panelInfoEstudianteLayout);
        panelInfoEstudianteLayout.setHorizontalGroup(
            panelInfoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_FotoEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_rutaFoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBox_padre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox_madre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox_apoderado)
                .addGap(271, 271, 271))
            .addGroup(panelInfoEstudianteLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(boton_InsertarFotolEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelInfoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoEstudianteLayout.createSequentialGroup()
                    .addContainerGap(231, Short.MAX_VALUE)
                    .addGroup(panelInfoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelInfoEstudianteLayout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(jLabel1)
                            .addGap(13, 13, 13)
                            .addComponent(txt_dniEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jLabel7)
                            .addGap(8, 8, 8)
                            .addComponent(txt_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelInfoEstudianteLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(23, 23, 23)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(14, 14, 14)
                            .addComponent(jLabel21)
                            .addGap(16, 16, 16)
                            .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelInfoEstudianteLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(16, 16, 16)
                            .addComponent(txt_domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelInfoEstudianteLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(26, 26, 26)
                            .addComponent(cmb_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(81, 81, 81)
                            .addComponent(jLabel17)
                            .addGap(43, 43, 43)
                            .addComponent(label_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelInfoEstudianteLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(295, 295, 295)
                            .addComponent(labelComentarioCaracter))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(82, 82, 82)))
        );
        panelInfoEstudianteLayout.setVerticalGroup(
            panelInfoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoEstudianteLayout.createSequentialGroup()
                .addGroup(panelInfoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoEstudianteLayout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addGroup(panelInfoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox_padre)
                            .addComponent(jCheckBox_madre)
                            .addComponent(jCheckBox_apoderado)))
                    .addGroup(panelInfoEstudianteLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(label_FotoEstudiante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton_InsertarFotolEstudiante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_rutaFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelInfoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoEstudianteLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelInfoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelInfoEstudianteLayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel1))
                        .addComponent(txt_dniEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelInfoEstudianteLayout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txt_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(9, 9, 9)
                    .addGroup(panelInfoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(panelInfoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(panelInfoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(cmb_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(panelInfoEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(labelComentarioCaracter))
                    .addGap(6, 6, 6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(325, 325, 325)))
        );

        jLabel143.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel143.setText("Nombre:");

        jLabel144.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel144.setText("Apellidos:");

        jLabel145.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel145.setText("teléfono:");

        jLabel146.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel146.setText("Correo:");

        jLabel147.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel147.setText("Dirección:");

        jLabel148.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel148.setText("Estado:");

        jLabel149.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel149.setText("Observaciones/comentario");

        txt_observacionesMADRE4.setEditable(false);
        txt_observacionesMADRE4.setColumns(20);
        txt_observacionesMADRE4.setRows(5);
        jScrollPane14.setViewportView(txt_observacionesMADRE4);

        txt_nombreMadre4.setEditable(false);
        txt_nombreMadre4.setBackground(new java.awt.Color(255, 255, 204));
        txt_nombreMadre4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_nombreMadre4.setBorder(null);

        txt_apellidosMadre4.setEditable(false);
        txt_apellidosMadre4.setBackground(new java.awt.Color(255, 255, 204));
        txt_apellidosMadre4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_apellidosMadre4.setBorder(null);

        txt_estadoMADRE4.setEditable(false);
        txt_estadoMADRE4.setBackground(new java.awt.Color(255, 255, 204));
        txt_estadoMADRE4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_estadoMADRE4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_estadoMADRE4.setBorder(null);

        txt_direccionMADRE4.setEditable(false);
        txt_direccionMADRE4.setBackground(new java.awt.Color(255, 255, 204));
        txt_direccionMADRE4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_direccionMADRE4.setBorder(null);

        txt_correoMADRE4.setEditable(false);
        txt_correoMADRE4.setBackground(new java.awt.Color(255, 255, 204));
        txt_correoMADRE4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_correoMADRE4.setBorder(null);

        txt_telefonoMADRE4.setEditable(false);
        txt_telefonoMADRE4.setBackground(new java.awt.Color(255, 255, 204));
        txt_telefonoMADRE4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_telefonoMADRE4.setBorder(null);

        txt_DniMadre4.setBackground(new java.awt.Color(255, 255, 204));
        txt_DniMadre4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_DniMadre4.setForeground(new java.awt.Color(204, 0, 0));
        txt_DniMadre4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_DniMadre4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel150.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel150.setText("Doc Ident");

        jLabel151.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel151.setText("Fecha Registro:");

        labelFechaREGISTROMADRE4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelFechaREGISTROMADRE4.setForeground(new java.awt.Color(153, 0, 0));

        jLabel152.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel152.setForeground(new java.awt.Color(255, 0, 0));
        jLabel152.setText("* maximo 200 caracteres");

        jLabel153.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel153.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icom_madre.png"))); // NOI18N
        jLabel153.setText("MADRE");
        jLabel153.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel153.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        boton_BuscraMadre.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        boton_BuscraMadre.setForeground(new java.awt.Color(255, 0, 51));
        boton_BuscraMadre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        boton_BuscraMadre.setBorder(null);
        boton_BuscraMadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_BuscraMadreActionPerformed(evt);
            }
        });

        boton_editarMadre.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        boton_editarMadre.setForeground(new java.awt.Color(255, 0, 51));
        boton_editarMadre.setText("editar");
        boton_editarMadre.setBorder(null);
        boton_editarMadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_editarMadreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_infoMadre4Layout = new javax.swing.GroupLayout(jPanel_infoMadre4);
        jPanel_infoMadre4.setLayout(jPanel_infoMadre4Layout);
        jPanel_infoMadre4Layout.setHorizontalGroup(
            jPanel_infoMadre4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_infoMadre4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel_infoMadre4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_infoMadre4Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel_infoMadre4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_infoMadre4Layout.createSequentialGroup()
                                .addComponent(jLabel149)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel152))
                            .addGroup(jPanel_infoMadre4Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(212, Short.MAX_VALUE))
                    .addGroup(jPanel_infoMadre4Layout.createSequentialGroup()
                        .addGroup(jPanel_infoMadre4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_infoMadre4Layout.createSequentialGroup()
                                .addGroup(jPanel_infoMadre4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_infoMadre4Layout.createSequentialGroup()
                                        .addGroup(jPanel_infoMadre4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel_infoMadre4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_infoMadre4Layout.createSequentialGroup()
                                                    .addComponent(jLabel147)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txt_direccionMADRE4, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel_infoMadre4Layout.createSequentialGroup()
                                                    .addComponent(jLabel143, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txt_nombreMadre4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel_infoMadre4Layout.createSequentialGroup()
                                                .addComponent(jLabel144)
                                                .addGap(18, 18, 18)
                                                .addComponent(txt_apellidosMadre4, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(8, 8, 8)))
                                        .addGap(16, 16, 16))
                                    .addGroup(jPanel_infoMadre4Layout.createSequentialGroup()
                                        .addComponent(jLabel150)
                                        .addGap(19, 19, 19)
                                        .addComponent(txt_DniMadre4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boton_BuscraMadre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(112, 112, 112)))
                                .addGroup(jPanel_infoMadre4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel151)
                                    .addComponent(jLabel148)))
                            .addGroup(jPanel_infoMadre4Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel146)
                                .addGap(30, 30, 30)
                                .addComponent(txt_correoMADRE4, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel145)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_infoMadre4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_telefonoMADRE4)
                            .addComponent(txt_estadoMADRE4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(labelFechaREGISTROMADRE4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel_infoMadre4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel153)
                            .addGroup(jPanel_infoMadre4Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(boton_editarMadre, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(86, 86, 86))))
        );
        jPanel_infoMadre4Layout.setVerticalGroup(
            jPanel_infoMadre4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_infoMadre4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel_infoMadre4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_infoMadre4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel_infoMadre4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_DniMadre4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel_infoMadre4Layout.createSequentialGroup()
                            .addComponent(boton_BuscraMadre, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)))
                    .addGroup(jPanel_infoMadre4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel_infoMadre4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_estadoMADRE4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel_infoMadre4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_infoMadre4Layout.createSequentialGroup()
                                .addGroup(jPanel_infoMadre4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel143)
                                    .addComponent(txt_nombreMadre4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_infoMadre4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_apellidosMadre4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelFechaREGISTROMADRE4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_infoMadre4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_direccionMADRE4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_infoMadre4Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel_infoMadre4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_infoMadre4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_correoMADRE4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_infoMadre4Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel_infoMadre4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_telefonoMADRE4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel_infoMadre4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_infoMadre4Layout.createSequentialGroup()
                            .addGap(116, 116, 116)
                            .addComponent(boton_editarMadre))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_infoMadre4Layout.createSequentialGroup()
                            .addComponent(jLabel153)
                            .addGap(9, 9, 9))))
                .addGap(13, 13, 13)
                .addGroup(jPanel_infoMadre4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_infoMadre4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel152)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_infoMadre4Layout.createSequentialGroup()
                        .addComponent(jLabel149)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jTabbedPane_info_Madre.addTab("       Información de la Madre       ", jPanel_infoMadre4);

        jLabel121.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel121.setText("Nombre:");

        jLabel122.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel122.setText("Apellidos:");

        jLabel123.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel123.setText("teléfono:");

        jLabel124.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel124.setText("Correo:");

        jLabel125.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel125.setText("Dirección:");

        jLabel126.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel126.setText("Estado:");

        jLabel127.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel127.setText("Observaciones/comentario:");

        txt_observacionesPADRE3.setEditable(false);
        txt_observacionesPADRE3.setColumns(20);
        txt_observacionesPADRE3.setRows(5);
        jScrollPane12.setViewportView(txt_observacionesPADRE3);

        txt_nombrePadre3.setEditable(false);
        txt_nombrePadre3.setBackground(new java.awt.Color(255, 255, 204));
        txt_nombrePadre3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_nombrePadre3.setBorder(null);

        txt_apellidos_padre3.setEditable(false);
        txt_apellidos_padre3.setBackground(new java.awt.Color(255, 255, 204));
        txt_apellidos_padre3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_apellidos_padre3.setBorder(null);

        txt_estadoPADRE3.setEditable(false);
        txt_estadoPADRE3.setBackground(new java.awt.Color(255, 255, 204));
        txt_estadoPADRE3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_estadoPADRE3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_estadoPADRE3.setBorder(null);

        txt_direccionPADRE3.setEditable(false);
        txt_direccionPADRE3.setBackground(new java.awt.Color(255, 255, 204));
        txt_direccionPADRE3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_direccionPADRE3.setBorder(null);

        txt_correoPADRE3.setEditable(false);
        txt_correoPADRE3.setBackground(new java.awt.Color(255, 255, 204));
        txt_correoPADRE3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_correoPADRE3.setBorder(null);

        txt_telefonoPADRE3.setEditable(false);
        txt_telefonoPADRE3.setBackground(new java.awt.Color(255, 255, 204));
        txt_telefonoPADRE3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_telefonoPADRE3.setBorder(null);

        txt_dniPadre3.setBackground(new java.awt.Color(255, 255, 204));
        txt_dniPadre3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_dniPadre3.setForeground(new java.awt.Color(204, 0, 0));
        txt_dniPadre3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_dniPadre3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel128.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel128.setText("Doc Ident");

        jLabel129.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel129.setText("Fecha Registro:");

        labelFechaREGISTROPADRE3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelFechaREGISTROPADRE3.setForeground(new java.awt.Color(153, 0, 0));

        jLabel130.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(255, 0, 0));
        jLabel130.setText("* maximo 200 caracteres");

        jLabel131.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icom_padre.png"))); // NOI18N
        jLabel131.setText("PADRE");
        jLabel131.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel131.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        boton_BuscraPadre.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        boton_BuscraPadre.setForeground(new java.awt.Color(255, 0, 51));
        boton_BuscraPadre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        boton_BuscraPadre.setBorder(null);
        boton_BuscraPadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_BuscraPadreActionPerformed(evt);
            }
        });

        boton_editarPadre.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        boton_editarPadre.setForeground(new java.awt.Color(255, 0, 51));
        boton_editarPadre.setText("editar");
        boton_editarPadre.setBorder(null);
        boton_editarPadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_editarPadreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_infoPadre3Layout = new javax.swing.GroupLayout(jPanel_infoPadre3);
        jPanel_infoPadre3.setLayout(jPanel_infoPadre3Layout);
        jPanel_infoPadre3Layout.setHorizontalGroup(
            jPanel_infoPadre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_infoPadre3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel_infoPadre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_infoPadre3Layout.createSequentialGroup()
                        .addGroup(jPanel_infoPadre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_infoPadre3Layout.createSequentialGroup()
                                .addComponent(jLabel128)
                                .addGap(15, 15, 15)
                                .addComponent(txt_dniPadre3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boton_BuscraPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_infoPadre3Layout.createSequentialGroup()
                                .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_nombrePadre3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_infoPadre3Layout.createSequentialGroup()
                                .addGroup(jPanel_infoPadre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel_infoPadre3Layout.createSequentialGroup()
                                        .addComponent(jLabel125)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_direccionPADRE3))
                                    .addGroup(jPanel_infoPadre3Layout.createSequentialGroup()
                                        .addComponent(jLabel122)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_apellidos_padre3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel_infoPadre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel123)
                                    .addGroup(jPanel_infoPadre3Layout.createSequentialGroup()
                                        .addComponent(jLabel129)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel_infoPadre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_estadoPADRE3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelFechaREGISTROPADRE3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(300, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_infoPadre3Layout.createSequentialGroup()
                        .addComponent(jLabel124)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel_infoPadre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_infoPadre3Layout.createSequentialGroup()
                                .addGap(303, 303, 303)
                                .addComponent(jLabel126)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel_infoPadre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel131)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_infoPadre3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boton_editarPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)))
                                .addGap(86, 86, 86))
                            .addGroup(jPanel_infoPadre3Layout.createSequentialGroup()
                                .addGroup(jPanel_infoPadre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_infoPadre3Layout.createSequentialGroup()
                                        .addComponent(txt_correoPADRE3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(200, 200, 200)
                                        .addComponent(txt_telefonoPADRE3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel_infoPadre3Layout.createSequentialGroup()
                                        .addComponent(jLabel127)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel130))
                                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel_infoPadre3Layout.setVerticalGroup(
            jPanel_infoPadre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_infoPadre3Layout.createSequentialGroup()
                .addGroup(jPanel_infoPadre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_infoPadre3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel_infoPadre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel_infoPadre3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_infoPadre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel126, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_estadoPADRE3))
                            .addComponent(txt_dniPadre3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boton_BuscraPadre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_infoPadre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel121)
                            .addComponent(txt_nombrePadre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_infoPadre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_infoPadre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_apellidos_padre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFechaREGISTROPADRE3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_infoPadre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_direccionPADRE3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_infoPadre3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel_infoPadre3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(boton_editarPadre)))
                .addGroup(jPanel_infoPadre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_infoPadre3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel_infoPadre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telefonoPADRE3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_infoPadre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_correoPADRE3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel_infoPadre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel127)
                    .addComponent(jLabel130))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane_infoPadre.addTab("       Información del Padre       ", jPanel_infoPadre3);

        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel99.setText("Nombre:");

        jLabel100.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel100.setText("Apellidos:");

        jLabel101.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel101.setText("teléfono:");

        jLabel102.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel102.setText("Correo:");

        jLabel103.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel103.setText("Dirección:");

        jLabel104.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel104.setText("Parentesto:");

        jLabel105.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel105.setText("Observaciones/comentario:");

        txt_observacionesApoderado2.setEditable(false);
        txt_observacionesApoderado2.setColumns(20);
        txt_observacionesApoderado2.setRows(5);
        jScrollPane10.setViewportView(txt_observacionesApoderado2);

        txt_nombreApoderado2.setEditable(false);
        txt_nombreApoderado2.setBackground(new java.awt.Color(255, 255, 204));
        txt_nombreApoderado2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_nombreApoderado2.setBorder(null);

        txt_apellidos_Apoderado2.setEditable(false);
        txt_apellidos_Apoderado2.setBackground(new java.awt.Color(255, 255, 204));
        txt_apellidos_Apoderado2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_apellidos_Apoderado2.setBorder(null);

        txt_Parentesto.setEditable(false);
        txt_Parentesto.setBackground(new java.awt.Color(255, 255, 204));
        txt_Parentesto.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_Parentesto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Parentesto.setBorder(null);

        txt_direccionApoderado2.setEditable(false);
        txt_direccionApoderado2.setBackground(new java.awt.Color(255, 255, 204));
        txt_direccionApoderado2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_direccionApoderado2.setBorder(null);

        txt_correoApoderado2.setEditable(false);
        txt_correoApoderado2.setBackground(new java.awt.Color(255, 255, 204));
        txt_correoApoderado2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_correoApoderado2.setBorder(null);

        txt_telefonoApoderado2.setEditable(false);
        txt_telefonoApoderado2.setBackground(new java.awt.Color(255, 255, 204));
        txt_telefonoApoderado2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_telefonoApoderado2.setBorder(null);

        txt_dniApoderado2.setBackground(new java.awt.Color(255, 255, 204));
        txt_dniApoderado2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_dniApoderado2.setForeground(new java.awt.Color(204, 0, 0));
        txt_dniApoderado2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_dniApoderado2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel106.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel106.setText("Doc Ident");

        jLabel107.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel107.setText("Fecha Registro:");

        labelFechaREGISTROApoderado2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        labelFechaREGISTROApoderado2.setForeground(new java.awt.Color(153, 0, 0));

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(255, 0, 0));
        jLabel108.setText("* maximo 200 caracteres");

        jLabel109.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icom_padre.png"))); // NOI18N
        jLabel109.setText("Apoderado");
        jLabel109.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel109.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        boton_BuscraApoderado.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        boton_BuscraApoderado.setForeground(new java.awt.Color(255, 0, 51));
        boton_BuscraApoderado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        boton_BuscraApoderado.setBorder(null);
        boton_BuscraApoderado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_BuscraApoderadoActionPerformed(evt);
            }
        });

        boton_editarApoderado.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        boton_editarApoderado.setForeground(new java.awt.Color(255, 0, 51));
        boton_editarApoderado.setText("editar");
        boton_editarApoderado.setBorder(null);
        boton_editarApoderado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_editarApoderadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_infoApoderado2Layout = new javax.swing.GroupLayout(jPanel_infoApoderado2);
        jPanel_infoApoderado2.setLayout(jPanel_infoApoderado2Layout);
        jPanel_infoApoderado2Layout.setHorizontalGroup(
            jPanel_infoApoderado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_infoApoderado2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel_infoApoderado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_infoApoderado2Layout.createSequentialGroup()
                        .addGroup(jPanel_infoApoderado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_infoApoderado2Layout.createSequentialGroup()
                                .addComponent(jLabel106)
                                .addGap(15, 15, 15)
                                .addComponent(txt_dniApoderado2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boton_BuscraApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_infoApoderado2Layout.createSequentialGroup()
                                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_nombreApoderado2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_infoApoderado2Layout.createSequentialGroup()
                                .addGroup(jPanel_infoApoderado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel_infoApoderado2Layout.createSequentialGroup()
                                        .addComponent(jLabel103)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_direccionApoderado2))
                                    .addGroup(jPanel_infoApoderado2Layout.createSequentialGroup()
                                        .addComponent(jLabel100)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_apellidos_Apoderado2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel_infoApoderado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel101)
                                    .addGroup(jPanel_infoApoderado2Layout.createSequentialGroup()
                                        .addComponent(jLabel107)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelFechaREGISTROApoderado2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(301, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_infoApoderado2Layout.createSequentialGroup()
                        .addComponent(jLabel102)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel_infoApoderado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_infoApoderado2Layout.createSequentialGroup()
                                .addGroup(jPanel_infoApoderado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_infoApoderado2Layout.createSequentialGroup()
                                        .addComponent(jLabel105)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel108))
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel_infoApoderado2Layout.createSequentialGroup()
                                .addGroup(jPanel_infoApoderado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_infoApoderado2Layout.createSequentialGroup()
                                        .addComponent(txt_correoApoderado2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(189, 189, 189)
                                        .addComponent(txt_telefonoApoderado2))
                                    .addGroup(jPanel_infoApoderado2Layout.createSequentialGroup()
                                        .addGap(303, 303, 303)
                                        .addComponent(jLabel104)
                                        .addGap(19, 19, 19)
                                        .addComponent(txt_Parentesto)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel_infoApoderado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel109)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_infoApoderado2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boton_editarApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)))
                                .addGap(71, 71, 71))))))
        );
        jPanel_infoApoderado2Layout.setVerticalGroup(
            jPanel_infoApoderado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_infoApoderado2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel_infoApoderado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_infoApoderado2Layout.createSequentialGroup()
                        .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(boton_editarApoderado))
                    .addGroup(jPanel_infoApoderado2Layout.createSequentialGroup()
                        .addGroup(jPanel_infoApoderado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel_infoApoderado2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel104, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_Parentesto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_dniApoderado2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boton_BuscraApoderado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_infoApoderado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel99)
                            .addComponent(txt_nombreApoderado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_infoApoderado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_infoApoderado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_apellidos_Apoderado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFechaREGISTROApoderado2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_infoApoderado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_direccionApoderado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_infoApoderado2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel_infoApoderado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_infoApoderado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_telefonoApoderado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_infoApoderado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_correoApoderado2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel_infoApoderado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel105)
                            .addComponent(jLabel108))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane_infoApoderado.addTab("       Información del Apoderado       ", jPanel_infoApoderado2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane_info_Madre)
                    .addComponent(jTabbedPane_infoPadre)
                    .addComponent(panelInfoEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane_infoApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelInfoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane_infoPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jTabbedPane_info_Madre, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane_infoApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jScrollPane_panell.setViewportView(jPanel1);

        getContentPane().add(jScrollPane_panell, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 496));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Contactar:");

        GrupoRadioBoton.add(jRadioButton_padre);
        jRadioButton_padre.setText("Padre");

        GrupoRadioBoton.add(jRadioButton_apoderado);
        jRadioButton_apoderado.setText("Apoderado");
        jRadioButton_apoderado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_apoderadoActionPerformed(evt);
            }
        });

        GrupoRadioBoton.add(jRadioButton_madre);
        jRadioButton_madre.setText("Madre");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addComponent(jRadioButton_padre)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton_madre)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton_apoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_apoderado)
                    .addComponent(jRadioButton_padre)
                    .addComponent(jRadioButton_madre)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 507, -1, 40));

        botonRegistrarEstudiante.setText("Registrar Datos del Estudiantes");
        botonRegistrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 547, 213, 32));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarEstudianteActionPerformed
        // TODO add your handling code here:
        String Dni_est ,Nombre_est,Apellidos_est,Genero_est,FNacimiento_est,Domicilio_est,FechaRegistro,
                Observaciones_est,Dni_padre,Nombre_padre,Apellidos_padre,Dni_madre,Nombre_madre,Apellidos_madre,
                Dni_Apoderado,Nombre_Apoderado,Apellidos_Apoderado,Contactar_a="" ;
        int contador=0;
        //datos del estudiante
        Dni_est=txt_dniEstudiante.getText().trim();
        Nombre_est=txt_nombre.getText().trim();
        Apellidos_est=txt_apellidos.getText().trim();
        Genero_est=cmb_genero.getSelectedItem().toString();
        // recuperamos la fecha de nacimeinto selecionada
        SimpleDateFormat dFormat= new SimpleDateFormat("dd/MM/yyyy");
        FNacimiento_est=dFormat.format(txt_fechaNacimiento.getDate());
        Domicilio_est=txt_domicilio.getText().trim();
        FechaRegistro=label_fecha.getText().trim();
        //datos del padre
        Dni_padre=txt_dniPadre3.getText().trim();
        Nombre_padre=txt_nombrePadre3.getText().trim();
        Apellidos_padre=txt_apellidos_padre3.getText().trim();
        //datos de la madre
        Dni_madre=txt_DniMadre4.getText().trim();
        Nombre_madre=txt_nombreMadre4.getText().trim();
        Apellidos_madre=txt_apellidosMadre4.getText().trim();
        // datos el apoderado
        Dni_Apoderado=txt_dniApoderado2.getText().trim();
        Nombre_Apoderado=txt_nombreApoderado2.getText().trim();
        Apellidos_Apoderado=txt_apellidos_Apoderado2.getText().trim();
        // datos de contacto
        
        if(jRadioButton_padre.isSelected())
            { 	//verificar la selecion
            Contactar_a=Dni_padre;
            }
        if(jRadioButton_madre.isSelected())
            { 	//verificar la selecion
            Contactar_a=Dni_madre;
            }
        if(jRadioButton_apoderado.isSelected())
            { 	//verificar la selecion
            Contactar_a=Dni_Apoderado;
            }

        if(txt_rutaFoto.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta ingresar una foto de perfil");
            txt_rutaFoto.setBackground(new Color(250,150,150));
            contador++;
        } 
         if(Dni_est.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar el DNI del estudiante ");
            txt_dniEstudiante.requestFocus();
            txt_dniEstudiante.setBackground(new Color(250,150,150));
            contador++;
        }    
         if(Nombre_est.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar Nombre del estudiante ");
            txt_nombre.requestFocus();
            txt_nombre.setBackground(new Color(250,150,150));
            contador++;
        }        
         if(Apellidos_est.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar Apellidos del estudiante ");
            txt_apellidos.requestFocus();
            txt_apellidos.setBackground(new Color(250,150,150));
            contador++;
        }        
         if(cmb_genero.getSelectedItem().equals("Seleccionar"))
        {
            JOptionPane.showMessageDialog(null, "Falta Selecionar Género");
            contador++;
        }        
         if(FNacimiento_est.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar Ingresar Fecha de Nacimiento");
            txt_fechaNacimiento.requestFocus();
            txt_fechaNacimiento.setBackground(new Color(250,150,150));
            contador++;
        }         
         if(Domicilio_est.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar el Domicilio");
            txt_domicilio.requestFocus();
            txt_domicilio.setBackground(new Color(250,150,150));
            contador++;
        }       
        // validar campos en blanco de datos del padre
    if(jCheckBox_padre.isSelected()==true)
    {
          if(Dni_padre.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar el DNI del padre");
            txt_dniPadre3.requestFocus();
            txt_dniPadre3.setBackground(new Color(250,150,150));
            contador++;
        }    
         if(Nombre_padre.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar Nombre del padre");
            txt_nombrePadre3.requestFocus();
            txt_nombrePadre3.setBackground(new Color(250,150,150));
            contador++;
        }        
         if(Apellidos_padre.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar Apellidos del padre");
            txt_apellidos_padre3.requestFocus();
            txt_apellidos_padre3.setBackground(new Color(250,150,150));
            contador++;
        }        
     }
 
        
        // validar campos en blanco de datos de la madre
    if(jCheckBox_madre.isSelected()==true)
    {
        if(Dni_madre.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar el DNI de la madre");
            txt_DniMadre4.requestFocus();
            txt_DniMadre4.setBackground(new Color(250,150,150));
            contador++;
        }    
         if(Nombre_madre.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar Nombre de la madre");
            txt_nombreMadre4.requestFocus();
            txt_nombreMadre4.setBackground(new Color(250,150,150));
            contador++;
        }        
         if(Apellidos_madre.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar Apellidos de la madre");
            txt_apellidosMadre4.requestFocus();
            txt_apellidosMadre4.setBackground(new Color(250,150,150));
            contador++;
        } 
    }
   if(jCheckBox_apoderado.isSelected()==true)
    {
        if(Dni_Apoderado.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar el DNI del Apoderado");
            txt_dniApoderado2.requestFocus();
            txt_dniApoderado2.setBackground(new Color(250,150,150));
            contador++;
        }    
         if(Nombre_Apoderado.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar Nombre del Apoderado");
            txt_nombreApoderado2.requestFocus();
            txt_nombreApoderado2.setBackground(new Color(250,150,150));
            contador++;
        }        
         if(Apellidos_Apoderado.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar Apellidos del Apoderado");
            txt_apellidos_Apoderado2.requestFocus();
            txt_apellidos_Apoderado2.setBackground(new Color(250,150,150));
            contador++;
        } 

    }
   // persona de contacto
   if(Contactar_a.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta Selecionar una persona de Contacto");
            contador++;
        }
   
       if(contador==0){
       try {
           String validarDni="";
           Connection cn1 =Conexion.Conectar();
           PreparedStatement pst1=cn1.prepareStatement("select Dni_est from tabla_estudiante where Dni_est= '"+Dni_est+"'");
           ResultSet resul1=pst1.executeQuery();
           if(resul1.next())
           {
              validarDni=resul1.getString("Dni_est");
              
           }
           if(validarDni.equals(Dni_est))
              {
                JOptionPane.showMessageDialog(null, "Dni "+Dni_est+" ya registrado",null, JOptionPane.WARNING_MESSAGE);
                txt_dniEstudiante.requestFocus();
                txt_dniEstudiante.setBackground(new Color(250,150,150));
              }
           else{
           int mensaje=JOptionPane.showConfirmDialog(null,"Guardar Registro",null,JOptionPane.YES_NO_OPTION);
            if(mensaje==JOptionPane.YES_OPTION)
              {
              try{FileInputStream archivoFoto;
              Connection cn2=Conexion.Conectar();
              PreparedStatement pst2=cn2.prepareStatement("insert into tabla_estudiante values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
              pst2.setString(1,Dni_est);
              pst2.setString(2,Nombre_est);
              pst2.setString(3,Apellidos_est);
              pst2.setString(4,Genero_est);
              pst2.setString(5,FNacimiento_est);
              pst2.setString(6,Domicilio_est);
              pst2.setString(7,FechaRegistro);
              pst2.setString(8,txt_observaciones.getText().trim());
              pst2.setString(9,Dni_padre);
              pst2.setString(10,Nombre_padre);
              pst2.setString(11,Apellidos_padre);
              pst2.setString(12,Dni_madre);
              pst2.setString(13,Nombre_madre);
              pst2.setString(14,Apellidos_madre);
              pst2.setString(15,Dni_Apoderado);
              pst2.setString(16,Nombre_Apoderado);
              pst2.setString(17,Apellidos_Apoderado);
              pst2.setString(18,Contactar_a);
              pst2.setString(19,txt_rutaFoto.getText());
              archivoFoto=new FileInputStream(txt_rutaFoto.getText());
              pst2.setBinaryStream(20,archivoFoto);
              pst2.setString(21,"");
              pst2.executeUpdate();
              cn2.close();
              // preguntar par volver a ingresar datos
              int mensaje2=JOptionPane.showConfirmDialog(null,"Registro exitoso continuar [S/N]:",null,JOptionPane.YES_NO_OPTION);
              if(mensaje==JOptionPane.YES_OPTION)
                { 
                LimpiarCampos();
                }
              }catch(Exception e){JOptionPane.showMessageDialog(null, "Erro al registrar datos del estudiante \n contacte al administrador",null, JOptionPane.WARNING_MESSAGE);
                                  System.err.println("erro al registra datos del nuevo estudiante:"+e);}
              }
              
            else
              {
            JOptionPane.showMessageDialog(null, "REGISTRO CANCELADO");
              }
           }
       }catch (SQLException ex) {}
        
       }

     
      
        
    }//GEN-LAST:event_botonRegistrarEstudianteActionPerformed

    private void jRadioButton_apoderadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_apoderadoActionPerformed

    }//GEN-LAST:event_jRadioButton_apoderadoActionPerformed

    private void jCheckBox_padreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_padreActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jCheckBox_padreActionPerformed

    private void jCheckBox_padreStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox_padreStateChanged
        // TODO add your handling code here:
    if(jCheckBox_padre.isSelected()==true){
        jTabbedPane_infoPadre.setEnabled(true);
        jTabbedPane_infoPadre.setVisible(true);
        jRadioButton_padre.setVisible(true);
    }else{
        jTabbedPane_infoPadre.setEnabled(false);
        jTabbedPane_infoPadre.setVisible(false);
        jRadioButton_padre.setVisible(false);
        
    }
    
    }//GEN-LAST:event_jCheckBox_padreStateChanged

    private void boton_BuscraPadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_BuscraPadreActionPerformed
        // TODO add your handling code here:
        String dni=txt_dniPadre3.getText().trim();
if(dni.equals(""))
   {
      JOptionPane.showMessageDialog(null,"ingrese DNI...");
   }
else
   {
        try {
         String validarDni="";
         Connection cn= Conexion.Conectar();
         PreparedStatement pst=cn.prepareStatement("select Dni_pad from tabla_padres where Dni_pad='"+dni+"'");
         ResultSet result=pst.executeQuery();
         if(result.next())
         {
           validarDni=result.getString("Dni_pad");
         }
         if(validarDni.equals(dni)){
         Connection cn1= Conexion.Conectar();
         PreparedStatement pst1=cn1.prepareStatement("select *from tabla_padres where Dni_pad='"+dni+"'");
         ResultSet result1=pst1.executeQuery();
         if(result1.next())
         {
             txt_dniPadre3.setText("  "+result1.getString("Dni_pad"));
             txt_nombrePadre3.setText("  "+result1.getString("Nombre_pad"));
             txt_apellidos_padre3.setText("  "+result1.getString("Apellidos_pad"));
             txt_direccionPADRE3.setText("  "+result1.getString("Direccion_pad"));
             txt_correoPADRE3.setText("  "+result1.getString("Correo_pad"));
             txt_telefonoPADRE3.setText("  "+result1.getString("Telf_pad"));
             txt_estadoPADRE3.setText("  "+result1.getString("Estado_pad"));
             labelFechaREGISTROPADRE3.setText("  "+result1.getString("FechaRegistro"));
             txt_observacionesPADRE3.setText("  "+result1.getString("Observaciones"));
         }
        }
        else
         {
            JOptionPane.showMessageDialog(null,"No se encontraron datos... Registrar " );
            NewPadre nuevoPadre=new NewPadre();
            nuevoPadre.setVisible(true);
         }
        } catch (Exception e) {
        
        }
    }
    }//GEN-LAST:event_boton_BuscraPadreActionPerformed

    private void boton_editarPadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_editarPadreActionPerformed
        // TODO add your handling code here:
                String dniPadre=txt_dniPadre3.getText().trim();
        if(dniPadre.equals("")){
            JOptionPane.showMessageDialog(null,"No hay valores... Ingrese dni");
        }
        else{
         EditarDatosPadre(dniPadre);
        }
    }//GEN-LAST:event_boton_editarPadreActionPerformed

    private void boton_editarApoderadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_editarApoderadoActionPerformed
        // TODO add your handling code here:
    String dniApoderado=txt_dniApoderado2.getText().trim();
        if(dniApoderado.equals("")){
            JOptionPane.showMessageDialog(null,"No hay valores... Ingrese dni");
        }
        else{
         EditarDatosPadre(dniApoderado);
        } 
    }//GEN-LAST:event_boton_editarApoderadoActionPerformed

    private void boton_BuscraApoderadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_BuscraApoderadoActionPerformed
        String dni=txt_dniApoderado2.getText().trim();
if(dni.equals(""))
   {
      JOptionPane.showMessageDialog(null,"ingrese DNI...");
   }
else
   {
        try {
         String validarDni="";
         Connection cn= Conexion.Conectar();
         PreparedStatement pst=cn.prepareStatement("select Dni_pad from tabla_padres where Dni_pad='"+dni+"'");
         ResultSet result=pst.executeQuery();
         if(result.next())
         {
           validarDni=result.getString("Dni_pad");
         }
         if(validarDni.equals(dni)){
         Connection cn1= Conexion.Conectar();
         PreparedStatement pst1=cn1.prepareStatement("select *from tabla_padres where Dni_pad='"+dni+"'");
         ResultSet result1=pst1.executeQuery();
         if(result1.next())
         {
             txt_dniApoderado2.setText("  "+result1.getString("Dni_pad"));
             txt_nombreApoderado2.setText("  "+result1.getString("Nombre_pad"));
             txt_apellidos_Apoderado2.setText("  "+result1.getString("Apellidos_pad"));
             txt_direccionApoderado2.setText("  "+result1.getString("Direccion_pad"));
             txt_correoApoderado2.setText("  "+result1.getString("Correo_pad"));
             txt_telefonoApoderado2.setText("  "+result1.getString("Telf_pad"));
             txt_Parentesto.setText("  "+result1.getString("Parentesco_pad"));
             labelFechaREGISTROApoderado2.setText("  "+result1.getString("FechaRegistro"));
             txt_observacionesApoderado2.setText("  "+result1.getString("Observaciones"));
         }
        }
        else
         {
            JOptionPane.showMessageDialog(null,"No se encontraron datos... Registrar " );
            NewPadre nuevoPadre=new NewPadre();
            nuevoPadre.setVisible(true);
         }
        } catch (Exception e) {
        
        }
    }

    }//GEN-LAST:event_boton_BuscraApoderadoActionPerformed

    private void boton_editarMadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_editarMadreActionPerformed
        // TODO add your handling code here:
        String dniMadre=txt_DniMadre4.getText().trim();
        if(dniMadre.equals("")){
            JOptionPane.showMessageDialog(null,"No hay valores... Ingrese dni");
        }
        else{
         EditarDatosPadre(dniMadre);
        }
    }//GEN-LAST:event_boton_editarMadreActionPerformed

    private void boton_BuscraMadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_BuscraMadreActionPerformed
        // TODO add your handling code here:
        String dni=txt_DniMadre4.getText().trim();
if(dni.equals(""))
   {
      JOptionPane.showMessageDialog(null,"ingrese DNI...");
   }
else
   {
        try {
         String validarDni="";
         Connection cn= Conexion.Conectar();
         PreparedStatement pst=cn.prepareStatement("select Dni_pad from tabla_padres where Dni_pad='"+dni+"'");
         ResultSet result=pst.executeQuery();
         if(result.next())
         {
           validarDni=result.getString("Dni_pad");
         }
         if(validarDni.equals(dni)){
         Connection cn1= Conexion.Conectar();
         PreparedStatement pst1=cn1.prepareStatement("select *from tabla_padres where Dni_pad='"+dni+"'");
         ResultSet result1=pst1.executeQuery();
         if(result1.next())
         {
             txt_DniMadre4.setText("  "+result1.getString("Dni_pad"));
             txt_nombreMadre4.setText("  "+result1.getString("Nombre_pad"));
             txt_apellidosMadre4.setText("  "+result1.getString("Apellidos_pad"));
             txt_direccionMADRE4.setText("  "+result1.getString("Direccion_pad"));
             txt_correoMADRE4.setText("  "+result1.getString("Correo_pad"));
             txt_telefonoMADRE4.setText("  "+result1.getString("Telf_pad"));
             txt_estadoMADRE4.setText("  "+result1.getString("Estado_pad"));
             labelFechaREGISTROMADRE4.setText("  "+result1.getString("FechaRegistro"));
             txt_observacionesMADRE4.setText("  "+result1.getString("Observaciones"));
         }
        }
        else
         {
            JOptionPane.showMessageDialog(null,"No se encontraron datos... Registrar " );
            NewPadre nuevoPadre=new NewPadre();
            nuevoPadre.setVisible(true);
         }
        } catch (Exception e) {
        
        }
    }

    }//GEN-LAST:event_boton_BuscraMadreActionPerformed

    private void jCheckBox_madreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_madreActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jCheckBox_madreActionPerformed

    private void jCheckBox_apoderadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_apoderadoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jCheckBox_apoderadoActionPerformed

    private void jCheckBox_madreStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox_madreStateChanged
        // TODO add your handling code here:
    if(jCheckBox_madre.isSelected()==true){
        jTabbedPane_info_Madre.setEnabled(true);
        jTabbedPane_info_Madre.setVisible(true);
        jRadioButton_madre.setVisible(true);
        System.out.println("selecionado");
    }else{
        jTabbedPane_info_Madre.setEnabled(false);
        jTabbedPane_info_Madre.setVisible(false);
        jRadioButton_madre.setVisible(false);
        System.out.println("no selecionado");
    }
    
    }//GEN-LAST:event_jCheckBox_madreStateChanged

    private void jCheckBox_apoderadoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox_apoderadoStateChanged
        // TODO add your handling code here:
   if(jCheckBox_apoderado.isSelected()==true){
        jTabbedPane_infoApoderado.setEnabled(true);
        jTabbedPane_infoApoderado.setVisible(true);
        jRadioButton_apoderado.setVisible(true);
    }else{
        jTabbedPane_infoApoderado.setEnabled(false);
        jTabbedPane_infoApoderado.setVisible(false);
        jRadioButton_apoderado.setVisible(false);
        
    }
    }//GEN-LAST:event_jCheckBox_apoderadoStateChanged

    private void boton_InsertarFotolEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_InsertarFotolEstudianteActionPerformed
        // Recuperamos y mostramos la imagen selecionada en la pc
        FileNameExtensionFilter filtro=new FileNameExtensionFilter("Formatos de Archivo JPEG(*.JPG;*.JPEG)","jpg","jpeg");                         
        JFileChooser archivo= new JFileChooser();
        archivo.addChoosableFileFilter(filtro);
        archivo.setDialogTitle("Abrir Archivo");
        File ruta=new File ("Escritorio");
        archivo.setCurrentDirectory(ruta);
        int ventana=archivo.showOpenDialog(null);
        if(ventana==JFileChooser.APPROVE_OPTION)
        {
        File file=archivo.getSelectedFile();
        txt_rutaFoto.setText(String.valueOf(file));
        ImageIcon imagenPerfilEst= new ImageIcon(String.valueOf(file));// crear objeto imagen
        Icon icono_fondo= new ImageIcon(imagenPerfilEst.getImage().getScaledInstance(label_FotoEstudiante.getWidth(),
        label_FotoEstudiante.getHeight(),Image.SCALE_DEFAULT ));// ajustar la imagen a las dimensiones del jlabel_fondo
        label_FotoEstudiante.setIcon(icono_fondo);// insertar la imagenFondo
        this.repaint();//confirmar que la imagen se vea
        }
        
     // Guardamos la imagen en la base de datos
  
        
        
    }//GEN-LAST:event_boton_InsertarFotolEstudianteActionPerformed

    private void txt_observacionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_observacionesKeyReleased
        // TODO add your handling code here:
        String texto=txt_observaciones.getText().trim();
        int Cantidad=texto.length();
        labelComentarioCaracter.setText("* maximo 200/"+Integer.toString(Cantidad));
        
    }//GEN-LAST:event_txt_observacionesKeyReleased

    private void txt_dniEstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dniEstudianteKeyTyped
       // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(txt_dniEstudiante.getText().length()>=8){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }

    }//GEN-LAST:event_txt_dniEstudianteKeyTyped

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
            java.util.logging.Logger.getLogger(NewEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoRadioBoton;
    private javax.swing.JButton botonRegistrarEstudiante;
    private javax.swing.JButton boton_BuscraApoderado;
    private javax.swing.JButton boton_BuscraMadre;
    private javax.swing.JButton boton_BuscraPadre;
    private javax.swing.JButton boton_InsertarFotolEstudiante;
    private javax.swing.JButton boton_editarApoderado;
    private javax.swing.JButton boton_editarMadre;
    private javax.swing.JButton boton_editarPadre;
    private javax.swing.JComboBox<String> cmb_genero;
    private javax.swing.JCheckBox jCheckBox_apoderado;
    private javax.swing.JCheckBox jCheckBox_madre;
    private javax.swing.JCheckBox jCheckBox_padre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_infoApoderado2;
    private javax.swing.JPanel jPanel_infoMadre4;
    private javax.swing.JPanel jPanel_infoPadre3;
    private javax.swing.JRadioButton jRadioButton_apoderado;
    private javax.swing.JRadioButton jRadioButton_madre;
    private javax.swing.JRadioButton jRadioButton_padre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane_panell;
    private javax.swing.JTabbedPane jTabbedPane_infoApoderado;
    private javax.swing.JTabbedPane jTabbedPane_infoPadre;
    private javax.swing.JTabbedPane jTabbedPane_info_Madre;
    private javax.swing.JLabel labelComentarioCaracter;
    private javax.swing.JLabel labelFechaREGISTROApoderado2;
    private javax.swing.JLabel labelFechaREGISTROMADRE4;
    private javax.swing.JLabel labelFechaREGISTROPADRE3;
    private javax.swing.JLabel label_FotoEstudiante;
    private javax.swing.JLabel label_fecha;
    private javax.swing.JPanel panelInfoEstudiante;
    private javax.swing.JTextField txt_DniMadre4;
    private javax.swing.JTextField txt_Parentesto;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_apellidosMadre4;
    private javax.swing.JTextField txt_apellidos_Apoderado2;
    private javax.swing.JTextField txt_apellidos_padre3;
    private javax.swing.JTextField txt_correoApoderado2;
    private javax.swing.JTextField txt_correoMADRE4;
    private javax.swing.JTextField txt_correoPADRE3;
    private javax.swing.JTextField txt_direccionApoderado2;
    private javax.swing.JTextField txt_direccionMADRE4;
    private javax.swing.JTextField txt_direccionPADRE3;
    private javax.swing.JTextField txt_dniApoderado2;
    private javax.swing.JTextField txt_dniEstudiante;
    private javax.swing.JTextField txt_dniPadre3;
    private javax.swing.JTextField txt_domicilio;
    private javax.swing.JTextField txt_estadoMADRE4;
    private javax.swing.JTextField txt_estadoPADRE3;
    private com.toedter.calendar.JDateChooser txt_fechaNacimiento;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_nombreApoderado2;
    private javax.swing.JTextField txt_nombreMadre4;
    private javax.swing.JTextField txt_nombrePadre3;
    private javax.swing.JTextArea txt_observaciones;
    private javax.swing.JTextArea txt_observacionesApoderado2;
    private javax.swing.JTextArea txt_observacionesMADRE4;
    private javax.swing.JTextArea txt_observacionesPADRE3;
    private javax.swing.JTextField txt_rutaFoto;
    private javax.swing.JTextField txt_telefonoApoderado2;
    private javax.swing.JTextField txt_telefonoMADRE4;
    private javax.swing.JTextField txt_telefonoPADRE3;
    // End of variables declaration//GEN-END:variables

// limiar campos 
    public void LimpiarCampos()
    {
    NewEstudiante refrescar= new NewEstudiante();
    this.dispose();
    refrescar.setVisible(true);
    }
    
 //para editar padre desde la ventana de new estudiante
    public void EditarDatosPadre(String dniEditar){
        editarPadreNewEstudiante=dniEditar;
        EditarInfoPadres_NewEstudiante editarMensajero=new EditarInfoPadres_NewEstudiante();
        editarMensajero.setVisible(true);
    }
    
}
