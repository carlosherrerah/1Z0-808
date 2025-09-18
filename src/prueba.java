public class Prueba {

    public static void main(String[] args) {
        // Explicame el siguiente codigo de java:
        //¿ cuando apuntan a la misma direccion ?

        System.out.println("------> Integer cache");
        Integer i1 = 10;
        Integer i2 = 10;
        if (i1 != i2)
            System.out.println("diferentes Objectos");
        if (i1.equals(i2))
            System.out.println("mismo valor");
        Integer i3 = 1000;
        Integer i4 = 1000;
        if (i3 == i4)
            System.out.println("mismo objeto");
        if (i3.equals(i4))
            System.out.println("mismo valor");
        System.out.println("<------");

    }
}
