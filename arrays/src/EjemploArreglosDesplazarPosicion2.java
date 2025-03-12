import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2 {
    public static void main(String[] args) {

        int[] a = new int[10];
        int elemento, posicion;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < a.length - 1; i++) {
            System.out.print("Ingrese el número: ");
            a[i] = sc.nextInt();
        }
        System.out.println();

        System.out.println("Introduzca el elemento a añadir a nuestra lista: ");
        elemento = sc.nextInt();

        System.out.println("Introduzca la posición (0 a 9) donde agregar nuestro elemento: ");
        posicion = sc.nextInt();

        for(int i= a.length - 1; i > posicion; i--) {
            a[i] = a[i -1];
        }

        a[posicion] = elemento;

        System.out.println("El arrelgo final es este: ");
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}