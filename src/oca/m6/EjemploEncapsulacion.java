package oca.m6;

public class EjemploEncapsulacion {
    public static void ejecutar() {
        System.out.println("\n--- Encapsulación ---");

        Usuario u = new Usuario("Carlos", 30);
        System.out.println("Usuario: " + u.getNombre() + ", Edad: " + u.getEdad());

        try {
            u.setEdad(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al modificar edad: " + e.getMessage());
        }
    }
}
