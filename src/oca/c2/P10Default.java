package oca.c2;

interface IFrogBoilable {
    static int getCtoF(int celsius) {
        return (celsius * 9 / 5) + 32;
    }

    default String hop() {
        return "The frog hops!";
    }
}

class DongBoilFrogs implements IFrogBoilable {
    void go() {
        System.out.println("C to F: " + IFrogBoilable.getCtoF(25));
        System.out.println("hop: " + hop());

        DongBoilFrogs dbf = new DongBoilFrogs();
        System.out.println(IFrogBoilable.getCtoF(100));  // Lo ve como un método estático
        System.out.println(dbf.hop());  // Lo ve como un método de instancia

    }


    // This class can use the static method and the default method
    public static void main(String[] args) {
        DongBoilFrogs dbf = new DongBoilFrogs();
        dbf.hop();
        System.out.println("C to F: " + IFrogBoilable.getCtoF(100));

        new DongBoilFrogs().go();

    }

}
