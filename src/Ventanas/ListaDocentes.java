
package Ventanas;
import Clases.Conexion;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

public class ListaDocentes  extends javax.swing.JFrame{
   public static String  dniTablaDocentes, nombreTablaDocentes, apellidoTablaDocentes, FechaActual ,H;
   int pase=0;
    //TABLA DE PLANA DOCENTE ACTUAL
    DefaultTableModel model_Docentes= new DefaultTableModel(){
    // para evitar que la tabla dicentes sea editada
          @Override
          public boolean isCellEditable(int row, int column) {
          if(column==6)
          { 
           return true;
          }else
          {
           return false;
          }
          }
    };
    //TABLA DE TUTORIAS
    DefaultTableModel model_Tutorias= new DefaultTableModel(){
    // para evitar que la tabla dicentes sea editada
          @Override
          public boolean isCellEditable(int row, int column) {
          if(column==6)
          { 
           return true;
          }else
          {
           return false;
          }
          }
    };
    //TABLA DE PLANA DOCENTE ACTUAL
    DefaultTableModel model_RegistroHistorico= new DefaultTableModel(){
    // para evitar que la tabla dicentes sea editada
          @Override
          public boolean isCellEditable(int row, int column) {
          if(column==6)
          { 
           return true;
          }else
          {
           return false;
          }
          }
    };

