package examples.pagos;

public class Pago_Tarjeta extends Pago {
    private String numeroTarjeta;

    public Pago_Tarjeta(String numeroTarjeta) {
        super("Tarjeta");
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Pagando_ $" + monto + " con tarjeta: " + numeroTarjeta);
        imprimirComprobante(monto);
    }
}
