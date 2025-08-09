package oca.m2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class EjemploTipos {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        System.out.println("\n--- Tipos de datos avanzados ---");

        int valor = 100;
        Integer objeto = Integer.valueOf(valor);
        BigDecimal bd = new BigDecimal("12345.6789");
        BigDecimal resultado = bd.multiply(new BigDecimal("2.5"));
        System.out.println("Resultado preciso: " + resultado);
        System.out.println("Valor entero: " + objeto);
        System.out.println("Valor BigDecimal: " + bd);


        BigDecimal precio = new BigDecimal("19.99");
        BigDecimal cantidad = new BigDecimal("3");
        BigDecimal total = precio.multiply(cantidad).setScale(2, RoundingMode.HALF_UP);

        System.out.println("Total a pagar: $" + total);
    }
}
