package oca.m2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class EjemploTipos {

    public static void main(String[] args) {
        ejecutar();
    }

    public static void ejecutar() {
        System.out.println("\n--- Tipos de datos avanzados ---");
        // Tipos primitivos No son inicializados
        // byte, short, int, long, float, double, char, boolean
        boolean b1 = false;
        char c1 = 'A';

        System.out.println(b1 + " " + c1);

        int valor = 100;
        Integer objeto1 = Integer.valueOf(valor);
        Integer objeto2 = valor; // Autoboxing
        
        System.out.println(objeto1-1);
        System.out.println(objeto2+1);

    }
}
