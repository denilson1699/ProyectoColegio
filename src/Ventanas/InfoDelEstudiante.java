
package Ventanas;

import java.awt.Color;
import java.util.Calendar;
import javax.swing.JOptionPane;
import Clases.Conexion;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.OptionPaneUI;
import javax.swing.table.DefaultTableModel;

public class InfoDelEstudiante extends javax.swing.JFrame {
public static String DNI_est_Compartido;
String dniPadre, dnimadre,dniapoderado, dniRepresentante,dniBuscador; 
    DefaultTableModel model_hermanos=new DefaultTableModel();
    
public InfoDelEstudiante() throws IOException {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        Calendar calendario= Calendar.getInstance();
        String fecha=Integer.toString(calendario.get(Calendar.DATE))+"/"+
                Integer.toString(calendario.get((Calendar.MONTH))+1)+"/"+
                Integer.toString(calendario.get(Calendar.YEAR));
        label_fecha.setText(fecha);
        
        DNI_est_Compartido=ListaEstudiantes.DNI_est_Compartido;
        System.out.println("dni recuperado:"+DNI_est_Compartido);
        
        ImageIcon imagenLogo= new ImageIcon("src/Imagenes/IconUser.png"); //crear objeto imagen
        Icon icono_logo = new ImageIcon(imagenLogo.getImage().getScaledInstance(label_FotoEstudiante.getWidth(),
        label_FotoEstudiante.getHeight(),Image.SCALE_DEFAULT));// ajustar imagen al jlabel_logo
            label_FotoEstudiante.setIcon(icono_logo);// insertar la imagenFondo
            this.repaint();//confirmar que la imagen se vea
         
        
        
        //recuperamos datos del estudiate
         RecuperarInfoEstudiante(DNI_est_Compartido);
     
        //datos  de estudiantes desde el buscador
        dniBuscador=BuscardorMensajero.dniBuscador;
           RecuperarInfoEstudiante(dniBuscador);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_dniEstudiante = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_domicilio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmb_genero = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        label_fecha = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_observaciones = new javax.swing.JTextArea();
        labelComentarioCaracter = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        label_FotoEstudiante = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_nombrePadre = new javax.swing.JTextField();
        txt_apellidos_padre = new javax.swing.JTextField();
        txt_estadoPADRE = new javax.swing.JTextField();
        txt_direccionPADRE = new javax.swing.JTextField();
        txt_correoPADRE = new javax.swing.JTextField();
        txt_telefonoPADRE = new javax.swing.JTextField();
        txt_dniPadre = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        labelPadre = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txt_nombreMadre = new javax.swing.JTextField();
        txt_apellidosMadre = new javax.swing.JTextField();
        txt_estadoMADRE = new javax.swing.JTextField();
        txt_direccionMADRE = new javax.swing.JTextField();
        txt_correoMADRE = new javax.swing.JTextField();
        txt_telefonoMADRE = new javax.swing.JTextField();
        txt_DniMadre = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        label_madre = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txt_apellidosApoderado = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txt_direccionApoderado = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txt_correoApoderado = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txt_telefonoApoderado = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txt_nombreApoderado = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txt_DniApoderado = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txt_estadoApoderado = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane_tablaHermanos = new javax.swing.JScrollPane();
        Tabla_hermanos = new javax.swing.JTable();
        txt_fechaNacimiento = new javax.swing.JTextField();
        boton_RepresentateApoderado = new javax.swing.JButton();
        boton_BuscraPadre = new javax.swing.JButton();
        Boton_ActualizarDatos = new javax.swing.JButton();
        txt_rutaFoto = new javax.swing.JTextField();
        boton_InsertarFotolEstudiante = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Doc ident:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 33, -1, -1));
        getContentPane().add(txt_dniEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 30, 120, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 71, -1, -1));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 68, 160, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Apellidos:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));
        getContentPane().add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 262, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Domicilio:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));
        getContentPane().add(txt_domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 262, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Genero:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 109, -1, -1));

        cmb_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));
        getContentPane().add(cmb_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 106, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Fecha Nacimiento:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        label_fecha.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        label_fecha.setForeground(new java.awt.Color(153, 0, 0));
        label_fecha.setText("jLabel17");
        getContentPane().add(label_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, 100, 10));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Fecha Registro:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, -1, -1));

        txt_observaciones.setColumns(20);
        txt_observaciones.setRows(5);
        txt_observaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_observacionesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txt_observaciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 563, 58));

        labelComentarioCaracter.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelComentarioCaracter.setForeground(new java.awt.Color(255, 0, 0));
        labelComentarioCaracter.setText("* maximo 200 caracteres");
        getContentPane().add(labelComentarioCaracter, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Observaciones");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        label_FotoEstudiante.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_FotoEstudiante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_FotoEstudiante.setToolTipText("");
        label_FotoEstudiante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_FotoEstudiante.setVerifyInputWhenFocusTarget(false);
        label_FotoEstudiante.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(label_FotoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 140, 150));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Nombre:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Apellidos:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("teléfono:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Correo:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Dirección:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Estado:");

        txt_nombrePadre.setBackground(new java.awt.Color(255, 255, 204));
        txt_nombrePadre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_nombrePadre.setBorder(null);

        txt_apellidos_padre.setBackground(new java.awt.Color(255, 255, 204));
        txt_apellidos_padre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_apellidos_padre.setBorder(null);

        txt_estadoPADRE.setEditable(false);
        txt_estadoPADRE.setBackground(new java.awt.Color(255, 255, 204));
        txt_estadoPADRE.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_estadoPADRE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_estadoPADRE.setBorder(null);

        txt_direccionPADRE.setEditable(false);
        txt_direccionPADRE.setBackground(new java.awt.Color(255, 255, 204));
        txt_direccionPADRE.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_direccionPADRE.setBorder(null);

        txt_correoPADRE.setEditable(false);
        txt_correoPADRE.setBackground(new java.awt.Color(255, 255, 204));
        txt_correoPADRE.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_correoPADRE.setBorder(null);

        txt_telefonoPADRE.setEditable(false);
        txt_telefonoPADRE.setBackground(new java.awt.Color(255, 255, 204));
        txt_telefonoPADRE.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_telefonoPADRE.setBorder(null);

        txt_dniPadre.setBackground(new java.awt.Color(255, 255, 204));
        txt_dniPadre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_dniPadre.setForeground(new java.awt.Color(204, 0, 0));
        txt_dniPadre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_dniPadre.setBorder(null);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Doc Ident");

        labelPadre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelPadre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icom_padre.png"))); // NOI18N
        labelPadre.setText("PADRE");
        labelPadre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelPadre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(15, 15, 15)
                                .addComponent(txt_dniPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txt_estadoPADRE, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_nombrePadre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_direccionPADRE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_apellidos_padre, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(335, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(30, 30, 30)
                        .addComponent(txt_correoPADRE, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txt_telefonoPADRE, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addGap(37, 37, 37)
                        .addComponent(labelPadre)
                        .addGap(131, 131, 131))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_dniPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_estadoPADRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_nombrePadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_apellidos_padre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_direccionPADRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelPadre)
                        .addGap(13, 13, 13)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telefonoPADRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_correoPADRE, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("           Información del Padre            ", jPanel2);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Nombre:");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setText("Apellidos:");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setText("teléfono:");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setText("Correo:");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setText("Dirección:");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel38.setText("Estado:");

        txt_nombreMadre.setBackground(new java.awt.Color(255, 255, 204));
        txt_nombreMadre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_nombreMadre.setBorder(null);

        txt_apellidosMadre.setBackground(new java.awt.Color(255, 255, 204));
        txt_apellidosMadre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_apellidosMadre.setBorder(null);

        txt_estadoMADRE.setEditable(false);
        txt_estadoMADRE.setBackground(new java.awt.Color(255, 255, 204));
        txt_estadoMADRE.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_estadoMADRE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_estadoMADRE.setBorder(null);

        txt_direccionMADRE.setEditable(false);
        txt_direccionMADRE.setBackground(new java.awt.Color(255, 255, 204));
        txt_direccionMADRE.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_direccionMADRE.setBorder(null);

        txt_correoMADRE.setEditable(false);
        txt_correoMADRE.setBackground(new java.awt.Color(255, 255, 204));
        txt_correoMADRE.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_correoMADRE.setBorder(null);

        txt_telefonoMADRE.setEditable(false);
        txt_telefonoMADRE.setBackground(new java.awt.Color(255, 255, 204));
        txt_telefonoMADRE.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_telefonoMADRE.setBorder(null);

        txt_DniMadre.setBackground(new java.awt.Color(255, 255, 204));
        txt_DniMadre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_DniMadre.setForeground(new java.awt.Color(204, 0, 0));
        txt_DniMadre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_DniMadre.setBorder(null);

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel40.setText("Doc Ident");

        label_madre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_madre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icom_madre.png"))); // NOI18N
        label_madre.setText("MADRE");
        label_madre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_madre.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_nombreMadre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel37)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_direccionMADRE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel34)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_apellidosMadre, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                        .addComponent(label_madre)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(30, 30, 30)
                        .addComponent(txt_correoMADRE, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel35)
                        .addGap(18, 18, 18)
                        .addComponent(txt_telefonoMADRE)
                        .addGap(270, 270, 270))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(15, 15, 15)
                        .addComponent(txt_DniMadre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel38)
                        .addGap(18, 18, 18)
                        .addComponent(txt_estadoMADRE, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_DniMadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_estadoMADRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txt_nombreMadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_apellidosMadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_direccionMADRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(label_madre)
                        .addGap(15, 15, 15)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telefonoMADRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_correoMADRE, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("         Información de la Madre            ", jPanel3);

        txt_apellidosApoderado.setBackground(new java.awt.Color(255, 255, 204));
        txt_apellidosApoderado.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_apellidosApoderado.setText("   null");
        txt_apellidosApoderado.setBorder(null);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setText("Dirección:");

        txt_direccionApoderado.setEditable(false);
        txt_direccionApoderado.setBackground(new java.awt.Color(255, 255, 204));
        txt_direccionApoderado.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_direccionApoderado.setText("   null");
        txt_direccionApoderado.setBorder(null);

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel41.setText("Correo:");

        txt_correoApoderado.setEditable(false);
        txt_correoApoderado.setBackground(new java.awt.Color(255, 255, 204));
        txt_correoApoderado.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_correoApoderado.setText("   null");
        txt_correoApoderado.setBorder(null);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel42.setText("teléfono:");

        txt_telefonoApoderado.setEditable(false);
        txt_telefonoApoderado.setBackground(new java.awt.Color(255, 255, 204));
        txt_telefonoApoderado.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_telefonoApoderado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_telefonoApoderado.setText("   null");
        txt_telefonoApoderado.setBorder(null);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("Nombre:");

        txt_nombreApoderado.setBackground(new java.awt.Color(255, 255, 204));
        txt_nombreApoderado.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_nombreApoderado.setText("   null");
        txt_nombreApoderado.setBorder(null);

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setText("Doc Ident");

        txt_DniApoderado.setBackground(new java.awt.Color(255, 255, 204));
        txt_DniApoderado.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_DniApoderado.setForeground(new java.awt.Color(204, 0, 0));
        txt_DniApoderado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_DniApoderado.setText("null");
        txt_DniApoderado.setBorder(null);

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel44.setText("Parentesto:");

        txt_estadoApoderado.setEditable(false);
        txt_estadoApoderado.setBackground(new java.awt.Color(255, 255, 204));
        txt_estadoApoderado.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_estadoApoderado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_estadoApoderado.setText("   null");
        txt_estadoApoderado.setBorder(null);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("Apellidos");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addGap(15, 15, 15)
                        .addComponent(txt_DniApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel44)
                        .addGap(18, 18, 18)
                        .addComponent(txt_estadoApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addGap(30, 30, 30)
                        .addComponent(txt_correoApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel42)
                        .addGap(18, 18, 18)
                        .addComponent(txt_telefonoApoderado, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addGap(146, 146, 146))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_nombreApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel39)
                            .addGap(18, 18, 18)
                            .addComponent(txt_direccionApoderado))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_apellidosApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(334, 334, 334))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_DniApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_estadoApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txt_nombreApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_apellidosApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_direccionApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telefonoApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_correoApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("       Informacion de Apoderado       ", jPanel5);

        Tabla_hermanos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Tabla_hermanos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabla_hermanos.setSelectionBackground(new java.awt.Color(204, 0, 0));
        jScrollPane_tablaHermanos.setViewportView(Tabla_hermanos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jScrollPane_tablaHermanos, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jScrollPane_tablaHermanos, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("              Hermanos               ", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        getContentPane().add(txt_fechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 123, -1));

        boton_RepresentateApoderado.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        boton_RepresentateApoderado.setForeground(new java.awt.Color(255, 0, 51));
        boton_RepresentateApoderado.setText("Contactar");
        boton_RepresentateApoderado.setBorder(null);
        boton_RepresentateApoderado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_RepresentateApoderadoActionPerformed(evt);
            }
        });
        getContentPane().add(boton_RepresentateApoderado, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 60, 20));

        boton_BuscraPadre.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        boton_BuscraPadre.setForeground(new java.awt.Color(255, 0, 51));
        boton_BuscraPadre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        boton_BuscraPadre.setBorder(null);
        boton_BuscraPadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_BuscraPadreActionPerformed(evt);
            }
        });
        getContentPane().add(boton_BuscraPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 38, 24));

        Boton_ActualizarDatos.setText("Actualizar Datos del Estudiante");
        Boton_ActualizarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ActualizarDatosActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_ActualizarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 570, 200, -1));

        txt_rutaFoto.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        txt_rutaFoto.setBorder(null);
        getContentPane().add(txt_rutaFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 130, 10));

        boton_InsertarFotolEstudiante.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        boton_InsertarFotolEstudiante.setForeground(new java.awt.Color(255, 0, 51));
        boton_InsertarFotolEstudiante.setText("Insertar");
        boton_InsertarFotolEstudiante.setBorder(null);
        boton_InsertarFotolEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_InsertarFotolEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(boton_InsertarFotolEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 50, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_BuscraPadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_BuscraPadreActionPerformed
    try {
        RecuperarInfoEstudiante(txt_dniEstudiante.getText().trim());
    } catch (IOException ex) {
        Logger.getLogger(InfoDelEstudiante.class.getName()).log(Level.SEVERE, null, ex);
    }

    }//GEN-LAST:event_boton_BuscraPadreActionPerformed

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

    private void Boton_ActualizarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ActualizarDatosActionPerformed
       String Dni_est ,Nombre_est,Apellidos_est,Genero_est,FNacimiento_est,Domicilio_est,FechaRegistro,
                Observaciones_est,Dni_padre,Nombre_padre,Apellidos_padre,Dni_madre,Nombre_madre,Apellidos_madre,
                Dni_Apoderado,Nombre_Apoderado,Apellidos_Apoderado,Contactar_a="" ;
        int contador=0;
        //datos del estudiante
        Dni_est=txt_dniEstudiante.getText().trim();
        Nombre_est=txt_nombre.getText().trim();
        Apellidos_est=txt_apellidos.getText().trim();
        Genero_est=cmb_genero.getSelectedItem().toString();
        FNacimiento_est=txt_fechaNacimiento.getText().trim();
        Domicilio_est=txt_domicilio.getText().trim();
        FechaRegistro=label_fecha.getText().trim();
        //datos del padre
        Dni_padre=txt_dniPadre.getText().trim();
        Nombre_padre=txt_nombrePadre.getText().trim();
        Apellidos_padre=txt_apellidos_padre.getText().trim();
        //datos de la madre
        Dni_madre=txt_DniMadre.getText().trim();
        Nombre_madre=txt_nombreMadre.getText().trim();
        Apellidos_madre=txt_apellidosMadre.getText().trim();
        // datos el apoderado
        Dni_Apoderado=txt_DniApoderado.getText().trim();
        Nombre_Apoderado=txt_nombreApoderado.getText().trim();
        Apellidos_Apoderado=txt_apellidosApoderado.getText().trim();
        Contactar_a=Dni_Apoderado=dniRepresentante;
       
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
           if(Dni_padre.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar el DNI del padre");
            txt_dniPadre.requestFocus();
            txt_dniPadre.setBackground(new Color(250,150,150));
            contador++;
        }    
         if(Nombre_padre.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar Nombre del padre");
            txt_nombrePadre.requestFocus();
            txt_nombrePadre.setBackground(new Color(250,150,150));
            contador++;
        }        
         if(Apellidos_padre.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar Apellidos del padre");
            txt_apellidos_padre.requestFocus();
            txt_apellidos_padre.setBackground(new Color(250,150,150));
            contador++;
        }        
     
        if(Dni_madre.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar el DNI de la madre");
            txt_DniMadre.requestFocus();
            txt_DniMadre.setBackground(new Color(250,150,150));
            contador++;
        }    
         if(Nombre_madre.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar Nombre de la madre");
            txt_nombreMadre.requestFocus();
            txt_nombreMadre.setBackground(new Color(250,150,150));
            contador++;
        }        
         if(Apellidos_madre.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar Apellidos de la madre");
            txt_apellidosMadre.requestFocus();
            txt_apellidosMadre.setBackground(new Color(250,150,150));
            contador++;
        } 
        if(Dni_Apoderado.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar el DNI del Apoderado");
            txt_DniApoderado.requestFocus();
            txt_DniApoderado.setBackground(new Color(250,150,150));
            contador++;
        }    
         if(Nombre_Apoderado.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar Nombre del Apoderado");
            txt_nombreApoderado.requestFocus();
            txt_nombreApoderado.setBackground(new Color(250,150,150));
            contador++;
        }        
         if(Apellidos_Apoderado.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Falta completar Apellidos del Apoderado");
            txt_apellidosApoderado.requestFocus();
            txt_apellidosApoderado.setBackground(new Color(250,150,150));
            contador++;
        } 

    
       if(contador==0){
           int mensaje=JOptionPane.showConfirmDialog(null,"Guardar Registro",null,JOptionPane.YES_NO_OPTION);
           if(mensaje==JOptionPane.YES_OPTION)
           {
               try{FileInputStream archivoFoto;
               Connection cn2=Conexion.Conectar();
               PreparedStatement pst2=cn2.prepareStatement("Update tabla_estudiante set Dni_est=?,Nombre_est=?,Apellidos_est=?,Genero_est=?,FNacimiento_est=?,"
                       + "Domicilio_est=?,FechaRegistro=?,Observaciones_est=?,Dni_padre=?,Nombre_padre=?,Apellidos_padre=?,Dni_madre=?,Nombre_madre=?,Apellidos_madre=?,"
                       + "Dni_Apoderado=?,Nombre_Apoderado=?,Apellidos_Apoderado=?,Contactar_a=?,nom_imagenPerfil=?,Imagen=? where Dni_est='"+txt_dniEstudiante.getText().trim()+"'");
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
               pst2.executeUpdate();
               cn2.close();
               // preguntar par volver a ingresar datos
               JOptionPane.showMessageDialog(null,"Actualizacion exitoso ");
               
               }catch(Exception e){JOptionPane.showMessageDialog(null, "Erro al registrar datos del estudiante \n contacte al administrador",null, JOptionPane.WARNING_MESSAGE);
               System.err.println("erro al registra datos del nuevo estudiante:"+e);}
           }
           
           else
           {
               JOptionPane.showMessageDialog(null, "REGISTRO CANCELADO");
           }
        
       }


        
        
        
    }//GEN-LAST:event_Boton_ActualizarDatosActionPerformed

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
        String texto=txt_observaciones.getText().trim();
        int Cantidad=texto.length();
        labelComentarioCaracter.setText("* maximo 200/"+Integer.toString(Cantidad));        // TODO add your handling code here:
    }//GEN-LAST:event_txt_observacionesKeyReleased

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
            java.util.logging.Logger.getLogger(InfoDelEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoDelEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoDelEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoDelEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InfoDelEstudiante().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(InfoDelEstudiante.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_ActualizarDatos;
    private javax.swing.JTable Tabla_hermanos;
    private javax.swing.JButton boton_BuscraPadre;
    private javax.swing.JButton boton_InsertarFotolEstudiante;
    private javax.swing.JButton boton_RepresentateApoderado;
    private javax.swing.JComboBox<String> cmb_genero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane_tablaHermanos;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelComentarioCaracter;
    private javax.swing.JLabel labelPadre;
    private javax.swing.JLabel label_FotoEstudiante;
    private javax.swing.JLabel label_fecha;
    private javax.swing.JLabel label_madre;
    private javax.swing.JTextField txt_DniApoderado;
    private javax.swing.JTextField txt_DniMadre;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_apellidosApoderado;
    private javax.swing.JTextField txt_apellidosMadre;
    private javax.swing.JTextField txt_apellidos_padre;
    private javax.swing.JTextField txt_correoApoderado;
    private javax.swing.JTextField txt_correoMADRE;
    private javax.swing.JTextField txt_correoPADRE;
    private javax.swing.JTextField txt_direccionApoderado;
    private javax.swing.JTextField txt_direccionMADRE;
    private javax.swing.JTextField txt_direccionPADRE;
    private javax.swing.JTextField txt_dniEstudiante;
    private javax.swing.JTextField txt_dniPadre;
    private javax.swing.JTextField txt_domicilio;
    private javax.swing.JTextField txt_estadoApoderado;
    private javax.swing.JTextField txt_estadoMADRE;
    private javax.swing.JTextField txt_estadoPADRE;
    private javax.swing.JTextField txt_fechaNacimiento;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_nombreApoderado;
    private javax.swing.JTextField txt_nombreMadre;
    private javax.swing.JTextField txt_nombrePadre;
    private javax.swing.JTextArea txt_observaciones;
    private javax.swing.JTextField txt_rutaFoto;
    private javax.swing.JTextField txt_telefonoApoderado;
    private javax.swing.JTextField txt_telefonoMADRE;
    private javax.swing.JTextField txt_telefonoPADRE;
    // End of variables declaration//GEN-END:variables

public void RecuperarInfoEstudiante(String dniBuscar) throws IOException{
            try {
                String apellidosEst, nombreEst;
                  InputStream is;
            Connection cn= Conexion.Conectar();
            PreparedStatement pst=cn.prepareStatement("Select * from tabla_estudiante where Dni_est='"+dniBuscar+"'");
            ResultSet resul=pst.executeQuery();
            if(resul.next())
              {
              txt_dniEstudiante.setText("  "+resul.getString("Dni_est"));
              nombreEst=resul.getString("Nombre_est");
              txt_nombre.setText(nombreEst);
              apellidosEst=resul.getString("Apellidos_est");
              txt_apellidos.setText(apellidosEst);
              String genero=resul.getString("Genero_est");
              if(genero.equalsIgnoreCase("Masculino")){cmb_genero.setSelectedIndex(1);}
              if(genero.equalsIgnoreCase("Femenino")){cmb_genero.setSelectedIndex(2);}
              txt_fechaNacimiento.setText("  "+resul.getString("FNacimiento_est"));
              txt_domicilio.setText("  "+resul.getString("Domicilio_est"));
              label_fecha.setText("  "+resul.getString("FechaRegistro"));
              txt_observaciones.setText("  "+resul.getString("Observaciones_est"));
               dniPadre=resul.getString("Dni_padre");
               dnimadre=resul.getString("Dni_madre");
               dniapoderado=resul.getString("Dni_Apoderado");
               dniRepresentante=resul.getString("Contactar_a");
               txt_rutaFoto.setText(resul.getString("nom_imagenPerfil"));
               is=resul.getBinaryStream("Imagen");
               
               BufferedImage bi=ImageIO.read(is);// lear binario
               ImageIcon fotoEstudiante=new ImageIcon(bi);
               Icon icono_fondo= new ImageIcon(fotoEstudiante.getImage().getScaledInstance(label_FotoEstudiante.getWidth(),
                       label_FotoEstudiante.getHeight(),Image.SCALE_DEFAULT ));// ajustar la imagen a las dimensiones del jlabel_fondo
               label_FotoEstudiante.setIcon(icono_fondo);
               this.repaint();
               cn.close();
              
                    Connection cn1=Conexion.Conectar();
                    PreparedStatement pst1=cn1.prepareStatement("Select * from tabla_padres where Dni_pad ='"+dniPadre+"'");
                    ResultSet resul1=pst1.executeQuery();
                    if(resul1.next())
                    {
                       txt_dniPadre.setText("  "+resul1.getString("Dni_pad"));
                       txt_nombrePadre.setText("  "+resul1.getString("Nombre_pad"));
                       labelPadre.setText(resul1.getString("Nombre_pad"));
                       txt_apellidos_padre.setText("  "+resul1.getString("Apellidos_pad"));
                       txt_direccionPADRE.setText("  "+resul1.getString("Direccion_pad"));
                       txt_correoPADRE.setText("  "+resul1.getString("Correo_pad"));
                       txt_telefonoPADRE.setText("  "+resul1.getString("Telf_pad"));
                       txt_estadoPADRE.setText("  "+resul1.getString("Estado_pad"));
                    }
                    cn1.close();
              
                    Connection cn2=Conexion.Conectar();
                    PreparedStatement pst2=cn2.prepareStatement("Select * from tabla_padres where Dni_pad ='"+dnimadre+"'");
                    ResultSet resul2=pst2.executeQuery();
                    if(resul2.next())
                    {
                       txt_DniMadre.setText("  "+resul2.getString("Dni_pad"));
                       txt_nombreMadre.setText("  "+resul2.getString("Nombre_pad"));
                       label_madre.setText(resul2.getString("Nombre_pad"));
                       txt_apellidosMadre.setText("  "+resul2.getString("Apellidos_pad"));
                       txt_direccionMADRE.setText("  "+resul2.getString("Direccion_pad"));
                       txt_correoMADRE.setText("  "+resul2.getString("Correo_pad"));
                       txt_telefonoMADRE.setText("  "+resul2.getString("Telf_pad"));
                       txt_estadoMADRE.setText("  "+resul2.getString("Estado_pad"));
                    }
                    cn2.close();
                   
                    Connection cn3=Conexion.Conectar();
                    PreparedStatement pst3=cn3.prepareStatement("Select * from tabla_padres where Dni_pad ='"+dniapoderado+"'");
                    ResultSet resul3=pst3.executeQuery();
                    if(resul3.next())
                    {
                       txt_DniApoderado.setText("  "+resul3.getString("Dni_pad"));
                       txt_nombreApoderado.setText("  "+resul3.getString("Nombre_pad"));
                       txt_apellidosApoderado.setText("  "+resul3.getString("Apellidos_pad"));
                       txt_direccionApoderado.setText("  "+resul3.getString("Direccion_pad"));
                       txt_correoApoderado.setText("  "+resul3.getString("Correo_pad"));
                       txt_telefonoApoderado.setText("  "+resul3.getString("Telf_pad"));
                       txt_estadoApoderado.setText("  "+resul3.getString("Parentesco_pad"));
                    }
                    cn3.close();
                   
                    String dniEstudianteya;
                    String descartarDni="%"+dniBuscar+"%";
                    Connection cn4=Conexion.Conectar();
                    PreparedStatement pst4=cn4.prepareStatement("select Dni_est from tabla_estudiante where Dni_padre='"+dniPadre+"'or Dni_madre='"+dnimadre+"'");
                    ResultSet resul4=pst4.executeQuery();
                    String[] titulos={"DNI","Nombre","Apellido"};
                    model_hermanos=new DefaultTableModel(null,titulos);
                    Tabla_hermanos=new JTable(model_hermanos);
                    jScrollPane_tablaHermanos.setViewportView(Tabla_hermanos);
                    while(resul4.next()){
                    dniEstudianteya=resul4.getString("Dni_est");
                    System.out.println("dni:hermanp: "+dniEstudianteya);
                    System.out.println("dni:descartar: "+descartarDni);
                    
                    Connection cn5=Conexion.Conectar();
                    PreparedStatement pst5=cn5.prepareStatement("select Dni_est,Nombre_est,Apellidos_est from tabla_estudiante where Dni_est='"+dniEstudianteya+"' and Dni_est not like"+'"'+descartarDni+'"');
                    ResultSet resul5=pst5.executeQuery();
                    if(resul5.next())
                      {
                        Object[] columnas=new Object[3];
                        for(int i=0;i<3;i++)
                        {
                            columnas[i]=resul5.getObject(i+1);
                        }
                        model_hermanos.addRow(columnas);
                      }
                    }
                    
                    cn4.close();
                    
                   
              }
              
        } catch (SQLException e) {System.err.println("error al recuperar datos: "+e);
        }
}
}
