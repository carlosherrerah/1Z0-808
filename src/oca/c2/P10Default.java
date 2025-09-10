package oca.c2;

interface IFrogBoilable {
    static int getCtoF(int celsius) {
        return (celsius * 9 / 5) + 32;
    }

    default String hop() {
        return "The frog hops!";
    }

    String bye();
}

class DongBoilFrogs implements IFrogBoilable {

    @Override
    public String bye() {
        return "The frog says goodbye!";
    }

    void go() {
        System.out.println("hop: " + hop());
        System.out.println("bye: " + bye());
        System.out.println("C2F: " + IFrogBoilable.getCtoF(25));

        IFrogBoilable ifb = new DongBoilFrogs();
        System.out.println("hop: " + ifb.hop());
        System.out.println("bye: " + ifb.bye());
        System.out.println("C2F: " + IFrogBoilable.getCtoF(30));
    }


    // This class can use the static method and the default method
    public static void main(String[] args) {
        DongBoilFrogs dbf = new DongBoilFrogs();
        System.out.println(dbf.hop()); // default method
        System.out.println(dbf.bye()); // implemented method
        System.out.println(IFrogBoilable.getCtoF(100)); // static method

        new DongBoilFrogs().go();

    }

}
