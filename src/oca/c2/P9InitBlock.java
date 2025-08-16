package oca.c2;

class Init {
    static int[] x = new int[4];

    Init() {
        super();
        System.out.println("no-arg const");
    }

    Init(int x) {
        super();
        System.out.println("1-arg const");
    }

    static {
        System.out.println("1st static init");
    }
    {
        System.out.println("1st instance init");
    }
    static {
        x[3] = 40;
        System.out.println("x[3] = " + x[3]);
    }
    {
        System.out.println("2nd instance init");
    }
    static {
        System.out.println("2nd static init");
    }

    public static void main(String[] args) {
        System.out.println("\nMain method");
        System.out.println("\n1st Object: ");
        new Init();
        System.out.println("\n2nd Objeto: ");
        new Init(7);
        System.out.println(". . .Hecho");
    }

}
