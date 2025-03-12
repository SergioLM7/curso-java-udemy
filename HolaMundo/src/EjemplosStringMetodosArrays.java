public class EjemplosStringMetodosArrays {

    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] array = trabalenguas.toCharArray();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
        System.out.println("trabalenguas = " + trabalenguas.split("a"));

        String[] array2 = trabalenguas.split("a");

        for (int j = 0; j < array2.length; j++) {
            System.out.println(array2[j]);
        }

        String archivo = "alguna_imagen.json";
        String[] archivoArr = archivo.split("[.]"); // también se podría utilizar "\\."

        for (int j = 0; j < archivoArr.length; j++) {
            System.out.println(archivoArr[j]);
        }

        int l = archivoArr.length;
        System.out.println("Extensión del archivo: " + archivoArr[l-1]);

    }
}
