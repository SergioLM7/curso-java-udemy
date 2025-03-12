package com.sergio.app.hogar;

public class Persona {
    private String nombre;
    private String apellido;
    private ColorPelo pelo;

    public final static String GENERO_MASCULINO = "Masculino";
    public final static String GENERO_FEMENINO = "Femenino";


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ColorPelo getPelo() {
        return pelo;
    }

    public void setPelo(ColorPelo pelo) {
        this.pelo = pelo;
    }

    public String lanzarPelota() {
        return "Lanza la pelota al perro";
    }

    public static String saludar() {
        return "Hola qué tal";
    }
}
