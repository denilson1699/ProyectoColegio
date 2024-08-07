
package Ventanas;

import Clases.CeldasTablaDatos;
import Clases.CeldasTablaResultados;
import Clases.ColorCeldaResultado;
import Clases.Conexion;
import Clases.GestionEncabezadoTabla;
import static Ventanas.ListaDocentes.FechaActual;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.scripts.JO;

//===>importamos libreria para el autompletable
import com.mxrck.autocompleter.TextAutoCompleter;

public class VentanaPrincipal_Matriculas extends javax.swing.JFrame {
    DefaultTableModel model_HistorialGrados= new DefaultTableModel();
    String dniRepresentante; 
    int pase=0;
//===> varible para el aucompletado
    private TextAutoCompleter ac;
    
    public VentanaPrincipal_Matriculas() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        panelMenuBuscar.setVisible(false);
        Panel_InformacionBuscar.setVisible(false);
 
//==>Declaramos la viable del autocompletar
        ac=new TextAutoCompleter(txt_dniTutor);
        
        try {
            Connection cc= Conexion.Conectar();
            PreparedStatement p=cc.prepareStatement("select Dni_doc from tabla_docentes");
            ResultSet rr=p.executeQuery();
            while(rr.next())
            {
                ac.addItem(rr.getString("Dni_doc"));
            }
             cc.close();
        } catch (Exception e) { System.err.println("erro al rellenar info para el autompletaado de dni docentes");}
        
          // recupera la fecha actual
    Calendar calendario = Calendar.getInstance();      
     FechaActual = Integer.toString(calendario.get(Calendar.DATE)) + "/"
                + Integer.toString(calendario.get(Calendar.MONTH) + 1) + "/"
                + Integer.toString(calendario.get(Calendar.YEAR));
     labelFechaLogin.setText(FechaActual);
     
       Hilo_hora horaAutomatica = new Hilo_hora();
       horaAutomatica.start();
        
       
        label_nombreLogin.setText(Login.Nombre);
        label_apellidoLogin.setText(Login.apellidos);
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Popup_Menu = new javax.swing.JPopupMenu();
        popud_infromacion = new javax.swing.JMenuItem();
        popud_editar = new javax.swing.JMenuItem();
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
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        Panel_InformacionBuscar = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txt_dniEstudiante = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_nombre1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_apellidos1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_domicilio = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_observacionesGrado = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        label_FotoEstudiante = new javax.swing.JLabel();
        txt_fechaNacimeinto = new javax.swing.JTextField();
        boton_RepresentateApoderado = new javax.swing.JButton();
        jScrollPane_HistoralGrado = new javax.swing.JScrollPane();
        Tabla_HistoralGrado = new javax.swing.JTable();
        botonRegistrarMatricula = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_observaciones2 = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_estado = new javax.swing.JTextField();
        Boton_BuscarTutor = new javax.swing.JButton();
        labelNombreTutor = new javax.swing.JLabel();
        labelApellidoTutor = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txt_dniTutor = new javax.swing.JTextField();
        cmb_Nivel = new javax.swing.JComboBox<>();
        cmb_grado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelMenuBuscar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Boton_Buscador = new javax.swing.JButton();
        txtDniBuscador = new javax.swing.JTextField();
        labelMensaje = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        MenuRegistrar_Docente = new javax.swing.JMenuItem();
        MenuRegistrar_PadreApoderado = new javax.swing.JMenuItem();
        MenuRegistrar_Estudiante = new javax.swing.JMenuItem();

        popud_infromacion.setText("Información");
        Popup_Menu.add(popud_infromacion);

        popud_editar.setText("Editar");
        Popup_Menu.add(popud_editar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setIconImage(getIconImage());
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
        jLabel2.setComponentPopupMenu(Popup_Menu);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Matrículas I.E");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_apellidoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(label_nombreLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFechaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_horaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(label_nombreLogin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_apellidoLogin)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(labelFechaLogin, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(label_horaLogin))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel7)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jInternalFrame1.setVisible(true);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Doc identidad:");

