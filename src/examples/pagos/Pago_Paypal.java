package examples.pagos;

public class Pago_Paypal extends Pago {

    private String correo;

    public Pago_Paypal(String correo) {
        super("PayPal");
        this.correo = correo;
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Pagando_ $" + monto + " con PayPal: " + correo);
        imprimirComprobante(monto);
    }
}