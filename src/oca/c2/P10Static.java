package oca.c2;

class Frog {
    static /* static */ int frogCount; // Declare and initialize static variable
    int x = 3;

    static int getCount() { // Static method to access the static variable
        return frogCount;
    }

    public Frog() {
        frogCount += 1; // Modify the value in the constructor
    }

    void go() {
        System.out.println("from inst " + Frog.getCount());
    }

    public static void main(String[] args) {
        new Frog();
        new Frog();
        Frog f = new Frog();
        Frog f2 = new Frog();
        System.out.println("frogCount      is now " + frogCount);
        System.out.println("f.frogCount    is now " + f.frogCount);
        System.out.println("Frog.frogCount is now " + Frog.frogCount);
        System.out.println("x is now " + f.x);

        new Frog().go();

    }
}