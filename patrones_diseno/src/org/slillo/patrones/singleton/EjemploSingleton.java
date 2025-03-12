package org.slillo.patrones.singleton;

public class EjemploSingleton {

    public static void main(String[] args) {
        ConexionBDSingleton cn = null;
        for(int i = 0; i < 10; i++) {
            cn = ConexionBDSingleton.getInstance();
            //Debería imprimirse la misma instancai 10 veces, dado que hemos seguido un patrón Singleton
            System.out.println("cn= " + cn);
        }
        ConexionBDSingleton cn2 = ConexionBDSingleton.getInstance();
        ConexionBDSingleton cn3 = ConexionBDSingleton.getInstance();
        boolean b1 = ((cn == cn2) && (cn == cn3) && (cn2 == cn3));
        System.out.println("¿Son exactamente iguales? " + b1);

    }
}
