public class PasarPorValor {

    public static void main(String[] args) {

        int i = 10;

        System.out.println("Iniciamos el main con i = " + i);
        test(i);
        System.out.println("Finaliza el método main con el valor de i = " + i);
    }

    public static void test(int i) {
        System.out.println("Iniciamos el método test con i = " + i);
        i = 35;
        System.out.println("El nuevo valor de i en el método test =  " + i);

    }
}
