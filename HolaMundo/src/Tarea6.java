import javax.swing.*;

public class Tarea6 {
    public static void main(String[] args) {

        String max;

        String nameSurname = JOptionPane.showInputDialog(null, "Ingresa el nombre y primer apellido del miembro 1: ");
        String nameSurname2 = JOptionPane.showInputDialog(null, "Ingresa el nombre y primer apellido del miembro 2: ");
        String nameSurname3 = JOptionPane.showInputDialog(null, "Ingresa el nombre y primer apellido del miembro 3: ");

        String[] member1 = nameSurname.split(" ");
        String[] member2 = nameSurname2.split(" ");
        String[] member3 = nameSurname3.split(" ");

        max = member1[0].length() > member2[0].length() ? member1[0] : member2[0] ;
        max = max.length() > member3[0].length() ? max : member3[0];

        JOptionPane.showMessageDialog(null, "El nombre más largo es ".concat(max));

    }
}
