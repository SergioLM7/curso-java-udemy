import java.util.Scanner;

public class OperadorTernarioMayor {

    public static void main(String[] args) {

        int max = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa un número: ");
        int numero1 = scan.nextInt();
        System.out.println("Ingresa un segundo número: ");
        int numero2 = scan.nextInt();
        System.out.println("Ingresa un tercer número: ");
        int numero3 = scan.nextInt();

        max = (numero1 > numero2) ? numero1 : numero2;
        max = (max > numero3) ? max : numero3;

        System.out.println("Numero 1: " + numero1);
        System.out.println("Numero 2: " + numero2);
        System.out.println("Numero 3: " + numero3);
        System.out.println("Máximo: " + max);



    }
}
