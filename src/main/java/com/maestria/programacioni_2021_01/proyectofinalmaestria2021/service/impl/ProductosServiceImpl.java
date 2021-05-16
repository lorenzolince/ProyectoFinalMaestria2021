
package com.maestria.programacioni_2021_01.proyectofinalmaestria2021.service.impl;

import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dao.ProductosDao;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dao.impl.ProductosDaoImpl;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dto.ProductosDto;
import com.maestria.programacioni_2021_01.proyectofinalmaestria2021.service.ProductosService;
import java.util.List;

/**
 *
 * @author lorenzolince
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

    @Override
    public void save(ProductosDto producto) {
      this.productos.save(producto);
    }

    @Override
    public void update(ProductosDto producto) {
       this.productos.update(producto);
    }

    @Override
    public void delete(int id) {
        this.productos.delete(id);
    }

    @Override
    public ProductosDto getById(int id) {
       return this.productos.getbyId(id);
    }

}
