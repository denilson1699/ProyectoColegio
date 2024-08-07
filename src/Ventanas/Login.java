
package Ventanas;

import Clases.Conexion;
import java.sql.Connection;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {


     public static String Nombre="",  apellidos="", usuario="",cargo="", estado="",pass="";
     
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        

        
      txt_dniUser.requestFocus();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_dniUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_passUser = new javax.swing.JTextField();
        Boton_Ingresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_dniUser.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_dniUser.setForeground(new java.awt.Color(153, 0, 51));
        txt_dniUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_dniUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dniUserKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("DNI");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("CONTRASEÑA");

        txt_passUser.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_passUser.setForeground(new java.awt.Color(153, 0, 51));
        txt_passUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_passUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_passUserKeyTyped(evt);
            }
        });

        Boton_Ingresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Boton_Ingresar.setForeground(new java.awt.Color(153, 0, 51));
        Boton_Ingresar.setText("INGRESAR");
        Boton_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_IngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 90, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_dniUser, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_passUser, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(Boton_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 90, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(6, 6, 6)
                    .addComponent(txt_dniUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(8, 8, 8)
                    .addComponent(jLabel5)
                    .addGap(6, 6, 6)
                    .addComponent(txt_passUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(8, 8, 8)
                    .addComponent(Boton_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_IngresarActionPerformed
        // TODO add your handling code here:
        int contador=0;
        usuario=txt_dniUser.getText().trim();
        pass=txt_passUser.getText().trim() ;

        if(usuario.equals("")){
            txt_dniUser.setBackground(new Color(250,150,150));
            txt_dniUser.requestFocus();
            JOptionPane.showMessageDialog(null, "Ingrese Usuario/Dni",null, JOptionPane.WARNING_MESSAGE);
            txt_dniUser.setBackground(new Color(255,255,255));
            contador++;
        }
        if(pass.equals("")){
            txt_passUser.setBackground(new Color(250,150,150));
            txt_passUser.requestFocus();
            JOptionPane.showMessageDialog(null, "Ingrese Contraseña",null, JOptionPane.WARNING_MESSAGE);
            contador++;
            txt_passUser.setBackground(new Color(255,255,255));
        }
        
        
        if(contador==0){

            try 
            {
                Connection cn=Conexion.Conectar();
                PreparedStatement pst=cn.prepareStatement("select *from tabla_usuarios where Usuario_usu='"+usuario+"'and Pass_usu='"+pass+"'");
                ResultSet rs= pst.executeQuery();
                if(rs.next())
                {
                    
                 Nombre=rs.getString("Nombre_usu");
                 apellidos=rs.getString("Apellidos_usu");
                 usuario=rs.getString("Usuario_usu");
                 cargo=rs.getString("Cargo_usu");
                 estado=rs.getString("Estado_usu");
                 pass=rs.getString("Pass_usu");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Usuario o contaseña incorecta");
                }
                cn.close();
                
                if(estado.equalsIgnoreCase("Activo")&&cargo.equalsIgnoreCase("Administrador"))
                {
                 Listado_de_Aplicaciones MENSAJEFO= new Listado_de_Aplicaciones();
                 MENSAJEFO.setVisible(true);
                 this.dispose();  
                }
                 if(estado.equalsIgnoreCase("Activo")&&cargo.equalsIgnoreCase("Docente"))
                {
                 Listado_de_Aplicaciones_Docente MENSAJEFO= new Listado_de_Aplicaciones_Docente();
                 MENSAJEFO.setVisible(true);
                 this.dispose();  
                }
                 if(estado.equalsIgnoreCase("Activo")&& cargo.equalsIgnoreCase("Estudiante"))
                {
                 Listado_de_Aplicaciones_Estudiante MENSAJEFO= new Listado_de_Aplicaciones_Estudiante();
                 MENSAJEFO.setVisible(true);
                 this.dispose();  
                }
                 // desactivo
                 if(estado.equalsIgnoreCase("Desactivo")&& cargo.equalsIgnoreCase("Estudiante"))
                {
                 Listado_de_Aplicaciones_Estudiante_Desactivo MENSAJEFO= new Listado_de_Aplicaciones_Estudiante_Desactivo();
                 MENSAJEFO.setVisible(true);
                 this.dispose();  
                }
                 if(estado.equalsIgnoreCase("Desactivo")&& cargo.equalsIgnoreCase("Docente"))
                {
                 JOptionPane.showMessageDialog(null,Nombre+" "+ apellidos+"  su usuario esta desactivo ");
                }
                  if(estado.equalsIgnoreCase("Desactivo")&& cargo.equalsIgnoreCase("Administrador"))
                {
                 JOptionPane.showMessageDialog(null,Nombre+" "+ apellidos+"  su usuario esta desactivo ");
                }
                  // suspendido
                if(estado.equalsIgnoreCase("Suspendido")&& cargo.equalsIgnoreCase("Estudiante"))
                {
                 JOptionPane.showMessageDialog(null,Nombre+" "+ apellidos+"  su usuario esta Suspendido ");
                }
                  if(estado.equalsIgnoreCase("Suspendido")&& cargo.equalsIgnoreCase("Docente"))
                {
                 JOptionPane.showMessageDialog(null,Nombre+" "+ apellidos+"  su usuario esta Suspendido ");
                }
                  if(estado.equalsIgnoreCase("Suspendido")&& cargo.equalsIgnoreCase("Administrador"))
                {
                 JOptionPane.showMessageDialog(null,Nombre+" "+ apellidos+"  su usuario esta Suspendido ");
                }
                  
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al busacar información de usuario",null, JOptionPane.WARNING_MESSAGE);
                System.err.println("erro, al dar acceso al usuario");
            }


        }
        
        
        
    }//GEN-LAST:event_Boton_IngresarActionPerformed

    private void txt_dniUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dniUserKeyTyped
        char c=evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();
        {   }
        
        if(txt_dniUser.getText().length()>=8)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }

    }//GEN-LAST:event_txt_dniUserKeyTyped

    private void txt_passUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passUserKeyTyped
      if(txt_passUser.getText().length()>=8)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }

    }//GEN-LAST:event_txt_passUserKeyTyped

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Ingresar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_dniUser;
    private javax.swing.JTextField txt_passUser;
    // End of variables declaration//GEN-END:variables
}
