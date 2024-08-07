
package Ventanas;

import Clases.CeldasTablaDatos;
import Clases.CeldasTablaResultados;
import Clases.ColorCeldaResultado;
import Clases.Conexion;
import Clases.GestionEncabezadoTabla;
import static Ventanas.ListaDocentes.FechaActual;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class VentanaPrincipal_Registros extends javax.swing.JFrame {

    DefaultTableModel model1= new DefaultTableModel();
    DefaultTableModel model2= new DefaultTableModel();
    
    CeldasTablaDatos MensajeroFilaDatos= new CeldasTablaDatos();
    CeldasTablaResultados MensajeroFilaResultados= new CeldasTablaResultados();
    GestionEncabezadoTabla MensajeroEcabezadoTabla= new GestionEncabezadoTabla(); 
    ColorCeldaResultado MensajeroColorFila= new ColorCeldaResultado();
  
  
    Double  Sueldo, Vacaciones, Hrs_extra, Comisiones;
    String Tipo_AFP;
    boolean bandera=false;
    String nombre="Login.Nombre"; 
    int Fila;
      Double TOTALSUELDOS=0.0, TOTALVACACIONES=0.0,TOTALCOMICIONES=0.0;

      String fecha="";
       int pase=0;
    public VentanaPrincipal_Registros() {
        initComponents();

         this.setExtendedState(MAXIMIZED_BOTH);
         
        panelMenuBuscar.setVisible(false);
        Panel_InformacionBuscar.setVisible(false);
        
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
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        Panel_InformacionBuscar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        labelCorreo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LabelTelefono = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        labelEspecialidad = new javax.swing.JLabel();
        txt_genero = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_especialidadDocente = new javax.swing.JTextField();
        txt_estado = new javax.swing.JTextField();
        labelEstado = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        LabelTutoria = new javax.swing.JLabel();
        txt_tutoriaDocente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_observaciones = new javax.swing.JTextArea();
        panelMenuBuscar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Boton_Buscador = new javax.swing.JButton();
        cmb_tipoPersona = new javax.swing.JComboBox<>();
        txtDniBuscador = new javax.swing.JTextField();
        labelMensaje = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        MenuRegistrar_Docente = new javax.swing.JMenuItem();
        MenuRegistrar_PadreApoderado = new javax.swing.JMenuItem();
        MenuRegistrar_Estudiante = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_userInfo = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        Menu_Padres = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        Menu_estudiantes = new javax.swing.JMenu();
        Menu_RegistrarEstudiante = new javax.swing.JMenuItem();
        Menu_ListaEstudiantes = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        Menu_ayuda = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        Menu_salir = new javax.swing.JMenu();

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label_apellidoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(235, 235, 235))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_nombreLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jInternalFrame1.setVisible(true);

        jLabel3.setText("Nombre:");

        jLabel4.setText("Doc Indentidad:");

        jLabel5.setText("Apellidos:");

        txt_dni.setBackground(new java.awt.Color(255, 255, 204));
        txt_dni.setForeground(new java.awt.Color(0, 102, 102));
        txt_dni.setBorder(null);

        txt_nombre.setBackground(new java.awt.Color(255, 255, 204));
        txt_nombre.setForeground(new java.awt.Color(0, 102, 102));
        txt_nombre.setBorder(null);

        txt_apellidos.setBackground(new java.awt.Color(255, 255, 204));
        txt_apellidos.setForeground(new java.awt.Color(0, 102, 102));
        txt_apellidos.setBorder(null);

        labelCorreo.setText("Correo Electrónico:");

        jLabel8.setText("Género:");

        LabelTelefono.setText("Teléfono:");

        jLabel13.setText("Dirección/Domicilio:");

        labelEspecialidad.setText("Especialidad:");

        txt_genero.setBackground(new java.awt.Color(255, 255, 204));
        txt_genero.setForeground(new java.awt.Color(0, 102, 102));
        txt_genero.setBorder(null);

        txt_telefono.setBackground(new java.awt.Color(255, 255, 204));
        txt_telefono.setForeground(new java.awt.Color(0, 102, 102));
        txt_telefono.setBorder(null);

        txt_correo.setBackground(new java.awt.Color(255, 255, 204));
        txt_correo.setForeground(new java.awt.Color(0, 102, 102));
        txt_correo.setBorder(null);

        txt_direccion.setBackground(new java.awt.Color(255, 255, 204));
        txt_direccion.setForeground(new java.awt.Color(0, 102, 102));
        txt_direccion.setBorder(null);

        txt_especialidadDocente.setBackground(new java.awt.Color(255, 255, 204));
        txt_especialidadDocente.setForeground(new java.awt.Color(0, 102, 102));
        txt_especialidadDocente.setBorder(null);

        txt_estado.setBackground(new java.awt.Color(255, 255, 204));
        txt_estado.setForeground(new java.awt.Color(0, 102, 102));
        txt_estado.setBorder(null);

        labelEstado.setText("Estado:");

        labelFecha.setText("Fecha de Registro");

        txt_fecha.setBackground(new java.awt.Color(255, 255, 204));
        txt_fecha.setForeground(new java.awt.Color(0, 102, 102));
        txt_fecha.setBorder(null);

        LabelTutoria.setText("Tutoria:");

        txt_tutoriaDocente.setBackground(new java.awt.Color(255, 255, 204));
        txt_tutoriaDocente.setForeground(new java.awt.Color(0, 102, 102));
        txt_tutoriaDocente.setBorder(null);

        txt_observaciones.setBackground(new java.awt.Color(255, 255, 204));
        txt_observaciones.setColumns(20);
        txt_observaciones.setRows(5);
        txt_observaciones.setBorder(null);
        jScrollPane2.setViewportView(txt_observaciones);

        javax.swing.GroupLayout Panel_InformacionBuscarLayout = new javax.swing.GroupLayout(Panel_InformacionBuscar);
        Panel_InformacionBuscar.setLayout(Panel_InformacionBuscarLayout);
        Panel_InformacionBuscarLayout.setHorizontalGroup(
            Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombre)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_apellidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelTutoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_tutoriaDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                        .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_direccion)
                                .addGap(1, 1, 1))
                            .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(LabelTelefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_telefono)))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                                .addComponent(labelCorreo)
                                .addGap(18, 18, 18)
                                .addComponent(txt_correo)
                                .addGap(14, 14, 14))
                            .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                                .addComponent(labelEspecialidad)
                                .addGap(18, 18, 18)
                                .addComponent(txt_especialidadDocente, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE))))
                    .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                        .addComponent(labelFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(labelEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        Panel_InformacionBuscarLayout.setVerticalGroup(
            Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_InformacionBuscarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tutoriaDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTutoria))
                .addGap(27, 27, 27)
                .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTelefono)
                    .addComponent(jLabel8)
                    .addComponent(labelCorreo)
                    .addComponent(txt_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(labelEspecialidad)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_especialidadDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_InformacionBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelEstado)
                        .addComponent(labelFecha)
                        .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
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

        cmb_tipoPersona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Docente", "Padre/Apoderado", "Estudiante" }));
        cmb_tipoPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_tipoPersonaActionPerformed(evt);
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
                .addGroup(panelMenuBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelMenuBuscarLayout.createSequentialGroup()
                        .addComponent(cmb_tipoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Boton_Buscador))
                    .addGroup(panelMenuBuscarLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDniBuscador)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuBuscarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelMenuBuscarLayout.setVerticalGroup(
            panelMenuBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDniBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMenuBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_tipoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_Buscador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Buscar");
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

        jMenu2.setText("Actualizar");
        jMenu2.setToolTipText("Actualizar Información");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu2);

        jMenu6.setText("Registrar");
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
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMenuBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addGap(21, 21, 21))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(panelMenuBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addGap(35, 35, 35))
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
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );

        Menu_userInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_asistencia.png"))); // NOI18N
        Menu_userInfo.setText("Docentes");
        Menu_userInfo.setToolTipText("Registro de todos los Docentes");
        Menu_userInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Menu_userInfo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Menu_userInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_userInfoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu_userInfoMousePressed(evt);
            }
        });
        Menu_userInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_userInfoActionPerformed(evt);
            }
        });
        jMenuBar1.add(Menu_userInfo);

        jMenu3.setText("-");
        jMenuBar1.add(jMenu3);

        Menu_Padres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Padres.png"))); // NOI18N
        Menu_Padres.setText("Padres");
        Menu_Padres.setToolTipText("Registro de Todos los Padres/Apoderados/Representantes");
        Menu_Padres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Menu_Padres.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Menu_Padres.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Menu_Padres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_PadresMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu_PadresMousePressed(evt);
            }
        });
        jMenuBar1.add(Menu_Padres);

        jMenu5.setText("-");
        jMenuBar1.add(jMenu5);

        Menu_estudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estudiantes.png"))); // NOI18N
        Menu_estudiantes.setText("Estudiantes");
        Menu_estudiantes.setToolTipText("Registro de Todos los Estudiantes");
        Menu_estudiantes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Menu_estudiantes.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Menu_estudiantes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Menu_estudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_estudiantesMouseClicked(evt);
            }
        });

        Menu_RegistrarEstudiante.setText("Registrar Estudiante");
        Menu_RegistrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_RegistrarEstudianteActionPerformed(evt);
            }
        });
        Menu_estudiantes.add(Menu_RegistrarEstudiante);

        Menu_ListaEstudiantes.setText("Estudiantes Registrados");
        Menu_ListaEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_ListaEstudiantesActionPerformed(evt);
            }
        });
        Menu_estudiantes.add(Menu_ListaEstudiantes);

        jMenuBar1.add(Menu_estudiantes);

        jMenu7.setText("-");
        jMenuBar1.add(jMenu7);

        Menu_ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ayuda.png"))); // NOI18N
        Menu_ayuda.setText("Ayuda");
        Menu_ayuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Menu_ayuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Menu_ayuda.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Menu_ayuda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Menu_ayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_ayudaMouseClicked(evt);
            }
        });
        Menu_ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_ayudaActionPerformed(evt);
            }
        });
        jMenuBar1.add(Menu_ayuda);

        jMenu4.setText("-");
        jMenuBar1.add(jMenu4);

        Menu_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        Menu_salir.setText("Salir");
        Menu_salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Menu_salir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Menu_salir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Menu_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_salirMouseClicked(evt);
            }
        });
        Menu_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_salirActionPerformed(evt);
            }
        });
        jMenuBar1.add(Menu_salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jDesktopPane2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_userInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_userInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu_userInfoActionPerformed

    private void Menu_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_salirActionPerformed


    }//GEN-LAST:event_Menu_salirActionPerformed

    private void Menu_ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_ayudaActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_Menu_ayudaActionPerformed

    private void Menu_userInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_userInfoMouseClicked
   // TODO add your handling code here:de
   ListaDocentes docentes=new ListaDocentes();
   docentes.setVisible(true);
    }//GEN-LAST:event_Menu_userInfoMouseClicked

    private void Menu_ayudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_ayudaMouseClicked
          JOptionPane.showMessageDialog(null,"Hola "+nombre+" este es un programa que calculará \n"
                                            +"la remuneración de los Colaboradores de la empresa\n\n"
                                            + "            Grupo Nexo Franquicia \n\n\n  "
                                            + "** Version 0.01-2020 **" );
     // TODO add your handling code here:
    }//GEN-LAST:event_Menu_ayudaMouseClicked

    private void Menu_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_salirMouseClicked
        this.dispose();
        Listado_de_Aplicaciones mensajero= new Listado_de_Aplicaciones();
        mensajero.setVisible(true);
    }//GEN-LAST:event_Menu_salirMouseClicked

    private void Menu_PadresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_PadresMouseClicked
        // TODO add your handling code here:
        ListaPadres listaPadres=new ListaPadres();
        listaPadres.setVisible(true);
    }//GEN-LAST:event_Menu_PadresMouseClicked

    private void Menu_estudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_estudiantesMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_Menu_estudiantesMouseClicked

    private void Menu_RegistrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_RegistrarEstudianteActionPerformed
        // TODO add your handling code here:
        NewEstudiante registrarNuevoEstudiante=new NewEstudiante();
        registrarNuevoEstudiante.setVisible(true);
    }//GEN-LAST:event_Menu_RegistrarEstudianteActionPerformed

    private void Menu_ListaEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_ListaEstudiantesActionPerformed
        // TODO add your handling code here:
                ListaEstudiantes listahijos= new ListaEstudiantes();
        listahijos.setVisible(true);
    }//GEN-LAST:event_Menu_ListaEstudiantesActionPerformed

    private void Menu_userInfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_userInfoMousePressed
     Menu_userInfo.setForeground(new Color(204,0,51));
     Menu_Padres.setForeground(new Color(0,0,0));
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu_userInfoMousePressed

    private void Menu_PadresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_PadresMousePressed
     Menu_Padres.setForeground(new Color(204,0,51)); 
     Menu_userInfo.setForeground(new Color(0,0,0));
           // TODO add your handling code here:
    }//GEN-LAST:event_Menu_PadresMousePressed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
     pase=1;

    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();

    }//GEN-LAST:event_formWindowClosing

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        txtDniBuscador.requestFocus();
        panelMenuBuscar.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

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
        txtDniBuscador.requestFocus();
        String dniBuscador, TipoPersona;int contador=0;
        dniBuscador=txtDniBuscador.getText().trim();
        TipoPersona=cmb_tipoPersona.getSelectedItem().toString();
        if(dniBuscador.equals(""))
        {
            labelMensaje.setText("Ingrese DNI");
            contador++;
        }
        if(TipoPersona.equals("Selecionar"))
        {
            labelMensaje.setText("Selecionar un Cargo");
            contador++;
        }

        if(contador==0)
        {   // infromacion de un docente
            
            labelMensaje.setText("");
             Panel_InformacionBuscar.setVisible(true);
            if(TipoPersona.equals("Docente"))
            {
            try {
                Connection cn= Conexion.Conectar();
                PreparedStatement pst=cn.prepareStatement("select *from tabla_docentes where Dni_doc='"+dniBuscador+"'");
                ResultSet resul=pst.executeQuery();
                if(resul.next()){
                labelFecha.setVisible(true);
                txt_fecha.setVisible(true);
                labelEstado.setVisible(true);
                txt_estado.setVisible(true);
                txt_dni.setText(resul.getString("Dni_doc"));
                txt_nombre.setText(resul.getString("Nombre_doc"));
                txt_apellidos.setText(resul.getString("Apellidos_doc"));
                txt_genero.setText(resul.getString("Genero_doc"));
                LabelTelefono.setText("Teléfono:");
                txt_telefono.setText(resul.getString("Telf_doc"));
                labelCorreo.setText("Correo Electrónico:");
                txt_correo.setText(resul.getString("Correo_doc"));
                txt_direccion.setText(resul.getString("Direccion_doc"));
                labelEspecialidad.setText("Especialidad:");                
                txt_especialidadDocente.setText(resul.getString("Especialidad_doc"));
                txt_estado.setText(resul.getString("Estado_doc"));
                txt_observaciones.setText(resul.getString("Observaciones"));
                LabelTutoria.setText("Tutoría:");
                txt_tutoriaDocente.setText(resul.getString("Tutoria"));
                txt_fecha.setText(resul.getString("FechaRegistro"));
                }
                cn.close();
                } catch (Exception e) { JOptionPane.showMessageDialog(null,"Error al buscar infromación del docente, contacte al administrador",null,JOptionPane.WARNING_MESSAGE);
                                        System.err.println("erro al buscar infromacion: "+e);}
            }
            //informacion de un padre
            if(TipoPersona.equals("Padre/Apoderado"))
            {
            try {
                Connection cn2= Conexion.Conectar();
                PreparedStatement pst2=cn2.prepareStatement("select *from tabla_padres where Dni_pad='"+dniBuscador+"'");
                ResultSet resul2=pst2.executeQuery();
                if(resul2.next()){
                labelFecha.setVisible(true);
                txt_fecha.setVisible(true);
                labelEstado.setVisible(true);
                txt_estado.setVisible(true);
                txt_dni.setText(resul2.getString("Dni_pad"));
                txt_nombre.setText(resul2.getString("Nombre_pad"));
                txt_apellidos.setText(resul2.getString("Apellidos_pad"));
                txt_genero.setText(resul2.getString("Genero_pad"));
                LabelTelefono.setText("Teléfono:");
                txt_telefono.setText(resul2.getString("Telf_pad"));
                labelCorreo.setText("Correo Electrónico:");
                txt_correo.setText(resul2.getString("Correo_pad"));
                txt_direccion.setText(resul2.getString("Direccion_pad"));
                labelEspecialidad.setText("Parentesto:");               
                txt_especialidadDocente.setText(resul2.getString("Parentesco_pad"));
                txt_estado.setText(resul2.getString("Estado_pad"));
                txt_observaciones.setText(resul2.getString("Observaciones"));
                LabelTutoria.setText("Situción:");
                txt_tutoriaDocente.setText(resul2.getString("Situacion_pad"));
                txt_fecha.setText(resul2.getString("FechaRegistro"));
                }
                cn2.close();
                } catch (Exception e) { JOptionPane.showMessageDialog(null,"Erro al buscar infromación del padre/apoderado, contacte al administrador",null,JOptionPane.WARNING_MESSAGE);
                                        System.err.println("erro al buscar infromacion: "+e);}
                
            }
            //infromacion de un estudiante 
            if(TipoPersona.equals("Estudiante"))
            {
            try {
                Connection cn3= Conexion.Conectar();
                PreparedStatement pst3=cn3.prepareStatement("select *from tabla_estudiante where Dni_est='"+dniBuscador+"'");
                ResultSet resul3=pst3.executeQuery();
                if(resul3.next()){
                txt_dni.setText(resul3.getString("Dni_est"));
                txt_nombre.setText(resul3.getString("Nombre_est"));
                txt_apellidos.setText(resul3.getString("Apellidos_est"));
                txt_genero.setText(resul3.getString("Genero_est"));
                LabelTelefono.setText("Fecha de Nacimiento:");
                txt_telefono.setText(resul3.getString("FNacimiento_est"));
                labelCorreo.setText("PADRE:");
                txt_correo.setText(resul3.getString("Dni_padre")+" "+resul3.getString("Nombre_padre")+" "+resul3.getString("Apellidos_padre"));
                txt_direccion.setText(resul3.getString("Domicilio_est"));
                labelEspecialidad.setText("MADRE:");
                txt_especialidadDocente.setText(resul3.getString("Dni_madre")+" "+resul3.getString("Nombre_madre")+" "+resul3.getString("Apellidos_madre"));
                txt_observaciones.setText(resul3.getString("Observaciones_est"));
                LabelTutoria.setText("Contactar:");
                txt_tutoriaDocente.setText(resul3.getString("Contactar_a"));
                labelFecha.setVisible(false);
                txt_fecha.setVisible(false);
                labelEstado.setVisible(false);
                txt_estado.setVisible(false);
                }
                cn3.close();
                } catch (Exception e) { JOptionPane.showMessageDialog(null,"Erro al buscar infromación del estudiante, contacte al administrador",null,JOptionPane.WARNING_MESSAGE);
                                        System.err.println("erro al buscar infromacion: "+e);}
                
            }  
                      
        }

    }//GEN-LAST:event_Boton_BuscadorActionPerformed

    private void cmb_tipoPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_tipoPersonaActionPerformed
        // TODO add your handling code here:
        
            labelMensaje.setText("");
    }//GEN-LAST:event_cmb_tipoPersonaActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal_Registros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Buscador;
    private javax.swing.JLabel LabelTelefono;
    private javax.swing.JLabel LabelTutoria;
    private javax.swing.JMenuItem MenuRegistrar_Docente;
    private javax.swing.JMenuItem MenuRegistrar_Estudiante;
    private javax.swing.JMenuItem MenuRegistrar_PadreApoderado;
    private javax.swing.JMenuItem Menu_ListaEstudiantes;
    private javax.swing.JMenu Menu_Padres;
    private javax.swing.JMenuItem Menu_RegistrarEstudiante;
    private javax.swing.JMenu Menu_ayuda;
    private javax.swing.JMenu Menu_estudiantes;
    private javax.swing.JMenu Menu_salir;
    private javax.swing.JMenu Menu_userInfo;
    private javax.swing.JPanel Panel_InformacionBuscar;
    private javax.swing.JPopupMenu Popup_Menu;
    private javax.swing.JComboBox<String> cmb_tipoPersona;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelEspecialidad;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelFechaLogin;
    private javax.swing.JLabel labelMensaje;
    private javax.swing.JLabel label_apellidoLogin;
    private javax.swing.JLabel label_horaLogin;
    private javax.swing.JLabel label_nombreLogin;
    private javax.swing.JPanel panelMenuBuscar;
    private javax.swing.JMenuItem popud_editar;
    private javax.swing.JMenuItem popud_infromacion;
    private javax.swing.JTextField txtDniBuscador;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_especialidadDocente;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_genero;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextArea txt_observaciones;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_tutoriaDocente;
    // End of variables declaration//GEN-END:variables

     
// CLASE PARA RECUPERA LA HORA AUTOMATICA
public class Hilo_hora extends Thread{
    @Override
    public void run()
    {
         pase=0;
        while(pase==0)
        {
        String H_Ingreso, hora;
        Calendar calendario = Calendar.getInstance();
        hora=Integer.toString(calendario.get(Calendar.HOUR_OF_DAY));
        H_Ingreso = hora + ":"
                + Integer.toString(calendario.get(Calendar.MINUTE)) +":"
                + Integer.toString(calendario.get(Calendar.SECOND));
      //  System.out.println("minuto:"+H_Ingreso);
            System.out.println("");
            
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
