package Java_1_8_Features;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class NewTimeApi {
    public static void main(String[] args) {
        // Current Date
        LocalDate today = LocalDate.now();
        System.out.println("Current Date=" + today);

        // Creating LocalDate by providing input arguments
        LocalDate firstDay_2014 = LocalDate.of(2014, Month.JANUARY, 1);
        System.out.println("Specific Date=" + firstDay_2014);

        // Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
        LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Date in IST=" + todayKolkata);

        // Current Time
        LocalTime time = LocalTime.now();
        System.out.println("Current Time=" + time);

        // Creating LocalTime by providing input arguments
        LocalTime specificTime = LocalTime.of(12, 20, 25, 40);
        System.out.println("Specific Time of Day=" + specificTime);

        LocalTime timeKolkata = LocalTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Time in IST=" + timeKolkata);

        // Getting date from the base date i.e 01/01/1970
        LocalTime specificSecondTime = LocalTime.ofSecondOfDay(10000);
        System.out.println("10000th second time= " + specificSecondTime);

    }
}
