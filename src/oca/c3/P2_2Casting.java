package oca.c3;

public class P2_2Casting {
  public static void main(String[] args) {
    double a;
    a =  7 / (double) 2;
    System.out.println("a: " + a);

    // 0 1 2 3 . . 127  128  129  130 . . 254 255    256  257  258  259 . .  510 511 512 513 514
    // 0 1 2 3 . . 127 -128 -127 -126 . .  -2  -1      0    1    2    3 . .   -2  -1   0   1   2
    byte c = (byte) (128);  // -128 

    float pi = 3.1416f;
    int entera = (int) pi;
    float decimal = pi - entera;
    c = (byte) entera;


    byte b = 127;
    b ++; // b = (byte) (b + 1);
    b += 7; // b = (byte) (b + 7);  
    // b = b + 7; // Error de compilación
    System.out.println("b: " + b);

    double r = 135%256;
    double E = r > 127 ? r - 256 : r;
    System.out.println("E: " + E); 
    
    // Casting
    // Widening
    int i = 10;
    long l = i;
    System.out.println("Widening: " + l);
    
    // Narrowing
    long l2 = 10L;
    int i2 = (int) l2;
    System.out.println("Narrowing: " + i2);

    final int[] array = { 1, 2, 3 };
    // array = new int[] { 4, 5, 6 }; // Error de compilación, ya que es final 
    array[0] = 4;                     // OK, los elementos si se pueden cambiar

/*    
    // Casting Objects
    // Upcasting
    Animal a = new Horse();
    System.out.println("Upcasting: " + a.especie);
    a.eat();
    
    // Downcasting
    Horse h = (Horse) a;
    System.out.println("Downcasting: " + h.especie);
    h.eat();
    h.neigh();
 */   
    // ClassCastException
    //Animal a2 = new Animal();
    // Horse h2 = (Horse) a2;
    // h2.eat();
    
  }
  
}
