package oca.c2;

class Animal {
  String especie;

  Animal() {
    especie = "ET";
    // System.out.println("Animal constructor called");
  }

  protected String eat() {
    return "Animal eats All kinds of food";
  }

  private String drink() {
    return ("Animal drinking");
  }

}

class Horse extends Animal {


  Horse() {
    especie = "Equino";
    //System.out.println("Horse constructor called");
  }

  protected /*private*/ String eat() { // whoa! - it's private!
                                    // Cannot reduce the visibility of the inherited method from Animal
    return "Horse eating carrots";
  }

  public String eat(String food) { // Overloading, not overriding
    return "Horse eating " + food;
  }


  public String neigh() {
    return "Horse neighing: relincha";
  }

}

public class P2Herencia { // TestAnimals

  public String referencia(Animal a ) { 
    return "Animal";
  }

  public String referencia(Horse h ) {
    return "Hourse";
  }


  public static void main(String[] args) {
	System.out.println("\033[H\033[2J"); // limpiar pantalla    
    Animal a = new Animal();
    Horse h = new Horse();
    Animal ah = new Horse(); // Animal ref, but a Horse object

    System.out.println();
    System.out.println("a.especie: " + a.especie);
    System.out.println("h.especie: " + h.especie);
    System.out.println("ah.especie: " + ah.especie);

    System.out.println("a.eat(): " + a.eat()); 
    System.out.println("h.eat(): " + h.eat()); 
    System.out.println("ah.eat(): " + ah.eat()); 
    //System.out.println("ah.eat(alfalfa): " + ah.eat("alfalfa"));

    //System.out.println("a.neigh(): " + a.neigh());
    System.out.println("h.neigh(): " + h.neigh());
    //System.out.println("ah.neigh(): " + ah.neigh());

    P2Herencia p = new P2Herencia();
    System.out.println("\nReferencia!");
    System.out.println("a: " + p.referencia(a));  
    System.out.println("h: " + p.referencia(h));  
    System.out.println("ah: " + p.referencia(ah)); 

    System.out.println("\nCasting: -----------------");
    Animal _ah = h;
    System.out.println("_ah.especie: " + _ah.especie);
    System.out.println("_ah.eat(): " + _ah.eat());

    //Horse _ha = a;          // Error de compilacion: Type mismatch: cannot convert from Animal to Horse
    //Horse __ha = (Horse) a; // Error de ejecucion:   ClassCastException Animal cannot be cast Horse

    // System.out.println(ah.neigh()); // Error: cannot find symbol method neigh()
    Horse _h = (Horse) ah;
    System.out.println("\n_h.especie: " + _h.especie); 
    System.out.println("_h.eat(): " + _h.eat()); 
    System.out.println("_h.neigh(): " + _h.neigh());

    System.out.println("\n((Horse)ah).neigh(): " + ((Horse)ah).neigh());
  }
}
