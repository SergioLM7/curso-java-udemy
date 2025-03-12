public class EjemploStringInmutable {

    public static void main(String[] args) {
        String curso = "Curso de programación";
        String profesor = "Andrés Guzmán";
        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        //Flujo o stream con función Lambda
        String curso2 = curso.transform((c) -> {
            return c + " con " + profesor;
        });
        System.out.println("curso = " + curso);
        System.out.println("curso2 = " + curso2);

        String resultado3 = resultado.replace("a", "A");
        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);





    }
}
