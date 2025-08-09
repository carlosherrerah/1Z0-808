package oca.m4;

public class EjemploMatrices {

    public static void ejecutar() {

        System.out.println("\n--- Matrices unidimensionales ---");
        int[] unidimensional = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < unidimensional.length; i++) {
            System.out.print(unidimensional[i] + "\t");
        }
        System.out.println();

        for (int n : unidimensional) {
            System.out.println(n);
        }

        System.out.println("\n--- Matrices bidimensionales ---");

        char[][] tablero = new char[3][3];
        tablero[1][1] = 'X';
        tablero[0][2] = 'O';

        int filas = 3, columnas = 4;
        int[][] tabla = new int[filas][columnas];

        for (int i = 0; i < filas; i++)
            for (int j = 0; j < columnas; j++)
                tabla[i][j] = (i + 1) * (j + 1);

        for (int[] fila : tabla) {
            for (int val : fila)
                System.out.print(val + "\t");
            System.out.println();
        }
    }
}
