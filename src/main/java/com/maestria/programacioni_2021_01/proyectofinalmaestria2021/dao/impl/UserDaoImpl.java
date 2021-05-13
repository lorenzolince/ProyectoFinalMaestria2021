/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dao.impl;

import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.config.PoolConnection;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dao.UserDao;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dto.UserDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author loren
 */
public class UserDaoImpl implements UserDao {

    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public UserDaoImpl() {
        this.con = PoolConnection.getInstance().getConnection();
    }

    @Override
    public List<UserDto> getAll() {
        List<UserDto> listUser = new ArrayList<>();
        try {
            System.out.println("Consultado datos");
            String query;
            query = "SELECT * FROM USUARIOS";
            pstmt = con.prepareStatement(query);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                listUser.add(new UserDto()
                        .setId(rs.getInt("ID"))
                        .setName(rs.getString("NOMBRE"))
                        .setPassword(rs.getString("¨PASS"))
                        .setUser(rs.getString("USER")));
            }

        } catch (SQLException e) {
            System.out.println("Error sql " + e);
        } finally {
            try {
                rs.close();
                pstmt.close();
                PoolConnection.getInstance().freeConnection(con);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return listUser;
    }

    @Override
    public UserDto getById(int id) {
      UserDto user = null;
       try {
            System.out.println("Consultado datos");
            String query;
            query = "SELECT * FROM USUARIOS where ID = "+id;
            pstmt = con.prepareStatement(query);
            rs = pstmt.executeQuery();
            while (rs.next()) {
             user=   new UserDto()
                        .setId(rs.getInt("ID"))
                        .setName(rs.getString("NOMBRE"))
                        .setPassword(rs.getString("¨PASS"))
                        .setUser(rs.getString("USER"));
             break;
            }

        } catch (SQLException e) {
            System.out.println("Error sql " + e);
        } finally {
            try {
                rs.close();
                pstmt.close();
                PoolConnection.getInstance().freeConnection(con);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
       }
      return user;
    }

    @Override
    public UserDto getByUserName(String userName) {
        UserDto user = null;
       try {
            System.out.println("Consultado datos");
            String query;
            query = "SELECT * FROM USUARIOS where [USER] = '"+userName+"'";
            pstmt = con.prepareStatement(query);
            rs = pstmt.executeQuery();
            while (rs.next()) {
             user=   new UserDto()
                        .setId(rs.getInt("ID"))
                        .setName(rs.getString("NOMBRE"))
                        .setPassword(rs.getString("PASS"))
                        .setUser(rs.getString("USER"));
             break;
            }

        } catch (SQLException e) {
            System.out.println("Error sql " + e);
        } finally {
            try {
                rs.close();
                pstmt.close();
                PoolConnection.getInstance().freeConnection(con);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
       }
        return user;
    }

}
