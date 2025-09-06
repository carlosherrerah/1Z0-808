package oca.c2;

interface I1 {
    default int doStuff() {
        return 1;
    }

    default int doCosas() {
        return 10;
    }

    static int doOtras() {
        return 20;
    }

}

interface I2 {
    default int doStuff() {
        return 2;
    }
}

public class P6MultiInterface implements I1, I2 {
    // must override doStuff() because of conflict between I1 and I2
    @Override
    public int doStuff() { // public
        return 3;
    }

    void go() {
        System.out.println(doStuff());
    }

    public static void main(String[] args) {
        new P6MultiInterface().go(); // 3
        P6MultiInterface a = new P6MultiInterface();
        System.out.println(a.doStuff()); // 3
        System.out.println(a.doCosas());
        System.out.println(I1.doOtras());

    }
}
