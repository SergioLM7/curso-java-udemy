public class EjemplosStringMetodos {

    public static void main(String[] args) {

        String nombre = "Sergio";

        System.out.println("nombre.length = " + nombre.length());
        System.out.println("nombre.toLowerCase = " + nombre.toLowerCase());
        System.out.println("nombre.toUpperCase = " + nombre.toUpperCase());
        System.out.println("nombre.equals(\"Sergio\") = " + nombre.equals("Sergio"));
        System.out.println("nombre.equalsIgnoreCase(\"Sergio\") = " + nombre.equalsIgnoreCase("sergio"));
        System.out.println("nombre.compareTo(\"Sergio\") = " + nombre.compareTo("Sergio"));
        System.out.println("nombre.charAt = " + nombre.charAt(2));
        System.out.println("nombre.charAt.length()-1 = " + nombre.charAt(nombre.length() - 1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,3) = " + nombre.substring(1, 3));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(target, reemplazo) = " + trabalenguas.replace('a', '.'));
        System.out.println("trabalenguas.indexOf() = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf() = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.lastIndexOf() = " + trabalenguas.lastIndexOf('z'));
        System.out.println("trabalenguas.contains() = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith() = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith() = " + trabalenguas.endsWith("as"));

        System.out.println("  trabalenguas  ".trim());


    }
}
