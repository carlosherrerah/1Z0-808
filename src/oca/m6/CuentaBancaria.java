package oca.m6;


public class CuentaBancaria {
    private double saldo;

    public void depositar(double monto) {
        if (monto > 0) saldo += monto;
    }

    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }
}