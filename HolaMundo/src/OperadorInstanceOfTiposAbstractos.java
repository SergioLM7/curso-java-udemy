public class OperadorInstanceOfTiposAbstractos {

    public static void main(String[] args) {

        Object texto = "Creando un objeto de la clase String... ";
        Object numero = Integer.valueOf(7); // 7

        Boolean b1 = texto instanceof String;
        System.out.println("¿Texto es del tipo String? " + b1);

        b1 = texto instanceof Object;
        System.out.println("¿Texto es del tipo Object? " + b1);

        b1 = texto instanceof Integer;
        System.out.println("¿Texto es del tipo Integer? " + b1);

        b1 = numero instanceof Integer;
        System.out.println("¿Numero es del tipo Integer? " + b1);

        b1 = numero instanceof Number;
        System.out.println("¿Numero es del tipo Number? " + b1);

        b1 = numero instanceof Double;
        System.out.println("¿Numero es del tipo Double? " + b1);
    }
}
