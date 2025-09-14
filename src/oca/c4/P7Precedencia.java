package oca.c4;

public class P7Precedencia {
  public static void main(String[] args) {
    System.out.println("\033[H\033[2J"); // limpiar pantalla
    System.out.println("U M A R E L S A ");
    System.out.println("1 " + (true & false == false | false));
    System.out.println("2 " + (true & (false == false) | true));
    System.out.println("3 " + (true & (false == false | true)));
    System.out.println("4 " + ((true & false) == (false | true)));
    System.out.println("5 " + ((true & false) == false | true));
    System.out.println("6 " + (true & false == (false | true)));

    boolean flag1 = true;
    boolean flag2 = false;
    boolean flag3 = true;
    boolean flag4 = false;

    System.out.println("7 " + (!flag1 == flag2 != flag3 == !flag4)); 
    System.out.println("8 " + (flag1 = flag2 != flag3 == !flag4)); 

    boolean flag = false;
    System.out.println("9 " + ( (flag = true) | (flag = false) || (flag = true) ));
    System.out.println("10 " + flag);
    // bitwise inclusive OR | has higher precedence over logical OR ||
    // || is a short-circuit operator and as left operand evaluates to true, hence
    // right operand is not evaluated.

    // Otro ejemplo con operadores de asignación y ternario
    int x = 1;
    int y = 2;
    int z = 3;
    int resultado = x > y ? x + y : x - y * z;
    System.out.println("Resultado: " + resultado); 

    // Ejemplo de precedencia de operadores
    int a = 5;
    int b = 10;
    int c = 15;
    flag = a + b * c > b && b - a < c || a == 5;
    System.out.println("flag: " + flag);

    System.out.println("\nPregunta 11 OCA");
    // Pregunta 11
    boolean b1 = false;
    boolean b2;
    x = 2; // 
    y = 5; // 
    b1 = 2 - 12 / 4 > 5 + -7 && b1 != y++ > 5 == 7 % 4 > ++x | b1 == true;

    System.out.println("b1 : " + b1);
    System.out.println("x  : " + x);
    System.out.println("y  : " + y);
    System.out.println();
    // b1 = true, x = 3, y = 6

    b2 = (2 - 12 / 4 > 5 + -7) && (b1 != y++ > 5) == (7 % 4 > ++x) | (b1 == true);

    System.out.println("b1 : " + b1);
    System.out.println("b2 : " + b2);
    System.out.println("x  : " + x);
    System.out.println("y  : " + y);
    // b1 = true,  b2 = true,  x = 4, y = 7

  }
}
