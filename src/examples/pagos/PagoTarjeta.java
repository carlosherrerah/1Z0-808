package examples.pagos;

public class PagoTarjeta implements IPago {
    private String numeroTarjeta;

    public PagoTarjeta() {
    }

    public PagoTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Pagando $" + monto + " con tarjeta: " + numeroTarjeta);
        HistorialPagos.registrarPagoTXT("Tarjeta", monto);
        HistorialPagos.registrarPagoJSON("Tarjeta", monto);
    }
}
