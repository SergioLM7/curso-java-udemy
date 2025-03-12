public class EjemploStringValidar {

    public static void main(String[] args) {

        String curso = null;

        boolean esNulo = curso == null;
        System.out.println("¿Es nulo? " + esNulo);

        if(esNulo) {
            curso = "  ";
        }

        boolean esVacio = curso.length() == 0;
        boolean esVacio2 = curso.isEmpty();

        boolean esVacio3 = curso.isBlank();

        if(!esVacio3) {
            System.out.println(curso.toLowerCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }

    }
}
