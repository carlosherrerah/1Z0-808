package oca.c5;

public class P2Loop {

    static boolean doStuff() {
        for (int x = 0; x < 3; x++) {
            System.out.println("in for loop");
            return true;
        }
        return true; // unreachable code
    }

    public static void main(String[] args) {
        int x1 = 0, y1;
        // y++ // error: unexpected type

        // int a= 0, int b = 0; // error: expected
        do {
            System.out.println("Inside loop");
        } while (false);

        for (int x = 10, y = 3; y > 3; y++) {
        }
        // System.out.println("y = " + y);

        for (int x = 0, y = 3; ((x < 10) && (y-- > 2)) | x == 3; x++) {
            System.out.println("x = " + x + ", y = " + y);
        }

        int k = 0;
        for (; k < 2;) {
            k++;
            System.out.println("hola");
        }

        int b = 3;
        for (int a = 1; b != 1; System.out.println("iterate")) {
            b = b - a;
        }

        doStuff();

        System.out.println("\nImprimiendo matriz");
        int[][] twoDee = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        for (int[] outer : twoDee) {
            for (int inner : outer) {
                System.out.print(inner + " ");
            }
            System.out.println();
        }

        System.out.println("\nTabla del 5");
        int num = 5;
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break /* continue */;
            }
            System.out.println(num + " * " + i + " = " + (num * i));
        }

        // etiquetas
        System.out.println("\nEtiquetas");
        boolean isTrue = true;
        outer: for (int i = 0; i < 2; i++) {
            while (isTrue) {
                System.out.println("Hello");
                break outer; /* continue outer; */
            } // end of inner while loop
            System.out.println("Outer loop."); // Won't print
        } // end of outer for loop
        System.out.println("Good-Bye\n");

        int[] arr = { 1, 2, 3, 4, 5 };
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        
        int x = 0;
        // for (x : arr) { } // the "enhanced for" must declare its first operand

    }

}
