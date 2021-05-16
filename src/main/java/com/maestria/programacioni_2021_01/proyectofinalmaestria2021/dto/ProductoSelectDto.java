
package com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dto;

/**
 *
 * @author lorenzolince
 */
public class ProductoSelectDto {

    private int id;
    private String codigo;

    public int getId() {
        return id;
    }

    public ProductoSelectDto setId(int id) {
        this.id = id;
        return this;
    }

    public String getCodigo() {
        return codigo;
    }

    public ProductoSelectDto setCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

}
