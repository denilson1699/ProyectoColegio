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

public class Ventana_Notas_Secundaria_estudiante extends javax.swing.JFrame {
 private TextAutoCompleter ac_DniEstudiante;
  
    public Ventana_Notas_Secundaria_estudiante() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        //this.setExtendedState(MAXIMIZED_BOTH);
 
         
         
        Calendar cal=Calendar.getInstance();
        String año=Integer.toString(cal.get(Calendar.YEAR));
        int añoInt=Integer.parseInt(año);
        
        for(int i=añoInt ;i>=2018;i--)
        {
            cmb_año.addItem(Integer.toString(i));
        }
        
        cmb_grado.setEnabled(false);
        Boton_buscar.setEnabled(false);
           String dniest=Login.usuario;
            txt_dniEstudiante.setText(dniest);
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TXT_1B_Matematica = new javax.swing.JTextField();
        TXT_1B_Comunicacion = new javax.swing.JTextField();
        TXT_1B_ingles = new javax.swing.JTextField();
        TXT_1B_Arte = new javax.swing.JTextField();
        TXT_1B_HGE = new javax.swing.JTextField();
        TXT_1B_FCC = new javax.swing.JTextField();
        TXT_1B_PFRH = new javax.swing.JTextField();
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
        TXT_1B_Educacíon_Fisica = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        TXT_1B_Educacíon_Religiosa = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        TXT_1B_CTA = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        TXT_1B_EPT = new javax.swing.JTextField();
        TXT_1B_Matematica1 = new javax.swing.JTextField();
        TXT_1B_Comunicacion1 = new javax.swing.JTextField();
        TXT_1B_ingles1 = new javax.swing.JTextField();
        TXT_1B_Arte1 = new javax.swing.JTextField();
        TXT_1B_HGE1 = new javax.swing.JTextField();
        TXT_1B_FCC1 = new javax.swing.JTextField();
        TXT_1B_PFRH1 = new javax.swing.JTextField();
        TXT_1B_Educacíon_Fisica1 = new javax.swing.JTextField();
        TXT_1B_Educacíon_Religiosa1 = new javax.swing.JTextField();
        TXT_1B_CTA1 = new javax.swing.JTextField();
        TXT_1B_EPT1 = new javax.swing.JTextField();
        TXT_1B_PFRH2 = new javax.swing.JTextField();
        TXT_1B_Educacíon_Religiosa2 = new javax.swing.JTextField();
        TXT_1B_ingles2 = new javax.swing.JTextField();
        TXT_1B_FCC2 = new javax.swing.JTextField();
        TXT_1B_CTA2 = new javax.swing.JTextField();
        TXT_1B_Educacíon_Fisica2 = new javax.swing.JTextField();
        TXT_1B_EPT2 = new javax.swing.JTextField();
        TXT_1B_Matematica2 = new javax.swing.JTextField();
        TXT_1B_Comunicacion2 = new javax.swing.JTextField();
        TXT_1B_Arte2 = new javax.swing.JTextField();
        TXT_1B_HGE2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Matemática");

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Comunicación");

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Inglés");

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Arte");

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Historia, Geografía y Economía");

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Formación Ciudadana y Cívica");

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Persona, Familia y Relaciones Humanas");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("1er ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("2do ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("3er ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("Bimestre");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setText("Bimestre");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel14.setText("Bimestre");

        TXT_1B_Matematica.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_Matematica.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_Matematica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_Matematica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_MatematicaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_MatematicaKeyTyped(evt);
            }
        });

        TXT_1B_Comunicacion.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_Comunicacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_Comunicacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_Comunicacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_ComunicacionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_ComunicacionKeyTyped(evt);
            }
        });

        TXT_1B_ingles.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_ingles.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_ingles.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_ingles.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_inglesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_inglesKeyTyped(evt);
            }
        });

        TXT_1B_Arte.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_Arte.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_Arte.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_Arte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_ArteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_ArteKeyTyped(evt);
            }
        });

        TXT_1B_HGE.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_HGE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_HGE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_HGE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_HGEKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_HGEKeyTyped(evt);
            }
        });

        TXT_1B_FCC.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_FCC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_FCC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_FCC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_FCCKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_FCCKeyTyped(evt);
            }
        });

        TXT_1B_PFRH.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_PFRH.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_PFRH.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_PFRH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_PFRHKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_PFRHKeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Registrar Notas Nivel Secundario ");

        txt_dniEstudiante.setEditable(false);
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
        cmb_grado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-GRADO-", "1er Secundaria", "2do Secundaria", "3er Secundaria", "4to Secundaria", "5to Secundaria" }));
        cmb_grado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmb_grado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_gradoActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel19.setText("DNI:");

        TXT_1B_Educacíon_Fisica.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_Educacíon_Fisica.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_Educacíon_Fisica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_Educacíon_Fisica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_Educacíon_FisicaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_Educacíon_FisicaKeyTyped(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Educación Física");

        jLabel22.setBackground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Educación Religiosa");

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

        jLabel23.setBackground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Ciencia, Tecnología y Ambiente");

        TXT_1B_CTA.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_CTA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_CTA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_CTA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_CTAKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_CTAKeyTyped(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Educación para el Trabajo");

        TXT_1B_EPT.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_EPT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_EPT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_EPT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_EPTKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_EPTKeyTyped(evt);
            }
        });

        TXT_1B_Matematica1.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_Matematica1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_Matematica1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_Matematica1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_Matematica1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_Matematica1KeyTyped(evt);
            }
        });

        TXT_1B_Comunicacion1.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_Comunicacion1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_Comunicacion1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_Comunicacion1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_Comunicacion1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_Comunicacion1KeyTyped(evt);
            }
        });

        TXT_1B_ingles1.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_ingles1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_ingles1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_ingles1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_ingles1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_ingles1KeyTyped(evt);
            }
        });

        TXT_1B_Arte1.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_Arte1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_Arte1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_Arte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_1B_Arte1ActionPerformed(evt);
            }
        });
        TXT_1B_Arte1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_Arte1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_Arte1KeyTyped(evt);
            }
        });

        TXT_1B_HGE1.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_HGE1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_HGE1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_HGE1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_HGE1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_HGE1KeyTyped(evt);
            }
        });

        TXT_1B_FCC1.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_FCC1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_FCC1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_FCC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_FCC1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_FCC1KeyTyped(evt);
            }
        });

        TXT_1B_PFRH1.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_PFRH1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_PFRH1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_PFRH1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_PFRH1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_PFRH1KeyTyped(evt);
            }
        });

        TXT_1B_Educacíon_Fisica1.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_Educacíon_Fisica1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_Educacíon_Fisica1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_Educacíon_Fisica1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_Educacíon_Fisica1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_Educacíon_Fisica1KeyTyped(evt);
            }
        });

        TXT_1B_Educacíon_Religiosa1.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_Educacíon_Religiosa1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_Educacíon_Religiosa1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_Educacíon_Religiosa1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_Educacíon_Religiosa1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_Educacíon_Religiosa1KeyTyped(evt);
            }
        });

        TXT_1B_CTA1.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_CTA1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_CTA1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_CTA1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_CTA1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_CTA1KeyTyped(evt);
            }
        });

        TXT_1B_EPT1.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_EPT1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_EPT1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_EPT1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_EPT1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_EPT1KeyTyped(evt);
            }
        });

        TXT_1B_PFRH2.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_PFRH2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_PFRH2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_PFRH2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_PFRH2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_PFRH2KeyTyped(evt);
            }
        });

        TXT_1B_Educacíon_Religiosa2.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_Educacíon_Religiosa2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_Educacíon_Religiosa2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_Educacíon_Religiosa2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_Educacíon_Religiosa2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_Educacíon_Religiosa2KeyTyped(evt);
            }
        });

        TXT_1B_ingles2.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_ingles2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_ingles2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_ingles2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_ingles2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_ingles2KeyTyped(evt);
            }
        });

        TXT_1B_FCC2.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_FCC2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_FCC2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_FCC2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_FCC2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_FCC2KeyTyped(evt);
            }
        });

        TXT_1B_CTA2.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_CTA2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_CTA2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_CTA2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_CTA2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_CTA2KeyTyped(evt);
            }
        });

        TXT_1B_Educacíon_Fisica2.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_Educacíon_Fisica2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_Educacíon_Fisica2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_Educacíon_Fisica2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_Educacíon_Fisica2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_Educacíon_Fisica2KeyTyped(evt);
            }
        });

        TXT_1B_EPT2.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_EPT2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_EPT2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_EPT2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_EPT2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_EPT2KeyTyped(evt);
            }
        });

        TXT_1B_Matematica2.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_Matematica2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_Matematica2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_Matematica2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_Matematica2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_Matematica2KeyTyped(evt);
            }
        });

        TXT_1B_Comunicacion2.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_Comunicacion2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_Comunicacion2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_Comunicacion2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_Comunicacion2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_Comunicacion2KeyTyped(evt);
            }
        });

        TXT_1B_Arte2.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_Arte2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_Arte2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_Arte2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_Arte2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_Arte2KeyTyped(evt);
            }
        });

        TXT_1B_HGE2.setForeground(new java.awt.Color(0, 102, 102));
        TXT_1B_HGE2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_1B_HGE2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, null, null));
        TXT_1B_HGE2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXT_1B_HGE2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_1B_HGE2KeyTyped(evt);
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
                        .addGap(18, 18, 18)
                        .addComponent(cmb_grado, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_dniEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Boton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(93, 93, 93)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TXT_1B_Matematica, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                            .addComponent(TXT_1B_Comunicacion)
                                            .addComponent(TXT_1B_ingles)
                                            .addComponent(TXT_1B_Arte)
                                            .addComponent(TXT_1B_HGE)
                                            .addComponent(TXT_1B_FCC)
                                            .addComponent(TXT_1B_PFRH)
                                            .addComponent(TXT_1B_Educacíon_Fisica)
                                            .addComponent(TXT_1B_Educacíon_Religiosa)
                                            .addComponent(TXT_1B_CTA)
                                            .addComponent(TXT_1B_EPT))
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TXT_1B_Matematica1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                            .addComponent(TXT_1B_Comunicacion1)
                                            .addComponent(TXT_1B_ingles1)
                                            .addComponent(TXT_1B_Arte1)
                                            .addComponent(TXT_1B_HGE1)
                                            .addComponent(TXT_1B_FCC1)
                                            .addComponent(TXT_1B_PFRH1)
                                            .addComponent(TXT_1B_Educacíon_Fisica1)
                                            .addComponent(TXT_1B_Educacíon_Religiosa1)
                                            .addComponent(TXT_1B_CTA1)
                                            .addComponent(TXT_1B_EPT1))
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TXT_1B_Matematica2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                            .addComponent(TXT_1B_Comunicacion2)
                                            .addComponent(TXT_1B_ingles2)
                                            .addComponent(TXT_1B_Arte2)
                                            .addComponent(TXT_1B_HGE2)
                                            .addComponent(TXT_1B_FCC2)
                                            .addComponent(TXT_1B_PFRH2)
                                            .addComponent(TXT_1B_Educacíon_Fisica2)
                                            .addComponent(TXT_1B_Educacíon_Religiosa2)
                                            .addComponent(TXT_1B_CTA2)
                                            .addComponent(TXT_1B_EPT2)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(27, 27, 27)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel8))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXT_1B_Comunicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_1B_Comunicacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_1B_Comunicacion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXT_1B_ingles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_1B_ingles1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_1B_ingles2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXT_1B_Arte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_1B_Arte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_1B_Arte2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(TXT_1B_Matematica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_1B_Matematica1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_1B_Matematica2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(62, 62, 62)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXT_1B_HGE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_1B_HGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXT_1B_FCC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_1B_FCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXT_1B_PFRH1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_1B_PFRH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(TXT_1B_HGE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TXT_1B_FCC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TXT_1B_PFRH2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_1B_Educacíon_Fisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(TXT_1B_Educacíon_Fisica1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_1B_Educacíon_Fisica2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_1B_Educacíon_Religiosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(TXT_1B_Educacíon_Religiosa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_1B_Educacíon_Religiosa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_1B_CTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(TXT_1B_CTA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_1B_CTA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_1B_EPT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(TXT_1B_EPT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_1B_EPT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
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
                .addContainerGap()
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
            case"1er Secundaria": tablaConsulta="tabla_primero_secundaria"; break;
            case"2do Secundaria": tablaConsulta="tabla_segundo_secundaria"; break;
            case"3er Secundaria": tablaConsulta="tabla_tercero_secundaria"; break;
            case"4to Secundaria": tablaConsulta="tabla_cuarto_secundaria"; break;
            case"5to Secundaria": tablaConsulta="tabla_quinto_secundaria"; break;
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
            TXT_1B_Matematica.setText(resul.getString("1B_Matematica"));  
            TXT_1B_Comunicacion.setText(resul.getString("1B_Comunicacion"));  
            TXT_1B_ingles.setText(resul.getString("1B_Ingles"));  
            TXT_1B_Arte.setText(resul.getString("1B_Arte"));  
            TXT_1B_HGE.setText(resul.getString("1B_HGE"));  
            TXT_1B_FCC.setText(resul.getString("1B_FCC"));  
            TXT_1B_PFRH.setText(resul.getString("1B_PFRH"));  
            TXT_1B_Educacíon_Fisica.setText(resul.getString("1B_Educacion_Fisica"));
            TXT_1B_Educacíon_Religiosa.setText(resul.getString("1B_Educación_Religiosa"));
            TXT_1B_CTA.setText(resul.getString("1B_CTA"));
            TXT_1B_EPT.setText(resul.getString("1B_EPT"));
            
            TXT_1B_Matematica1.setText(resul.getString("2B_Matematica"));  
            TXT_1B_Comunicacion1.setText(resul.getString("2B_Comunicacion"));  
            TXT_1B_ingles1.setText(resul.getString("2B_Ingles"));  
            TXT_1B_Arte1.setText(resul.getString("2B_Arte"));  
            TXT_1B_HGE1.setText(resul.getString("2B_HGE"));  
            TXT_1B_FCC1.setText(resul.getString("2B_FCC"));  
            TXT_1B_PFRH1.setText(resul.getString("2B_PFRH"));  
            TXT_1B_Educacíon_Fisica1.setText(resul.getString("2B_Educacion_Fisica"));
            TXT_1B_Educacíon_Religiosa1.setText(resul.getString("2B_Educación_Religiosa"));
            TXT_1B_CTA1.setText(resul.getString("2B_CTA"));
            TXT_1B_EPT1.setText(resul.getString("2B_EPT"));
           
            TXT_1B_Matematica2.setText(resul.getString("3B_Matematica"));  
            TXT_1B_Comunicacion2.setText(resul.getString("3B_Comunicacion"));  
            TXT_1B_ingles2.setText(resul.getString("3B_Ingles"));  
            TXT_1B_Arte2.setText(resul.getString("3B_Arte"));  
            TXT_1B_HGE2.setText(resul.getString("3B_HGE"));  
            TXT_1B_FCC2.setText(resul.getString("3B_FCC"));  
            TXT_1B_PFRH2.setText(resul.getString("3B_PFRH"));  
            TXT_1B_Educacíon_Fisica2.setText(resul.getString("3B_Educacion_Fisica"));
            TXT_1B_Educacíon_Religiosa2.setText(resul.getString("3B_Educación_Religiosa"));
            TXT_1B_CTA2.setText(resul.getString("3B_CTA"));
            TXT_1B_EPT2.setText(resul.getString("3B_EPT"));
            
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

    private void TXT_1B_MatematicaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_MatematicaKeyTyped
       // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(TXT_1B_Matematica.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }

        
    }//GEN-LAST:event_TXT_1B_MatematicaKeyTyped

    private void TXT_1B_MatematicaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_MatematicaKeyReleased
        // ingrese valores de 0 a 20
        int texto=Integer.parseInt(TXT_1B_Matematica.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
           TXT_1B_Matematica.setText("");
       }

    }//GEN-LAST:event_TXT_1B_MatematicaKeyReleased

    private void TXT_1B_ComunicacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_ComunicacionKeyTyped
               // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(TXT_1B_Comunicacion.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_1B_ComunicacionKeyTyped

    private void TXT_1B_inglesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_inglesKeyTyped
                      // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(TXT_1B_ingles.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_1B_inglesKeyTyped

    private void TXT_1B_ArteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_ArteKeyTyped
                            // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(TXT_1B_Arte.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_1B_ArteKeyTyped

    private void TXT_1B_HGEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_HGEKeyTyped
                                 // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if(TXT_1B_HGE.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_1B_HGEKeyTyped

    private void TXT_1B_FCCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_FCCKeyTyped
                                        // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if( TXT_1B_FCC.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_1B_FCCKeyTyped

    private void TXT_1B_PFRHKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_PFRHKeyTyped
                                               // ingresar solo numeros
        char c =evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();{          
        }  
       // ingresar maximo 2 caracteres
        if( TXT_1B_PFRH.getText().length()>=2){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_TXT_1B_PFRHKeyTyped

    private void TXT_1B_ComunicacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_ComunicacionKeyReleased
                              // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_1B_Comunicacion.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_1B_Comunicacion.setText("");
       }
    }//GEN-LAST:event_TXT_1B_ComunicacionKeyReleased

    private void TXT_1B_inglesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_inglesKeyReleased
                                                  
                                             // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_1B_ingles.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_1B_ingles.setText("");
       }
    }//GEN-LAST:event_TXT_1B_inglesKeyReleased

    private void TXT_1B_ArteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_ArteKeyReleased
                      // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_1B_Arte.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_1B_Arte.setText("");
       }
    }//GEN-LAST:event_TXT_1B_ArteKeyReleased

    private void TXT_1B_HGEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_HGEKeyReleased
                                    // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_1B_HGE.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_1B_HGE.setText("");
       }
    }//GEN-LAST:event_TXT_1B_HGEKeyReleased

    private void TXT_1B_FCCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_FCCKeyReleased
  // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_1B_FCC.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_1B_FCC.setText("");
       }
    }//GEN-LAST:event_TXT_1B_FCCKeyReleased

    private void TXT_1B_PFRHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_PFRHKeyReleased
             // ingrese valores de 0 a 20
        int texto=Integer.parseInt(  TXT_1B_PFRH.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
             TXT_1B_PFRH.setText("");
       }
    }//GEN-LAST:event_TXT_1B_PFRHKeyReleased

    private void TXT_1B_Educacíon_FisicaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Educacíon_FisicaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_Educacíon_FisicaKeyReleased

    private void TXT_1B_Educacíon_FisicaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Educacíon_FisicaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_Educacíon_FisicaKeyTyped

    private void TXT_1B_Educacíon_ReligiosaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Educacíon_ReligiosaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_Educacíon_ReligiosaKeyReleased

    private void TXT_1B_Educacíon_ReligiosaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Educacíon_ReligiosaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_Educacíon_ReligiosaKeyTyped

    private void TXT_1B_CTAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_CTAKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_CTAKeyReleased

    private void TXT_1B_CTAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_CTAKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_CTAKeyTyped

    private void TXT_1B_EPTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_EPTKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_EPTKeyReleased

    private void TXT_1B_EPTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_EPTKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_EPTKeyTyped

    private void TXT_1B_Matematica1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Matematica1KeyReleased
        int texto=Integer.parseInt(TXT_1B_Matematica1.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
           TXT_1B_Matematica1.setText("");
       }
    }//GEN-LAST:event_TXT_1B_Matematica1KeyReleased

    private void TXT_1B_Matematica1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Matematica1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_Matematica1KeyTyped

    private void TXT_1B_Comunicacion1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Comunicacion1KeyReleased
        int texto=Integer.parseInt(TXT_1B_Comunicacion1.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
           TXT_1B_Comunicacion1.setText("");
       }
    }//GEN-LAST:event_TXT_1B_Comunicacion1KeyReleased

    private void TXT_1B_Comunicacion1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Comunicacion1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_Comunicacion1KeyTyped

    private void TXT_1B_ingles1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_ingles1KeyReleased
        int texto=Integer.parseInt(TXT_1B_ingles1.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
           TXT_1B_ingles1.setText("");
       }        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_ingles1KeyReleased

    private void TXT_1B_ingles1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_ingles1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_ingles1KeyTyped

    private void TXT_1B_Arte1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Arte1KeyReleased
                      // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_1B_Arte1.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_1B_Arte1.setText("");
       }        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_Arte1KeyReleased

    private void TXT_1B_Arte1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Arte1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_Arte1KeyTyped

    private void TXT_1B_HGE1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_HGE1KeyReleased
                              // ingrese valores de 0 a 20
        int texto=Integer.parseInt(  TXT_1B_HGE1.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
             TXT_1B_HGE1.setText("");
       }
    }//GEN-LAST:event_TXT_1B_HGE1KeyReleased

    private void TXT_1B_HGE1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_HGE1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_HGE1KeyTyped

    private void TXT_1B_FCC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_FCC1KeyReleased
                            // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_1B_FCC1.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_1B_FCC1.setText("");
       }
    }//GEN-LAST:event_TXT_1B_FCC1KeyReleased

    private void TXT_1B_FCC1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_FCC1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_FCC1KeyTyped

    private void TXT_1B_PFRH1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_PFRH1KeyReleased
                             // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_1B_PFRH1.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_1B_PFRH1.setText("");
       }
    }//GEN-LAST:event_TXT_1B_PFRH1KeyReleased

    private void TXT_1B_PFRH1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_PFRH1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_PFRH1KeyTyped

    private void TXT_1B_Educacíon_Fisica1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Educacíon_Fisica1KeyReleased
                            // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_1B_Educacíon_Fisica1.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_1B_Educacíon_Fisica1.setText("");
       }
    }//GEN-LAST:event_TXT_1B_Educacíon_Fisica1KeyReleased

    private void TXT_1B_Educacíon_Fisica1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Educacíon_Fisica1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_Educacíon_Fisica1KeyTyped

    private void TXT_1B_Educacíon_Religiosa1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Educacíon_Religiosa1KeyReleased
                       // ingrese valores de 0 a 20
        int texto=Integer.parseInt(  TXT_1B_Educacíon_Religiosa1.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
             TXT_1B_Educacíon_Religiosa1.setText("");
       }
    }//GEN-LAST:event_TXT_1B_Educacíon_Religiosa1KeyReleased

    private void TXT_1B_Educacíon_Religiosa1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Educacíon_Religiosa1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_Educacíon_Religiosa1KeyTyped

    private void TXT_1B_CTA1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_CTA1KeyReleased
                             // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_1B_CTA1.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_1B_CTA1.setText("");
       }
    }//GEN-LAST:event_TXT_1B_CTA1KeyReleased

    private void TXT_1B_CTA1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_CTA1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_CTA1KeyTyped

    private void TXT_1B_EPT1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_EPT1KeyReleased
                         // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_1B_EPT1.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_1B_EPT1.setText("");
       }
    }//GEN-LAST:event_TXT_1B_EPT1KeyReleased

    private void TXT_1B_EPT1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_EPT1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_EPT1KeyTyped

    private void TXT_1B_PFRH2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_PFRH2KeyReleased
                            // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_1B_PFRH2.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_1B_PFRH2.setText("");
       }
    }//GEN-LAST:event_TXT_1B_PFRH2KeyReleased

    private void TXT_1B_PFRH2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_PFRH2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_PFRH2KeyTyped

    private void TXT_1B_Educacíon_Religiosa2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Educacíon_Religiosa2KeyReleased
                            // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_1B_Educacíon_Religiosa2.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_1B_Educacíon_Religiosa2.setText("");
       }
    }//GEN-LAST:event_TXT_1B_Educacíon_Religiosa2KeyReleased

    private void TXT_1B_Educacíon_Religiosa2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Educacíon_Religiosa2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_Educacíon_Religiosa2KeyTyped

    private void TXT_1B_ingles2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_ingles2KeyReleased
        int texto=Integer.parseInt(TXT_1B_ingles2.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
           TXT_1B_ingles2.setText("");
       }            // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_ingles2KeyReleased

    private void TXT_1B_ingles2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_ingles2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_ingles2KeyTyped

    private void TXT_1B_FCC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_FCC2KeyReleased
                             // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_1B_FCC2.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_1B_FCC2.setText("");
       }
    }//GEN-LAST:event_TXT_1B_FCC2KeyReleased

    private void TXT_1B_FCC2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_FCC2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_FCC2KeyTyped

    private void TXT_1B_CTA2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_CTA2KeyReleased
                             // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_1B_CTA2.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_1B_CTA2.setText("");
       }
    }//GEN-LAST:event_TXT_1B_CTA2KeyReleased

    private void TXT_1B_CTA2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_CTA2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_CTA2KeyTyped

    private void TXT_1B_Educacíon_Fisica2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Educacíon_Fisica2KeyReleased
                             // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_1B_Educacíon_Fisica2.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_1B_Educacíon_Fisica2.setText("");
       }
    }//GEN-LAST:event_TXT_1B_Educacíon_Fisica2KeyReleased

    private void TXT_1B_Educacíon_Fisica2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Educacíon_Fisica2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_Educacíon_Fisica2KeyTyped

    private void TXT_1B_EPT2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_EPT2KeyReleased
                           // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_1B_EPT2.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_1B_EPT2.setText("");
       }
    }//GEN-LAST:event_TXT_1B_EPT2KeyReleased

    private void TXT_1B_EPT2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_EPT2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_EPT2KeyTyped

    private void TXT_1B_Matematica2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Matematica2KeyReleased
        int texto=Integer.parseInt(TXT_1B_Matematica2.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
           TXT_1B_Matematica2.setText("");
       }
    }//GEN-LAST:event_TXT_1B_Matematica2KeyReleased

    private void TXT_1B_Matematica2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Matematica2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_Matematica2KeyTyped

    private void TXT_1B_Comunicacion2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Comunicacion2KeyReleased
        int texto=Integer.parseInt(TXT_1B_Comunicacion2.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
           TXT_1B_Comunicacion2.setText("");
       }        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_Comunicacion2KeyReleased

    private void TXT_1B_Comunicacion2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Comunicacion2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_Comunicacion2KeyTyped

    private void TXT_1B_Arte2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Arte2KeyReleased
                              // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_1B_Arte2.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_1B_Arte2.setText("");
       }
    }//GEN-LAST:event_TXT_1B_Arte2KeyReleased

    private void TXT_1B_Arte2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_Arte2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_Arte2KeyTyped

    private void TXT_1B_HGE2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_HGE2KeyReleased
                             // ingrese valores de 0 a 20
        int texto=Integer.parseInt( TXT_1B_HGE2.getText().trim());
       if(texto >20 || texto<0)
       {
           JOptionPane.showMessageDialog(null,"ingrese nota de 0 - 20");
            TXT_1B_HGE2.setText("");
       }
    }//GEN-LAST:event_TXT_1B_HGE2KeyReleased

    private void TXT_1B_HGE2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_1B_HGE2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_HGE2KeyTyped

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
           Ventana_Principal_Nota_estudiante principal= new Ventana_Principal_Nota_estudiante();
            principal.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void TXT_1B_Arte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_1B_Arte1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_1B_Arte1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Notas_Secundaria_estudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_buscar;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JTextField TXT_1B_Arte;
    private javax.swing.JTextField TXT_1B_Arte1;
    private javax.swing.JTextField TXT_1B_Arte2;
    private javax.swing.JTextField TXT_1B_CTA;
    private javax.swing.JTextField TXT_1B_CTA1;
    private javax.swing.JTextField TXT_1B_CTA2;
    private javax.swing.JTextField TXT_1B_Comunicacion;
    private javax.swing.JTextField TXT_1B_Comunicacion1;
    private javax.swing.JTextField TXT_1B_Comunicacion2;
    private javax.swing.JTextField TXT_1B_EPT;
    private javax.swing.JTextField TXT_1B_EPT1;
    private javax.swing.JTextField TXT_1B_EPT2;
    private javax.swing.JTextField TXT_1B_Educacíon_Fisica;
    private javax.swing.JTextField TXT_1B_Educacíon_Fisica1;
    private javax.swing.JTextField TXT_1B_Educacíon_Fisica2;
    private javax.swing.JTextField TXT_1B_Educacíon_Religiosa;
    private javax.swing.JTextField TXT_1B_Educacíon_Religiosa1;
    private javax.swing.JTextField TXT_1B_Educacíon_Religiosa2;
    private javax.swing.JTextField TXT_1B_FCC;
    private javax.swing.JTextField TXT_1B_FCC1;
    private javax.swing.JTextField TXT_1B_FCC2;
    private javax.swing.JTextField TXT_1B_HGE;
    private javax.swing.JTextField TXT_1B_HGE1;
    private javax.swing.JTextField TXT_1B_HGE2;
    private javax.swing.JTextField TXT_1B_Matematica;
    private javax.swing.JTextField TXT_1B_Matematica1;
    private javax.swing.JTextField TXT_1B_Matematica2;
    private javax.swing.JTextField TXT_1B_PFRH;
    private javax.swing.JTextField TXT_1B_PFRH1;
    private javax.swing.JTextField TXT_1B_PFRH2;
    private javax.swing.JTextField TXT_1B_ingles;
    private javax.swing.JTextField TXT_1B_ingles1;
    private javax.swing.JTextField TXT_1B_ingles2;
    private javax.swing.JComboBox<String> cmb_año;
    private javax.swing.JComboBox<String> cmb_grado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
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
            
            TXT_1B_Matematica.setText("");  
            TXT_1B_Comunicacion.setText(""); 
            TXT_1B_ingles.setText("");  
            TXT_1B_Arte.setText("");  
            TXT_1B_HGE.setText(""); 
            TXT_1B_FCC.setText(""); 
            TXT_1B_PFRH.setText("");  
            TXT_1B_Educacíon_Fisica.setText(""); 
            TXT_1B_Educacíon_Religiosa.setText(""); 
            TXT_1B_CTA.setText(""); 
            TXT_1B_EPT.setText(""); 
            
            TXT_1B_Matematica1.setText("");  
            TXT_1B_Comunicacion1.setText(""); 
            TXT_1B_ingles1.setText("");  
            TXT_1B_Arte1.setText("");  
            TXT_1B_HGE1.setText(""); 
            TXT_1B_FCC1.setText(""); 
            TXT_1B_PFRH1.setText("");  
            TXT_1B_Educacíon_Fisica1.setText(""); 
            TXT_1B_Educacíon_Religiosa1.setText(""); 
            TXT_1B_CTA1.setText(""); 
            TXT_1B_EPT1.setText(""); 

            TXT_1B_Matematica2.setText("");  
            TXT_1B_Comunicacion2.setText(""); 
            TXT_1B_ingles2.setText("");  
            TXT_1B_Arte2.setText("");  
            TXT_1B_HGE2.setText(""); 
            TXT_1B_FCC2.setText(""); 
            TXT_1B_PFRH2.setText("");  
            TXT_1B_Educacíon_Fisica2.setText(""); 
            TXT_1B_Educacíon_Religiosa2.setText(""); 
            TXT_1B_CTA2.setText(""); 
            TXT_1B_EPT2.setText(""); 
            
}
}