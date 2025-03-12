public class EjemploStringConcatenacion {

    public static void main(String[] args) {
        String curso = "Curso de programación";
        String profesor = "Andrés Guzmán";

        String detalleCurso = curso + " con el instructor " + profesor;
        System.out.println(detalleCurso);

        int a = 10;
        int b = 5;

        System.out.println(detalleCurso + " " + (a + b));
        System.out.println(a+b + " " + detalleCurso);

        String detalleCurso2 = curso.concat(" ".concat(profesor));
        System.out.println(detalleCurso2);
    }
}
