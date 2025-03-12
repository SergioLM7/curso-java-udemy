package org.slillo.patrones.singleton;

public class ConexionBDSingleton {

    private static ConexionBDSingleton instancia;
    private ConexionBDSingleton() {
        System.out.println("Conectándose a un motor de BBDD");
    }

    public static ConexionBDSingleton getInstance() {
        if(instancia == null) {
            instancia = new ConexionBDSingleton();
        }
        return instancia;
    }
}
