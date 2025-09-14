package oca.c3;
// Usar Debug Java

import java.time.LocalDate;

class Bar {
  int barNum = 28;
  LocalDate date= LocalDate.now();
}

class Foo {
  Bar myBar = new Bar();
  String name="Foo";  

  void changeIt(Bar myBar) {
    myBar.barNum = 99;
    System.out.println("myBar.barNum in changeIt is " + myBar.barNum);
    myBar = new Bar(); // local myBar is reassigned a new Bar object
    myBar.barNum = 420;
    System.out.println("myBar.barNum in changeIt is now " + myBar.barNum);
  }

  public static void main(String[] args) {
    System.out.println("\033[H\033[2J"); // limpiar pantalla
    Foo f = new Foo();
    System.out.println("f.myBar.barNum is " + f.myBar.barNum);
    f.changeIt(f.myBar);  // shadowing variable
    System.out.println("f.myBar.barNum after changeIt is " + f.myBar.barNum); // 99 or 28 or 420?
  }
}
// Stack (main)
// f = #1 -> |myBar = #2   -> |barNum = 28 99
//           |name = "Foo"    |date = hoy

// Stack (changeIt)
// myBar = #2 -> |barNum = 99   
//               |date = hoy
// myBar = #3 -> |barNum = 28 420
//               |date = hoy

