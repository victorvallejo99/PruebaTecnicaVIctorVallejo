package com.accenture.ptecnica.dominio.modelo;

public class Producto {

    private Long id;
    private String nombre;
    private float precio;

    public Producto(Long id, String nombre, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }
}
