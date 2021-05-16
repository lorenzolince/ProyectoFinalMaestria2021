/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.proyectofinalmaestria2021;

import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.config.PoolConnection;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.controller.ImportData;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.controller.Login;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.controller.Productos;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dto.ProductosDto;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dto.UserDto;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.service.ProductosService;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.service.UserService;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.service.impl.ProductosServiceImpl;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.service.impl.UserServiceImpl;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileReader;
import java.io.Reader;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author lorenzolince
 */
public class Application extends JFrame {

    private CardLayout card;
    private Container c;
    private UserService userService;
    private JMenuBar mb;
    private JMenu menu1;
    private JMenuItem mi1;
    private ImportData importData;
    private ProductosService productosService;
    private Productos p;

    public Application() {
        setTitle("Login");
        this.productosService = new ProductosServiceImpl();
        this.importData = new ImportData(this, true);
        p = new Productos();
        importData.setVisible(false);
        importData.getjFileChooser1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                JFileChooser jFileC = (JFileChooser) evt.getSource();
                if (jFileC.isFileSelectionEnabled() && evt.getActionCommand().equals("ApproveSelection")) {
                    try {
                        String[] HEADERS = {"COD_PRODUCTO", "DESC_PRODUCTO", "PRECIO", "UNIDAD", "IMAGEN", "TIPO"};
                        System.out.println("################### FILE #################  " + jFileC.getSelectedFile().getAbsolutePath());
                        Reader in = new FileReader(jFileC.getSelectedFile().getAbsolutePath());
                        Iterable<CSVRecord> records = CSVFormat.EXCEL
                                .withHeader(HEADERS)
                                .withDelimiter(';')
                                .withFirstRecordAsHeader()
                                .parse(in);
                        for (CSVRecord record : records) {
                            System.out.print(" " + record.get("COD_PRODUCTO"));
                            System.out.print(" " + record.get("DESC_PRODUCTO"));
                            System.out.print(" " + record.get("PRECIO"));
                            System.out.print(" " + record.get("UNIDAD"));
                            System.out.print(" " + record.get("IMAGEN"));
                            System.out.println(" " + record.get("TIPO"));
                            productosService.save(new ProductosDto()
                                    .setCodigo(record.get("COD_PRODUCTO"))
                                    .setDescripcion(record.get("DESC_PRODUCTO"))
                                    .setImages(record.get("IMAGEN"))
                                    .setPrecio(Double.valueOf(record.get("PRECIO")))
                                    .setTipo(record.get("TIPO"))
                                    .setUnidad(Integer.valueOf(record.get("UNIDAD"))));
                        }
                        p.initDataApplication(productosService.getAll());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    importData.setVisible(false);
                }
                if (evt.getActionCommand().equals("CancelSelection")) {
                    importData.setVisible(false);
                }
            }

        });
        mb = new JMenuBar();
        menu1 = new JMenu("File");
        mb.add(menu1);
        mi1 = new JMenuItem("Import Data");
        mi1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDialog();
            }

        });

        menu1.add(mi1);
        userService = new UserServiceImpl();
        c = getContentPane();
        card = new CardLayout(0, 0);
        c.setLayout(card);
        Login l = new Login();
        l.getjButtonSendLogin().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                UserDto userValid = userService.getByUserName(l.getjTextField1().getText());
                if (userValid != null && userValid.getPassword().equals(l.getjPasswordField1().getText())) {
                    JOptionPane.showMessageDialog(null, "Bienvenido al Sistema");
                    sizeChange();
                    card.next(c);
                    setTitle("Inventario de Productos");
                } else {
                    JOptionPane.showMessageDialog(null, "Error la contraseña o usuario no existe");
                }
            }
        });

        c.add("Login", l);
        c.add("Productos", p);

    }

    private void sizeChange() {
        this.setJMenuBar(mb);
        this.setSize(800, 600);
    }

    private void showDialog() {
        importData.setVisible(true);
    }

    public static void main(String[] args) {
        Application cl = new Application();
        cl.setSize(400, 400);
        cl.setVisible(true);
        cl.setResizable(false);
        cl.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cl.setLocation(800, 200);
        cl.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                PoolConnection.getInstance().release();
                System.exit(0);
            }
        });

    }

}
