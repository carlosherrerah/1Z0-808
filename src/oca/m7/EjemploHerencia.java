package oca.m7;

public class EjemploHerencia {
    public static void ejecutar() {
        System.out.println("\n--- Herencia ---");

        Persona p = new Empleado("Carlos", "Desarrollador");
        System.out.println(p.presentarse());
    }
}
