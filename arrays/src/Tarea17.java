import java.util.Scanner;

public class Tarea17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[12];
        int[] arrayFreq = new int[6];

        for(int i = 0; i < array.length; i++) {
            System.out.print("Ingresa un número (del 1 al 6, inclusive): ");
            array[i] = sc.nextInt();
            arrayFreq[array[i] - 1]++;
        }

        System.out.println("Este es el historiograma: ");

        for(int i = 0; i < arrayFreq.length; i++) {
            System.out.print((i+1) + ": " );
            for(int j = 0; j < arrayFreq[i]; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}

