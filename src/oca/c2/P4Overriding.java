package oca.c2;

import java.io.FileNotFoundException;
import java.io.IOException;

class X {
}

class Y extends X {
}

class A {

    int suma(String a, int b) {
        System.out.println("suma A overloaded");
        return Integer.parseInt(a) + b;
    }

    protected X /* int */ getValue() throws IOException {
        System.out.println("getValue A overridden");
        return null;
    } // overridden
}

class B extends A {

    int suma(int a, String b) {
        System.out.println("suma B overloaded");
        return a + Integer.parseInt(b);
    }

    public Y /* int */ getValue() throws FileNotFoundException {
        System.out.println("getValue B overridden");
        return null;
    } // overriding

    public int getValue(int a) throws Exception {
        return 1;
    } // overloaded

}

public class P4Overriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A ab = new B();

        try {
            // Overloading Compilation Reference type
            int y1 = a.suma("0", 0); // A
            int y2 = b.suma(0,"0"); // B
            int y3 = ab.suma("0",0); // A

            // Overriding  Runtime object type
            X x1 = a.getValue(); // A
            X x2 = b.getValue(); // B
            X x3 = ab.getValue(); // B

        }  catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(". . . Hecho");
    }

}
