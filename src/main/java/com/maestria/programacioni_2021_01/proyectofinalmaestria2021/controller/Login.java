/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.proyectofinalmaestria2021.controller;

import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.config.PoolConnection;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author lorenzolince
 */
public class Login extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public Login() {

        initComponents();
        this.setSize(400, 400);
    }

    @Override
    public void paintComponent(Graphics g) {
        File file = new File("images/login.jpg");
         Image img = Toolkit.getDefaultToolkit().getImage(file.getAbsolutePath());
        super.paintComponent(g);
        g.drawImage(img, 0, 0,400,400, this);
         g.finalize();
    }

    public JButton getjButtonSendLogin() {
        return jButtonSendLogin_Iniciar;
    }

    public JPasswordField getjPasswordField1() {
        return jPasswordField1_password;
    }

    public JTextField getjTextField1() {
        return jTextField1_nombre;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSendLogin_Iniciar = new javax.swing.JButton();
        jPasswordField1_password = new javax.swing.JPasswordField();
        jTextField1_nombre = new javax.swing.JTextField();
        jLabel2_password = new javax.swing.JLabel();
        jLabel1_nombre = new javax.swing.JLabel();
        jLabel3_user = new javax.swing.JLabel();
        jButton1_salir = new javax.swing.JButton();

        jButtonSendLogin_Iniciar.setBackground(new java.awt.Color(0, 0, 51));
        jButtonSendLogin_Iniciar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSendLogin_Iniciar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSendLogin_Iniciar.setText("Iniciar Sesión");
        jButtonSendLogin_Iniciar.setBorderPainted(false);
        jButtonSendLogin_Iniciar.setContentAreaFilled(false);

        jLabel2_password.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2_password.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2_password.setText("password");

        jLabel1_nombre.setBackground(new java.awt.Color(0, 0, 51));
        jLabel1_nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1_nombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1_nombre.setText("Nombre del Usuario");

        jLabel3_user.setIcon(new javax.swing.ImageIcon("images/user.jpg")); // NOI18N

        jButton1_salir.setBackground(new java.awt.Color(0, 0, 51));
        jButton1_salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_salir.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_salir.setText("Salir");
        jButton1_salir.setBorderPainted(false);
        jButton1_salir.setContentAreaFilled(false);
        jButton1_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jButtonSendLogin_Iniciar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1_salir)
                        .addGap(146, 146, 146)
                        .addComponent(jLabel3_user, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2_password, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jPasswordField1_password, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(409, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1_salir))
                    .addComponent(jLabel3_user, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1_nombre))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2_password))
                .addGap(32, 32, 32)
                .addComponent(jButtonSendLogin_Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jLabel1_nombre.getAccessibleContext().setAccessibleName("Nombre del Usuario");
        jLabel1_nombre.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_salirActionPerformed
        PoolConnection.getInstance().release();
        System.exit(0);
    }//GEN-LAST:event_jButton1_salirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_salir;
    private javax.swing.JButton jButtonSendLogin_Iniciar;
    private javax.swing.JLabel jLabel1_nombre;
    private javax.swing.JLabel jLabel2_password;
    private javax.swing.JLabel jLabel3_user;
    private javax.swing.JPasswordField jPasswordField1_password;
    private javax.swing.JTextField jTextField1_nombre;
    // End of variables declaration//GEN-END:variables
}
