class Persona {
    private String nombre;

    public void modificarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public String leerNombre() {
        return this.nombre;
    }
}

public class PasarPorReferencia2 {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Sergio");

        System.out.println("Iniciamos el main ");

        System.out.println("persona.nombre = " + persona.leerNombre());

        System.out.println("Antes de invocar al método test");

        test(persona);

        System.out.println("Después de invocar al método test");

        System.out.println("persona.nombre = " + persona.leerNombre());

        System.out.println("Finalizamos el método main con el objeto persona modificado");
    }

    public static void test(Persona persona) {
        System.out.println("Iniciamos el método test");

        persona.modificarNombre("Andrés");

        System.out.println("Finalizamos el método test");

    }
}
