package oca.m6;

public class Usuario {
    private String nombre;
    private int edad;

    public Usuario(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty())
            throw new IllegalArgumentException("Nombre inválido");
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad < 0)
            throw new IllegalArgumentException("Edad inválida");
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
}
