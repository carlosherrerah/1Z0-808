package oca.c1.p2Accesos.d1;

public class Parent {
    protected int x = 10;
    public int edad;
    private String nombre;
    int sexo = 1;
    transient String password;  // Esta variable no se serializa OCP
    volatile int contador; // Esta variable puede ser modificada por múltiples hilos OCP

    public static void main(String[] args) {
        Parent p = new Parent();
        p.x = 5;
        p.edad = 20;
        p.nombre = "Juan";
        
    }

}
