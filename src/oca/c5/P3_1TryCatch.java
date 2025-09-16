package oca.c5;

public class P3_1TryCatch {

  static void doStuff() {
    doMoreStuff();
  }

  static void doMoreStuff() {
    int x = 5 / 0; // ArithmeticException is thrown here
  }

  public static void main(String[] args) {

    System.out.println("1. complete try/catch/finally");
    try {
      throw new Exception();
    } catch (Exception e) {
      System.out.println("Exception");
    } finally {
      System.out.println("Finally");
    }

    System.out.println("\n2. try/catch");
    try {
      throw new Exception();
    } catch (Exception e) {
      System.out.println("Exception");
    }

    System.out.println("\n3. try/finally");
    try {
      // No throw new Exception();
      // System.out.println(5/0);
    } finally {
      System.out.println("Finally.."); // Finally.. is printed: Es una promesa que se ejecutará
    }

    System.out.println("\n4. try/catch/finally multiple catch");
    try {
      doStuff();
    } catch (ArithmeticException e) { // prioridad de menor a mayor de las excepciones
      System.out.println("ArithmeticException");
    } catch (Exception e) {
      System.out.println("Exception");
    } finally {
      System.out.println("Finally");
    }

    System.out.println("\nSecuencia de la pila de llamadas:");
    doStuff(); 

    System.out.println("\n. . . Hecho!");

  }

}
