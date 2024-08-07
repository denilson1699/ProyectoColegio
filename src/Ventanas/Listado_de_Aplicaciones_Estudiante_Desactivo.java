
package Ventanas;

import static Ventanas.InformacionUsuario.PassInf;
import static Ventanas.InformacionUsuario.apellidosInf;
import static Ventanas.InformacionUsuario.nombreInf;
import static Ventanas.InformacionUsuario.userInf;
import java.awt.Color;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Listado_de_Aplicaciones_Estudiante_Desactivo extends javax.swing.JFrame {


    
     int pase=0;
    public Listado_de_Aplicaciones_Estudiante_Desactivo() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        setLocationRelativeTo(null);
        setResizable(true);
        setSize(519, 514);
                
        label_apellidoLogin.setText(Login.apellidos);
        label_cargoLogin.setText(Login.cargo);
        label_estadoLogin.setText(Login.estado);
        label_nombreLogin.setText(Login.Nombre);
        label_userLogin.setText(Login.usuario);
        
        Hilo_hora mensajeroHora= new Hilo_hora();
        mensajeroHora.start();
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Boton_evaluciones = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        label_horaLogin = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        label_nombreLogin = new javax.swing.JLabel();
        label_apellidoLogin = new javax.swing.JLabel();
        label_userLogin = new javax.swing.JLabel();
        label_cargoLogin = new javax.swing.JLabel();
        label_estadoLogin = new javax.swing.JLabel();
        labelFechaLogin = new javax.swing.JLabel();
        label_ImagenLogin = new javax.swing.JLabel();
        Boton_ajustes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Boton_evaluciones.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Boton_evaluciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonEvaluciones.png"))); // NOI18N
        Boton_evaluciones.setText("Evaluciones");
        Boton_evaluciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        Boton_evaluciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Boton_evaluciones.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Boton_evaluciones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Boton_evaluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_evalucionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(Boton_evaluciones, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(Boton_evaluciones, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 240, 380));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Escolar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 30, 190, -1));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sistema de Gestión ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 11, 190, -1));

        label_horaLogin.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        label_horaLogin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_horaLogin.setText(" ");
        getContentPane().add(label_horaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 70, -1));

        jLabel6.setText("Apellidos :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel7.setText("Dni          :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel9.setText("Hora   :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 40, -1));

        jLabel10.setText("Fecha :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 40, -1));

        jLabel15.setText("Cargo     :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel17.setText("Estado    :");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel11.setText("Nombre   :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        label_nombreLogin.setText(" ");
        getContentPane().add(label_nombreLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 120, -1));

        label_apellidoLogin.setText(" ");
        getContentPane().add(label_apellidoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 120, -1));

        label_userLogin.setText(" ");
        getContentPane().add(label_userLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 120, -1));

        label_cargoLogin.setText(" ");
        getContentPane().add(label_cargoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 120, -1));

        label_estadoLogin.setText(" ");
        getContentPane().add(label_estadoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 120, -1));

        labelFechaLogin.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelFechaLogin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelFechaLogin.setText(" ");
        getContentPane().add(labelFechaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 70, -1));

        label_ImagenLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_ImagenLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImgenUserLogin.png"))); // NOI18N
        getContentPane().add(label_ImagenLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 40, 40));

        Boton_ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ajustes.png"))); // NOI18N
        Boton_ajustes.setBorder(null);
        Boton_ajustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ajustesActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_ajustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
      pase=1;
    }//GEN-LAST:event_formWindowClosed

    private void Boton_ajustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ajustesActionPerformed


        InformacionUsuario mensajero=new InformacionUsuario();
                mensajero.setVisible(true);

    }//GEN-LAST:event_Boton_ajustesActionPerformed

    private void Boton_evalucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_evalucionesActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Ventana_Principal_Nota_estudiante_desactivo principal= new Ventana_Principal_Nota_estudiante_desactivo();
        principal.setVisible(true);
    }//GEN-LAST:event_Boton_evalucionesActionPerformed

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
            java.util.logging.Logger.getLogger(Listado_de_Aplicaciones_Estudiante_Desactivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listado_de_Aplicaciones_Estudiante_Desactivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listado_de_Aplicaciones_Estudiante_Desactivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listado_de_Aplicaciones_Estudiante_Desactivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listado_de_Aplicaciones_Estudiante_Desactivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_ajustes;
    private javax.swing.JButton Boton_evaluciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelFechaLogin;
    private javax.swing.JLabel label_ImagenLogin;
    private javax.swing.JLabel label_apellidoLogin;
    private javax.swing.JLabel label_cargoLogin;
    private javax.swing.JLabel label_estadoLogin;
    private javax.swing.JLabel label_horaLogin;
    private javax.swing.JLabel label_nombreLogin;
    private javax.swing.JLabel label_userLogin;
    // End of variables declaration//GEN-END:variables

    
    public class Hilo_hora extends Thread
    {@Override
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
            RegistrarAsistenciaDocente.hilo_Hora.sleep(1000);
            } catch (Exception e) {System.err.println("Error al recuperar hora automatica lispa aplicaiones :"+e);}
         
            }
        }
        
    }
}
