package org.slillo.patrones.factory;

import java.util.ArrayList;
import java.util.List;

abstract public class PizzaProducto {

    protected String nombre;
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;

    public PizzaProducto() {
        this.ingredientes = new ArrayList<>();

    }

    public void preparar() {
        System.out.println("Preparando la pizza " + this.nombre);
        System.out.println("Seleccionando la masa " + this.masa);
        System.out.println("Agregano la salsa " + this.salsa);
        System.out.println("Agregando ingredientes ");
        this.ingredientes.forEach(System.out::println);
    }

    abstract public void cortarPizza();

    abstract public void cocinar();

    public void empaquetar() {
        System.out.println("Metiendo la pizza en una caja de cartón...");
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "PizzaProducto{" +
                "nombre='" + nombre + '\'' +
                ", masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
