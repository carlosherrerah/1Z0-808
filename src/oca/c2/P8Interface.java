package oca.c2;

interface DS {

    default String defecto() { // Id la palabra default, solo existe en la interface
        return "default de interfaz";
    }

    static String estatico() { // I.s la palabra static, existe en la interface y en la clase
        return "Estatico de Interfaz";
    }

    void bye();

}

public class P8Interface implements DS {

    @Override
    public void bye() {
        System.out.println("Adios desde la clase");
    }

    @Override
    public String defecto() {
        return "default de clase";
    }

    static String estatico() { // Este metodo estatico es de la clase, no de la interface, NO puede ir
                               // @Override
        return "Estatico de Clase";
    }

    public void defectoInterfaz() {
        DS.estatico();
        estatico(); // un metodo de instancia puede llamar a un metodo estatico directamente
        DS.super.defecto();
    }

    // Un metodo estatico NO puede llamar directamente a un metodo de instancia, se necesita un objeto
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J"); // limpiar pantalla
        System.out.println(estatico()); // un metodo estatico puede llamar a otro estatico directamente

        P8Interface miClase = new P8Interface();
        System.out.println(miClase.defecto());

        System.out.println(miClase.estatico()); // Aunque realmente es un metodo de clase
        System.out.println(P8Interface.estatico()); // Metodo estatico de clase
        System.out.println();

        System.out.println(DS.estatico());

        System.out.println(". . .Hecho");


    }

}
