
package com.maestria.programacioni_2021_01.proyectofinalmaestria2021.service;

import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dto.ProductosDto;
import java.util.List;

/**
 *
 * @author lorenzolince
 */
public interface ProductosService {

    List<ProductosDto> getAll();
    
    ProductosDto getById(int id);

    void save(ProductosDto producto);

    void update(ProductosDto producto);

    void delete(int id);

}
