import java.io.IOException;

public class EjemploEjecutarProgramaSO_ProcessBuilder {
        public static void main(String[] args) {
            ProcessBuilder processBuilder;

            try {
                String os = System.getProperty("os.name").toLowerCase();

                if (os.startsWith("mac")) {
                    processBuilder = new ProcessBuilder("open", "-a", "TextEdit");
                } else if (os.startsWith("windows")) {
                    processBuilder = new ProcessBuilder("notepad");
                } else if (os.startsWith("linux") || os.startsWith("nix")) {
                    processBuilder = new ProcessBuilder("gedit");
                } else {
                    throw new RuntimeException("Sistema operativo no compatible");
                }

                Process proceso = processBuilder.start();
                proceso.waitFor();

            } catch (IOException | InterruptedException e) {
                System.err.println("Error al ejecutar el comando: " + e.getMessage());
            }

            System.out.println("Se ha cerrado el editor.");

        }
}
