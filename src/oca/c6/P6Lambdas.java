package oca.c6;

import java.util.function.Predicate;

// Predicate is a functional interface
public class P6Lambdas {

  static int adder(int a, int b) {
    return a + b;
  }

  void go(Predicate<P6Lambdas> e) {  // imagina que e =  x -> 7 > 5
    P6Lambdas m2 = new P6Lambdas();
    System.out.println(e.test(m2) ? "Match" : "No match");
  }

  public static void main(String[] args) {
    // Using lambda expression
    Predicate<String> p = s -> s.length() > 5;
    System.out.println("Hello: " + p.test("Hello")); // false
    System.out.println("Hello World: " + p.test("Hello World")); // true

    // Using method reference
    //Predicate<String> p2 = s -> s.isEmpty(); 
    Predicate<String> p2 = String::isEmpty;

    System.out.println("Empty String:  " + p2.test("")); // true
    System.out.println("Hello isEmpty: " + p2.test("Hello")); // false

    // Using lambda expression
    Predicate<Dog> p3 = d -> d.getEdad() > 5;
    System.out.println("Fido: " + p3.test(new Dog("Fido", 10, 5, null)));

    System.out.println("\nUsing lambda expression:");
    P6Lambdas m1 = new P6Lambdas();

    m1.go(x -> false); // No match
    m1.go(x -> 7 > 5); // Match
    m1.go(x -> x instanceof P6Lambdas); // Match
    m1.go((P6Lambdas x) -> x instanceof P6Lambdas); // Match

    System.out.println("\nSumas:");
    m1.go(x -> adder(3, 4) == 7); // Match

    m1.go(x -> {
      return adder(3, 4) == 7;
    }); // Match

    m1.go(x -> {
      int y = 4;
      return adder(y, 5) > 10;
    }); // No Match

  }

}
