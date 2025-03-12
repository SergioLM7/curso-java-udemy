import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        String nombreFactura;
        double precio1;
        double precio2;
        double total;
        double impuesto;
        double totalNeto;


        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce el nombre de la factura: ");
        try {
            nombreFactura = scan.nextLine();
            System.out.println("Introduce el valor del primer producto: ");
            try {
                precio1 = scan.nextDouble();
                System.out.println("Introduce el valor del segundo producto: ");
                try {
                    precio2 = scan.nextDouble();
                    total = precio1 + precio2;
                    impuesto = total * 0.19;
                    totalNeto = impuesto + total;

                    System.out.printf("La factura %s tiene un total bruto de %s, con un impuesto de %s y el total neto después del impuesto es de %s", nombreFactura, total, impuesto, totalNeto);

                } catch (Exception e) {
                    System.out.println("El valor del precio tiene que ser decimal.");
                    main(args);
                    System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("El valor del precio tiene que ser decimal.");
                main(args);
                System.exit(0);
            }
        } catch (Exception e) {
            System.out.println("El nombre de la factura debe ser una cadena de texto ");
            main(args);
            System.exit(0);
        }


       }
}
