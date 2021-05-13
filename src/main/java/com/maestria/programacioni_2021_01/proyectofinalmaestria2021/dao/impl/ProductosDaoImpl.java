/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dao.impl;

import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.config.PoolConnection;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dao.ProductosDao;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dto.ProductosDto;
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
public class ProductosDaoImpl implements ProductosDao {
    
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;
    
    public ProductosDaoImpl() {
         this.con = PoolConnection.getInstance().getConnection();
    }
    
    @Override
    public List<ProductosDto> getAll() {
        List<ProductosDto> listProductos = new ArrayList<>();
        try {
            System.out.println("Consultado datos");
            String query;
            query = "SELECT * FROM DATA";
            pstmt = con.prepareStatement(query);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                listProductos.add(new ProductosDto()
                        .setId(rs.getInt("ID"))
                        .setCodigo(rs.getString("COD_PRODUCTO"))
                        .setDescripcion(rs.getString("DESC_PRODUCTO"))
                        .setUnidad(rs.getInt("UNIDAD"))
                        .setPrecio(rs.getDouble("PRECIO"))
                        .setImages(rs.getString("IMAGEN"))
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
