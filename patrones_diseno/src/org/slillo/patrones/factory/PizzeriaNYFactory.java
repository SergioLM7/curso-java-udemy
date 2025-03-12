package org.slillo.patrones.factory;

import org.slillo.patrones.factory.producto.PizzaNYItaliana;
import org.slillo.patrones.factory.producto.PizzaNYPeperoni;
import org.slillo.patrones.factory.producto.PizzaNYVegetariana;

public class PizzeriaNYFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
       return switch (tipo) {
            case "vegetariana" -> new PizzaNYVegetariana();
            case "peperoni" -> new PizzaNYPeperoni();
            case "italiana" -> new PizzaNYItaliana();
           default -> null;
        };
    }
}
