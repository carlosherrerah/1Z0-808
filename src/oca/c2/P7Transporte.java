package oca.c2;

public class P7Transporte {

    public static P7ITransporte crearTransporte(String tipo) {
        if (tipo.equalsIgnoreCase("auto")) {
            return new Auto();
        } else if (tipo.equalsIgnoreCase("barco")) {
            return new Barco();
        } else {
            throw new IllegalArgumentException("Tipo de transporte desconocido");
        }
    }

    public static void main(String[] args) {
        P7ITransporte auto = crearTransporte("auto");
        auto.moverse();

        P7ITransporte[] transportes = new P7ITransporte[2];
        transportes[0] = crearTransporte("auto");
        transportes[1] = crearTransporte("barco");
        System.out.println(transportes[0] instanceof Barco); // false
        System.out.println(transportes[0] instanceof P7ITransporte); // true    

        for (P7ITransporte t : transportes) {
            t.moverse();
            System.out.println("Velocidad máxima: " + t.obtenerVelocidadMaxima() + " km/h");
            System.out.println("Capacidad de carga: " + t.obtenerCapacidadCarga() + " kg");
            System.out.println();
        }
        System.out.println("Total de transportes: " + transportes.length);

    }
}