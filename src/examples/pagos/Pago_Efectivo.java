package examples.pagos;

public class Pago_Efectivo extends Pago {

    public Pago_Efectivo() {
        super("Efectivo");
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Pagando_ $" + monto + " en efectivo.");
        HistorialPagos.registrarPagoTXT("Efectivo", monto);
        HistorialPagos.registrarPagoJSON("Efectivo", monto);
    }
}
