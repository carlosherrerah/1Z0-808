package oca.m7;

public class Empleado extends Persona {
    private String puesto;

    public Empleado(String nombre, String puesto) {
        super(nombre);
        this.puesto = puesto;
    }

    @Override
    public String presentarse() {
        return super.presentarse() + " y trabajo como " + puesto;
    }
}
