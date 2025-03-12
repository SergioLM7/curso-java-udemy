package org.slillo.patrones.factory.producto;

import org.slillo.patrones.factory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {

    public PizzaCaliforniaQueso() {
        super();
        nombre = "Pizza de queso de California";
        masa = "Masa con bordes de queso";
        salsa = "Salsa de tomate con carne";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Extra de cebolla");
        ingredientes.add("Aceitunas");
        ingredientes.add("Queso azul");
    }

    @Override
    public void cortarPizza() {
        System.out.println("Cortando en pequeños triángulos...");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando en 35 min a 130ºC...");

    }
}
