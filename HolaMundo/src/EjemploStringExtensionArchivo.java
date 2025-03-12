public class EjemploStringExtensionArchivo {

    public static void main(String[] args) {

        String archivo = "alguna_imagen.json";
        int index = archivo.lastIndexOf(".");
        System.out.println("Posición del punto: " + index);
        System.out.println("Esta es la longitud de la cadena: " + archivo.length());
        System.out.println("Tipo de archivo: " + archivo.substring(index + 1));

    }
}
