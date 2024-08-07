
package Ventanas;
import Clases.Conexion;
import static Ventanas.ListaDocentes.FechaActual;
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

public class ListaPadres  extends javax.swing.JFrame{
   public static String  dniTablaPadres, nombreTablaPadres, apellidoTablaPadres, FechaActual ,cargoComite;
    //TABLA DE PLANA DOCENTE ACTUAL
    DefaultTableModel model_Padres= new DefaultTableModel(){
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
    DefaultTableModel model_Comite= new DefaultTableModel(){
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
   

    public ListaPadres() {
    initComponents();
        setResizable(true);
        this.setLocationRelativeTo(null);
    //RECUPERAMOS Y MOSTRAMOS LOS DATOS EN LAS TABLAS
    
    DocenteComite();
    RegistroHistorico();
    

    //EVENTO EN LA TABLA TUTORIAS
    TablaRegistroHistorico.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e){
    int fila_poin=TablaRegistroHistorico.rowAtPoint(e.getPoint());
    if(fila_poin>-1)
    {
     dniTablaPadres=(String)model_Padres.getValueAt(fila_poin,0);
     nombreTablaPadres=(String)model_Padres.getValueAt(fila_poin,1);
     apellidoTablaPadres=(String)model_Padres.getValueAt(fila_poin,2);
     cargoComite="Padre sin Cargo";
     // recuperamos metodo para  ostrar informacion de celda selecionada
     int mensaje=JOptionPane.showConfirmDialog(null,"Ver información \n"+nombreTablaPadres+" "+ apellidoTablaPadres,null,JOptionPane.OK_CANCEL_OPTION);
    //para la opcion si
     if(mensaje==0){
     InfoDelPadre_Cargo informacionPadre=new InfoDelPadre_Cargo();
     informacionPadre.setVisible(true);
     }
    }
    }  
    });
    
