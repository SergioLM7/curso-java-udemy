package org.slillo.patrones.decorator.decoradores;

import org.slillo.patrones.decorator.Formateable;

public class ReverseDecorador extends TextoDecorador{

    public ReverseDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        StringBuilder sb = new StringBuilder(texto.darFormato());
        return sb.reverse().toString();
    }
}
