import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class datex {
    public static void main(String[] args) {

        LocalTime lt = LocalTime.now();
        System.out.println("Current Time: " + lt);
        
        LocalDate ld = LocalDate.now();
        System.out.println("Current Date: " + ld.getDayOfMonth());

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Current Date and Time: " + ldt);

        System.out.println("Date and Time after adding 20 days: " + ldt.plusDays(20));

        System.out.println("Date and Time after adding 20 hours: " + ldt.plusHours(20));

        System.out.println("Formatted Date and Time: " + ldt.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss a")));

        @SuppressWarnings("unused")
        LocalDate ld1 = LocalDate.of(2024, 1, 1);
        
    }
}