        txt_dniEstudiante.setEditable(false);
        txt_dniEstudiante.setBackground(new java.awt.Color(255, 255, 204));
        txt_dniEstudiante.setBorder(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Nombre:");

        txt_nombre1.setEditable(false);
        txt_nombre1.setBackground(new java.awt.Color(255, 255, 204));
        txt_nombre1.setBorder(null);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Apellidos:");

        txt_apellidos1.setEditable(false);
        txt_apellidos1.setBackground(new java.awt.Color(255, 255, 204));
        txt_apellidos1.setBorder(null);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Domicilio:");

        txt_domicilio.setEditable(false);
        txt_domicilio.setBackground(new java.awt.Color(255, 255, 204));
        txt_domicilio.setBorder(null);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Fecha Nacimiento:");

        txt_observacionesGrado.setColumns(20);
        txt_observacionesGrado.setRows(5);
        txt_observacionesGrado.setText("ninguna");
        jScrollPane3.setViewportView(txt_observacionesGrado);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Observaciones");

        label_FotoEstudiante.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_FotoEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconUser.png"))); // NOI18N
        label_FotoEstudiante.setToolTipText("");
        label_FotoEstudiante.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.MatteBorder(null)));
        label_FotoEstudiante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_FotoEstudiante.setVerifyInputWhenFocusTarget(false);
        label_FotoEstudiante.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        txt_fechaNacimeinto.setEditable(false);
        txt_fechaNacimeinto.setBackground(new java.awt.Color(255, 255, 204));
        txt_fechaNacimeinto.setBorder(null);

        boton_RepresentateApoderado.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        boton_RepresentateApoderado.setForeground(new java.awt.Color(255, 0, 51));
        boton_RepresentateApoderado.setText(" Contactar");
        boton_RepresentateApoderado.setBorder(null);
        boton_RepresentateApoderado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_RepresentateApoderadoActionPerformed(evt);
            }
        });

        Tabla_HistoralGrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI ", "Nombre", "Apellidos", "Estado", "Fecha Registro", "Nivel", "Grado", "Observación"
            }
        ));
        jScrollPane_HistoralGrado.setViewportView(Tabla_HistoralGrado);

        botonRegistrarMatricula.setText("Registrar Matrícula");
        botonRegistrarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarMatriculaActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Grado:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Nivel:");

        txt_observaciones2.setEditable(false);
        txt_observaciones2.setColumns(20);
        txt_observaciones2.setRows(5);
        txt_observaciones2.setBorder(null);
        jScrollPane4.setViewportView(txt_observaciones2);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("Observaciones");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("*Maximo 200 caracteres");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Tutor (dni):");

        txt_estado.setText("En curso");

        Boton_BuscarTutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        Boton_BuscarTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_BuscarTutorActionPerformed(evt);
            }
        });

        labelNombreTutor.setForeground(new java.awt.Color(0, 102, 102));

        labelApellidoTutor.setForeground(new java.awt.Color(0, 102, 102));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("Estado:");

        txt_dniTutor.setBackground(new java.awt.Color(255, 204, 204));
        txt_dniTutor.setToolTipText("");
        txt_dniTutor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        cmb_Nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Inicial", "Primaria", "Secundaria" }));
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

        cmb_grado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        jLabel4.setText("Nombre:");

        jLabel5.setText("Apellidos");

        javax.swing.GroupLayout Panel_InformacionBuscarLayout = new javax.swing.GroupLayout(Panel_InformacionBuscar);
        Panel_InformacionBuscar.setLayout(Panel_InformacionBuscarLayout);
        Panel_InformacionBuscarLayout.setHorizontalGroup(
            Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                        .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                                .addComponent(boton_RepresentateApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel23))
                        .addGap(239, 239, 239))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_InformacionBuscarLayout.createSequentialGroup()
                        .addComponent(jScrollPane_HistoralGrado)
                        .addGap(57, 57, 57))
                    .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                        .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmb_Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmb_grado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                        .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(10, 10, 10)
                                .addComponent(txt_dniEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(10, 10, 10)
                                .addComponent(txt_domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_apellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(txt_fechaNacimeinto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(label_FotoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                        .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_dniTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Boton_BuscarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel4))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNombreTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelApellidoTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonRegistrarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
        );
        Panel_InformacionBuscarLayout.setVerticalGroup(
            Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_InformacionBuscarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_apellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(jLabel14))
                    .addComponent(txt_dniEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel12)))
                .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                                .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel16))
                                    .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_InformacionBuscarLayout.createSequentialGroup()
                                            .addComponent(jLabel18)
                                            .addGap(3, 3, 3))
                                        .addComponent(txt_fechaNacimeinto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel23)
                                .addGap(16, 16, 16)
                                .addComponent(boton_RepresentateApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(label_FotoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 113, Short.MAX_VALUE))))
                    .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane_HistoralGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                        .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                                .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_InformacionBuscarLayout.createSequentialGroup()
                        .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)))
                .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                        .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNombreTutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelApellidoTutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Boton_BuscarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_dniTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(botonRegistrarMatricula)))
                .addGap(14, 14, 14))
        );

        jScrollPane1.setViewportView(Panel_InformacionBuscar);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Dni:");

        Boton_Buscador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        Boton_Buscador.setText("Buscar");
        Boton_Buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_BuscadorActionPerformed(evt);
            }
        });

        txtDniBuscador.setBackground(new java.awt.Color(255, 255, 204));
        txtDniBuscador.setForeground(new java.awt.Color(153, 0, 0));
        txtDniBuscador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDniBuscador.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        labelMensaje.setForeground(new java.awt.Color(255, 0, 0));
        labelMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelMenuBuscarLayout = new javax.swing.GroupLayout(panelMenuBuscar);
        panelMenuBuscar.setLayout(panelMenuBuscarLayout);
        panelMenuBuscarLayout.setHorizontalGroup(
            panelMenuBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuBuscarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelMenuBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuBuscarLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMenuBuscarLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDniBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Boton_Buscador)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelMenuBuscarLayout.setVerticalGroup(
            panelMenuBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDniBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_Buscador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jMenu2.setText("Buscar");
        jMenu2.setToolTipText("Actualizar Información");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu2);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estudiantes.png"))); // NOI18N
        jMenu1.setText("Registar Matrícula");
        jMenu1.setToolTipText("Buscar Infromación");
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
        jMenuBar2.add(jMenu1);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        jMenu6.setText("Registrar ...");
        jMenu6.setToolTipText("Realizar un nuevo Registro");

        MenuRegistrar_Docente.setText("Docente");
        MenuRegistrar_Docente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRegistrar_DocenteActionPerformed(evt);
            }
        });
        jMenu6.add(MenuRegistrar_Docente);

        MenuRegistrar_PadreApoderado.setText("Padre/Apoderado");
        MenuRegistrar_PadreApoderado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRegistrar_PadreApoderadoActionPerformed(evt);
            }
        });
        jMenu6.add(MenuRegistrar_PadreApoderado);

        MenuRegistrar_Estudiante.setText("Estudiante");
        MenuRegistrar_Estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRegistrar_EstudianteActionPerformed(evt);
            }
        });
        jMenu6.add(MenuRegistrar_Estudiante);

        jMenuBar2.add(jMenu6);

        jInternalFrame1.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(panelMenuBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(panelMenuBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jDesktopPane2.setLayer(jInternalFrame1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
     pase=1;

    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
        Listado_de_Aplicaciones mensajero= new Listado_de_Aplicaciones();
        mensajero.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        BuscardorMensajero mensajero= new BuscardorMensajero();
        mensajero.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2MouseClicked

    private void MenuRegistrar_PadreApoderadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRegistrar_PadreApoderadoActionPerformed
        // TODO add your handling code here:
        NewPadre mensajero= new NewPadre();
        mensajero.setVisible(true);
    }//GEN-LAST:event_MenuRegistrar_PadreApoderadoActionPerformed

    private void MenuRegistrar_EstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRegistrar_EstudianteActionPerformed
        // TODO add your handling code here:
        NewEstudiante mensajero= new NewEstudiante();
        mensajero.setVisible(true);
    }//GEN-LAST:event_MenuRegistrar_EstudianteActionPerformed

    private void MenuRegistrar_DocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRegistrar_DocenteActionPerformed
        // TODO add your handling code here:
        NewDocente mensajero= new NewDocente();
        mensajero.setVisible(true);
    }//GEN-LAST:event_MenuRegistrar_DocenteActionPerformed

    private void Boton_BuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_BuscadorActionPerformed
        // TODO add your handling code here:
        String dniestudiatebuscar=txtDniBuscador.getText().trim();
        if(dniestudiatebuscar.equals(""))
        {
            labelMensaje.setText("Ingrese dni del Estudiante");
            txtDniBuscador.requestFocus();
        }
        else
        {
            try {
                BuscardorinfoEstudiante(dniestudiatebuscar);
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal_Matriculas.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
    }//GEN-LAST:event_Boton_BuscadorActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        panelMenuBuscar.setVisible(true);
        txtDniBuscador.requestFocus();
        Panel_InformacionBuscar.setVisible(false);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void botonRegistrarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarMatriculaActionPerformed
        // TODO add your handling code here:
        String Dni_est ,Nombre_est,Apellidos_est,Estado,FechaRegistro,Observaciones,Dni_tutor,nombre_tutor,Apellido_tutor, Grado;
        int contador=0;
        Dni_est=txt_dniEstudiante.getText().trim();
        Nombre_est=txt_nombre1.getText().trim();
        Apellidos_est=txt_apellidos1.getText().trim();
        Estado=txt_estado.getText().trim();
        FechaRegistro=labelFechaLogin.getText().trim();
        Observaciones=txt_observacionesGrado.getText().trim();
        Dni_tutor=txt_dniTutor.getText().trim();
        nombre_tutor=labelNombreTutor.getText().trim();
        Apellido_tutor=labelApellidoTutor.getText().trim();
        
        Grado=cmb_grado.getSelectedItem().toString();
        
        if(Dni_est.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar el DNI del Estudiante");
            txt_dniEstudiante.requestFocus();
            txt_dniEstudiante.setBackground(new Color(250,150,150));
            contador++;
        }
        if(Nombre_est.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar Nombre del Estudiante");
            txt_nombre1.requestFocus();
            txt_nombre1.setBackground(new Color(250,150,150));
            contador++;
        }
        if(Apellidos_est.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar Apellidos del Estudiante ");
            txt_apellidos1.requestFocus();
            txt_apellidos1.setBackground(new Color(250,150,150));
            contador++;
        }
        if(Dni_tutor.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta ingresar Dni del Tutor ");
            txt_dniTutor.requestFocus();
            txt_dniTutor.setBackground(new Color(250,150,150));
            contador++;
        }
        if(nombre_tutor.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar Nombre del tutor ");
            labelNombreTutor.requestFocus();
            labelNombreTutor.setBackground(new Color(250,150,150));
            contador++;
        }
          if(Apellido_tutor.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar Apellidos del turo ");
            labelApellidoTutor.requestFocus();
            labelApellidoTutor.setBackground(new Color(250,150,150));
            contador++;
        }   
        if(Estado.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta Ingresar el estado del Registro");
            txt_estado.requestFocus();
            txt_estado.setBackground(new Color(250,150,150));
            contador++;
        } 
              
        if(cmb_Nivel.getSelectedItem().equals("Seleccionar"))
        {
            JOptionPane.showMessageDialog(null, "Falta Selecionar Nivel");
            contador++;
        }
        if(cmb_grado.getSelectedItem().equals("Seleccionar"))
        {
            JOptionPane.showMessageDialog(null, "Falta Selecionar Grado");
            contador++;
        }
        
      if(contador==0)
      {
         int mensaje=JOptionPane.showConfirmDialog(null,"Guardar Registro",null,JOptionPane.YES_NO_OPTION);
         if(mensaje==JOptionPane.YES_OPTION)
         {
         switch(cmb_grado.getSelectedItem().toString())
         {
            case "4 años":
                try {
                    Connection cn=Conexion.Conectar();
                    PreparedStatement pst=cn.prepareStatement("insert into tabla_4años_inicial values (?,?,?,?,?,?,?,?,?,?) ");
                    pst.setInt(1,0);
                    pst.setString(2,Dni_est);
                    pst.setString(3,Nombre_est);
                    pst.setString(4,Apellidos_est);
                    pst.setString(5,Estado);
                    pst.setString(6,FechaRegistro);
                    pst.setString(7,Observaciones);
                    pst.setString(8,Dni_tutor);
                    pst.setString(9,nombre_tutor);
                    pst.setString(10,Apellido_tutor);
                    pst.executeUpdate();
                    cn.close();
                    int mensaje2=JOptionPane.showConfirmDialog(null,"Registro exitoso continuar [S/N]:",null,JOptionPane.YES_NO_OPTION);
                    if(mensaje==JOptionPane.YES_OPTION)
                   { LimpiarCampos(); }
                    
                } catch (Exception e) {JOptionPane.showMessageDialog(null, "Error al registar matrícula 4 Años Inicial",null,JOptionPane.WARNING_MESSAGE);
                                        System.err.println("error reistro matrícula 4 años inicial");}
                 break;
            case "5 años":
                try {
                    Connection cn=Conexion.Conectar();
                    PreparedStatement pst=cn.prepareStatement("insert into tabla_5años_inicial values (?,?,?,?,?,?,?,?,?,?) ");
                    pst.setInt(1,0);
                    pst.setString(2,Dni_est);
                    pst.setString(3,Nombre_est);
                    pst.setString(4,Apellidos_est);
                    pst.setString(5,Estado);
                    pst.setString(6,FechaRegistro);
                    pst.setString(7,Observaciones);
                    pst.setString(8,Dni_tutor);
                    pst.setString(9,nombre_tutor);
                    pst.setString(10,Apellido_tutor);
                    pst.executeUpdate();
                    cn.close();
                    int mensaje2=JOptionPane.showConfirmDialog(null,"Registro exitoso continuar [S/N]:",null,JOptionPane.YES_NO_OPTION);
                    if(mensaje==JOptionPane.YES_OPTION)
                   { LimpiarCampos(); }
                    
                } catch (Exception e) {JOptionPane.showMessageDialog(null, "Error al registar matrícula 5 Años Inicial",null,JOptionPane.WARNING_MESSAGE);
                                        System.err.println("error registro matrícula 5 años inicial");}
                 break;
                
            case "1er Primaria":
                try {
                    Connection cn=Conexion.Conectar();
                    PreparedStatement pst=cn.prepareStatement("insert into tabla_primero_primaria values (?,?,?,?,?,?,?,?,?,?) ");
                    pst.setInt(1,0);
                    pst.setString(2,Dni_est);
                    pst.setString(3,Nombre_est);
                    pst.setString(4,Apellidos_est);
                    pst.setString(5,Estado);
                    pst.setString(6,FechaRegistro);
                    pst.setString(7,Observaciones);
                    pst.setString(8,Dni_tutor);
                    pst.setString(9,nombre_tutor);
                    pst.setString(10,Apellido_tutor);
                    pst.executeUpdate();
                    cn.close();
                    int mensaje2=JOptionPane.showConfirmDialog(null,"Registro exitoso continuar [S/N]:",null,JOptionPane.YES_NO_OPTION);
                    if(mensaje==JOptionPane.YES_OPTION)
                   { LimpiarCampos(); }
                    
                } catch (Exception e) {JOptionPane.showMessageDialog(null, "Error al registar matrícula 1er Primaria",null,JOptionPane.WARNING_MESSAGE);
                                        System.err.println("error reistro matrícula 1er primaria");}
                 break;
            case "2do Primaria":
                try {
                    Connection cn=Conexion.Conectar();
                    PreparedStatement pst=cn.prepareStatement("insert into tabla_segundo_primaria values (?,?,?,?,?,?,?,?,?,?) ");
                    pst.setInt(1,0);
                    pst.setString(2,Dni_est);
                    pst.setString(3,Nombre_est);
                    pst.setString(4,Apellidos_est);
                    pst.setString(5,Estado);
                    pst.setString(6,FechaRegistro);
                    pst.setString(7,Observaciones);
                    pst.setString(8,Dni_tutor);
                    pst.setString(9,nombre_tutor);
                    pst.setString(10,Apellido_tutor);
                    pst.executeUpdate();
                    cn.close();
                    int mensaje2=JOptionPane.showConfirmDialog(null,"Registro exitoso continuar [S/N]:",null,JOptionPane.YES_NO_OPTION);
                    if(mensaje==JOptionPane.YES_OPTION)
                   { LimpiarCampos(); }
                    
                } catch (Exception e) {JOptionPane.showMessageDialog(null, "Error al registar matrícula 2do Primaria",null,JOptionPane.WARNING_MESSAGE);
                                        System.err.println("error reistro matrícula 2do primaria");}
                 break;

            case "3er Primaria":
                try {
                    Connection cn=Conexion.Conectar();
                    PreparedStatement pst=cn.prepareStatement("insert into tabla_tercero_primaria values (?,?,?,?,?,?,?,?,?,?) ");
                    pst.setInt(1,0);
                    pst.setString(2,Dni_est);
                    pst.setString(3,Nombre_est);
                    pst.setString(4,Apellidos_est);
                    pst.setString(5,Estado);
                    pst.setString(6,FechaRegistro);
                    pst.setString(7,Observaciones);
                    pst.setString(8,Dni_tutor);
                    pst.setString(9,nombre_tutor);
                    pst.setString(10,Apellido_tutor);
                    pst.executeUpdate();
                    cn.close();
                    int mensaje2=JOptionPane.showConfirmDialog(null,"Registro exitoso continuar [S/N]:",null,JOptionPane.YES_NO_OPTION);
                    if(mensaje==JOptionPane.YES_OPTION)
                   { LimpiarCampos(); }
                    
                } catch (Exception e) {JOptionPane.showMessageDialog(null, "Error al registar matrícula 3ero Primaria",null,JOptionPane.WARNING_MESSAGE);
                                        System.err.println("error reistro matrícula 3ro primaria");}
                 break;
            case "4to Primaria":
               try {
                    Connection cn=Conexion.Conectar();
                    PreparedStatement pst=cn.prepareStatement("insert into tabla_cuarto_primaria values (?,?,?,?,?,?,?,?,?,?) ");
                    pst.setInt(1,0);
                    pst.setString(2,Dni_est);
                    pst.setString(3,Nombre_est);
                    pst.setString(4,Apellidos_est);
                    pst.setString(5,Estado);
                    pst.setString(6,FechaRegistro);
                    pst.setString(7,Observaciones);
                    pst.setString(8,Dni_tutor);
                    pst.setString(9,nombre_tutor);
                    pst.setString(10,Apellido_tutor);
                    pst.executeUpdate();
                    cn.close();
                    int mensaje2=JOptionPane.showConfirmDialog(null,"Registro exitoso continuar [S/N]:",null,JOptionPane.YES_NO_OPTION);
                    if(mensaje==JOptionPane.YES_OPTION)
                   { LimpiarCampos(); }
                    
                } catch (Exception e) {JOptionPane.showMessageDialog(null, "Error al registar matrícula 4to Primaria",null,JOptionPane.WARNING_MESSAGE);
                                        System.err.println("error reistro matrícula 4to primaria");}
                 break;
            case "5to Primaria":
                  try {
                    Connection cn=Conexion.Conectar();
                    PreparedStatement pst=cn.prepareStatement("insert into tabla_quinto_primaria values (?,?,?,?,?,?,?,?,?,?) ");
                    pst.setInt(1,0);
                    pst.setString(2,Dni_est);
                    pst.setString(3,Nombre_est);
                    pst.setString(4,Apellidos_est);
                    pst.setString(5,Estado);
                    pst.setString(6,FechaRegistro);
                    pst.setString(7,Observaciones);
                    pst.setString(8,Dni_tutor);
                    pst.setString(9,nombre_tutor);
                    pst.setString(10,Apellido_tutor);
                    pst.executeUpdate();
                    cn.close();
                    int mensaje2=JOptionPane.showConfirmDialog(null,"Registro exitoso continuar [S/N]:",null,JOptionPane.YES_NO_OPTION);
                    if(mensaje==JOptionPane.YES_OPTION)
                   { LimpiarCampos(); }
                    
                } catch (Exception e) {JOptionPane.showMessageDialog(null, "Error al registar matrícula 5to Primaria",null,JOptionPane.WARNING_MESSAGE);
                                        System.err.println("error reistro matrícula 5to primaria");}
                 break;
            case "6to Primaria":
                try {
                    Connection cn=Conexion.Conectar();
                    PreparedStatement pst=cn.prepareStatement("insert into tabla_sexto_primaria values (?,?,?,?,?,?,?,?,?,?) ");
                    pst.setInt(1,0);
                    pst.setString(2,Dni_est);
                    pst.setString(3,Nombre_est);
                    pst.setString(4,Apellidos_est);
                    pst.setString(5,Estado);
                    pst.setString(6,FechaRegistro);
                    pst.setString(7,Observaciones);
                    pst.setString(8,Dni_tutor);
                    pst.setString(9,nombre_tutor);
                    pst.setString(10,Apellido_tutor);
                    pst.executeUpdate();
                    cn.close();
                    int mensaje2=JOptionPane.showConfirmDialog(null,"Registro exitoso continuar [S/N]:",null,JOptionPane.YES_NO_OPTION);
                    if(mensaje==JOptionPane.YES_OPTION)
                   { LimpiarCampos(); }
                    
                } catch (Exception e) {JOptionPane.showMessageDialog(null, "Error al registar matrícula 6to Primaria",null,JOptionPane.WARNING_MESSAGE);
                                        System.err.println("error reistro matrícula 6to primaria");}
                 break;
                
            case "1er Secundaria":
                try {
                    Connection cn=Conexion.Conectar();
                    PreparedStatement pst=cn.prepareStatement("insert into tabla_primero_secundaria values (?,?,?,?,?,?,?,?,?,?) ");
                    pst.setInt(1,0);
                    pst.setString(2,Dni_est);
                    pst.setString(3,Nombre_est);
                    pst.setString(4,Apellidos_est);
                    pst.setString(5,Estado);
                    pst.setString(6,FechaRegistro);
                    pst.setString(7,Observaciones);
                    pst.setString(8,Dni_tutor);
                    pst.setString(9,nombre_tutor);
                    pst.setString(10,Apellido_tutor);
                    pst.executeUpdate();
                    cn.close();
                    int mensaje2=JOptionPane.showConfirmDialog(null,"Registro exitoso continuar [S/N]:",null,JOptionPane.YES_NO_OPTION);
                    if(mensaje==JOptionPane.YES_OPTION)
                   { LimpiarCampos(); }
                    
                } catch (Exception e) {JOptionPane.showMessageDialog(null, "Error al registar matrícula 1er secundari",null,JOptionPane.WARNING_MESSAGE);
                                        System.err.println("error reistro matrícula 1er secundaria");}
                 break;
            case "2do Secundaria":
                try {
                    Connection cn=Conexion.Conectar();
                    PreparedStatement pst=cn.prepareStatement("insert into tabla_segundo_secundaria values (?,?,?,?,?,?,?,?,?,?) ");
                    pst.setInt(1,0);
                    pst.setString(2,Dni_est);
                    pst.setString(3,Nombre_est);
                    pst.setString(4,Apellidos_est);
                    pst.setString(5,Estado);
                    pst.setString(6,FechaRegistro);
                    pst.setString(7,Observaciones);
                    pst.setString(8,Dni_tutor);
                    pst.setString(9,nombre_tutor);
                    pst.setString(10,Apellido_tutor);
                    pst.executeUpdate();
                    cn.close();
                    int mensaje2=JOptionPane.showConfirmDialog(null,"Registro exitoso continuar [S/N]:",null,JOptionPane.YES_NO_OPTION);
                    if(mensaje==JOptionPane.YES_OPTION)
                   { LimpiarCampos(); }
                    
                } catch (Exception e) {JOptionPane.showMessageDialog(null, "Error al registar matrícula 2do secundari",null,JOptionPane.WARNING_MESSAGE);
                                        System.err.println("error reistro matrícula 2do secundaria");}
                 break;
            case "3er Secundaria":
                 try {
                    Connection cn=Conexion.Conectar();
                    PreparedStatement pst=cn.prepareStatement("insert into tabla_tercero_secundaria values (?,?,?,?,?,?,?,?,?,?) ");
                    pst.setInt(1,0);
                    pst.setString(2,Dni_est);
                    pst.setString(3,Nombre_est);
                    pst.setString(4,Apellidos_est);
                    pst.setString(5,Estado);
                    pst.setString(6,FechaRegistro);
                    pst.setString(7,Observaciones);
                    pst.setString(8,Dni_tutor);
                    pst.setString(9,nombre_tutor);
                    pst.setString(10,Apellido_tutor);
                    pst.executeUpdate();
                    cn.close();
                    int mensaje2=JOptionPane.showConfirmDialog(null,"Registro exitoso continuar [S/N]:",null,JOptionPane.YES_NO_OPTION);
                    if(mensaje==JOptionPane.YES_OPTION)
                   { LimpiarCampos(); }
                    
                } catch (Exception e) {JOptionPane.showMessageDialog(null, "Error al registar matrícula 3ero secundari",null,JOptionPane.WARNING_MESSAGE);
                                        System.err.println("error reistro matrícula 3ero secundaria");}
                 break;
            case "4to Secundaria":
                try {
                    Connection cn=Conexion.Conectar();
                    PreparedStatement pst=cn.prepareStatement("insert into tabla_cuarto_secundaria values (?,?,?,?,?,?,?,?,?,?) ");
                    pst.setInt(1,0);
                    pst.setString(2,Dni_est);
                    pst.setString(3,Nombre_est);
                    pst.setString(4,Apellidos_est);
                    pst.setString(5,Estado);
                    pst.setString(6,FechaRegistro);
                    pst.setString(7,Observaciones);
                    pst.setString(8,Dni_tutor);
                    pst.setString(9,nombre_tutor);
                    pst.setString(10,Apellido_tutor);
                    pst.executeUpdate();
                    cn.close();
                    int mensaje2=JOptionPane.showConfirmDialog(null,"Registro exitoso continuar [S/N]:",null,JOptionPane.YES_NO_OPTION);
                    if(mensaje==JOptionPane.YES_OPTION)
                   { LimpiarCampos(); }
                    
                } catch (Exception e) {JOptionPane.showMessageDialog(null, "Error al registar matrícula 4to secundari",null,JOptionPane.WARNING_MESSAGE);
                                        System.err.println("error reistro matrícula 4to secundaria");}
                 break;
            case "5to Secundaria":
                try {
                    Connection cn=Conexion.Conectar();
                    PreparedStatement pst=cn.prepareStatement("insert into tabla_quinto_secundaria values (?,?,?,?,?,?,?,?,?,?) ");
                    pst.setInt(1,0);
                    pst.setString(2,Dni_est);
                    pst.setString(3,Nombre_est);
                    pst.setString(4,Apellidos_est);
                    pst.setString(5,Estado);
                    pst.setString(6,FechaRegistro);
                    pst.setString(7,Observaciones);
                    pst.setString(8,Dni_tutor);
                    pst.setString(9,nombre_tutor);
                    pst.setString(10,Apellido_tutor);
                    pst.executeUpdate();
                    cn.close();
                    int mensaje2=JOptionPane.showConfirmDialog(null,"Registro exitoso continuar [S/N]:",null,JOptionPane.YES_NO_OPTION);
                    if(mensaje==JOptionPane.YES_OPTION)
                   { LimpiarCampos(); }
                    
                } catch (Exception e) {JOptionPane.showMessageDialog(null, "Error al registar matrícula 5to secundari",null,JOptionPane.WARNING_MESSAGE);
                                        System.err.println("error reistro matrícula 5to secundaria");}
                 break;
         }
         }
       else
         {JOptionPane.showMessageDialog(null, "REGISTRO CANCELADO"); }
       }
        
      // actualizar el grado actual del estudiante
      try{
              Connection cn2=Conexion.Conectar(); 
               PreparedStatement pst2=cn2.prepareStatement("Update tabla_estudiante set Grado_Actual=? where Dni_est='"+txt_dniEstudiante.getText().trim()+"'");
               pst2.setString(1,cmb_grado.getSelectedItem().toString());
               pst2.executeUpdate();
               cn2.close();
               // preguntar par volver a ingresar datos
               JOptionPane.showMessageDialog(null,"Se Actualizo el Grado Actual del Estudiante ");
               
        }catch(Exception e){JOptionPane.showMessageDialog(null, "Erro al actualizar grado  \n contacte al administrador",null, JOptionPane.WARNING_MESSAGE);
               System.err.println("erro al actualizar grado actual del estudiante:"+e);}
       
      
      
    }//GEN-LAST:event_botonRegistrarMatriculaActionPerformed

 public void LimpiarCampos()
 {
    VentanaPrincipal_Matriculas MENSAJERO=new VentanaPrincipal_Matriculas();
    this.dispose(); MENSAJERO.setVisible(true);
  }

    private void boton_RepresentateApoderadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_RepresentateApoderadoActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn3=Conexion.Conectar();
            PreparedStatement pst3=cn3.prepareStatement("Select * from tabla_padres where Dni_pad ='"+dniRepresentante+"'");
            ResultSet resul3=pst3.executeQuery();
            if(resul3.next())
            {
                String nombre=resul3.getString("Nombre_pad");
                String apellido=resul3.getString("Apellidos_pad");
                String correo=resul3.getString("Correo_pad");
                String telefono=resul3.getString("Telf_pad");
                String dirreccion=resul3.getString("Direccion_pad");

                JOptionPane.showMessageDialog(null,"*** INFORMACIÓN DE Apoderado/Representante ***\n"
                    + "  "+nombre+"\n"
                    + "  "+apellido+"\n"
                    + "  "+correo+"\n"
                    + "  "+telefono+"\n"
                    + "  "+dirreccion+"\n");
            }
            cn3.close();

        } catch (Exception e) {
        }

    }//GEN-LAST:event_boton_RepresentateApoderadoActionPerformed

    private void cmb_NivelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_NivelItemStateChanged
        // TODO add your handling code here:
        if(evt.getSource()==cmb_Nivel){
            String seleccion=cmb_Nivel.getSelectedItem().toString();//recuperar el texto selecionado y converirlo a string
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

    private void Boton_BuscarTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_BuscarTutorActionPerformed
        // TODO add your handling code here:
        String dniTutor=txt_dniTutor.getText().trim();
        if(dniTutor.equals("")){
            JOptionPane.showMessageDialog(null,"Ingrese dni del docente encargado de la tutoria de "+cmb_grado.getSelectedItem().toString());
        }else{
        try {
            Connection cn=Conexion.Conectar();
            PreparedStatement pst=cn.prepareStatement("select *from tabla_docentes where Dni_doc='"+dniTutor+"'");
            ResultSet resul=pst.executeQuery();
            if(resul.next())
            {
                labelNombreTutor.setText(resul.getString("Nombre_doc"));
                labelApellidoTutor.setText(resul.getString("Apellidos_doc"));
            }
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"ERROR AL RECUPERAR DATOS DEL DOCENTE",null,JOptionPane.WARNING_MESSAGE);
                                System.err.println("error al recuperar datos del docente tutor: "+e);}
        }
    }//GEN-LAST:event_Boton_BuscarTutorActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal_Matriculas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Buscador;
    private javax.swing.JButton Boton_BuscarTutor;
    private javax.swing.JMenuItem MenuRegistrar_Docente;
    private javax.swing.JMenuItem MenuRegistrar_Estudiante;
    private javax.swing.JMenuItem MenuRegistrar_PadreApoderado;
    private javax.swing.JPanel Panel_InformacionBuscar;
    private javax.swing.JPopupMenu Popup_Menu;
    private javax.swing.JTable Tabla_HistoralGrado;
    private javax.swing.JButton botonRegistrarMatricula;
    private javax.swing.JButton boton_RepresentateApoderado;
    private javax.swing.JComboBox<String> cmb_Nivel;
    private javax.swing.JComboBox<String> cmb_grado;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane_HistoralGrado;
    private javax.swing.JLabel labelApellidoTutor;
    private javax.swing.JLabel labelFechaLogin;
    private javax.swing.JLabel labelMensaje;
    private javax.swing.JLabel labelNombreTutor;
    private javax.swing.JLabel label_FotoEstudiante;
    private javax.swing.JLabel label_apellidoLogin;
    private javax.swing.JLabel label_horaLogin;
    private javax.swing.JLabel label_nombreLogin;
    private javax.swing.JPanel panelMenuBuscar;
    private javax.swing.JMenuItem popud_editar;
    private javax.swing.JMenuItem popud_infromacion;
    private javax.swing.JTextField txtDniBuscador;
    private javax.swing.JTextField txt_apellidos1;
    private javax.swing.JTextField txt_dniEstudiante;
    private javax.swing.JTextField txt_dniTutor;
    private javax.swing.JTextField txt_domicilio;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_fechaNacimeinto;
    private javax.swing.JTextField txt_nombre1;
    private javax.swing.JTextArea txt_observaciones2;
    private javax.swing.JTextArea txt_observacionesGrado;
    // End of variables declaration//GEN-END:variables


