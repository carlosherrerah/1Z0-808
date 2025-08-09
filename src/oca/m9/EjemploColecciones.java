package oca.m9;
import java.util.*;

public class EjemploColecciones {
    public static void ejecutar() {
        System.out.println("\n--- Colecciones en Java ---");

        List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Plátano");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        Map<String, Integer> inventario = new HashMap<>();
        inventario.put("Manzanas", 50);
        inventario.put("Peras", 20);
        inventario.put("Plátanos", 30);

        inventario.forEach((producto, cantidad) ->
            System.out.printf("%s: %d unidades%n", producto, cantidad)
        );

        System.out.println("\nOrdenado por cantidad:");
        inventario.entrySet().stream()
            .sorted(Map.Entry.comparingByValue())
            .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));

        Map<String, List<String>> agenda = new HashMap<>();
        agenda.put("Juan", Arrays.asList("4491234567", "4497654321"));
        agenda.put("Ana", Arrays.asList("4491234568"));
        agenda.put("Luis", Arrays.asList("4491234569", "4497654320"));

        agenda.forEach((nombre, telefonos) -> {
            System.out.println("Contactos de " + nombre + ":");
            telefonos.forEach(telefono -> System.out.println(" - " + telefono));
        });
    }
}
