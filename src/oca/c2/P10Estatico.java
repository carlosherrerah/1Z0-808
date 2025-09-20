package oca.c2;

class Padre {
    static int x = 10;

    public static void metodoEstatico() {
        System.out.println("Método estático de la clase Padre");
    }
}

class Hijo extends Padre {
    
    public static void metodoEstatico() {  // Si no existiera este método, se hereda el de Padre
        System.out.println("Método estático de la clase Hijo"); // Redefinición, no sobreescritura @Override
    }

}

class Main {
    public static void main(String[] args) {
		System.out.println("\033[H\033[2J"); // limpiar pantalla        
        Padre p = new Padre();
        p.metodoEstatico(); // Imprime "Método estático de la clase Padre"
        Padre.metodoEstatico(); // En realidad pertence a la clase, no al objeto
        System.out.println("Valor de p.x: " + p.x); // Padre.x

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
