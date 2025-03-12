public class PrimitivosFloat {
    static float varFLotante;
    public static void main(String[] args) {

        //E o e seguido de número para elevar a X el número previo
        float realFloat = 2.12E-3f;
        System.out.println("Este es el float: " + realFloat);
        System.out.println("Tipo float corresponde en bytes a: " + Float.BYTES);
        System.out.println("Tipo float corresponde en bites a: " + Float.SIZE);
        System.out.println("Valor máximo de un float: " + Float.MAX_VALUE);
        System.out.println("Valor mínimo de un float: " + Float.MIN_VALUE);

        double realDouble = 2.12E50;
        System.out.println("Este es el double: " + realDouble);
        System.out.println("Tipo double corresponde en bytes a: " + Double.BYTES);
        System.out.println("Tipo double corresponde en bites a: " + Double.SIZE);
        System.out.println("Valor máximo de un double: " + Double.MAX_VALUE);
        System.out.println("Valor mínimo de un double: " + Double.MIN_VALUE);

        //Va a ser de tipo double por defecto si tiene un punto, salvo que se lo indiquemos con la f final
        var varFloat = 3.1231241;

        System.out.println("Esta es la variable con su valor primitivo: " + varFLotante);


    }
}