    //EVENTO EN LA TABLA REGISTRO HISTORICO
    TablaComite.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e){
    int fila_poin=TablaComite.rowAtPoint(e.getPoint());
    if(fila_poin>-1)
    {
     dniTablaPadres=(String)model_Comite.getValueAt(fila_poin,0);
     nombreTablaPadres=(String)model_Comite.getValueAt(fila_poin,1);
     apellidoTablaPadres=(String)model_Comite.getValueAt(fila_poin,2);
     cargoComite=(String)model_Comite.getValueAt(fila_poin,4);
     // recuperamos metodo para  ostrar informacion de celda selecionada
     int mensaje=JOptionPane.showConfirmDialog(null,"Ver información \n"+nombreTablaPadres+" "+ apellidoTablaPadres,null,JOptionPane.OK_CANCEL_OPTION);
    //para la opcion si
     if(mensaje==0){
     InfoDelPadre_Cargo informacionPadre=new InfoDelPadre_Cargo();
     informacionPadre.setVisible(true);
     }
    }
    }  
    });
    
     
    // RECUPERAR Y MOSTAR LA HORA AUTOMATICA
       Hilo_hora horaAutomatica = new Hilo_hora();
       horaAutomatica.start();
 
   
    //AGREGAR ITEM A LOS JCOMBOBOX
    Calendar calendario = Calendar.getInstance();      
    String addAño= Integer.toString(calendario.get(Calendar.YEAR));
    int addAñoInt= Integer.parseInt(addAño);
        cmb_comite.addItem("Todos");
    for(int i=2018;i<=addAñoInt;i++){
        cmb_comite.addItem(Integer.toString(i));
    } 
    
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        boton_newPadre = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        label_Historico = new javax.swing.JLabel();
        jScrollPane_registroHistorico = new javax.swing.JScrollPane();
        TablaRegistroHistorico = new javax.swing.JTable();
        cmb_añoHistorico = new javax.swing.JComboBox<>();
        Boton_Filtro_Historico = new javax.swing.JButton();
        jcmb_tipoFiltro = new javax.swing.JComboBox<>();
        txt_filtroCodigo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane_comite = new javax.swing.JScrollPane();
        TablaComite = new javax.swing.JTable();
        Boton_nuevoCargo = new javax.swing.JButton();
        cmb_comite = new javax.swing.JComboBox<>();
        Boton_Filtro_Comite = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        LabelHora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        boton_newPadre.setText("Registrar Padre");
        boton_newPadre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton_newPadreMousePressed(evt);
            }
        });
        boton_newPadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_newPadreActionPerformed(evt);
            }
        });

        label_Historico.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_Historico.setForeground(new java.awt.Color(153, 0, 0));
        label_Historico.setText("Registro Histórico de Padres");

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

        cmb_añoHistorico.setBackground(new java.awt.Color(102, 102, 0));
        cmb_añoHistorico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_añoHistorico.setForeground(new java.awt.Color(255, 255, 255));
        cmb_añoHistorico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "2020", "2019" }));
        cmb_añoHistorico.setBorder(null);

        Boton_Filtro_Historico.setText("Buscar");
        Boton_Filtro_Historico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Filtro_HistoricoActionPerformed(evt);
            }
        });

        jcmb_tipoFiltro.setBackground(new java.awt.Color(0, 51, 51));
        jcmb_tipoFiltro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcmb_tipoFiltro.setForeground(new java.awt.Color(255, 255, 255));
        jcmb_tipoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Nombre", "Apellidos" }));
        jcmb_tipoFiltro.setBorder(null);
        jcmb_tipoFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcmb_tipoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_tipoFiltroActionPerformed(evt);
            }
        });

        txt_filtroCodigo.setBackground(new java.awt.Color(255, 255, 204));
        txt_filtroCodigo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_filtroCodigo.setForeground(new java.awt.Color(0, 102, 102));
        txt_filtroCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_filtroCodigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_filtroCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtroCodigoActionPerformed(evt);
            }
        });
        txt_filtroCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroCodigoKeyReleased(evt);
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
                        .addGap(18, 18, 18)
                        .addComponent(jcmb_tipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_filtroCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(label_Historico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmb_añoHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Boton_Filtro_Historico)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmb_añoHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Boton_Filtro_Historico))
                    .addComponent(txt_filtroCodigo)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_Historico)
                        .addComponent(jcmb_tipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane_registroHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        jTabbedPane5.addTab("Registro Historico", jPanel4);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Comite De Padres");

        TablaComite.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane_comite.setViewportView(TablaComite);

        Boton_nuevoCargo.setText("Registrar Cargo");
        Boton_nuevoCargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Boton_nuevoCargoMousePressed(evt);
            }
        });
        Boton_nuevoCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_nuevoCargoActionPerformed(evt);
            }
        });

        cmb_comite.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_comite.setForeground(new java.awt.Color(102, 102, 0));
        cmb_comite.setBorder(null);

        Boton_Filtro_Comite.setText("Buscar");
        Boton_Filtro_Comite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Filtro_ComiteActionPerformed(evt);
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
                        .addComponent(jScrollPane_comite, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(62, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Boton_nuevoCargo)
                        .addGap(250, 250, 250)
                        .addComponent(jLabel5)
                        .addGap(148, 148, 148)
                        .addComponent(cmb_comite, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Boton_Filtro_Comite)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Boton_nuevoCargo)
                    .addComponent(cmb_comite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_Filtro_Comite, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane_comite, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Comite y Cargos", jPanel3);

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
                .addGap(57, 57, 57)
                .addComponent(boton_newPadre)
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
                    .addComponent(boton_newPadre, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_newPadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_newPadreActionPerformed
        // TODO add your handling code here:
        NewPadre nuevopadre= new NewPadre();
        nuevopadre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boton_newPadreActionPerformed

    private void Boton_Filtro_HistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Filtro_HistoricoActionPerformed
        // TODO add your handling code here:

        // en texto escrito a consultar en la tabla
        String año=cmb_añoHistorico.getSelectedItem().toString();

        if(año=="Todos"){
            try
            {
                // ETIQUETAS DE EMCABEZADO DE TABLA
                String[] titulos={"DNI","NOMBRE","APELLIDOS","DIRRECCIÓN","TELÉFONO","CORREO"};
                model_Padres=new DefaultTableModel(null,titulos)
                {// este metodo permite que la tabla NO sea editada
                    @Override
                    public boolean isCellEditable(int row, int column)
                    {
                        if(column==6)
                        {return true;}
                        else{return false;}
                    }
                };
                
                Connection cn= Conexion.Conectar();
                PreparedStatement pst= cn.prepareStatement("select *from tabla_padres");
                String[] fila= new String[6];
                ResultSet resul=pst.executeQuery();
                // AGREGAR ENCABEZADOS A LA TABLA
                TablaRegistroHistorico = new JTable(model_Padres);
                jScrollPane_registroHistorico.setViewportView(TablaRegistroHistorico);

                TablaRegistroHistorico.setRowHeight(18);

                //recuperar valores de BD A LA TABLA
                while(resul.next())
                {
                    fila[0]=resul.getString("Dni_pad");
                    fila[1]=resul.getString("Nombre_pad");
                    fila[2]=resul.getString("Apellidos_pad");
                    fila[3]=resul.getString("Direccion_pad");
                    fila[4]=resul.getString("Telf_pad");
                    fila[5]=resul.getString("Correo_pad");
                    model_Padres.addRow(fila);
                }
                cn.close();

            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error al filtar datos de  padres\n contacte al Administrador","",JOptionPane.ERROR_MESSAGE);
                System.err.println("error al filtar la todos los padres: "+e);
            }
        }

        if(año=="2019"){
            try
            {
                // ETIQUETAS DE EMCABEZADO DE TABLA
                String[] titulos={"DNI","NOMBRE","APELLIDOS","DIRRECCIÓN","TELÉFONO","CORREO"};
                model_Padres=new DefaultTableModel(null,titulos)
                {// este metodo permite que la tabla NO sea editada
                    @Override
                    public boolean isCellEditable(int row, int column)
                    {
                        if(column==6)
                        {return true;}
                        else{return false;}
                    }
                };

                String opcion1="%"+año+"%";
                Connection cn= Conexion.Conectar();
                PreparedStatement pst= cn.prepareStatement("select *from tabla_padres where FechaRegistro like"+'"'+opcion1+'"');
                String[] fila= new String[6];
                ResultSet resul=pst.executeQuery();
                // AGREGAR ENCABEZADOS A LA TABLA
                TablaRegistroHistorico = new JTable(model_Padres);
                jScrollPane_registroHistorico.setViewportView(TablaRegistroHistorico);

                TablaRegistroHistorico.setRowHeight(18);

                //recuperar valores de BD A LA TABLA
                while(resul.next())
                {
                    fila[0]=resul.getString("Dni_pad");
                    fila[1]=resul.getString("Nombre_pad");
                    fila[2]=resul.getString("Apellidos_pad");
                    fila[3]=resul.getString("Direccion_pad");
                    fila[4]=resul.getString("Telf_pad");
                    fila[5]=resul.getString("Correo_pad");
                    model_Padres.addRow(fila);
                }
                cn.close();

            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error al filtar datos de  padres\n contacte al Administrador","",JOptionPane.ERROR_MESSAGE);
                System.err.println("error al filtar la todos los padres: "+e);
            }
        }

        if(año=="2020"){
            try
            {
                // ETIQUETAS DE EMCABEZADO DE TABLA
                String[] titulos={"DNI","NOMBRE","APELLIDOS","DIRRECCIÓN","TELÉFONO","CORREO"};
                model_Padres=new DefaultTableModel(null,titulos)
                {// este metodo permite que la tabla NO sea editada
                    @Override
                    public boolean isCellEditable(int row, int column)
                    {
                        if(column==5)
                        {return true;}
                        else{return false;}
                    }
                };

                String opcion2="%"+año+"%";
                Connection cn= Conexion.Conectar();
                PreparedStatement pst= cn.prepareStatement("select *from tabla_padres where FechaRegistro like"+'"'+opcion2+'"');
                String[] fila= new String[6];
                ResultSet resul=pst.executeQuery();
                // AGREGAR ENCABEZADOS A LA TABLA
                TablaRegistroHistorico = new JTable(model_Padres);
                jScrollPane_registroHistorico.setViewportView(TablaRegistroHistorico);

                TablaRegistroHistorico.setRowHeight(18);

                //recuperar valores de BD A LA TABLA
                while(resul.next())
                {
                    fila[0]=resul.getString("Dni_pad");
                    fila[1]=resul.getString("Nombre_pad");
                    fila[2]=resul.getString("Apellidos_pad");
                    fila[3]=resul.getString("Direccion_pad");
                    fila[4]=resul.getString("Telf_pad");
                    fila[5]=resul.getString("Correo_pad");
                    model_Padres.addRow(fila);
                }
                cn.close();

            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error al filtar datos de  padres\n contacte al Administrador","",JOptionPane.ERROR_MESSAGE);
                System.err.println("error al filtar la todos los padres: "+e);
            }
        }

    }//GEN-LAST:event_Boton_Filtro_HistoricoActionPerformed

    private void Boton_Filtro_ComiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Filtro_ComiteActionPerformed
      // en texto escrito a consultar en la tabla
        String año=cmb_comite.getSelectedItem().toString();

        if(año=="Todos"){
            try
            {
                // ETIQUETAS DE EMCABEZADO DE TABLA
                String[] titulos={"DNI","NOMBRE","APELLIDOS","CARGO","FECHA"};
                model_Comite=new DefaultTableModel(null,titulos)
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
                PreparedStatement pst= cn.prepareStatement("select *from tabla_cargospadres");
                String[] fila= new String[5];
                ResultSet resul=pst.executeQuery();
                // AGREGAR ENCABEZADOS A LA TABLA
                TablaComite = new JTable(model_Comite);
                jScrollPane_comite.setViewportView(TablaComite);

                TablaComite.setRowHeight(18);

                //recuperar valores de BD A LA TABLA
                while(resul.next())
                {
                    fila[0]=resul.getString("Dni_pad");
                    fila[1]=resul.getString("Nombre_pad");
                    fila[2]=resul.getString("Apellido_pad");
                    fila[3]=resul.getString("Cargo");
                    fila[4]=resul.getString("Fecha");
                    model_Comite.addRow(fila);
                }
                cn.close();

            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error al filtar datos de comite padres\n contacte al Administrador","",JOptionPane.ERROR_MESSAGE);
                System.err.println("error al filtar la todos los padres: "+e);
            }
        }else{

             // en texto escrito a consultar en la tabla
        String añoSeleccionado="%"+cmb_comite.getSelectedItem().toString()+"%";

            try
            {
                // ETIQUETAS DE EMCABEZADO DE TABLA
                String[] titulos={"DNI","NOMBRE","APELLIDOS","CARGO","FECHA"};
                model_Comite=new DefaultTableModel(null,titulos)
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
                PreparedStatement pst= cn.prepareStatement("select *from tabla_cargospadres where Fecha like"+'"'+añoSeleccionado+'"');
                String[] fila= new String[5];
                ResultSet resul=pst.executeQuery();
                // AGREGAR ENCABEZADOS A LA TABLA
                TablaComite = new JTable(model_Comite);
                jScrollPane_comite.setViewportView(TablaComite);

                TablaComite.setRowHeight(18);

                //recuperar valores de BD A LA TABLA
                while(resul.next())
                {
                    fila[0]=resul.getString("Dni_pad");
                    fila[1]=resul.getString("Nombre_pad");
                    fila[2]=resul.getString("Apellido_pad");
                    fila[3]=resul.getString("Cargo");
                    fila[4]=resul.getString("Fecha");
                    model_Comite.addRow(fila);
                }
                cn.close();

            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error al filtar datos de comite padres\n contacte al Administrador","",JOptionPane.ERROR_MESSAGE);
                System.err.println("error al filtar la todos los padres: "+e);
            }
        }
        
    }//GEN-LAST:event_Boton_Filtro_ComiteActionPerformed

    private void Boton_nuevoCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_nuevoCargoActionPerformed
        // TODO add your handling code here:
        cargoComite="nuevo Cargo";
        NewPadreCargo informPadre= new NewPadreCargo();
        informPadre.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_Boton_nuevoCargoActionPerformed

    private void txt_filtroCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtroCodigoActionPerformed

    }//GEN-LAST:event_txt_filtroCodigoActionPerformed

    private void txt_filtroCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroCodigoKeyReleased

        try
        {// en texto escrito a consultar en la tabla
            String texto="%"+txt_filtroCodigo.getText().trim()+"%";

            // secuberra el tipo de filtro
            String filtroSelec=jcmb_tipoFiltro.getSelectedItem().toString();

         
            // ETIQUETAS DE EMCABEZADO DE TABLA
            String[] titulos={"DNI", "NOMBRE", "APELLIDOS", "DIRECCIÓN", "CORREO", "TELEFONO"};
            DefaultTableModel model_Padres = new DefaultTableModel(null,titulos)
            {// este metodo permite que la tabla NO sea editada
                @Override
                public boolean isCellEditable(int row, int column)
                {
                    if(column==5)
                    {return true;}
                    else{return false;}
                }
            };

            // FUNCIONES DEPENDIENDO DEL TIPO DE FILTRO ELEGIDO
            switch (filtroSelec)
            {//*********** FILTRO PARA NOMBRE DE CLIENTES ************
                case"Nombre":
                Connection cn= Conexion.Conectar();
                PreparedStatement pst= cn.prepareStatement("select *from tabla_padres where Nombre_pad like"+'"'+texto+'"');
                String[] fila= new String[6];
                ResultSet resul=pst.executeQuery();
               TablaRegistroHistorico = new JTable(model_Padres);
               jScrollPane_registroHistorico.setViewportView(TablaRegistroHistorico);
                   
                //recuperar valores de BD A LA TABLA
                while(resul.next())
                {
                    fila[0]=resul.getString("Dni_pad");
                    fila[1]=resul.getString("Nombre_pad");
                    fila[2]=resul.getString("Apellidos_pad");
                    fila[3]=resul.getString("Direccion_pad");
                    fila[4]=resul.getString("Correo_pad");
                    fila[5]=resul.getString("Telf_pad");
                    model_Padres.addRow(fila);
                }
                cn.close();

                // EVENTO EN LA TABLA
                TablaRegistroHistorico.addMouseListener(new MouseAdapter()
                    {
                        @Override
                        public void mouseClicked(MouseEvent e)
                        {// recuperar celda celecionada
                            int fila_poin=TablaRegistroHistorico.rowAtPoint(e.getPoint());
                            if(fila_poin>-1)
                            { //recuperar codigo de la celda celecionda
                                String dni_padre= (String)model_Padres.getValueAt(fila_poin,0);
                                // llamar metodo bucar rodctos ára que muestre la infromacion del producto selecionado
                                InfoDelPadre_Cargo informacionPadre= new InfoDelPadre_Cargo();
                                informacionPadre.setVisible(true);
                                        
                            }
                        }
                    });
                    break;

                    //********** FILTRO DE APELLIDOS DE CLIENTES **********
                    case"Apellidos":
                   
                Connection cn2= Conexion.Conectar();
                PreparedStatement pst2= cn2.prepareStatement("select *from tabla_padres where Apellidos_pad like"+'"'+texto+'"');
                String[] fila2= new String[6];
                ResultSet resul2=pst2.executeQuery();
                TablaRegistroHistorico = new JTable(model_Padres);
               jScrollPane_registroHistorico.setViewportView(TablaRegistroHistorico);
            
                //recuperar valores de BD A LA TABLA
                while(resul2.next())
                {
                    fila2[0]=resul2.getString("Dni_pad");
                    fila2[1]=resul2.getString("Nombre_pad");
                    fila2[2]=resul2.getString("Apellidos_pad");
                    fila2[3]=resul2.getString("Direccion_pad");
                    fila2[4]=resul2.getString("Correo_pad");
                    fila2[5]=resul2.getString("Telf_pad");
                    model_Padres.addRow(fila2);
                }
                cn2.close();

                // EVENTO EN LA TABLA
                TablaRegistroHistorico.addMouseListener(new MouseAdapter()
                    {
                        @Override
                        public void mouseClicked(MouseEvent e)
                        {// recuperar celda celecionada
                            int fila_poin=TablaRegistroHistorico.rowAtPoint(e.getPoint());
                            if(fila_poin>-1)
                            { //recuperar codigo de la celda celecionda
                                String dni_padre= (String)model_Padres.getValueAt(fila_poin,0);
                                // llamar metodo bucar rodctos ára que muestre la infromacion del producto selecionado
                                InfoDelPadre_Cargo informacionPadre= new InfoDelPadre_Cargo();
                                informacionPadre.setVisible(true);
                                        
                            }
                        }
                    });
                    break;

                    //********** FILTRO DE DIRECCION DE CLIENTES **********
                    case"DNI":
                    
                Connection cn3= Conexion.Conectar();
                PreparedStatement pst3= cn3.prepareStatement("select *from tabla_padres where Dni_pad  like"+'"'+texto+'"');
                String[] fila3= new String[6];
                ResultSet resul3=pst3.executeQuery();
                TablaRegistroHistorico = new JTable(model_Padres);
               jScrollPane_registroHistorico.setViewportView(TablaRegistroHistorico);
            
                //recuperar valores de BD A LA TABLA
                while(resul3.next())
                {
                    fila3[0]=resul3.getString("Dni_pad");
                    fila3[1]=resul3.getString("Nombre_pad");
                    fila3[2]=resul3.getString("Apellidos_pad");
                    fila3[3]=resul3.getString("Direccion_pad");
                    fila3[4]=resul3.getString("Correo_pad");
                    fila3[5]=resul3.getString("Telf_pad");
                    model_Padres.addRow(fila3);
                }
                cn3.close();

                // EVENTO EN LA TABLA
                TablaRegistroHistorico.addMouseListener(new MouseAdapter()
                    {
                        @Override
                        public void mouseClicked(MouseEvent e)
                        {// recuperar celda celecionada
                            int fila_poin=TablaRegistroHistorico.rowAtPoint(e.getPoint());
                            if(fila_poin>-1)
                            { //recuperar codigo de la celda celecionda
                                String dni_padre= (String)model_Padres.getValueAt(fila_poin,0);
                                // llamar metodo bucar rodctos ára que muestre la infromacion del producto selecionado
                                InfoDelPadre_Cargo informacionPadre= new InfoDelPadre_Cargo();
                                informacionPadre.setVisible(true);
                                        
                            }
                        }
                    });    
                    break;
                }

            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error al filtar "+jcmb_tipoFiltro.getSelectedItem().toString()+"","",JOptionPane.ERROR_MESSAGE);
                System.err.println("error al filtar la busqueda: "+e);
            }
    }//GEN-LAST:event_txt_filtroCodigoKeyReleased

    private void jcmb_tipoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_tipoFiltroActionPerformed
        // TODO add your handling code here:
        txt_filtroCodigo.requestFocus();
    }//GEN-LAST:event_jcmb_tipoFiltroActionPerformed

    private void boton_newPadreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_newPadreMousePressed
     boton_newPadre.setBackground(new Color(204,0,51));
     boton_newPadre.setForeground(new Color(255,255,255));
         // TODO add your handling code here:
    }//GEN-LAST:event_boton_newPadreMousePressed

    private void Boton_nuevoCargoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_nuevoCargoMousePressed
     Boton_nuevoCargo.setBackground(new Color(204,0,51));
     Boton_nuevoCargo.setForeground(new Color(255,255,255));
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_nuevoCargoMousePressed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaPadres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Filtro_Comite;
    private javax.swing.JButton Boton_Filtro_Historico;
    private javax.swing.JButton Boton_nuevoCargo;
    private javax.swing.JLabel LabelHora;
    private javax.swing.JTable TablaComite;
    private javax.swing.JTable TablaRegistroHistorico;
    private javax.swing.JButton boton_newPadre;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmb_añoHistorico;
    private javax.swing.JComboBox<String> cmb_comite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane_comite;
    private javax.swing.JScrollPane jScrollPane_registroHistorico;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JComboBox<String> jcmb_tipoFiltro;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel label_Historico;
    private javax.swing.JTextField txt_filtroCodigo;
    // End of variables declaration//GEN-END:variables



