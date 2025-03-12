package org.slillo.patrones.factory.producto;

import org.slillo.patrones.factory.PizzaProducto;

public class PizzaNYVegetariana extends PizzaProducto {

    public PizzaNYVegetariana() {
        super();
        nombre = "Pizza vegetariana de Nueva York";
        masa = "Masa integral vegana";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso vegano");
        ingredientes.add("Tomate");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Berenjenas");
    }

    @Override
    public void cortarPizza() {
        System.out.println("Cortando la pizza en porciones cuadradas....");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando durante 25 min a 200ºC...");
    }
}
