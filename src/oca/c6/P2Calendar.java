package oca.c6;

// import java.util.Calendar; // obsoleta deprecated
// import java.util.GregorianCalendar;
import java.time.LocalDate; // without hour, minute, second, millisecond  Moderna 
import java.time.LocalDateTime; // with    hour, minute, second, millisecond
import java.time.LocalTime; // without date
import java.time.Period; // period of time: years, months and days
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

// inmutable: No existe new en la clase LocalDate, LocalDateTime, LocalTime, Period
public class P2Calendar {

  public static void main(String[] args) {
    System.out.println("\033[H\033[2J"); // limpiar pantalla        

    // we never used the keyword new in the code
    LocalDate ld1 = LocalDate.of(2_015, 1, 15);
    LocalDate ld2 = LocalDate.parse("2015-01-15");

    LocalDate ld = LocalDate.now(); // 2025-09-20
    LocalTime lt = LocalTime.now(); // 21:31:46.853
    LocalDateTime ldt = LocalDateTime.now(); // 2025-09-20T21:31:46.853

    System.out.println("Nombre dia de la semana:    " + ld.getDayOfWeek()); // name of the day
    System.out.println("Valor del dia de la semana: " + ld.getDayOfWeek().getValue()); // [1..7] Monday to Sunday

    System.out.println("Fecha de hoy: " + ld); // 2025-09-20
    
    // LocalDateTime d1 = new LocalDateTime(); // won’t compile
    LocalDateTime d1 = LocalDateTime.now(); // will compile

    Period p1 = Period.between(ld2, LocalDate.now()); // (menor, mayor)
    System.out.println("Periodo entre dos fechas:  " +p1); // P10Y8M4D
    System.out.println("Extraer años del periodo : " + p1.getYears()); // 10

    System.out.println("dias until: " + ld.until(LocalDate.of(2025, 3, 8), ChronoUnit.DAYS)); // días de diferencia
    System.out.println("dias entre: " + ChronoUnit.DAYS.between(LocalDate.of(2025, 3, 8), LocalDate.now())); // días de diferencia

    Period p = Period.of(1, 2, 3); // 1 year, 2 months, 3 days P1Y2M3D
    //     p = Period.of(0, 0, 0); // P0D
    //     p = Period.ofMonths(1); // P1M

    DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
    // DateTimeFormatter DTF = DateTimeFormatter.ofPattern("E MMM dd, yyyy");

    System.out.println("Hoy con formato: " + ld.format(DTF));
    System.out.println("fecha futura:    " + ld.plus(p));

  }

}