public void DocenteComite(){
     String FechaGuardada="", dni="", cargo="", fecha="";
            TablaComite = new JTable(model_Comite);
            jScrollPane_comite.setViewportView(TablaComite);
            model_Comite.addColumn("DNI");
            model_Comite.addColumn("NOMBRE");
            model_Comite.addColumn("APELLIDOS");
            model_Comite.addColumn("DIRECCIÓN");
            model_Comite.addColumn("CARGO");
            model_Comite.addColumn("FECHA");
            
        try { 
            
         Connection cn1= Conexion.Conectar();
         PreparedStatement pst1= cn1.prepareStatement("select Dni_pad,Cargo,Fecha from tabla_cargospadres ");
         ResultSet resul1=pst1.executeQuery();
         while(resul1.next()){
           dni=resul1.getString("Dni_pad");
           cargo=resul1.getString("Cargo");
           fecha=resul1.getString("Fecha");
          
        try{// en texto escrito a consultar en la tabla
         

            Connection cn2= Conexion.Conectar();
            PreparedStatement pst2= cn2.prepareStatement("select Dni_pad,Nombre_pad,Apellidos_pad,Direccion_pad from tabla_padres  where Dni_pad ='"+dni+"'");
            ResultSet resul2=pst2.executeQuery();
 
            //AGREGAR LOS VALORES DE LA BD A LA TABLA
            while (resul2.next()) {
                Object[] fila= new Object[6];
                for(int i=1;i<4;i++){
                    fila[0]=dni;
                    fila[i]=resul2.getObject(i+1);
                    fila[4]=cargo;
                    fila[5]=fecha;
                }
                model_Comite.addRow(fila);
            }
            
        }catch (Exception e ) 
            
        {System.err.println("error en  rellenar tabla de comite :"+e); }
        
         }
         cn1.close();
         
        }catch (Exception ex){ System.err.println("error en  recuperar dni padre comite :"+ex); }
      
}
    


