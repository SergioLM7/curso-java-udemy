public class PrimitivosBoolean {
    public static void main(String[] args) {


        boolean datoLogico = true;
        System.out.println("Este es el booleano: " + datoLogico);

        double numDouble = 42.334E2;
        System.out.println("double= " + numDouble);
        float numFloat = 2312.23E3f;
        System.out.println("float= " + numFloat);


        datoLogico = numFloat > numDouble;
        System.out.println("Este es el booleano tras la comparación: " + datoLogico);

    }
}
