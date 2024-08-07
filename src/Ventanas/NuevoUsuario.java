
package Ventanas;

import Clases.Conexion;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class NuevoUsuario extends javax.swing.JFrame {
public static String Pass,nombre, user, apellidos;
    String actualizarUser;
    public NuevoUsuario() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        
        boton_actualizar.setVisible(false);
        boton_cambiarContraseña.setVisible(false);
        

        
        panel_buscarUsuario.setVisible(false);
        panel_InfoUsuario.setVisible(true);
        txt_pass.setEditable(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panel_InfoUsuario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_user = new javax.swing.JTextField();
        txt_pass = new javax.swing.JTextField();
        label_confirmarPass = new javax.swing.JLabel();
        txt_confirmarPass = new javax.swing.JTextField();
        boton_guardar = new javax.swing.JButton();
        cmb_cargo = new javax.swing.JComboBox<>();
        cmb_estado = new javax.swing.JComboBox<>();
        boton_cambiarContraseña = new javax.swing.JButton();
        boton_actualizar = new javax.swing.JButton();
        panel_buscarUsuario = new javax.swing.JPanel();
        cmb_cargoBuscar = new javax.swing.JComboBox<>();
        txt_busacr = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        MENU_NUEVOUSUARIO = new javax.swing.JMenuItem();
        MENU_CAMBIARDATOS = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(153, 0, 0));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Nuevo Usuario");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nombre      :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Apellidos    :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("User (DNI) :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Pass            :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Cargo         :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Estado:");

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });

        txt_apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidosKeyTyped(evt);
            }
        });

        txt_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_userKeyTyped(evt);
            }
        });

        txt_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_passKeyTyped(evt);
            }
        });

        label_confirmarPass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_confirmarPass.setText("Confirmar Pass:");

        txt_confirmarPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_confirmarPassKeyTyped(evt);
            }
        });

        boton_guardar.setBackground(new java.awt.Color(153, 153, 255));
        boton_guardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boton_guardar.setForeground(new java.awt.Color(255, 255, 255));
        boton_guardar.setText("Guardar");
        boton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_guardarActionPerformed(evt);
            }
        });

        cmb_cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-CARGO-", "Estudiante", "Docente", "Administrador" }));

        cmb_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-ESTADO-", "Activo", "Desactivo", "Suspendido" }));

        boton_cambiarContraseña.setBackground(new java.awt.Color(153, 153, 255));
        boton_cambiarContraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boton_cambiarContraseña.setForeground(new java.awt.Color(255, 255, 255));
        boton_cambiarContraseña.setText("Cambiar Contraseña");
        boton_cambiarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cambiarContraseñaActionPerformed(evt);
            }
        });

        boton_actualizar.setBackground(new java.awt.Color(153, 153, 255));
        boton_actualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boton_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        boton_actualizar.setText("Actualizar");
        boton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_InfoUsuarioLayout = new javax.swing.GroupLayout(panel_InfoUsuario);
        panel_InfoUsuario.setLayout(panel_InfoUsuarioLayout);
        panel_InfoUsuarioLayout.setHorizontalGroup(
            panel_InfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_InfoUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(boton_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(boton_cambiarContraseña)
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(panel_InfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_InfoUsuarioLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panel_InfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(panel_InfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_InfoUsuarioLayout.createSequentialGroup()
                            .addGroup(panel_InfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmb_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel_InfoUsuarioLayout.createSequentialGroup()
                                    .addGap(147, 147, 147)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel_InfoUsuarioLayout.createSequentialGroup()
                            .addGroup(panel_InfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(label_confirmarPass)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_confirmarPass, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(61, Short.MAX_VALUE)))
        );
        panel_InfoUsuarioLayout.setVerticalGroup(
            panel_InfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_InfoUsuarioLayout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addGroup(panel_InfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_guardar)
                    .addComponent(boton_cambiarContraseña)
                    .addComponent(boton_actualizar))
                .addContainerGap())
            .addGroup(panel_InfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_InfoUsuarioLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panel_InfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(panel_InfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(panel_InfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panel_InfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_confirmarPass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_confirmarPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(panel_InfoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmb_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(cmb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addContainerGap(65, Short.MAX_VALUE)))
        );

        cmb_cargoBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-CARGO-", "Estudiante", "Docente", "Administrador" }));
        cmb_cargoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_cargoBuscarActionPerformed(evt);
            }
        });

        txt_busacr.setBackground(new java.awt.Color(255, 255, 204));
        txt_busacr.setForeground(new java.awt.Color(0, 0, 102));
        txt_busacr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_busacr.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_buscarUsuarioLayout = new javax.swing.GroupLayout(panel_buscarUsuario);
        panel_buscarUsuario.setLayout(panel_buscarUsuarioLayout);
        panel_buscarUsuarioLayout.setHorizontalGroup(
            panel_buscarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_buscarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmb_cargoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_busacr, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_buscarUsuarioLayout.setVerticalGroup(
            panel_buscarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_buscarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_buscarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(botonBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_buscarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmb_cargoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_busacr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ajustes.png"))); // NOI18N

        MENU_NUEVOUSUARIO.setText("Nuevo Usuario");
        MENU_NUEVOUSUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_NUEVOUSUARIOActionPerformed(evt);
            }
        });
        jMenu2.add(MENU_NUEVOUSUARIO);

        MENU_CAMBIARDATOS.setText("Cambiar Datos");
        MENU_CAMBIARDATOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_CAMBIARDATOSActionPerformed(evt);
            }
        });
        jMenu2.add(MENU_CAMBIARDATOS);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_buscarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(panel_InfoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_buscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_InfoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MENU_NUEVOUSUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_NUEVOUSUARIOActionPerformed
        labelTitulo.setText("Nuevo Usuario");
        boton_actualizar.setVisible(false);
        boton_cambiarContraseña.setVisible(false);
        boton_guardar.setVisible(true);
        txt_confirmarPass.setVisible(true);
        label_confirmarPass.setVisible(true);

        panel_buscarUsuario.setVisible(false);
        panel_InfoUsuario.setVisible(true);
        txt_pass.setEditable(true);
        limpiarCampos();
        
    }//GEN-LAST:event_MENU_NUEVOUSUARIOActionPerformed

    private void MENU_CAMBIARDATOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_CAMBIARDATOSActionPerformed
                labelTitulo.setText("Cambiar  Información");
        boton_actualizar.setVisible(true);
        boton_cambiarContraseña.setVisible(true);
        boton_guardar.setVisible(false);
        txt_confirmarPass.setVisible(false);
        label_confirmarPass.setVisible(false);
        panel_buscarUsuario.setVisible(true);
        panel_InfoUsuario.setVisible(false);
        txt_pass.setEditable(false);

    }//GEN-LAST:event_MENU_CAMBIARDATOSActionPerformed

    private void boton_cambiarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cambiarContraseñaActionPerformed
     Pass=txt_pass.getText().trim();
     nombre=txt_nombre.getText().trim();
     user=txt_user.getText().trim();
     apellidos=txt_apellidos.getText();

        ConfirmarContraseña mens=new ConfirmarContraseña();
        mens.setVisible(true);
        
    }//GEN-LAST:event_boton_cambiarContraseñaActionPerformed

    private void boton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_guardarActionPerformed

        String Nombre_usu,Apellidos_usu,Usuario_usu,Pass_usu,Pass_usu2,Cargo_usu,Estado_usu;
        int contador=0;
        Nombre_usu=txt_nombre.getText().trim();
        Apellidos_usu=txt_apellidos.getText().trim();
        Usuario_usu=txt_user.getText().trim();
        Cargo_usu=cmb_cargo.getSelectedItem().toString();
        Estado_usu=cmb_estado.getSelectedItem().toString();
        
        Pass_usu=txt_pass.getText().trim();
        Pass_usu2=txt_confirmarPass.getText().trim();
        if(!Pass_usu.equals(Pass_usu2))
        {
             JOptionPane.showMessageDialog(null,"las contraseñas no coinciden",null,JOptionPane.WARNING_MESSAGE);
            contador++;
        }
        
        if(Nombre_usu.equals("")||Apellidos_usu.equals("")||Usuario_usu.equals("")||Cargo_usu.equals("-CARGO-")||Estado_usu.equals("-ESTADO-")||Pass_usu.equals("")||Pass_usu2.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Complete todos los datos");
            contador++;
        }
        
        if(contador==0)
        {
            String userValidar="";
            try {
                Connection cn1=Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select *from tabla_usuarios where Usuario_usu='"+Usuario_usu+"'");
                ResultSet resul=pst1.executeQuery();
                if(resul.next())
                {
                userValidar=resul.getString("Usuario_usu");
                }
            } catch (Exception e) { }
            if(userValidar.equalsIgnoreCase(Usuario_usu))
            {
                JOptionPane.showMessageDialog(null,"Usuario ya registrado ingrese otros valores",null,JOptionPane.WARNING_MESSAGE);
                                        
            }
            else
            {
            int mensaje=JOptionPane.showConfirmDialog(null,"Guardar nuevo Usuario",null,JOptionPane.YES_NO_OPTION);
            if(mensaje==JOptionPane.YES_OPTION)
            {
             try{
                 Connection cn=Conexion.Conectar();
                 PreparedStatement pst=cn.prepareStatement("insert into tabla_usuarios values (?,?,?,?,?,?,?)");
                 pst.setInt(1,0);
                 pst.setString(2, Nombre_usu);
                 pst.setString(3, Apellidos_usu );
                 pst.setString(4, Usuario_usu );
                 pst.setString(5, Pass_usu);
                 pst.setString(6, Cargo_usu);                 
                 pst.setString(7, Estado_usu );
                 pst.executeUpdate();
                cn.close();
                JOptionPane.showMessageDialog(null,"Usuario Registrado Exitosamente");  
                
                } catch (Exception e) { JOptionPane.showMessageDialog(null,"Error al registrar nuevo usuario, contacte al administrador",null,JOptionPane.WARNING_MESSAGE);
                                        System.err.println("erro al gusrar nuevo usuario: "+e);}
            }
            
            else
            {
              JOptionPane.showMessageDialog(null,"Cancelado...");  
            }
            }
        }
        
        
    }//GEN-LAST:event_boton_guardarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        
        String cargo, user;int contador=0;
        user=txt_busacr.getText().trim();
        cargo=cmb_cargoBuscar.getSelectedItem().toString();
        if(user.equals("")||cargo.equals("-CARGO-"))
        {
            JOptionPane.showMessageDialog(null,"Complete todos los datos");
            contador++;
        }
        else
        {
         try{
                 Connection cn=Conexion.Conectar();
                 PreparedStatement pst=cn.prepareStatement("select *from tabla_usuarios where Usuario_usu='"+user+"'and Cargo_usu='"+cargo+"'");
                 ResultSet resul= pst.executeQuery();
                 if(resul.next())
                 {
                     actualizarUser=resul.getString("Usuario_usu");
                     panel_InfoUsuario.setVisible(true);
                     txt_nombre.setText(resul.getString("Nombre_usu"));
                     txt_apellidos.setText(resul.getString("Apellidos_usu"));
                     txt_pass.setText(resul.getString("Pass_usu"));
                     txt_user.setText(resul.getString("Usuario_usu"));
                     String Cargo=resul.getString("Cargo_usu");
                     
                     switch(Cargo)
                     {
                         
                         case"Estudiante" :cmb_cargo.setSelectedIndex(1); break;
                         case"Docente" :cmb_cargo.setSelectedIndex(2);break;
                         case"Administrador" :cmb_cargo.setSelectedIndex(3);break;
                         default:cmb_cargo.setSelectedIndex(0);break;
                     }
                     
                     String estado=resul.getString("Estado_usu");   
                     switch(estado)
                     {
                         case"Activo" :cmb_estado.setSelectedIndex(1);break;
                         case"Desactivo" :cmb_estado.setSelectedIndex(2);break;
                         case"Suspendido" :cmb_estado.setSelectedIndex(3);break;
                         default:cmb_estado.setSelectedIndex(0);break;
                     }
                 }
                 
                 else
                 {
                     
                    JOptionPane.showMessageDialog(null,"No se encontraron datos con los valores ingredaos");
                 }
                 cn.close();
                
                } catch (Exception e) { JOptionPane.showMessageDialog(null,"Error al buscar datos del usuario, contacte al administrador",null,JOptionPane.WARNING_MESSAGE);
                                        System.err.println("erro al buscar datos del usuario: "+e);}
                   
        }
        
        
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void cmb_cargoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_cargoBuscarActionPerformed
        // TODO add your handling code here:
        txt_busacr.requestFocus();
    }//GEN-LAST:event_cmb_cargoBuscarActionPerformed

    private void txt_userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_userKeyTyped
       // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(txt_user.getText().length()>=8){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }

    }//GEN-LAST:event_txt_userKeyTyped

    private void txt_passKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passKeyTyped
        if(txt_pass.getText().length()>=10){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }

    }//GEN-LAST:event_txt_passKeyTyped

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        if(txt_nombre.getText().length()>=30)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_apellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidosKeyTyped
        if(txt_apellidos.getText().length()>=50)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        
    }//GEN-LAST:event_txt_apellidosKeyTyped

    private void txt_confirmarPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_confirmarPassKeyTyped
        if(txt_confirmarPass.getText().length()>=10)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }

    }//GEN-LAST:event_txt_confirmarPassKeyTyped

    private void boton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_actualizarActionPerformed

        String Nombre_usu,Apellidos_usu,Usuario_usu,Pass_usu,Pass_usu2,Cargo_usu,Estado_usu;
        int contador=0;
        Nombre_usu=txt_nombre.getText().trim();
        Apellidos_usu=txt_apellidos.getText().trim();
        Usuario_usu=txt_user.getText().trim();
        Cargo_usu=cmb_cargo.getSelectedItem().toString();
        Estado_usu=cmb_estado.getSelectedItem().toString();
        Pass_usu=txt_pass.getText().trim();
        
        if(Nombre_usu.equals("")||Apellidos_usu.equals("")||Usuario_usu.equals("")||Cargo_usu.equals("-CARGO-")||Estado_usu.equals("-ESTADO-")||Pass_usu.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Complete todos los datos");
            contador++;
        }
        
        if(contador==0)
        {
            int mensaje=JOptionPane.showConfirmDialog(null,"Actualizar Información",null,JOptionPane.YES_NO_OPTION);
            if(mensaje==JOptionPane.YES_OPTION)
            {
                System.out.println("usurio3:"+actualizarUser);
             try{
                 Connection cn=Conexion.Conectar();
                 PreparedStatement pst=cn.prepareStatement("update tabla_usuarios set Nombre_usu=?, "
                         + "Apellidos_usu=?, Usuario_usu=?,Pass_usu=?,Cargo_usu=?,Estado_usu=? where Usuario_usu='"+actualizarUser+"'");
                 pst.setString(1, Nombre_usu);
                 pst.setString(2, Apellidos_usu );
                 pst.setString(3, Usuario_usu );
                 pst.setString(4, Pass_usu);
                 pst.setString(5, Cargo_usu);                 
                 pst.setString(6, Estado_usu );
                 pst.executeUpdate();
                cn.close();
                JOptionPane.showMessageDialog(null,"Actualización Exitosamente");  
                
                } catch (Exception e) { JOptionPane.showMessageDialog(null,"Error al actualizar información del usuario, contacte al administrador",null,JOptionPane.WARNING_MESSAGE);
                                        System.err.println("erro al actualizar nuevo usuario: "+e);}
            }
            
            else
            {
              JOptionPane.showMessageDialog(null,"Cancelado...");  
            }
         }
        


    }//GEN-LAST:event_boton_actualizarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
        Listado_de_Aplicaciones mensajero = new Listado_de_Aplicaciones();
        mensajero.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MENU_CAMBIARDATOS;
    private javax.swing.JMenuItem MENU_NUEVOUSUARIO;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton boton_actualizar;
    private javax.swing.JButton boton_cambiarContraseña;
    private javax.swing.JButton boton_guardar;
    private javax.swing.JComboBox<String> cmb_cargo;
    private javax.swing.JComboBox<String> cmb_cargoBuscar;
    private javax.swing.JComboBox<String> cmb_estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel label_confirmarPass;
    private javax.swing.JPanel panel_InfoUsuario;
    private javax.swing.JPanel panel_buscarUsuario;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_busacr;
    private javax.swing.JTextField txt_confirmarPass;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables

    public void limpiarCampos()
    {
        txt_apellidos.setText("");
        txt_confirmarPass.setText("");
        txt_nombre.setText("");
        txt_pass.setText("");
        txt_user.setText("");
        cmb_cargo.setSelectedIndex(0);
        cmb_estado.setSelectedIndex(0);
    }
}
