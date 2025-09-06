package oca.c2;

class Persona {
    void do1() {
    }
}

class Maestro extends Persona {
    void do2() {
    }
}

public class P5Casting { // Chrome
    public static void main(String[] args) {
        Persona p = new Persona();
        Maestro m = new Maestro();
        Persona pm = new Maestro();

        Persona x = m; // implicito
        x = (Persona) m; // explicito
        //pm = m;

        p = pm; // implicito
        p = (Maestro) pm; // explicito
        pm = m;

        m = (Maestro) pm;

        p = (Persona) m; // no se necesita cast p=maestro

        // m = (Maestro) p; // Persona cannot be cast to Maestro
        
        pm.do1();
        // pm.do2();  // no permitido

        ((Maestro) pm).do1();
        ((Maestro) pm).do2();

        m.do1();
        ((Persona) m).do1();

        m.do2();
        // ((Persona) m).do2(); // se puede ?

        System.out.println(". . . Hecho");
    }
}
