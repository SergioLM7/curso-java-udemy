package org.slillo.patrones.decorator;

import org.slillo.patrones.decorator.decoradores.MayusculasDecorador;
import org.slillo.patrones.decorator.decoradores.ReemplazarEspacioDecorador;
import org.slillo.patrones.decorator.decoradores.ReverseDecorador;
import org.slillo.patrones.decorator.decoradores.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {

        Formateable texto = new Texto("Hola qué tal, Andrés");

        MayusculasDecorador mayusculas = new MayusculasDecorador(texto);
        ReverseDecorador reverse = new ReverseDecorador(mayusculas);
        SubrayadoDecorador subrayar = new SubrayadoDecorador(reverse);
        ReemplazarEspacioDecorador reemplazar = new ReemplazarEspacioDecorador(subrayar);

        System.out.println(reemplazar.darFormato());
    }
}
