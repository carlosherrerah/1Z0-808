package examples.pagos;

public class PagoEfectivo implements IPago {
    
    @Override
    public void realizarPago(double monto) {
        System.out.println("Pagando $" + monto + " en efectivo.");
        HistorialPagos.registrarPagoTXT("Efectivo", monto);
        HistorialPagos.registrarPagoJSON("Efectivo", monto);
    }
}
