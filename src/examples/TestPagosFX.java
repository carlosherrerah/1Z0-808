package examples;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import examples.pagos.*;
import javax.swing.JOptionPane;

public class TestPagosFX extends Application {
    private Cliente cliente = new Cliente("Carlos", "010", new PagoEfectivo());

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ComboBox<String> comboMetodo = new ComboBox<>();
        comboMetodo.getItems().addAll("Tarjeta", "PayPal", "Efectivo");
        comboMetodo.getSelectionModel().selectFirst();

        TextField txtMonto = new TextField();
        txtMonto.setPromptText("Ingrese monto");

        Button btnPagar = new Button("Realizar Pago");
        Label lblMensaje = new Label();

        btnPagar.setOnAction(e -> {
            try {
                double monto = Double.parseDouble(txtMonto.getText());
                String metodo = comboMetodo.getValue();
                /*
                IPago pago = switch (metodo) {
                    case "Tarjeta" -> new PagoTarjeta();
                    case "PayPal" -> new PagoPaypal();
                    default -> new PagoEfectivo();
                };
                */
                IPago pago;
                switch (metodo) {
                    case "Tarjeta":
                        String numeroTarjeta = JOptionPane.showInputDialog("Ingrese número de tarjeta:");
                        pago = new PagoTarjeta(numeroTarjeta);
                        break;
                    case "PayPal":
                        String emailPaypal = JOptionPane.showInputDialog("Ingrese email de PayPal:");
                        pago = new PagoPaypal(emailPaypal);
                        break;
                    default:
                        pago = new PagoEfectivo();
                        break;
                }
                JOptionPane.showMessageDialog(null, "Pago seleccionado: " + metodo);
                cliente.setMetodoPago(pago);
                cliente.realizarPago(monto);
                lblMensaje.setText("Pago realizado con éxito.");
            } catch (NumberFormatException ex) {
                lblMensaje.setText("Monto inválido.");
            }
        });

        VBox layout = new VBox(10, new Label("Método de Pago:"), comboMetodo, txtMonto, btnPagar, lblMensaje);
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Sistema de Pagos");
        primaryStage.show();
    }
}


