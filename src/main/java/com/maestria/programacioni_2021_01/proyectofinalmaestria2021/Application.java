/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.proyectofinalmaestria2021;

import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.controller.Login;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.controller.Productos;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dto.UserDto;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.service.UserService;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.service.impl.UserServiceImpl;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author loren
 */
public class Application extends JFrame {

    private CardLayout card;
    private Container c;
    private UserService userService;
   

    public Application() {
        setTitle("Login");
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
                    card.next(c);
                    setTitle("Inventario de Productos");
                } else {
                    JOptionPane.showMessageDialog(null, "Error la contraseña o usuario no existe");
                }
            }
        });

        c.add("Login", l);
        c.add("Productos", new Productos());

    }

    public static void main(String[] args) {
        Application cl = new Application();
        cl.setSize(800, 400);
        cl.setVisible(true);
        cl.setResizable(false);
        cl.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
