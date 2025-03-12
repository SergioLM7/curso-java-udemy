import java.util.Scanner;

public class Tarea4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number1, number2, max;
        String finalPhrase = "";

        System.out.println("Introduce el primer número: ");
        number1 = scan.nextInt();
        System.out.println("Introduce el segundo número: ");
        number2 = scan.nextInt();

        max = number1 > number2 ? number1 : number2;

        if (max == number1) {
            System.out.println("El número ".concat(String.valueOf(max)).concat(" es").concat(" mayor que ").concat(String.valueOf(number2)));
        } else {
            System.out.println("El número ".concat(String.valueOf(max)).concat(" es").concat(" mayor que ").concat(String.valueOf(number1)));
        }
    }
}
