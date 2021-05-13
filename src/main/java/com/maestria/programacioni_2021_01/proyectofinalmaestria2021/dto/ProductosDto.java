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
public class ProductosDto {

    private int id;
    private String codigo;
    private String descripcion;
    private int unidad;
    private double precio;
     private String images;

    public int getId() {
        return id;
    }

    public ProductosDto setId(int id) {
        this.id = id;
        return this;
    }

    public String getCodigo() {
        return codigo;
    }

    public ProductosDto setCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ProductosDto setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public int getUnidad() {
        return unidad;
    }

    public ProductosDto setUnidad(int unidad) {
        this.unidad = unidad;
        return this;
    }

    public double getPrecio() {
        return precio;
    }

    public ProductosDto setPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    public String getImages() {
        return images;
    }

    public ProductosDto setImages(String images) {
        this.images = images;
        return this;
    }
    

}
