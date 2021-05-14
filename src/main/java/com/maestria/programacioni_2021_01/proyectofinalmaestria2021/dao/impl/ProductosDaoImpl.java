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
            query = "SELECT * FROM Productos";
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
                        .setTipo(rs.getString("TIPO"))
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

    @Override
    public ProductosDto getbyId(int id) {
        ProductosDto producto = null;
        try {
            String query;
            query = "SELECT * FROM Productos where id =?";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                producto = new ProductosDto()
                        .setId(rs.getInt("ID"))
                        .setCodigo(rs.getString("COD_PRODUCTO"))
                        .setDescripcion(rs.getString("DESC_PRODUCTO"))
                        .setUnidad(rs.getInt("UNIDAD"))
                        .setPrecio(rs.getDouble("PRECIO"))
                        .setImages(rs.getString("IMAGEN"))
                        .setTipo(rs.getString("TIPO"));
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
        return producto;
    }

    @Override
    public void save(ProductosDto producto) {
        try {
            pstmt = con.prepareStatement("insert into Productos (COD_PRODUCTO, DESC_PRODUCTO,UNIDAD, PRECIO,IMAGEN, TIPO ) values (?, ?, ?, ?, ?, ?)");
            pstmt.setString(1, producto.getCodigo());
            pstmt.setString(2, producto.getDescripcion());
            pstmt.setInt(3, producto.getUnidad());
            pstmt.setDouble(4, producto.getPrecio());
            pstmt.setString(5, producto.getImages());
            pstmt.setString(6, producto.getTipo());
            pstmt.executeUpdate(); //insert, delete, update
            System.out.println("Se grabo la transaccion");

        } catch (SQLException sqle) {
            System.out.println("Error sql " + sqle);
        } finally {
            try {
                pstmt.close();
                PoolConnection.getInstance().freeConnection(con);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void update(ProductosDto producto) {
        try {
            pstmt = con.prepareStatement("UPDATE Productos SET COD_PRODUCTO = ? ,SET DESC_PRODUCTO=?, SET UNIDAD=?, SET PRECIO=?, SET IMAGEN=? ,SET TIPO=? WHERE ID =?");
            pstmt.setString(1, producto.getCodigo());
            pstmt.setString(2, producto.getDescripcion());
            pstmt.setInt(3, producto.getUnidad());
            pstmt.setDouble(4, producto.getPrecio());
            pstmt.setString(5, producto.getImages());
            pstmt.setString(6, producto.getTipo());
            pstmt.setInt(7, producto.getId());
            pstmt.executeUpdate(); //insert, delete, update
            System.out.println("Se grabo la transaccion");

        } catch (SQLException sqle) {
            System.out.println("Error sql " + sqle);
        } finally {
            try {
                pstmt.close();
                PoolConnection.getInstance().freeConnection(con);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void delete(int id) {
        try {
            pstmt = con.prepareStatement("DELETE Productos  WHERE ID =?");
            pstmt.setInt(1, id);
            pstmt.executeUpdate(); //insert, delete, update
            System.out.println("Se grabo la transaccion");

        } catch (SQLException sqle) {
            System.out.println("Error sql " + sqle);
        } finally {
            try {
                pstmt.close();
                PoolConnection.getInstance().freeConnection(con);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
