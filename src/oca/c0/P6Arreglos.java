package oca.c0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P6Arreglos {
  public static void main(String[] args) {
    int xx;
    // System.out.println(xx);  // Error, no se ha inicializado

    Scanner scanner = new Scanner(System.in);

    int[] numeros1 = new int[] {1, 2, 3, 4, 5};
    int[] numeros2 = {6, 7, 8, 9, 10};

    Integer b[] = new Integer[] { 10, 8, 4, 6 };  
    // Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.

    int[] c;
    c = new int[3];

    char[] saludo = new char[]{'H', 'e', 'l', 'l','o'};
    String[] despedida =  new String[]{"See", "You"};
    
    // El método valueOf() en Java es un método estático de la clase String 
    //   que se utiliza para convertir diferentes tipos de datos (números, booleanos, caracteres, objetos, etc.)
    //   en una representación en cadena (String).    
    boolean esActivo = true;
    String estado = String.valueOf(esActivo);
    System.out.println(estado); // "true"

    char letra = despedida[0].charAt(0);  // S
    String cadena = String.valueOf(saludo);
    cadena = new String(saludo);
    System.out.println(cadena);
    
    letra = '5';
    int numero = letra - 48;    // char to int
    System.out.println(numero+1);
    
    letra = 65;
    //letra ='A';
    System.out.println(letra);  // A

    String myStr = "Hello";    // String to char
    char[] myArray = myStr.toCharArray();
    System.out.println(myArray[0]);

    // Flexible y buenas practicas, generico, programacion por interfaz
    List<Integer> list = Arrays.asList(7, 3, 9, 10, 5);
    List<String> names = new ArrayList<>();
    names.add("Juan");
    names.add("Pedro");

    // ----------------------------------------------------------
    // Convert an array to an ArrayList.
    List<Integer> bList = Arrays.asList(b); // b is an array of Integer objects

    // Convert ArrayList to an array.
    Integer[] bArray = bList.toArray(new Integer[0]);

    // Matrices
    int[][] matrix = { { 1, 2, 3 }, 
                       { 4, 5, 6 }, 
                       { 7, 8, 9 } };
    int matrix2[][] = new int[3][3];
    int[] matrix3[] = new int[3][2];

    int[][] array2D = new int[][] { { 0 }, { 1 } };
    int[][][] array3D = { { { 0, 1 }, { 2, 3 }, { 4, 5 } } }; // 1X3X2
    int[][][] arrayD = { { { 0, 1, 3,4 }, { 2, 3,4,2 }, { 4, 5,6,7 } },{{1,2,3,4},{4,5,6,7},{8,7,6,5}} }; // 2X3X4
    matrix2[0][0] = 5;
    System.out.println("Ingrese un valor para la matriz 2: ");
    matrix2[0][1] = scanner.nextInt();

    System.out.println(". . .Hecho");

  }

}
