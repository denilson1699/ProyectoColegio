package Ventanas;

import Clases.Conexion;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class examen_Alternativas extends javax.swing.JInternalFrame {

    public examen_Alternativas() {
        initComponents();
                Calendar Calendario=Calendar.getInstance(); 
        labelFecha.setText(Integer.toString(Calendario.get(Calendar.DATE))+"/"+
                                    Integer.toString(Calendario.get(Calendar.MONTH)+1)+"/"+
                                    Integer.toString(Calendario.get(Calendar.YEAR)));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        txt_codigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        txt_PREG1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_alternativa1 = new javax.swing.JTextField();
        txt_Respuesta1 = new javax.swing.JTextField();
        txt_alternativa3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_PREG2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_alternativa4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_alternativa5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_alternativa6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_alternativa99 = new javax.swing.JTextField();
        txt_PREG3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_alternativa88 = new javax.swing.JTextField();
        txt_alternativa7 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_alternativa10 = new javax.swing.JTextField();
        txt_PREG4 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_alternativa12 = new javax.swing.JTextField();
        txt_alternativa111 = new javax.swing.JTextField();
        txt_alternativa15 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_alternativa14 = new javax.swing.JTextField();
        txt_alternativa13 = new javax.swing.JTextField();
        txt_PREG5 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txt_alternativa2 = new javax.swing.JTextField();
        txt_Respuesta2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txt_Respuesta3 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txt_Respuesta4 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txt_Respuesta5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        labelTipo = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Pregunta 01:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Descripcion:");

        txt_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_descripcionKeyTyped(evt);
            }
        });

        txt_PREG1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PREG1KeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Registrar Examen Con alternativas");

        jLabel3.setText("alternativa 1");

        jLabel5.setText("alternativa 2");

        jLabel8.setText("alternativa 3");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Pregunta 02:");

        txt_PREG2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PREG2KeyTyped(evt);
            }
        });

        jLabel6.setText("alternativa 1");

        jLabel9.setText("alternativa 2");

        jLabel10.setText("alternativa 3");

        jLabel11.setText("alternativa 1");

        txt_PREG3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PREG3KeyTyped(evt);
            }
        });

        jLabel12.setText("alternativa 3");

        jLabel13.setText("alternativa 2");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Pregunta 03:");

        jLabel15.setText("alternativa 2");

        txt_PREG4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PREG4KeyTyped(evt);
            }
        });

        jLabel17.setText("alternativa 3");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Pregunta 04:");

        jLabel19.setText("alternativa 1");

        jLabel20.setText("alternativa 1");

        jLabel21.setText("alternativa 3");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Pregunta 05:");

        txt_PREG5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PREG5KeyTyped(evt);
            }
        });

        jLabel23.setText("alternativa 2");

        jLabel24.setText("Respuesta:");

        jLabel25.setText("Respuesta:");

        jLabel26.setText("Respuesta:");

        jLabel27.setText("Respuesta:");

        jLabel28.setText("Respuesta:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 1054, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel14)
                                .addComponent(jLabel18)
                                .addComponent(jLabel22))
                            .addGap(28, 28, 28)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_PREG1, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_alternativa2))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_alternativa3))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_alternativa1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_alternativa4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_alternativa5))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_alternativa6))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_alternativa7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_alternativa99))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_alternativa88))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel15)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_alternativa111))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel19)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_alternativa10, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel17)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_alternativa12))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel21)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_alternativa15))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel20)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_alternativa13, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel23)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_alternativa14)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(48, 48, 48)
                                            .addComponent(jLabel24)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_Respuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(43, 43, 43)
                                            .addComponent(jLabel25)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_Respuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(45, 45, 45)
                                            .addComponent(jLabel26)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_Respuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(47, 47, 47)
                                            .addComponent(jLabel27)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_Respuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(50, 50, 50)
                                            .addComponent(jLabel28)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_Respuesta5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(txt_PREG2, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_PREG3, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_PREG4, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_PREG5, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_PREG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_alternativa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_Respuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(txt_alternativa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_alternativa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_PREG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_alternativa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_alternativa5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Respuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_alternativa6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_PREG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txt_alternativa7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txt_alternativa88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Respuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txt_alternativa99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel14))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_PREG4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txt_alternativa10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txt_alternativa111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Respuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txt_alternativa12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel18))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_PREG5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txt_alternativa13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txt_alternativa14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Respuesta5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txt_alternativa15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel22))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jButton1.setText("GUARDAR ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        labelTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelTipo.setForeground(new java.awt.Color(153, 0, 0));
        labelTipo.setText("Modelo");

        jLabel29.setText("Tipo:");

        labelFecha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(153, 0, 0));

        jLabel30.setText("Fecha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1220, Short.MAX_VALUE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_PREG1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PREG1KeyTyped
       // ingresar maximo 2 caracteres
        if(txt_PREG1.getText().length()>=200){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }

    }//GEN-LAST:event_txt_PREG1KeyTyped

    private void txt_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyTyped
       // ingresar maximo 8 caracteres
        if(txt_codigo.getText().length()>=8){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_txt_codigoKeyTyped

    private void txt_descripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_descripcionKeyTyped
        // TODO add your handling code here:  
        if(txt_descripcion.getText().length()>=50){
           evt.consume(); 
            Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_txt_descripcionKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


    String Codigo ,Descripcion,Pregunta1,Pregunta2,Pregunta3,Pregunta4,Pregunta5,
           Alternativa11,Alternativa12,Alternativa13,Respuesta1,
           Alternativa21,Alternativa22,Alternativa23,Respuesta2,
           Alternativa31,Alternativa32,Alternativa33,Respuesta3,
           Alternativa41,Alternativa42,Alternativa43,Respuesta4,
           Alternativa51,Alternativa52,Alternativa53,Respuesta5;
    int  contador=0;
     
    // recuperadmos datos de los jtextfield
    Codigo      =txt_codigo.getText().trim();//.toUpperCase();;
    Descripcion   =txt_descripcion.getText().trim();
        if(Codigo.equals("")||Descripcion.equals(""))
    {
        JOptionPane.showMessageDialog(null,"Ingrese código/ Descripción");
        contador++;
    }
    
    Pregunta1 =txt_PREG1.getText().trim();
    Alternativa11=txt_alternativa1.getText().trim();
    Alternativa12=txt_alternativa2.getText().trim();
    Alternativa13=txt_alternativa3.getText().trim();
    Respuesta1=txt_Respuesta1.getText().trim();
    if(Pregunta1.equals("")||Alternativa11.equals("")||Alternativa12.equals("")||Alternativa13.equals("")||Respuesta1.equals(""))
    {
        JOptionPane.showMessageDialog(null,"Ingrese todos los campos de la Pregunta 01");
        contador++;
    }
    
    Pregunta2 =txt_PREG2.getText().trim();
    Alternativa21=txt_alternativa4.getText().trim();
    Alternativa22=txt_alternativa5.getText().trim();
    Alternativa23=txt_alternativa6.getText().trim();
    Respuesta2=txt_Respuesta2.getText().trim();
    if(Pregunta2.equals("")||Alternativa21.equals("")||Alternativa22.equals("")||Alternativa23.equals("")||Respuesta2.equals(""))
    {
        JOptionPane.showMessageDialog(null,"Ingrese todos los campos de la Pregunta 02");
        contador++;
    }    
    
    Pregunta3 =txt_PREG3.getText().trim();
    Alternativa31=txt_alternativa7.getText().trim();
    Alternativa32=txt_alternativa88.getText().trim();
    Alternativa33=txt_alternativa99.getText().trim();
    Respuesta3=txt_Respuesta3.getText().trim();
        if(Pregunta3.equals("")||Alternativa31.equals("")||Alternativa32.equals("")||Alternativa33.equals("")||Respuesta3.equals(""))
    {
        JOptionPane.showMessageDialog(null,"Ingrese todos los campos de la Pregunta 03");
        contador++;
    }
    
    Pregunta4 =txt_PREG4.getText().trim();
    Alternativa41=txt_alternativa10.getText().trim();
    Alternativa42=txt_alternativa111.getText().trim();
    Alternativa43=txt_alternativa12.getText().trim();
    Respuesta4=txt_Respuesta4.getText().trim();    
        if(Pregunta4.equals("")||Alternativa41.equals("")||Alternativa42.equals("")||Alternativa43.equals("")||Respuesta4.equals(""))
    {
        JOptionPane.showMessageDialog(null,"Ingrese todos los campos de la Pregunta 04");
        contador++;
    }
    
    Pregunta5 =txt_PREG5.getText().trim();
    Alternativa51=txt_alternativa13.getText().trim();
    Alternativa52=txt_alternativa14.getText().trim();
    Alternativa53=txt_alternativa15.getText().trim();
    Respuesta5=txt_Respuesta5.getText().trim();  
        if(Pregunta5.equals("")||Alternativa51.equals("")||Alternativa52.equals("")||Alternativa53.equals("")||Respuesta5.equals(""))
    {
        JOptionPane.showMessageDialog(null,"Ingrese todos los campos de la Pregunta 05");
        contador++;
    }
        if(contador==0)
        {  // pregusntar si se desea guardar la actualizacion
      
            try
            {
             String validarcodigo;
             Connection cn1= Conexion.Conectar();
             PreparedStatement pst1= cn1.prepareStatement("select Codigo from tabla_examen_alternativas where Codigo='"+Codigo+"'");
                ResultSet resul1=pst1.executeQuery();
                if(resul1.next())
                {
                    validarcodigo=resul1.getString("Codigo");
                    // validamos que el dni o se repita
                    if (Codigo.equals(validarcodigo))
                    {
                        JOptionPane.showMessageDialog(null, "Código "+Codigo+" ya registrado");
                    }
                }else{// validar s desea guardar producto
        int mensaje=JOptionPane.showConfirmDialog(null,"Guardar examen ",null,JOptionPane.YES_NO_OPTION);
        if(mensaje==JOptionPane.YES_OPTION)
        {
                     try
                     {
                      Connection cn=Conexion.Conectar();
                      PreparedStatement pst= cn.prepareStatement("insert into tabla_examen_alternativas values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                      pst.setInt(1,0);
                      pst.setString(2,Codigo);
                      pst.setString(3,Descripcion);
                      
                      pst.setString(4,Pregunta1 );
                      pst.setString(5,Alternativa11 );
                      pst.setString(6,Alternativa12 );
                      pst.setString(7,Alternativa13 );
                      pst.setString(8,Respuesta1 );
                                            
                      pst.setString(9,Pregunta2 );
                      pst.setString(10,Alternativa21 );
                      pst.setString(11,Alternativa22 );
                      pst.setString(12,Alternativa23 );
                      pst.setString(13,Respuesta2 );
                             
                      pst.setString(14,Pregunta3 );
                      pst.setString(15,Alternativa31 );
                      pst.setString(16,Alternativa32 );
                      pst.setString(17,Alternativa33 );
                      pst.setString(18,Respuesta3 );
                              
                      pst.setString(19,Pregunta4 );
                      pst.setString(20,Alternativa41 );
                      pst.setString(21,Alternativa42 );
                      pst.setString(22,Alternativa43 );
                      pst.setString(23,Respuesta4 );
                              
                      pst.setString(24,Pregunta5 );
                      pst.setString(25,Alternativa51 );
                      pst.setString(26,Alternativa52 );
                      pst.setString(27,Alternativa53 );
                      pst.setString(28,Respuesta5 );
                      
                      
                      pst.setString(29,labelTipo.getText().trim() );
                      pst.setString(30,labelFecha.getText().trim() );
                      pst.setString(31,"" );
                      pst.setString(32,"" );
                      pst.setString(33,"" );
                      pst.setInt(34,0 );
                      pst.executeUpdate();
                      cn.close();
                      // preguntar si desea generar un nuevo registro
                            int mensaje2=JOptionPane.showConfirmDialog(null,"Examen Modelo Registrado exitosamente continuar [S/N]:",null,JOptionPane.YES_NO_OPTION);
                            if(mensaje==JOptionPane.YES_OPTION)
                            {// recuperadmos metodo para blanquiar campos
                                LimpiarCampos();

                            }
                        } catch (Exception e)
                        {
                            JOptionPane.showMessageDialog(null, "Error al registrar Datos \n contacte al Administrador","",JOptionPane.WARNING_MESSAGE);
                            System.err.println("error al registrar nuevo Docente: "+e);
                        }
                    }else
             {// si no se desea gabra nuevo producto
                 JOptionPane.showMessageDialog(null, "REGISTRO CANCELADO");
                  }
                }

            }catch (SQLException ex) {}
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_PREG2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PREG2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PREG2KeyTyped

    private void txt_PREG3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PREG3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PREG3KeyTyped

    private void txt_PREG4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PREG4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PREG4KeyTyped

    private void txt_PREG5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PREG5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PREG5KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JTextField txt_PREG1;
    private javax.swing.JTextField txt_PREG2;
    private javax.swing.JTextField txt_PREG3;
    private javax.swing.JTextField txt_PREG4;
    private javax.swing.JTextField txt_PREG5;
    private javax.swing.JTextField txt_Respuesta1;
    private javax.swing.JTextField txt_Respuesta2;
    private javax.swing.JTextField txt_Respuesta3;
    private javax.swing.JTextField txt_Respuesta4;
    private javax.swing.JTextField txt_Respuesta5;
    private javax.swing.JTextField txt_alternativa1;
    private javax.swing.JTextField txt_alternativa10;
    private javax.swing.JTextField txt_alternativa111;
    private javax.swing.JTextField txt_alternativa12;
    private javax.swing.JTextField txt_alternativa13;
    private javax.swing.JTextField txt_alternativa14;
    private javax.swing.JTextField txt_alternativa15;
    private javax.swing.JTextField txt_alternativa2;
    private javax.swing.JTextField txt_alternativa3;
    private javax.swing.JTextField txt_alternativa4;
    private javax.swing.JTextField txt_alternativa5;
    private javax.swing.JTextField txt_alternativa6;
    private javax.swing.JTextField txt_alternativa7;
    private javax.swing.JTextField txt_alternativa88;
    private javax.swing.JTextField txt_alternativa99;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_descripcion;
    // End of variables declaration//GEN-END:variables

    
    public void LimpiarCampos()
    {
     txt_PREG1.setText("");
     txt_PREG2.setText("");
     txt_PREG3.setText("");
     txt_PREG4.setText("");
     txt_PREG5.setText("");
     txt_codigo.setText("");
     txt_descripcion.setText("");
     
     txt_Respuesta1.setText("");
     txt_Respuesta2.setText("");
     txt_Respuesta3.setText("");
     txt_Respuesta4.setText("");
     txt_Respuesta5.setText("");
     
     txt_alternativa1.setText("");
     txt_alternativa2.setText("");
     txt_alternativa3.setText("");
     
     txt_alternativa4.setText("");
     txt_alternativa5.setText("");
     txt_alternativa6.setText("");
     
     txt_alternativa7.setText("");
     txt_alternativa88.setText("");
     txt_alternativa99.setText("");
     
     txt_alternativa10.setText("");
     txt_alternativa111.setText("");
     txt_alternativa12.setText("");
     
     txt_alternativa13.setText("");
     txt_alternativa14.setText("");
     txt_alternativa15.setText("");
     
     
    }
}
