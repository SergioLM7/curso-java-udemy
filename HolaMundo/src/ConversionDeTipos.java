public class ConversionDeTipos {

    public static void main(String[] args) {
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("Numero int: " + numeroInt);

        String realStr = "98765.43E-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("Numero double: " + realDouble);

        String logicoStr = "true";
        //Solo vale para true o false en todas sus modalidades, mayúsculas o minúsculas, incluso con True o False
        //Porque el método parseBoolean ejecuta por dentro un equalsIgnoreCase().
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("Booleano : " + logicoBoolean);


        int otroNumeroInt = 100;
        System.out.println("Otro número int: " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("Otro número String: " + otroNumeroStr );

        otroNumeroStr = String.valueOf(otroNumeroInt + 10);
        System.out.println("Otro número String: " + otroNumeroStr);

        double otroDoble = 34.5;
        String otroRealStr = Double.toString(otroDoble);
        System.out.println("Otro número Double: " + otroRealStr);

        otroRealStr = String.valueOf(1.23456f);
        System.out.println("Otro número Float: " + otroRealStr);

        int i = 32769;
        short s = (short) i;
        System.out.println("Este es el i: " + i );
        System.out.println("Este es el s: " + s);
        System.out.println(Short.MAX_VALUE);

        //Convierte al caracter Unicode de ese int
        char b = (char) i;
        System.out.println("Este es el char b: " + b);

        float f = (float) i;
        System.out.println("Este es el float f: " + f);


    }
}
