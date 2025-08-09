import java.util.Scanner;
import oca.m1.EjemploBasicos;
import oca.m2.EjemploTipos;
import oca.m3.EjemploOperadores;
import oca.m4.EjemploMatrices;
import oca.m5.EjemploBucles;
import oca.m6.EjemploEncapsulacion;
import oca.m7.EjemploHerencia;
import oca.m8.EjemploExcepciones;
import oca.m9.EjemploColecciones;

public class App_M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== JAVA PLAYGROUND ===");
            System.out.println("1. Conceptos básicos");
            System.out.println("2. Tipos de datos");
            System.out.println("3. Operadores y decisiones");
            System.out.println("4. Matrices");
            System.out.println("5. Bucles");
            System.out.println("6. Métodos y encapsulación");
            System.out.println("7. Herencia");
            System.out.println("8. Excepciones");
            System.out.println("9. Colecciones");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            while (!sc.hasNextInt()) {
                System.out.print("Ingresa un número válido: ");
                sc.next();
            }
            opcion = sc.nextInt();
            String option = sc.nextLine();

            switch (opcion) {
                case 1:  EjemploBasicos.ejecutar(); break;
                case 2:  EjemploTipos.main(args); break;
                case 3:  EjemploOperadores.ejecutar(); break;
                case 4:  EjemploMatrices.ejecutar(); break;
                case 5:  EjemploBucles.ejecutar(); break;
                case 6:  EjemploEncapsulacion.ejecutar(); break;
                case 7:  EjemploHerencia.ejecutar(); break;
                case 8:  EjemploExcepciones.ejecutar(); break;
                case 9:  EjemploColecciones.ejecutar(); break;
                case 0:  System.out.println("Saliendo. . ."); break;
                default: System.out.println("Opción no válida");
            }
        } while (opcion != 0);

        sc.close();
    }
}
