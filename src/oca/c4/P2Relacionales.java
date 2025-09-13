package oca.c4;

public class P2Relacionales {

  public static void main(String[] args) {
    System.out.println("\033[H\033[2J"); // limpiar pantalla
    // A = ascii(65) a = ascii(97)

    // Operadores relacionales
    System.out.println("Operadores relacionales");
    boolean b1 = 10 > 5;
    System.out.println("10 > 5 :" + b1);
    Boolean B2 = 'h' > 'H';
    System.out.println("h >  H :" + b1);

    boolean b3 = "pepito".compareTo("mafalda") > 0;
    System.out.println("pepito >  mafalda :" + b3);
    boolean b4 = "pepito".compareTo("pepito") == 0;
    System.out.println("pepito ==  pepito :" + b4);
    boolean b5 = "mafalda".compareTo("pepito") < 0;
    System.out.println("mafalda <  pepito :" + b5);
    boolean b6 = "mafalda".compareTo("mafalda") != 0;
    System.out.println("mafalda !=  mafalda :" + b6);
    boolean b7 = "Mafalda".compareTo("mafalda") == 0;
    System.out.println("Mafalda ==  mafalda :" + b7);

    // el if evalua una expresion booleana
    System.out.println("\nPreguntar por true o false:");
    boolean b = false;
    if (b = false) {  // La asignacion b = false asigna false a b y devuelve ese valor.
      System.out.println("b is false"); 
    } else {
      System.out.println("b is true");
    }

    if (b) {
      System.out.println("B is true"); // se pregunta si b es true
    } else {
      System.out.println("B is false");
    }

    if (!b) {
      System.out.println("B es FALSA"); // se pregunta si b es false
    } else {
      System.out.println("B es VERDADERA");
    }
    if (b == false) {
      System.out.println("B es FALSA");
    } else {
      System.out.println("B es VERDADERA");
    }

    int a = 1;
    // if (a = 1) { System.out.println("a is 1"); // debe ser una condicion booleana
    // } else { System.out.println("a is not 1"); }

    System.out.println(". . . Hecho . . .");

  }

}
