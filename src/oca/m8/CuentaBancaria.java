package oca.m8;

public class CuentaBancaria {
    private double saldo;

    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto > saldo)
            throw new SaldoInsuficienteException("Saldo insuficiente");
        saldo -= monto;
    }
}

