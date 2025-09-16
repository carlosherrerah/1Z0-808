public class Prueba {

    static String s;

    static void go() { // recursion gone bad
        go();
    }

    public static void main(String[] args) {
        go(); // StackOverflowError
        System.out.println(s.length());// NullPointerException

        String a = "123G";
        int b = Integer.parseInt(a); // NumberFormatException

    }
}
