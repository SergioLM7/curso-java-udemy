
package org.slillo.appfacturas;

import org.slillo.appfacturas.model.*;

import java.util.Scanner;

public class EjemploFacturas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente();
        cliente.setNif("562626A");
        cliente.setNombre("Sergio");

        System.out.print("Ingrese la descripción de la factura: ");
        String desc = sc.nextLine();

        Factura factura = new Factura(desc, cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        System.out.println();

        for(int i = 0; i < 2; i++) {
            producto = new Producto();
            System.out.print("Ingrese el producto nº " + producto.getIdProducto() + ": ");
            nombre = sc.next();
            producto.setNombre(nombre);

            System.out.print("Ingrese el precio: ");
            precio = sc.nextFloat();
            producto.setPrecio(precio);

            System.out.print("Ingrese la cantidad: ");
            cantidad = sc.nextInt();

            ItemFactura item = new ItemFactura(producto, cantidad);

            factura.addItemFactura(item);

            System.out.println();
            sc.nextLine();
        }

        System.out.println(factura);

    }

}
