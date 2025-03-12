import java.util.Scanner;

public class Tarea5 {
    final double fullTank = 70.00;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double currentFuel;

        System.out.println("¿Qué capacidad tiene actualmente el depósito? ");
        currentFuel = scan.nextDouble();

        if (currentFuel == 70) {
            System.out.println("Tanque lleno");
        } else if (currentFuel >= 60 && currentFuel < 70) {
            System.out.println("Tanque casi lleno");
        } else if (currentFuel >= 40 && currentFuel < 60) {
            System.out.println("Tanque 3/4");
        } else if (currentFuel >= 35 && currentFuel < 40) {
            System.out.println("Medio tanque");
        } else if (currentFuel > 20 && currentFuel < 35) {
            System.out.println("Suficiente");
        } else if (currentFuel >= 1 && currentFuel < 20) {
            System.out.println("Insuficiente");
        } else {
            System.out.println("Esa cifra no es válida. La capacidad del tanque va de 1 a 70 litros, inclusive");
            main(args);
        }
    }
}
