package org.slillo.patrones.factory.producto;

import org.slillo.patrones.factory.PizzaProducto;

public class PizzaCaliforniaPeperoni extends PizzaProducto {
    public PizzaCaliforniaPeperoni() {
        super();
        nombre = "Pizza peperoni California";
        masa="Masa gruesa";
        salsa="Salsa de tomate";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Extra de peperoni");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cortarPizza() {
        System.out.println("Cortando la pizza en porciones rectangulares...");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando durante 15 min a 220ºC...");
    }
}
