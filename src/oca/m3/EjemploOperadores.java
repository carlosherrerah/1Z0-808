package oca.m3;

public class EjemploOperadores {
    public static void ejecutar() {

        boolean esAdmin = true;
        boolean tieneAcceso = false;

        if (esAdmin || tieneAcceso) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }

        System.out.println("\n--- Operadores y decisiones ---");

        int score = 85 / 10;
        String resultado = (score >= 60) ? "Aprobado" : "Reprobado";
        System.out.println("Estado: " + resultado);

        // convertir a la version 8 de java el switch
        String nota;
        switch (score) {
            case 10:
            case 9:
                nota = "Excelente";
                break;
            case 8:
                nota = "Muy Bien";
                break;
            case 7:
                nota = "Bien";
                break;
            default:
                nota = "Insuficiente";
        }

        System.out.println("Nota: " + nota);
    }
}
