public class EjemploAutomovilRelacionesObjetos {

    public static void main(String[] args) {


        Persona conductorSubaru = new Persona("Lucy", "Martínez");
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setColor(Color.BLANCO);
        subaru.setMotor(new Motor(3.0, TipoMotor.GASOLINA));
        subaru.setTipo(Tipo.HATCHBACK);
        subaru.setTanque(new Tanque());
        subaru.setConductor(conductorSubaru);
        //subaru.setRuedas(ruedasSubaru);
        Rueda[] ruedasSubaru = new Rueda[5];
        for(int i = 0; i< ruedasSubaru.length; i++) {
            subaru.addRueda(new Rueda("Yokohama", 16, 7.5));
        }


        Persona conductorMazda = new Persona("Pato", "Rodríguez");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(2.3, TipoMotor.GASOLINA));
        mazda.setTipo(Tipo.PICKUP);
        mazda.setConductor(conductorMazda);
        //mazda.setRuedas(ruedasMazda);
        Rueda[] ruedasMazda = new Rueda[5];
        for(int i= 0; i<ruedasMazda.length; i++) {
            mazda.addRueda(new Rueda("Michelin", 18, 10.5));
        }

        Persona conductorNissan = new Persona("Bea", "González");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(2.0, TipoMotor.DIESEL), new Tanque(65));
        nissan.setConductor(conductorNissan);
        nissan.setTipo(Tipo.PICKUP);
        //METODO ENCADENADO
        nissan.addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5));


        Persona conductorNissan2 = new Persona("Jorge", "Ramos");
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.NARANJA,  new Motor(2.0, TipoMotor.DIESEL), new Tanque(65));
        nissan2.setConductor(conductorNissan2);
        nissan2.setTipo(Tipo.PICKUP);

        Automovil.setColorPatente(Color.AZUL);

        Automovil auto = new Automovil();

        System.out.println(subaru.verDetalles());
        System.out.println(mazda.verDetalles());
        System.out.println(nissan.verDetalles());
        System.out.println(nissan2.verDetalles());

        /*System.out.println("Conductor Subaru: " + subaru.getConductor());
        System.out.println("Ruedas Subaru: ");
        for(Rueda rueda : subaru.getRuedas()) {
            System.out.println(rueda.getFabricante() + ", llanta: " + rueda.getLlanta() + ", ancho: " + rueda.getAncho());
        }*/

    }
}
