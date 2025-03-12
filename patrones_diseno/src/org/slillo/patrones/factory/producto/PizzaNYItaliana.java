package org.slillo.patrones.factory.producto;

import org.slillo.patrones.factory.PizzaProducto;

public class PizzaNYItaliana extends PizzaProducto {

    public PizzaNYItaliana() {
        super();
        nombre="Pizza italiana Nueva York";
        masa="Masa gruesa";
        salsa = "Carbonara";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Jamón");
        ingredientes.add("Champiñones");
    }

    @Override
    public void cortarPizza() {
        System.out.println("Cortando la pizza en triángulos grandes...");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando durante 30 min a 100ºC...");
    }
}
