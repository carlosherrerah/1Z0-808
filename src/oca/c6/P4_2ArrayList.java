package oca.c6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P4_2ArrayList {
  static int x1; // 0
  static Integer X2; // null
  int x3;

  public static void doStuff(int x) {
    int y = x++;
    System.out.println(y);
  }

  public static void main(String[] args) {
    System.out.println("\033[H\033[2J"); // limpiar pantalla
    doStuff(x1); // 0
    // doStuff(X2); // null pointer exception

    // Arreglos Estaticos
    Integer[] a = new Integer[2];
    a[0] = 2;
    a[1] = 1;
    System.out.println("Arreglo Estatico: " + Arrays.toString(a));

    // A Dinamico
    List<Integer> lista = new ArrayList<>(Arrays.asList(a));
    lista.add(3); // no se puede agregar mas elementos
    System.out.println("Arreglo a Dinamico: " + lista);
    
     // A Estatico
     Integer[] b = lista.toArray(new Integer[0]); // new Integer[0] o new Integer[lista.size()]
     System.out.println("Arreglo a Estatico: " + Arrays.toString(b));
     
     
     // ArrayList --------------------------------------------------------------
     
     List<Integer> lista1 = new ArrayList<>(); // Diamond Operator
     System.out.println("Lista vacia: " + lista1);
     
     lista1.add(5);
     lista1.add(10);
     lista1.add(new Integer("15"));
     // lista1.add("20"); // No es un Integer
     lista1.add(1, 7); // indicando la posicion a insertar
     lista1.add(0, 3);
     System.out.println("Lista llena: "+ lista1);
     System.out.println("valor en la posicion 2: " + lista1.get(2)); // obtener el valor de la posicion 2
     System.out.println("indice donde esta el numero 10: " + lista1.indexOf(10)); // obtener la posicion del valor 10
     System.out.println("existe el valor 7: " + lista1.contains(7)); // verificar si contiene el valor 7
     lista1.remove(1); // eliminar el valor la posicion 1
     lista1.remove(new Integer(10)); // eliminar el valor 10

     System.out.println(lista1);
     System.out.println("tamaño: " + lista1.size());
     lista1.clear(); // limpiar la lista  

    System.out.println(". . . Hecho");
  }

}
