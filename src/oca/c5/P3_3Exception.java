package oca.c5;

public class P3_3Exception {

    public static void lanzar() {
        try {
            System.out.println("try");
            throw new Exception();
            // int a = 1 / 0;
        } catch (Exception e) {
            System.out.println("catch");
            // int a = 1/0;
            throw new RuntimeException();
        } finally {
            System.out.println("finally"); // se compromete a ejecutar aunque exista otra excepción
            // throw new Error();
        }
    }

    static void doStuff() throws Exception { //
        try {
            throw new Exception();
        } catch (Exception me) {
            System.out.println("doStuff Exception");
            // throw new RuntimeException(); // NO requiere throws Exception
            // throw new Exception(); // requiere throws Exception
            // throw me; // requiere throws Exception
        }
    }

    static void badMethod() throws Exception { //
        try {
            doStuff();
        } catch (Exception e) {
            System.out.println("badMethod Exception");
            //throw new Exception();
        }

        // doStuff(); // Si cacha la excepción, no se propaga
    }

    public static void main(String[] args) throws Exception {
        System.out.println("\033[H\033[2J"); // limpiar pantalla
        // lanzar();
        badMethod();
        System.out.println(". . . Hecho!");
    }

}
