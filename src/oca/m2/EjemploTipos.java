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
        Integer objeto1 = Integer.valueOf(valor);
        Integer objeto2 = valor; // Autoboxing
        
        System.out.println(objeto1-1);
        System.out.println(objeto2+1);

    }
}
