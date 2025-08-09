package oca.m7;

public class Persona {
    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String presentarse() {
        return "Hola, soy " + nombre;
    }
}
