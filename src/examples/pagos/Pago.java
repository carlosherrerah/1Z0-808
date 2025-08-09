package examples.pagos;

public abstract class Pago implements IPago {
    protected String nombreMetodo;

    public Pago(String nombreMetodo) {
        this.nombreMetodo = nombreMetodo;
    }

    public String getNombreMetodo() {
        return nombreMetodo;
    }

    // Método común opcional
    public void imprimirComprobante(double monto) {
        System.out.println("Pago de $" + monto + " realizado por " + nombreMetodo);
    }

    // Método que las subclases deben implementar
    public abstract void realizarPago(double monto);
}

