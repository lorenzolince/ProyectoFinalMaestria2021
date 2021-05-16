/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.proyectofinalmaestria2021.controller;

import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dto.ProductoSelectDto;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dto.ProductosDto;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dto.TipoDto;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.service.ProductosService;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.service.TiposService;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.service.impl.ProductosServiceImpl;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.service.impl.TiposServiceImpl;
import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lorenzolince
 */
public class Productos extends javax.swing.JPanel {

    private static String column[] = {"ID", "COD_PRODUCTO", "DESC_PRODUCTO", "UNIDAD", "PRECIO", "IMAGEN", "TIPO"};
    private ProductosService productosService;
    private TiposService tiposService;
    private String fileImagePath = "";
    private List<ProductoSelectDto> selectProductos = new ArrayList<>();
    private List<String> items;

    public Productos() {
        this.productosService = new ProductosServiceImpl();
        this.tiposService = new TiposServiceImpl();
        initComponents();
        List<ProductosDto> productos = this.productosService.getAll();
        productos.stream().forEach(t -> selectProductos.add(new ProductoSelectDto().setId(t.getId()).setCodigo(t.getCodigo())));
        initData(productos);
        List<TipoDto> tipos = this.tiposService.getAll();
        jComboBoxProductos.removeAllItems();
        jComboBoxProductosDelete.removeAllItems();
        jComboBoxTipoUpdateTipo.removeAllItems();
        selectProductos.stream().forEach(t -> jComboBoxProductos.addItem(t.getCodigo()));
        selectProductos.stream().forEach(t -> jComboBoxProductosDelete.addItem(t.getCodigo()));
        tipos.stream().forEach(t -> jComboBoxTipo.addItem(t.getName()));
        tipos.stream().forEach(t -> jComboBoxTipoUpdateTipo.addItem(t.getName()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDesc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldUnity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jButtonSave = new javax.swing.JButton();
        jButtonFile = new javax.swing.JButton();
        jLabelImages = new javax.swing.JLabel();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldUpdateCodigo = new javax.swing.JTextField();
        jTextFieldUpdateDesc = new javax.swing.JTextField();
        jTextFieldUpdateUnity = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldUpdatePrecio = new javax.swing.JTextField();
        jButtonFileUpdateImage = new javax.swing.JButton();
        jComboBoxTipoUpdateTipo = new javax.swing.JComboBox<>();
        jLabel1UpdateImage = new javax.swing.JLabel();
        jButtonUpdate = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxProductos = new javax.swing.JComboBox<>();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxProductosDelete = new javax.swing.JComboBox<>();
        jButtonDelete = new javax.swing.JButton();
        jLabel1Delete = new javax.swing.JLabel();

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "COD_PRODUCTO", "DESC_PRODUCTO", "UNIDAD", "PRECIO", "IMAGEN", "TIPO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableProductos);
        if (jTableProductos.getColumnModel().getColumnCount() > 0) {
            jTableProductos.getColumnModel().getColumn(0).setResizable(false);
            jTableProductos.getColumnModel().getColumn(1).setResizable(false);
            jTableProductos.getColumnModel().getColumn(2).setResizable(false);
            jTableProductos.getColumnModel().getColumn(3).setResizable(false);
            jTableProductos.getColumnModel().getColumn(4).setResizable(false);
            jTableProductos.getColumnModel().getColumn(5).setResizable(false);
            jTableProductos.getColumnModel().getColumn(6).setResizable(false);
        }

        jTabbedPane4.addTab("Lista de productos disponibles", jScrollPane1);

        jTabbedPane1.addTab("Productos           ", jTabbedPane4);

        jLabel1.setText("Codigo");

        jLabel2.setText("Descripcion");

        jLabel3.setText("Unidad");

        jLabel4.setText("Precio");

        jLabel5.setText("Imagen");

        jLabel6.setText("Tipo de producto");

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));

        jButtonSave.setText("Guardar");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonFile.setText("selct file");
        jButtonFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCode, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jButtonFile))
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldUnity, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelImages, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSave)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSave)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldUnity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonFile)
                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelImages, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Formulario para guardar nuevos productos", jPanel1);

        jTabbedPane1.addTab("Guardar                  ", jTabbedPane5);

        jLabel7.setText("Codigo");

        jLabel8.setText("Descripcion");

        jLabel9.setText("Unidad");

        jLabel10.setText("Precio");

        jLabel11.setText("Imagen");

        jLabel12.setText("Tipo de producto");

        jButtonFileUpdateImage.setText("selct file");
        jButtonFileUpdateImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFileUpdateImageActionPerformed(evt);
            }
        });

        jComboBoxTipoUpdateTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoUpdateTipoActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("Actualizar");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jLabel13.setText("selecionar producto");

        jComboBoxProductos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxProductosItemStateChanged(evt);
            }
        });
        jComboBoxProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1UpdateImage, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 697, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldUpdateCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jTextFieldUpdatePrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(196, 196, 196)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextFieldUpdateDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(jButtonFileUpdateImage)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(28, 28, 28)
                                .addComponent(jComboBoxProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBoxTipoUpdateTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldUpdateUnity, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jButtonUpdate))
                                    .addComponent(jLabel9))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBoxProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUpdateCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUpdateDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUpdateUnity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUpdatePrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFileUpdateImage)
                    .addComponent(jComboBoxTipoUpdateTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1UpdateImage, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonUpdate)
                        .addGap(48, 48, 48))))
        );

        jTabbedPane8.addTab("Formulario de actualizacion de productos", jPanel2);

        jTabbedPane1.addTab("Actualizar                   ", jTabbedPane8);

        jLabel14.setText("selecionar producto");

        jComboBoxProductosDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProductosDeleteActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Borrar");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jButtonDelete))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(48, 48, 48)
                                .addComponent(jComboBoxProductosDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(348, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jComboBoxProductosDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jLabel1Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButtonDelete)
                .addGap(67, 67, 67))
        );

        jTabbedPane6.addTab("Formulario para borrar productos", jPanel3);

        jTabbedPane1.addTab("Borrar                        ", jTabbedPane6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed

        try {
            File fileSource = new File(fileImagePath);
            File dest = new File(fileSource.getName());
            ProductosDto producto = new ProductosDto()
                    .setCodigo(jTextFieldCode.getText())
                    .setDescripcion(jTextFieldDesc.getText())
                    .setImages(fileSource.getName())
                    .setPrecio(Double.valueOf(jTextFieldPrecio.getText()))
                    .setUnidad(Integer.valueOf(jTextFieldUnity.getText()))
                    .setTipo(jComboBoxTipo.getSelectedItem().toString());

            Files.copy(fileSource.toPath(), dest.toPath());
            this.productosService.save(producto);
            List<ProductosDto> productos = this.productosService.getAll();
            selectProductos.clear();
            productos.stream().forEach(t -> selectProductos.add(new ProductoSelectDto().setId(t.getId()).setCodigo(t.getCodigo())));
            initData(productos);
            JOptionPane.showMessageDialog(null, "Se guardo el producto satisfactoriamente");
            jTextFieldCode.setText("");
            jTextFieldDesc.setText("");
            jTextFieldPrecio.setText("");
            jTextFieldUnity.setText("");
            jLabelImages.setIcon(null);
            jComboBoxProductos.addItem(producto.getCodigo());
            jComboBoxProductosDelete.addItem(producto.getCodigo());
            fileImagePath = "";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el producto", "", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            fileImagePath = selectedFile.getAbsolutePath();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            ImageIcon imageIcon = new ImageIcon(fileImagePath);
            Image image = imageIcon.getImage(); // transform it 
            Image newimg = image.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
            imageIcon = new ImageIcon(newimg);
            jLabelImages.setIcon(imageIcon);
            // jLabelImages.repaint();
        }
    }//GEN-LAST:event_jButtonFileActionPerformed

    private void jButtonFileUpdateImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFileUpdateImageActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            fileImagePath = selectedFile.getAbsolutePath();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            ImageIcon imageIcon = new ImageIcon(fileImagePath);
            Image image = imageIcon.getImage(); // transform it 
            Image newimg = image.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
            imageIcon = new ImageIcon(newimg);
            jLabel1UpdateImage.setIcon(imageIcon);
            jLabel1Delete.setIcon(imageIcon);
            // jLabelImages.repaint();
        }
    }//GEN-LAST:event_jButtonFileUpdateImageActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        try {
            String fileUpdatePath = "";
            File fileSource = null;
            File dest = null;
            if (fileImagePath != null && !fileImagePath.equals("")) {
                fileSource = new File(fileImagePath);
                dest = new File(fileSource.getName());
                fileUpdatePath = fileSource.getName();
            }

            String selctProducto = jComboBoxProductos.getSelectedItem().toString();
            int id = selectProductos.stream()
                    .filter(s -> s.getCodigo().equals(selctProducto))
                    .findFirst().get().getId();
            String imageUpdate = this.productosService.getById(id).getImages();
            if (fileUpdatePath.equals("")) {
                fileUpdatePath = imageUpdate;
            }
            ProductosDto producto = new ProductosDto()
                    .setId(id)
                    .setCodigo(jTextFieldUpdateCodigo.getText())
                    .setDescripcion(jTextFieldUpdateDesc.getText())
                    .setImages(fileUpdatePath)
                    .setPrecio(Double.valueOf(jTextFieldUpdatePrecio.getText()))
                    .setUnidad(Integer.valueOf(jTextFieldUpdateUnity.getText()))
                    .setTipo(jComboBoxTipoUpdateTipo.getSelectedItem().toString());
            if (!producto.getImages().equals(imageUpdate)) {
                new File(imageUpdate).delete();
            }
            Files.copy(fileSource.toPath(), dest.toPath());
            this.productosService.update(producto);
            fileImagePath = "";
            List<ProductosDto> productos = this.productosService.getAll();
            initData(productos);
            JOptionPane.showMessageDialog(null, "Se Actualizo el producto satisfactoriamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Actualizar el producto", "", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jComboBoxTipoUpdateTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoUpdateTipoActionPerformed

    }//GEN-LAST:event_jComboBoxTipoUpdateTipoActionPerformed


    private void jComboBoxProductosDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProductosDeleteActionPerformed
        String selctProducto = jComboBoxProductosDelete.getSelectedItem().toString();
        int id = selectProductos.stream()
                .filter(s -> s.getCodigo().equals(selctProducto))
                .findFirst().get().getId();
        ProductosDto pro = this.productosService.getById(id);
        fileImagePath = pro.getImages();
        ImageIcon imageIcon = new ImageIcon(fileImagePath);
        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(160, 160, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon = new ImageIcon(newimg);
        jLabel1Delete.setIcon(imageIcon);

    }//GEN-LAST:event_jComboBoxProductosDeleteActionPerformed

    private void jComboBoxProductosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxProductosItemStateChanged

    }//GEN-LAST:event_jComboBoxProductosItemStateChanged

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        try {
            int index = jComboBoxProductosDelete.getSelectedIndex();
            String selctProducto = jComboBoxProductosDelete.getSelectedItem().toString();
            int id = selectProductos.stream()
                    .filter(s -> s.getCodigo().equals(selctProducto))
                    .findFirst().get().getId();
            int input = JOptionPane.showConfirmDialog(null, "Seguro que quieres borrar este producto");
            if (input == 0) {
                ProductosDto pro = this.productosService.getById(id);
                this.productosService.delete(pro.getId());
                new File(pro.getImages()).delete();
                List<ProductosDto> productos = this.productosService.getAll();
                selectProductos.clear();
                productos.stream().forEach(t -> selectProductos.add(new ProductoSelectDto().setId(t.getId()).setCodigo(t.getCodigo())));
                jComboBoxProductos.removeItemAt(index);
                jComboBoxProductosDelete.removeItemAt(index);
                initData(productos);
                JOptionPane.showMessageDialog(null, "Se Booro el producto satisfactoriamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Borrar el producto", "", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jComboBoxProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProductosActionPerformed
        String selctProducto = jComboBoxProductos.getSelectedItem().toString();
        int id = selectProductos.stream()
                .filter(s -> s.getCodigo().equals(selctProducto))
                .findFirst().get().getId();
        ProductosDto pro = this.productosService.getById(id);
        jTextFieldUpdateCodigo.setText(pro.getCodigo());
        jTextFieldUpdateDesc.setText(pro.getDescripcion());
        jTextFieldUpdatePrecio.setText("" + pro.getPrecio());
        jTextFieldUpdateUnity.setText("" + pro.getUnidad());
        fileImagePath = pro.getImages();
        ImageIcon imageIcon = new ImageIcon(fileImagePath);
        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon = new ImageIcon(newimg);
        jLabel1UpdateImage.setIcon(imageIcon);
    }//GEN-LAST:event_jComboBoxProductosActionPerformed

    private void initData(List<ProductosDto> productos) {

        Object data[][] = productos
                .stream()
                .map(p -> Arrays.asList(p.getId(), p.getCodigo(), p.getDescripcion(), p.getUnidad(), p.getPrecio(), p.getImages(), p.getTipo()).toArray())
                .toArray(Object[][]::new);
        DefaultTableModel md = new DefaultTableModel(data, column);
        jTableProductos.setModel(md);
        ProductosDto pro = productos.get(0);
        jTextFieldUpdateCodigo.setText(pro.getCodigo());
        jTextFieldUpdateDesc.setText(pro.getDescripcion());
        jTextFieldUpdatePrecio.setText("" + pro.getPrecio());
        jTextFieldUpdateUnity.setText("" + pro.getUnidad());
        fileImagePath = pro.getImages();
        ImageIcon imageIcon = new ImageIcon(fileImagePath);
        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon = new ImageIcon(newimg);
        jLabel1UpdateImage.setIcon(imageIcon);
        jLabel1Delete.setIcon(imageIcon);
    }

    public void initDataApplication(List<ProductosDto> productos) {
        selectProductos.clear();
        productos.stream().forEach(t -> selectProductos.add(new ProductoSelectDto().setId(t.getId()).setCodigo(t.getCodigo())));
        items = new ArrayList<>();
        for (int i = 0; i < jComboBoxProductos.getItemCount(); i++) {
            items.add(jComboBoxProductos.getItemAt(i));
        }
        selectProductos.stream().filter(s -> !items.contains(s.getCodigo()))
                .collect(Collectors.toList())
                .forEach(t -> jComboBoxProductos.addItem(t.getCodigo()));
        items.clear();
        items = new ArrayList<>();
        for (int i = 0; i < jComboBoxProductosDelete.getItemCount(); i++) {
            items.add(jComboBoxProductosDelete.getItemAt(i));
        }
        selectProductos.stream().filter(s -> !items.contains(s.getCodigo()))
                .collect(Collectors.toList())
                .forEach(t -> jComboBoxProductosDelete.addItem(t.getCodigo()));
        Object data[][] = productos
                .stream()
                .map(p -> Arrays.asList(p.getId(), p.getCodigo(), p.getDescripcion(), p.getUnidad(), p.getPrecio(), p.getImages(), p.getTipo()).toArray())
                .toArray(Object[][]::new);
        DefaultTableModel md = new DefaultTableModel(data, column);
        jTableProductos.setModel(md);
        ProductosDto pro = productos.get(0);
        jTextFieldUpdateCodigo.setText(pro.getCodigo());
        jTextFieldUpdateDesc.setText(pro.getDescripcion());
        jTextFieldUpdatePrecio.setText("" + pro.getPrecio());
        jTextFieldUpdateUnity.setText("" + pro.getUnidad());
        fileImagePath = pro.getImages();
        ImageIcon imageIcon = new ImageIcon(fileImagePath);
        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon = new ImageIcon(newimg);
        jLabel1UpdateImage.setIcon(imageIcon);
        jLabel1Delete.setIcon(imageIcon);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonFile;
    private javax.swing.JButton jButtonFileUpdateImage;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxProductos;
    private javax.swing.JComboBox<String> jComboBoxProductosDelete;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JComboBox<String> jComboBoxTipoUpdateTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel1Delete;
    private javax.swing.JLabel jLabel1UpdateImage;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelImages;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTextField jTextFieldCode;
    private javax.swing.JTextField jTextFieldDesc;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldUnity;
    private javax.swing.JTextField jTextFieldUpdateCodigo;
    private javax.swing.JTextField jTextFieldUpdateDesc;
    private javax.swing.JTextField jTextFieldUpdatePrecio;
    private javax.swing.JTextField jTextFieldUpdateUnity;
    // End of variables declaration//GEN-END:variables
}
