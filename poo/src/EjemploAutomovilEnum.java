public class EjemploAutomovilEnum {

    public static void main(String[] args) {

        Automovil.setCapacidadTanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setColor(Color.BLANCO);
        subaru.setMotor(new Motor(3.0, TipoMotor.GASOLINA));
        subaru.setTanque(new Tanque());
        subaru.setTipo(Tipo.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(2.3, TipoMotor.GASOLINA));
        mazda.setTipo(Tipo.PICKUP);
        mazda.setTanque(new Tanque(55));

        System.out.println("Mazda fabricante = " + mazda.getFabricante());

        Tipo tipo = subaru.getTipo();
        System.out.println("Tipo Subaru: " + tipo.getNombre());
        System.out.println("Descripción Subaru: " + tipo.getDescripcion());

        tipo = mazda.getTipo();
        switch (tipo) {
            case CONVERTIBLE -> System.out.println("El auomóvil es un deportivo y descapotable de dos puertas.");
            case COUPE -> System.out.println("El auomóvil es un coche pequeño de dos puertas y típicamente deportivo.");
            case FURGON -> System.out.println("Es un automóvil utilitario de transporte, de empresas.");
            case HATCHBACK -> System.out.println("Es un coche mediano con aspecto deportivo.");
            case PICKUP -> System.out.println("Es un coche de doble cabina o camioneta");
            case SEDAN -> System.out.println("Es un coche mediano.");
            case SUV -> System.out.println("Es un todoterreno deportivo.");
            case ST -> System.out.println("Es un coche más grande con un maletero amplio.");
        }

        Tipo[] tipos = Tipo.values();
        for(Tipo ta : tipos) {
            System.out.print(ta + " =>" + ta.name() + ", " + ta.getNombre() + ", " + ta.getDescripcion() + ", " + ta.getNumeroPuertas() + "\n");
        }

    }
}
