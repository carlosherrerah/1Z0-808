package oca.c4;

public class P6Logicos {

    public static boolean isItSmall(int i) {
        if (i < 5) {
            System.out.println("i < 5");
            return true;
        } else {
            System.out.println("i >= 5");
            return false;
        }
    }

    public static void main(String[] args) {

        int x = 2;
        int y = 3;
        if ((y == ++x) || (x < ++y)) { // cambia el operador || por |
            System.out.println("x = " + x + " y = " + y);
        }

        // Bitwise Operators (Not on the Exam!)
        System.out.println("Operadores a nivel de bits:");
        byte b1 = 6 & 8;
        byte b2 = 7 | 9;
        byte b3 = 5 ^ 4;
        System.out.println(b1 + " " + b2 + " " + b3);

        // Operadores lógicos Short-Circuit
        System.out.println("\nOperadores lógicos:");
        boolean b7 = true && false;
        System.out.println("true && false: " + b7);
        boolean b8 = true || false;
        System.out.println("true || false: " + b8);
        boolean b9 = !true;
        System.out.println("!true: " + b9);
        boolean b10 = !false;
        System.out.println("!false: " + b10);
        boolean b11 = !(true && false);
        System.out.println("!(true && false): " + b11);
        boolean b12 = !(true || false);
        System.out.println("!(true || false): " + b12);
        boolean b13 = (5 > 4) && (6 < 7);
        System.out.println("(5 > 4) && (6 < 7): " + b13);

        // Operadores lógicos Short-Circuit
        System.out.println("\nOperadores lógicos:");
        if ((isItSmall(3)) || (isItSmall(7))) {
            System.out.println("Result is true");
        }
        if ((isItSmall(6)) || (isItSmall(9))) {
            System.out.println("Result is true");
        }

    }
}
