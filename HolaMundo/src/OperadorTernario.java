public class OperadorTernario {

    public static void main(String[] args) {

        String variable = 7 == 12 ? "si es verdadero" : "si es falso";
        System.out.println("Variable: " + variable);

        String estado = "";
        double promedio = 6.2;

        estado = promedio >= 5.49 ? "aprobado" : "suspenso";
        System.out.println("Estado: " + estado);
    }
}
