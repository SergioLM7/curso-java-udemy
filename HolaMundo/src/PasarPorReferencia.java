public class PasarPorReferencia {

    public static void main(String[] args) {

        int[] edad = {10, 11, 12};

        System.out.println("Iniciamos el main ");

        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Antes de invocar al método test");

        test(edad);

        System.out.println("Después de invocar al método test");

        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad[i] = " + edad[i]);
        }

        System.out.println("Finalizamos el método main con los datos del array modificados");
    }

    public static void test(int[] edadArray) {
        System.out.println("Iniciamos el método test");

        for(int j = 0; j < edadArray.length; j++) {
            edadArray[j]+=20;
        }
        System.out.println("Finalizamos el método test");

    }
}
