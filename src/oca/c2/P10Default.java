package oca.c2;

interface IFrogBoilable {
    int VALOR = 5; // public static final int TEMPERATURE = 100;

    static int getCtoF(int celsius) {
        return (celsius * 9 / 5) + 32;
    }

    default String hop() {
        return "The frog hops!";
    }

    String bye();
}

class DongBoilFrogs implements IFrogBoilable {
    static final int VALOR = 10; //

    @Override
    public String bye() {
        return "The frog says goodbye!";
    }

    void go() {
        System.out.println("\nInside go(): ");
        System.out.println("hop: " + hop());
        System.out.println("bye: " + bye());
        System.out.println("valor: " + VALOR);
        System.out.println(DongBoilFrogs.VALOR);
        System.out.println(IFrogBoilable.VALOR);
        System.out.println("C2F: " + IFrogBoilable.getCtoF(25));
    }

    // This class can use the static method and the default method
    public static void main(String[] args) {
        DongBoilFrogs dbf = new DongBoilFrogs();
        System.out.println("hop: " + dbf.hop()); // default method, que forma parte de la clase
        System.out.println("bye: " + dbf.bye()); // implemented method
        System.out.println("valor: " + dbf.VALOR); // variable de clase
        System.out.println(DongBoilFrogs.VALOR); // variable de clase
        System.out.println(IFrogBoilable.VALOR); // variable estatica de interfaz
        System.out.println("C2F: " + IFrogBoilable.getCtoF(0)); // static method

        System.out.println("\nInterface: ");
        IFrogBoilable ifb = new DongBoilFrogs();
        System.out.println("hop: " + ifb.hop());
        System.out.println("bye: " + ifb.bye());
        System.out.println("valor: " + VALOR);
        System.out.println(ifb.VALOR);
        System.out.println(DongBoilFrogs.VALOR);
        System.out.println("C2F: " + IFrogBoilable.getCtoF(50));

        new DongBoilFrogs().go();

    }

}
