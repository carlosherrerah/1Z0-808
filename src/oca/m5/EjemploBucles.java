package oca.m5;

public class EjemploBucles {
    public static void ejecutar() {

        System.out.println("\n--- Serie de Fibonacci ---");
        int n = 10, a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }

        System.out.println("\n--- Bucles en Java ---");

        String[] nombres = { "Ana", "Luis", "Carlos", "Fin", "Mario" };

        for (String nombre : nombres) {
            if (nombre.equals("Fin"))
                break;
            System.out.println(nombre);
        }

        int contador = 0;
        while (true) {
            if (contador++ >= 3)
                break;
            System.out.println("Contador: " + contador);
        }
    }
}
