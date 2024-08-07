
package Ventanas;

public class Ventana_VerRespuestasExamenes extends javax.swing.JFrame {

    public Ventana_VerRespuestasExamenes() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
      
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo_radioBoton = new javax.swing.ButtonGroup();
        rb_examenResp_Libres = new javax.swing.JRadioButton();
        RB_EXAMEN_VF = new javax.swing.JRadioButton();
        RB_EXAMEN_Alternativas = new javax.swing.JRadioButton();
        label_tituloAsistencia_Estudiates = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Grupo_radioBoton.add(rb_examenResp_Libres);
        rb_examenResp_Libres.setText("Respuestas Libres");
        rb_examenResp_Libres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_examenResp_LibresActionPerformed(evt);
            }
        });

        Grupo_radioBoton.add(RB_EXAMEN_VF);
        RB_EXAMEN_VF.setText("Verdadedor/Falso");
        RB_EXAMEN_VF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_EXAMEN_VFActionPerformed(evt);
            }
        });

        Grupo_radioBoton.add(RB_EXAMEN_Alternativas);
        RB_EXAMEN_Alternativas.setText("Alternativas");
        RB_EXAMEN_Alternativas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_EXAMEN_AlternativasActionPerformed(evt);
            }
        });

        label_tituloAsistencia_Estudiates.setFont(new java.awt.Font("Broadway", 1, 18)); // NOI18N
        label_tituloAsistencia_Estudiates.setForeground(new java.awt.Color(102, 102, 0));
        label_tituloAsistencia_Estudiates.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_tituloAsistencia_Estudiates.setText(" Examen /Practica");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(RB_EXAMEN_VF)
                .addGap(18, 18, 18)
                .addComponent(RB_EXAMEN_Alternativas)
                .addGap(18, 18, 18)
                .addComponent(rb_examenResp_Libres)
                .addContainerGap(318, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_tituloAsistencia_Estudiates, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDesktopPane1)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_tituloAsistencia_Estudiates)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RB_EXAMEN_Alternativas)
                    .addComponent(RB_EXAMEN_VF)
                    .addComponent(rb_examenResp_Libres))
                .addGap(21, 21, 21)
                .addComponent(jDesktopPane1)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RB_EXAMEN_VFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_EXAMEN_VFActionPerformed
        examen_Respuestas_VF mensajero= new examen_Respuestas_VF();
        jDesktopPane1.add(mensajero);
        mensajero.setVisible(true);

    }//GEN-LAST:event_RB_EXAMEN_VFActionPerformed

    private void rb_examenResp_LibresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_examenResp_LibresActionPerformed

         examen_Respuesta_RespustaLibre1 mensajero= new examen_Respuesta_RespustaLibre1();
        jDesktopPane1.add(mensajero);
        mensajero.setVisible(true);

    }//GEN-LAST:event_rb_examenResp_LibresActionPerformed

    private void RB_EXAMEN_AlternativasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_EXAMEN_AlternativasActionPerformed
         examen_RespuestasAlternativas mensajero= new examen_RespuestasAlternativas();
        jDesktopPane1.add(mensajero);
        mensajero.setVisible(true);

    }//GEN-LAST:event_RB_EXAMEN_AlternativasActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_VerRespuestasExamenes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo_radioBoton;
    private javax.swing.JRadioButton RB_EXAMEN_Alternativas;
    private javax.swing.JRadioButton RB_EXAMEN_VF;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel label_tituloAsistencia_Estudiates;
    private javax.swing.JRadioButton rb_examenResp_Libres;
    // End of variables declaration//GEN-END:variables
}
