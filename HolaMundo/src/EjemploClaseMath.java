public class EjemploClaseMath {
    public static void main(String[] args) {

        int enteroAbsoluto = Math.abs(-3);
        System.out.println("Valor absoluto de un entero = " + enteroAbsoluto);

        double max = Math.max(3.5, 1.2);
        System.out.println("Valor máximo = " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("Valor mínimo = " + min);

        double techo = Math.ceil(7.52);
        System.out.println("Redondeo al siguiente valor entero = " + techo);

        double bajo = Math.floor(7.52);
        System.out.println("Redondeo al anterior valor entero = " + bajo);

        long redondeo = Math.round(7.52);
        System.out.println("Redondeo al valor entero más cercano = " + redondeo);

        double exp = Math.exp(1);
        System.out.println("Constante e = " + exp);

        double log = Math.log(10);
        System.out.println("Logaritmo natural = " + log);

        double potencia = Math.pow(10, 3); //10 elevado a 3
        System.out.println("Potencia = " + potencia);

        double raizCuadrada = Math.sqrt(5); // Raíz cuadrada
        System.out.println("Raíz Cuadrada = " + raizCuadrada);

    }
}
