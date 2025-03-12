package com.sergio.app.jardin;

import com.sergio.app.hogar.Persona;

public class Perro  {

    protected String nombre;
    protected String raza;

    String jugar(Persona persona) {
        return persona.lanzarPelota();
    }
}
