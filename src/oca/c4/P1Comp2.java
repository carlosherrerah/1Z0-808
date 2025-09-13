package oca.c4;

public class P1Comp2 {
  public static void main(String[] args) {
    int a = 123;
    Integer A1 = 123;
    Integer A2 = new Integer("123"); // new Integer(123);   123
    System.out.println(A1 == A2);        // false
    System.out.println( a == A2);         // true
    System.out.println(A1.equals(a));    // true    
    System.out.println("longitud: " + A1.toString().length());  

    System.out.println();
    byte b = 5;
    System.out.println(b + " en Binario  : " + Integer.toBinaryString(b));
    System.out.println(b + " invertido   : " + Integer.toBinaryString(~b));
    System.out.println(b*-1 +"            : " + Integer.toBinaryString(~b+1));  // 2's complement
    byte c = -5;
    System.out.println(c + " en Binario : " + Integer.toBinaryString(c));
    
    // de Binario a Decimal
    String binario = "1111_1011";
    //binario = "101";
    binario = binario.replace("_", "");
    System.out.println(binario + "  = " + (byte) Integer.parseInt(binario, 2));
    System.out.println(binario + "  = " +  Integer.parseUnsignedInt(binario, 2));

    int y=0, x = 0;

    // Operadores de asignación compuestos
    y = y - 6;
    x = x + 2 * 5;
    // Now, with compound operators:
    y -= 6;
    x += 2 * 5;


  }
}
