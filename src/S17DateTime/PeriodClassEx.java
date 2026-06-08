package S17DateTime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodClassEx {
    public static void main(String[] args) {
        Period period = Period.of(5, 11, 20);
        System.out.println("Period: " + period);

        LocalDate date = LocalDate.now();
        System.out.println("Current Date: " + date);

        LocalDate futureDate = date.plus(period);
        System.out.println("Future Date after adding Period: " + futureDate);
    }
}
