import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Para mostrar un recuadro de input en pantalla (NO en consola)
        System.out.println("Ingrese un número entero...");

        int numeroDecimal = 0;

        try {
            numeroDecimal = scan.nextInt();
        } catch (InputMismatchException error) {
            System.out.println("Error, debe ingresar un número entero.");
            //Ejecutamos de manera recursiva el metodo main
            main(args);
            System.exit(0);
        }

        String resultadoBinario = "Este es el numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "Este es el numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String resultadoHex = "Este es el numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;
        System.out.println(mensaje);
    }
}