public void RegistroHistorico(){
       try {
            Connection cn1= Conexion.Conectar();
            PreparedStatement pst1= cn1.prepareStatement("select Dni_pad  , Nombre_pad, Apellidos_pad,"
                    + " Direccion_pad,Telf_pad,Correo_pad from tabla_padres ");
            ResultSet listaDoc=pst1.executeQuery();
            
            // AGREGAR ENCABEZADOS A LA TABLA
            TablaRegistroHistorico = new JTable(model_Padres);
            jScrollPane_registroHistorico.setViewportView(TablaRegistroHistorico);
            model_Padres.addColumn("DNI");
            model_Padres.addColumn("NOMBRE");
            model_Padres.addColumn("APELLIDOS");
            model_Padres.addColumn("DIRRECIÓN");
            model_Padres.addColumn("TELEFONO");
            model_Padres.addColumn("CORREO");
            
             TablaRegistroHistorico.setRowHeight(18);
 
            //AGREGAR LOS VALORES DE LA BD A LA TABLA
            while (listaDoc.next()) {
                Object[] fila= new Object[6];
                for(int i=0;i<6;i++){
                    fila[i]=listaDoc.getObject(i+1);
                }
                model_Padres.addRow(fila);
            }
            cn1.close();
        }catch (Exception e ) 
        {System.err.println("error en  rellenar tabla :"+e); }
      }
 
// CLASE PARA RECUPERA LA HORA AUTOMATICA
public class Hilo_hora extends Thread{
    @Override
    public void run(){
        int pase=1;
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
