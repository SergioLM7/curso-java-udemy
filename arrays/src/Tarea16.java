import java.util.Scanner;

public class Tarea16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int maxCount = 0;
        int maxFreq = 0;

        for(int i = 0; i < array.length; i++) {
            System.out.print("Ingresa un número (del 1 al 9, inclusive: ");
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < array.length; i++) {
            int count = 0;
            for(int j = 0; j < array.length; j++) {
                if(array[i] == array[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxFreq = array[i];
            }
        }

        System.out.println("El número que más veces se repite es el " + maxFreq + ". Y lo hace un total de " + maxCount + " veces.");

    }
}
