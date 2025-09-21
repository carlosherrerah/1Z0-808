package oca.c5;

public class P1Seleccion {

  public static void main(String[] args) {
    final int a = 1;
          int b = 2;
    final int c; c = 2;

    int x = 0; // expresion
    switch (x) {
      case a: // ok 
      //case b: // compiler error
      //case c: // compiler error
    }

    x = 7;
    switch (x) {
      case 2:
      case 4:
      case 6:
      case 8:
      case 10: {
        System.out.println("x is an even number");
        break;
      }
      default: {
        System.out.println("x is an odd number");
        break;
      }
    }

    System.out.println("\n1.-----");
    x = 5;
    switch (x) {
      case 2:
        System.out.println("2");
      default:
        System.out.println("default");
      case 3:
        System.out.println("3");
      case 7:
        System.out.println("7");
      case 8:
        System.out.println("8");
    }

    System.out.println("\n2.-----");
    int y = 2;
    x = 7;
    switch (x) { // expresion
      default:
        System.out.println("default");
      case 1: // constante
        System.out.println("1");
        break;
      case 2: // constante
        System.out.println("2");
        break;
    }

    System.out.println("\n3.-----");
    String s = "bob";
    String[] sa = { "bob", "fred", "jim" };
    final String s2 = "bob";
    StringBuilder s3 = new StringBuilder("bob");
    //switch (sa[0]) { // ok
    //switch (s3.toString()) { // ok
    switch ("b" + "ob") { // ok
      case "jim": // ok
      case s2: // ok
      // case s: // compiler error
      //case s3: // compiler error
      case "default":
        System.out.println("default");
    }

    // debug String vs StringBuilder
    String x1="Hola";
    x1 = x1 + " Mundo"; // crea nuevo objeto, cambia de referencia 
    System.out.println(x1);
    StringBuilder x2 = new StringBuilder("Hola");
    x2.append(" Mundo"); // modifica el mismo objeto
    System.out.println(x2);

  }
}
