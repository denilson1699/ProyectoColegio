
package Ventanas;

import Clases.Conexion;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Calendar;
import javax.swing.JOptionPane;


public class RegistrarAsistenciaDocente extends javax.swing.JFrame {

int pase=0;
    public RegistrarAsistenciaDocente() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        hilo_Hora horaAutomatica= new hilo_Hora();
        horaAutomatica.start();
        
        Calendar Calendario=Calendar.getInstance();
        

            
        cmb_curso.setEnabled(false);
        cmb_grado.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_estado = new javax.swing.JTextField();
        txt_dni = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        labelFechaLogin = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        label_horaLogin = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Boton_registarASistencia = new javax.swing.JButton();
        cmb_Nivel = new javax.swing.JComboBox<>();
        cmb_grado = new javax.swing.JComboBox<>();
        cmb_curso = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        label_titulo.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(102, 102, 0));
        label_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo.setText("Registrar Asistencia");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nombre     :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Apellidos  :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Hora     :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Estado:");

        txt_nombre.setBackground(new java.awt.Color(240, 240, 240));
        txt_nombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(0, 102, 102));
        txt_nombre.setBorder(null);

        txt_apellidos.setBackground(new java.awt.Color(240, 240, 240));
        txt_apellidos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_apellidos.setForeground(new java.awt.Color(0, 102, 102));
        txt_apellidos.setBorder(null);

        txt_estado.setEditable(false);
        txt_estado.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_estado.setForeground(new java.awt.Color(0, 102, 102));
        txt_estado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_estado.setText("Activo");
        txt_estado.setBorder(null);

        txt_dni.setBackground(new java.awt.Color(240, 240, 240));
        txt_dni.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_dni.setForeground(new java.awt.Color(0, 102, 102));
        txt_dni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_dni.setBorder(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Doc Ident  :");

        labelFechaLogin.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelFechaLogin.setForeground(new java.awt.Color(153, 0, 0));
        labelFechaLogin.setText("jLabel17");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Fecha   : ");

        label_horaLogin.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        label_horaLogin.setForeground(new java.awt.Color(153, 0, 0));
        label_horaLogin.setText("jLabel17");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconUser.png"))); // NOI18N

        Boton_registarASistencia.setBackground(new java.awt.Color(0, 102, 153));
        Boton_registarASistencia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Boton_registarASistencia.setForeground(new java.awt.Color(255, 255, 255));
        Boton_registarASistencia.setText("Registrar Asistencia");
        Boton_registarASistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_registarASistenciaActionPerformed(evt);
            }
        });

        cmb_Nivel.setBackground(new java.awt.Color(51, 51, 255));
        cmb_Nivel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmb_Nivel.setForeground(new java.awt.Color(255, 255, 255));
        cmb_Nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-NIVEL-", "Inicial", "Primaria", "Secundaria" }));
        cmb_Nivel.setBorder(null);
        cmb_Nivel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        cmb_grado.setBackground(new java.awt.Color(51, 51, 255));
        cmb_grado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmb_grado.setForeground(new java.awt.Color(255, 255, 255));
        cmb_grado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-GRADO-" }));
        cmb_grado.setBorder(null);

        cmb_curso.setBackground(new java.awt.Color(51, 51, 255));
        cmb_curso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmb_curso.setForeground(new java.awt.Color(255, 255, 255));
        cmb_curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-CURSO-" }));
        cmb_curso.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(13, 13, 13)
                        .addComponent(labelFechaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(label_horaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmb_Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_grado, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_curso, 0, 147, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Boton_registarASistencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                .addGap(72, 72, 72))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton_registarASistencia, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_horaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFechaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(18, Short.MAX_VALUE)
                    .addComponent(label_titulo)
                    .addContainerGap(244, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    pase=1;
    }//GEN-LAST:event_formWindowClosed

    private void Boton_registarASistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_registarASistenciaActionPerformed
        // TODO add your handling code here:
        String Dni_doc,Nombre_doc,Apellidos_doc,Fecha,Hora,Estado, Nivel,Grado,Curso;
        int contado =0;
        Dni_doc=txt_dni.getText().trim();
        Nombre_doc=txt_nombre.getText().trim();
        Apellidos_doc=txt_apellidos.getText().trim();
        Fecha=labelFechaLogin.getText().trim();
        Hora=label_horaLogin.getText().trim();
        Estado=txt_estado.getText().trim();
        Nivel=cmb_Nivel.getSelectedItem().toString();
        Grado=cmb_grado.getSelectedItem().toString();
        Curso=cmb_curso.getSelectedItem().toString();
        
        if(Nivel.equals("-NIVEL-"))
        {
            JOptionPane.showMessageDialog(null,"Selecione el nivel");
            contado++;
        }
        if(Grado.equals("-GRADO-"))
        {
            JOptionPane.showMessageDialog(null,"Selecione el Grado");
            contado++;
        }
        if(Curso.equals("-CURSO-"))
        {
            JOptionPane.showMessageDialog(null,"Selecione el Curso");
            contado++;
        }
        
        if(contado==0){
        int mensaje=JOptionPane.showConfirmDialog(null,"Guardar Asistencia hora/fecha",null,JOptionPane.YES_NO_OPTION);
        if(mensaje==JOptionPane.YES_OPTION)
        {
        try {
            Connection cn= Conexion.Conectar();
            PreparedStatement pst=cn.prepareStatement("insert into tabla_asistencia_docentes values (?,?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, 0);
            pst.setString(2, Dni_doc);
            pst.setString(3,Nombre_doc);
            pst.setString(4,Apellidos_doc);
            pst.setString(5,Nivel);
            pst.setString(6,Grado);
            pst.setString(7,Curso);
            pst.setString(8,Fecha);
            pst.setString(9,Hora);
            pst.setString(10,Estado);
            pst.executeUpdate();
            cn.close();
            JOptionPane.showMessageDialog(null,"Asistencia Registrada Exitosamente");
            Boton_registarASistencia.setEnabled(false);
        } catch (Exception e) {  
            JOptionPane.showMessageDialog(null,"Error al guardar asistencia contacte al administrador",null,JOptionPane.WARNING_MESSAGE); 
            System.err.println("erro al registrar asistencia del docente:"+e); }
        }
        else
        {
           JOptionPane.showMessageDialog(null,"Cancelado...",null,JOptionPane.WARNING_MESSAGE); 
            
        }
     }
        
    }//GEN-LAST:event_Boton_registarASistenciaActionPerformed

    private void cmb_NivelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_NivelItemStateChanged
            if(evt.getSource()==cmb_Nivel){
                
            cmb_grado.setEnabled(true);
            String seleccion=cmb_Nivel.getSelectedItem().toString();
            if(seleccion.equalsIgnoreCase("-NIVEL-")){
                cmb_grado.removeAllItems();
                cmb_grado.addItem("-GRADO-");
            cmb_grado.setEnabled(false);
            }else 
            if(seleccion.equalsIgnoreCase("Primaria")){
                cmb_grado.removeAllItems();
                cmb_grado.addItem("-GRADO-");
                cmb_grado.addItem("1er Primaria");
                cmb_grado.addItem("2do Primaria");
                cmb_grado.addItem("3er Primaria");
                cmb_grado.addItem("4to Primaria");
                cmb_grado.addItem("5to Primaria");
                cmb_grado.addItem("6to Primaria");
                
                cmb_curso.removeAllItems();
                cmb_curso.addItem("-CURSO-");
                cmb_curso.addItem("Personal Social");
                cmb_curso.addItem("Educación Física");  
                cmb_curso.addItem("Arte y cultura"); 
                cmb_curso.addItem("Comunicación");  
                cmb_curso.addItem("Matemática");
                cmb_curso.addItem("Ciencia y Tecnología"); 
                cmb_curso.addItem("Educacíon Religiosa");
            }else
            if(seleccion.equalsIgnoreCase("Secundaria")){
                cmb_grado.removeAllItems();
                cmb_grado.addItem("-GRADO-");
                cmb_grado.addItem("1er Secundaria");
                cmb_grado.addItem("2do Secundaria");
                cmb_grado.addItem("3er Secundaria");
                cmb_grado.addItem("4to Secundaria");
                cmb_grado.addItem("5to Secundaria");
                
                cmb_curso.removeAllItems();
                cmb_curso.addItem("-CURSO-");
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
            }else
            if(seleccion.equalsIgnoreCase("Inicial")){
                cmb_grado.removeAllItems();
                cmb_grado.addItem("-GRADO-");
                cmb_grado.addItem("4 años");
                cmb_grado.addItem("5 años");
                
                cmb_curso.removeAllItems(); 
                cmb_curso.addItem("-CURSO-");
                cmb_curso.addItem("curso 1");
                cmb_curso.addItem("curso 2");  
                cmb_curso.addItem("curso 3"); 
            }
        }



    }//GEN-LAST:event_cmb_NivelItemStateChanged

    private void cmb_NivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_NivelActionPerformed
        
        cmb_curso.setEnabled(true);
        cmb_grado.setEnabled(true);
    }//GEN-LAST:event_cmb_NivelActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarAsistenciaDocente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_registarASistencia;
    private javax.swing.JComboBox<String> cmb_Nivel;
    private javax.swing.JComboBox<String> cmb_curso;
    private javax.swing.JComboBox<String> cmb_grado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelFechaLogin;
    private javax.swing.JLabel label_horaLogin;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables

public class hilo_Hora extends Thread
{@Override
    public void run()
    {
        while (pase==0)
        { Calendar Calendario=Calendar.getInstance();
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
            hilo_Hora.sleep(1000);
            } catch (Exception e) {System.err.println("Error al recuperar hora automatixa asistencia docente:"+e);}
        }
    }
}

}
