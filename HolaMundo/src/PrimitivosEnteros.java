public class PrimitivosEnteros {

    public static void main(String[] args) {

        byte numeroByte = 9;
        System.out.println("Este es el byte: " + numeroByte);
        System.out.println("Tipo byte corresponde en bytes a: " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a: " + Byte.SIZE);
        System.out.println("Valor máximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un byte: " + Byte.MIN_VALUE);


        short shortNum = 3800;
        System.out.println("Este es el short: " + shortNum);
        System.out.println("Tipo short corresponde en bytes a: " + Short.BYTES);
        System.out.println("Tipo short corresponde en bites a: " + Short.SIZE);
        System.out.println("Valor máximo de un short: " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de un short: " + Short.MIN_VALUE);

        int intNumber = 32671;
        System.out.println("Este es el int: " + intNumber);
        System.out.println("Tipo int corresponde en bytes a: " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a: " + Integer.SIZE);
        System.out.println("Valor máximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un int: " + Integer.MIN_VALUE);

        //L para convertir la literal a tipo long por defecto (ES OBLIGATORIO PARA REPRESENTAR UN LONG)
        long longNumber = 9223372036854775807L;
        System.out.println("Este es el long: " + longNumber);
        System.out.println("Tipo long corresponde en bytes a: " + Long.BYTES);
        System.out.println("Tipo long corresponde en bites a: " + Long.SIZE);
        System.out.println("Valor máximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de un long: " + Long.MIN_VALUE);

        // Siempre va a ser un integer salvo que pase al rango de Long
        var variableData =127;

    }
}
