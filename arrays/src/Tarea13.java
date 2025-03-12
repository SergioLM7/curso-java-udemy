import java.util.Scanner;

public class Tarea13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        for(int i = 0; i< a.length; i++) {
            System.out.print("Ingrese un número: ");
            a[i] = sc.nextInt();
        }

        System.out.println();

        for(int i = a.length - 1, j = 0; i >= (a.length / 2) && j <= (a.length /2); i--, j++) {

            if (i == j) {
                System.out.println("Este es el elemento: " + i + " ==> " + a[i]);
                break;
            }
            System.out.println("Este es el elemento: " + i + " ==> " + a[i]);
            System.out.println("Este es el elemento: " + j + " ==> " + a[j]);


        }

    }
}
