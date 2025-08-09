package examples.pagos;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import com.google.gson.*;

public class HistorialPagos {
    private static final String ARCHIVO_TXT = "src/examples/pagos/historial_pagos.txt";
    private static final String ARCHIVO = "historial.json";

    public static void registrarPagoTXT(String metodo, double monto) {
        try (FileWriter writer = new FileWriter(ARCHIVO_TXT, true)) {
            String linea = LocalDateTime.now() + " - " + metodo + ": $" + monto + "\n";
            writer.write(linea);
        } catch (IOException e) {
            System.out.println("Error al guardar el historial: " + e.getMessage());
        }
    }

    public static void registrarPagoJSON(String metodo, double monto) {
        JsonObject obj = new JsonObject();
        obj.addProperty("fecha", LocalDateTime.now().toString());
        obj.addProperty("metodo", metodo);
        obj.addProperty("monto", monto);

        try (FileWriter fw = new FileWriter(ARCHIVO, true)) {
            fw.write(new Gson().toJson(obj) + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
