import java.util.Scanner;

public class Tarea14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[7];
        int mayor = 0;

        for(int i = 0; i < array.length; i++) {
            System.out.print("Ingrese un número: ");
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < array.length; i ++) {
            if (array[i] >= mayor)
                mayor = array[i];
        }

        System.out.println("Este es el número más alto del array: " + mayor);

    }
}
