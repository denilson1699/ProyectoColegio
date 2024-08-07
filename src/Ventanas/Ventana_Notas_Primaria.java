package Ventanas;

import Clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

// para el autocompletado
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.Toolkit;
import java.util.Calendar;

public class Ventana_Notas_Primaria extends javax.swing.JFrame {
 private TextAutoCompleter ac_DniEstudiante;
  
    public Ventana_Notas_Primaria() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        //this.setExtendedState(MAXIMIZED_BOTH);
         try {
        ac_DniEstudiante=new TextAutoCompleter(txt_dniEstudiante);
            Connection cc= Conexion.Conectar();
            PreparedStatement p=cc.prepareStatement("select *from tabla_estudiante");
            ResultSet rr=p.executeQuery();
            while(rr.next())
            {
                ac_DniEstudiante.addItem(rr.getString("Dni_est"));
            }
             cc.close();
        } catch (Exception e) { System.err.println("erro al rellenar info para el autompletaado de dni estudiante");}
        
         
         
         
        Calendar cal=Calendar.getInstance();
        String año=Integer.toString(cal.get(Calendar.YEAR));
        int añoInt=Integer.parseInt(año);
        
        for(int i=añoInt ;i>=2018;i--)
        {
            cmb_año.addItem(Integer.toString(i));
        }
        
