package oca.c2;

interface DS {
    public static final int VALOR = 5; // por defecto son public static final

    public abstract void hello();

    default String defecto() { // La palabra default, solo existe en la interfaz
        return "default de interfaz";
    }

    static String estatico() { // La palabra static, existe en la interfaz y en la clase
        return "Estatico de Interfaz";
    }

}

public class P8Interface implements DS {
    static final int VALOR = 10; // variable de clase

    @Override
    public void hello() {
        System.out.println("Hola desde la clase");
    }

    @Override
    public String defecto() {
        return "default de clase";
    }

    static String estatico() { // Metodo que pertenece a la clase, por eso no lleva @Override
        return "Estatico de Clase";
    }

    public void defectoInterfaz() {
        DS.estatico();
        estatico(); // un metodo de instancia puede llamar a un metodo estatico directamente
        DS.super.defecto();
    }

    // Un metodo estatico NO puede llamar directamente a un metodo de instancia
    // Un metodo estatico NO puede llamar directamente a un atributo de instancia
    // necesita un objeto
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J"); // limpiar pantalla
        System.out.println(estatico()); // un metodo estatico puede llamar a otro estatico directamente

        P8Interface miClase = new P8Interface();
        System.out.println(miClase.defecto());

        System.out.println(miClase.estatico()); // Aunque realmente es un metodo de clase
        System.out.println(P8Interface.estatico()); // Metodo estatico de clase
        System.out.println();

        System.out.println(DS.estatico());
        System.out.println(DS.VALOR); // Variable estatica de interfaz

        System.out.println(miClase.VALOR); // Aunque es una variable de clase, se puede llamar desde un objeto
        System.out.println(P8Interface.VALOR); // Variable estatica de clase

        System.out.println(". . .Hecho");

    }

}
