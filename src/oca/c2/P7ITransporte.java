package oca.c2;

public interface P7ITransporte {
    void moverse();
    int obtenerVelocidadMaxima(); // km/h
    int obtenerCapacidadCarga();  // kg
}

class Auto implements P7ITransporte {
    @Override
    public void moverse() {
        System.out.println("El auto se mueve por carretera.");
    }

    @Override
    public int obtenerVelocidadMaxima() {
        return 180;
    }

    @Override
    public int obtenerCapacidadCarga() {
        return 500;
    }
}

class Barco implements P7ITransporte {
    @Override
    public void moverse() {
        System.out.println("El barco navega por el mar.");
    }

    @Override
    public int obtenerVelocidadMaxima() {
        return 40;
    }

    @Override
    public int obtenerCapacidadCarga() {
        return 20000;
    }
}




