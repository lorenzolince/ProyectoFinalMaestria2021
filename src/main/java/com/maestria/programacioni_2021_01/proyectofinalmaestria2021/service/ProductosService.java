/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.proyectofinalmaestria2021.service;

import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dto.ProductosDto;
import java.util.List;

/**
 *
 * @author loren
 */
public interface ProductosService {

    List<ProductosDto> getAll();
    
    ProductosDto getById(int id);

    void save(ProductosDto producto);

    void update(ProductosDto producto);

    void delete(int id);

}
