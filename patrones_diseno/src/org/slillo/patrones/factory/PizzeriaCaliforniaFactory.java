package org.slillo.patrones.factory;

import org.slillo.patrones.factory.producto.PizzaCaliforniaPeperoni;
import org.slillo.patrones.factory.producto.PizzaCaliforniaQueso;
import org.slillo.patrones.factory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "queso" -> new PizzaCaliforniaQueso();
            case "peperoni" -> new PizzaCaliforniaPeperoni();
            case "vegetariana" -> new PizzaCaliforniaVegetariana();
            default -> null;
        };
    }
}
