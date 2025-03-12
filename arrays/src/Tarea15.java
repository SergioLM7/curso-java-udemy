import java.util.Scanner;

public class Tarea15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[7];
        int totalPositives = 0;
        int totalNegatives = 0;
        int zeroNumbers = 0;
        double averagePositives;
        double averageNegatives;

        for(int i = 0; i < array.length; i++) {
            System.out.print("Ingresa un número: ");
            array[i] = sc.nextInt();
        }

        for(int i= 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                totalPositives += array[i];
            }

            if (array[i] == 0) {
                zeroNumbers ++;
            }
            totalNegatives += array[i];
        }

        averagePositives = (double)totalPositives / (array.length -1);
        averageNegatives = (double)totalNegatives / (array.length -1);

        System.out.println("Esta es la media de los números positivos: " + averagePositives +"\n" + "Esta es la media de los números negativos: " + averageNegatives + "\n" + "Este es el número de ceros: " + zeroNumbers);

    }
}
