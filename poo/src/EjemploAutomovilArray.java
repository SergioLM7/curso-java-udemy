import java.util.Arrays;

public class EjemploAutomovilArray {

    public static void main(String[] args) {


        Persona conductorSubaru = new Persona("Lucy", "Martínez");
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setColor(Color.BLANCO);
        subaru.setMotor(new Motor(3.0, TipoMotor.GASOLINA));
        subaru.setTipo(Tipo.HATCHBACK);
        subaru.setTanque(new Tanque());
        subaru.setConductor(conductorSubaru);

        Persona conductorMazda = new Persona("Pato", "Rodríguez");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(2.3, TipoMotor.GASOLINA));
        mazda.setTipo(Tipo.PICKUP);
        mazda.setConductor(conductorMazda);

        Persona conductorNissan = new Persona("Bea", "González");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(2.0, TipoMotor.DIESEL), new Tanque(65));
        nissan.setConductor(conductorNissan);
        nissan.setTipo(Tipo.PICKUP);

        Persona conductorSuzuki = new Persona("Jorge", "Ramos");
        Automovil suzuki = new Automovil("Suzuki", "Vitara", Color.BLANCO,  new Motor(2.0, TipoMotor.DIESEL), new Tanque(65));
        suzuki.setConductor(conductorSuzuki);
        suzuki.setTipo(Tipo.SUV);

        Automovil.setColorPatente(Color.AZUL);
        Automovil audi = new Automovil("Audi", "A3");
        Persona conductorAudi = new Persona("Pepe", "Domínguez");
        audi.setConductor(conductorAudi);

        Automovil[] coches = new Automovil[5];
        coches[0] = subaru;
        coches[1] = mazda;
        coches[2] = nissan;
        coches[3] = suzuki;
        coches[4] = audi;

        Arrays.sort(coches);
        for (Automovil coche : coches) {
            System.out.println(coche);
        }

    }
}