    public ListaDocentes() {
    initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
    //RECUPERAMOS Y MOSTRAMOS LOS DATOS EN LAS TABLAS
    PlanaDocenteActual();
    DocenteTutorias();
    RegistroHistorico();
    
    
    //EVENTO EN LA TABLA DOCENCIA ACTUAL
    TablaDocentesActual.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e){
    int fila_poin=TablaDocentesActual.rowAtPoint(e.getPoint());
    if(fila_poin>-1)
    {
     dniTablaDocentes=(String)model_Docentes.getValueAt(fila_poin,0);
     nombreTablaDocentes=(String)model_Docentes.getValueAt(fila_poin,1);
     apellidoTablaDocentes=(String)model_Docentes.getValueAt(fila_poin,2);
     // recuperamos metodo para  ostrar informacion de celda selecionada
     int mensaje=JOptionPane.showConfirmDialog(null,"¿Ver información? \n"+nombreTablaDocentes+" "+ apellidoTablaDocentes,null,JOptionPane.OK_CANCEL_OPTION);
    //para la opcion si
     if(mensaje==0){
     InfoDelDocente informacionDocente=new InfoDelDocente();
     informacionDocente.setVisible(true);
     }
    }
    }  
    });
    

    //EVENTO EN LA TABLA TUTORIAS
    TablaTutorias.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e){
    int fila_poin=TablaTutorias.rowAtPoint(e.getPoint());
    if(fila_poin>-1)
    {
     dniTablaDocentes=(String)model_Tutorias.getValueAt(fila_poin,0);
     nombreTablaDocentes=(String)model_Tutorias.getValueAt(fila_poin,1);
     apellidoTablaDocentes=(String)model_Tutorias.getValueAt(fila_poin,2);
     // recuperamos metodo para  ostrar informacion de celda selecionada
     int mensaje=JOptionPane.showConfirmDialog(null,"¿Ver información? \n"+nombreTablaDocentes+" "+ apellidoTablaDocentes,null,JOptionPane.OK_CANCEL_OPTION);
    //para la opcion si
     if(mensaje==0){
     InfoDelDocenteTutorias informacionDocenteTutoria=new InfoDelDocenteTutorias();
     informacionDocenteTutoria.setVisible(true);
     }
    }
    }  
    });
    
    
    
    //EVENTO EN LA TABLA REGISTRO HISTORICO
    TablaRegistroHistorico.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e){
    int fila_poin=TablaRegistroHistorico.rowAtPoint(e.getPoint());
    if(fila_poin>-1)
    {
     dniTablaDocentes=(String)model_RegistroHistorico.getValueAt(fila_poin,0);
     nombreTablaDocentes=(String)model_RegistroHistorico.getValueAt(fila_poin,1);
     apellidoTablaDocentes=(String)model_RegistroHistorico.getValueAt(fila_poin,2);
     // recuperamos metodo para  ostrar informacion de celda selecionada
     int mensaje=JOptionPane.showConfirmDialog(null,"¿Ver información? \n"+nombreTablaDocentes+" "+ apellidoTablaDocentes,null,JOptionPane.OK_CANCEL_OPTION);
    //para la opcion si
     if(mensaje==0){
     InfoDelDocente informacionDocente=new InfoDelDocente();
     informacionDocente.setVisible(true);
     }
    }
    }  
    });
    // recupera la fecha actual
    Calendar calendario = Calendar.getInstance();      
    label_planadocenteActual.setText("Plana Docente "+Integer.toString(calendario.get(Calendar.YEAR)));
   
     FechaActual = Integer.toString(calendario.get(Calendar.DATE)) + "/"
                + Integer.toString(calendario.get(Calendar.MONTH) + 1) + "/"
                + Integer.toString(calendario.get(Calendar.YEAR));
     labelFecha.setText(FechaActual);
     
    // RECUPERAR Y MOSTAR LA HORA AUTOMATICA
       Hilo_hora horaAutomatica = new Hilo_hora();
       horaAutomatica.start();
 
        Calendar calendario2 = Calendar.getInstance();
        String fecha=Integer.toString(calendario2.get(Calendar.YEAR));
        cmb_añoTutoria.addItem("Todos");
        for(int i=Integer.parseInt(fecha);i>=2018;i--){
            cmb_añoTutoria.addItem(Integer.toString(i));
        }
           cmb_añoHistorico.addItem("Todos");
        for(int i=Integer.parseInt(fecha);i>=2018;i--){
            cmb_añoHistorico.addItem(Integer.toString(i));
        }

    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        boton_newDocente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        label_planadocenteActual = new javax.swing.JLabel();
        jScrollPane_tablaDocentes = new javax.swing.JScrollPane();
        TablaDocentesActual = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane_tutorias = new javax.swing.JScrollPane();
        TablaTutorias = new javax.swing.JTable();
        Boton_nuevoTutoria = new javax.swing.JButton();
        cmb_añoTutoria = new javax.swing.JComboBox<>();
        Boton_Filtro_Tutrias = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane_registroHistorico = new javax.swing.JScrollPane();
        TablaRegistroHistorico = new javax.swing.JTable();
        cmb_añoHistorico = new javax.swing.JComboBox<>();
        Boton_Filtro_Historico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        LabelHora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowDeiconified(java.awt.event.WindowEvent evt) {
                formWindowDeiconified(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        boton_newDocente.setText("Registrar Docente");
        boton_newDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton_newDocenteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                boton_newDocenteMouseReleased(evt);
            }
        });
        boton_newDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_newDocenteActionPerformed(evt);
            }
        });

        label_planadocenteActual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_planadocenteActual.setForeground(new java.awt.Color(153, 0, 0));
        label_planadocenteActual.setText("Plana Docente Electiva");

        TablaDocentesActual.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane_tablaDocentes.setViewportView(TablaDocentesActual);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane_tablaDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(label_planadocenteActual)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(label_planadocenteActual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane_tablaDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("                    Plana Docente                     ", jPanel2);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Lista de Tutorias");

        TablaTutorias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane_tutorias.setViewportView(TablaTutorias);

        Boton_nuevoTutoria.setText("Registrar Tutoria");
        Boton_nuevoTutoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Boton_nuevoTutoriaMousePressed(evt);
            }
        });
        Boton_nuevoTutoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_nuevoTutoriaActionPerformed(evt);
            }
        });

        cmb_añoTutoria.setBackground(new java.awt.Color(0, 51, 51));
        cmb_añoTutoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_añoTutoria.setForeground(new java.awt.Color(255, 255, 255));
        cmb_añoTutoria.setBorder(null);

        Boton_Filtro_Tutrias.setText("Buscar");
        Boton_Filtro_Tutrias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Filtro_TutriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane_tutorias, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(62, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Boton_nuevoTutoria)
                        .addGap(250, 250, 250)
                        .addComponent(jLabel5)
                        .addGap(148, 148, 148)
                        .addComponent(cmb_añoTutoria, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Boton_Filtro_Tutrias)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Boton_nuevoTutoria)
                    .addComponent(cmb_añoTutoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_Filtro_Tutrias, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane_tutorias, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("                              Tutorias                              ", jPanel3);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Registro Histórico de Docentes");

        TablaRegistroHistorico.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane_registroHistorico.setViewportView(TablaRegistroHistorico);

        cmb_añoHistorico.setBackground(new java.awt.Color(0, 51, 51));
        cmb_añoHistorico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_añoHistorico.setForeground(new java.awt.Color(255, 255, 255));
        cmb_añoHistorico.setBorder(null);

        Boton_Filtro_Historico.setText("Buscar");
        Boton_Filtro_Historico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Boton_Filtro_HistoricoMousePressed(evt);
            }
        });
        Boton_Filtro_Historico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Filtro_HistoricoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane_registroHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmb_añoHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Boton_Filtro_Historico)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmb_añoHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Boton_Filtro_Historico))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane_registroHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("                    Registro Historico                    ", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("Fecha:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("Hora:");

        labelFecha.setForeground(new java.awt.Color(204, 0, 0));
        labelFecha.setText("Fecha:");

        LabelHora.setForeground(new java.awt.Color(204, 0, 0));
        LabelHora.setText("Fecha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(boton_newDocente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelHora)
                    .addComponent(labelFecha))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(labelFecha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(LabelHora)))
                    .addComponent(boton_newDocente, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_newDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_newDocenteActionPerformed
        // TODO add your handling code here:
        NewDocente nuevodocente= new NewDocente();
        nuevodocente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boton_newDocenteActionPerformed

    private void Boton_nuevoTutoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_nuevoTutoriaActionPerformed
        // TODO add your handling code here:
        NewlDocenteTutorias docenteTutoriaNew= new NewlDocenteTutorias();
        docenteTutoriaNew.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_Boton_nuevoTutoriaActionPerformed

    private void Boton_Filtro_HistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Filtro_HistoricoActionPerformed
        // TODO add your handling code here:
               
      // en texto escrito a consultar en la tabla
     String año=cmb_añoHistorico.getSelectedItem().toString();
     
     
     if(año=="Todos"){
     try
        {
            // ETIQUETAS DE EMCABEZADO DE TABLA
            String[] titulos={"DNI","NOMBRE","APELLIDOS","ESPECIALIDAD","TELÉFONO","ESTADO"};
            model_RegistroHistorico=new DefaultTableModel(null,titulos)
            {// este metodo permite que la tabla NO sea editada
                @Override
                public boolean isCellEditable(int row, int column)
                {
                    if(column==5)
                    {return true;}
                    else{return false;}
                }
            };

            Connection cn= Conexion.Conectar();
                PreparedStatement pst= cn.prepareStatement("select *from tabla_docentes");
                String[] fila= new String[6];
                ResultSet resul=pst.executeQuery();
                // AGREGAR ENCABEZADOS A LA TABLA
                TablaRegistroHistorico = new JTable(model_RegistroHistorico);
                jScrollPane_registroHistorico.setViewportView(TablaRegistroHistorico);

               TablaRegistroHistorico.setRowHeight(18);

                //recuperar valores de BD A LA TABLA
                while(resul.next())
                {
                    fila[0]=resul.getString("Dni_doc");
                    fila[1]=resul.getString("Nombre_doc");
                    fila[2]=resul.getString("Apellidos_doc");
                    fila[3]=resul.getString("Especialidad_doc");
                    fila[4]=resul.getString("Telf_doc");
                    fila[5]=resul.getString("Estado_doc");
                    model_RegistroHistorico.addRow(fila);
                }
                cn.close();
                

        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al filtar todos los docentes\n contacte al Administrador","",JOptionPane.ERROR_MESSAGE);
            System.err.println("error al filtar la todos los docentes: "+e);
        }
     }
     
     else{
        try{
            // ETIQUETAS DE EMCABEZADO DE TABLA
            String[] titulos={"DNI","NOMBRE","APELLIDOS","ESPECIALIDAD","TELÉFONO","ESTADO"};
            model_RegistroHistorico=new DefaultTableModel(null,titulos)
            {// este metodo permite que la tabla NO sea editada
                @Override
                public boolean isCellEditable(int row, int column)
                {
                    if(column==5)
                    {return true;}
                    else{return false;}
                }
            };

             String opcion1="%"+año+"%";
            Connection cn= Conexion.Conectar();
                PreparedStatement pst= cn.prepareStatement("select *from tabla_docentes where FechaRegistro like"+'"'+opcion1+'"');
                String[] fila= new String[6];
                ResultSet resul=pst.executeQuery();
                // AGREGAR ENCABEZADOS A LA TABLA
                TablaRegistroHistorico = new JTable(model_RegistroHistorico);
                jScrollPane_registroHistorico.setViewportView(TablaRegistroHistorico);

               TablaRegistroHistorico.setRowHeight(18);

                //recuperar valores de BD A LA TABLA
                while(resul.next())
                {
                    fila[0]=resul.getString("Dni_doc");
                    fila[1]=resul.getString("Nombre_doc");
                    fila[2]=resul.getString("Apellidos_doc");
                    fila[3]=resul.getString("Especialidad_doc");
                    fila[4]=resul.getString("Telf_doc");
                    fila[5]=resul.getString("Estado_doc");
                    model_RegistroHistorico.addRow(fila);
                }
                cn.close();
                

        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al filtar "+cmb_añoHistorico.getSelectedItem()+" contacte al Administrador","",JOptionPane.ERROR_MESSAGE);
            System.err.println("error al filtar 2019 docentes: "+e);
        }
     }
     
    }//GEN-LAST:event_Boton_Filtro_HistoricoActionPerformed

    private void Boton_Filtro_TutriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Filtro_TutriasActionPerformed
        // TODO add your handling code here:

        // en texto escrito a consultar en la tabla
        String año=cmb_añoTutoria.getSelectedItem().toString();

        if(año=="Todos")
        {
            try {
                String FechaGuardada="", grado="", nivel="", estado="", dni="";
                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1= cn1.prepareStatement("select Dni_doc,fecha_Tutoria,Grado,"
                    + "Nivel,Estado from tabla_tutorias ");
                ResultSet resul1=pst1.executeQuery();
                while(resul1.next()){
                    dni=resul1.getString("Dni_doc");
                    FechaGuardada=resul1.getString("fecha_Tutoria");
                    grado=resul1.getString("Grado");
                    nivel=resul1.getString("Nivel");
                    estado=resul1.getString("Estado");

                    try{// en texto escrito a consultar en la tabla
                        String[] titulos={"DNI","NOMBRE","APELLIDOS","ESPECIALIDAD","GRADO","NIVEL","ESTADO","FECHA"};
                        model_Tutorias=new DefaultTableModel(null,titulos);
                        TablaTutorias = new JTable(model_Tutorias);
                        jScrollPane_tutorias.setViewportView(TablaTutorias);
                        Connection cn2= Conexion.Conectar();
                        PreparedStatement pst2= cn2.prepareStatement("select Dni_doc,Nombre_doc,Apellidos_doc,Especialidad_doc from tabla_docentes where Dni_doc ='"+dni+"'");
                        ResultSet resul2=pst2.executeQuery();
                        //AGREGAR LOS VALORES DE LA BD A LA TABLA
                        while (resul2.next()) {
                            Object[] fila= new Object[8];
                            for(int i=0;i<4;i++){
                                fila[i]=resul2.getObject(i+1);
                                fila[4]=grado;
                                fila[5]=nivel;
                                fila[6]=estado;
                                fila[7]=FechaGuardada;
                        }
                            
                         System.out.println(FechaGuardada+"-"+resul2.getString("Nombre_doc"));
                        model_Tutorias.addRow(fila);
                        }
                       cn2.close();
                       
                        }catch (Exception e ){System.err.println("error en  rellenar tabla de Tutoria :"+e); }
                }
                cn1.close();
                }catch (Exception ex){ System.err.println("error en  recuperar codigo de producto :"+ex); }
        }

        
    else
        {       try {
                String FechaGuardada="", grado="", nivel="", estado="", dni="";
                String opcion2="%"+cmb_añoTutoria.getSelectedItem()+"%";
                Connection cn3= Conexion.Conectar();
                PreparedStatement pst3= cn3.prepareStatement("select Dni_doc,fecha_Tutoria,Grado,"
                    + "Nivel,Estado from tabla_tutorias where fecha_Tutoria like"+'"'+opcion2+'"');
                ResultSet resul3=pst3.executeQuery();
                while(resul3.next()){
                    dni=resul3.getString("Dni_doc");
                    FechaGuardada=resul3.getString("fecha_Tutoria");
                    grado=resul3.getString("Grado");
                    nivel=resul3.getString("Nivel");
                    estado=resul3.getString("Estado");
                    try{
                       String[] titulos={"DNI","NOMBRE","APELLIDOS","ESPECIALIDAD","GRADO","NIVEL","ESTADO","FECHA"};
                       model_Tutorias=new DefaultTableModel(null,titulos);
                       TablaTutorias = new JTable(model_Tutorias);
                       jScrollPane_tutorias.setViewportView(TablaTutorias);
                       Connection cn4= Conexion.Conectar();
                       PreparedStatement pst4= cn4.prepareStatement("select Dni_doc,Nombre_doc,Apellidos_doc,Especialidad_doc from tabla_docentes where Dni_doc ='"+dni+"'");
                       ResultSet resul4=pst4.executeQuery();
                       //AGREGAR LOS VALORES DE LA BD A LA TABLA
                      while (resul4.next()) {
                            Object[] fila= new Object[8];
                            for(int i=0;i<4;i++){
                                fila[i]=resul4.getObject(i+1);
                                fila[4]=grado;
                                fila[5]=nivel;
                                fila[6]=estado;
                                fila[7]=FechaGuardada;
                                }
                         System.out.println(FechaGuardada+"-"+resul4.getString("Nombre_doc"));
                                model_Tutorias.addRow(fila);
                      }
                      cn4.close();
                    }catch (Exception e ){System.err.println("error en  rellenar tabla de Tutoria :"+e); }

                }
                cn3.close();
            }catch (Exception ex){ System.err.println("error en  recuperar codigo de producto :"+ex); }
        }

        


    }//GEN-LAST:event_Boton_Filtro_TutriasActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        pase=1;
        
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void boton_newDocenteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_newDocenteMousePressed
        // TODO add your handling code here:
        boton_newDocente.setBackground(new Color(204,0,51));
        boton_newDocente.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_boton_newDocenteMousePressed

    private void boton_newDocenteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_newDocenteMouseReleased

        // TODO add your handling code here:
    }//GEN-LAST:event_boton_newDocenteMouseReleased

    private void Boton_nuevoTutoriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_nuevoTutoriaMousePressed
        // TODO add your handling code here:
       Boton_nuevoTutoria.setBackground(new Color(204,0,51));
       Boton_nuevoTutoria.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Boton_nuevoTutoriaMousePressed

    private void Boton_Filtro_HistoricoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_Filtro_HistoricoMousePressed
       Boton_Filtro_Historico.setBackground(new Color(204,0,51));
       Boton_Filtro_Historico.setForeground(new Color(255,255,255));
           // TODO add your handling code here:
    }//GEN-LAST:event_Boton_Filtro_HistoricoMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void formWindowDeiconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeiconified
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowDeiconified

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formMouseMoved
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaDocentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Filtro_Historico;
    private javax.swing.JButton Boton_Filtro_Tutrias;
    private javax.swing.JButton Boton_nuevoTutoria;
    private javax.swing.JLabel LabelHora;
    private javax.swing.JTable TablaDocentesActual;
    private javax.swing.JTable TablaRegistroHistorico;
    private javax.swing.JTable TablaTutorias;
    private javax.swing.JButton boton_newDocente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmb_añoHistorico;
    private javax.swing.JComboBox<String> cmb_añoTutoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane_registroHistorico;
    private javax.swing.JScrollPane jScrollPane_tablaDocentes;
    private javax.swing.JScrollPane jScrollPane_tutorias;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel label_planadocenteActual;
    // End of variables declaration//GEN-END:variables

