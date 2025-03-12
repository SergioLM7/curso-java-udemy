package com.sergio.app.hogar;

import com.sergio.app.jardin.Perro;

import static com.sergio.app.hogar.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {

        Persona persona = new Persona();
        Perro perro = new Perro();

        //No es public, entonces no puedo usarlo fuera de su paquete
        //perro.jugar();

        String saludo = saludar();

    }
}
