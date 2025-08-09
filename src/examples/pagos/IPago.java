package examples.pagos;

public interface IPago {

 // Constantes
    double MONTO_MINIMO = 1.0;
    double MONTO_MAXIMO = 1000.0;
    String MENSAJE_PAGO_INVALIDO = "Monto fuera de los límites permitidos";

 // Métodos
    void realizarPago(double monto);
}
