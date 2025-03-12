import javax.swing.*;

public class SistemasNumericos {

    public static void main(String[] args) {
        //Para mostrar un recuadro de input en pantalla (NO en consola)
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int numeroDecimal = 0;

        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un número entero.");
            //Ejecutamos de manera recursiva el metodo main
            main(args);
            System.exit(0);
        }

        System.out.println("Este es el numero decimal: " + numeroDecimal);
        //Conversión a binario de un integer
        String mensajeBinario = "Este es el numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);

        int numeroBinario = 0b111110100;
        //Lo convierte a decimal
        System.out.println("Numero Binario: " + numeroBinario);
        String mensajeOctal = "Este es el numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);

        int numeroOctal = 0764;
        System.out.println("Numero Octal: " + numeroOctal);
        String mensajeHex = "Este es el numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHex);

        int numeroHex = 0x1f4;
        System.out.println("Numero Hexadecimal: " + numeroHex);

        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHex;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
