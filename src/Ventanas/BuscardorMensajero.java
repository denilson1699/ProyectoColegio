
package Ventanas;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BuscardorMensajero extends javax.swing.JFrame {

public static String dniBuscador, TipoPersonaBuscador;
    public BuscardorMensajero() {
        initComponents();
       // this.setUndecorated(true);// no se muestre max-min-cerrar
        setResizable(false);//no se redimencione
        setLocationRelativeTo(null);// centrado
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelMenuBuscar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Boton_Buscador = new javax.swing.JButton();
        cmb_tipoPersona = new javax.swing.JComboBox<>();
        txtDniBuscador = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        labelMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
        );
        panelMenuBuscarLayout.setVerticalGroup(
            panelMenuBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDniBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMenuBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_tipoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_Buscador))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Cerrar");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        labelMensaje.setForeground(new java.awt.Color(255, 0, 0));
        labelMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(panelMenuBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(panelMenuBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(labelMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Boton_BuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_BuscadorActionPerformed
        // TODO add your handling code here:
        int contador=0; 
        dniBuscador=txtDniBuscador.getText().trim();
        TipoPersonaBuscador=cmb_tipoPersona.getSelectedItem().toString();
        if(dniBuscador.equals(""))
        {
            labelMensaje.setText("Ingrese DNI");
            contador++;
        }//Selecionar Docente Padre/Apoderado Estudiante
        if(TipoPersonaBuscador.equals("Selecionar"))
        {
            labelMensaje.setText("Selecionar un Cargo");
            contador++;
        }        
        
        if(contador==0)
        {   
            if(TipoPersonaBuscador.equals("Docente"))
            {
                InfoDelDocente mensajero=new InfoDelDocente();
                mensajero.setVisible(true);
                
            }
            if(TipoPersonaBuscador.equals("Padre/Apoderado"))
            {
                InfoDelPadre mensajero=new InfoDelPadre();
                mensajero.setVisible(true);
            }
            if(TipoPersonaBuscador.equals("Estudiante"))
            {
                
                try {
                    InfoDelEstudiante mensajero=new InfoDelEstudiante();
                    mensajero.setVisible(true); 
                } catch (IOException ex) {
                    Logger.getLogger(BuscardorMensajero.class.getName()).log(Level.SEVERE, null, ex);
                }
            }


        }
        
    }//GEN-LAST:event_Boton_BuscadorActionPerformed

    private void cmb_tipoPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_tipoPersonaActionPerformed
        // TODO add your handling code here:
        labelMensaje.setText("");
    }//GEN-LAST:event_cmb_tipoPersonaActionPerformed

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
            java.util.logging.Logger.getLogger(BuscardorMensajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscardorMensajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscardorMensajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscardorMensajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscardorMensajero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Buscador;
    private javax.swing.JComboBox<String> cmb_tipoPersona;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelMensaje;
    private javax.swing.JPanel panelMenuBuscar;
    private javax.swing.JTextField txtDniBuscador;
    // End of variables declaration//GEN-END:variables
}
