import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Prueba {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimal = new DecimalFormat("#,##0.00", symbols);
        double numero = 1000.0;
        System.out.println(decimal.format(numero));

        
    }
}