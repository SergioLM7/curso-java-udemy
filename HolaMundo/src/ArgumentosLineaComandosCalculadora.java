public class ArgumentosLineaComandosCalculadora {
    public static void main(String[] args) {
        if(args.length != 3) {
            System.out.println("Por favor, ingresa una operación (suma, resta, div o multi) y dos números enteros");
            System.exit(-1);
        }
        String operacion = args[0];
        int a = 0;
        int b = 0;
        double resultado = 0.00;

        try {
            a = Integer.parseInt(args[1]);
            b= Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.err.println("Cuidado, a y b deben ser enteros. Vuelva ai intentarlo.");
            System.exit(-1);
        }
        
        switch (operacion) {
            case "suma" -> resultado = a+b;
            case "resta" -> resultado = a-b;
            case "mult"-> resultado = a*b;
            case "div" -> {
                if (b==0) {
                    System.out.println("No se puede dividir entre 0");
                    System.exit(-1);
                } else {
                    resultado = (double) a / b;
                }
            }
            default -> resultado = a+b;

        }

        System.out.println("Resultado de la operación " + operacion + " es = " + resultado);
    }
}
