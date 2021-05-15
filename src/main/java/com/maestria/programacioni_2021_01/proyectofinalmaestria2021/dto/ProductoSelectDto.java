/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestria.programacioni_2021_01.proyectofinalmaestria2021.dto;

/**
 *
 * @author loren
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