public void PlanaDocenteActual(){
       try {
            Connection cn1= Conexion.Conectar();
            PreparedStatement pst1= cn1.prepareStatement("select Dni_doc , Nombre_doc, Apellidos_doc,"
                    + " Especialidad_doc,Telf_doc,Estado_doc from tabla_docentes where Estado_doc ='activo'");
            ResultSet listaDoc=pst1.executeQuery();
            
            // AGREGAR ENCABEZADOS A LA TABLA
            TablaDocentesActual = new JTable(model_Docentes);
            jScrollPane_tablaDocentes.setViewportView(TablaDocentesActual);
            model_Docentes.addColumn("DNI");
            model_Docentes.addColumn("NOMBRE");
            model_Docentes.addColumn("APELLIDOS");
            model_Docentes.addColumn("ESPECIALIDAD");
            model_Docentes.addColumn("TELEFONO");
            model_Docentes.addColumn("ESTADO");
            
             TablaDocentesActual.setRowHeight(18);
 
            //AGREGAR LOS VALORES DE LA BD A LA TABLA
            while (listaDoc.next()) {
                Object[] fila= new Object[6];
                for(int i=0;i<6;i++){
                    fila[i]=listaDoc.getObject(i+1);
                }
                model_Docentes.addRow(fila);
            }
            cn1.close();
        }catch (Exception e ) 
        {System.err.println("error en  rellenar tabla :"+e); }
     

}


