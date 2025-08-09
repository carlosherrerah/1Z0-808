package oca.m8;

public class EjemploExcepciones {
    public static void ejecutar() {
        System.out.println("\n--- Excepciones ---");

        CuentaBancaria cuenta = new CuentaBancaria();
        try {
            cuenta.retirar(100);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
