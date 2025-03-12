import java.util.Scanner;

public class ProgramaManejoDeNombres {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nombre1;
        String nombre2;
        String nombre3;

        System.out.println("Introduce el nombre de un familiar: ");
        nombre1 = scan.nextLine();
        System.out.println("Introduce el nombre de un segundo familiar: ");
        nombre2 = scan.nextLine();
        System.out.println("Introduce el nombre de un tercer familiar: ");
        nombre3 = scan.nextLine();

        char char1 = nombre1.toUpperCase().charAt(1);
        String nombre1Formateado = char1 + "." + nombre1.charAt(nombre1.length() - 2) + nombre1.charAt(nombre1.length() -1);
        char char2 = nombre2.toUpperCase().charAt(1);
        String nombre2Formateado = char1 + "." + nombre2.charAt(nombre2.length() - 2) + nombre2.charAt(nombre2.length() -1);
        char char3 = nombre1.toUpperCase().charAt(1);
        String nombre3Formateado = char1 + "." + nombre3.charAt(nombre3.length() - 2) + nombre3.charAt(nombre3.length() -1);


        String finalFormat = nombre1Formateado.concat("_").concat(nombre2Formateado).concat("_").concat(nombre3Formateado);
        System.out.println(finalFormat);


    }
}
