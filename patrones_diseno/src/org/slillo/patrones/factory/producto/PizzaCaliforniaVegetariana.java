package org.slillo.patrones.factory.producto;

import org.slillo.patrones.factory.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {

    public PizzaCaliforniaVegetariana() {
        super();
        nombre = "Pizza vegetariana de California";
        masa = "Masa fina light";
        salsa = "Salsa barbacoa";
        ingredientes.add("Queso edam");
        ingredientes.add("Pepinillos");
        ingredientes.add("Espinacas");
        ingredientes.add("Cebolla");
        ingredientes.add("Calabacín");
    }

    @Override
    public void cortarPizza() {
        System.out.println("Cortando en trozos rectangulares.");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinar durante 20 min a 180ºC.");
    }
}