        cmb_grado.setEnabled(false);
        Boton_buscar.setEnabled(false);
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        TXT_1B_Personal_Social = new javax.swing.JTextField();
        TXT_1B_Educación_Física = new javax.swing.JTextField();
        TXT_1B_Arte_y_cultura = new javax.swing.JTextField();
        TXT_1B_Comunicación = new javax.swing.JTextField();
        TXT_1B_Matemática = new javax.swing.JTextField();
        TXT_1B_Ciencia_y_Tecnología = new javax.swing.JTextField();
        TXT_1B_Educacíon_Religiosa = new javax.swing.JTextField();
        Boton_guardarNotas = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txt_dniEstudiante = new javax.swing.JTextField();
        Boton_buscar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        LabelNombre = new javax.swing.JLabel();
        labelApellidos = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        labelGrado = new javax.swing.JLabel();
        cmb_año = new javax.swing.JComboBox<>();
        cmb_grado = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        TXT_2B_Personal_Social1 = new javax.swing.JTextField();
        TXT_2B_Educación_Física1 = new javax.swing.JTextField();
        TXT_2B_Arte_y_cultura1 = new javax.swing.JTextField();
        TXT_2B_Comunicación1 = new javax.swing.JTextField();
        TXT_2B_Matemática1 = new javax.swing.JTextField();
        TXT_2B_Ciencia_y_Tecnología1 = new javax.swing.JTextField();
        TXT_2B_Educacíon_Religiosa1 = new javax.swing.JTextField();
        TXT_3B_Personal_Social2 = new javax.swing.JTextField();
        TXT_3B_Educación_Física2 = new javax.swing.JTextField();
        TXT_3B_Arte_y_cultura2 = new javax.swing.JTextField();
        TXT_3B_Comunicación2 = new javax.swing.JTextField();
        TXT_3B_Matemática2 = new javax.swing.JTextField();
        TXT_3B_Ciencia_y_Tecnología2 = new javax.swing.JTextField();
        TXT_3B_Educacíon_Religiosa2 = new javax.swing.JTextField();
        TXT_4B_Matemática3 = new javax.swing.JTextField();
        TXT_4B_Educacíon_Religiosa3 = new javax.swing.JTextField();
        TXT_4B_Personal_Social3 = new javax.swing.JTextField();
        TXT_4B_Educación_Física3 = new javax.swing.JTextField();
        TXT_4B_Arte_y_cultura3 = new javax.swing.JTextField();
        TXT_4B_Comunicación3 = new javax.swing.JTextField();
        TXT_4B_Ciencia_y_Tecnología3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Personal Social");

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Educación Física");

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Arte y cultura");

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Comunicación");

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Matemática");

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Ciencia y Tecnología");

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Educacíon Religiosa");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setText("1er ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setText("2do ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel12.setText("3er ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel13.setText("4to ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("Bimestre");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setText("Bimestre");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel14.setText("Bimestre");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel15.setText("Bimestre");

        TXT_1B_Personal_Social.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_Personal_Social.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_Personal_Social.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_Personal_Social.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_Personal_SocialKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_Personal_SocialKeyTyped(evt);
            }
        });

        TXT_1B_Educación_Física.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_Educación_Física.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_Educación_Física.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_Educación_Física.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_Educación_FísicaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_Educación_FísicaKeyTyped(evt);
            }
        });

        TXT_1B_Arte_y_cultura.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_Arte_y_cultura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_Arte_y_cultura.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_Arte_y_cultura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_Arte_y_culturaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_Arte_y_culturaKeyTyped(evt);
            }
        });

        TXT_1B_Comunicación.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_Comunicación.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_Comunicación.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_Comunicación.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_ComunicaciónKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_ComunicaciónKeyTyped(evt);
            }
        });

        TXT_1B_Matemática.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_Matemática.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_Matemática.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_Matemática.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_MatemáticaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_MatemáticaKeyTyped(evt);
            }
        });

        TXT_1B_Ciencia_y_Tecnología.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_Ciencia_y_Tecnología.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_Ciencia_y_Tecnología.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_Ciencia_y_Tecnología.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_Ciencia_y_TecnologíaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_Ciencia_y_TecnologíaKeyTyped(evt);
            }
        });

        TXT_1B_Educacíon_Religiosa.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_Educacíon_Religiosa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_Educacíon_Religiosa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_Educacíon_Religiosa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_Educacíon_ReligiosaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_Educacíon_ReligiosaKeyTyped(evt);
            }
        });

        Boton_guardarNotas.setBackground(new java.awt.Color(102, 102, 255));
        Boton_guardarNotas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Boton_guardarNotas.setForeground(new java.awt.Color(255, 255, 255));
        Boton_guardarNotas.setText("Guardar");
        Boton_guardarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_guardarNotasActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Registrar Notas Nivel Primario ");

        txt_dniEstudiante.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_dniEstudiante.setForeground(new java.awt.Color(51, 0, 51));
        txt_dniEstudiante.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_dniEstudiante.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Boton_buscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Boton_buscar.setForeground(new java.awt.Color(255, 255, 255));
        Boton_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        Boton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_buscarActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setText("Nombre:");

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 0));
        jLabel18.setText("pellidos:");

        LabelNombre.setBackground(new java.awt.Color(204, 204, 204));
        LabelNombre.setForeground(new java.awt.Color(0, 51, 51));
        LabelNombre.setText(".");

        labelApellidos.setBackground(new java.awt.Color(204, 204, 204));
        labelApellidos.setForeground(new java.awt.Color(0, 51, 51));
        labelApellidos.setText(".");

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setText("Grado:");

        labelGrado.setBackground(new java.awt.Color(204, 204, 204));
        labelGrado.setForeground(new java.awt.Color(0, 51, 51));
        labelGrado.setText(".");

        cmb_año.setForeground(new java.awt.Color(0, 102, 102));
        cmb_año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-AÑO-" }));
        cmb_año.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_añoActionPerformed(evt);
            }
        });

        cmb_grado.setForeground(new java.awt.Color(0, 102, 102));
        cmb_grado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-GRADO-", "1er Primaria", "2do Primaria", "3er Primaria", "4to Primaria", "5to Primaria", "6to Primaria" }));
        cmb_grado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_grado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_gradoActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel19.setText("DNI:");

        TXT_2B_Personal_Social1.setForeground(new java.awt.Color(0, 102, 102));
        TXT_2B_Personal_Social1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_2B_Personal_Social1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_2B_Personal_Social1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_2B_Personal_Social1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_2B_Personal_Social1KeyTyped(evt);
            }
        });

        TXT_2B_Educación_Física1.setForeground(new java.awt.Color(0, 102, 102));
        TXT_2B_Educación_Física1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_2B_Educación_Física1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_2B_Educación_Física1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_2B_Educación_Física1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_2B_Educación_Física1KeyTyped(evt);
            }
        });

        TXT_2B_Arte_y_cultura1.setForeground(new java.awt.Color(0, 102, 102));
        TXT_2B_Arte_y_cultura1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_2B_Arte_y_cultura1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_2B_Arte_y_cultura1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_2B_Arte_y_cultura1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_2B_Arte_y_cultura1KeyTyped(evt);
            }
        });

        TXT_2B_Comunicación1.setForeground(new java.awt.Color(0, 102, 102));
        TXT_2B_Comunicación1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_2B_Comunicación1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_2B_Comunicación1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_2B_Comunicación1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_2B_Comunicación1KeyTyped(evt);
            }
        });

        TXT_2B_Matemática1.setForeground(new java.awt.Color(0, 102, 102));
        TXT_2B_Matemática1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_2B_Matemática1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_2B_Matemática1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_2B_Matemática1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_2B_Matemática1KeyTyped(evt);
            }
        });

        TXT_2B_Ciencia_y_Tecnología1.setForeground(new java.awt.Color(0, 102, 102));
        TXT_2B_Ciencia_y_Tecnología1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_2B_Ciencia_y_Tecnología1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_2B_Ciencia_y_Tecnología1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_2B_Ciencia_y_Tecnología1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_2B_Ciencia_y_Tecnología1KeyTyped(evt);
            }
        });

        TXT_2B_Educacíon_Religiosa1.setForeground(new java.awt.Color(0, 102, 102));
        TXT_2B_Educacíon_Religiosa1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_2B_Educacíon_Religiosa1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_2B_Educacíon_Religiosa1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_2B_Educacíon_Religiosa1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_2B_Educacíon_Religiosa1KeyTyped(evt);
            }
        });

        TXT_3B_Personal_Social2.setForeground(new java.awt.Color(0, 102, 102));
        TXT_3B_Personal_Social2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_3B_Personal_Social2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_3B_Personal_Social2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_3B_Personal_Social2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_3B_Personal_Social2KeyTyped(evt);
            }
        });

        TXT_3B_Educación_Física2.setForeground(new java.awt.Color(0, 102, 102));
        TXT_3B_Educación_Física2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_3B_Educación_Física2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_3B_Educación_Física2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_3B_Educación_Física2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_3B_Educación_Física2KeyTyped(evt);
            }
        });

        TXT_3B_Arte_y_cultura2.setForeground(new java.awt.Color(0, 102, 102));
        TXT_3B_Arte_y_cultura2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_3B_Arte_y_cultura2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_3B_Arte_y_cultura2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_3B_Arte_y_cultura2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_3B_Arte_y_cultura2KeyTyped(evt);
            }
        });

        TXT_3B_Comunicación2.setForeground(new java.awt.Color(0, 102, 102));
        TXT_3B_Comunicación2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_3B_Comunicación2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_3B_Comunicación2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_3B_Comunicación2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_3B_Comunicación2KeyTyped(evt);
            }
        });

        TXT_3B_Matemática2.setForeground(new java.awt.Color(0, 102, 102));
        TXT_3B_Matemática2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_3B_Matemática2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_3B_Matemática2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_3B_Matemática2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_3B_Matemática2KeyTyped(evt);
            }
        });

        TXT_3B_Ciencia_y_Tecnología2.setForeground(new java.awt.Color(0, 102, 102));
        TXT_3B_Ciencia_y_Tecnología2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_3B_Ciencia_y_Tecnología2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_3B_Ciencia_y_Tecnología2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_3B_Ciencia_y_Tecnología2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_3B_Ciencia_y_Tecnología2KeyTyped(evt);
            }
        });

        TXT_3B_Educacíon_Religiosa2.setForeground(new java.awt.Color(0, 102, 102));
        TXT_3B_Educacíon_Religiosa2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_3B_Educacíon_Religiosa2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_3B_Educacíon_Religiosa2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_3B_Educacíon_Religiosa2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_3B_Educacíon_Religiosa2KeyTyped(evt);
            }
        });

        TXT_4B_Matemática3.setForeground(new java.awt.Color(0, 102, 102));
        TXT_4B_Matemática3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_4B_Matemática3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_4B_Matemática3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_4B_Matemática3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_4B_Matemática3KeyTyped(evt);
            }
        });

        TXT_4B_Educacíon_Religiosa3.setForeground(new java.awt.Color(0, 102, 102));
        TXT_4B_Educacíon_Religiosa3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_4B_Educacíon_Religiosa3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_4B_Educacíon_Religiosa3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_4B_Educacíon_Religiosa3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_4B_Educacíon_Religiosa3KeyTyped(evt);
            }
        });

        TXT_4B_Personal_Social3.setForeground(new java.awt.Color(0, 102, 102));
        TXT_4B_Personal_Social3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_4B_Personal_Social3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_4B_Personal_Social3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_4B_Personal_Social3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_4B_Personal_Social3KeyTyped(evt);
            }
        });

        TXT_4B_Educación_Física3.setForeground(new java.awt.Color(0, 102, 102));
        TXT_4B_Educación_Física3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_4B_Educación_Física3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_4B_Educación_Física3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_4B_Educación_Física3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_4B_Educación_Física3KeyTyped(evt);
            }
        });

        TXT_4B_Arte_y_cultura3.setForeground(new java.awt.Color(0, 102, 102));
        TXT_4B_Arte_y_cultura3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_4B_Arte_y_cultura3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_4B_Arte_y_cultura3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_4B_Arte_y_cultura3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_4B_Arte_y_cultura3KeyTyped(evt);
            }
        });

        TXT_4B_Comunicación3.setForeground(new java.awt.Color(0, 102, 102));
        TXT_4B_Comunicación3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_4B_Comunicación3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_4B_Comunicación3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_4B_Comunicación3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_4B_Comunicación3KeyTyped(evt);
            }
        });

        TXT_4B_Ciencia_y_Tecnología3.setForeground(new java.awt.Color(0, 102, 102));
        TXT_4B_Ciencia_y_Tecnología3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_4B_Ciencia_y_Tecnología3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_4B_Ciencia_y_Tecnología3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_4B_Ciencia_y_Tecnología3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_4B_Ciencia_y_Tecnología3KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cmb_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(cmb_grado, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_dniEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Boton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(93, 93, 93)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TXT_1B_Personal_Social)
                                            .addComponent(TXT_1B_Educación_Física)
                                            .addComponent(TXT_1B_Arte_y_cultura)
                                            .addComponent(TXT_1B_Comunicación)
                                            .addComponent(TXT_1B_Matemática)
                                            .addComponent(TXT_1B_Ciencia_y_Tecnología)
                                            .addComponent(TXT_1B_Educacíon_Religiosa))
                                        .addGap(24, 24, 24))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(35, 35, 35)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(jLabel11)))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jLabel14)
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel15))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(jLabel12)
                                                .addGap(44, 44, 44)
                                                .addComponent(jLabel13))))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Boton_guardarNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(TXT_2B_Comunicación1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                                .addComponent(TXT_2B_Matemática1)
                                                .addComponent(TXT_2B_Ciencia_y_Tecnología1)
                                                .addComponent(TXT_2B_Personal_Social1)
                                                .addComponent(TXT_2B_Educación_Física1)
                                                .addComponent(TXT_2B_Arte_y_cultura1)
                                                .addComponent(TXT_2B_Educacíon_Religiosa1))
                                            .addGap(27, 27, 27)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(TXT_3B_Comunicación2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                                .addComponent(TXT_3B_Matemática2)
                                                .addComponent(TXT_3B_Ciencia_y_Tecnología2)
                                                .addComponent(TXT_3B_Personal_Social2)
                                                .addComponent(TXT_3B_Educación_Física2)
                                                .addComponent(TXT_3B_Arte_y_cultura2)
                                                .addComponent(TXT_3B_Educacíon_Religiosa2))
                                            .addGap(24, 24, 24)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(TXT_4B_Educación_Física3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                                .addComponent(TXT_4B_Arte_y_cultura3, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(TXT_4B_Comunicación3, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(TXT_4B_Matemática3, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(TXT_4B_Ciencia_y_Tecnología3, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(TXT_4B_Educacíon_Religiosa3, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(TXT_4B_Personal_Social3))))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(76, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Boton_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmb_grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmb_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_dniEstudiante)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(LabelNombre)
                            .addComponent(labelGrado)
                            .addComponent(jLabel21))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(labelApellidos)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXT_2B_Personal_Social1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_3B_Personal_Social2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(TXT_2B_Educación_Física1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXT_2B_Arte_y_cultura1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXT_2B_Comunicación1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXT_2B_Matemática1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXT_2B_Ciencia_y_Tecnología1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXT_2B_Educacíon_Religiosa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_3B_Educacíon_Religiosa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_4B_Educacíon_Religiosa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(TXT_3B_Educación_Física2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXT_3B_Arte_y_cultura2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXT_3B_Comunicación2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXT_3B_Matemática2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXT_3B_Ciencia_y_Tecnología2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(TXT_1B_Educación_Física, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TXT_1B_Arte_y_cultura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TXT_1B_Comunicación, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TXT_1B_Matemática, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TXT_1B_Ciencia_y_Tecnología, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(TXT_4B_Educación_Física3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TXT_4B_Arte_y_cultura3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TXT_4B_Comunicación3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TXT_4B_Matemática3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TXT_4B_Ciencia_y_Tecnología3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXT_1B_Educacíon_Religiosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(TXT_4B_Personal_Social3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TXT_1B_Personal_Social, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addComponent(Boton_guardarNotas)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_añoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_añoActionPerformed

        cmb_grado.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_añoActionPerformed

    private void cmb_gradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_gradoActionPerformed

        Boton_buscar.setEnabled(true); 
        txt_dniEstudiante.requestFocus();

    }//GEN-LAST:event_cmb_gradoActionPerformed

    private void Boton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_buscarActionPerformed
        // TODO add your handling code here:
        labelApellidos.setText("");
        LabelNombre.setText("");
        labelGrado.setText("");
        limpiarCampos();
        String Tabla=cmb_grado.getSelectedItem().toString();
        String año="%"+cmb_año.getSelectedItem().toString()+"%";
        String tablaConsulta = null;
        switch(Tabla)
        {
            case"1er Primaria": tablaConsulta="tabla_primero_primaria"; break;
            case"2do Primaria": tablaConsulta="tabla_segundo_primaria"; break;
            case"3er Primaria": tablaConsulta="tabla_tercero_primaria"; break;
            case"4to Primaria": tablaConsulta="tabla_cuarto_primaria"; break;
            case"5to Primaria": tablaConsulta="tabla_quinto_primaria"; break;
            case"6to Primaria": tablaConsulta="tabla_sexto_primaria"; break;
         }
        
        String dni=txt_dniEstudiante.getText().trim();
        if(dni.equals(""))
        {
            JOptionPane.showMessageDialog(null,"ingrese dni del estudiante");
            txt_dniEstudiante.requestFocus();
        }else
        {
         try 
            {
            Connection cn=Conexion.Conectar();
            PreparedStatement pst=cn.prepareStatement("Select *from "+tablaConsulta+" where Dni_est='"+dni+"'and FechaRegistro  like"+'"'+año+'"');
            ResultSet resul=pst.executeQuery();
            if(resul.next())
            {
              LabelNombre.setText(resul.getString("Nombre_est"));
              labelApellidos.setText(resul.getString("Apellidos_est"));
              labelGrado.setText(Tabla);
            TXT_1B_Personal_Social.setText(resul.getString("1B_Personal_Social"));  
            TXT_1B_Educación_Física.setText(resul.getString("1B_Educación_Física"));  
            TXT_1B_Arte_y_cultura.setText(resul.getString("1B_Arte_y_cultura"));  
            TXT_1B_Comunicación.setText(resul.getString("1B_Comunicación"));  
            TXT_1B_Matemática.setText(resul.getString("1B_Matemática"));  
            TXT_1B_Ciencia_y_Tecnología.setText(resul.getString("1B_Ciencia_y_Tecnología"));  
            TXT_1B_Educacíon_Religiosa.setText(resul.getString("1B_Educacíon_Religiosa"));  
            
            TXT_2B_Personal_Social1.setText(resul.getString("2B_Personal_Social"));   
            TXT_2B_Educación_Física1.setText(resul.getString("2B_Educación_Física"));  
            TXT_2B_Arte_y_cultura1.setText(resul.getString("2B_Arte_y_cultura"));  
            TXT_2B_Comunicación1.setText(resul.getString("2B_Comunicación"));  
            TXT_2B_Matemática1.setText(resul.getString("2B_Matemática"));  
            TXT_2B_Ciencia_y_Tecnología1.setText(resul.getString("2B_Ciencia_y_Tecnología"));  
            TXT_2B_Educacíon_Religiosa1.setText(resul.getString("2B_Educacíon_Religiosa"));  
            
            TXT_3B_Personal_Social2.setText(resul.getString("3B_Personal_Social"));    
            TXT_3B_Educación_Física2.setText(resul.getString("3B_Educación_Física"));  
            TXT_3B_Arte_y_cultura2.setText(resul.getString("3B_Arte_y_cultura"));  
            TXT_3B_Comunicación2.setText(resul.getString("3B_Comunicación"));  
            TXT_3B_Matemática2.setText(resul.getString("3B_Matemática"));  
            TXT_3B_Ciencia_y_Tecnología2.setText(resul.getString("3B_Ciencia_y_Tecnología"));  
            TXT_3B_Educacíon_Religiosa2.setText(resul.getString("3B_Educacíon_Religiosa"));      
            
            TXT_4B_Personal_Social3.setText(resul.getString("4B_Personal_Social"));   
            TXT_4B_Educación_Física3.setText(resul.getString("4B_Educación_Física"));  
            TXT_4B_Arte_y_cultura3.setText(resul.getString("4B_Arte_y_cultura"));  
            TXT_4B_Comunicación3.setText(resul.getString("4B_Comunicación"));  
            TXT_4B_Matemática3.setText(resul.getString("4B_Matemática"));  
            TXT_4B_Ciencia_y_Tecnología3.setText(resul.getString("4B_Ciencia_y_Tecnología"));  
            TXT_4B_Educacíon_Religiosa3.setText(resul.getString("4B_Educacíon_Religiosa"));  
            
            }
            else
            {
             JOptionPane.showMessageDialog(null,"no se encontro información registrada con los parametros ingresados");
             }
            
            cn.close();
            
         } catch (Exception e) {JOptionPane.showMessageDialog(null,"Error al recueprar datos del estudiante",null, JOptionPane.WARNING_MESSAGE);
                                    System.err.println("erro, al recuperar notas del estudiante : "+e);}
        }
        
        
    }//GEN-LAST:event_Boton_buscarActionPerformed

    private void Boton_guardarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_guardarNotasActionPerformed
            // TODO add your handling code here:
        String Tabla=cmb_grado.getSelectedItem().toString();
        String año="%"+cmb_año.getSelectedItem().toString()+"%";
        String tablaConsulta = null;
        switch(Tabla)
        {          
            case"1er Primaria": tablaConsulta="tabla_primero_primaria"; break;
            case"2do Primaria": tablaConsulta="tabla_segundo_primaria"; break;
            case"3er Primaria": tablaConsulta="tabla_tercero_primaria"; break;
            case"4to Primaria": tablaConsulta="tabla_cuarto_primaria"; break;
            case"5to Primaria": tablaConsulta="tabla_quinto_primaria"; break;
            case"6to Primaria": tablaConsulta="tabla_sexto_primaria"; break;
        }
        
        String dni=txt_dniEstudiante.getText().trim();
        if(dni.equals(""))
        {
            JOptionPane.showMessageDialog(null,"ingrese dni del estudiante");
            txt_dniEstudiante.requestFocus();
        }else
        {
         try 
            {
            Connection cn=Conexion.Conectar();
            PreparedStatement pst=cn.prepareStatement("update "+tablaConsulta+" set 1B_Personal_Social=?, 1B_Educación_Física=?, 1B_Arte_y_cultura=?,1B_Comunicación=?,1B_Matemática=?,1B_Ciencia_y_Tecnología=?,1B_Educacíon_Religiosa=?,"
                    + "2B_Personal_Social=?, 2B_Educación_Física=?, 2B_Arte_y_cultura=?, 2B_Comunicación=?,2B_Matemática=?,2B_Ciencia_y_Tecnología=?,2B_Educacíon_Religiosa=?,"
                    + "3B_Personal_Social=?, 3B_Educación_Física=?, 3B_Arte_y_cultura=?, 3B_Comunicación=?,3B_Matemática=?,3B_Ciencia_y_Tecnología=?,3B_Educacíon_Religiosa=?,"
                    + "4B_Personal_Social=?, 4B_Educación_Física=?, 4B_Arte_y_cultura=?, 4B_Comunicación=?,4B_Matemática=?,4B_Ciencia_y_Tecnología=?,4B_Educacíon_Religiosa=? where Dni_est='"+dni+"'and FechaRegistro  like"+'"'+año+'"');
            pst.setString(1,(TXT_1B_Personal_Social.getText().trim()));  
            pst.setString(2,(TXT_1B_Educación_Física.getText().trim()));
            pst.setString(3,(TXT_1B_Arte_y_cultura.getText().trim()) );
            pst.setString(4,(TXT_1B_Comunicación.getText().trim() ));
            pst.setString(5,(TXT_1B_Matemática.getText().trim() ));
            pst.setString(6,(TXT_1B_Ciencia_y_Tecnología.getText().trim()));
            pst.setString(7,(TXT_1B_Educacíon_Religiosa.getText().trim()));
            
            pst.setString(8,(TXT_2B_Personal_Social1.getText().trim()));  
            pst.setString(9,(TXT_2B_Educación_Física1.getText().trim()));
            pst.setString(10,(TXT_2B_Arte_y_cultura1.getText().trim()) );
            pst.setString(11,(TXT_2B_Comunicación1.getText().trim() ));
            pst.setString(12,(TXT_2B_Matemática1.getText().trim() ));
            pst.setString(13,(TXT_2B_Ciencia_y_Tecnología1.getText().trim()));
            pst.setString(14,(TXT_2B_Educacíon_Religiosa1.getText().trim()));
            
            pst.setString(15,(TXT_3B_Personal_Social2.getText().trim()));  
            pst.setString(16,(TXT_3B_Educación_Física2.getText().trim()));
            pst.setString(17,(TXT_3B_Arte_y_cultura2.getText().trim()) );
            pst.setString(18,(TXT_3B_Comunicación2.getText().trim() ));
            pst.setString(19,(TXT_3B_Matemática2.getText().trim() ));
            pst.setString(20,(TXT_3B_Ciencia_y_Tecnología2.getText().trim()));
            pst.setString(21,(TXT_3B_Educacíon_Religiosa2.getText().trim()));    
            
            pst.setString(22,(TXT_4B_Personal_Social3.getText().trim()));  
            pst.setString(23,(TXT_4B_Educación_Física3.getText().trim()));
            pst.setString(24,(TXT_4B_Arte_y_cultura3.getText().trim()) );
            pst.setString(25,(TXT_4B_Comunicación3.getText().trim() ));
            pst.setString(26,(TXT_4B_Matemática3.getText().trim() ));
            pst.setString(27,(TXT_4B_Ciencia_y_Tecnología3.getText().trim()));
            pst.setString(28,(TXT_4B_Educacíon_Religiosa3.getText().trim()));
            pst.executeUpdate();
            cn.close();
            JOptionPane.showMessageDialog(null,"Actualización exitosa");
            
         } catch (Exception e) {JOptionPane.showMessageDialog(null,"Error al Guardar notas del estudiante",null, JOptionPane.WARNING_MESSAGE);
                                    System.err.println("erro, al guardar notas del estudiante : "+e);}
        }
             
    }//GEN-LAST:event_Boton_guardarNotasActionPerformed

    private void TXT_1B_Personal_SocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Personal_SocialKeyTyped
       // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(TXT_1B_Personal_Social.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }

        
    }//GEN-LAST:event_TXT_1B_Personal_SocialKeyTyped

    private void TXT_1B_Personal_SocialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Personal_SocialKeyReleased
        // ingrese valores de 0 a 20
        int texto=Integer.parseInt(TXT_1B_Personal_Social.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
           TXT_1B_Personal_Social.setText("");
       }

    }//GEN-LAST:event_TXT_1B_Personal_SocialKeyReleased

    private void TXT_1B_Educación_FísicaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Educación_FísicaKeyTyped
               // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(TXT_1B_Educación_Física.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_1B_Educación_FísicaKeyTyped

    private void TXT_2B_Personal_Social1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_2B_Personal_Social1KeyTyped
        // TODO add your handling code here:
               // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(TXT_2B_Personal_Social1.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_2B_Personal_Social1KeyTyped

    private void TXT_3B_Personal_Social2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_3B_Personal_Social2KeyTyped
             char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(TXT_3B_Personal_Social2.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_3B_Personal_Social2KeyTyped

    private void TXT_4B_Personal_Social3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_4B_Personal_Social3KeyTyped
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(TXT_4B_Personal_Social3.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_4B_Personal_Social3KeyTyped

    private void TXT_2B_Educación_Física1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_2B_Educación_Física1KeyTyped
                     // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(TXT_2B_Educación_Física1.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_2B_Educación_Física1KeyTyped

    private void TXT_3B_Educación_Física2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_3B_Educación_Física2KeyTyped
       // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(TXT_3B_Educación_Física2.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_3B_Educación_Física2KeyTyped

    private void TXT_4B_Educación_Física3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_4B_Educación_Física3KeyTyped
                    // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(TXT_4B_Educación_Física3.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_4B_Educación_Física3KeyTyped

    private void TXT_1B_Arte_y_culturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Arte_y_culturaKeyTyped
                      // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(TXT_1B_Arte_y_cultura.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_1B_Arte_y_culturaKeyTyped

    private void TXT_2B_Arte_y_cultura1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_2B_Arte_y_cultura1KeyTyped
                            // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(TXT_2B_Arte_y_cultura1.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_2B_Arte_y_cultura1KeyTyped

    private void TXT_3B_Arte_y_cultura2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_3B_Arte_y_cultura2KeyTyped
                             // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(TXT_3B_Arte_y_cultura2.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_3B_Arte_y_cultura2KeyTyped

    private void TXT_4B_Arte_y_cultura3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_4B_Arte_y_cultura3KeyTyped
                             // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(TXT_4B_Arte_y_cultura3.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_4B_Arte_y_cultura3KeyTyped

    private void TXT_1B_ComunicaciónKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_ComunicaciónKeyTyped
                            // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(TXT_1B_Comunicación.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_1B_ComunicaciónKeyTyped

    private void TXT_2B_Comunicación1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_2B_Comunicación1KeyTyped
                                   // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(TXT_2B_Comunicación1.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_2B_Comunicación1KeyTyped

    private void TXT_3B_Comunicación2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_3B_Comunicación2KeyTyped
                                   // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(TXT_3B_Comunicación2.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_3B_Comunicación2KeyTyped

    private void TXT_4B_Comunicación3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_4B_Comunicación3KeyTyped
                                    // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(TXT_4B_Comunicación3.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_4B_Comunicación3KeyTyped

    private void TXT_1B_MatemáticaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_MatemáticaKeyTyped
                                 // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(TXT_1B_Matemática.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_1B_MatemáticaKeyTyped

    private void TXT_2B_Matemática1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_2B_Matemática1KeyTyped
                                        // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(TXT_2B_Matemática1.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_2B_Matemática1KeyTyped

    private void TXT_3B_Matemática2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_3B_Matemática2KeyTyped
                                        // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(TXT_3B_Matemática2.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_3B_Matemática2KeyTyped

    private void TXT_4B_Matemática3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_4B_Matemática3KeyTyped
        // TODO add your handling code here:
                                         // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(TXT_4B_Matemática3.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_4B_Matemática3KeyTyped

    private void TXT_1B_Ciencia_y_TecnologíaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Ciencia_y_TecnologíaKeyTyped
                                        // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if( TXT_1B_Ciencia_y_Tecnología.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_1B_Ciencia_y_TecnologíaKeyTyped

    private void TXT_2B_Ciencia_y_Tecnología1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_2B_Ciencia_y_Tecnología1KeyTyped
                                               // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if( TXT_2B_Ciencia_y_Tecnología1.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_2B_Ciencia_y_Tecnología1KeyTyped

    private void TXT_3B_Ciencia_y_Tecnología2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_3B_Ciencia_y_Tecnología2KeyTyped
                                             // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if( TXT_3B_Ciencia_y_Tecnología2.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_3B_Ciencia_y_Tecnología2KeyTyped

    private void TXT_4B_Ciencia_y_Tecnología3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_4B_Ciencia_y_Tecnología3KeyTyped
                                                // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if( TXT_4B_Ciencia_y_Tecnología3.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_4B_Ciencia_y_Tecnología3KeyTyped

    private void TXT_1B_Educacíon_ReligiosaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Educacíon_ReligiosaKeyTyped
                                               // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if( TXT_1B_Educacíon_Religiosa.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_1B_Educacíon_ReligiosaKeyTyped

    private void TXT_2B_Educacíon_Religiosa1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_2B_Educacíon_Religiosa1KeyTyped
                                                      // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if( TXT_2B_Educacíon_Religiosa1.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_2B_Educacíon_Religiosa1KeyTyped

    private void TXT_3B_Educacíon_Religiosa2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_3B_Educacíon_Religiosa2KeyTyped
                                                       // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if( TXT_3B_Educacíon_Religiosa2.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_3B_Educacíon_Religiosa2KeyTyped

    private void TXT_4B_Educacíon_Religiosa3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_4B_Educacíon_Religiosa3KeyTyped
                                                      // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if( TXT_4B_Educacíon_Religiosa3.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_4B_Educacíon_Religiosa3KeyTyped

    private void TXT_2B_Personal_Social1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_2B_Personal_Social1KeyReleased
         // ingrese valores de 0 a 20
        int texto=Integer.parseInt(TXT_2B_Personal_Social1.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
           TXT_2B_Personal_Social1.setText("");
       }
    }//GEN-LAST:event_TXT_2B_Personal_Social1KeyReleased

    private void TXT_3B_Personal_Social2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_3B_Personal_Social2KeyReleased
                 // ingrese valores de 0 a 20
        int texto=Integer.parseInt(TXT_3B_Personal_Social2.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
           TXT_3B_Personal_Social2.setText("");
       }
    }//GEN-LAST:event_TXT_3B_Personal_Social2KeyReleased

    private void TXT_4B_Personal_Social3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_4B_Personal_Social3KeyReleased
                         // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_4B_Personal_Social3.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_4B_Personal_Social3.setText("");
       }
    }//GEN-LAST:event_TXT_4B_Personal_Social3KeyReleased

    private void TXT_1B_Educación_FísicaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Educación_FísicaKeyReleased
                              // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_1B_Educación_Física.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_1B_Educación_Física.setText("");
       }
    }//GEN-LAST:event_TXT_1B_Educación_FísicaKeyReleased

    private void TXT_2B_Educación_Física1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_2B_Educación_Física1KeyReleased
                                    // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_2B_Educación_Física1.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_2B_Educación_Física1.setText("");
       }
    }//GEN-LAST:event_TXT_2B_Educación_Física1KeyReleased

    private void TXT_3B_Educación_Física2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_3B_Educación_Física2KeyReleased
                                            // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_3B_Educación_Física2.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_3B_Educación_Física2.setText("");
       }
    }//GEN-LAST:event_TXT_3B_Educación_Física2KeyReleased

    private void TXT_4B_Educación_Física3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_4B_Educación_Física3KeyReleased
                                             // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_4B_Educación_Física3.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_4B_Educación_Física3.setText("");
       }
    }//GEN-LAST:event_TXT_4B_Educación_Física3KeyReleased

    private void TXT_1B_Arte_y_culturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Arte_y_culturaKeyReleased
                                                  
                                             // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_1B_Arte_y_cultura.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_1B_Arte_y_cultura.setText("");
       }
    }//GEN-LAST:event_TXT_1B_Arte_y_culturaKeyReleased

    private void TXT_2B_Arte_y_cultura1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_2B_Arte_y_cultura1KeyReleased
   // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_2B_Arte_y_cultura1.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_2B_Arte_y_cultura1.setText("");
       }
    }//GEN-LAST:event_TXT_2B_Arte_y_cultura1KeyReleased

    private void TXT_3B_Arte_y_cultura2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_3B_Arte_y_cultura2KeyReleased
          // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_3B_Arte_y_cultura2.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_3B_Arte_y_cultura2.setText("");
       }
    }//GEN-LAST:event_TXT_3B_Arte_y_cultura2KeyReleased

    private void TXT_4B_Arte_y_cultura3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_4B_Arte_y_cultura3KeyReleased
                 // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_4B_Arte_y_cultura3.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_4B_Arte_y_cultura3.setText("");
       }
    }//GEN-LAST:event_TXT_4B_Arte_y_cultura3KeyReleased

    private void TXT_1B_ComunicaciónKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_ComunicaciónKeyReleased
                      // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_1B_Comunicación.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_1B_Comunicación.setText("");
       }
    }//GEN-LAST:event_TXT_1B_ComunicaciónKeyReleased

    private void TXT_2B_Comunicación1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_2B_Comunicación1KeyReleased
                            // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_2B_Comunicación1.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_2B_Comunicación1.setText("");
       }
    }//GEN-LAST:event_TXT_2B_Comunicación1KeyReleased

    private void TXT_3B_Comunicación2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_3B_Comunicación2KeyReleased
                            // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_3B_Comunicación2.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_3B_Comunicación2.setText("");
       }
    }//GEN-LAST:event_TXT_3B_Comunicación2KeyReleased

    private void TXT_4B_Comunicación3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_4B_Comunicación3KeyReleased
                                // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_4B_Comunicación3.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_4B_Comunicación3.setText("");
       }
    }//GEN-LAST:event_TXT_4B_Comunicación3KeyReleased

    private void TXT_1B_MatemáticaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_MatemáticaKeyReleased
                                    // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_1B_Matemática.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_1B_Matemática.setText("");
       }
    }//GEN-LAST:event_TXT_1B_MatemáticaKeyReleased

    private void TXT_2B_Matemática1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_2B_Matemática1KeyReleased
                                            // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_2B_Matemática1.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_2B_Matemática1.setText("");
       }
    }//GEN-LAST:event_TXT_2B_Matemática1KeyReleased

    private void TXT_3B_Matemática2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_3B_Matemática2KeyReleased
                                                   // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_3B_Matemática2.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_3B_Matemática2.setText("");
       }
    }//GEN-LAST:event_TXT_3B_Matemática2KeyReleased

    private void TXT_4B_Matemática3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_4B_Matemática3KeyReleased
                                                          // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_4B_Matemática3.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_4B_Matemática3.setText("");
       }
    }//GEN-LAST:event_TXT_4B_Matemática3KeyReleased

    private void TXT_1B_Ciencia_y_TecnologíaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Ciencia_y_TecnologíaKeyReleased
  // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_1B_Ciencia_y_Tecnología.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_1B_Ciencia_y_Tecnología.setText("");
       }
    }//GEN-LAST:event_TXT_1B_Ciencia_y_TecnologíaKeyReleased

    private void TXT_2B_Ciencia_y_Tecnología1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_2B_Ciencia_y_Tecnología1KeyReleased
  // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_2B_Ciencia_y_Tecnología1.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_2B_Ciencia_y_Tecnología1.setText("");
       }
    }//GEN-LAST:event_TXT_2B_Ciencia_y_Tecnología1KeyReleased

    private void TXT_3B_Ciencia_y_Tecnología2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_3B_Ciencia_y_Tecnología2KeyReleased
         // ingrese valores de 0 a 20
        int texto=Integer.parseInt(  TXT_3B_Ciencia_y_Tecnología2.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
             TXT_3B_Ciencia_y_Tecnología2.setText("");
       }
    }//GEN-LAST:event_TXT_3B_Ciencia_y_Tecnología2KeyReleased

    private void TXT_4B_Ciencia_y_Tecnología3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_4B_Ciencia_y_Tecnología3KeyReleased
            // ingrese valores de 0 a 20
        int texto=Integer.parseInt(  TXT_4B_Ciencia_y_Tecnología3.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
             TXT_4B_Ciencia_y_Tecnología3.setText("");
       }
    }//GEN-LAST:event_TXT_4B_Ciencia_y_Tecnología3KeyReleased

    private void TXT_1B_Educacíon_ReligiosaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Educacíon_ReligiosaKeyReleased
             // ingrese valores de 0 a 20
        int texto=Integer.parseInt(  TXT_1B_Educacíon_Religiosa.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
             TXT_1B_Educacíon_Religiosa.setText("");
       }
    }//GEN-LAST:event_TXT_1B_Educacíon_ReligiosaKeyReleased

    private void TXT_2B_Educacíon_Religiosa1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_2B_Educacíon_Religiosa1KeyReleased
                   // ingrese valores de 0 a 20
        int texto=Integer.parseInt(  TXT_2B_Educacíon_Religiosa1.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
             TXT_2B_Educacíon_Religiosa1.setText("");
       }
    }//GEN-LAST:event_TXT_2B_Educacíon_Religiosa1KeyReleased

    private void TXT_3B_Educacíon_Religiosa2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_3B_Educacíon_Religiosa2KeyReleased
                     // ingrese valores de 0 a 20
        int texto=Integer.parseInt(  TXT_3B_Educacíon_Religiosa2.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
             TXT_3B_Educacíon_Religiosa2.setText("");
       }
    }//GEN-LAST:event_TXT_3B_Educacíon_Religiosa2KeyReleased

    private void TXT_4B_Educacíon_Religiosa3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_4B_Educacíon_Religiosa3KeyReleased
                     // ingrese valores de 0 a 20
        int texto=Integer.parseInt(  TXT_4B_Educacíon_Religiosa3.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
             TXT_4B_Educacíon_Religiosa3.setText("");
       }
    }//GEN-LAST:event_TXT_4B_Educacíon_Religiosa3KeyReleased

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
           Ventana_Principal_Nota principal= new Ventana_Principal_Nota();
            principal.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_formWindowClosed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Notas_Primaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_buscar;
    private javax.swing.JButton Boton_guardarNotas;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JTextField TXT_1B_Arte_y_cultura;
    private javax.swing.JTextField TXT_1B_Ciencia_y_Tecnología;
    private javax.swing.JTextField TXT_1B_Comunicación;
    private javax.swing.JTextField TXT_1B_Educación_Física;
    private javax.swing.JTextField TXT_1B_Educacíon_Religiosa;
    private javax.swing.JTextField TXT_1B_Matemática;
    private javax.swing.JTextField TXT_1B_Personal_Social;
    private javax.swing.JTextField TXT_2B_Arte_y_cultura1;
    private javax.swing.JTextField TXT_2B_Ciencia_y_Tecnología1;
    private javax.swing.JTextField TXT_2B_Comunicación1;
    private javax.swing.JTextField TXT_2B_Educación_Física1;
    private javax.swing.JTextField TXT_2B_Educacíon_Religiosa1;
    private javax.swing.JTextField TXT_2B_Matemática1;
    private javax.swing.JTextField TXT_2B_Personal_Social1;
    private javax.swing.JTextField TXT_3B_Arte_y_cultura2;
    private javax.swing.JTextField TXT_3B_Ciencia_y_Tecnología2;
    private javax.swing.JTextField TXT_3B_Comunicación2;
    private javax.swing.JTextField TXT_3B_Educación_Física2;
    private javax.swing.JTextField TXT_3B_Educacíon_Religiosa2;
    private javax.swing.JTextField TXT_3B_Matemática2;
    private javax.swing.JTextField TXT_3B_Personal_Social2;
    private javax.swing.JTextField TXT_4B_Arte_y_cultura3;
    private javax.swing.JTextField TXT_4B_Ciencia_y_Tecnología3;
    private javax.swing.JTextField TXT_4B_Comunicación3;
    private javax.swing.JTextField TXT_4B_Educación_Física3;
    private javax.swing.JTextField TXT_4B_Educacíon_Religiosa3;
    private javax.swing.JTextField TXT_4B_Matemática3;
    private javax.swing.JTextField TXT_4B_Personal_Social3;
    private javax.swing.JComboBox<String> cmb_año;
    private javax.swing.JComboBox<String> cmb_grado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelApellidos;
    private javax.swing.JLabel labelGrado;
    private javax.swing.JTextField txt_dniEstudiante;
    // End of variables declaration//GEN-END:variables

