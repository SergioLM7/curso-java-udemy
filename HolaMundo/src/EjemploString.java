public class EjemploString {

    public static void main(String[] args) {
        String curso = "Curso de programación";
        String cursoConstructor = new String("Curso de programación");

        boolean esIgual = curso == cursoConstructor;
        System.out.println("¿Son iguales curso y cursoConstructor? " + esIgual);

        esIgual = curso.equals(cursoConstructor);
        System.out.println("¿Son iguales los valores curso y cursoConstructor? " + esIgual);
        esIgual = curso.equalsIgnoreCase(cursoConstructor);
        System.out.println("¿Son iguales los valores curso y cursoConstructor? " + esIgual);

        //Para ahorrar recursos, si la declaración es por valor (creación implícita), asigna la misma instancia de memoria a curso que a curso3
        //mismo objeto que se guarda en distintas variables
        String curso3 = "Curso de programación";
        esIgual = curso == curso3;
        System.out.println("¿Son iguales los valores curso y curso3? " + esIgual);

    }
}
