import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Date;

public class EjemploAutomovil {

    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setColor(Color.BLANCO);
        subaru.setMotor(new Motor(3.0, TipoMotor.GASOLINA));
        subaru.setTanque(new Tanque());

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(2.3, TipoMotor.GASOLINA));
        mazda.setTanque(new Tanque(55));
        System.out.println("Mazda fabricante = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(2.0, TipoMotor.DIESEL), new Tanque(65));
        //        mazda.setTanque(new Tanque(55));
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.NARANJA,  new Motor(2.0, TipoMotor.DIESEL), new Tanque(65));
        Automovil auto = new Automovil();
        Date fecha = new Date();


        System.out.println(subaru.verDetalles());
        System.out.println(mazda.verDetalles());
        System.out.println(nissan.verDetalles());

        System.out.println(mazda.acelerar(1300));
        System.out.println(subaru.acelerarFrenar(1300));

        System.out.println("Litros por km: " + subaru.calcularConsumo(300, 0.6f));
        System.out.println("Litros por km: " + nissan.calcularConsumo(300, 60));

        System.out.println("¿Son iguales con equals sobrescrito? " + (nissan.equals(nissan2)));
        System.out.println("¿Son iguales? " + (nissan == nissan2));
        System.out.println("¿Son iguales? " + auto.equals(nissan));
        System.out.println("¿Son iguales? " + auto.equals(fecha));

        System.out.println(nissan.calcularConsumo(300, 60));



    }
}
