package oca.c4;

interface Foo {
}

class A implements Foo {
}

class B extends A {

  public static void m2(A a) {
    if (a instanceof B) {
      System.out.print("m2(A x) -> ");
      ((B) a).doBstuff(); // downcasting an A reference to a B reference
    }
  }

  public static void m2(B b) {
    System.out.print("m2(B b) ->");
    b.doBstuff();
  }

  public static void doBstuff() {
    System.out.println("doBstuff()");
  }
}

public class P3instanceOfC4 {

  public static void main(String[] args) {
    System.out.println("\033[H\033[2J"); // limpiar pantalla
    // instanceof
    System.out.println("instanceof");
    String s = "Hola";
    System.out.println(s instanceof String);
    System.out.println(s instanceof Object);
    System.out.println(s instanceof Comparable);
    System.out.println(s instanceof java.io.Serializable);
    System.out.println(null instanceof String); // false

    System.out.println("\ninstanceof con clases: a");
    A a = new A();
    B.m2(a);
    
    System.out.println("\ninstanceof con clases: b");
    B b = new B();
    b.m2(b);
    B.m2(b);
    
    System.out.println("\ninstanceof con clases: ab");
    A ab = new B();
    B.m2(ab);
    ((B) ab).m2(ab);
    
    System.out.println("");
    System.out.println(a instanceof Foo);
    System.out.println(b instanceof A);
    System.out.println(b instanceof Foo);

    //System.out.println(A instanceof B); // compila ?

  }
}
