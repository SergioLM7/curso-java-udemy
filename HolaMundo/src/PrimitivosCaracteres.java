public class PrimitivosCaracteres {

    public static void main(String[] args) {

        char newChar = '\u0040';
        char decimal = 64;
        System.out.println("Este es el char: " + newChar);
        System.out.println("Este es el char en decimal: " + decimal);
        System.out.println("¿Decimal es igual newChar? " + (newChar == decimal));

        char symbol = '@';
        System.out.println("Este es el char en símbolo: " + symbol);
        System.out.println("¿Decimal es igual newChar? " + (symbol == decimal));


        char espacio = '\u0020';
        //Es el caracter de retroceso, elimina el char anterior
        char retroceso = '\b';
        char tabulador = '\t';
        //Salto de linea
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("Este es el char:" + espacio + symbol + System.lineSeparator());
        System.out.println("Tipo char corresponde en bytes a: " + Character.BYTES);
        System.out.println("Tipo char corresponde en bites a: " + Character.SIZE );
        System.out.println("Valor máximo de un char: " + Character.MAX_VALUE);
        System.out.println("Valor mínimo de un char: " + Character.MIN_VALUE);

    }
}
