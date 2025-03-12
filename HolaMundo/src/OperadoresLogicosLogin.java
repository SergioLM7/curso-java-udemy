import java.util.Scanner;

public class OperadoresLogicosLogin {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       /* String[] usernames = new String[2];
        String[] passwords = new String[2];

        usernames[0] = "Sergio";
        passwords[0] = "12345";
        usernames[1]= "Andrés";
        passwords[1] = "11111";*/
        String[] usernames = {"Sergio", "Andrés"};
        String[] passwords = {"12345", "11111"};

        System.out.println("Ingrese el username: ");
        String user = scan.nextLine();
        System.out.println("Ingrese la contraseña: ");
        String pass = scan.next();

        boolean isAuthentified = false;

        for(int i = 0; i< usernames.length; i++) {
            if(usernames[i].equalsIgnoreCase(user) && passwords[i].equalsIgnoreCase(pass)) {
                isAuthentified = true;
            }
        }

        if (isAuthentified) {
            System.out.println("Bienvenido usuario ".concat(user.concat("!")));

        } else {
            System.out.println("Username o password incorrectas!");
            System.out.println("Esta página requiere de autenticación.");

        }




    }
}
