import javax.swing.*;

public class Tarea12 {
    public static void main(String[] args) {

        String radioInput = JOptionPane.showInputDialog(null, "Ingrese un valor para el radio de un círculo: ");
        double radio;
        double area;

        try {
            radio = Double.parseDouble(radioInput);
            area = Math.PI * (Math.pow(radio, 2));
            JOptionPane.showMessageDialog(null, "Esta es el área de un círculo de radio " + radio + " = " + area);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debes introducir un número válido. Vuelve a intentarlo.");
            main(args);
        }
    }
}
