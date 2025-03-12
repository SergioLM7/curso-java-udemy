import java.io.IOException;
import java.util.SortedMap;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        Process proceso;

        try {
            if(System.getProperty("os.name").toLowerCase().startsWith("mac")) {
                proceso = rt.exec("open -a TextEdit");
            } else if (System.getProperty("os.name").toLowerCase().startsWith("windows")){
                proceso = rt.exec("notepad");
            } else if (System.getProperty("os.name").toLowerCase().contains("nux") || System.getProperty("os.name").toLowerCase().contains("nix")) {
                proceso = rt.exec("gedit");
            } else {
                throw new RuntimeException("Sistema operativo no compatible");
            }

            proceso.waitFor();

        } catch (Exception e) {
            System.err.println("El comando es desconocido: " + e.getMessage());
            System.exit(1);
        }

        System.out.println("Se ha cerrado el editor.");
        System.exit(0);
    }

}
