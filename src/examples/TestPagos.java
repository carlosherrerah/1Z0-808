// C:\Dev\1Z0-808\src>javac -cp . examples/Pago.java
// C:\Dev\1Z0-808\src>java -cp . examples/Pago
// C:\Dev\1Z0-808\src>java  examples/Pago                 En caso de no existir librerias externas.

package examples;
import examples.pagos.*;

public class TestPagos {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J"); // limpiar pantalla
        // Ejemplo de uso de la interfaz IPago y las clases que la implementan
        IPago tarjeta = new PagoTarjeta("1234-5678-9012-3456");
        IPago paypal = new PagoPaypal("cliente@correo.com");
        IPago efectivo = new PagoEfectivo();

        /*  Con Herencia de clases
        IPago tarjeta = new Pago_Tarjeta("1234-5678-9012-3456");
        IPago paypal = new Pago_Paypal("cliente@correo.com");
        IPago efectivo = new Pago_Efectivo();
        */

        Cliente cliente1 = new Cliente("Carlos", "001", new PagoEfectivo());
        cliente1.realizarPago(500.0);     // válido
        cliente1.realizarPago(0.5);       // inválido

        cliente1.setMetodoPago(paypal);
        cliente1.realizarPago(300.0);

        cliente1.setMetodoPago(efectivo);
        cliente1.realizarPago(100.0);

        Cliente cliente2 = new Cliente("Pepito", "002", new PagoPaypal("pepito@email.com"));
        cliente2.realizarPago(500);
        cliente2.mostrarInformacion();

    }
}

