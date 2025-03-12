import java.util.Scanner;

public class Tarea7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 0;
        int number;

        System.out.println("Ingresa la cantidad de números a comparar: ");
        int numbers = scan.nextInt();

        if (numbers < 10) {
            System.out.println("La cantidad de números debe ser 10 o más. Vuelve a intentarlo.");
            main(args);
        } else {

            for (int i = 0; i < numbers; i++) {
                System.out.println("Ingresa un número entero: ");
                number = scan.nextInt();

                if (i == 0)
                    min = number;

                min = min < number ? min : number;
            }

            if (min < 10) {
                System.out.println("El número " + min + " menor es menor que 10!");
            } else {
                System.out.println("El número " + min + " menor es mayor que 10!");
            }
        }
    }
}
