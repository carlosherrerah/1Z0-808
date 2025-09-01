
class Person {
  static int pid;

  int age;
  String name;

  Person(String s, int i) {
    ++pid;
    name = s;
    age = i;
  }

}

public class Evaluacion {
  int a = 10;
  static int x1 = 10;

  public void print() {
    int a = 8;
    System.out.print(a + " ");
  }

  public void print(int a) {
    // int c = b / a;
    // System.out.print(c);
  }

  public void pass() {
    int a = 10, b = 20;
    print(a);
  }

  private Person change(Object o) {
    Person p2 = (Person) o;
    p2.age = 25;
    return p2;
  }

  int change(int x) {
    x = 12;
    return x;
  }

  public static void main(String[] args) {
   	System.out.println("\033[H\033[2J"); // limpiar pantalla
    System.out.println("--------------------------------------------------------------------");

    // pregunta 1
    System.out.println("\nP1 ");

    int[] a = { 1, 2, 3, 4, 5, 6 };
    int i = a.length - 1;

    while (i >= 0) {
      System.out.print(a[i]);
      i--;
    }
    
    // pregunta 2
    System.out.println("\nP2 ");
    int x = 0, y = 10;
    try {
      y /= x;
    }
    // System.out.print("/ by 0"); // Este es el error
    catch (Exception e) {
      System.out.print("error");
    }
    System.out.println();

    // pregunta 3
    // B D E

    // pregunta 4
    // C E

    // pregunta 5
    // D
    System.out.println("\nP5");
    int a1[] = { 1, 2, 053, 4 };
    int b[][] = { { 1, 2, 4 }, { 2, 2, 1 }, { 0, 43, 2 } };
    System.out.print(a1[3] == b[0][2]);
    System.out.println(" " + (a1[2] == b[2][1]));

    // pregunta 6
    // D
    System.out.println("\nP6");    
    int a2[][] = new int[3][];
    a2[1] = new int[] { 1, 2, 3 };
    a2[2] = new int[] { 4, 5 };
    System.out.println(a2[1][1]);
    // System.out.println(a2[0][0]); // ArrayIndexOutOfBoundsException

    // pregunta 7
    // B D E

    // Pregunta 8
    // E. 8
    System.out.println("\nP8");

    new Evaluacion().print();
    Evaluacion ev1 = new Evaluacion();
    System.out.println(ev1.a);

    // Pregunta 9
    // E
    new Evaluacion().pass();

    // Pregunta 10
    // D
    System.out.println("\nP10");
    for (int x1 = 0; x < 5; x++) {
    }
    System.out.println(x1);
    System.out.println(Evaluacion.x1);
    System.out.println("------");

    // Pregunta 11
    // A
    System.out.println("\nP11");
    Person p1 = new Person("John", 22);
    Evaluacion te = new Evaluacion();
    Person p2 = te.change(p1);
    System.out.println(p2.pid + " " + p2.name + " " + p2.age);
    System.out.println(p1.pid + " " + p1.name + " " + p1.age);

    // Pregunta 12
    // B. 22
    System.out.println("\nP12");    
    int x2 = 10;
    int y2 = new Evaluacion().change(x);
    System.out.println(x2 + y2);

    // Pregunta 13
    // D. Java
    System.out.println("\nP13");
    String s = "Java";
    s.concat(" SE 6");
    s.replace('6', '7');
    System.out.print(s);


    
  }

}