public void DocenteTutorias(){
     String FechaGuardada="", grado="", nivel="", estado="", dni="";
            TablaTutorias = new JTable(model_Tutorias);
            jScrollPane_tutorias.setViewportView(TablaTutorias);
            model_Tutorias.addColumn("DNI");
            model_Tutorias.addColumn("NOMBRE");
            model_Tutorias.addColumn("APELLIDOS");
            model_Tutorias.addColumn("ESPECIALIDAD");
            model_Tutorias.addColumn("GRADO");
            model_Tutorias.addColumn("NIVEL");
            model_Tutorias.addColumn("ESTADO ");
            model_Tutorias.addColumn("FECHA");
            
        try { 
            
         Connection cn1= Conexion.Conectar();
         PreparedStatement pst1= cn1.prepareStatement("select Dni_doc,fecha_Tutoria,Grado,"
                 + "Nivel,Estado from tabla_tutorias ");
         ResultSet resul1=pst1.executeQuery(); 
         while(resul1.next()){
            dni=resul1.getString("Dni_doc");
           FechaGuardada=resul1.getString("fecha_Tutoria");
           grado=resul1.getString("Grado");
           nivel=resul1.getString("Nivel");
           estado=resul1.getString("Estado");
          
        try{// en texto escrito a consultar en la tabla
         

            Connection cn2= Conexion.Conectar();
            PreparedStatement pst2= cn2.prepareStatement("select Dni_doc,Nombre_doc,Apellidos_doc,Especialidad_doc from tabla_docentes where Dni_doc ='"+dni+"'");
            ResultSet resul2=pst2.executeQuery();
 
            //AGREGAR LOS VALORES DE LA BD A LA TABLA
            while (resul2.next()) {
                Object[] fila= new Object[8];
                for(int i=0;i<4;i++){
                    fila[i]=resul2.getObject(i+1);
                    fila[4]=grado;
                    fila[5]=nivel;
                    fila[6]=estado;
                    fila[7]=FechaGuardada;
                }
                model_Tutorias.addRow(fila);
            }
            
        }catch (Exception e ) 
            
        {System.err.println("error en  rellenar tabla de Tutoria :"+e); }
        
         }
         cn1.close();
         
        }catch (Exception ex){ System.err.println("error en  recuperar codigo de producto :"+ex); }
      
}
    


