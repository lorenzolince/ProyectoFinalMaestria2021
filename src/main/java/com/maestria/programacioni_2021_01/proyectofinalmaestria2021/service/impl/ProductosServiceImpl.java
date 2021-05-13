/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.proyectofinalmaestria2021.service.impl;

import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dao.ProductosDao;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dao.impl.ProductosDaoImpl;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dto.ProductosDto;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.service.ProductosService;
import java.util.List;

/**
 *
 * @author loren
 */
public class ProductosServiceImpl implements ProductosService {

    private ProductosDao productos;

    public ProductosServiceImpl() {
        this.productos = new ProductosDaoImpl();
    }

    @Override
    public List<ProductosDto> getAll() {
        return this.productos.getAll();
    }

}