public void limpiarCampos()
{
     TXT_1B_Personal_Social.setText("");
            TXT_1B_Educación_Física.setText("");
            TXT_1B_Arte_y_cultura.setText("");
            TXT_1B_Comunicación.setText("");
            TXT_1B_Matemática.setText("");
            TXT_1B_Ciencia_y_Tecnología.setText(""); 
            TXT_1B_Educacíon_Religiosa.setText("");
            
            TXT_2B_Personal_Social1.setText(""); 
            TXT_2B_Educación_Física1.setText("");
            TXT_2B_Arte_y_cultura1.setText("");
            TXT_2B_Comunicación1.setText("");
            TXT_2B_Matemática1.setText("");
            TXT_2B_Ciencia_y_Tecnología1.setText(""); 
            TXT_2B_Educacíon_Religiosa1.setText("");
            
            TXT_3B_Personal_Social2.setText("");   
            TXT_3B_Educación_Física2.setText(""); 
            TXT_3B_Arte_y_cultura2.setText(""); 
            TXT_3B_Comunicación2.setText(""); 
            TXT_3B_Matemática2.setText("");  
            TXT_3B_Ciencia_y_Tecnología2.setText("");  
            TXT_3B_Educacíon_Religiosa2.setText("");      
            
            TXT_4B_Personal_Social3.setText("");   
            TXT_4B_Educación_Física3.setText("");  
            TXT_4B_Arte_y_cultura3.setText(""); 
            TXT_4B_Comunicación3.setText("");  
            TXT_4B_Matemática3.setText("");  
            TXT_4B_Ciencia_y_Tecnología3.setText("");  
            TXT_4B_Educacíon_Religiosa3.setText("");  
}
}
