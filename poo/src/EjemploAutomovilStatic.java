public class EjemploAutomovilStatic {

    public static void main(String[] args) {

        Automovil.setCapacidadTanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setColor(Color.BLANCO);
        subaru.setMotor(new Motor(3.0, TipoMotor.GASOLINA));
        subaru.setTipo(Tipo.HATCHBACK);
        subaru.setTanque(new Tanque());


        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(2.3, TipoMotor.GASOLINA));
        mazda.setTipo(Tipo.PICKUP);

        System.out.println("Mazda fabricante = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(2.0, TipoMotor.DIESEL), new Tanque(65));
        nissan.setTipo(Tipo.PICKUP);

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.NARANJA,  new Motor(2.0, TipoMotor.DIESEL), new Tanque(65));
        nissan2.setTipo(Tipo.PICKUP);


        Automovil.setColorPatente(Color.AZUL);

        Automovil auto = new Automovil();


        System.out.println(subaru.verDetalles());
        System.out.println(mazda.verDetalles());
        System.out.println(nissan.verDetalles());
        System.out.println(nissan2.verDetalles());


        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("Automovil.calcularConsumoEstatico() = " + Automovil.calcularConsumoEstatico(300, 60));

        Tipo tipoSubaru = subaru.getTipo();
        System.out.println("Tipo Subaru: " + tipoSubaru.getNombre());
        System.out.println("Descripción Subaru: " + tipoSubaru.getDescripcion());

        System.out.println(mazda.calcularConsumo(300, 60));

    }
}
