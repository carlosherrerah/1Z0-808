package examples.pagos;

public class PagoPaypal implements IPago {
    private String correo;

    public PagoPaypal() {
        this.correo = "cliente@correo.com"; // Valor por defecto
    }

    public PagoPaypal(String correo) {
        this.correo = correo;
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Pagando $" + monto + " vía PayPal desde la cuenta: " + correo);
        HistorialPagos.registrarPagoTXT("PayPal", monto);
        HistorialPagos.registrarPagoJSON("PayPal", monto);
    }
}
