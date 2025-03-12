import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3 {
    public static void main(String[] args) {

        int[] a = new int[7];
        int numero, posicion;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < a.length - 1; i++) {
            System.out.print("Ingrese el número: ");
            a[i] = sc.nextInt();
        }
        System.out.println();

        System.out.println("Introduzca el elemento a añadir a nuestra lista: ");
        numero = sc.nextInt();

        posicion = 0;

        while(posicion < a.length -1 && numero > a[posicion]) {
            posicion++;
        }

        for(int i = a.length -1; i >= posicion; i--) {
            a[i] = a[i - 1];
        }

        a[posicion] = numero;


        System.out.println("El arrelgo final es este: ");
        for(int i = 0; i < a.length; i++) {
            System.out.println("Índice " + i + " ==> " + a[i]);
        }

    }
}
