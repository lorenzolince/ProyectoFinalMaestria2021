/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dao.impl;

import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.config.PoolConnection;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dao.TiposDao;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dto.TipoDto;
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
public class TiposDaoImpl implements TiposDao {

    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public TiposDaoImpl() {
        this.con = PoolConnection.getInstance().getConnection();
    }

    @Override
    public List<TipoDto> getAll() {
        List<TipoDto> listProductos = new ArrayList<>();
        try {
            String query;
            query = "SELECT * FROM Tipos";
            pstmt = con.prepareStatement(query);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                listProductos.add(new TipoDto()
                        .setId(rs.getInt("ID"))
                        .setName(rs.getString("NAME"))
                );
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
        return listProductos;
    }

}
