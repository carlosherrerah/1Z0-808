package oca.c1.p2Accesos.d2;
import oca.c1.p2Accesos.d1.Parent;
import oca.c1.p2Accesos.d1.Apple;

public class Child extends Parent{

  public void testIt() {
    System.out.println("x = " + x);

    Parent p = new Parent();
    //System.out.println("x = " + p.x);  // variable x is not visible here

    Child q = new Child();
    System.out.println("x = " + q.x);
  }
  
  public static void main(String[] args) {
    Child c = new Child();
    c.x = 5;
    c.edad = 20;
    c.testIt(); 

    Apple a = new Apple();
    a.eat();
    System.out.println(a.color);
  }

}
