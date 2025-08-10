import examples.TestPagos;
public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Hello, World!");
		System.out.println("\033[H\033[2J"); // limpiar pantalla
		
        Argumentos.main("a", "b", "1");
        TestPagos.main(args);

        System.out.println(". . . Hecho");
    }
}