public void RegistroHistorico(){
       try {
            Connection cn1= Conexion.Conectar();
            PreparedStatement pst1= cn1.prepareStatement("select Dni_doc , Nombre_doc, Apellidos_doc,"
                    + " Especialidad_doc,Telf_doc,Estado_doc from tabla_docentes ");
            ResultSet listaDoc=pst1.executeQuery();
            
            // AGREGAR ENCABEZADOS A LA TABLA
            TablaRegistroHistorico = new JTable(model_RegistroHistorico);
            jScrollPane_registroHistorico.setViewportView(TablaRegistroHistorico);
            model_RegistroHistorico.addColumn("DNI");
            model_RegistroHistorico.addColumn("NOMBRE");
            model_RegistroHistorico.addColumn("APELLIDOS");
            model_RegistroHistorico.addColumn("ESPECIALIDAD");
            model_RegistroHistorico.addColumn("TELEFONO");
            model_RegistroHistorico.addColumn("ESTADO");
            
             TablaRegistroHistorico.setRowHeight(18);
 
            //AGREGAR LOS VALORES DE LA BD A LA TABLA
            while (listaDoc.next()) {
                Object[] fila= new Object[6];
                for(int i=0;i<6;i++){
                    fila[i]=listaDoc.getObject(i+1);
                }
                model_RegistroHistorico.addRow(fila);
            }
            cn1.close();
        }catch (Exception e ) 
        {System.err.println("error en  rellenar tabla :"+e); }
      }
 
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
            LabelHora.setText(H_Ingreso+" AM");
            }
         else{
            LabelHora.setText(H_Ingreso+" PM");
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
