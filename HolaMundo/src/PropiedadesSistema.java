import java.util.Properties;

public class PropiedadesSistema {
    public static void main(String[] args) {

        String userName = System.getProperty("user.name");
        System.out.println(userName);

        String home = System.getProperty("user.home");
        System.out.println(home);

        String directorioTrabajo = System.getProperty("user.dir");
        System.out.println(directorioTrabajo);


        String java = System.getProperty("java.version");
        System.out.println(java);

        //Para imrpimir la lista de todas las configuraciones
        Properties p = System.getProperties();
        p.list(System.out);
    }
}
