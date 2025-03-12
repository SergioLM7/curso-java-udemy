package org.slillo.appfacturas.model;

public class Producto {

    private int idProducto;
    private float precio;
    private String nombre;
    private static int ultimoId;

    public Producto() {
        this.idProducto = ++ultimoId;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return idProducto + "\t" + nombre + "\t" + precio;
    }
}
