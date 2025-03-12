package org.slillo.patrones.decorator.decoradores;

import org.slillo.patrones.decorator.Formateable;

public class MayusculasDecorador extends TextoDecorador{

    public MayusculasDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }
}
