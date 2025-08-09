package oca.m1;
import java.time.LocalDateTime;

public class Logger {
    public static void log(String mensaje) {
        System.out.println(LocalDateTime.now() + " - " + mensaje);
    }

    public static void main(String[] args) {
        Logger.log("Inicio del sistema");
    }
}