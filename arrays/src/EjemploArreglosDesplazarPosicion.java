import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion {
    public static void main(String[] args) {

        int[] a = new int[10];
        int ultimo;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < a.length; i++) {
            System.out.print("Ingrese el número: ");
            a[i] = sc.nextInt();
        }
        System.out.println();

        ultimo = a[a.length - 1];

        for(int i= a.length-2; i >= 0; i--) {
            a[i + 1] = a[i];
        }

        a[0] = ultimo;

        System.out.println("El arrelgo final es este: ");
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
