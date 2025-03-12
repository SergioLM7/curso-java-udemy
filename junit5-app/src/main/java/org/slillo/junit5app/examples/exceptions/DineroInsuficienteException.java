package org.slillo.junit5app.examples.exceptions;

public class DineroInsuficienteException extends RuntimeException{

    public DineroInsuficienteException (String message) {
        super(message);
    }
}
