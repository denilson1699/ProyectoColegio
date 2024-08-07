
package Ventanas;

import javax.swing.table.DefaultTableModel;
import Clases.Conexion;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ListaEstudiantes extends javax.swing.JFrame {
public static String DNI_est_Compartido;
  //model tabla secundaria
    DefaultTableModel model_1Secundaria=new DefaultTableModel();
    DefaultTableModel model_2Secundaria=new DefaultTableModel();
    DefaultTableModel model_3Secundaria=new DefaultTableModel();
    DefaultTableModel model_4Secundaria=new DefaultTableModel();
    DefaultTableModel model_5Secundaria=new DefaultTableModel();
    //model tabla Primaria
    DefaultTableModel model_1Primaria=new DefaultTableModel();
    DefaultTableModel model_2Primaria=new DefaultTableModel();
    DefaultTableModel model_3Primaria=new DefaultTableModel();
    DefaultTableModel model_4Primaria=new DefaultTableModel();
    DefaultTableModel model_5Primaria=new DefaultTableModel();
    DefaultTableModel model_6Primaria=new DefaultTableModel();
    //model inicial
    DefaultTableModel model_4Inicial=new DefaultTableModel();
    DefaultTableModel model_5Inicial=new DefaultTableModel();
    
    public static String dni_tabla;

    public ListaEstudiantes() {
        initComponents();
        this.setResizable(false);
        setLocationRelativeTo(null);
                    
        //**************SECUNDARIA*****************************
     String[] TitulosSecundaria={"DNI","NOMBRE","APELLIDOS","FECHA REGISTRO","ESTADO","TUTOR"};  
     //agregamos datos la tabla estudiantes del 1 secundaria
     try {
         Connection cn1= Conexion.Conectar();
         PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                 + "    FechaRegistro,Estado,nombre_tutor from tabla_primero_secundaria");
         ResultSet result1=pst1.executeQuery();
         model_1Secundaria=new DefaultTableModel(null,TitulosSecundaria);
         Tabla_1erSecundaria=new JTable(model_1Secundaria);
         jScrollPane_1erSecundaria.setViewportView(Tabla_1erSecundaria);
          while(result1.next()){
             Object[] columna=new Object[6];
             for(int i=0;i<6;i++){
                columna[i]=result1.getObject(i+1);
             }
             model_1Secundaria.addRow(columna);
         }
          cn1.close();
          // EVENTO EN LA TABLA
                Tabla_1erSecundaria.addMouseListener(new MouseAdapter()
                    {  @Override
                        public void mouseClicked(MouseEvent e)
                        {// recuperar celda celecionada
                            int fila_poin=Tabla_1erSecundaria.rowAtPoint(e.getPoint());
                            if(fila_poin>-1)
                            { //recuperar codigo de la celda celecionda
                                String dni_padre= (String)model_1Secundaria.getValueAt(fila_poin,0);
                                try {
                                    MensajeroInfromacionEstudiante(dni_padre);
                                } catch (IOException ex) {
                                    Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                    });
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 1ero de secundaria");
                               System.err.println("ERROR, al rellenar tabla del 1er secundaria:"+e); }
 
    //agregamos datos la tabla estudiantes del 2 secundaria
        try {
         Connection cn1= Conexion.Conectar();
         PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                 + "    FechaRegistro,Estado,nombre_tutor from tabla_segundo_secundaria");
         ResultSet result1=pst1.executeQuery();
         model_2Secundaria=new DefaultTableModel(null,TitulosSecundaria);
         Tabla_2doSecundaria=new JTable(model_2Secundaria);
         jScrollPane_2doSecundaria.setViewportView(Tabla_2doSecundaria);
          while(result1.next()){
             Object[] columna=new Object[6];
             for(int i=0;i<6;i++){
                columna[i]=result1.getObject(i+1);
             }
             model_2Secundaria.addRow(columna);
         }
          cn1.close();
          // creamos evento  para la tabla
          Tabla_2doSecundaria.addMouseListener(new MouseAdapter()
          {@Override
            public void mouseClicked(MouseEvent e)
            {
                int filapoin=Tabla_2doSecundaria.rowAtPoint(e.getPoint());
                if(filapoin>-1){
                    String dni=(String)model_2Secundaria.getValueAt(filapoin,0);
                    try {
                        MensajeroInfromacionEstudiante(dni);
                    } catch (IOException ex) {
                        Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
          });
           
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 2do de secundaria");
                               System.err.println("ERROR, al rellenar tabla del 2do secundaria:"+e); }
     //agregamos datos la tabla estudiantes del 3 secundaria
try {
         Connection cn1= Conexion.Conectar();
         PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                 + "    FechaRegistro,Estado,nombre_tutor from tabla_tercero_secundaria");
         ResultSet result1=pst1.executeQuery();
         model_3Secundaria=new DefaultTableModel(null,TitulosSecundaria);
         Tabla_3roSecundaria=new JTable(model_3Secundaria);
         jScrollPane_3roSecundaria.setViewportView(Tabla_3roSecundaria);
          while(result1.next()){
             Object[] columna=new Object[6];
             for(int i=0;i<6;i++){
                columna[i]=result1.getObject(i+1);
             }
             model_3Secundaria.addRow(columna);
         }
          cn1.close();
          // evento para la tabla
          Tabla_3roSecundaria.addMouseListener(new MouseAdapter() 
          {@Override
          public void mouseClicked(MouseEvent e){
              int filaPint=Tabla_3roSecundaria.rowAtPoint(e.getPoint());
              if(filaPint>-1){
                  String dni=(String)model_3Secundaria.getValueAt(filaPint, 0);
                  try {
                      MensajeroInfromacionEstudiante(dni);
                  } catch (IOException ex) {
                      Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
          }
          
          });
          
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 3ero de secundaria");
                               System.err.println("ERROR, al rellenar tabla del 3ero secundaria:"+e); }
      //agregamos datos la tabla estudiantes del 4 secundaria
 try {
         Connection cn1= Conexion.Conectar();
         PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                 + "    FechaRegistro,Estado,nombre_tutor from tabla_cuarto_secundaria");
         ResultSet result1=pst1.executeQuery();
         model_4Secundaria=new DefaultTableModel(null,TitulosSecundaria);
         Tabla_4toSecundaria=new JTable(model_4Secundaria);
         jScrollPane_4toSecundaria.setViewportView(Tabla_4toSecundaria);
          while(result1.next()){
             Object[] columna=new Object[6];
             for(int i=0;i<6;i++){
                columna[i]=result1.getObject(i+1);
             }
             model_4Secundaria.addRow(columna);
         }
          cn1.close();
          // evento de la tabla
          Tabla_4toSecundaria.addMouseListener(new MouseAdapter()
          {@Override
            public void mouseClicked(MouseEvent e)
            {
              int filapoint=Tabla_4toSecundaria.rowAtPoint(e.getPoint());
              if(filapoint>-1){
                  String dni=(String)model_4Secundaria.getValueAt(filapoint,0);
                  try {
                      MensajeroInfromacionEstudiante(dni);
                  } catch (IOException ex) {
                      Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
            }
              
            });
          
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 4to de secundaria");
                               System.err.println("ERROR, al rellenar tabla del 4to secundaria:"+e); }
     //agregamos datos la tabla estudiantes del 5 secundaria
 try {
         Connection cn1= Conexion.Conectar();
         PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                 + "    FechaRegistro,Estado,nombre_tutor from tabla_quinto_secundaria");
         ResultSet result1=pst1.executeQuery();
         model_5Secundaria=new DefaultTableModel(null,TitulosSecundaria);
         Tabla_5toSecundaria=new JTable(model_5Secundaria);
         jScrollPane_5toSecundaria.setViewportView(Tabla_5toSecundaria);
          while(result1.next()){
             Object[] columna=new Object[6];
             for(int i=0;i<6;i++){
                columna[i]=result1.getObject(i+1);
             }
             model_5Secundaria.addRow(columna);
         }
          cn1.close();
          // evento para la tabla
          Tabla_5toSecundaria.addMouseListener(new MouseAdapter() 
          {@Override
          public void mouseClicked(MouseEvent e){
              int filaPoint=Tabla_5toSecundaria.rowAtPoint(e.getPoint());
              if(filaPoint>-1){
                  String dni=(String)model_5Secundaria.getValueAt(filaPoint,0);
                  try {
                      MensajeroInfromacionEstudiante(dni);
                  } catch (IOException ex) {
                      Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
          }
          
          });
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 5to de secundaria");
                               System.err.println("ERROR, al rellenar tabla del 5to secundaria:"+e); }
     
 
 
     //***************PRIMARIA****************************
     //agregamos datos la tabla estudiantes del 1 Primaria
     String[] TitulosPrimaria={"DNI","NOMBRE","APELLIDOS","FECHA REGISTRO","ESTADO","TUTOR"};  
  try {
         Connection cn1= Conexion.Conectar();
         PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                 + "    FechaRegistro,Estado,nombre_tutor from tabla_primero_primaria");
         ResultSet result1=pst1.executeQuery();
         model_1Primaria=new DefaultTableModel(null,TitulosPrimaria);
         Tabla_1erPrimaria=new JTable(model_1Primaria);
         jScrollPane_1erPrimaria.setViewportView(Tabla_1erPrimaria);
          while(result1.next()){
             Object[] columna=new Object[6];
             for(int i=0;i<6;i++){
                columna[i]=result1.getObject(i+1);
             }
             model_1Primaria.addRow(columna);
         }
          cn1.close();
          // evento para la tabla
          Tabla_1erPrimaria.addMouseListener(new MouseAdapter()
          {@Override
          public void mouseClicked(MouseEvent e){
              int FilaPoint=Tabla_1erPrimaria.rowAtPoint(e.getPoint());
              if(FilaPoint>-1){
                  String dni=(String)model_1Primaria.getValueAt(FilaPoint,0);
                  try {
                      MensajeroInfromacionEstudiante(dni);
                  } catch (IOException ex) {
                      Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
                      
          }
          });          
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 1ero de primaria");
                               System.err.println("ERROR, al rellenar tabla del 1ero primaria:"+e); }
      //agregamos datos la tabla estudiantes del 2 Primaria
   try {
         Connection cn1= Conexion.Conectar();
         PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                 + "    FechaRegistro,Estado,nombre_tutor from tabla_segundo_primaria");
         ResultSet result1=pst1.executeQuery();
         model_2Primaria=new DefaultTableModel(null,TitulosPrimaria);
         Tabla_2doPrimaria=new JTable(model_2Primaria);
         jScrollPane__2doPrimaria.setViewportView(Tabla_2doPrimaria);
          while(result1.next()){
             Object[] columna=new Object[6];
             for(int i=0;i<6;i++)
             {
                columna[i]=result1.getObject(i+1);
             }
             model_2Primaria.addRow(columna);
         }
          cn1.close();
          // evento de la tabla
          Tabla_2doPrimaria.addMouseListener(new MouseAdapter()
          {@Override
          public void mouseClicked(MouseEvent e){
              int filapoint=Tabla_2doPrimaria.rowAtPoint(e.getPoint());
              if(filapoint>-1){
                  String dni=(String)model_2Primaria.getValueAt(filapoint,0);
                  try {
                      MensajeroInfromacionEstudiante(dni);
                  } catch (IOException ex) {
                      Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
          }
              
          });
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 2do primaria");
                               System.err.println("ERROR, al rellenar tabla del 2do primaria:"+e); }
     //agregamos datos la tabla estudiantes del 3 Primaria
   try {
         Connection cn1= Conexion.Conectar();
         PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                 + "    FechaRegistro,Estado,nombre_tutor from tabla_tercero_primaria");
         ResultSet result1=pst1.executeQuery();
         model_3Primaria=new DefaultTableModel(null,TitulosPrimaria);
         Tabla_3roPrimaria=new JTable(model_3Primaria);
         jScrollPane_3roPrimaria.setViewportView(Tabla_3roPrimaria);
          while(result1.next()){
             Object[] columna=new Object[6];
             for(int i=0;i<6;i++){
                columna[i]=result1.getObject(i+1);
             }
             model_3Primaria.addRow(columna);
         }
          cn1.close();
          Tabla_3roPrimaria.addMouseListener(new MouseAdapter() 
          {@Override
          public void mouseClicked(MouseEvent e){
              int filapoint=Tabla_3roPrimaria.rowAtPoint(e.getPoint());
              if(filapoint>-1){
                  String dni=(String)model_3Primaria.getValueAt(filapoint,0);
                  try {
                      MensajeroInfromacionEstudiante(dni);
                  } catch (IOException ex) {
                      Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
          }
          });
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 3ero de primaria");
                               System.err.println("ERROR, al rellenar tabla del 3ero primaria:"+e); }
     //agregamos datos la tabla estudiantes del 4 Primaria
   try {
         Connection cn1= Conexion.Conectar();
         PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                 + "    FechaRegistro,Estado,nombre_tutor from tabla_cuarto_primaria");
         ResultSet result1=pst1.executeQuery();
         model_4Primaria=new DefaultTableModel(null,TitulosPrimaria);
         Tabla_4toPrimaria=new JTable(model_4Primaria);
         jScrollPane_4toPrimaria.setViewportView(Tabla_4toPrimaria);
          while(result1.next()){
             Object[] columna=new Object[6];
             for(int i=0;i<6;i++){
                columna[i]=result1.getObject(i+1);
             }
             model_4Primaria.addRow(columna);
         }
          cn1.close();
         Tabla_4toPrimaria.addMouseListener(new MouseAdapter() 
         {@Override
         public void mouseClicked(MouseEvent e){
             int filaPonit=Tabla_4toPrimaria.rowAtPoint(e.getPoint());
             if(filaPonit>-1)
             {
             String dni=(String)model_4Primaria.getValueAt(filaPonit,0);
                 try {
                     MensajeroInfromacionEstudiante(dni);
                 } catch (IOException ex) {
                     Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                 }
             }
             
         }
         });
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 4to de primaria");
                               System.err.println("ERROR, al rellenar tabla del 4to primaria:"+e); }
     //agregamos datos la tabla estudiantes del 5 Primaria
    try {
         Connection cn1= Conexion.Conectar();
         PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                 + "    FechaRegistro,Estado,nombre_tutor from tabla_quinto_primaria");
         ResultSet result1=pst1.executeQuery();
         model_5Primaria=new DefaultTableModel(null,TitulosPrimaria);
         Tabla_5toPrimaria=new JTable(model_5Primaria);
         jScrollPane_5toPrimaria.setViewportView(Tabla_5toPrimaria);
          while(result1.next()){
             Object[] columna=new Object[6];
             for(int i=0;i<6;i++){
                columna[i]=result1.getObject(i+1);
             }
             model_5Primaria.addRow(columna);
         }
          cn1.close();
          Tabla_5toPrimaria.addMouseListener(new MouseAdapter() 
          {@Override
          public void mouseClicked(MouseEvent e){
              int filaPoint=Tabla_5toPrimaria.rowAtPoint(e.getPoint());
              if(filaPoint>-1)
              {
                  String dni=(String)model_5Primaria.getValueAt(filaPoint,0);
                  try {
                      MensajeroInfromacionEstudiante(dni);
                  } catch (IOException ex) {
                      Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
              
          }
              
          });
          
          
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 5to de primaria");
                               System.err.println("ERROR, al rellenar tabla del 5to primaria:"+e); }
    //agregamos datos la tabla estudiantes del 6 Primaria
   try {
         Connection cn1= Conexion.Conectar();
         PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                 + "    FechaRegistro,Estado,nombre_tutor from tabla_sexto_primaria");
         ResultSet result1=pst1.executeQuery();
         model_6Primaria=new DefaultTableModel(null,TitulosPrimaria);
         Tabla_6toPrimaria=new JTable(model_6Primaria);
         jScrollPane_6toPrimaria.setViewportView(Tabla_6toPrimaria);
          while(result1.next()){
             Object[] columna=new Object[6];
             for(int i=0;i<6;i++){
                columna[i]=result1.getObject(i+1);
             }
             model_6Primaria.addRow(columna);
         }
          cn1.close();
          //evento para la tabla
          Tabla_6toPrimaria.addMouseListener(new MouseAdapter() 
          {@Override
          public void mouseClicked(MouseEvent e){
              int filaPoint=Tabla_6toPrimaria.rowAtPoint(e.getPoint());
              if(filaPoint>-1)
              {
                  String dni=(String)model_6Primaria.getValueAt(filaPoint,0);
                  try {
                      MensajeroInfromacionEstudiante(dni);
                  } catch (IOException ex) {
                      Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
          }
          });
          
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 6to de primaria");
                               System.err.println("ERROR, al rellenar tabla del 6to primaria:"+e); }
     
   
   
     //****************INICIAL***************************
     //agregamos datos la tabla estudiantes del 4 Inicial
     String[] Titulosinicial={"DNI","NOMBRE","APELLIDOS","FECHA REGISTRO","ESTADO","TUTOR"};  
    try {
         Connection cn1= Conexion.Conectar();
         PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                 + "    FechaRegistro,Estado,nombre_tutor from tabla_4años_inicial");
         ResultSet result1=pst1.executeQuery();
         model_4Inicial=new DefaultTableModel(null,Titulosinicial);
         Tabla_4añosInicial=new JTable(model_4Inicial);
         jScrollPane_4añosInicial.setViewportView(Tabla_4añosInicial);
          while(result1.next()){
             Object[] columna=new Object[6];
             for(int i=0;i<6;i++){
                columna[i]=result1.getObject(i+1);
             }
             model_4Inicial.addRow(columna);
         }
          cn1.close();
          //evento para la tabla
          Tabla_4añosInicial.addMouseListener(new MouseAdapter() 
          {@Override
          public void mouseClicked(MouseEvent e){
              int filaPoint=Tabla_4añosInicial.rowAtPoint(e.getPoint());
              if(filaPoint>-1)
              {
                  String dni=(String)model_4Inicial.getValueAt(filaPoint,0);
                  try {
                      MensajeroInfromacionEstudiante(dni);
                  } catch (IOException ex) {
                      Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
          }
          });          
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos de 4 años Inicial");
                               System.err.println("ERROR, al rellenar tabla de 4 años Inicial:"+e); }
         //agregamos datos la tabla estudiantes del 5 Inicial
   try {
         Connection cn1= Conexion.Conectar();
         PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                 + "    FechaRegistro,Estado,nombre_tutor from tabla_5años_inicial");
         ResultSet result1=pst1.executeQuery();
         model_5Inicial=new DefaultTableModel(null,Titulosinicial);
         Tabla_5añosInicial=new JTable(model_5Inicial);
         jScrollPane_5añosInicial.setViewportView(Tabla_5añosInicial);
          while(result1.next()){
             Object[] columna=new Object[6];
             for(int i=0;i<6;i++){
                columna[i]=result1.getObject(i+1);
             }
             model_5Inicial.addRow(columna);
         }
          cn1.close();
         //evento para la tabla
          Tabla_5añosInicial.addMouseListener(new MouseAdapter() 
          {@Override
          public void mouseClicked(MouseEvent e){
              int filaPoint=Tabla_5añosInicial.rowAtPoint(e.getPoint());
              if(filaPoint>-1)
              {
                  String dni=(String)model_5Inicial.getValueAt(filaPoint,0);
                  try {
                      MensajeroInfromacionEstudiante(dni);
                  } catch (IOException ex) {
                      Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
          }
          });          
          
        } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos de 5 años Inicial");
                               System.err.println("ERROR, al rellenar tabla de 5 años Inicial:"+e); }
     
   
        Calendar calendario= Calendar.getInstance();
        String fecha=Integer.toString(calendario.get(Calendar.YEAR));
        cmb_1Secundaria.addItem("Todos");
        for(int i=Integer.parseInt(fecha);i>=2018;i--){
            cmb_1Secundaria.addItem(Integer.toString(i));
        }
           cmb_2Secundaria.addItem("Todos");
        for(int i=Integer.parseInt(fecha);i>=2018;i--){
            cmb_2Secundaria.addItem(Integer.toString(i));
        }
           cmb_3Secundaria.addItem("Todos");
        for(int i=Integer.parseInt(fecha);i>=2018;i--){
            cmb_3Secundaria.addItem(Integer.toString(i));
        }
           cmb_4Secundaria.addItem("Todos");
        for(int i=Integer.parseInt(fecha);i>=2018;i--){
            cmb_4Secundaria.addItem(Integer.toString(i));
        }
           cmb_5Secundaria.addItem("Todos");
        for(int i=Integer.parseInt(fecha);i>=2018;i--){
            cmb_5Secundaria.addItem(Integer.toString(i));
        }
   
        // secundaria jcomboBox
           cmb_1primaria.addItem("Todos");
        for(int i=Integer.parseInt(fecha);i>=2018;i--){
            cmb_1primaria.addItem(Integer.toString(i));
        }
           cmb_2primaria.addItem("Todos");
        for(int i=Integer.parseInt(fecha);i>=2018;i--){
            cmb_2primaria.addItem(Integer.toString(i));
        }
           cmb_3primaria.addItem("Todos");
        for(int i=Integer.parseInt(fecha);i>=2018;i--){
            cmb_3primaria.addItem(Integer.toString(i));
        }
           cmb_4primaria.addItem("Todos");
        for(int i=Integer.parseInt(fecha);i>=2018;i--){
            cmb_4primaria.addItem(Integer.toString(i));
        }
           cmb_5primaria.addItem("Todos");
        for(int i=Integer.parseInt(fecha);i>=2018;i--){
            cmb_5primaria.addItem(Integer.toString(i));
        }
           cmb_6primaria.addItem("Todos");
        for(int i=Integer.parseInt(fecha);i>=2018;i--){
            cmb_6primaria.addItem(Integer.toString(i));
        }
        
        // inicial jcomboBox
           cmb_4añosInicial.addItem("Todos");
        for(int i=Integer.parseInt(fecha);i>=2018;i--){
            cmb_4añosInicial.addItem(Integer.toString(i));
        }
           cmb_5añosInicial.addItem("Todos");
        for(int i=Integer.parseInt(fecha);i>=2018;i--){
            cmb_5añosInicial.addItem(Integer.toString(i));
        }

        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel17 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane_1erSecundaria = new javax.swing.JScrollPane();
        Tabla_1erSecundaria = new javax.swing.JTable();
        label_planadocenteActual = new javax.swing.JLabel();
        jcmb_tipoFiltro1Secundaria = new javax.swing.JComboBox<>();
        txt_filtroCodigo_1Secundaria = new javax.swing.JTextField();
        cmb_1Secundaria = new javax.swing.JComboBox<>();
        Boton_1Secundaria = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        label_planadocenteActual12 = new javax.swing.JLabel();
        jScrollPane_2doSecundaria = new javax.swing.JScrollPane();
        Tabla_2doSecundaria = new javax.swing.JTable();
        jcmb_tipoFiltro2Secundaria = new javax.swing.JComboBox<>();
        txt_filtroCodigo_2Secundaria = new javax.swing.JTextField();
        cmb_2Secundaria = new javax.swing.JComboBox<>();
        Boton_2Secundaria = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        label_planadocenteActual3 = new javax.swing.JLabel();
        jScrollPane_3roSecundaria = new javax.swing.JScrollPane();
        Tabla_3roSecundaria = new javax.swing.JTable();
        jcmb_tipoFiltro3Secundaria = new javax.swing.JComboBox<>();
        txt_filtroCodigo_3Secundaria = new javax.swing.JTextField();
        cmb_3Secundaria = new javax.swing.JComboBox<>();
        Boton_3Secundaria = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        label_planadocenteActual4 = new javax.swing.JLabel();
        jScrollPane_4toSecundaria = new javax.swing.JScrollPane();
        Tabla_4toSecundaria = new javax.swing.JTable();
        jcmb_tipoFiltro4Secundaria = new javax.swing.JComboBox<>();
        txt_filtroCodigo_4Secundaria = new javax.swing.JTextField();
        cmb_4Secundaria = new javax.swing.JComboBox<>();
        Boton_4Secundaria = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        label_planadocenteActual5 = new javax.swing.JLabel();
        jScrollPane_5toSecundaria = new javax.swing.JScrollPane();
        Tabla_5toSecundaria = new javax.swing.JTable();
        jcmb_tipoFiltro5Secundaria = new javax.swing.JComboBox<>();
        txt_filtroCodigo_5Secundaria = new javax.swing.JTextField();
        cmb_5Secundaria = new javax.swing.JComboBox<>();
        Boton_5Secundaria = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Boton_3primaria = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane_1erPrimaria = new javax.swing.JScrollPane();
        Tabla_1erPrimaria = new javax.swing.JTable();
        label_planadocenteActual6 = new javax.swing.JLabel();
        jcmb_tipoFiltro_1primaria = new javax.swing.JComboBox<>();
        txt_filtroCodigo_1primaria = new javax.swing.JTextField();
        cmb_1primaria = new javax.swing.JComboBox<>();
        Boton_1primaria = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane__2doPrimaria = new javax.swing.JScrollPane();
        Tabla_2doPrimaria = new javax.swing.JTable();
        label_planadocenteActual7 = new javax.swing.JLabel();
        Boton_2primaria = new javax.swing.JButton();
        jcmb_tipoFiltro_2primaria = new javax.swing.JComboBox<>();
        txt_filtroCodigo_2primaria = new javax.swing.JTextField();
        cmb_2primaria = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane_3roPrimaria = new javax.swing.JScrollPane();
        Tabla_3roPrimaria = new javax.swing.JTable();
        label_planadocenteActual8 = new javax.swing.JLabel();
        Boton_3primaria2 = new javax.swing.JButton();
        jcmb_tipoFiltro_3primaria = new javax.swing.JComboBox<>();
        txt_filtroCodigo_3primaria = new javax.swing.JTextField();
        cmb_3primaria = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane_4toPrimaria = new javax.swing.JScrollPane();
        Tabla_4toPrimaria = new javax.swing.JTable();
        label_planadocenteActual9 = new javax.swing.JLabel();
        Boton_4primaria = new javax.swing.JButton();
        jcmb_tipoFiltro_4primaria = new javax.swing.JComboBox<>();
        txt_filtroCodigo_4primaria = new javax.swing.JTextField();
        cmb_4primaria = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane_5toPrimaria = new javax.swing.JScrollPane();
        Tabla_5toPrimaria = new javax.swing.JTable();
        label_planadocenteActual10 = new javax.swing.JLabel();
        Boton_5primaria = new javax.swing.JButton();
        jcmb_tipoFiltro_5primaria = new javax.swing.JComboBox<>();
        txt_filtroCodigo_5primaria = new javax.swing.JTextField();
        cmb_5primaria = new javax.swing.JComboBox<>();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane_6toPrimaria = new javax.swing.JScrollPane();
        Tabla_6toPrimaria = new javax.swing.JTable();
        label_planadocenteActual11 = new javax.swing.JLabel();
        Boton_6primaria = new javax.swing.JButton();
        jcmb_tipoFiltro_6primaria = new javax.swing.JComboBox<>();
        txt_filtroCodigo_6primaria = new javax.swing.JTextField();
        cmb_6primaria = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane_4añosInicial = new javax.swing.JScrollPane();
        Tabla_4añosInicial = new javax.swing.JTable();
        label_planadocenteActual13 = new javax.swing.JLabel();
        jcmb_tipoFiltro_4añosInicial = new javax.swing.JComboBox<>();
        txt_filtroCodigo_4añosInicial = new javax.swing.JTextField();
        cmb_4añosInicial = new javax.swing.JComboBox<>();
        Boton_4añosInicial = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane_5añosInicial = new javax.swing.JScrollPane();
        Tabla_5añosInicial = new javax.swing.JTable();
        label_planadocenteActual14 = new javax.swing.JLabel();
        Boton_5añosInicial = new javax.swing.JButton();
        txt_filtroCodigo_5añosInicial = new javax.swing.JTextField();
        jcmb_tipoFiltro_5añosInicial = new javax.swing.JComboBox<>();
        cmb_5añosInicial = new javax.swing.JComboBox<>();
        jPanel18 = new javax.swing.JPanel();
        label_planadocenteActual1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        LabelHora = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        Menu_BuscarEstudiantes = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Tabla_1erSecundaria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane_1erSecundaria.setViewportView(Tabla_1erSecundaria);

        label_planadocenteActual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_planadocenteActual.setForeground(new java.awt.Color(102, 102, 0));
        label_planadocenteActual.setText("Estudiantes de 1er de Secundaria");

        jcmb_tipoFiltro1Secundaria.setBackground(new java.awt.Color(0, 51, 51));
        jcmb_tipoFiltro1Secundaria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcmb_tipoFiltro1Secundaria.setForeground(new java.awt.Color(255, 255, 255));
        jcmb_tipoFiltro1Secundaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Nombre", "Apellidos", "Estado" }));
        jcmb_tipoFiltro1Secundaria.setBorder(null);
        jcmb_tipoFiltro1Secundaria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcmb_tipoFiltro1Secundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_tipoFiltro1SecundariaActionPerformed(evt);
            }
        });

        txt_filtroCodigo_1Secundaria.setBackground(new java.awt.Color(255, 255, 204));
        txt_filtroCodigo_1Secundaria.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_filtroCodigo_1Secundaria.setForeground(new java.awt.Color(0, 102, 102));
        txt_filtroCodigo_1Secundaria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_filtroCodigo_1Secundaria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_filtroCodigo_1Secundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtroCodigo_1SecundariaActionPerformed(evt);
            }
        });
        txt_filtroCodigo_1Secundaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroCodigo_1SecundariaKeyReleased(evt);
            }
        });

        cmb_1Secundaria.setBackground(new java.awt.Color(102, 102, 0));
        cmb_1Secundaria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_1Secundaria.setForeground(new java.awt.Color(255, 255, 255));
        cmb_1Secundaria.setBorder(null);

        Boton_1Secundaria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Boton_1Secundaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        Boton_1Secundaria.setText("Buscar");
        Boton_1Secundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_1SecundariaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane_1erSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jcmb_tipoFiltro1Secundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_filtroCodigo_1Secundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(label_planadocenteActual)
                        .addGap(81, 81, 81)
                        .addComponent(cmb_1Secundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(Boton_1Secundaria)
                        .addGap(24, 24, 24))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmb_1Secundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Boton_1Secundaria))
                    .addComponent(label_planadocenteActual)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_filtroCodigo_1Secundaria, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jcmb_tipoFiltro1Secundaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane_1erSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("           1ro Secundaria              ", jPanel4);

        label_planadocenteActual12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_planadocenteActual12.setForeground(new java.awt.Color(102, 102, 0));
        label_planadocenteActual12.setText("Estudiantes de 2do Secundaria");

        Tabla_2doSecundaria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane_2doSecundaria.setViewportView(Tabla_2doSecundaria);

        jcmb_tipoFiltro2Secundaria.setBackground(new java.awt.Color(0, 51, 51));
        jcmb_tipoFiltro2Secundaria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcmb_tipoFiltro2Secundaria.setForeground(new java.awt.Color(255, 255, 255));
        jcmb_tipoFiltro2Secundaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Nombre", "Apellidos", "Estado" }));
        jcmb_tipoFiltro2Secundaria.setBorder(null);
        jcmb_tipoFiltro2Secundaria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcmb_tipoFiltro2Secundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_tipoFiltro2SecundariaActionPerformed(evt);
            }
        });

        txt_filtroCodigo_2Secundaria.setBackground(new java.awt.Color(255, 255, 204));
        txt_filtroCodigo_2Secundaria.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_filtroCodigo_2Secundaria.setForeground(new java.awt.Color(0, 102, 102));
        txt_filtroCodigo_2Secundaria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_filtroCodigo_2Secundaria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_filtroCodigo_2Secundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtroCodigo_2SecundariaActionPerformed(evt);
            }
        });
        txt_filtroCodigo_2Secundaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroCodigo_2SecundariaKeyReleased(evt);
            }
        });

        cmb_2Secundaria.setBackground(new java.awt.Color(102, 102, 0));
        cmb_2Secundaria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_2Secundaria.setForeground(new java.awt.Color(255, 255, 255));
        cmb_2Secundaria.setBorder(null);

        Boton_2Secundaria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Boton_2Secundaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        Boton_2Secundaria.setText("Buscar");
        Boton_2Secundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_2SecundariaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jcmb_tipoFiltro2Secundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_filtroCodigo_2Secundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_planadocenteActual12))
                    .addComponent(jScrollPane_2doSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(cmb_2Secundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Boton_2Secundaria)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmb_2Secundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Boton_2Secundaria))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_filtroCodigo_2Secundaria)
                            .addComponent(label_planadocenteActual12))
                        .addComponent(jcmb_tipoFiltro2Secundaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane_2doSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("               2do Secundaria               ", jPanel5);

        label_planadocenteActual3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_planadocenteActual3.setForeground(new java.awt.Color(102, 102, 0));
        label_planadocenteActual3.setText("Estudiantes del 3ro Secundaria");

        Tabla_3roSecundaria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane_3roSecundaria.setViewportView(Tabla_3roSecundaria);

        jcmb_tipoFiltro3Secundaria.setBackground(new java.awt.Color(0, 51, 51));
        jcmb_tipoFiltro3Secundaria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcmb_tipoFiltro3Secundaria.setForeground(new java.awt.Color(255, 255, 255));
        jcmb_tipoFiltro3Secundaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Nombre", "Apellidos", "Estado" }));
        jcmb_tipoFiltro3Secundaria.setBorder(null);
        jcmb_tipoFiltro3Secundaria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcmb_tipoFiltro3Secundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_tipoFiltro3SecundariaActionPerformed(evt);
            }
        });

        txt_filtroCodigo_3Secundaria.setBackground(new java.awt.Color(255, 255, 204));
        txt_filtroCodigo_3Secundaria.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_filtroCodigo_3Secundaria.setForeground(new java.awt.Color(0, 102, 102));
        txt_filtroCodigo_3Secundaria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_filtroCodigo_3Secundaria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_filtroCodigo_3Secundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtroCodigo_3SecundariaActionPerformed(evt);
            }
        });
        txt_filtroCodigo_3Secundaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroCodigo_3SecundariaKeyReleased(evt);
            }
        });

        cmb_3Secundaria.setBackground(new java.awt.Color(102, 102, 0));
        cmb_3Secundaria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_3Secundaria.setForeground(new java.awt.Color(255, 255, 255));
        cmb_3Secundaria.setBorder(null);

        Boton_3Secundaria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Boton_3Secundaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        Boton_3Secundaria.setText("Buscar");
        Boton_3Secundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_3SecundariaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jcmb_tipoFiltro3Secundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_filtroCodigo_3Secundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(label_planadocenteActual3)
                        .addGap(106, 106, 106)
                        .addComponent(cmb_3Secundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Boton_3Secundaria)
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane_3roSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmb_3Secundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Boton_3Secundaria))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(label_planadocenteActual3)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_filtroCodigo_3Secundaria, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcmb_tipoFiltro3Secundaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane_3roSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("               3ro Secundaria              ", jPanel6);

        label_planadocenteActual4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_planadocenteActual4.setForeground(new java.awt.Color(102, 102, 0));
        label_planadocenteActual4.setText("Estudiantes del  4to Secundaria");

        Tabla_4toSecundaria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane_4toSecundaria.setViewportView(Tabla_4toSecundaria);

        jcmb_tipoFiltro4Secundaria.setBackground(new java.awt.Color(0, 51, 51));
        jcmb_tipoFiltro4Secundaria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcmb_tipoFiltro4Secundaria.setForeground(new java.awt.Color(255, 255, 255));
        jcmb_tipoFiltro4Secundaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Nombre", "Apellidos", "Estado", "Estado" }));
        jcmb_tipoFiltro4Secundaria.setBorder(null);
        jcmb_tipoFiltro4Secundaria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcmb_tipoFiltro4Secundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_tipoFiltro4SecundariaActionPerformed(evt);
            }
        });

        txt_filtroCodigo_4Secundaria.setBackground(new java.awt.Color(255, 255, 204));
        txt_filtroCodigo_4Secundaria.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_filtroCodigo_4Secundaria.setForeground(new java.awt.Color(0, 102, 102));
        txt_filtroCodigo_4Secundaria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_filtroCodigo_4Secundaria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_filtroCodigo_4Secundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtroCodigo_4SecundariaActionPerformed(evt);
            }
        });
        txt_filtroCodigo_4Secundaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroCodigo_4SecundariaKeyReleased(evt);
            }
        });

        cmb_4Secundaria.setBackground(new java.awt.Color(102, 102, 0));
        cmb_4Secundaria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_4Secundaria.setForeground(new java.awt.Color(255, 255, 255));
        cmb_4Secundaria.setBorder(null);

        Boton_4Secundaria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Boton_4Secundaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        Boton_4Secundaria.setText("Buscar");
        Boton_4Secundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_4SecundariaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jcmb_tipoFiltro4Secundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_filtroCodigo_4Secundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_planadocenteActual4))
                    .addComponent(jScrollPane_4toSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(cmb_4Secundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Boton_4Secundaria)
                .addGap(74, 74, 74))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_4Secundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton_4Secundaria))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_filtroCodigo_4Secundaria)
                            .addComponent(label_planadocenteActual4)))
                    .addComponent(jcmb_tipoFiltro4Secundaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane_4toSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("             4to Secundaria           ", jPanel7);

        label_planadocenteActual5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_planadocenteActual5.setForeground(new java.awt.Color(102, 102, 0));
        label_planadocenteActual5.setText("Estudiantes del 5to Secundaria");

        Tabla_5toSecundaria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane_5toSecundaria.setViewportView(Tabla_5toSecundaria);

        jcmb_tipoFiltro5Secundaria.setBackground(new java.awt.Color(0, 51, 51));
        jcmb_tipoFiltro5Secundaria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcmb_tipoFiltro5Secundaria.setForeground(new java.awt.Color(255, 255, 255));
        jcmb_tipoFiltro5Secundaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Nombre", "Apellidos", "Estado" }));
        jcmb_tipoFiltro5Secundaria.setBorder(null);
        jcmb_tipoFiltro5Secundaria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcmb_tipoFiltro5Secundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_tipoFiltro5SecundariaActionPerformed(evt);
            }
        });

        txt_filtroCodigo_5Secundaria.setBackground(new java.awt.Color(255, 255, 204));
        txt_filtroCodigo_5Secundaria.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_filtroCodigo_5Secundaria.setForeground(new java.awt.Color(0, 102, 102));
        txt_filtroCodigo_5Secundaria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_filtroCodigo_5Secundaria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_filtroCodigo_5Secundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtroCodigo_5SecundariaActionPerformed(evt);
            }
        });
        txt_filtroCodigo_5Secundaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroCodigo_5SecundariaKeyReleased(evt);
            }
        });

        cmb_5Secundaria.setBackground(new java.awt.Color(102, 102, 0));
        cmb_5Secundaria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_5Secundaria.setForeground(new java.awt.Color(255, 255, 255));
        cmb_5Secundaria.setBorder(null);

        Boton_5Secundaria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Boton_5Secundaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        Boton_5Secundaria.setText("Buscar");
        Boton_5Secundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_5SecundariaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jcmb_tipoFiltro5Secundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_filtroCodigo_5Secundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(label_planadocenteActual5))
                    .addComponent(jScrollPane_5toSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(cmb_5Secundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton_5Secundaria)
                .addGap(61, 61, 61))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmb_5Secundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Boton_5Secundaria))
                    .addComponent(label_planadocenteActual5)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_filtroCodigo_5Secundaria, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jcmb_tipoFiltro5Secundaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane_5toSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("              5to Secundaria              ", jPanel8);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2))
        );

        jTabbedPane1.addTab("                       NIVEL SECUNDARIO                           ", jPanel1);

        Tabla_1erPrimaria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane_1erPrimaria.setViewportView(Tabla_1erPrimaria);

        label_planadocenteActual6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_planadocenteActual6.setForeground(new java.awt.Color(153, 0, 0));
        label_planadocenteActual6.setText("Estudiantes del 1er de Primaria");

        jcmb_tipoFiltro_1primaria.setBackground(new java.awt.Color(0, 51, 51));
        jcmb_tipoFiltro_1primaria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcmb_tipoFiltro_1primaria.setForeground(new java.awt.Color(255, 255, 255));
        jcmb_tipoFiltro_1primaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Nombre", "Apellidos", "Estado" }));
        jcmb_tipoFiltro_1primaria.setBorder(null);
        jcmb_tipoFiltro_1primaria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcmb_tipoFiltro_1primaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_tipoFiltro_1primariaActionPerformed(evt);
            }
        });

        txt_filtroCodigo_1primaria.setBackground(new java.awt.Color(255, 255, 204));
        txt_filtroCodigo_1primaria.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_filtroCodigo_1primaria.setForeground(new java.awt.Color(0, 102, 102));
        txt_filtroCodigo_1primaria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_filtroCodigo_1primaria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_filtroCodigo_1primaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtroCodigo_1primariaActionPerformed(evt);
            }
        });
        txt_filtroCodigo_1primaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroCodigo_1primariaKeyReleased(evt);
            }
        });

        cmb_1primaria.setBackground(new java.awt.Color(102, 102, 0));
        cmb_1primaria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_1primaria.setForeground(new java.awt.Color(255, 255, 255));
        cmb_1primaria.setBorder(null);

        Boton_1primaria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Boton_1primaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        Boton_1primaria.setText("Buscar");
        Boton_1primaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_1primariaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jcmb_tipoFiltro_1primaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_filtroCodigo_1primaria, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(label_planadocenteActual6)
                        .addGap(64, 64, 64)
                        .addComponent(cmb_1primaria, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton_1primaria))
                    .addComponent(jScrollPane_1erPrimaria, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_filtroCodigo_1primaria, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcmb_tipoFiltro_1primaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmb_1primaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Boton_1primaria))
                            .addComponent(label_planadocenteActual6))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane_1erPrimaria, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        Boton_3primaria.addTab("           1ro Primaria            ", jPanel9);

        Tabla_2doPrimaria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane__2doPrimaria.setViewportView(Tabla_2doPrimaria);

        label_planadocenteActual7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_planadocenteActual7.setForeground(new java.awt.Color(153, 0, 0));
        label_planadocenteActual7.setText("Estudiantes del 2do de Primaria");

        Boton_2primaria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Boton_2primaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        Boton_2primaria.setText("Buscar");
        Boton_2primaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_2primariaActionPerformed(evt);
            }
        });

        jcmb_tipoFiltro_2primaria.setBackground(new java.awt.Color(0, 51, 51));
        jcmb_tipoFiltro_2primaria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcmb_tipoFiltro_2primaria.setForeground(new java.awt.Color(255, 255, 255));
        jcmb_tipoFiltro_2primaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Nombre", "Apellidos", "Estado" }));
        jcmb_tipoFiltro_2primaria.setBorder(null);
        jcmb_tipoFiltro_2primaria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcmb_tipoFiltro_2primaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_tipoFiltro_2primariaActionPerformed(evt);
            }
        });

        txt_filtroCodigo_2primaria.setBackground(new java.awt.Color(255, 255, 204));
        txt_filtroCodigo_2primaria.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_filtroCodigo_2primaria.setForeground(new java.awt.Color(0, 102, 102));
        txt_filtroCodigo_2primaria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_filtroCodigo_2primaria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_filtroCodigo_2primaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtroCodigo_2primariaActionPerformed(evt);
            }
        });
        txt_filtroCodigo_2primaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroCodigo_2primariaKeyReleased(evt);
            }
        });

        cmb_2primaria.setBackground(new java.awt.Color(102, 102, 0));
        cmb_2primaria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_2primaria.setForeground(new java.awt.Color(255, 255, 255));
        cmb_2primaria.setBorder(null);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jcmb_tipoFiltro_2primaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_filtroCodigo_2primaria, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(label_planadocenteActual7)
                        .addGap(57, 57, 57)
                        .addComponent(cmb_2primaria, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton_2primaria))
                    .addComponent(jScrollPane__2doPrimaria, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_filtroCodigo_2primaria, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jcmb_tipoFiltro_2primaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_2primaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton_2primaria)
                            .addComponent(label_planadocenteActual7))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane__2doPrimaria, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        Boton_3primaria.addTab("           2do Primaria           ", jPanel10);

        Tabla_3roPrimaria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane_3roPrimaria.setViewportView(Tabla_3roPrimaria);

        label_planadocenteActual8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_planadocenteActual8.setForeground(new java.awt.Color(153, 0, 0));
        label_planadocenteActual8.setText("Estudiantes del 3ro de Primaria");

        Boton_3primaria2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Boton_3primaria2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        Boton_3primaria2.setText("Buscar");
        Boton_3primaria2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_3primaria2ActionPerformed(evt);
            }
        });

        jcmb_tipoFiltro_3primaria.setBackground(new java.awt.Color(0, 51, 51));
        jcmb_tipoFiltro_3primaria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcmb_tipoFiltro_3primaria.setForeground(new java.awt.Color(255, 255, 255));
        jcmb_tipoFiltro_3primaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Nombre", "Apellidos", "Estado" }));
        jcmb_tipoFiltro_3primaria.setBorder(null);
        jcmb_tipoFiltro_3primaria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcmb_tipoFiltro_3primaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_tipoFiltro_3primariaActionPerformed(evt);
            }
        });

        txt_filtroCodigo_3primaria.setBackground(new java.awt.Color(255, 255, 204));
        txt_filtroCodigo_3primaria.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_filtroCodigo_3primaria.setForeground(new java.awt.Color(0, 102, 102));
        txt_filtroCodigo_3primaria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_filtroCodigo_3primaria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_filtroCodigo_3primaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtroCodigo_3primariaActionPerformed(evt);
            }
        });
        txt_filtroCodigo_3primaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroCodigo_3primariaKeyReleased(evt);
            }
        });

        cmb_3primaria.setBackground(new java.awt.Color(102, 102, 0));
        cmb_3primaria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_3primaria.setForeground(new java.awt.Color(255, 255, 255));
        cmb_3primaria.setBorder(null);
        cmb_3primaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_3primariaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jcmb_tipoFiltro_3primaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_filtroCodigo_3primaria, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(label_planadocenteActual8)
                        .addGap(59, 59, 59)
                        .addComponent(cmb_3primaria, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton_3primaria2))
                    .addComponent(jScrollPane_3roPrimaria, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_3primaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton_3primaria2)))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(label_planadocenteActual8)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_filtroCodigo_3primaria, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcmb_tipoFiltro_3primaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane_3roPrimaria, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        Boton_3primaria.addTab("         3ro Primaria         ", jPanel11);

        Tabla_4toPrimaria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane_4toPrimaria.setViewportView(Tabla_4toPrimaria);

        label_planadocenteActual9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_planadocenteActual9.setForeground(new java.awt.Color(153, 0, 0));
        label_planadocenteActual9.setText("Estudiantes del 4to de Primaria");

        Boton_4primaria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Boton_4primaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        Boton_4primaria.setText("Buscar");
        Boton_4primaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_4primariaActionPerformed(evt);
            }
        });

        jcmb_tipoFiltro_4primaria.setBackground(new java.awt.Color(0, 51, 51));
        jcmb_tipoFiltro_4primaria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcmb_tipoFiltro_4primaria.setForeground(new java.awt.Color(255, 255, 255));
        jcmb_tipoFiltro_4primaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Nombre", "Apellidos", "Estado" }));
        jcmb_tipoFiltro_4primaria.setBorder(null);
        jcmb_tipoFiltro_4primaria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcmb_tipoFiltro_4primaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_tipoFiltro_4primariaActionPerformed(evt);
            }
        });

        txt_filtroCodigo_4primaria.setBackground(new java.awt.Color(255, 255, 204));
        txt_filtroCodigo_4primaria.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_filtroCodigo_4primaria.setForeground(new java.awt.Color(0, 102, 102));
        txt_filtroCodigo_4primaria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_filtroCodigo_4primaria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_filtroCodigo_4primaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtroCodigo_4primariaActionPerformed(evt);
            }
        });
        txt_filtroCodigo_4primaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroCodigo_4primariaKeyReleased(evt);
            }
        });

        cmb_4primaria.setBackground(new java.awt.Color(102, 102, 0));
        cmb_4primaria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_4primaria.setForeground(new java.awt.Color(255, 255, 255));
        cmb_4primaria.setBorder(null);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jcmb_tipoFiltro_4primaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_filtroCodigo_4primaria, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(label_planadocenteActual9)
                        .addGap(59, 59, 59)
                        .addComponent(cmb_4primaria, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton_4primaria))
                    .addComponent(jScrollPane_4toPrimaria, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_4primaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton_4primaria)))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_filtroCodigo_4primaria)
                            .addComponent(label_planadocenteActual9))
                        .addComponent(jcmb_tipoFiltro_4primaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane_4toPrimaria, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        Boton_3primaria.addTab("            4to Primaria       ", jPanel12);

        Tabla_5toPrimaria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane_5toPrimaria.setViewportView(Tabla_5toPrimaria);

        label_planadocenteActual10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_planadocenteActual10.setForeground(new java.awt.Color(153, 0, 0));
        label_planadocenteActual10.setText("Estudiantes del 5to de Primaria");

        Boton_5primaria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Boton_5primaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        Boton_5primaria.setText("Buscar");
        Boton_5primaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_5primariaActionPerformed(evt);
            }
        });

        jcmb_tipoFiltro_5primaria.setBackground(new java.awt.Color(0, 51, 51));
        jcmb_tipoFiltro_5primaria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcmb_tipoFiltro_5primaria.setForeground(new java.awt.Color(255, 255, 255));
        jcmb_tipoFiltro_5primaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Nombre", "Apellidos", "Estado" }));
        jcmb_tipoFiltro_5primaria.setBorder(null);
        jcmb_tipoFiltro_5primaria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcmb_tipoFiltro_5primaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_tipoFiltro_5primariaActionPerformed(evt);
            }
        });

        txt_filtroCodigo_5primaria.setBackground(new java.awt.Color(255, 255, 204));
        txt_filtroCodigo_5primaria.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_filtroCodigo_5primaria.setForeground(new java.awt.Color(0, 102, 102));
        txt_filtroCodigo_5primaria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_filtroCodigo_5primaria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_filtroCodigo_5primaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtroCodigo_5primariaActionPerformed(evt);
            }
        });
        txt_filtroCodigo_5primaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroCodigo_5primariaKeyReleased(evt);
            }
        });

        cmb_5primaria.setBackground(new java.awt.Color(102, 102, 0));
        cmb_5primaria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_5primaria.setForeground(new java.awt.Color(255, 255, 255));
        cmb_5primaria.setBorder(null);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jcmb_tipoFiltro_5primaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_filtroCodigo_5primaria, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(label_planadocenteActual10)
                        .addGap(50, 50, 50)
                        .addComponent(cmb_5primaria, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton_5primaria))
                    .addComponent(jScrollPane_5toPrimaria, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmb_5primaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Boton_5primaria)))
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_filtroCodigo_5primaria, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcmb_tipoFiltro_5primaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_planadocenteActual10)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane_5toPrimaria, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        Boton_3primaria.addTab("           5to Primaria            ", jPanel13);

        Tabla_6toPrimaria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane_6toPrimaria.setViewportView(Tabla_6toPrimaria);

        label_planadocenteActual11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_planadocenteActual11.setForeground(new java.awt.Color(153, 0, 0));
        label_planadocenteActual11.setText("Estudiantes del 6to de Primaria");

        Boton_6primaria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Boton_6primaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        Boton_6primaria.setText("Buscar");
        Boton_6primaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_6primariaActionPerformed(evt);
            }
        });

        jcmb_tipoFiltro_6primaria.setBackground(new java.awt.Color(0, 51, 51));
        jcmb_tipoFiltro_6primaria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcmb_tipoFiltro_6primaria.setForeground(new java.awt.Color(255, 255, 255));
        jcmb_tipoFiltro_6primaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Nombre", "Apellidos", "Estado" }));
        jcmb_tipoFiltro_6primaria.setBorder(null);
        jcmb_tipoFiltro_6primaria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcmb_tipoFiltro_6primaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_tipoFiltro_6primariaActionPerformed(evt);
            }
        });

        txt_filtroCodigo_6primaria.setBackground(new java.awt.Color(255, 255, 204));
        txt_filtroCodigo_6primaria.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_filtroCodigo_6primaria.setForeground(new java.awt.Color(0, 102, 102));
        txt_filtroCodigo_6primaria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_filtroCodigo_6primaria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_filtroCodigo_6primaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtroCodigo_6primariaActionPerformed(evt);
            }
        });
        txt_filtroCodigo_6primaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroCodigo_6primariaKeyReleased(evt);
            }
        });

        cmb_6primaria.setBackground(new java.awt.Color(102, 102, 0));
        cmb_6primaria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_6primaria.setForeground(new java.awt.Color(255, 255, 255));
        cmb_6primaria.setBorder(null);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jcmb_tipoFiltro_6primaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_filtroCodigo_6primaria, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(label_planadocenteActual11)
                        .addGap(69, 69, 69)
                        .addComponent(cmb_6primaria, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton_6primaria))
                    .addComponent(jScrollPane_6toPrimaria, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_6primaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton_6primaria)))
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_filtroCodigo_6primaria)
                            .addComponent(label_planadocenteActual11))
                        .addComponent(jcmb_tipoFiltro_6primaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane_6toPrimaria, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        Boton_3primaria.addTab("           6to Primiaria             ", jPanel14);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Boton_3primaria)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Boton_3primaria, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("                                NIVEL PRIMARIA                                    ", jPanel2);

        Tabla_4añosInicial.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane_4añosInicial.setViewportView(Tabla_4añosInicial);

        label_planadocenteActual13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_planadocenteActual13.setForeground(new java.awt.Color(102, 102, 0));
        label_planadocenteActual13.setText("Estudiantes del 4 Años");

        jcmb_tipoFiltro_4añosInicial.setBackground(new java.awt.Color(0, 51, 51));
        jcmb_tipoFiltro_4añosInicial.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcmb_tipoFiltro_4añosInicial.setForeground(new java.awt.Color(255, 255, 255));
        jcmb_tipoFiltro_4añosInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Nombre", "Apellidos", "Estado" }));
        jcmb_tipoFiltro_4añosInicial.setBorder(null);
        jcmb_tipoFiltro_4añosInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcmb_tipoFiltro_4añosInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_tipoFiltro_4añosInicialActionPerformed(evt);
            }
        });

        txt_filtroCodigo_4añosInicial.setBackground(new java.awt.Color(255, 255, 204));
        txt_filtroCodigo_4añosInicial.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_filtroCodigo_4añosInicial.setForeground(new java.awt.Color(0, 102, 102));
        txt_filtroCodigo_4añosInicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_filtroCodigo_4añosInicial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_filtroCodigo_4añosInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtroCodigo_4añosInicialActionPerformed(evt);
            }
        });
        txt_filtroCodigo_4añosInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroCodigo_4añosInicialKeyReleased(evt);
            }
        });

        cmb_4añosInicial.setBackground(new java.awt.Color(102, 102, 0));
        cmb_4añosInicial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_4añosInicial.setForeground(new java.awt.Color(255, 255, 255));
        cmb_4añosInicial.setBorder(null);

        Boton_4añosInicial.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Boton_4añosInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        Boton_4añosInicial.setText("Buscar");
        Boton_4añosInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_4añosInicialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jcmb_tipoFiltro_4añosInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_filtroCodigo_4añosInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(label_planadocenteActual13)
                        .addGap(113, 113, 113)
                        .addComponent(cmb_4añosInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton_4añosInicial))
                    .addComponent(jScrollPane_4añosInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_4añosInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton_4añosInicial)))
                    .addComponent(label_planadocenteActual13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcmb_tipoFiltro_4añosInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_filtroCodigo_4añosInicial)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane_4añosInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("          4 Años          ", jPanel15);

        Tabla_5añosInicial.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane_5añosInicial.setViewportView(Tabla_5añosInicial);

        label_planadocenteActual14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_planadocenteActual14.setForeground(new java.awt.Color(102, 102, 0));
        label_planadocenteActual14.setText("Estudiantes del 5 Años");

        Boton_5añosInicial.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Boton_5añosInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        Boton_5añosInicial.setText("Buscar");
        Boton_5añosInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_5añosInicialActionPerformed(evt);
            }
        });

        txt_filtroCodigo_5añosInicial.setBackground(new java.awt.Color(255, 255, 204));
        txt_filtroCodigo_5añosInicial.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_filtroCodigo_5añosInicial.setForeground(new java.awt.Color(0, 102, 102));
        txt_filtroCodigo_5añosInicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_filtroCodigo_5añosInicial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_filtroCodigo_5añosInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filtroCodigo_5añosInicialActionPerformed(evt);
            }
        });
        txt_filtroCodigo_5añosInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroCodigo_5añosInicialKeyReleased(evt);
            }
        });

        jcmb_tipoFiltro_5añosInicial.setBackground(new java.awt.Color(0, 51, 51));
        jcmb_tipoFiltro_5añosInicial.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcmb_tipoFiltro_5añosInicial.setForeground(new java.awt.Color(255, 255, 255));
        jcmb_tipoFiltro_5añosInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Nombre", "Apellidos", "Estado" }));
        jcmb_tipoFiltro_5añosInicial.setBorder(null);
        jcmb_tipoFiltro_5añosInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcmb_tipoFiltro_5añosInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_tipoFiltro_5añosInicialActionPerformed(evt);
            }
        });

        cmb_5añosInicial.setBackground(new java.awt.Color(102, 102, 0));
        cmb_5añosInicial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_5añosInicial.setForeground(new java.awt.Color(255, 255, 255));
        cmb_5añosInicial.setBorder(null);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jcmb_tipoFiltro_5añosInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_filtroCodigo_5añosInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(label_planadocenteActual14)
                        .addGap(100, 100, 100)
                        .addComponent(cmb_5añosInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton_5añosInicial))
                    .addComponent(jScrollPane_5añosInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_5añosInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton_5añosInicial)))
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcmb_tipoFiltro_5añosInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_filtroCodigo_5añosInicial)
                        .addComponent(label_planadocenteActual14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane_5añosInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("     5 Años     ", jPanel16);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4))
        );

        jTabbedPane1.addTab("                                     NIVEL INICIAL                                   ", jPanel3);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        label_planadocenteActual1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        label_planadocenteActual1.setForeground(new java.awt.Color(204, 0, 0));
        label_planadocenteActual1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_planadocenteActual1.setText("Lista de Estudiantes");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("Hora:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("Fecha:");

        labelFecha.setForeground(new java.awt.Color(204, 0, 0));
        labelFecha.setText("Fecha:");

        LabelHora.setForeground(new java.awt.Color(204, 0, 0));
        LabelHora.setText("Fecha:");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(label_planadocenteActual1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelHora)
                    .addComponent(labelFecha))
                .addGap(78, 78, 78))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(labelFecha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(LabelHora)))
                    .addComponent(label_planadocenteActual1))
                .addGap(20, 20, 20))
        );

        jMenu7.setText("-");
        jMenuBar1.add(jMenu7);

        Menu_BuscarEstudiantes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Menu_BuscarEstudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        Menu_BuscarEstudiantes.setText("Buscar Estudiante");
        Menu_BuscarEstudiantes.setToolTipText("Buscar Datos de un Estudiante");
        Menu_BuscarEstudiantes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Menu_BuscarEstudiantes.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Menu_BuscarEstudiantes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Menu_BuscarEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_BuscarEstudiantesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu_BuscarEstudiantesMousePressed(evt);
            }
        });
        jMenuBar1.add(Menu_BuscarEstudiantes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcmb_tipoFiltro_5añosInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_tipoFiltro_5añosInicialActionPerformed
        txt_filtroCodigo_5añosInicial.setText("");
        txt_filtroCodigo_5añosInicial.requestFocus();

    }//GEN-LAST:event_jcmb_tipoFiltro_5añosInicialActionPerformed

    private void txt_filtroCodigo_5añosInicialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroCodigo_5añosInicialKeyReleased

        try
        {// en texto escrito a consultar en la tabla
            String texto="%"+txt_filtroCodigo_5añosInicial.getText().trim()+"%";

            // secuberra el tipo de filtro
            String filtroSelec=jcmb_tipoFiltro_5añosInicial.getSelectedItem().toString();

            // ETIQUETAS DE EMCABEZADO DE TABLA
            String[] titulos={"DNI", "NOMBRE", "APELLIDOS", "FECHA REGISTRO", "ESTADO", "TUTOR"};
            model_5Inicial=new DefaultTableModel(null,titulos);

            // FUNCIONES DEPENDIENDO DEL TIPO DE FILTRO ELEGIDO
            switch (filtroSelec)
            {//*********** FILTRO PARA NOMBRE DE CLIENTES ************
                case"Nombre":

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1= cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_5años_inicial where Nombre_est like"+'"'+texto+'"');
                String[] fila1= new String[6];
                ResultSet resul1=pst1.executeQuery();
                Tabla_5añosInicial = new JTable(model_5Inicial);
                jScrollPane_5añosInicial.setViewportView(Tabla_5añosInicial);

                //recuperar valores de BD A LA TABLA
                while(resul1.next())
                {
                    fila1[0]=resul1.getString("Dni_est");
                    fila1[1]=resul1.getString("Nombre_est");
                    fila1[2]=resul1.getString("Apellidos_est");
                    fila1[3]=resul1.getString("FechaRegistro");
                    fila1[4]=resul1.getString("Estado");
                    fila1[5]=resul1.getString("nombre_tutor");
                    model_5Inicial.addRow(fila1);
                }
                cn1.close();

                // EVENTO EN LA TABLA
                Tabla_5añosInicial.addMouseListener(new MouseAdapter()
                    {
                        @Override
                        public void mouseClicked(MouseEvent e)
                        {// recuperar celda celecionada
                            int fila_poin=Tabla_5añosInicial.rowAtPoint(e.getPoint());
                            if(fila_poin>-1)
                            { //recuperar codigo de la celda celecionda
                                String dni_padre= (String)model_5Inicial.getValueAt(fila_poin,0);
                                try {
                                    // llamar metodo bucar rodctos ára que muestre la infromacion del producto selecionado
                                    MensajeroInfromacionEstudiante(dni_padre);
                                } catch (IOException ex) {
                                    Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                }

                            }
                        }
                    });
                    break;
                    //********** FILTRO DE APELLIDOS DE CLIENTES **********
                    case"Apellidos":

                    Connection cn2= Conexion.Conectar();
                    PreparedStatement pst2= cn2.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                        + "    FechaRegistro,Estado,nombre_tutor from tabla_5años_inicial where Apellidos_est like"+'"'+texto+'"');
                    String[] fila2= new String[6];
                    ResultSet resul2=pst2.executeQuery();
                    Tabla_5añosInicial = new JTable(model_5Inicial);
                    jScrollPane_5añosInicial.setViewportView(Tabla_5añosInicial);

                    //recuperar valores de BD A LA TABLA
                    while(resul2.next())
                    {
                        fila2[0]=resul2.getString("Dni_est");
                        fila2[1]=resul2.getString("Nombre_est");
                        fila2[2]=resul2.getString("Apellidos_est");
                        fila2[3]=resul2.getString("FechaRegistro");
                        fila2[4]=resul2.getString("Estado");
                        fila2[5]=resul2.getString("nombre_tutor");
                        model_5Inicial.addRow(fila2);
                    }
                    cn2.close();

                    // EVENTO EN LA TABLA
                    Tabla_5añosInicial.addMouseListener(new MouseAdapter()
                        {
                            @Override
                            public void mouseClicked(MouseEvent e)
                            {// recuperar celda celecionada
                                int fila_poin=Tabla_5añosInicial.rowAtPoint(e.getPoint());
                                if(fila_poin>-1)
                                { //recuperar codigo de la celda celecionda
                                    String dni_padre= (String)model_5Inicial.getValueAt(fila_poin,0);
                                    try {
                                        MensajeroInfromacionEstudiante(dni_padre);
                                    } catch (IOException ex) {
                                        Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                    }

                                }
                            }
                        });
                        break;

                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                        case"DNI":

                        Connection cn3= Conexion.Conectar();
                        PreparedStatement pst3= cn3.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                            + "    FechaRegistro,Estado,nombre_tutor from tabla_5años_inicial where Dni_est like"+'"'+texto+'"');
                        String[] fila3= new String[6];
                        ResultSet resul3=pst3.executeQuery();
                        Tabla_5añosInicial = new JTable(model_5Inicial);
                        jScrollPane_5añosInicial.setViewportView(Tabla_5añosInicial);

                        //recuperar valores de BD A LA TABLA
                        while(resul3.next())
                        {
                            fila3[0]=resul3.getString("Dni_est");
                            fila3[1]=resul3.getString("Nombre_est");
                            fila3[2]=resul3.getString("Apellidos_est");
                            fila3[3]=resul3.getString("FechaRegistro");
                            fila3[4]=resul3.getString("Estado");
                            fila3[5]=resul3.getString("nombre_tutor");
                            model_5Inicial.addRow(fila3);
                        }
                        cn3.close();

                        // EVENTO EN LA TABLA
                        Tabla_5añosInicial.addMouseListener(new MouseAdapter()
                            {
                                @Override
                                public void mouseClicked(MouseEvent e)
                                {// recuperar celda celecionada
                                    int fila_poin=Tabla_5añosInicial.rowAtPoint(e.getPoint());
                                    if(fila_poin>-1)
                                    { //recuperar codigo de la celda celecionda
                                        String dni_padre= (String)model_5Inicial.getValueAt(fila_poin,0);
                                        try {
                                            // llamar metodo bucar rodctos ára que muestre la infromacion del producto selecionado
                                            MensajeroInfromacionEstudiante(dni_padre);
                                        } catch (IOException ex) {
                                            Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }
                                }
                            });
                            break;
                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                        case"Estado":

                        Connection cn4= Conexion.Conectar();
                        PreparedStatement pst4= cn4.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                            + "    FechaRegistro,Estado,nombre_tutor from tabla_5años_inicial where Estado like"+'"'+texto+'"');
                        String[] fila4= new String[6];
                        ResultSet resul4=pst4.executeQuery();
                        Tabla_5añosInicial = new JTable(model_5Inicial);
                        jScrollPane_5añosInicial.setViewportView(Tabla_5añosInicial);

                        //recuperar valores de BD A LA TABLA
                        while(resul4.next())
                        {
                            fila4[0]=resul4.getString("Dni_est");
                            fila4[1]=resul4.getString("Nombre_est");
                            fila4[2]=resul4.getString("Apellidos_est");
                            fila4[3]=resul4.getString("FechaRegistro");
                            fila4[4]=resul4.getString("Estado");
                            fila4[5]=resul4.getString("nombre_tutor");
                            model_5Inicial.addRow(fila4);
                        }
                        cn4.close();

                        // EVENTO EN LA TABLA
                        Tabla_5añosInicial.addMouseListener(new MouseAdapter()
                            {
                                @Override
                                public void mouseClicked(MouseEvent e)
                                {// recuperar celda celecionada
                                    int fila_poin=Tabla_5añosInicial.rowAtPoint(e.getPoint());
                                    if(fila_poin>-1)
                                    { //recuperar codigo de la celda celecionda
                                        String dni_padre= (String)model_5Inicial.getValueAt(fila_poin,0);
                                        try {
                                            MensajeroInfromacionEstudiante(dni_padre);
                                        } catch (IOException ex) {
                                            Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }
                                }
                            });
                            break;
                        }
                    } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error al filtar "+jcmb_tipoFiltro_5añosInicial.getSelectedItem().toString()+"","",JOptionPane.ERROR_MESSAGE);
                        System.err.println("error al filtar la busqueda: "+e); }
    }//GEN-LAST:event_txt_filtroCodigo_5añosInicialKeyReleased

    private void txt_filtroCodigo_5añosInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtroCodigo_5añosInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filtroCodigo_5añosInicialActionPerformed

    private void Boton_5añosInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_5añosInicialActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        String[] TitulosSecundaria={"DNI","NOMBRE","APELLIDOS","FECHA REGISTRO","ESTADO","TUTOR"};

        // en texto escrito a consultar en la tabla
        String año=cmb_5añosInicial.getSelectedItem().toString();

        if(año=="Todos")
        {
            //agregamos datos la tabla estudiantes del 1 secundaria
            try {
                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_5años_inicial");
                ResultSet result1=pst1.executeQuery();
                model_5Inicial=new DefaultTableModel(null,TitulosSecundaria);
                Tabla_5añosInicial=new JTable(model_5Inicial);
                jScrollPane_5añosInicial.setViewportView(Tabla_5añosInicial);
                while(result1.next()){
                    Object[] columna=new Object[6];
                    for(int i=0;i<6;i++){
                        columna[i]=result1.getObject(i+1);
                    }
                    model_5Inicial.addRow(columna);
                }
                cn1.close();

            } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos de 5 Años Inicial");
                System.err.println("ERROR, al rellenar tabla de 5 Años Inicial:"+e); }

        }
        else
        {
            //agregamos datos la tabla estudiantes del 1 secundaria
            try {
                String añoSeleccionado="%"+cmb_5añosInicial.getSelectedItem().toString()+"%";

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_5años_inicial where FechaRegistro like"+'"'+añoSeleccionado+'"');
                ResultSet result1=pst1.executeQuery();
                model_5Inicial=new DefaultTableModel(null,TitulosSecundaria);
                Tabla_5añosInicial=new JTable(model_5Inicial);
                jScrollPane_5añosInicial.setViewportView(Tabla_5añosInicial);
                while(result1.next()){
                    Object[] columna=new Object[6];
                    for(int i=0;i<6;i++){
                        columna[i]=result1.getObject(i+1);
                    }
                    model_5Inicial.addRow(columna);
                }
                cn1.close();

            } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos de 5 Años Inicial");
                System.err.println("ERROR, al rellenar tabla de 5 Años Inicial:"+e); }

        }
    }//GEN-LAST:event_Boton_5añosInicialActionPerformed

    private void Boton_4añosInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_4añosInicialActionPerformed
        // TODO add your handling code here:
        String[] TitulosSecundaria={"DNI","NOMBRE","APELLIDOS","FECHA REGISTRO","ESTADO","TUTOR"};

        // en texto escrito a consultar en la tabla
        String año=cmb_4añosInicial.getSelectedItem().toString();

        if(año=="Todos")
        {
            //agregamos datos la tabla estudiantes del 1 secundaria
            try {
                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_4años_inicial");
                ResultSet result1=pst1.executeQuery();
                model_4Inicial=new DefaultTableModel(null,TitulosSecundaria);
                Tabla_4añosInicial=new JTable(model_4Inicial);
                jScrollPane_4añosInicial.setViewportView(Tabla_4añosInicial);
                while(result1.next()){
                    Object[] columna=new Object[6];
                    for(int i=0;i<6;i++){
                        columna[i]=result1.getObject(i+1);
                    }
                    model_4Inicial.addRow(columna);
                }
                cn1.close();

            } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos de 4 Años Inicial");
                System.err.println("ERROR, al rellenar tabla de 4 Años Inicial:"+e); }

        }
        else
        {
            //agregamos datos la tabla estudiantes del 1 secundaria
            try {
                String añoSeleccionado="%"+cmb_4añosInicial.getSelectedItem().toString()+"%";

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_4años_inicial where FechaRegistro like"+'"'+añoSeleccionado+'"');
                ResultSet result1=pst1.executeQuery();
                model_4Inicial=new DefaultTableModel(null,TitulosSecundaria);
                Tabla_4añosInicial=new JTable(model_4Inicial);
                jScrollPane_4añosInicial.setViewportView(Tabla_4añosInicial);
                while(result1.next()){
                    Object[] columna=new Object[6];
                    for(int i=0;i<6;i++){
                        columna[i]=result1.getObject(i+1);
                    }
                    model_4Inicial.addRow(columna);
                }
                cn1.close();

            } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos de 4 Años Inicial");
                System.err.println("ERROR, al rellenar tabla de 4 Años Inicial:"+e); }

        }
    }//GEN-LAST:event_Boton_4añosInicialActionPerformed

    private void txt_filtroCodigo_4añosInicialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroCodigo_4añosInicialKeyReleased
        // TODO add your handling code here:
        // TODO add your handling code here:
        try
        {// en texto escrito a consultar en la tabla
            String texto="%"+txt_filtroCodigo_4añosInicial.getText().trim()+"%";

            // secuberra el tipo de filtro
            String filtroSelec=jcmb_tipoFiltro_4añosInicial.getSelectedItem().toString();

            // ETIQUETAS DE EMCABEZADO DE TABLA
            String[] titulos={"DNI", "NOMBRE", "APELLIDOS", "FECHA REGISTRO", "ESTADO", "TUTOR"};
            model_4Inicial=new DefaultTableModel(null,titulos);

            // FUNCIONES DEPENDIENDO DEL TIPO DE FILTRO ELEGIDO
            switch (filtroSelec)
            {//*********** FILTRO PARA NOMBRE DE CLIENTES ************
                case"Nombre":

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1= cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_4años_inicial where Nombre_est like"+'"'+texto+'"');
                String[] fila1= new String[6];
                ResultSet resul1=pst1.executeQuery();
                Tabla_4añosInicial = new JTable(model_4Inicial);
                jScrollPane_4añosInicial.setViewportView(Tabla_4añosInicial);

                //recuperar valores de BD A LA TABLA
                while(resul1.next())
                {
                    fila1[0]=resul1.getString("Dni_est");
                    fila1[1]=resul1.getString("Nombre_est");
                    fila1[2]=resul1.getString("Apellidos_est");
                    fila1[3]=resul1.getString("FechaRegistro");
                    fila1[4]=resul1.getString("Estado");
                    fila1[5]=resul1.getString("nombre_tutor");
                    model_4Inicial.addRow(fila1);
                }
                cn1.close();

                // EVENTO EN LA TABLA
                Tabla_4añosInicial.addMouseListener(new MouseAdapter()
                    {
                        @Override
                        public void mouseClicked(MouseEvent e)
                        {// recuperar celda celecionada
                            int fila_poin=Tabla_4añosInicial.rowAtPoint(e.getPoint());
                            if(fila_poin>-1)
                            { //recuperar codigo de la celda celecionda
                                String dni_padre= (String)model_4Inicial.getValueAt(fila_poin,0);
                                try {
                                    MensajeroInfromacionEstudiante(dni_padre);
                                } catch (IOException ex) {
                                    Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                }

                            }
                        }
                    });
                    break;
                    //********** FILTRO DE APELLIDOS DE CLIENTES **********
                    case"Apellidos":

                    Connection cn2= Conexion.Conectar();
                    PreparedStatement pst2= cn2.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                        + "    FechaRegistro,Estado,nombre_tutor from tabla_4años_inicial where Apellidos_est like"+'"'+texto+'"');
                    String[] fila2= new String[6];
                    ResultSet resul2=pst2.executeQuery();
                    Tabla_4añosInicial = new JTable(model_4Inicial);
                    jScrollPane_4añosInicial.setViewportView(Tabla_4añosInicial);

                    //recuperar valores de BD A LA TABLA
                    while(resul2.next())
                    {
                        fila2[0]=resul2.getString("Dni_est");
                        fila2[1]=resul2.getString("Nombre_est");
                        fila2[2]=resul2.getString("Apellidos_est");
                        fila2[3]=resul2.getString("FechaRegistro");
                        fila2[4]=resul2.getString("Estado");
                        fila2[5]=resul2.getString("nombre_tutor");
                        model_4Inicial.addRow(fila2);
                    }
                    cn2.close();

                    // EVENTO EN LA TABLA
                    Tabla_4añosInicial.addMouseListener(new MouseAdapter()
                        {
                            @Override
                            public void mouseClicked(MouseEvent e)
                            {// recuperar celda celecionada
                                int fila_poin=Tabla_4añosInicial.rowAtPoint(e.getPoint());
                                if(fila_poin>-1)
                                { //recuperar codigo de la celda celecionda
                                    String dni_padre= (String)model_4Inicial.getValueAt(fila_poin,0);
                                    try {
                                        MensajeroInfromacionEstudiante(dni_padre);
                                    } catch (IOException ex) {
                                        Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                    }

                                }
                            }
                        });
                        break;

                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                        case"DNI":

                        Connection cn3= Conexion.Conectar();
                        PreparedStatement pst3= cn3.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                            + "    FechaRegistro,Estado,nombre_tutor from tabla_4años_inicial where Dni_est like"+'"'+texto+'"');
                        String[] fila3= new String[6];
                        ResultSet resul3=pst3.executeQuery();
                        Tabla_4añosInicial = new JTable(model_4Inicial);
                        jScrollPane_4añosInicial.setViewportView(Tabla_4añosInicial);

                        //recuperar valores de BD A LA TABLA
                        while(resul3.next())
                        {
                            fila3[0]=resul3.getString("Dni_est");
                            fila3[1]=resul3.getString("Nombre_est");
                            fila3[2]=resul3.getString("Apellidos_est");
                            fila3[3]=resul3.getString("FechaRegistro");
                            fila3[4]=resul3.getString("Estado");
                            fila3[5]=resul3.getString("nombre_tutor");
                            model_4Inicial.addRow(fila3);
                        }
                        cn3.close();

                        // EVENTO EN LA TABLA
                        Tabla_4añosInicial.addMouseListener(new MouseAdapter()
                            {
                                @Override
                                public void mouseClicked(MouseEvent e)
                                {// recuperar celda celecionada
                                    int fila_poin=Tabla_4añosInicial.rowAtPoint(e.getPoint());
                                    if(fila_poin>-1)
                                    { //recuperar codigo de la celda celecionda
                                        String dni_padre= (String)model_4Inicial.getValueAt(fila_poin,0);
                                        try {
                                            MensajeroInfromacionEstudiante(dni_padre);
                                        } catch (IOException ex) {
                                            Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }
                                }
                            });
                            break;
                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                        case"Estado":

                        Connection cn4= Conexion.Conectar();
                        PreparedStatement pst4= cn4.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                            + "    FechaRegistro,Estado,nombre_tutor from tabla_4años_inicial where Estado like"+'"'+texto+'"');
                        String[] fila4= new String[6];
                        ResultSet resul4=pst4.executeQuery();
                        Tabla_4añosInicial = new JTable(model_4Inicial);
                        jScrollPane_4añosInicial.setViewportView(Tabla_4añosInicial);

                        //recuperar valores de BD A LA TABLA
                        while(resul4.next())
                        {
                            fila4[0]=resul4.getString("Dni_est");
                            fila4[1]=resul4.getString("Nombre_est");
                            fila4[2]=resul4.getString("Apellidos_est");
                            fila4[3]=resul4.getString("FechaRegistro");
                            fila4[4]=resul4.getString("Estado");
                            fila4[5]=resul4.getString("nombre_tutor");
                            model_4Inicial.addRow(fila4);
                        }
                        cn4.close();

                        // EVENTO EN LA TABLA
                        Tabla_4añosInicial.addMouseListener(new MouseAdapter()
                            {
                                @Override
                                public void mouseClicked(MouseEvent e)
                                {// recuperar celda celecionada
                                    int fila_poin=Tabla_4añosInicial.rowAtPoint(e.getPoint());
                                    if(fila_poin>-1)
                                    { //recuperar codigo de la celda celecionda
                                        String dni_padre= (String)model_4Inicial.getValueAt(fila_poin,0);
                                        try {
                                            MensajeroInfromacionEstudiante(dni_padre);
                                        } catch (IOException ex) {
                                            Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }
                                }
                            });
                            break;
                        }
                    } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error al filtar "+jcmb_tipoFiltro_4añosInicial.getSelectedItem().toString()+"","",JOptionPane.ERROR_MESSAGE);
                        System.err.println("error al filtar la busqueda: "+e); }
    }//GEN-LAST:event_txt_filtroCodigo_4añosInicialKeyReleased

    private void txt_filtroCodigo_4añosInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtroCodigo_4añosInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filtroCodigo_4añosInicialActionPerformed

    private void jcmb_tipoFiltro_4añosInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_tipoFiltro_4añosInicialActionPerformed
        txt_filtroCodigo_4añosInicial.setText("");
        txt_filtroCodigo_4añosInicial.requestFocus();
    }//GEN-LAST:event_jcmb_tipoFiltro_4añosInicialActionPerformed

    private void txt_filtroCodigo_6primariaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroCodigo_6primariaKeyReleased
        // TODO add your handling code here:
        try
        {// en texto escrito a consultar en la tabla
            String texto="%"+txt_filtroCodigo_6primaria.getText().trim()+"%";

            // secuberra el tipo de filtro
            String filtroSelec=jcmb_tipoFiltro_6primaria.getSelectedItem().toString();

            // ETIQUETAS DE EMCABEZADO DE TABLA
            String[] titulos={"DNI", "NOMBRE", "APELLIDOS", "FECHA REGISTRO", "ESTADO", "TUTOR"};
            model_6Primaria=new DefaultTableModel(null,titulos);

            // FUNCIONES DEPENDIENDO DEL TIPO DE FILTRO ELEGIDO
            switch (filtroSelec)
            {//*********** FILTRO PARA NOMBRE DE CLIENTES ************
                case"Nombre":

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1= cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_sexto_primaria where Nombre_est like"+'"'+texto+'"');
                String[] fila1= new String[6];
                ResultSet resul1=pst1.executeQuery();
                Tabla_6toPrimaria = new JTable(model_6Primaria);
                jScrollPane_6toPrimaria.setViewportView(Tabla_6toPrimaria);

                //recuperar valores de BD A LA TABLA
                while(resul1.next())
                {
                    fila1[0]=resul1.getString("Dni_est");
                    fila1[1]=resul1.getString("Nombre_est");
                    fila1[2]=resul1.getString("Apellidos_est");
                    fila1[3]=resul1.getString("FechaRegistro");
                    fila1[4]=resul1.getString("Estado");
                    fila1[5]=resul1.getString("nombre_tutor");
                    model_6Primaria.addRow(fila1);
                }
                cn1.close();

                // EVENTO EN LA TABLA
                Tabla_6toPrimaria.addMouseListener(new MouseAdapter()
                    {
                        @Override
                        public void mouseClicked(MouseEvent e)
                        {// recuperar celda celecionada
                            int fila_poin=Tabla_6toPrimaria.rowAtPoint(e.getPoint());
                            if(fila_poin>-1)
                            { //recuperar codigo de la celda celecionda
                                String dni_padre= (String)model_6Primaria.getValueAt(fila_poin,0);
                                try {
                                    MensajeroInfromacionEstudiante(dni_padre);
                                } catch (IOException ex) {
                                    Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                }

                            }
                        }
                    });
                    break;
                    //********** FILTRO DE APELLIDOS DE CLIENTES **********
                    case"Apellidos":

                    Connection cn2= Conexion.Conectar();
                    PreparedStatement pst2= cn2.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                        + "    FechaRegistro,Estado,nombre_tutor from tabla_sexto_primaria where Apellidos_est like"+'"'+texto+'"');
                    String[] fila2= new String[6];
                    ResultSet resul2=pst2.executeQuery();
                    Tabla_6toPrimaria = new JTable(model_6Primaria);
                    jScrollPane_6toPrimaria.setViewportView(Tabla_6toPrimaria);

                    //recuperar valores de BD A LA TABLA
                    while(resul2.next())
                    {
                        fila2[0]=resul2.getString("Dni_est");
                        fila2[1]=resul2.getString("Nombre_est");
                        fila2[2]=resul2.getString("Apellidos_est");
                        fila2[3]=resul2.getString("FechaRegistro");
                        fila2[4]=resul2.getString("Estado");
                        fila2[5]=resul2.getString("nombre_tutor");
                        model_6Primaria.addRow(fila2);
                    }
                    cn2.close();

                    // EVENTO EN LA TABLA
                    Tabla_6toPrimaria.addMouseListener(new MouseAdapter()
                        {
                            @Override
                            public void mouseClicked(MouseEvent e)
                            {// recuperar celda celecionada
                                int fila_poin=Tabla_6toPrimaria.rowAtPoint(e.getPoint());
                                if(fila_poin>-1)
                                { //recuperar codigo de la celda celecionda
                                    String dni_padre= (String)model_6Primaria.getValueAt(fila_poin,0);
                                    try {
                                        MensajeroInfromacionEstudiante(dni_padre);
                                    } catch (IOException ex) {
                                        Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                    }

                                }
                            }
                        });
                        break;

                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                        case"DNI":

                        Connection cn3= Conexion.Conectar();
                        PreparedStatement pst3= cn3.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                            + "    FechaRegistro,Estado,nombre_tutor from tabla_sexto_primaria where Dni_est like"+'"'+texto+'"');
                        String[] fila3= new String[6];
                        ResultSet resul3=pst3.executeQuery();
                        Tabla_6toPrimaria = new JTable(model_6Primaria);
                        jScrollPane_6toPrimaria.setViewportView(Tabla_6toPrimaria);

                        //recuperar valores de BD A LA TABLA
                        while(resul3.next())
                        {
                            fila3[0]=resul3.getString("Dni_est");
                            fila3[1]=resul3.getString("Nombre_est");
                            fila3[2]=resul3.getString("Apellidos_est");
                            fila3[3]=resul3.getString("FechaRegistro");
                            fila3[4]=resul3.getString("Estado");
                            fila3[5]=resul3.getString("nombre_tutor");
                            model_6Primaria.addRow(fila3);
                        }
                        cn3.close();

                        // EVENTO EN LA TABLA
                        Tabla_6toPrimaria.addMouseListener(new MouseAdapter()
                            {
                                @Override
                                public void mouseClicked(MouseEvent e)
                                {// recuperar celda celecionada
                                    int fila_poin=Tabla_6toPrimaria.rowAtPoint(e.getPoint());
                                    if(fila_poin>-1)
                                    { //recuperar codigo de la celda celecionda
                                        String dni_padre= (String)model_6Primaria.getValueAt(fila_poin,0);
                                        try {
                                            MensajeroInfromacionEstudiante(dni_padre);
                                        } catch (IOException ex) {
                                            Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }
                                }
                            });
                            break;
                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                        case"Estado":

                        Connection cn4= Conexion.Conectar();
                        PreparedStatement pst4= cn4.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                            + "    FechaRegistro,Estado,nombre_tutor from tabla_sexto_primaria where Estado like"+'"'+texto+'"');
                        String[] fila4= new String[6];
                        ResultSet resul4=pst4.executeQuery();
                        Tabla_6toPrimaria = new JTable(model_6Primaria);
                        jScrollPane_6toPrimaria.setViewportView(Tabla_6toPrimaria);

                        //recuperar valores de BD A LA TABLA
                        while(resul4.next())
                        {
                            fila4[0]=resul4.getString("Dni_est");
                            fila4[1]=resul4.getString("Nombre_est");
                            fila4[2]=resul4.getString("Apellidos_est");
                            fila4[3]=resul4.getString("FechaRegistro");
                            fila4[4]=resul4.getString("Estado");
                            fila4[5]=resul4.getString("nombre_tutor");
                            model_6Primaria.addRow(fila4);
                        }
                        cn4.close();

                        // EVENTO EN LA TABLA
                        Tabla_6toPrimaria.addMouseListener(new MouseAdapter()
                            {
                                @Override
                                public void mouseClicked(MouseEvent e)
                                {// recuperar celda celecionada
                                    int fila_poin=Tabla_6toPrimaria.rowAtPoint(e.getPoint());
                                    if(fila_poin>-1)
                                    { //recuperar codigo de la celda celecionda
                                        String dni_padre= (String)model_6Primaria.getValueAt(fila_poin,0);
                                        try {
                                            MensajeroInfromacionEstudiante(dni_padre);
                                        } catch (IOException ex) {
                                            Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }
                                }
                            });
                            break;
                        }
                    } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error al filtar "+jcmb_tipoFiltro_6primaria.getSelectedItem().toString()+"","",JOptionPane.ERROR_MESSAGE);
                        System.err.println("error al filtar la busqueda: "+e); }
    }//GEN-LAST:event_txt_filtroCodigo_6primariaKeyReleased

    private void txt_filtroCodigo_6primariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtroCodigo_6primariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filtroCodigo_6primariaActionPerformed

    private void jcmb_tipoFiltro_6primariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_tipoFiltro_6primariaActionPerformed
        txt_filtroCodigo_6primaria.setText("");
        txt_filtroCodigo_6primaria.requestFocus();

    }//GEN-LAST:event_jcmb_tipoFiltro_6primariaActionPerformed

    private void Boton_6primariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_6primariaActionPerformed
        String[] TitulosSecundaria={"DNI","NOMBRE","APELLIDOS","FECHA REGISTRO","ESTADO","TUTOR"};

        // en texto escrito a consultar en la tabla
        String año=cmb_6primaria.getSelectedItem().toString();

        if(año=="Todos")
        {
            //agregamos datos la tabla estudiantes del 1 secundaria
            try {
                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_sexto_primaria");
                ResultSet result1=pst1.executeQuery();
                model_6Primaria=new DefaultTableModel(null,TitulosSecundaria);
                Tabla_6toPrimaria=new JTable(model_6Primaria);
                jScrollPane_6toPrimaria.setViewportView(Tabla_6toPrimaria);
                while(result1.next()){
                    Object[] columna=new Object[6];
                    for(int i=0;i<6;i++){
                        columna[i]=result1.getObject(i+1);
                    }
                    model_6Primaria.addRow(columna);
                }
                cn1.close();

            } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 6to de primaria");
                System.err.println("ERROR, al rellenar tabla del 6to primaria:"+e); }

        }
        else
        {
            //agregamos datos la tabla estudiantes del 1 secundaria
            try {
                String añoSeleccionado="%"+cmb_6primaria.getSelectedItem().toString()+"%";

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_sexto_primaria where FechaRegistro like"+'"'+añoSeleccionado+'"');
                ResultSet result1=pst1.executeQuery();
                model_6Primaria=new DefaultTableModel(null,TitulosSecundaria);
                Tabla_6toPrimaria=new JTable(model_6Primaria);
                jScrollPane_6toPrimaria.setViewportView(Tabla_6toPrimaria);
                while(result1.next()){
                    Object[] columna=new Object[6];
                    for(int i=0;i<6;i++){
                        columna[i]=result1.getObject(i+1);
                    }
                    model_6Primaria.addRow(columna);
                }
                cn1.close();

            } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 6to de primaria");
                System.err.println("ERROR, al rellenar tabla del 6to primaria:"+e); }

        }
    }//GEN-LAST:event_Boton_6primariaActionPerformed

    private void txt_filtroCodigo_5primariaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroCodigo_5primariaKeyReleased
        try
        {// en texto escrito a consultar en la tabla
            String texto="%"+txt_filtroCodigo_5primaria.getText().trim()+"%";

            // secuberra el tipo de filtro
            String filtroSelec=jcmb_tipoFiltro_5primaria.getSelectedItem().toString();

            // ETIQUETAS DE EMCABEZADO DE TABLA
            String[] titulos={"DNI", "NOMBRE", "APELLIDOS", "FECHA REGISTRO", "ESTADO", "TUTOR"};
            model_5Primaria=new DefaultTableModel(null,titulos);

            // FUNCIONES DEPENDIENDO DEL TIPO DE FILTRO ELEGIDO
            switch (filtroSelec)
            {//*********** FILTRO PARA NOMBRE DE CLIENTES ************
                case"Nombre":

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1= cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_quinto_primaria where Nombre_est like"+'"'+texto+'"');
                String[] fila1= new String[6];
                ResultSet resul1=pst1.executeQuery();
                Tabla_5toPrimaria = new JTable(model_5Primaria);
                jScrollPane_5toPrimaria.setViewportView(Tabla_5toPrimaria);

                //recuperar valores de BD A LA TABLA
                while(resul1.next())
                {
                    fila1[0]=resul1.getString("Dni_est");
                    fila1[1]=resul1.getString("Nombre_est");
                    fila1[2]=resul1.getString("Apellidos_est");
                    fila1[3]=resul1.getString("FechaRegistro");
                    fila1[4]=resul1.getString("Estado");
                    fila1[5]=resul1.getString("nombre_tutor");
                    model_5Primaria.addRow(fila1);
                }
                cn1.close();

                // EVENTO EN LA TABLA
                Tabla_5toPrimaria.addMouseListener(new MouseAdapter()
                    {
                        @Override
                        public void mouseClicked(MouseEvent e)
                        {// recuperar celda celecionada
                            int fila_poin=Tabla_5toPrimaria.rowAtPoint(e.getPoint());
                            if(fila_poin>-1)
                            { //recuperar codigo de la celda celecionda
                                String dni_padre= (String)model_5Primaria.getValueAt(fila_poin,0);
                                try {
                                    MensajeroInfromacionEstudiante(dni_padre);
                                } catch (IOException ex) {
                                    Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                }

                            }
                        }
                    });
                    break;
                    //********** FILTRO DE APELLIDOS DE CLIENTES **********
                    case"Apellidos":

                    Connection cn2= Conexion.Conectar();
                    PreparedStatement pst2= cn2.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                        + "    FechaRegistro,Estado,nombre_tutor from tabla_quinto_primaria where Apellidos_est like"+'"'+texto+'"');
                    String[] fila2= new String[6];
                    ResultSet resul2=pst2.executeQuery();
                    Tabla_5toPrimaria = new JTable(model_5Primaria);
                    jScrollPane_5toPrimaria.setViewportView(Tabla_5toPrimaria);

                    //recuperar valores de BD A LA TABLA
                    while(resul2.next())
                    {
                        fila2[0]=resul2.getString("Dni_est");
                        fila2[1]=resul2.getString("Nombre_est");
                        fila2[2]=resul2.getString("Apellidos_est");
                        fila2[3]=resul2.getString("FechaRegistro");
                        fila2[4]=resul2.getString("Estado");
                        fila2[5]=resul2.getString("nombre_tutor");
                        model_5Primaria.addRow(fila2);
                    }
                    cn2.close();

                    // EVENTO EN LA TABLA
                    Tabla_5toPrimaria.addMouseListener(new MouseAdapter()
                        {
                            @Override
                            public void mouseClicked(MouseEvent e)
                            {// recuperar celda celecionada
                                int fila_poin=Tabla_5toPrimaria.rowAtPoint(e.getPoint());
                                if(fila_poin>-1)
                                { //recuperar codigo de la celda celecionda
                                    String dni_padre= (String)model_5Primaria.getValueAt(fila_poin,0);
                                    try {
                                        MensajeroInfromacionEstudiante(dni_padre);
                                    } catch (IOException ex) {
                                        Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                    }

                                }
                            }
                        });
                        break;

                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                        case"DNI":

                        Connection cn3= Conexion.Conectar();
                        PreparedStatement pst3= cn3.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                            + "    FechaRegistro,Estado,nombre_tutor from tabla_quinto_primaria where Dni_est like"+'"'+texto+'"');
                        String[] fila3= new String[6];
                        ResultSet resul3=pst3.executeQuery();
                        Tabla_5toPrimaria = new JTable(model_5Primaria);
                        jScrollPane_5toPrimaria.setViewportView(Tabla_5toPrimaria);

                        //recuperar valores de BD A LA TABLA
                        while(resul3.next())
                        {
                            fila3[0]=resul3.getString("Dni_est");
                            fila3[1]=resul3.getString("Nombre_est");
                            fila3[2]=resul3.getString("Apellidos_est");
                            fila3[3]=resul3.getString("FechaRegistro");
                            fila3[4]=resul3.getString("Estado");
                            fila3[5]=resul3.getString("nombre_tutor");
                            model_5Primaria.addRow(fila3);
                        }
                        cn3.close();

                        // EVENTO EN LA TABLA
                        Tabla_5toPrimaria.addMouseListener(new MouseAdapter()
                            {
                                @Override
                                public void mouseClicked(MouseEvent e)
                                {// recuperar celda celecionada
                                    int fila_poin=Tabla_5toPrimaria.rowAtPoint(e.getPoint());
                                    if(fila_poin>-1)
                                    { //recuperar codigo de la celda celecionda
                                        String dni_padre= (String)model_5Primaria.getValueAt(fila_poin,0);
                                        try {
                                            MensajeroInfromacionEstudiante(dni_padre);
                                        } catch (IOException ex) {
                                            Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }
                                }
                            });
                            break;
                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                        case"Estado":

                        Connection cn4= Conexion.Conectar();
                        PreparedStatement pst4= cn4.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                            + "    FechaRegistro,Estado,nombre_tutor from tabla_quinto_primaria where Estado like"+'"'+texto+'"');
                        String[] fila4= new String[6];
                        ResultSet resul4=pst4.executeQuery();
                        Tabla_5toPrimaria = new JTable(model_5Primaria);
                        jScrollPane_5toPrimaria.setViewportView(Tabla_5toPrimaria);

                        //recuperar valores de BD A LA TABLA
                        while(resul4.next())
                        {
                            fila4[0]=resul4.getString("Dni_est");
                            fila4[1]=resul4.getString("Nombre_est");
                            fila4[2]=resul4.getString("Apellidos_est");
                            fila4[3]=resul4.getString("FechaRegistro");
                            fila4[4]=resul4.getString("Estado");
                            fila4[5]=resul4.getString("nombre_tutor");
                            model_5Primaria.addRow(fila4);
                        }
                        cn4.close();

                        // EVENTO EN LA TABLA
                        Tabla_5toPrimaria.addMouseListener(new MouseAdapter()
                            {
                                @Override
                                public void mouseClicked(MouseEvent e)
                                {// recuperar celda celecionada
                                    int fila_poin=Tabla_5toPrimaria.rowAtPoint(e.getPoint());
                                    if(fila_poin>-1)
                                    { //recuperar codigo de la celda celecionda
                                        String dni_padre= (String)model_5Primaria.getValueAt(fila_poin,0);
                                        try {
                                            MensajeroInfromacionEstudiante(dni_padre);
                                        } catch (IOException ex) {
                                            Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }
                                }
                            });
                            break;
                        }
                    } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error al filtar "+jcmb_tipoFiltro_5primaria.getSelectedItem().toString()+"","",JOptionPane.ERROR_MESSAGE);
                        System.err.println("error al filtar la busqueda: "+e); }
    }//GEN-LAST:event_txt_filtroCodigo_5primariaKeyReleased

    private void txt_filtroCodigo_5primariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtroCodigo_5primariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filtroCodigo_5primariaActionPerformed

    private void jcmb_tipoFiltro_5primariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_tipoFiltro_5primariaActionPerformed
        txt_filtroCodigo_5primaria.setText("");
        txt_filtroCodigo_5primaria.requestFocus();
    }//GEN-LAST:event_jcmb_tipoFiltro_5primariaActionPerformed

    private void Boton_5primariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_5primariaActionPerformed
        String[] TitulosSecundaria={"DNI","NOMBRE","APELLIDOS","FECHA REGISTRO","ESTADO","TUTOR"};

        // en texto escrito a consultar en la tabla
        String año=cmb_5primaria.getSelectedItem().toString();

        if(año=="Todos")
        {
            //agregamos datos la tabla estudiantes del 1 secundaria
            try {
                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_quinto_primaria");
                ResultSet result1=pst1.executeQuery();
                model_1Primaria=new DefaultTableModel(null,TitulosSecundaria);
                Tabla_5toPrimaria=new JTable(model_1Primaria);
                jScrollPane_5toPrimaria.setViewportView(Tabla_5toPrimaria);
                while(result1.next()){
                    Object[] columna=new Object[6];
                    for(int i=0;i<6;i++){
                        columna[i]=result1.getObject(i+1);
                    }
                    model_5Primaria.addRow(columna);
                }
                cn1.close();

            } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 5to de primaria");
                System.err.println("ERROR, al rellenar tabla del 5to primaria:"+e); }

        }
        else
        {
            //agregamos datos la tabla estudiantes del 1 secundaria
            try {
                String añoSeleccionado="%"+cmb_5primaria.getSelectedItem().toString()+"%";

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_quinto_primaria where FechaRegistro like"+'"'+añoSeleccionado+'"');
                ResultSet result1=pst1.executeQuery();
                model_5Primaria=new DefaultTableModel(null,TitulosSecundaria);
                Tabla_5toPrimaria=new JTable(model_5Primaria);
                jScrollPane_5toPrimaria.setViewportView(Tabla_5toPrimaria);
                while(result1.next()){
                    Object[] columna=new Object[6];
                    for(int i=0;i<6;i++){
                        columna[i]=result1.getObject(i+1);
                    }
                    model_5Primaria.addRow(columna);
                }
                cn1.close();

            } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 5to de primaria");
                System.err.println("ERROR, al rellenar tabla del 5to primaria:"+e); }

        }
    }//GEN-LAST:event_Boton_5primariaActionPerformed

    private void txt_filtroCodigo_4primariaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroCodigo_4primariaKeyReleased
        try
        {// en texto escrito a consultar en la tabla
            String texto="%"+txt_filtroCodigo_4primaria.getText().trim()+"%";

            // secuberra el tipo de filtro
            String filtroSelec=jcmb_tipoFiltro_4primaria.getSelectedItem().toString();

            // ETIQUETAS DE EMCABEZADO DE TABLA
            String[] titulos={"DNI", "NOMBRE", "APELLIDOS", "FECHA REGISTRO", "ESTADO", "TUTOR"};
            model_4Primaria=new DefaultTableModel(null,titulos);

            // FUNCIONES DEPENDIENDO DEL TIPO DE FILTRO ELEGIDO
            switch (filtroSelec)
            {//*********** FILTRO PARA NOMBRE DE CLIENTES ************
                case"Nombre":

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1= cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_cuarto_primaria where Nombre_est like"+'"'+texto+'"');
                String[] fila1= new String[6];
                ResultSet resul1=pst1.executeQuery();
                Tabla_4toPrimaria = new JTable(model_4Primaria);
                jScrollPane_4toPrimaria.setViewportView(Tabla_4toPrimaria);

                //recuperar valores de BD A LA TABLA
                while(resul1.next())
                {
                    fila1[0]=resul1.getString("Dni_est");
                    fila1[1]=resul1.getString("Nombre_est");
                    fila1[2]=resul1.getString("Apellidos_est");
                    fila1[3]=resul1.getString("FechaRegistro");
                    fila1[4]=resul1.getString("Estado");
                    fila1[5]=resul1.getString("nombre_tutor");
                    model_4Primaria.addRow(fila1);
                }
                cn1.close();

                // EVENTO EN LA TABLA
                Tabla_4toPrimaria.addMouseListener(new MouseAdapter()
                    {
                        @Override
                        public void mouseClicked(MouseEvent e)
                        {// recuperar celda celecionada
                            int fila_poin=Tabla_4toPrimaria.rowAtPoint(e.getPoint());
                            if(fila_poin>-1)
                            { //recuperar codigo de la celda celecionda
                                String dni_padre= (String)model_4Primaria.getValueAt(fila_poin,0);
                                try {
                                    MensajeroInfromacionEstudiante(dni_padre);
                                } catch (IOException ex) {
                                    Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                }

                            }
                        }
                    });
                    break;
                    //********** FILTRO DE APELLIDOS DE CLIENTES **********
                    case"Apellidos":

                    Connection cn2= Conexion.Conectar();
                    PreparedStatement pst2= cn2.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                        + "    FechaRegistro,Estado,nombre_tutor from tabla_cuarto_primaria where Apellidos_est like"+'"'+texto+'"');
                    String[] fila2= new String[6];
                    ResultSet resul2=pst2.executeQuery();
                    Tabla_4toPrimaria = new JTable(model_4Primaria);
                    jScrollPane_4toPrimaria.setViewportView(Tabla_4toPrimaria);

                    //recuperar valores de BD A LA TABLA
                    while(resul2.next())
                    {
                        fila2[0]=resul2.getString("Dni_est");
                        fila2[1]=resul2.getString("Nombre_est");
                        fila2[2]=resul2.getString("Apellidos_est");
                        fila2[3]=resul2.getString("FechaRegistro");
                        fila2[4]=resul2.getString("Estado");
                        fila2[5]=resul2.getString("nombre_tutor");
                        model_4Primaria.addRow(fila2);
                    }
                    cn2.close();

                    // EVENTO EN LA TABLA
                    Tabla_4toPrimaria.addMouseListener(new MouseAdapter()
                        {
                            @Override
                            public void mouseClicked(MouseEvent e)
                            {// recuperar celda celecionada
                                int fila_poin=Tabla_4toPrimaria.rowAtPoint(e.getPoint());
                                if(fila_poin>-1)
                                { //recuperar codigo de la celda celecionda
                                    String dni_padre= (String)model_4Primaria.getValueAt(fila_poin,0);
                                    try {
                                        MensajeroInfromacionEstudiante(dni_padre);
                                    } catch (IOException ex) {
                                        Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                    }

                                }
                            }
                        });
                        break;

                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                        case"DNI":

                        Connection cn3= Conexion.Conectar();
                        PreparedStatement pst3= cn3.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                            + "    FechaRegistro,Estado,nombre_tutor from tabla_cuarto_primaria where Dni_est like"+'"'+texto+'"');
                        String[] fila3= new String[6];
                        ResultSet resul3=pst3.executeQuery();
                        Tabla_4toPrimaria = new JTable(model_4Primaria);
                        jScrollPane_4toPrimaria.setViewportView(Tabla_4toPrimaria);

                        //recuperar valores de BD A LA TABLA
                        while(resul3.next())
                        {
                            fila3[0]=resul3.getString("Dni_est");
                            fila3[1]=resul3.getString("Nombre_est");
                            fila3[2]=resul3.getString("Apellidos_est");
                            fila3[3]=resul3.getString("FechaRegistro");
                            fila3[4]=resul3.getString("Estado");
                            fila3[5]=resul3.getString("nombre_tutor");
                            model_4Primaria.addRow(fila3);
                        }
                        cn3.close();

                        // EVENTO EN LA TABLA
                        Tabla_4toPrimaria.addMouseListener(new MouseAdapter()
                            {
                                @Override
                                public void mouseClicked(MouseEvent e)
                                {// recuperar celda celecionada
                                    int fila_poin=Tabla_4toPrimaria.rowAtPoint(e.getPoint());
                                    if(fila_poin>-1)
                                    { //recuperar codigo de la celda celecionda
                                        String dni_padre= (String)model_4Primaria.getValueAt(fila_poin,0);
                                        try {
                                            MensajeroInfromacionEstudiante(dni_padre);
                                        } catch (IOException ex) {
                                            Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }
                                }
                            });
                            break;
                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                        case"Estado":

                        Connection cn4= Conexion.Conectar();
                        PreparedStatement pst4= cn4.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                            + "    FechaRegistro,Estado,nombre_tutor from tabla_cuarto_primaria where Estado like"+'"'+texto+'"');
                        String[] fila4= new String[6];
                        ResultSet resul4=pst4.executeQuery();
                        Tabla_4toPrimaria = new JTable(model_4Primaria);
                        jScrollPane_4toPrimaria.setViewportView(Tabla_4toPrimaria);

                        //recuperar valores de BD A LA TABLA
                        while(resul4.next())
                        {
                            fila4[0]=resul4.getString("Dni_est");
                            fila4[1]=resul4.getString("Nombre_est");
                            fila4[2]=resul4.getString("Apellidos_est");
                            fila4[3]=resul4.getString("FechaRegistro");
                            fila4[4]=resul4.getString("Estado");
                            fila4[5]=resul4.getString("nombre_tutor");
                            model_4Primaria.addRow(fila4);
                        }
                        cn4.close();

                        // EVENTO EN LA TABLA
                        Tabla_4toPrimaria.addMouseListener(new MouseAdapter()
                            {
                                @Override
                                public void mouseClicked(MouseEvent e)
                                {// recuperar celda celecionada
                                    int fila_poin=Tabla_4toPrimaria.rowAtPoint(e.getPoint());
                                    if(fila_poin>-1)
                                    { //recuperar codigo de la celda celecionda
                                        String dni_padre= (String)model_4Primaria.getValueAt(fila_poin,0);
                                        try {
                                            MensajeroInfromacionEstudiante(dni_padre);
                                        } catch (IOException ex) {
                                            Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }
                                }
                            });
                            break;
                        }
                    } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error al filtar "+jcmb_tipoFiltro_4primaria.getSelectedItem().toString()+"","",JOptionPane.ERROR_MESSAGE);
                        System.err.println("error al filtar la busqueda: "+e); }
    }//GEN-LAST:event_txt_filtroCodigo_4primariaKeyReleased

    private void txt_filtroCodigo_4primariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtroCodigo_4primariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filtroCodigo_4primariaActionPerformed

    private void jcmb_tipoFiltro_4primariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_tipoFiltro_4primariaActionPerformed
        txt_filtroCodigo_4primaria.setText("");
        txt_filtroCodigo_4primaria.requestFocus();
        
    }//GEN-LAST:event_jcmb_tipoFiltro_4primariaActionPerformed

    private void Boton_4primariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_4primariaActionPerformed
        String[] TitulosSecundaria={"DNI","NOMBRE","APELLIDOS","FECHA REGISTRO","ESTADO","TUTOR"};

        // en texto escrito a consultar en la tabla
        String año=cmb_4primaria.getSelectedItem().toString();

        if(año=="Todos")
        {
            //agregamos datos la tabla estudiantes del 1 secundaria
            try {
                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_cuarto_primaria");
                ResultSet result1=pst1.executeQuery();
                model_4Primaria=new DefaultTableModel(null,TitulosSecundaria);
                Tabla_4toPrimaria=new JTable(model_4Primaria);
                jScrollPane_4toPrimaria.setViewportView(Tabla_4toPrimaria);
                while(result1.next()){
                    Object[] columna=new Object[6];
                    for(int i=0;i<6;i++){
                        columna[i]=result1.getObject(i+1);
                    }
                    model_4Primaria.addRow(columna);
                }
                cn1.close();

            } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 4to de primaria");
                System.err.println("ERROR, al rellenar tabla del 4to primaria:"+e); }

        }
        else
        {
            //agregamos datos la tabla estudiantes del 1 secundaria
            try {
                String añoSeleccionado="%"+cmb_4primaria.getSelectedItem().toString()+"%";

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_cuarto_primaria where FechaRegistro like"+'"'+añoSeleccionado+'"');
                ResultSet result1=pst1.executeQuery();
                model_4Primaria=new DefaultTableModel(null,TitulosSecundaria);
                Tabla_4toPrimaria=new JTable(model_4Primaria);
                jScrollPane_4toPrimaria.setViewportView(Tabla_4toPrimaria);
                while(result1.next()){
                    Object[] columna=new Object[6];
                    for(int i=0;i<6;i++){
                        columna[i]=result1.getObject(i+1);
                    }
                    model_4Primaria.addRow(columna);
                }
                cn1.close();

            } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 4to de primaria");
                System.err.println("ERROR, al rellenar tabla del 4to primaria:"+e); }

        }
    }//GEN-LAST:event_Boton_4primariaActionPerformed

    private void cmb_3primariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_3primariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_3primariaActionPerformed

    private void txt_filtroCodigo_3primariaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroCodigo_3primariaKeyReleased
        try
        {// en texto escrito a consultar en la tabla
            String texto="%"+txt_filtroCodigo_3primaria.getText().trim()+"%";

            // secuberra el tipo de filtro
            String filtroSelec=jcmb_tipoFiltro_3primaria.getSelectedItem().toString();

            // ETIQUETAS DE EMCABEZADO DE TABLA
            String[] titulos={"DNI", "NOMBRE", "APELLIDOS", "FECHA REGISTRO", "ESTADO", "TUTOR"};
            model_3Primaria=new DefaultTableModel(null,titulos);

            // FUNCIONES DEPENDIENDO DEL TIPO DE FILTRO ELEGIDO
            switch (filtroSelec)
            {//*********** FILTRO PARA NOMBRE DE CLIENTES ************
                case"Nombre":

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1= cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_tercero_primaria where Nombre_est like"+'"'+texto+'"');
                String[] fila1= new String[6];
                ResultSet resul1=pst1.executeQuery();
                Tabla_3roPrimaria = new JTable(model_3Primaria);
                jScrollPane_3roPrimaria.setViewportView(Tabla_3roPrimaria);

                //recuperar valores de BD A LA TABLA
                while(resul1.next())
                {
                    fila1[0]=resul1.getString("Dni_est");
                    fila1[1]=resul1.getString("Nombre_est");
                    fila1[2]=resul1.getString("Apellidos_est");
                    fila1[3]=resul1.getString("FechaRegistro");
                    fila1[4]=resul1.getString("Estado");
                    fila1[5]=resul1.getString("nombre_tutor");
                    model_3Primaria.addRow(fila1);
                }
                cn1.close();

                // EVENTO EN LA TABLA
                Tabla_3roPrimaria.addMouseListener(new MouseAdapter()
                    {
                        @Override
                        public void mouseClicked(MouseEvent e)
                        {// recuperar celda celecionada
                            int fila_poin=Tabla_3roPrimaria.rowAtPoint(e.getPoint());
                            if(fila_poin>-1)
                            { //recuperar codigo de la celda celecionda
                                String dni_padre= (String)model_3Primaria.getValueAt(fila_poin,0);
                                try {
                                    MensajeroInfromacionEstudiante(dni_padre);
                                } catch (IOException ex) {
                                    Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                }

                            }
                        }
                    });
                    break;
                    //********** FILTRO DE APELLIDOS DE CLIENTES **********
                    case"Apellidos":

                    Connection cn2= Conexion.Conectar();
                    PreparedStatement pst2= cn2.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                        + "    FechaRegistro,Estado,nombre_tutor from tabla_tercero_primaria where Apellidos_est like"+'"'+texto+'"');
                    String[] fila2= new String[6];
                    ResultSet resul2=pst2.executeQuery();
                    Tabla_3roPrimaria = new JTable(model_3Primaria);
                    jScrollPane_3roPrimaria.setViewportView(Tabla_3roPrimaria);

                    //recuperar valores de BD A LA TABLA
                    while(resul2.next())
                    {
                        fila2[0]=resul2.getString("Dni_est");
                        fila2[1]=resul2.getString("Nombre_est");
                        fila2[2]=resul2.getString("Apellidos_est");
                        fila2[3]=resul2.getString("FechaRegistro");
                        fila2[4]=resul2.getString("Estado");
                        fila2[5]=resul2.getString("nombre_tutor");
                        model_3Primaria.addRow(fila2);
                    }
                    cn2.close();

                    // EVENTO EN LA TABLA
                    Tabla_3roPrimaria.addMouseListener(new MouseAdapter()
                        {
                            @Override
                            public void mouseClicked(MouseEvent e)
                            {// recuperar celda celecionada
                                int fila_poin=Tabla_3roPrimaria.rowAtPoint(e.getPoint());
                                if(fila_poin>-1)
                                { //recuperar codigo de la celda celecionda
                                    String dni_padre= (String)model_3Primaria.getValueAt(fila_poin,0);
                                    try {
                                        MensajeroInfromacionEstudiante(dni_padre);
                                    } catch (IOException ex) {
                                        Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                    }

                                }
                            }
                        });
                        break;

                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                        case"DNI":

                        Connection cn3= Conexion.Conectar();
                        PreparedStatement pst3= cn3.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                            + "    FechaRegistro,Estado,nombre_tutor from tabla_tercero_primaria where Dni_est like"+'"'+texto+'"');
                        String[] fila3= new String[6];
                        ResultSet resul3=pst3.executeQuery();
                        Tabla_3roPrimaria = new JTable(model_3Primaria);
                        jScrollPane_3roPrimaria.setViewportView(Tabla_3roPrimaria);

                        //recuperar valores de BD A LA TABLA
                        while(resul3.next())
                        {
                            fila3[0]=resul3.getString("Dni_est");
                            fila3[1]=resul3.getString("Nombre_est");
                            fila3[2]=resul3.getString("Apellidos_est");
                            fila3[3]=resul3.getString("FechaRegistro");
                            fila3[4]=resul3.getString("Estado");
                            fila3[5]=resul3.getString("nombre_tutor");
                            model_3Primaria.addRow(fila3);
                        }
                        cn3.close();

                        // EVENTO EN LA TABLA
                        Tabla_3roPrimaria.addMouseListener(new MouseAdapter()
                            {
                                @Override
                                public void mouseClicked(MouseEvent e)
                                {// recuperar celda celecionada
                                    int fila_poin=Tabla_3roPrimaria.rowAtPoint(e.getPoint());
                                    if(fila_poin>-1)
                                    { //recuperar codigo de la celda celecionda
                                        String dni_padre= (String)model_3Primaria.getValueAt(fila_poin,0);
                                        try {
                                            MensajeroInfromacionEstudiante(dni_padre);
                                        } catch (IOException ex) {
                                            Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }
                                }
                            });
                            break;
                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                        case"Estado":

                        Connection cn4= Conexion.Conectar();
                        PreparedStatement pst4= cn4.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                            + "    FechaRegistro,Estado,nombre_tutor from tabla_tercero_primaria where Estado like"+'"'+texto+'"');
                        String[] fila4= new String[6];
                        ResultSet resul4=pst4.executeQuery();
                        Tabla_3roPrimaria = new JTable(model_3Primaria);
                        jScrollPane_3roPrimaria.setViewportView(Tabla_3roPrimaria);

                        //recuperar valores de BD A LA TABLA
                        while(resul4.next())
                        {
                            fila4[0]=resul4.getString("Dni_est");
                            fila4[1]=resul4.getString("Nombre_est");
                            fila4[2]=resul4.getString("Apellidos_est");
                            fila4[3]=resul4.getString("FechaRegistro");
                            fila4[4]=resul4.getString("Estado");
                            fila4[5]=resul4.getString("nombre_tutor");
                            model_3Primaria.addRow(fila4);
                        }
                        cn4.close();

                        // EVENTO EN LA TABLA
                        Tabla_3roPrimaria.addMouseListener(new MouseAdapter()
                            {
                                @Override
                                public void mouseClicked(MouseEvent e)
                                {// recuperar celda celecionada
                                    int fila_poin=Tabla_3roPrimaria.rowAtPoint(e.getPoint());
                                    if(fila_poin>-1)
                                    { //recuperar codigo de la celda celecionda
                                        String dni_padre= (String)model_3Primaria.getValueAt(fila_poin,0);
                                        try {
                                            MensajeroInfromacionEstudiante(dni_padre);
                                        } catch (IOException ex) {
                                            Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }
                                }
                            });
                            break;
                        }
                    } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error al filtar "+jcmb_tipoFiltro_3primaria.getSelectedItem().toString()+"","",JOptionPane.ERROR_MESSAGE);
                        System.err.println("error al filtar la busqueda: "+e); }
    }//GEN-LAST:event_txt_filtroCodigo_3primariaKeyReleased

    private void txt_filtroCodigo_3primariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtroCodigo_3primariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filtroCodigo_3primariaActionPerformed

    private void jcmb_tipoFiltro_3primariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_tipoFiltro_3primariaActionPerformed
        txt_filtroCodigo_3primaria.setText("");
        txt_filtroCodigo_3primaria.requestFocus();
    }//GEN-LAST:event_jcmb_tipoFiltro_3primariaActionPerformed

    private void Boton_3primaria2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_3primaria2ActionPerformed
        String[] TitulosSecundaria={"DNI","NOMBRE","APELLIDOS","FECHA REGISTRO","ESTADO","TUTOR"};

        // en texto escrito a consultar en la tabla
        String año=cmb_3primaria.getSelectedItem().toString();

        if(año=="Todos")
        {
            //agregamos datos la tabla estudiantes del 1 secundaria
            try {
                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_tercero_primaria");
                ResultSet result1=pst1.executeQuery();
                model_3Primaria=new DefaultTableModel(null,TitulosSecundaria);
                Tabla_3roPrimaria=new JTable(model_3Primaria);
                jScrollPane_1erPrimaria.setViewportView(Tabla_3roPrimaria);
                while(result1.next()){
                    Object[] columna=new Object[6];
                    for(int i=0;i<6;i++){
                        columna[i]=result1.getObject(i+1);
                    }
                    model_3Primaria.addRow(columna);
                }
                cn1.close();

            } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 3ero de primaria");
                System.err.println("ERROR, al rellenar tabla del 3ero primaria :"+e); }

        }
        else
        {
            //agregamos datos la tabla estudiantes del 1 secundaria
            try {
                String añoSeleccionado="%"+cmb_3primaria.getSelectedItem().toString()+"%";

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_tercero_primaria where FechaRegistro like"+'"'+añoSeleccionado+'"');
                ResultSet result1=pst1.executeQuery();
                model_3Primaria=new DefaultTableModel(null,TitulosSecundaria);
                Tabla_3roPrimaria=new JTable(model_3Primaria);
                jScrollPane_3roPrimaria.setViewportView(Tabla_3roPrimaria);
                while(result1.next()){
                    Object[] columna=new Object[6];
                    for(int i=0;i<6;i++){
                        columna[i]=result1.getObject(i+1);
                    }
                    model_3Primaria.addRow(columna);
                }
                cn1.close();

            } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 3ero de primaria");
                System.err.println("ERROR, al rellenar tabla del 3ero primaria:"+e); }

        }
    }//GEN-LAST:event_Boton_3primaria2ActionPerformed

    private void txt_filtroCodigo_2primariaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroCodigo_2primariaKeyReleased
        try
        {// en texto escrito a consultar en la tabla
            String texto="%"+txt_filtroCodigo_2primaria.getText().trim()+"%";

            // secuberra el tipo de filtro
            String filtroSelec=jcmb_tipoFiltro_2primaria.getSelectedItem().toString();

            // ETIQUETAS DE EMCABEZADO DE TABLA
            String[] titulos={"DNI", "NOMBRE", "APELLIDOS", "FECHA REGISTRO", "ESTADO", "TUTOR"};
            model_2Primaria=new DefaultTableModel(null,titulos);

            // FUNCIONES DEPENDIENDO DEL TIPO DE FILTRO ELEGIDO
            switch (filtroSelec)
            {//*********** FILTRO PARA NOMBRE DE CLIENTES ************
                case"Nombre":

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1= cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_segundo_primaria where Nombre_est like"+'"'+texto+'"');
                String[] fila1= new String[6];
                ResultSet resul1=pst1.executeQuery();
                Tabla_2doPrimaria = new JTable(model_2Primaria);
                jScrollPane__2doPrimaria.setViewportView(Tabla_2doPrimaria);

                //recuperar valores de BD A LA TABLA
                while(resul1.next())
                {
                    fila1[0]=resul1.getString("Dni_est");
                    fila1[1]=resul1.getString("Nombre_est");
                    fila1[2]=resul1.getString("Apellidos_est");
                    fila1[3]=resul1.getString("FechaRegistro");
                    fila1[4]=resul1.getString("Estado");
                    fila1[5]=resul1.getString("nombre_tutor");
                    model_2Primaria.addRow(fila1);
                }
                cn1.close();

                // EVENTO EN LA TABLA
                Tabla_2doPrimaria.addMouseListener(new MouseAdapter()
                    {
                        @Override
                        public void mouseClicked(MouseEvent e)
                        {// recuperar celda celecionada
                            int fila_poin=Tabla_2doPrimaria.rowAtPoint(e.getPoint());
                            if(fila_poin>-1)
                            { //recuperar codigo de la celda celecionda
                                String dni_padre= (String)model_2Primaria.getValueAt(fila_poin,0);
                                try {
                                    MensajeroInfromacionEstudiante(dni_padre);
                                } catch (IOException ex) {
                                    Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                }

                            }
                        }
                    });
                    break;
                    //********** FILTRO DE APELLIDOS DE CLIENTES **********
                    case"Apellidos":

                    Connection cn2= Conexion.Conectar();
                    PreparedStatement pst2= cn2.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                        + "    FechaRegistro,Estado,nombre_tutor from tabla_segundo_primaria where Apellidos_est like"+'"'+texto+'"');
                    String[] fila2= new String[6];
                    ResultSet resul2=pst2.executeQuery();
                    Tabla_2doPrimaria = new JTable(model_2Primaria);
                    jScrollPane__2doPrimaria.setViewportView(Tabla_2doPrimaria);

                    //recuperar valores de BD A LA TABLA
                    while(resul2.next())
                    {
                        fila2[0]=resul2.getString("Dni_est");
                        fila2[1]=resul2.getString("Nombre_est");
                        fila2[2]=resul2.getString("Apellidos_est");
                        fila2[3]=resul2.getString("FechaRegistro");
                        fila2[4]=resul2.getString("Estado");
                        fila2[5]=resul2.getString("nombre_tutor");
                        model_2Primaria.addRow(fila2);
                    }
                    cn2.close();

                    // EVENTO EN LA TABLA
                    Tabla_2doPrimaria.addMouseListener(new MouseAdapter()
                        {
                            @Override
                            public void mouseClicked(MouseEvent e)
                            {// recuperar celda celecionada
                                int fila_poin=Tabla_2doPrimaria.rowAtPoint(e.getPoint());
                                if(fila_poin>-1)
                                { //recuperar codigo de la celda celecionda
                                    String dni_padre= (String)model_2Primaria.getValueAt(fila_poin,0);
                                    try {
                                        MensajeroInfromacionEstudiante(dni_padre);
                                    } catch (IOException ex) {
                                        Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                    }

                                }
                            }
                        });
                        break;

                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                        case"DNI":

                        Connection cn3= Conexion.Conectar();
                        PreparedStatement pst3= cn3.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                            + "    FechaRegistro,Estado,nombre_tutor from tabla_segundo_primaria where Dni_est like"+'"'+texto+'"');
                        String[] fila3= new String[6];
                        ResultSet resul3=pst3.executeQuery();
                        Tabla_2doPrimaria = new JTable(model_2Primaria);
                        jScrollPane__2doPrimaria.setViewportView(Tabla_2doPrimaria);

                        //recuperar valores de BD A LA TABLA
                        while(resul3.next())
                        {
                            fila3[0]=resul3.getString("Dni_est");
                            fila3[1]=resul3.getString("Nombre_est");
                            fila3[2]=resul3.getString("Apellidos_est");
                            fila3[3]=resul3.getString("FechaRegistro");
                            fila3[4]=resul3.getString("Estado");
                            fila3[5]=resul3.getString("nombre_tutor");
                            model_2Primaria.addRow(fila3);
                        }
                        cn3.close();

                        // EVENTO EN LA TABLA
                        Tabla_2doPrimaria.addMouseListener(new MouseAdapter()
                            {
                                @Override
                                public void mouseClicked(MouseEvent e)
                                {// recuperar celda celecionada
                                    int fila_poin=Tabla_2doPrimaria.rowAtPoint(e.getPoint());
                                    if(fila_poin>-1)
                                    { //recuperar codigo de la celda celecionda
                                        String dni_padre= (String)model_2Primaria.getValueAt(fila_poin,0);
                                        try {
                                            MensajeroInfromacionEstudiante(dni_padre);
                                        } catch (IOException ex) {
                                            Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }
                                }
                            });
                            break;
                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                        case"Estado":

                        Connection cn4= Conexion.Conectar();
                        PreparedStatement pst4= cn4.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                            + "    FechaRegistro,Estado,nombre_tutor from tabla_segundo_primaria where Estado like"+'"'+texto+'"');
                        String[] fila4= new String[6];
                        ResultSet resul4=pst4.executeQuery();
                        Tabla_2doPrimaria = new JTable(model_2Primaria);
                        jScrollPane__2doPrimaria.setViewportView(Tabla_2doPrimaria);

                        //recuperar valores de BD A LA TABLA
                        while(resul4.next())
                        {
                            fila4[0]=resul4.getString("Dni_est");
                            fila4[1]=resul4.getString("Nombre_est");
                            fila4[2]=resul4.getString("Apellidos_est");
                            fila4[3]=resul4.getString("FechaRegistro");
                            fila4[4]=resul4.getString("Estado");
                            fila4[5]=resul4.getString("nombre_tutor");
                            model_2Primaria.addRow(fila4);
                        }
                        cn4.close();

                        // EVENTO EN LA TABLA
                        Tabla_2doPrimaria.addMouseListener(new MouseAdapter()
                            {
                                @Override
                                public void mouseClicked(MouseEvent e)
                                {// recuperar celda celecionada
                                    int fila_poin=Tabla_2doPrimaria.rowAtPoint(e.getPoint());
                                    if(fila_poin>-1)
                                    { //recuperar codigo de la celda celecionda
                                        String dni_padre= (String)model_2Primaria.getValueAt(fila_poin,0);
                                        try {
                                            MensajeroInfromacionEstudiante(dni_padre);
                                        } catch (IOException ex) {
                                            Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }
                                }
                            });
                            break;

            }
                    } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error al filtar "+jcmb_tipoFiltro_2primaria.getSelectedItem().toString()+"","",JOptionPane.ERROR_MESSAGE);
                        System.err.println("error al filtar la busqueda: "+e); }
    }//GEN-LAST:event_txt_filtroCodigo_2primariaKeyReleased

    private void txt_filtroCodigo_2primariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtroCodigo_2primariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filtroCodigo_2primariaActionPerformed

    private void jcmb_tipoFiltro_2primariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_tipoFiltro_2primariaActionPerformed
        txt_filtroCodigo_2primaria.setText("");
        txt_filtroCodigo_2primaria.requestFocus();
    }//GEN-LAST:event_jcmb_tipoFiltro_2primariaActionPerformed

    private void Boton_2primariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_2primariaActionPerformed
        String[] TitulosSecundaria={"DNI","NOMBRE","APELLIDOS","FECHA REGISTRO","ESTADO","TUTOR"};

        // en texto escrito a consultar en la tabla
        String año=cmb_2primaria.getSelectedItem().toString();

        if(año=="Todos")
        {
            //agregamos datos la tabla estudiantes del 1 secundaria
            try {
                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_segundo_primaria");
                ResultSet result1=pst1.executeQuery();
                model_2Primaria=new DefaultTableModel(null,TitulosSecundaria);
                Tabla_2doPrimaria=new JTable(model_2Primaria);
                jScrollPane__2doPrimaria.setViewportView(Tabla_2doPrimaria);
                while(result1.next()){
                    Object[] columna=new Object[6];
                    for(int i=0;i<6;i++){
                        columna[i]=result1.getObject(i+1);
                    }
                    model_2Primaria.addRow(columna);
                }
                cn1.close();

            } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 2do de primaria");
                System.err.println("ERROR, al rellenar tabla del 2do primaria:"+e); }

        }
        else
        {
            //agregamos datos la tabla estudiantes del 1 secundaria
            try {
                String añoSeleccionado="%"+cmb_2primaria.getSelectedItem().toString()+"%";

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_segundo_primaria where FechaRegistro like"+'"'+añoSeleccionado+'"');
                ResultSet result1=pst1.executeQuery();
                model_2Primaria=new DefaultTableModel(null,TitulosSecundaria);
                Tabla_2doPrimaria=new JTable(model_2Primaria);
                jScrollPane__2doPrimaria.setViewportView(Tabla_2doPrimaria);
                while(result1.next()){
                    Object[] columna=new Object[6];
                    for(int i=0;i<6;i++){
                        columna[i]=result1.getObject(i+1);
                    }
                    model_2Primaria.addRow(columna);
                }
                cn1.close();

            } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 2do de primaria");
                System.err.println("ERROR, al rellenar tabla del 2do primaria:"+e); }

        }
    }//GEN-LAST:event_Boton_2primariaActionPerformed

    private void Boton_1primariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_1primariaActionPerformed

        String[] TitulosSecundaria={"DNI","NOMBRE","APELLIDOS","FECHA REGISTRO","ESTADO","TUTOR"};

        // en texto escrito a consultar en la tabla
        String año=cmb_1primaria.getSelectedItem().toString();

        if(año=="Todos")
        {
            //agregamos datos la tabla estudiantes del 1 secundaria
            try {
                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_primero_primaria");
                ResultSet result1=pst1.executeQuery();
                model_1Primaria=new DefaultTableModel(null,TitulosSecundaria);
                Tabla_1erPrimaria=new JTable(model_1Primaria);
                jScrollPane_1erPrimaria.setViewportView(Tabla_1erPrimaria);
                while(result1.next()){
                    Object[] columna=new Object[6];
                    for(int i=0;i<6;i++){
                        columna[i]=result1.getObject(i+1);
                    }
                    model_1Primaria.addRow(columna);
                }
                cn1.close();

            } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos de 1ero primaria");
                System.err.println("ERROR, al rellenar tabla del 1ero primaria:"+e); }

        }
        else
        {
            //agregamos datos la tabla estudiantes del 1 secundaria
            try {
                String añoSeleccionado="%"+cmb_1primaria.getSelectedItem().toString()+"%";

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_primero_primaria where FechaRegistro like"+'"'+añoSeleccionado+'"');
                ResultSet result1=pst1.executeQuery();
                model_1Primaria=new DefaultTableModel(null,TitulosSecundaria);
                Tabla_1erPrimaria=new JTable(model_1Primaria);
                jScrollPane_1erPrimaria.setViewportView(Tabla_1erPrimaria);
                while(result1.next()){
                    Object[] columna=new Object[6];
                    for(int i=0;i<6;i++){
                        columna[i]=result1.getObject(i+1);
                    }
                    model_1Primaria.addRow(columna);
                }
                cn1.close();

            } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos de 1ero primaria");
                System.err.println("ERROR, al rellenar tabla de 1ero primaria:"+e); }

        }
    }//GEN-LAST:event_Boton_1primariaActionPerformed

    private void txt_filtroCodigo_1primariaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroCodigo_1primariaKeyReleased
        try
        {// en texto escrito a consultar en la tabla
            String texto="%"+txt_filtroCodigo_1primaria.getText().trim()+"%";

            // secuberra el tipo de filtro
            String filtroSelec=jcmb_tipoFiltro_1primaria.getSelectedItem().toString();

            // ETIQUETAS DE EMCABEZADO DE TABLA
            String[] titulos={"DNI", "NOMBRE", "APELLIDOS", "FECHA REGISTRO", "ESTADO", "TUTOR"};
            model_1Primaria=new DefaultTableModel(null,titulos);

            // FUNCIONES DEPENDIENDO DEL TIPO DE FILTRO ELEGIDO
            switch (filtroSelec)
            {//*********** FILTRO PARA NOMBRE DE CLIENTES ************
                case"Nombre":

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1= cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_primero_primaria where Nombre_est like"+'"'+texto+'"');
                String[] fila1= new String[6];
                ResultSet resul1=pst1.executeQuery();
                Tabla_1erPrimaria = new JTable(model_1Primaria);
                jScrollPane_1erPrimaria.setViewportView(Tabla_1erPrimaria);

                //recuperar valores de BD A LA TABLA
                while(resul1.next())
                {
                    fila1[0]=resul1.getString("Dni_est");
                    fila1[1]=resul1.getString("Nombre_est");
                    fila1[2]=resul1.getString("Apellidos_est");
                    fila1[3]=resul1.getString("FechaRegistro");
                    fila1[4]=resul1.getString("Estado");
                    fila1[5]=resul1.getString("nombre_tutor");
                    model_1Primaria.addRow(fila1);
                }
                cn1.close();

                // EVENTO EN LA TABLA
                Tabla_1erPrimaria.addMouseListener(new MouseAdapter()
                    {
                        @Override
                        public void mouseClicked(MouseEvent e)
                        {// recuperar celda celecionada
                            int fila_poin=Tabla_1erPrimaria.rowAtPoint(e.getPoint());
                            if(fila_poin>-1)
                            { //recuperar codigo de la celda celecionda
                                String dni_padre= (String)model_1Primaria.getValueAt(fila_poin,0);
                                try {
                                    MensajeroInfromacionEstudiante(dni_padre);
                                } catch (IOException ex) {
                                    Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                }

                            }
                        }
                    });
                    break;
                    //********** FILTRO DE APELLIDOS DE CLIENTES **********
                    case"Apellidos":

                    Connection cn2= Conexion.Conectar();
                    PreparedStatement pst2= cn2.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                        + "    FechaRegistro,Estado,nombre_tutor from tabla_primero_primaria where Apellidos_est like"+'"'+texto+'"');
                    String[] fila2= new String[6];
                    ResultSet resul2=pst2.executeQuery();
                    Tabla_1erPrimaria = new JTable(model_1Primaria);
                    jScrollPane_1erPrimaria.setViewportView(Tabla_1erPrimaria);

                    //recuperar valores de BD A LA TABLA
                    while(resul2.next())
                    {
                        fila2[0]=resul2.getString("Dni_est");
                        fila2[1]=resul2.getString("Nombre_est");
                        fila2[2]=resul2.getString("Apellidos_est");
                        fila2[3]=resul2.getString("FechaRegistro");
                        fila2[4]=resul2.getString("Estado");
                        fila2[5]=resul2.getString("nombre_tutor");
                        model_1Primaria.addRow(fila2);
                    }
                    cn2.close();

                    // EVENTO EN LA TABLA
                    Tabla_1erPrimaria.addMouseListener(new MouseAdapter()
                        {
                            @Override
                            public void mouseClicked(MouseEvent e)
                            {// recuperar celda celecionada
                                int fila_poin=Tabla_1erPrimaria.rowAtPoint(e.getPoint());
                                if(fila_poin>-1)
                                { //recuperar codigo de la celda celecionda
                                    String dni_padre= (String)model_1Primaria.getValueAt(fila_poin,0);
                                    try {
                                        MensajeroInfromacionEstudiante(dni_padre);
                                    } catch (IOException ex) {
                                        Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                    }

                                }
                            }
                        });
                        break;

                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                        case"DNI":

                        Connection cn3= Conexion.Conectar();
                        PreparedStatement pst3= cn3.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                            + "    FechaRegistro,Estado,nombre_tutor from tabla_primero_primaria where Dni_est like"+'"'+texto+'"');
                        String[] fila3= new String[6];
                        ResultSet resul3=pst3.executeQuery();
                        Tabla_1erPrimaria = new JTable(model_1Primaria);
                        jScrollPane_1erPrimaria.setViewportView(Tabla_1erPrimaria);

                        //recuperar valores de BD A LA TABLA
                        while(resul3.next())
                        {
                            fila3[0]=resul3.getString("Dni_est");
                            fila3[1]=resul3.getString("Nombre_est");
                            fila3[2]=resul3.getString("Apellidos_est");
                            fila3[3]=resul3.getString("FechaRegistro");
                            fila3[4]=resul3.getString("Estado");
                            fila3[5]=resul3.getString("nombre_tutor");
                            model_1Primaria.addRow(fila3);
                        }
                        cn3.close();

                        // EVENTO EN LA TABLA
                        Tabla_1erPrimaria.addMouseListener(new MouseAdapter()
                            {
                                @Override
                                public void mouseClicked(MouseEvent e)
                                {// recuperar celda celecionada
                                    int fila_poin=Tabla_1erPrimaria.rowAtPoint(e.getPoint());
                                    if(fila_poin>-1)
                                    { //recuperar codigo de la celda celecionda
                                        String dni_padre= (String)model_1Primaria.getValueAt(fila_poin,0);
                                        try {
                                            MensajeroInfromacionEstudiante(dni_padre);
                                        } catch (IOException ex) {
                                            Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }
                                }
                            });
                            break;
                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                        case"Estado":

                        Connection cn4= Conexion.Conectar();
                        PreparedStatement pst4= cn4.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                            + "    FechaRegistro,Estado,nombre_tutor from tabla_primero_primaria where Estado like"+'"'+texto+'"');
                        String[] fila4= new String[6];
                        ResultSet resul4=pst4.executeQuery();
                        Tabla_1erPrimaria = new JTable(model_1Primaria);
                        jScrollPane_1erPrimaria.setViewportView(Tabla_1erPrimaria);

                        //recuperar valores de BD A LA TABLA
                        while(resul4.next())
                        {
                            fila4[0]=resul4.getString("Dni_est");
                            fila4[1]=resul4.getString("Nombre_est");
                            fila4[2]=resul4.getString("Apellidos_est");
                            fila4[3]=resul4.getString("FechaRegistro");
                            fila4[4]=resul4.getString("Estado");
                            fila4[5]=resul4.getString("nombre_tutor");
                            model_1Primaria.addRow(fila4);
                        }
                        cn4.close();

                        // EVENTO EN LA TABLA
                        Tabla_1erPrimaria.addMouseListener(new MouseAdapter()
                            {
                                @Override
                                public void mouseClicked(MouseEvent e)
                                {// recuperar celda celecionada
                                    int fila_poin=Tabla_1erPrimaria.rowAtPoint(e.getPoint());
                                    if(fila_poin>-1)
                                    { //recuperar codigo de la celda celecionda
                                        String dni_padre= (String)model_1Primaria.getValueAt(fila_poin,0);
                                        try {
                                            MensajeroInfromacionEstudiante(dni_padre);
                                        } catch (IOException ex) {
                                            Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }
                                }
                            });
                            break;

            }
                    } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error al filtar "+jcmb_tipoFiltro_1primaria.getSelectedItem().toString()+"","",JOptionPane.ERROR_MESSAGE);
                        System.err.println("error al filtar la busqueda: "+e); }
    }//GEN-LAST:event_txt_filtroCodigo_1primariaKeyReleased

    private void txt_filtroCodigo_1primariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtroCodigo_1primariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filtroCodigo_1primariaActionPerformed

    private void jcmb_tipoFiltro_1primariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_tipoFiltro_1primariaActionPerformed
        txt_filtroCodigo_1primaria.setText("");
        txt_filtroCodigo_1primaria.requestFocus();

    }//GEN-LAST:event_jcmb_tipoFiltro_1primariaActionPerformed

    private void Boton_5SecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_5SecundariaActionPerformed
        // TODO add your handling code here:
        String[] TitulosSecundaria={"DNI","NOMBRE","APELLIDOS","FECHA REGISTRO","ESTADO","TUTOR"};

        // en texto escrito a consultar en la tabla
        String año=cmb_5Secundaria.getSelectedItem().toString();

        if(año=="Todos")
        {
            //agregamos datos la tabla estudiantes del 1 secundaria
            try {
                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_quinto_secundaria");
                ResultSet result1=pst1.executeQuery();
                model_5Secundaria=new DefaultTableModel(null,TitulosSecundaria);
                Tabla_2doSecundaria=new JTable(model_5Secundaria);
                jScrollPane_5toSecundaria.setViewportView(Tabla_2doSecundaria);
                while(result1.next()){
                    Object[] columna=new Object[6];
                    for(int i=0;i<6;i++){
                        columna[i]=result1.getObject(i+1);
                    }
                    model_5Secundaria.addRow(columna);
                }
                cn1.close();

            } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 5to de secundaria");
                System.err.println("ERROR, al rellenar tabla del 5to secundaria:"+e); }

        }
        else
        {
            //agregamos datos la tabla estudiantes del 1 secundaria
            try {
                String añoSeleccionado="%"+cmb_5Secundaria.getSelectedItem().toString()+"%";

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_quinto_secundaria where FechaRegistro like"+'"'+añoSeleccionado+'"');
                ResultSet result1=pst1.executeQuery();
                model_5Secundaria=new DefaultTableModel(null,TitulosSecundaria);
                Tabla_5toSecundaria=new JTable(model_5Secundaria);
                jScrollPane_5toSecundaria.setViewportView(Tabla_5toSecundaria);
                while(result1.next()){
                    Object[] columna=new Object[6];
                    for(int i=0;i<6;i++){
                        columna[i]=result1.getObject(i+1);
                    }
                    model_5Secundaria.addRow(columna);
                }
                cn1.close();

            } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 5to de secundaria");
                System.err.println("ERROR, al rellenar tabla del 5to secundaria:"+e); }

        }
    }//GEN-LAST:event_Boton_5SecundariaActionPerformed

    private void txt_filtroCodigo_5SecundariaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroCodigo_5SecundariaKeyReleased
        // TODO add your handling code here:
        try
        {// en texto escrito a consultar en la tabla
            String texto="%"+txt_filtroCodigo_5Secundaria.getText().trim()+"%";

            // secuberra el tipo de filtro
            String filtroSelec=jcmb_tipoFiltro5Secundaria.getSelectedItem().toString();

            // ETIQUETAS DE EMCABEZADO DE TABLA
            String[] titulos={"DNI", "NOMBRE", "APELLIDOS", "FECHA REGISTRO", "ESTADO", "TUTOR"};
            model_5Secundaria=new DefaultTableModel(null,titulos);

            // FUNCIONES DEPENDIENDO DEL TIPO DE FILTRO ELEGIDO
            switch (filtroSelec)
            {//*********** FILTRO PARA NOMBRE DE CLIENTES ************
                case"Nombre":

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1= cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_quinto_secundaria where Nombre_est like"+'"'+texto+'"');
                String[] fila1= new String[6];
                ResultSet resul1=pst1.executeQuery();
                Tabla_5toSecundaria = new JTable(model_5Secundaria);
                jScrollPane_5toSecundaria.setViewportView(Tabla_5toSecundaria);

                //recuperar valores de BD A LA TABLA
                while(resul1.next())
                {
                    fila1[0]=resul1.getString("Dni_est");
                    fila1[1]=resul1.getString("Nombre_est");
                    fila1[2]=resul1.getString("Apellidos_est");
                    fila1[3]=resul1.getString("FechaRegistro");
                    fila1[4]=resul1.getString("Estado");
                    fila1[5]=resul1.getString("nombre_tutor");
                    model_5Secundaria.addRow(fila1);
                }
                cn1.close();

                // EVENTO EN LA TABLA
                Tabla_5toSecundaria.addMouseListener(new MouseAdapter()
                    {
                        @Override
                        public void mouseClicked(MouseEvent e)
                        {// recuperar celda celecionada
                            int fila_poin=Tabla_5toSecundaria.rowAtPoint(e.getPoint());
                            if(fila_poin>-1)
                            { //recuperar codigo de la celda celecionda
                                String dni_padre= (String)model_5Secundaria.getValueAt(fila_poin,0);
                                try {
                                    MensajeroInfromacionEstudiante(dni_padre);
                                } catch (IOException ex) {
                                    Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                }

                            }
                        }
                    });
                    break;
                    //********** FILTRO DE APELLIDOS DE CLIENTES **********
                    case"Apellidos":

                    Connection cn2= Conexion.Conectar();
                    PreparedStatement pst2= cn2.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                        + "    FechaRegistro,Estado,nombre_tutor from tabla_quinto_secundaria where Apellidos_est like"+'"'+texto+'"');
                    String[] fila2= new String[6];
                    ResultSet resul2=pst2.executeQuery();
                    Tabla_5toSecundaria = new JTable(model_5Secundaria);
                    jScrollPane_5toSecundaria.setViewportView(Tabla_5toSecundaria);

                    //recuperar valores de BD A LA TABLA
                    while(resul2.next())
                    {
                        fila2[0]=resul2.getString("Dni_est");
                        fila2[1]=resul2.getString("Nombre_est");
                        fila2[2]=resul2.getString("Apellidos_est");
                        fila2[3]=resul2.getString("FechaRegistro");
                        fila2[4]=resul2.getString("Estado");
                        fila2[5]=resul2.getString("nombre_tutor");
                        model_5Secundaria.addRow(fila2);
                    }
                    cn2.close();

                    // EVENTO EN LA TABLA
                    Tabla_5toSecundaria.addMouseListener(new MouseAdapter()
                        {
                            @Override
                            public void mouseClicked(MouseEvent e)
                            {// recuperar celda celecionada
                                int fila_poin=Tabla_5toSecundaria.rowAtPoint(e.getPoint());
                                if(fila_poin>-1)
                                { //recuperar codigo de la celda celecionda
                                    String dni_padre= (String)model_5Secundaria.getValueAt(fila_poin,0);
                                    try {
                                        MensajeroInfromacionEstudiante(dni_padre);
                                    } catch (IOException ex) {
                                        Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                    }

                                }
                            }
                        });
                        break;

                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                        case"DNI":

                        Connection cn3= Conexion.Conectar();
                        PreparedStatement pst3= cn3.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                            + "    FechaRegistro,Estado,nombre_tutor from tabla_quinto_secundaria where Dni_est like"+'"'+texto+'"');
                        String[] fila3= new String[6];
                        ResultSet resul3=pst3.executeQuery();
                        Tabla_5toSecundaria = new JTable(model_5Secundaria);
                        jScrollPane_5toSecundaria.setViewportView(Tabla_5toSecundaria);

                        //recuperar valores de BD A LA TABLA
                        while(resul3.next())
                        {
                            fila3[0]=resul3.getString("Dni_est");
                            fila3[1]=resul3.getString("Nombre_est");
                            fila3[2]=resul3.getString("Apellidos_est");
                            fila3[3]=resul3.getString("FechaRegistro");
                            fila3[4]=resul3.getString("Estado");
                            fila3[5]=resul3.getString("nombre_tutor");
                            model_5Secundaria.addRow(fila3);
                        }
                        cn3.close();

                        // EVENTO EN LA TABLA
                        Tabla_5toSecundaria.addMouseListener(new MouseAdapter()
                            {
                                @Override
                                public void mouseClicked(MouseEvent e)
                                {// recuperar celda celecionada
                                    int fila_poin=Tabla_5toSecundaria.rowAtPoint(e.getPoint());
                                    if(fila_poin>-1)
                                    { //recuperar codigo de la celda celecionda
                                        String dni_padre= (String)model_5Secundaria.getValueAt(fila_poin,0);
                                        try {
                                            MensajeroInfromacionEstudiante(dni_padre);
                                        } catch (IOException ex) {
                                            Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }
                                }
                            });
                            break;
                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                        case"Estado":

                        Connection cn4= Conexion.Conectar();
                        PreparedStatement pst4= cn4.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                            + "    FechaRegistro,Estado,nombre_tutor from tabla_quinto_secundaria where Estado like"+'"'+texto+'"');
                        String[] fila4= new String[6];
                        ResultSet resul4=pst4.executeQuery();
                        Tabla_5toSecundaria = new JTable(model_5Secundaria);
                        jScrollPane_5toSecundaria.setViewportView(Tabla_5toSecundaria);

                        //recuperar valores de BD A LA TABLA
                        while(resul4.next())
                        {
                            fila4[0]=resul4.getString("Dni_est");
                            fila4[1]=resul4.getString("Nombre_est");
                            fila4[2]=resul4.getString("Apellidos_est");
                            fila4[3]=resul4.getString("FechaRegistro");
                            fila4[4]=resul4.getString("Estado");
                            fila4[5]=resul4.getString("nombre_tutor");
                            model_5Secundaria.addRow(fila4);
                        }
                        cn4.close();

                        // EVENTO EN LA TABLA
                        Tabla_5toSecundaria.addMouseListener(new MouseAdapter()
                            {
                                @Override
                                public void mouseClicked(MouseEvent e)
                                {// recuperar celda celecionada
                                    int fila_poin=Tabla_5toSecundaria.rowAtPoint(e.getPoint());
                                    if(fila_poin>-1)
                                    { //recuperar codigo de la celda celecionda
                                        String dni_padre= (String)model_5Secundaria.getValueAt(fila_poin,0);
                                        try {
                                            MensajeroInfromacionEstudiante(dni_padre);
                                        } catch (IOException ex) {
                                            Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }
                                }
                            });
                            break;
                        }
                    } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error al filtar "+jcmb_tipoFiltro5Secundaria.getSelectedItem().toString()+"","",JOptionPane.ERROR_MESSAGE);
                        System.err.println("error al filtar la busqueda: "+e); }
    }//GEN-LAST:event_txt_filtroCodigo_5SecundariaKeyReleased

    private void txt_filtroCodigo_5SecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtroCodigo_5SecundariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filtroCodigo_5SecundariaActionPerformed

    private void jcmb_tipoFiltro5SecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_tipoFiltro5SecundariaActionPerformed
        txt_filtroCodigo_5Secundaria.setText("");
        txt_filtroCodigo_5Secundaria.requestFocus();
    }//GEN-LAST:event_jcmb_tipoFiltro5SecundariaActionPerformed

    private void Boton_4SecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_4SecundariaActionPerformed
        // TODO add your handling code here:
        String[] TitulosSecundaria={"DNI","NOMBRE","APELLIDOS","FECHA REGISTRO","ESTADO","TUTOR"};

        // en texto escrito a consultar en la tabla
        String año=cmb_4Secundaria.getSelectedItem().toString();

        if(año=="Todos")
        {
            //agregamos datos la tabla estudiantes del 1 secundaria
            try {
                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_cuarto_secundaria");
                ResultSet result1=pst1.executeQuery();
                model_4Secundaria=new DefaultTableModel(null,TitulosSecundaria);
                Tabla_4toSecundaria=new JTable(model_4Secundaria);
                jScrollPane_4toSecundaria.setViewportView(Tabla_4toSecundaria);
                while(result1.next()){
                    Object[] columna=new Object[6];
                    for(int i=0;i<6;i++){
                        columna[i]=result1.getObject(i+1);
                    }
                    model_4Secundaria.addRow(columna);
                }
                cn1.close();

            } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 4to de secundaria");
                System.err.println("ERROR, al rellenar tabla del 4to secundaria:"+e); }

        }
        else
        {
            //agregamos datos la tabla estudiantes del 1 secundaria
            try {
                String añoSeleccionado="%"+cmb_4Secundaria.getSelectedItem().toString()+"%";

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_cuarto_secundaria where FechaRegistro like"+'"'+añoSeleccionado+'"');
                ResultSet result1=pst1.executeQuery();
                model_4Secundaria=new DefaultTableModel(null,TitulosSecundaria);
                Tabla_4toSecundaria=new JTable(model_4Secundaria);
                jScrollPane_4toSecundaria.setViewportView(Tabla_4toSecundaria);
                while(result1.next()){
                    Object[] columna=new Object[6];
                    for(int i=0;i<6;i++){
                        columna[i]=result1.getObject(i+1);
                    }
                    model_4Secundaria.addRow(columna);
                }
                cn1.close();

            } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 4to de secundaria");
                System.err.println("ERROR, al rellenar tabla del 4to secundaria:"+e); }

        }
    }//GEN-LAST:event_Boton_4SecundariaActionPerformed

    private void txt_filtroCodigo_4SecundariaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroCodigo_4SecundariaKeyReleased
        // TODO add your handling code here:
        try
        {// en texto escrito a consultar en la tabla
            String texto="%"+txt_filtroCodigo_4Secundaria.getText().trim()+"%";

            // secuberra el tipo de filtro
            String filtroSelec=jcmb_tipoFiltro4Secundaria.getSelectedItem().toString();

            // ETIQUETAS DE EMCABEZADO DE TABLA
            String[] titulos={"DNI", "NOMBRE", "APELLIDOS", "FECHA REGISTRO", "ESTADO", "TUTOR"};
            model_4Secundaria=new DefaultTableModel(null,titulos);

            // FUNCIONES DEPENDIENDO DEL TIPO DE FILTRO ELEGIDO
            switch (filtroSelec)
            {//*********** FILTRO PARA NOMBRE DE CLIENTES ************
                case"Nombre":

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1= cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_cuarto_secundaria where Nombre_est like"+'"'+texto+'"');
                String[] fila1= new String[6];
                ResultSet resul1=pst1.executeQuery();
                Tabla_4toSecundaria = new JTable(model_4Secundaria);
                jScrollPane_4toSecundaria.setViewportView(Tabla_4toSecundaria);

                //recuperar valores de BD A LA TABLA
                while(resul1.next())
                {
                    fila1[0]=resul1.getString("Dni_est");
                    fila1[1]=resul1.getString("Nombre_est");
                    fila1[2]=resul1.getString("Apellidos_est");
                    fila1[3]=resul1.getString("FechaRegistro");
                    fila1[4]=resul1.getString("Estado");
                    fila1[5]=resul1.getString("nombre_tutor");
                    model_4Secundaria.addRow(fila1);
                }
                cn1.close();

                // EVENTO EN LA TABLA
                Tabla_4toSecundaria.addMouseListener(new MouseAdapter()
                    {
                        @Override
                        public void mouseClicked(MouseEvent e)
                        {// recuperar celda celecionada
                            int fila_poin=Tabla_4toSecundaria.rowAtPoint(e.getPoint());
                            if(fila_poin>-1)
                            { //recuperar codigo de la celda celecionda
                                String dni_padre= (String)model_4Secundaria.getValueAt(fila_poin,0);
                                try {
                                    MensajeroInfromacionEstudiante(dni_padre);
                                } catch (IOException ex) {
                                    Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                }

                            }
                        }
                    });
                    break;
                    //********** FILTRO DE APELLIDOS DE CLIENTES **********
                    case"Apellidos":

                    Connection cn2= Conexion.Conectar();
                    PreparedStatement pst2= cn2.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                        + "    FechaRegistro,Estado,nombre_tutor from tabla_cuarto_secundaria where Apellidos_est like"+'"'+texto+'"');
                    String[] fila2= new String[6];
                    ResultSet resul2=pst2.executeQuery();
                    Tabla_4toSecundaria = new JTable(model_4Secundaria);
                    jScrollPane_4toSecundaria.setViewportView(Tabla_4toSecundaria);

                    //recuperar valores de BD A LA TABLA
                    while(resul2.next())
                    {
                        fila2[0]=resul2.getString("Dni_est");
                        fila2[1]=resul2.getString("Nombre_est");
                        fila2[2]=resul2.getString("Apellidos_est");
                        fila2[3]=resul2.getString("FechaRegistro");
                        fila2[4]=resul2.getString("Estado");
                        fila2[5]=resul2.getString("nombre_tutor");
                        model_4Secundaria.addRow(fila2);
                    }
                    cn2.close();

                    // EVENTO EN LA TABLA
                    Tabla_4toSecundaria.addMouseListener(new MouseAdapter()
                        {
                            @Override
                            public void mouseClicked(MouseEvent e)
                            {// recuperar celda celecionada
                                int fila_poin=Tabla_4toSecundaria.rowAtPoint(e.getPoint());
                                if(fila_poin>-1)
                                { //recuperar codigo de la celda celecionda
                                    String dni_padre= (String)model_4Secundaria.getValueAt(fila_poin,0);
                                    try {
                                        MensajeroInfromacionEstudiante(dni_padre);
                                    } catch (IOException ex) {
                                        Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                    }

                                }
                            }
                        });
                        break;

                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                        case"DNI":

                        Connection cn3= Conexion.Conectar();
                        PreparedStatement pst3= cn3.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                            + "    FechaRegistro,Estado,nombre_tutor from tabla_cuarto_secundaria where Dni_est like"+'"'+texto+'"');
                        String[] fila3= new String[6];
                        ResultSet resul3=pst3.executeQuery();
                        Tabla_4toSecundaria = new JTable(model_4Secundaria);
                        jScrollPane_4toSecundaria.setViewportView(Tabla_4toSecundaria);

                        //recuperar valores de BD A LA TABLA
                        while(resul3.next())
                        {
                            fila3[0]=resul3.getString("Dni_est");
                            fila3[1]=resul3.getString("Nombre_est");
                            fila3[2]=resul3.getString("Apellidos_est");
                            fila3[3]=resul3.getString("FechaRegistro");
                            fila3[4]=resul3.getString("Estado");
                            fila3[5]=resul3.getString("nombre_tutor");
                            model_4Secundaria.addRow(fila3);
                        }
                        cn3.close();

                        // EVENTO EN LA TABLA
                        Tabla_4toSecundaria.addMouseListener(new MouseAdapter()
                            {
                                @Override
                                public void mouseClicked(MouseEvent e)
                                {// recuperar celda celecionada
                                    int fila_poin=Tabla_4toSecundaria.rowAtPoint(e.getPoint());
                                    if(fila_poin>-1)
                                    { //recuperar codigo de la celda celecionda
                                        String dni_padre= (String)model_4Secundaria.getValueAt(fila_poin,0);
                                        try {
                                            MensajeroInfromacionEstudiante(dni_padre);
                                        } catch (IOException ex) {
                                            Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }
                                }
                            });
                            break;
                            
                            
                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                        case"Estado":

                        Connection cn4= Conexion.Conectar();
                        PreparedStatement pst4= cn4.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                            + "    FechaRegistro,Estado,nombre_tutor from tabla_cuarto_secundaria where Estado like"+'"'+texto+'"');
                        String[] fila4= new String[6];
                        ResultSet resul4=pst4.executeQuery();
                        Tabla_4toSecundaria = new JTable(model_4Secundaria);
                        jScrollPane_4toSecundaria.setViewportView(Tabla_4toSecundaria);

                        //recuperar valores de BD A LA TABLA
                        while(resul4.next())
                        {
                            fila4[0]=resul4.getString("Dni_est");
                            fila4[1]=resul4.getString("Nombre_est");
                            fila4[2]=resul4.getString("Apellidos_est");
                            fila4[3]=resul4.getString("FechaRegistro");
                            fila4[4]=resul4.getString("Estado");
                            fila4[5]=resul4.getString("nombre_tutor");
                            model_4Secundaria.addRow(fila4);
                        }
                        cn4.close();

                        // EVENTO EN LA TABLA
                        Tabla_4toSecundaria.addMouseListener(new MouseAdapter()
                            {
                                @Override
                                public void mouseClicked(MouseEvent e)
                                {// recuperar celda celecionada
                                    int fila_poin=Tabla_4toSecundaria.rowAtPoint(e.getPoint());
                                    if(fila_poin>-1)
                                    { //recuperar codigo de la celda celecionda
                                        String dni_padre= (String)model_4Secundaria.getValueAt(fila_poin,0);
                                        try {
                                            MensajeroInfromacionEstudiante(dni_padre);
                                        } catch (IOException ex) {
                                            Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }
                                }
                            });
                            break;
                            
                            
                        }
                    } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error al filtar "+jcmb_tipoFiltro4Secundaria.getSelectedItem().toString()+"","",JOptionPane.ERROR_MESSAGE);
                        System.err.println("error al filtar la busqueda: "+e); }
    }//GEN-LAST:event_txt_filtroCodigo_4SecundariaKeyReleased

    private void txt_filtroCodigo_4SecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtroCodigo_4SecundariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filtroCodigo_4SecundariaActionPerformed

    private void jcmb_tipoFiltro4SecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_tipoFiltro4SecundariaActionPerformed
        txt_filtroCodigo_4Secundaria.setText("");
        txt_filtroCodigo_4Secundaria.requestFocus();
    }//GEN-LAST:event_jcmb_tipoFiltro4SecundariaActionPerformed

    private void Boton_3SecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_3SecundariaActionPerformed
        // TODO add your handling code here:
        String[] TitulosSecundaria={"DNI","NOMBRE","APELLIDOS","FECHA REGISTRO","ESTADO","TUTOR"};

        // en texto escrito a consultar en la tabla
        String año=cmb_3Secundaria.getSelectedItem().toString();

        if(año=="Todos")
        {
            //agregamos datos la tabla estudiantes del 1 secundaria
            try {
                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_tercero_secundaria");
                ResultSet result1=pst1.executeQuery();
                model_3Secundaria=new DefaultTableModel(null,TitulosSecundaria);
                Tabla_3roSecundaria=new JTable(model_3Secundaria);
                jScrollPane_3roSecundaria.setViewportView(Tabla_3roSecundaria);
                while(result1.next()){
                    Object[] columna=new Object[6];
                    for(int i=0;i<6;i++){
                        columna[i]=result1.getObject(i+1);
                    }
                    model_3Secundaria.addRow(columna);
                }
                cn1.close();

            } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 3ro de secundaria");
                System.err.println("ERROR, al rellenar tabla del 3ero secundaria:"+e); }

        }
        else
        {
            //agregamos datos la tabla estudiantes del 1 secundaria
            try {
                String añoSeleccionado="%"+cmb_3Secundaria.getSelectedItem().toString()+"%";

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_tercero_secundaria where FechaRegistro like"+'"'+añoSeleccionado+'"');
                ResultSet result1=pst1.executeQuery();
                model_3Secundaria=new DefaultTableModel(null,TitulosSecundaria);
                Tabla_3roSecundaria=new JTable(model_3Secundaria);
                jScrollPane_3roSecundaria.setViewportView(Tabla_3roSecundaria);
                while(result1.next()){
                    Object[] columna=new Object[6];
                    for(int i=0;i<6;i++){
                        columna[i]=result1.getObject(i+1);
                    }
                    model_3Secundaria.addRow(columna);
                }
                cn1.close();

            } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 3ero de secundaria");
                System.err.println("ERROR, al rellenar tabla del 3ero secundaria:"+e); }

        }
    }//GEN-LAST:event_Boton_3SecundariaActionPerformed

    private void txt_filtroCodigo_3SecundariaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroCodigo_3SecundariaKeyReleased
        // TODO add your handling code here:

        try
        {// en texto escrito a consultar en la tabla
            String texto="%"+txt_filtroCodigo_3Secundaria.getText().trim()+"%";

            // secuberra el tipo de filtro
            String filtroSelec=jcmb_tipoFiltro3Secundaria.getSelectedItem().toString();

            // ETIQUETAS DE EMCABEZADO DE TABLA
            String[] titulos={"DNI", "NOMBRE", "APELLIDOS", "FECHA REGISTRO", "ESTADO", "TUTOR"};
            model_3Secundaria=new DefaultTableModel(null,titulos);

            // FUNCIONES DEPENDIENDO DEL TIPO DE FILTRO ELEGIDO
            switch (filtroSelec)
            {//*********** FILTRO PARA NOMBRE DE CLIENTES ************
                case"Nombre":

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1= cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_tercero_secundaria where Nombre_est like"+'"'+texto+'"');
                String[] fila1= new String[6];
                ResultSet resul1=pst1.executeQuery();
                Tabla_3roSecundaria = new JTable(model_3Secundaria);
                jScrollPane_3roSecundaria.setViewportView(Tabla_3roSecundaria);

                //recuperar valores de BD A LA TABLA
                while(resul1.next())
                {
                    fila1[0]=resul1.getString("Dni_est");
                    fila1[1]=resul1.getString("Nombre_est");
                    fila1[2]=resul1.getString("Apellidos_est");
                    fila1[3]=resul1.getString("FechaRegistro");
                    fila1[4]=resul1.getString("Estado");
                    fila1[5]=resul1.getString("nombre_tutor");
                    model_3Secundaria.addRow(fila1);
                }
                cn1.close();

                // EVENTO EN LA TABLA
                Tabla_3roSecundaria.addMouseListener(new MouseAdapter()
                    {
                        @Override
                        public void mouseClicked(MouseEvent e)
                        {// recuperar celda celecionada
                            int fila_poin=Tabla_3roSecundaria.rowAtPoint(e.getPoint());
                            if(fila_poin>-1)
                            { //recuperar codigo de la celda celecionda
                                String dni_padre= (String)model_3Secundaria.getValueAt(fila_poin,0);
                                try {
                                    MensajeroInfromacionEstudiante(dni_padre);
                                } catch (IOException ex) {
                                    Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                }

                            }
                        }
                    });
                    break;
                    //********** FILTRO DE APELLIDOS DE CLIENTES **********
                    case"Apellidos":

                    Connection cn2= Conexion.Conectar();
                    PreparedStatement pst2= cn2.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                        + "    FechaRegistro,Estado,nombre_tutor from tabla_tercero_secundaria where Apellidos_est like"+'"'+texto+'"');
                    String[] fila2= new String[6];
                    ResultSet resul2=pst2.executeQuery();
                    Tabla_3roSecundaria = new JTable(model_3Secundaria);
                    jScrollPane_3roSecundaria.setViewportView(Tabla_3roSecundaria);

                    //recuperar valores de BD A LA TABLA
                    while(resul2.next())
                    {
                        fila2[0]=resul2.getString("Dni_est");
                        fila2[1]=resul2.getString("Nombre_est");
                        fila2[2]=resul2.getString("Apellidos_est");
                        fila2[3]=resul2.getString("FechaRegistro");
                        fila2[4]=resul2.getString("Estado");
                        fila2[5]=resul2.getString("nombre_tutor");
                        model_3Secundaria.addRow(fila2);
                    }
                    cn2.close();

                    // EVENTO EN LA TABLA
                    Tabla_3roSecundaria.addMouseListener(new MouseAdapter()
                        {
                            @Override
                            public void mouseClicked(MouseEvent e)
                            {// recuperar celda celecionada
                                int fila_poin=Tabla_3roSecundaria.rowAtPoint(e.getPoint());
                                if(fila_poin>-1)
                                { //recuperar codigo de la celda celecionda
                                    String dni_padre= (String)model_2Secundaria.getValueAt(fila_poin,0);
                                    try {
                                        MensajeroInfromacionEstudiante(dni_padre);
                                    } catch (IOException ex) {
                                        Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                    }

                                }
                            }
                        });
                        break;

                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                        case"DNI":

                        Connection cn3= Conexion.Conectar();
                        PreparedStatement pst3= cn3.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                            + "    FechaRegistro,Estado,nombre_tutor from tabla_tercero_secundaria where Dni_est like"+'"'+texto+'"');
                        String[] fila3= new String[6];
                        ResultSet resul3=pst3.executeQuery();
                        Tabla_3roSecundaria = new JTable(model_3Secundaria);
                        jScrollPane_3roSecundaria.setViewportView(Tabla_3roSecundaria);

                        //recuperar valores de BD A LA TABLA
                        while(resul3.next())
                        {
                            fila3[0]=resul3.getString("Dni_est");
                            fila3[1]=resul3.getString("Nombre_est");
                            fila3[2]=resul3.getString("Apellidos_est");
                            fila3[3]=resul3.getString("FechaRegistro");
                            fila3[4]=resul3.getString("Estado");
                            fila3[5]=resul3.getString("nombre_tutor");
                            model_3Secundaria.addRow(fila3);
                        }
                        cn3.close();

                        // EVENTO EN LA TABLA
                        Tabla_3roSecundaria.addMouseListener(new MouseAdapter()
                            {
                                @Override
                                public void mouseClicked(MouseEvent e)
                                {// recuperar celda celecionada
                                    int fila_poin=Tabla_3roSecundaria.rowAtPoint(e.getPoint());
                                    if(fila_poin>-1)
                                    { //recuperar codigo de la celda celecionda
                                        String dni_padre= (String)model_3Secundaria.getValueAt(fila_poin,0);
                                        try {
                                            MensajeroInfromacionEstudiante(dni_padre);
                                        } catch (IOException ex) {
                                            Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }
                                }
                            });
                            break;

                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                        case"Estado":

                        Connection cn4= Conexion.Conectar();
                        PreparedStatement pst4= cn4.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                            + "    FechaRegistro,Estado,nombre_tutor from tabla_tercero_secundaria where Estado like"+'"'+texto+'"');
                        String[] fila4= new String[6];
                        ResultSet resul4=pst4.executeQuery();
                        Tabla_3roSecundaria = new JTable(model_3Secundaria);
                        jScrollPane_3roSecundaria.setViewportView(Tabla_3roSecundaria);

                        //recuperar valores de BD A LA TABLA
                        while(resul4.next())
                        {
                            fila4[0]=resul4.getString("Dni_est");
                            fila4[1]=resul4.getString("Nombre_est");
                            fila4[2]=resul4.getString("Apellidos_est");
                            fila4[3]=resul4.getString("FechaRegistro");
                            fila4[4]=resul4.getString("Estado");
                            fila4[5]=resul4.getString("nombre_tutor");
                            model_3Secundaria.addRow(fila4);
                        }
                        cn4.close();

                        // EVENTO EN LA TABLA
                        Tabla_3roSecundaria.addMouseListener(new MouseAdapter()
                            {
                                @Override
                                public void mouseClicked(MouseEvent e)
                                {// recuperar celda celecionada
                                    int fila_poin=Tabla_3roSecundaria.rowAtPoint(e.getPoint());
                                    if(fila_poin>-1)
                                    { //recuperar codigo de la celda celecionda
                                        String dni_padre= (String)model_3Secundaria.getValueAt(fila_poin,0);
                                        try {
                                            MensajeroInfromacionEstudiante(dni_padre);
                                        } catch (IOException ex) {
                                            Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }
                                }
                            });
                            break;
 
            }
                    } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error al filtar "+jcmb_tipoFiltro3Secundaria.getSelectedItem().toString()+"","",JOptionPane.ERROR_MESSAGE);
                        System.err.println("error al filtar la busqueda: "+e); }
    }//GEN-LAST:event_txt_filtroCodigo_3SecundariaKeyReleased

    private void txt_filtroCodigo_3SecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtroCodigo_3SecundariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filtroCodigo_3SecundariaActionPerformed

    private void jcmb_tipoFiltro3SecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_tipoFiltro3SecundariaActionPerformed

        txt_filtroCodigo_3Secundaria.setText("");
        txt_filtroCodigo_3Secundaria.requestFocus();
    }//GEN-LAST:event_jcmb_tipoFiltro3SecundariaActionPerformed

    private void Boton_2SecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_2SecundariaActionPerformed

        String[] TitulosSecundaria={"DNI","NOMBRE","APELLIDOS","FECHA REGISTRO","ESTADO","TUTOR"};

        // en texto escrito a consultar en la tabla
        String año=cmb_2Secundaria.getSelectedItem().toString();

        if(año=="Todos")
        {
            //agregamos datos la tabla estudiantes del 1 secundaria
            try {
                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_segundo_secundaria");
                ResultSet result1=pst1.executeQuery();
                model_2Secundaria=new DefaultTableModel(null,TitulosSecundaria);
                Tabla_2doSecundaria=new JTable(model_2Secundaria);
                jScrollPane_2doSecundaria.setViewportView(Tabla_2doSecundaria);
                while(result1.next()){
                    Object[] columna=new Object[6];
                    for(int i=0;i<6;i++){
                        columna[i]=result1.getObject(i+1);
                    }
                    model_2Secundaria.addRow(columna);
                }
                cn1.close();

            } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 2do de secundaria");
                System.err.println("ERROR, al rellenar tabla del 2do secundaria:"+e); }

        }
        else
        {
            //agregamos datos la tabla estudiantes del 1 secundaria
            try {
                String añoSeleccionado="%"+cmb_2Secundaria.getSelectedItem().toString()+"%";

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_segundo_secundaria where FechaRegistro like"+'"'+añoSeleccionado+'"');
                ResultSet result1=pst1.executeQuery();
                model_2Secundaria=new DefaultTableModel(null,TitulosSecundaria);
                Tabla_2doSecundaria=new JTable(model_2Secundaria);
                jScrollPane_2doSecundaria.setViewportView(Tabla_2doSecundaria);
                while(result1.next()){
                    Object[] columna=new Object[6];
                    for(int i=0;i<6;i++){
                        columna[i]=result1.getObject(i+1);
                    }
                    model_2Secundaria.addRow(columna);
                }
                cn1.close();

            } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 2do de secundaria");
                System.err.println("ERROR, al rellenar tabla del 2do secundaria:"+e); }

        }
    }//GEN-LAST:event_Boton_2SecundariaActionPerformed

    private void txt_filtroCodigo_2SecundariaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroCodigo_2SecundariaKeyReleased
        // TODO add your handling code here:

        try
        {// en texto escrito a consultar en la tabla
            String texto="%"+txt_filtroCodigo_2Secundaria.getText().trim()+"%";

            // secuberra el tipo de filtro
            String filtroSelec=jcmb_tipoFiltro2Secundaria.getSelectedItem().toString();

            // ETIQUETAS DE EMCABEZADO DE TABLA
            String[] titulos={"DNI", "NOMBRE", "APELLIDOS", "FECHA REGISTRO", "ESTADO", "TUTOR"};
            model_2Secundaria=new DefaultTableModel(null,titulos);

            // FUNCIONES DEPENDIENDO DEL TIPO DE FILTRO ELEGIDO
            switch (filtroSelec)
            {//*********** FILTRO PARA NOMBRE DE CLIENTES ************
                case"Nombre":

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1= cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_segundo_secundaria where Nombre_est like"+'"'+texto+'"');
                String[] fila1= new String[6];
                ResultSet resul1=pst1.executeQuery();
                Tabla_2doSecundaria = new JTable(model_2Secundaria);
                jScrollPane_2doSecundaria.setViewportView(Tabla_2doSecundaria);

                //recuperar valores de BD A LA TABLA
                while(resul1.next())
                {
                    fila1[0]=resul1.getString("Dni_est");
                    fila1[1]=resul1.getString("Nombre_est");
                    fila1[2]=resul1.getString("Apellidos_est");
                    fila1[3]=resul1.getString("FechaRegistro");
                    fila1[4]=resul1.getString("Estado");
                    fila1[5]=resul1.getString("nombre_tutor");
                    model_2Secundaria.addRow(fila1);
                }
                cn1.close();

                // EVENTO EN LA TABLA
                Tabla_2doSecundaria.addMouseListener(new MouseAdapter()
                    {
                        @Override
                        public void mouseClicked(MouseEvent e)
                        {// recuperar celda celecionada
                            int fila_poin=Tabla_2doSecundaria.rowAtPoint(e.getPoint());
                            if(fila_poin>-1)
                            { //recuperar codigo de la celda celecionda
                                String dni_padre= (String)model_2Secundaria.getValueAt(fila_poin,0);
                                try {
                                    MensajeroInfromacionEstudiante(dni_padre);
                                } catch (IOException ex) {
                                    Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                }

                            }
                        }
                    });
                    break;
                    //********** FILTRO DE APELLIDOS DE CLIENTES **********
                    case"Apellidos":

                    Connection cn2= Conexion.Conectar();
                    PreparedStatement pst2= cn2.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                        + "    FechaRegistro,Estado,nombre_tutor from tabla_segundo_secundaria where Apellidos_est like"+'"'+texto+'"');
                    String[] fila2= new String[6];
                    ResultSet resul2=pst2.executeQuery();
                    Tabla_2doSecundaria = new JTable(model_2Secundaria);
                    jScrollPane_2doSecundaria.setViewportView(Tabla_2doSecundaria);

                    //recuperar valores de BD A LA TABLA
                    while(resul2.next())
                    {
                        fila2[0]=resul2.getString("Dni_est");
                        fila2[1]=resul2.getString("Nombre_est");
                        fila2[2]=resul2.getString("Apellidos_est");
                        fila2[3]=resul2.getString("FechaRegistro");
                        fila2[4]=resul2.getString("Estado");
                        fila2[5]=resul2.getString("nombre_tutor");
                        model_2Secundaria.addRow(fila2);
                    }
                    cn2.close();

                    // EVENTO EN LA TABLA
                    Tabla_2doSecundaria.addMouseListener(new MouseAdapter()
                        {
                            @Override
                            public void mouseClicked(MouseEvent e)
                            {// recuperar celda celecionada
                                int fila_poin=Tabla_2doSecundaria.rowAtPoint(e.getPoint());
                                if(fila_poin>-1)
                                { //recuperar codigo de la celda celecionda
                                    String dni_padre= (String)model_2Secundaria.getValueAt(fila_poin,0);
                                    try {
                                        MensajeroInfromacionEstudiante(dni_padre);
                                    } catch (IOException ex) {
                                        Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                    }

                                }
                            }
                        });
                        break;

                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                        case"DNI":

                        Connection cn3= Conexion.Conectar();
                        PreparedStatement pst3= cn3.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                            + "    FechaRegistro,Estado,nombre_tutor from tabla_segundo_secundaria where Dni_est like"+'"'+texto+'"');
                        String[] fila3= new String[6];
                        ResultSet resul3=pst3.executeQuery();
                        Tabla_2doSecundaria = new JTable(model_2Secundaria);
                        jScrollPane_2doSecundaria.setViewportView(Tabla_2doSecundaria);

                        //recuperar valores de BD A LA TABLA
                        while(resul3.next())
                        {
                            fila3[0]=resul3.getString("Dni_est");
                            fila3[1]=resul3.getString("Nombre_est");
                            fila3[2]=resul3.getString("Apellidos_est");
                            fila3[3]=resul3.getString("FechaRegistro");
                            fila3[4]=resul3.getString("Estado");
                            fila3[5]=resul3.getString("nombre_tutor");
                            model_2Secundaria.addRow(fila3);
                        }
                        cn3.close();

                        // EVENTO EN LA TABLA
                        Tabla_2doSecundaria.addMouseListener(new MouseAdapter()
                            {
                                @Override
                                public void mouseClicked(MouseEvent e)
                                {// recuperar celda celecionada
                                    int fila_poin=Tabla_2doSecundaria.rowAtPoint(e.getPoint());
                                    if(fila_poin>-1)
                                    { //recuperar codigo de la celda celecionda
                                        String dni_padre= (String)model_2Secundaria.getValueAt(fila_poin,0);
                                        try {
                                            MensajeroInfromacionEstudiante(dni_padre);
                                        } catch (IOException ex) {
                                            Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }
                                }
                            });
                            break;
                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                        case"Estado":

                        Connection cn4= Conexion.Conectar();
                        PreparedStatement pst4= cn4.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                            + "    FechaRegistro,Estado,nombre_tutor from tabla_segundo_secundaria where Estado like"+'"'+texto+'"');
                        String[] fila4= new String[6];
                        ResultSet resul4=pst4.executeQuery();
                        Tabla_2doSecundaria = new JTable(model_2Secundaria);
                        jScrollPane_2doSecundaria.setViewportView(Tabla_2doSecundaria);

                        //recuperar valores de BD A LA TABLA
                        while(resul4.next())
                        {
                            fila4[0]=resul4.getString("Dni_est");
                            fila4[1]=resul4.getString("Nombre_est");
                            fila4[2]=resul4.getString("Apellidos_est");
                            fila4[3]=resul4.getString("FechaRegistro");
                            fila4[4]=resul4.getString("Estado");
                            fila4[5]=resul4.getString("nombre_tutor");
                            model_2Secundaria.addRow(fila4);
                        }
                        cn4.close();

                        // EVENTO EN LA TABLA
                        Tabla_2doSecundaria.addMouseListener(new MouseAdapter()
                            {
                                @Override
                                public void mouseClicked(MouseEvent e)
                                {// recuperar celda celecionada
                                    int fila_poin=Tabla_2doSecundaria.rowAtPoint(e.getPoint());
                                    if(fila_poin>-1)
                                    { //recuperar codigo de la celda celecionda
                                        String dni_padre= (String)model_2Secundaria.getValueAt(fila_poin,0);
                                        try {
                                            MensajeroInfromacionEstudiante(dni_padre);
                                        } catch (IOException ex) {
                                            Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }
                                }
                            });
                            break;

            }
                    } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error al filtar "+jcmb_tipoFiltro2Secundaria.getSelectedItem().toString()+"","",JOptionPane.ERROR_MESSAGE);
                        System.err.println("error al filtar la busqueda: "+e); }
    }//GEN-LAST:event_txt_filtroCodigo_2SecundariaKeyReleased

    private void txt_filtroCodigo_2SecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtroCodigo_2SecundariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filtroCodigo_2SecundariaActionPerformed

    private void jcmb_tipoFiltro2SecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_tipoFiltro2SecundariaActionPerformed

        txt_filtroCodigo_2Secundaria.setText("");
        txt_filtroCodigo_2Secundaria.requestFocus();
    }//GEN-LAST:event_jcmb_tipoFiltro2SecundariaActionPerformed

    private void Boton_1SecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_1SecundariaActionPerformed
        // TODO add your handling code here:
        String[] TitulosSecundaria={"DNI","NOMBRE","APELLIDOS","FECHA REGISTRO","ESTADO","TUTOR"};

        // en texto escrito a consultar en la tabla
        String año=cmb_1Secundaria.getSelectedItem().toString();

        if(año=="Todos")
        {
            //agregamos datos la tabla estudiantes del 1 secundaria
            try {
                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_primero_secundaria");
                ResultSet result1=pst1.executeQuery();
                model_1Secundaria=new DefaultTableModel(null,TitulosSecundaria);
                Tabla_1erSecundaria=new JTable(model_1Secundaria);
                jScrollPane_1erSecundaria.setViewportView(Tabla_1erSecundaria);
                while(result1.next()){
                    Object[] columna=new Object[6];
                    for(int i=0;i<6;i++){
                        columna[i]=result1.getObject(i+1);
                    }
                    model_1Secundaria.addRow(columna);
                }
                cn1.close();

            } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 1ero de secundaria");
                System.err.println("ERROR, al rellenar tabla del 1er secundaria:"+e); }

        }
        else
        {
            //agregamos datos la tabla estudiantes del 1 secundaria
            try {
                String añoSeleccionado="%"+cmb_1Secundaria.getSelectedItem().toString()+"%";

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1=cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_primero_secundaria where FechaRegistro like"+'"'+añoSeleccionado+'"');
                ResultSet result1=pst1.executeQuery();
                model_1Secundaria=new DefaultTableModel(null,TitulosSecundaria);
                Tabla_1erSecundaria=new JTable(model_1Secundaria);
                jScrollPane_1erSecundaria.setViewportView(Tabla_1erSecundaria);
                while(result1.next()){
                    Object[] columna=new Object[6];
                    for(int i=0;i<6;i++){
                        columna[i]=result1.getObject(i+1);
                    }
                    model_1Secundaria.addRow(columna);
                }
                cn1.close();

            } catch (Exception e) {JOptionPane.showMessageDialog(null,"error al recuperar datos del 1ero de secundaria");
                System.err.println("ERROR, al rellenar tabla del 1er secundaria:"+e); }

        }
    }//GEN-LAST:event_Boton_1SecundariaActionPerformed

    private void txt_filtroCodigo_1SecundariaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroCodigo_1SecundariaKeyReleased

        try
        {// en texto escrito a consultar en la tabla
            String texto="%"+txt_filtroCodigo_1Secundaria.getText().trim()+"%";

            // secuberra el tipo de filtro
            String filtroSelec=jcmb_tipoFiltro1Secundaria.getSelectedItem().toString();

            // ETIQUETAS DE EMCABEZADO DE TABLA
            String[] titulos={"DNI", "NOMBRE", "APELLIDOS", "FECHA REGISTRO", "ESTADO", "TUTOR"};
            model_1Secundaria=new DefaultTableModel(null,titulos);

            // FUNCIONES DEPENDIENDO DEL TIPO DE FILTRO ELEGIDO
            switch (filtroSelec)
            {//*********** FILTRO PARA NOMBRE DE CLIENTES ************
                case"Nombre":

                Connection cn1= Conexion.Conectar();
                PreparedStatement pst1= cn1.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                    + "    FechaRegistro,Estado,nombre_tutor from tabla_primero_secundaria where Nombre_est like"+'"'+texto+'"');
                String[] fila1= new String[6];
                ResultSet resul1=pst1.executeQuery();
                Tabla_1erSecundaria = new JTable(model_1Secundaria);
                jScrollPane_1erSecundaria.setViewportView(Tabla_1erSecundaria);

                //recuperar valores de BD A LA TABLA
                while(resul1.next())
                {
                    fila1[0]=resul1.getString("Dni_est");
                    fila1[1]=resul1.getString("Nombre_est");
                    fila1[2]=resul1.getString("Apellidos_est");
                    fila1[3]=resul1.getString("FechaRegistro");
                    fila1[4]=resul1.getString("Estado");
                    fila1[5]=resul1.getString("nombre_tutor");
                    model_1Secundaria.addRow(fila1);
                }
                cn1.close();

                // EVENTO EN LA TABLA
                Tabla_1erSecundaria.addMouseListener(new MouseAdapter()
                    {
                        @Override
                        public void mouseClicked(MouseEvent e)
                        {// recuperar celda celecionada
                            int fila_poin=Tabla_1erSecundaria.rowAtPoint(e.getPoint());
                            if(fila_poin>-1)
                            { //recuperar codigo de la celda celecionda
                                String dni_padre= (String)model_1Secundaria.getValueAt(fila_poin,0);
                                try {
                                    MensajeroInfromacionEstudiante(dni_padre);
                                } catch (IOException ex) {
                                    Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                }

                            }
                        }
                    });
                    break;
                    //********** FILTRO DE APELLIDOS DE CLIENTES **********
                    case"Apellidos":

                    Connection cn2= Conexion.Conectar();
                    PreparedStatement pst2= cn2.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                        + "    FechaRegistro,Estado,nombre_tutor from tabla_primero_secundaria where Apellidos_est like"+'"'+texto+'"');
                    String[] fila2= new String[6];
                    ResultSet resul2=pst2.executeQuery();
                    Tabla_1erSecundaria = new JTable(model_1Secundaria);
                    jScrollPane_1erSecundaria.setViewportView(Tabla_1erSecundaria);

                    //recuperar valores de BD A LA TABLA
                    while(resul2.next())
                    {
                        fila2[0]=resul2.getString("Dni_est");
                        fila2[1]=resul2.getString("Nombre_est");
                        fila2[2]=resul2.getString("Apellidos_est");
                        fila2[3]=resul2.getString("FechaRegistro");
                        fila2[4]=resul2.getString("Estado");
                        fila2[5]=resul2.getString("nombre_tutor");
                        model_1Secundaria.addRow(fila2);
                    }
                    cn2.close();

                    // EVENTO EN LA TABLA
                    Tabla_1erSecundaria.addMouseListener(new MouseAdapter()
                        {
                            @Override
                            public void mouseClicked(MouseEvent e)
                            {// recuperar celda celecionada
                                int fila_poin=Tabla_1erSecundaria.rowAtPoint(e.getPoint());
                                if(fila_poin>-1)
                                { //recuperar codigo de la celda celecionda
                                    String dni_padre= (String)model_1Secundaria.getValueAt(fila_poin,0);
                                    try {
                                        MensajeroInfromacionEstudiante(dni_padre);
                                    } catch (IOException ex) {
                                        Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                    }

                                }
                            }
                        });
                        break;

                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                        case"DNI":

                        Connection cn3= Conexion.Conectar();
                        PreparedStatement pst3= cn3.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                            + "    FechaRegistro,Estado,nombre_tutor from tabla_primero_secundaria where Dni_est like"+'"'+texto+'"');
                        String[] fila3= new String[6];
                        ResultSet resul3=pst3.executeQuery();
                        Tabla_1erSecundaria = new JTable(model_1Secundaria);
                        jScrollPane_1erSecundaria.setViewportView(Tabla_1erSecundaria);

                        //recuperar valores de BD A LA TABLA
                        while(resul3.next())
                        {
                            fila3[0]=resul3.getString("Dni_est");
                            fila3[1]=resul3.getString("Nombre_est");
                            fila3[2]=resul3.getString("Apellidos_est");
                            fila3[3]=resul3.getString("FechaRegistro");
                            fila3[4]=resul3.getString("Estado");
                            fila3[5]=resul3.getString("nombre_tutor");
                            model_1Secundaria.addRow(fila3);
                        }
                        cn3.close();

                        // EVENTO EN LA TABLA
                        Tabla_1erSecundaria.addMouseListener(new MouseAdapter()
                            {
                                @Override
                                public void mouseClicked(MouseEvent e)
                                {// recuperar celda celecionada
                                    int fila_poin=Tabla_1erSecundaria.rowAtPoint(e.getPoint());
                                    if(fila_poin>-1)
                                    { //recuperar codigo de la celda celecionda
                                        String dni_padre= (String)model_1Secundaria.getValueAt(fila_poin,0);
                                        try {
                                            MensajeroInfromacionEstudiante(dni_padre);
                                        } catch (IOException ex) {
                                            Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }
                                }
                            });
                            break;
                        //********** FILTRO DE DIRECCION DE CLIENTES **********
                        case"Estado":

                        Connection cn4= Conexion.Conectar();
                        PreparedStatement pst4= cn4.prepareStatement("select Dni_est,Nombre_est,Apellidos_est,"
                            + "    FechaRegistro,Estado,nombre_tutor from tabla_primero_secundaria where Estado like"+'"'+texto+'"');
                        String[] fila4= new String[6];
                        ResultSet resul4=pst4.executeQuery();
                        Tabla_1erSecundaria = new JTable(model_1Secundaria);
                        jScrollPane_1erSecundaria.setViewportView(Tabla_1erSecundaria);

                        //recuperar valores de BD A LA TABLA
                        while(resul4.next())
                        {
                            fila4[0]=resul4.getString("Dni_est");
                            fila4[1]=resul4.getString("Nombre_est");
                            fila4[2]=resul4.getString("Apellidos_est");
                            fila4[3]=resul4.getString("FechaRegistro");
                            fila4[4]=resul4.getString("Estado");
                            fila4[5]=resul4.getString("nombre_tutor");
                            model_1Secundaria.addRow(fila4);
                        }
                        cn4.close();

                        // EVENTO EN LA TABLA
                        Tabla_1erSecundaria.addMouseListener(new MouseAdapter()
                            {
                                @Override
                                public void mouseClicked(MouseEvent e)
                                {// recuperar celda celecionada
                                    int fila_poin=Tabla_1erSecundaria.rowAtPoint(e.getPoint());
                                    if(fila_poin>-1)
                                    { //recuperar codigo de la celda celecionda
                                        String dni_padre= (String)model_1Secundaria.getValueAt(fila_poin,0);
                                        try {
                                            MensajeroInfromacionEstudiante(dni_padre);
                                        } catch (IOException ex) {
                                            Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                                        }

                                    }
                                }
                            });
                            break;

            }

                    } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error al filtar "+jcmb_tipoFiltro1Secundaria.getSelectedItem().toString()+"","",JOptionPane.ERROR_MESSAGE);
                        System.err.println("error al filtar la busqueda: "+e); }
    }//GEN-LAST:event_txt_filtroCodigo_1SecundariaKeyReleased

    private void txt_filtroCodigo_1SecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filtroCodigo_1SecundariaActionPerformed

    }//GEN-LAST:event_txt_filtroCodigo_1SecundariaActionPerformed

    private void jcmb_tipoFiltro1SecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_tipoFiltro1SecundariaActionPerformed
        // TODO add your handling code here:
        txt_filtroCodigo_1Secundaria.setText("");
        txt_filtroCodigo_1Secundaria.requestFocus();
    }//GEN-LAST:event_jcmb_tipoFiltro1SecundariaActionPerformed

    private void Menu_BuscarEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_BuscarEstudiantesMouseClicked
        // TODO add your handling code here:
    try {        
        InfoDelEstudiante infromacionEstudiante=new InfoDelEstudiante();
        infromacionEstudiante.setVisible(true);
    } catch (IOException ex) {
        Logger.getLogger(ListaEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_Menu_BuscarEstudiantesMouseClicked

    private void Menu_BuscarEstudiantesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_BuscarEstudiantesMousePressed
     Menu_BuscarEstudiantes.setForeground(new Color(204,0,51));
 
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu_BuscarEstudiantesMousePressed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaEstudiantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_1Secundaria;
    private javax.swing.JButton Boton_1primaria;
    private javax.swing.JButton Boton_2Secundaria;
    private javax.swing.JButton Boton_2primaria;
    private javax.swing.JButton Boton_3Secundaria;
    private javax.swing.JTabbedPane Boton_3primaria;
    private javax.swing.JButton Boton_3primaria2;
    private javax.swing.JButton Boton_4Secundaria;
    private javax.swing.JButton Boton_4añosInicial;
    private javax.swing.JButton Boton_4primaria;
    private javax.swing.JButton Boton_5Secundaria;
    private javax.swing.JButton Boton_5añosInicial;
    private javax.swing.JButton Boton_5primaria;
    private javax.swing.JButton Boton_6primaria;
    private javax.swing.JLabel LabelHora;
    private javax.swing.JMenu Menu_BuscarEstudiantes;
    private javax.swing.JTable Tabla_1erPrimaria;
    private javax.swing.JTable Tabla_1erSecundaria;
    private javax.swing.JTable Tabla_2doPrimaria;
    private javax.swing.JTable Tabla_2doSecundaria;
    private javax.swing.JTable Tabla_3roPrimaria;
    private javax.swing.JTable Tabla_3roSecundaria;
    private javax.swing.JTable Tabla_4añosInicial;
    private javax.swing.JTable Tabla_4toPrimaria;
    private javax.swing.JTable Tabla_4toSecundaria;
    private javax.swing.JTable Tabla_5añosInicial;
    private javax.swing.JTable Tabla_5toPrimaria;
    private javax.swing.JTable Tabla_5toSecundaria;
    private javax.swing.JTable Tabla_6toPrimaria;
    private javax.swing.JComboBox<String> cmb_1Secundaria;
    private javax.swing.JComboBox<String> cmb_1primaria;
    private javax.swing.JComboBox<String> cmb_2Secundaria;
    private javax.swing.JComboBox<String> cmb_2primaria;
    private javax.swing.JComboBox<String> cmb_3Secundaria;
    private javax.swing.JComboBox<String> cmb_3primaria;
    private javax.swing.JComboBox<String> cmb_4Secundaria;
    private javax.swing.JComboBox<String> cmb_4añosInicial;
    private javax.swing.JComboBox<String> cmb_4primaria;
    private javax.swing.JComboBox<String> cmb_5Secundaria;
    private javax.swing.JComboBox<String> cmb_5añosInicial;
    private javax.swing.JComboBox<String> cmb_5primaria;
    private javax.swing.JComboBox<String> cmb_6primaria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane_1erPrimaria;
    private javax.swing.JScrollPane jScrollPane_1erSecundaria;
    private javax.swing.JScrollPane jScrollPane_2doSecundaria;
    private javax.swing.JScrollPane jScrollPane_3roPrimaria;
    private javax.swing.JScrollPane jScrollPane_3roSecundaria;
    private javax.swing.JScrollPane jScrollPane_4añosInicial;
    private javax.swing.JScrollPane jScrollPane_4toPrimaria;
    private javax.swing.JScrollPane jScrollPane_4toSecundaria;
    private javax.swing.JScrollPane jScrollPane_5añosInicial;
    private javax.swing.JScrollPane jScrollPane_5toPrimaria;
    private javax.swing.JScrollPane jScrollPane_5toSecundaria;
    private javax.swing.JScrollPane jScrollPane_6toPrimaria;
    private javax.swing.JScrollPane jScrollPane__2doPrimaria;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JComboBox<String> jcmb_tipoFiltro1Secundaria;
    private javax.swing.JComboBox<String> jcmb_tipoFiltro2Secundaria;
    private javax.swing.JComboBox<String> jcmb_tipoFiltro3Secundaria;
    private javax.swing.JComboBox<String> jcmb_tipoFiltro4Secundaria;
    private javax.swing.JComboBox<String> jcmb_tipoFiltro5Secundaria;
    private javax.swing.JComboBox<String> jcmb_tipoFiltro_1primaria;
    private javax.swing.JComboBox<String> jcmb_tipoFiltro_2primaria;
    private javax.swing.JComboBox<String> jcmb_tipoFiltro_3primaria;
    private javax.swing.JComboBox<String> jcmb_tipoFiltro_4añosInicial;
    private javax.swing.JComboBox<String> jcmb_tipoFiltro_4primaria;
    private javax.swing.JComboBox<String> jcmb_tipoFiltro_5añosInicial;
    private javax.swing.JComboBox<String> jcmb_tipoFiltro_5primaria;
    private javax.swing.JComboBox<String> jcmb_tipoFiltro_6primaria;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel label_planadocenteActual;
    private javax.swing.JLabel label_planadocenteActual1;
    private javax.swing.JLabel label_planadocenteActual10;
    private javax.swing.JLabel label_planadocenteActual11;
    private javax.swing.JLabel label_planadocenteActual12;
    private javax.swing.JLabel label_planadocenteActual13;
    private javax.swing.JLabel label_planadocenteActual14;
    private javax.swing.JLabel label_planadocenteActual3;
    private javax.swing.JLabel label_planadocenteActual4;
    private javax.swing.JLabel label_planadocenteActual5;
    private javax.swing.JLabel label_planadocenteActual6;
    private javax.swing.JLabel label_planadocenteActual7;
    private javax.swing.JLabel label_planadocenteActual8;
    private javax.swing.JLabel label_planadocenteActual9;
    private javax.swing.JTextField txt_filtroCodigo_1Secundaria;
    private javax.swing.JTextField txt_filtroCodigo_1primaria;
    private javax.swing.JTextField txt_filtroCodigo_2Secundaria;
    private javax.swing.JTextField txt_filtroCodigo_2primaria;
    private javax.swing.JTextField txt_filtroCodigo_3Secundaria;
    private javax.swing.JTextField txt_filtroCodigo_3primaria;
    private javax.swing.JTextField txt_filtroCodigo_4Secundaria;
    private javax.swing.JTextField txt_filtroCodigo_4añosInicial;
    private javax.swing.JTextField txt_filtroCodigo_4primaria;
    private javax.swing.JTextField txt_filtroCodigo_5Secundaria;
    private javax.swing.JTextField txt_filtroCodigo_5añosInicial;
    private javax.swing.JTextField txt_filtroCodigo_5primaria;
    private javax.swing.JTextField txt_filtroCodigo_6primaria;
    // End of variables declaration//GEN-END:variables

public void MensajeroInfromacionEstudiante(String dni) throws IOException{
    DNI_est_Compartido=dni;
        System.out.println("dni enviado:"+DNI_est_Compartido);
    InfoDelEstudiante mensajero= new InfoDelEstudiante();
    mensajero.setVisible(true);
}
}
