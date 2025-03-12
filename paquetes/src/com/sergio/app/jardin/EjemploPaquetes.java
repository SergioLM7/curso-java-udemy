package com.sergio.app.jardin;

import com.sergio.app.hogar.ColorPelo;
import com.sergio.app.hogar.Persona;

import static com.sergio.app.hogar.Persona.saludar;
import static com.sergio.app.hogar.Persona.GENERO_FEMENINO;
import static com.sergio.app.hogar.Persona.GENERO_MASCULINO;
import static com.sergio.app.hogar.ColorPelo.RUBIO;



public class EjemploPaquetes {

    public static void main(String[] args) {

        Persona p = new Persona();
        Perro tobby = new Perro();
        p.setNombre("Sergio");
        p.setApellido("Lillo");
        p.setPelo(RUBIO);
        tobby.nombre = "Tobby";
        tobby.raza = "Husky";
        System.out.println(p.getNombre());

        String jugando = tobby.jugar(p);
        System.out.println("Jugando = " + jugando);
        String saludo = saludar();
        System.out.println("saludo = " + saludo);

        String generoMujer = GENERO_FEMENINO;
        String generoHombre= GENERO_MASCULINO;

    }
}
