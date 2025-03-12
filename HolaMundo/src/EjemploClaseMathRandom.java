import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"azul", "rojo", "amarillo", "verde", "morado", "blanco"};
        double aleatorio = Math.random();
        System.out.println("Número aleatorio = " + aleatorio);

        aleatorio *= colores.length;
        System.out.println("Número aleatorio para array de colores = " + aleatorio);

        aleatorio = Math.floor(aleatorio);
        System.out.println("Número aleatorio redondeado hacia abajo = " + aleatorio);

        System.out.println("Color elegido = " + colores[(int)aleatorio]);

        Random randomObj = new Random();
        int randomInt = randomObj.nextInt();
        System.out.println("Int random = " + randomInt);
        randomInt = randomObj.nextInt(7);
        System.out.println("Int random con límite = " + randomInt);

        randomInt = 15 + randomObj.nextInt(25 - 15); //Para que devuelva entre rangos sin incluir el valor final
        System.out.println("Int random entre rangos = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("Posición aleatoria = " + randomInt);
        System.out.println("Color elegido = " + colores[randomInt]);



    }
}
