public class OperadorInstanceOf {

    public static void main(String[] args) {

        String texto = "Creando un objeto de la clase String... ";
        Integer numero = 7;

        Boolean b1 = texto instanceof String;
        System.out.println("¿Texto es del tipo String? " + b1);

        b1 = numero instanceof Integer;
        System.out.println("¿Numero es del tipo Integer? " + b1);

        b1 = numero instanceof Number;
        System.out.println("¿Numero es del tipo Number? " + b1);
    }
}
