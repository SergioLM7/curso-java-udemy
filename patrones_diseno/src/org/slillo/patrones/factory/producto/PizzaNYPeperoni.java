package org.slillo.patrones.factory.producto;

import org.slillo.patrones.factory.PizzaProducto;

public class PizzaNYPeperoni extends PizzaProducto {

    public PizzaNYPeperoni() {
        super();
        nombre = "Pizza peperoni Nueva York";
        masa="Masa fina a la piedra";
        salsa="Salsa de tomate";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Extra de peperoni");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cortarPizza() {
        System.out.println("Cortando la pizza en porciones triangulares...");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando durante 40 min a 90ºC...");
    }
}
