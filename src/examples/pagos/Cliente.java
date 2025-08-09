package examples.pagos;

public class Cliente extends Persona {
    private IPago metodoPago;

    public Cliente(String nombre, String identificacion, IPago metodoPago) {
        super(nombre, identificacion);
        this.metodoPago = metodoPago;
    }

    public void setMetodoPago(IPago nuevoMetodo) {
        this.metodoPago = nuevoMetodo;
    }

    public IPago getMetodoPago() {
        return metodoPago;
    }

    public void realizarPago(double monto) {
        if (monto < IPago.MONTO_MINIMO || monto > IPago.MONTO_MAXIMO) {
            System.out.println(IPago.MENSAJE_PAGO_INVALIDO);
            return;
        }
        System.out.println("\nCliente: " + nombre);
        metodoPago.realizarPago(monto);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Cliente: " + nombre + ", ID: " + identificacion);
    }
}
