import java.lang.reflect.Method;

public class EjemploMetodoGetClass {

    public static void main(String[] args) {

        String texto ="Hola qué tal?";

        Class strClass = texto.getClass();
        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass = " + strClass);

        for (Method m : strClass.getMethods()) {
            System.out.println("metodo.getName() = " + m.getName());
        }

        Integer num = 34;
        Class intClass = num.getClass();
        Class objectClass = intClass.getSuperclass();
        System.out.println("intClass.getSuperclass() = " + objectClass);
        System.out.println("intClass.getSuperclass().getSuperclass() = " + objectClass.getSuperclass());


        for (Method m : objectClass.getMethods()) {
            System.out.println("metodo.getName() = " + m.getName());
        }
    }
}
