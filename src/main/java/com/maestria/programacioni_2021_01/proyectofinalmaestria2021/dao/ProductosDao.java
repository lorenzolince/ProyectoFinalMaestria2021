/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dao;

import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dto.ProductosDto;
import java.util.List;

/**
 *
 * @author lorenzolince
 */
public interface ProductosDao {

    List<ProductosDto> getAll();

    ProductosDto getbyId(int id);

    void save(ProductosDto producto);

    void update(ProductosDto producto);

    void delete(int id);
}