// metodo para recuperad la informacion de estudiante
public void BuscardorinfoEstudiante(String dni) throws IOException
{   
        panelMenuBuscar.setVisible(false);
        Panel_InformacionBuscar.setVisible(true);
        
     int EliminarTodaFila2=Tabla_HistoralGrado.getRowCount();
        for(int i=EliminarTodaFila2-1;i>=0;i--){
            model_HistorialGrados.removeRow(i);
        }
         labelMensaje.setText("");
         txt_dniEstudiante.setText("");
         txt_nombre1.setText("");
         txt_apellidos1.setText("");
         txt_fechaNacimeinto.setText("");
         txt_observacionesGrado.setText("");

    String Contactar;
    

    String[] titulos={"DNI","Nombre","Apellidos","Estado","Fecha Registro","Nivel","Grado","Observación"}; 
     
    try {// buscamos y recuperarmos datos del a tabla 4 años inicial
        Connection cn1=Conexion.Conectar();
        PreparedStatement pst1=cn1.prepareStatement("select *from tabla_4años_inicial where Dni_est='"+dni+"'");
        String[] fila=new String[8];
        ResultSet resul1=pst1.executeQuery();
        model_HistorialGrados=new DefaultTableModel(null,titulos);
        Tabla_HistoralGrado =new JTable(model_HistorialGrados);
        jScrollPane_HistoralGrado.setViewportView(Tabla_HistoralGrado);
        while(resul1.next())
        {
          fila[0]=resul1.getString("Dni_est");
          fila[1]=resul1.getString("Nombre_est");
          fila[2]=resul1.getString("Apellidos_est");
          fila[3]=resul1.getString("Estado");
          fila[4]=resul1.getString("FechaRegistro");
          fila[5]="4 años ";
          fila[6]="Inicial";
          fila[7]=resul1.getString("Observaciones");
          model_HistorialGrados.addRow(fila);
        }
        cn1.close();
    } catch (Exception e) { JOptionPane.showMessageDialog(null,"Error al recuperar información del nivel Inical");
                            System.err.println("error no se recupero informacion de tabla 4 ños inicial:"+e);}

    try {// buscamos y recuperarmos datos del a tabla 5 años inicial
        
        Connection cn2=Conexion.Conectar();
        PreparedStatement pst2=cn2.prepareStatement("select *from tabla_5años_inicial where Dni_est='"+dni+"'");
        String[] fila2=new String[8];
        ResultSet resul2=pst2.executeQuery();
        Tabla_HistoralGrado =new JTable(model_HistorialGrados);
        jScrollPane_HistoralGrado.setViewportView(Tabla_HistoralGrado);
        while(resul2.next())
        {
          fila2[0]=resul2.getString("Dni_est");
          fila2[1]=resul2.getString("Nombre_est");
          fila2[2]=resul2.getString("Apellidos_est");
          fila2[3]=resul2.getString("Estado");
          fila2[4]=resul2.getString("FechaRegistro");
          fila2[5]="5 años ";
          fila2[6]="Inicial";
          fila2[7]=resul2.getString("Observaciones");
          model_HistorialGrados.addRow(fila2);
        }
        cn2.close();
    } catch (Exception e) { JOptionPane.showMessageDialog(null,"Error al recuperar información del nivel Inical");
                            System.err.println("error no se recupero informacion de tabla 5 ños inicial:"+e);}

        
    try {// buscamos y recuperarmos datos del a tabla 2do primaria
        
        Connection cn4=Conexion.Conectar();
        PreparedStatement pst4=cn4.prepareStatement("select *from tabla_primero_primaria where Dni_est='"+dni+"'");
        String[] fila4=new String[8];
        ResultSet resul4=pst4.executeQuery();
        Tabla_HistoralGrado =new JTable(model_HistorialGrados);
        jScrollPane_HistoralGrado.setViewportView(Tabla_HistoralGrado);
        while(resul4.next())
        {
          fila4[0]=resul4.getString("Dni_est");
          fila4[1]=resul4.getString("Nombre_est");
          fila4[2]=resul4.getString("Apellidos_est");
          fila4[3]=resul4.getString("Estado");
          fila4[4]=resul4.getString("FechaRegistro");
          fila4[5]="Primero";
          fila4[6]="Primaria";
          fila4[7]=resul4.getString("Observaciones");
          model_HistorialGrados.addRow(fila4);
        }
        cn4.close();
    } catch (Exception e) { JOptionPane.showMessageDialog(null,"Error al recuperar información del nivel primario");
                            System.err.println("error no se recupero informacion de tabla 2do primaria:"+e);}

        
        
    try {// buscamos y recuperarmos datos del a tabla 3ero primaria
        
        Connection cnx=Conexion.Conectar();
        PreparedStatement pstx=cnx.prepareStatement("select *from tabla_segundo_primaria where Dni_est='"+dni+"'");
        String[] filax=new String[8];
        ResultSet resulx=pstx.executeQuery();
        Tabla_HistoralGrado =new JTable(model_HistorialGrados);
        jScrollPane_HistoralGrado.setViewportView(Tabla_HistoralGrado);
        while(resulx.next())
        {
          filax[0]=resulx.getString("Dni_est");
          filax[1]=resulx.getString("Nombre_est");
          filax[2]=resulx.getString("Apellidos_est");
          filax[3]=resulx.getString("Estado");
          filax[4]=resulx.getString("FechaRegistro");
          filax[5]="Segundo";
          filax[6]="Primaria";
          filax[7]=resulx.getString("Observaciones");
          model_HistorialGrados.addRow(filax);
        }
        cnx.close();
    } catch (Exception e) { JOptionPane.showMessageDialog(null,"Error al recuperar información del nivel primario");
                            System.err.println("error no se recupero informacion de tabla 3ero primaria:"+e);}

    try {// buscamos y recuperarmos datos del a tabla 3ero primaria
        
        Connection cn5=Conexion.Conectar();
        PreparedStatement pst5=cn5.prepareStatement("select *from tabla_tercero_primaria where Dni_est='"+dni+"'");
        String[] fila5=new String[8];
        ResultSet resul5=pst5.executeQuery();
        Tabla_HistoralGrado =new JTable(model_HistorialGrados);
        jScrollPane_HistoralGrado.setViewportView(Tabla_HistoralGrado);
        while(resul5.next())
        {
          fila5[0]=resul5.getString("Dni_est");
          fila5[1]=resul5.getString("Nombre_est");
          fila5[2]=resul5.getString("Apellidos_est");
          fila5[3]=resul5.getString("Estado");
          fila5[4]=resul5.getString("FechaRegistro");
          fila5[5]="tercero";
          fila5[6]="Primaria";
          fila5[7]=resul5.getString("Observaciones");
          model_HistorialGrados.addRow(fila5);
        }
        cn5.close();
    } catch (Exception e) { JOptionPane.showMessageDialog(null,"Error al recuperar información del nivel primario");
                            System.err.println("error no se recupero informacion de tabla 3ero primaria:"+e);}

    try {// buscamos y recuperarmos datos del a tabla 4to primaria
        
        Connection cn6=Conexion.Conectar();
        PreparedStatement pst6=cn6.prepareStatement("select *from tabla_cuarto_primaria where Dni_est='"+dni+"'");
        String[] fila6=new String[8];
        ResultSet resul6=pst6.executeQuery();
        Tabla_HistoralGrado =new JTable(model_HistorialGrados);
        jScrollPane_HistoralGrado.setViewportView(Tabla_HistoralGrado);
        while(resul6.next())
        {
          fila6[0]=resul6.getString("Dni_est");
          fila6[1]=resul6.getString("Nombre_est");
          fila6[2]=resul6.getString("Apellidos_est");
          fila6[3]=resul6.getString("Estado");
          fila6[4]=resul6.getString("FechaRegistro");
          fila6[5]="cuarto";
          fila6[6]="Primaria";
          fila6[7]=resul6.getString("Observaciones");
          model_HistorialGrados.addRow(fila6);
        }
        cn6.close();
    } catch (Exception e) { JOptionPane.showMessageDialog(null,"Error al recuperar información del nivel primario");
                            System.err.println("error no se recupero informacion de tabla 4to primaria:"+e);}

    try {// buscamos y recuperarmos datos del a tabla 5to primaria
        
        Connection cn7=Conexion.Conectar();
        PreparedStatement pst7=cn7.prepareStatement("select *from tabla_quinto_primaria where Dni_est='"+dni+"'");
        String[] fila7=new String[8];
        ResultSet resul7=pst7.executeQuery();
        Tabla_HistoralGrado =new JTable(model_HistorialGrados);
        jScrollPane_HistoralGrado.setViewportView(Tabla_HistoralGrado);
        while(resul7.next())
        {
          fila7[0]=resul7.getString("Dni_est");
          fila7[1]=resul7.getString("Nombre_est");
          fila7[2]=resul7.getString("Apellidos_est");
          fila7[3]=resul7.getString("Estado");
          fila7[4]=resul7.getString("FechaRegistro");
          fila7[5]="Quinto";
          fila7[6]="Primaria";
          fila7[7]=resul7.getString("Observaciones");
          model_HistorialGrados.addRow(fila7);
        }
        cn7.close();
    } catch (Exception e) { JOptionPane.showMessageDialog(null,"Error al recuperar información del nivel primario");
                            System.err.println("error no se recupero informacion de tabla 5to primaria:"+e);}

    try {// buscamos y recuperarmos datos del a tabla 6to primaria
        
        Connection cn8=Conexion.Conectar();
        PreparedStatement pst8=cn8.prepareStatement("select *from tabla_sexto_primaria where Dni_est='"+dni+"'");
        String[] fila8=new String[8];
        ResultSet resul8=pst8.executeQuery();
        Tabla_HistoralGrado =new JTable(model_HistorialGrados);
        jScrollPane_HistoralGrado.setViewportView(Tabla_HistoralGrado);
        while(resul8.next())
        {
          fila8[0]=resul8.getString("Dni_est");
          fila8[1]=resul8.getString("Nombre_est");
          fila8[2]=resul8.getString("Apellidos_est");
          fila8[3]=resul8.getString("Estado");
          fila8[4]=resul8.getString("FechaRegistro");
          fila8[5]="Sexto";
          fila8[6]="Primaria";
          fila8[7]=resul8.getString("Observaciones");
          model_HistorialGrados.addRow(fila8);
        }
        cn8.close();
    } catch (Exception e) { JOptionPane.showMessageDialog(null,"Error al recuperar información del nivel primario");
                            System.err.println("error no se recupero informacion de tabla 6to primaria:"+e);}

    
    
    
    try {// buscamos y recuperarmos datos del a tabla 1er secundaria
        
        Connection cn9=Conexion.Conectar();
        PreparedStatement pst9=cn9.prepareStatement("select *from tabla_primero_secundaria where Dni_est='"+dni+"'");
        String[] fila9=new String[8];
        ResultSet resul9=pst9.executeQuery();
        Tabla_HistoralGrado =new JTable(model_HistorialGrados);
        jScrollPane_HistoralGrado.setViewportView(Tabla_HistoralGrado);
        while(resul9.next())
        {
          fila9[0]=resul9.getString("Dni_est");
          fila9[1]=resul9.getString("Nombre_est");
          fila9[2]=resul9.getString("Apellidos_est");
          fila9[3]=resul9.getString("Estado");
          fila9[4]=resul9.getString("FechaRegistro");
          fila9[5]="Primero";
          fila9[6]="Secundaria";
          fila9[7]=resul9.getString("Observaciones");
          model_HistorialGrados.addRow(fila9);
        }
        cn9.close();
    } catch (Exception e) { JOptionPane.showMessageDialog(null,"Error al recuperar información del nivel secundario");
                            System.err.println("error no se recupero informacion de tabla 1er secundaria:"+e);}


    try {// buscamos y recuperarmos datos del a tabla 2do secundaria
        
        Connection cn10=Conexion.Conectar();
        PreparedStatement pst10=cn10.prepareStatement("select *from tabla_segundo_secundaria where Dni_est='"+dni+"'");
        String[] fila10=new String[8];
        ResultSet resul10=pst10.executeQuery();
        Tabla_HistoralGrado =new JTable(model_HistorialGrados);
        jScrollPane_HistoralGrado.setViewportView(Tabla_HistoralGrado);
        while(resul10.next())
        {
          fila10[0]=resul10.getString("Dni_est");
          fila10[1]=resul10.getString("Nombre_est");
          fila10[2]=resul10.getString("Apellidos_est");
          fila10[3]=resul10.getString("Estado");
          fila10[4]=resul10.getString("FechaRegistro");
          fila10[5]="Segundo";
          fila10[6]="Secundaria";
          fila10[7]=resul10.getString("Observaciones");
          model_HistorialGrados.addRow(fila10);
        }
        cn10.close();
    } catch (Exception e) { JOptionPane.showMessageDialog(null,"Error al recuperar información del nivel secundario");
                            System.err.println("error no se recupero informacion de tabla 2do secundaria:"+e);}

        try {// buscamos y recuperarmos datos del a tabla 3ero secundaria
        
        Connection cn11=Conexion.Conectar();
        PreparedStatement pst11=cn11.prepareStatement("select *from tabla_tercero_secundaria where Dni_est='"+dni+"'");
        String[] fila11=new String[8];
        ResultSet resul11=pst11.executeQuery();
        Tabla_HistoralGrado =new JTable(model_HistorialGrados);
        jScrollPane_HistoralGrado.setViewportView(Tabla_HistoralGrado);
        while(resul11.next())
        {
          fila11[0]=resul11.getString("Dni_est");
          fila11[1]=resul11.getString("Nombre_est");
          fila11[2]=resul11.getString("Apellidos_est");
          fila11[3]=resul11.getString("Estado");
          fila11[4]=resul11.getString("FechaRegistro");
          fila11[5]="Tercero";
          fila11[6]="Secundaria";
          fila11[7]=resul11.getString("Observaciones");
          model_HistorialGrados.addRow(fila11);
        }
        cn11.close();
    } catch (Exception e) { JOptionPane.showMessageDialog(null,"Error al recuperar información del nivel secundario");
                            System.err.println("error no se recupero informacion de tabla 3ro secundaria:"+e);}

    try {// buscamos y recuperarmos datos del a tabla 4to secundaria
       
        Connection cn12=Conexion.Conectar();
        PreparedStatement pst12=cn12.prepareStatement("select *from tabla_cuarto_secundaria where Dni_est='"+dni+"'");
        String[] fila12=new String[8];
        ResultSet resul12=pst12.executeQuery();
        Tabla_HistoralGrado =new JTable(model_HistorialGrados);
        jScrollPane_HistoralGrado.setViewportView(Tabla_HistoralGrado);
        while(resul12.next())
        {
          fila12[0]=resul12.getString("Dni_est");
          fila12[1]=resul12.getString("Nombre_est");
          fila12[2]=resul12.getString("Apellidos_est");
          fila12[3]=resul12.getString("Estado");
          fila12[4]=resul12.getString("FechaRegistro");
          fila12[5]="Cuarto";
          fila12[6]="Secundaria";
          fila12[7]=resul12.getString("Observaciones");
          model_HistorialGrados.addRow(fila12);
        }
        cn12.close();
    } catch (Exception e) { JOptionPane.showMessageDialog(null,"Error al recuperar información del nivel secundario");
                            System.err.println("error no se recupero informacion de tabla 4to secundaria:"+e);}

            
    try {// buscamos y recuperarmos datos del a tabla 2do secundaria
        
        Connection cn13=Conexion.Conectar();
        PreparedStatement pst13=cn13.prepareStatement("select *from tabla_quinto_secundaria where Dni_est='"+dni+"'");
        String[] fila13=new String[8];
        ResultSet resul13=pst13.executeQuery();
        Tabla_HistoralGrado =new JTable(model_HistorialGrados);
        jScrollPane_HistoralGrado.setViewportView(Tabla_HistoralGrado);
        while(resul13.next())
        {
          fila13[0]=resul13.getString("Dni_est");
          fila13[1]=resul13.getString("Nombre_est");
          fila13[2]=resul13.getString("Apellidos_est");
          fila13[3]=resul13.getString("Estado");
          fila13[4]=resul13.getString("FechaRegistro");
          fila13[5]="Quinto";
          fila13[6]="Secundaria";
          fila13[7]=resul13.getString("Observaciones");
          model_HistorialGrados.addRow(fila13);
        }
        cn13.close();
    } catch (Exception e) { JOptionPane.showMessageDialog(null,"Error al recuperar información del nivel secundario");
                            System.err.println("error no se recupero informacion de tabla 5to secundaria:"+e);}
    txt_observacionesGrado.setText("Ninguna");
        try {// recuperadmos datos principales del estudiante
        
        InputStream is;
        Connection cn=Conexion.Conectar();
        PreparedStatement pst=cn.prepareStatement("select *from tabla_estudiante where Dni_est='"+dni+"'");
        ResultSet resultado=pst.executeQuery();
        while(resultado.next())
        {
         labelMensaje.setText("");
         txt_dniEstudiante.setText("   "+resultado.getString("Dni_est"));
         txt_nombre1.setText("   "+resultado.getString("Nombre_est"));
         txt_apellidos1.setText("   "+resultado.getString("Apellidos_est"));
         txt_fechaNacimeinto.setText("   "+resultado.getString("FNacimiento_est"));
         txt_observacionesGrado.setText("   "+resultado.getString("Observaciones_est"));
         dniRepresentante=resultado.getString("Contactar_a");
         is=resultado.getBinaryStream("Imagen");
               
                  BufferedImage bi=ImageIO.read(is);// lear binario
                  ImageIcon fotoEstudiante=new ImageIcon(bi);
                  Icon icono_fondo= new ImageIcon(fotoEstudiante.getImage().getScaledInstance(label_FotoEstudiante.getWidth(),
                        label_FotoEstudiante.getHeight(),Image.SCALE_DEFAULT ));// ajustar la imagen a las dimensiones del jlabel_fondo
                  label_FotoEstudiante.setIcon(icono_fondo);
                  this.repaint();
        }
        cn.close();
    } catch (SQLException e) { JOptionPane.showMessageDialog(null,"ERROR al recuperar Información del estudiante",null,JOptionPane.WARNING_MESSAGE);
                            System.err.println("error no se recupero infromacion del estudiante:"+e);}

    
}
    
    
// CLASE PARA RECUPERA LA HORA AUTOMATICA
public class Hilo_hora extends Thread{
    @Override
    public void run()
    {
        while(pase==0)
        {
        String H_Ingreso, hora;
        Calendar calendario = Calendar.getInstance();
        hora=Integer.toString(calendario.get(Calendar.HOUR_OF_DAY));
        H_Ingreso = hora + ":"
                + Integer.toString(calendario.get(Calendar.MINUTE)) +":"
                + Integer.toString(calendario.get(Calendar.SECOND));
            
         if (Integer.parseInt(hora)<=12){
            label_horaLogin.setText(H_Ingreso+" AM");
            }
         else{
            label_horaLogin.setText(H_Ingreso+" PM");
            }
        
        try {
             Hilo_hora.sleep(1000);
            } 
        catch (InterruptedException e)
            {System.err.println("error en el hilo 1: "+e);}
        }        
    }
}
}
