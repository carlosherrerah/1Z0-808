package oca.c1;

interface I1 {
  public static final int I = 10;
  public static final int[][] A = new int[2][2];
  
  public abstract void m1() ;
  default void m3() { }; // Método por defecto
  static  void m2() { }; // Método estático

}

