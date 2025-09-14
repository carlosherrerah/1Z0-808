package oca.c3;

class Layout { // class
    static int s; // static variable
    int x; // instance variable
    {
        x = 7;
        int x2 = 5;
    } // initialization block

    Layout() {
        x += 8;
        int x3 = 6;
        s++;
    } // constructor

    void doStuff() { // method
        int y =0; // local variable
        //int z = 0; // local variable
        for (int z = 0; z < 4; z++) { // 'for' code block
            y += z + x;
        }
    }
}

public class P3Scope {
    public static void main(String[] args) {
        new Layout();  // x=15, s=1
        Layout layout = new Layout();  // x=15, s=2
        layout.doStuff();
        System.out.println(layout.x);
        System.out.println(Layout.s); //Variable static
        System.out.println(layout.s); // tricky
        System.out.println(". . . Hecho");
    }

}
