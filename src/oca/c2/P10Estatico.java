package oca.c2;

class Padre {
    static int x = 10;
    public static void metodoEstatico() {
        System.out.println("Método estático de la clase Padre");
    }
}

class Hijo extends Padre {
    
    public static void metodoEstatico() {
        System.out.println("Método estático de la clase Hijo");  // Redefinición
    }
        
}

class Main {
    public static void main(String[] args) {
        Padre p = new Padre();
        p.metodoEstatico(); // Imprime "Método estático de la clase Padre"
        System.out.println("Valor de p.x: " + p.x); //  Padre.x

        Hijo h = new Hijo();
        h.metodoEstatico(); // Imprime "Método estático de la clase Hijo"
        System.out.println("Valor de h.x: " + h.x); // Hijo hereda x de Padre

        System.out.println();
        Padre ph = new Hijo();
        ph.metodoEstatico(); // Imprime "Método estático de la clase Padre"

        System.out.println();
        Padre.metodoEstatico(); // Imprime "Método estático de la clase Padre"
        Hijo.metodoEstatico(); // Imprime "Método estático de la clase Hijo"
    }
}
