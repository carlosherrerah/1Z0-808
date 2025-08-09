package oca.c0;

public class P1TiposPrimitivos {

    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------");
        System.out.println(String.format("%-10s %-15s %-20s %-20s", 
                "Tipo", "Bytes", "Mínimo", "Máximo"));
        System.out.println("-------------------------------------------------------------");

        // Enteros
        mostrarInfo("byte", Byte.BYTES, Byte.MIN_VALUE, Byte.MAX_VALUE);
        mostrarInfo("short", Short.BYTES, Short.MIN_VALUE, Short.MAX_VALUE);
        mostrarInfo("int", Integer.BYTES, Integer.MIN_VALUE, Integer.MAX_VALUE);
        mostrarInfo("long", Long.BYTES, Long.MIN_VALUE, Long.MAX_VALUE);

        // Decimales
        mostrarInfo("float", Float.BYTES, Float.MIN_VALUE, Float.MAX_VALUE);
        mostrarInfo("double", Double.BYTES, Double.MIN_VALUE, Double.MAX_VALUE);

        // Caracteres default \u0000 
        mostrarInfo("char", Character.BYTES, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);

        // Boolean (no tiene MIN/MAX en Java) default false
        System.out.println(String.format("%-10s %-15d %-20s %-20s", 
                "boolean", 1, "false", "true"));
        
        System.out.println("-------------------------------------------------------------");

        // Ejemplo de casting
        System.out.println("\nEjemplo de casting:");
        int numero = 130;
        byte convertido = (byte) numero; // Overflow
        System.out.println("int 130 -> byte = " + convertido);

        double decimal = 9.78;
        int truncado = (int) decimal; // Pérdida de parte decimal
        System.out.println("double 9.78 -> int = " + truncado);

        char letra = 'A';
        int codigo = letra; // Conversión implícita
        System.out.println("char 'A' -> int = " + codigo);

        int codigoUnicode = 9731;
        char simbolo = (char) codigoUnicode;
        System.out.println("int 9731 -> char = " + simbolo);
    }

    private static void mostrarInfo(String tipo, int bytes, Object min, Object max) {
        System.out.println(String.format("%-10s %-15d %-20s %-20s", tipo, bytes, min, max));
    }
}
