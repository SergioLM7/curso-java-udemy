package org.slillo.patrones.factory.ejemplo;

import org.slillo.patrones.factory.PizzaProducto;
import org.slillo.patrones.factory.PizzeriaCaliforniaFactory;
import org.slillo.patrones.factory.PizzeriaNYFactory;
import org.slillo.patrones.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    enum Tipo {
       VEGETARIANA("vegetariana"),
        PEPERONI("peperoni"),
        QUESO("queso"),
        ITALIANA("italiana");

        private String nombre;

        private Tipo(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return this.nombre;
        }
    };

    public static void main(String[] args) {



        PizzeriaZonaAbstractFactory ny = new PizzeriaNYFactory();
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = california.ordenarPizza(Tipo.VEGETARIANA.getNombre());
        System.out.println("Bruce pide la pizza " + pizza.getNombre());

        PizzaProducto pizza2 = ny.ordenarPizza(Tipo.PEPERONI.getNombre());
        System.out.println("Juan pide la pizza " + pizza2.getNombre());

        pizza2 = ny.ordenarPizza(Tipo.VEGETARIANA.getNombre());
        System.out.println("Sergio pide la pizza " + pizza2.getNombre());

        pizza = california.ordenarPizza(Tipo.QUESO.getNombre());
        System.out.println("Ana pide la pizza " + pizza.getNombre());

        System.out.println("Pizza = " + pizza);

    }
}
