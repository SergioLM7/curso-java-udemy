import java.util.Map;

public class EjemploVariablesEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de entorno del SO: " + varEnv);

        System.out.println("Listando variables de entorno del sistema----");
        for(String key : varEnv.keySet()) {
            System.out.println(key + " => " + varEnv.get(key));
        }

        System.out.println("USER = " + System.getenv("USER"));

        String path = System.getenv("PATH");
        System.out.println("Path = " + path);

        String path2 = varEnv.get("PATH");
        System.out.println("Path2 = " + path2);
    }
}
