package S17DateTime;
import java.time.LocalDateTime;
public class LocalDateTimeEx {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + dateTime);

        int year = dateTime.getYear();
        int month = dateTime.getMonthValue();
        int day = dateTime.getDayOfMonth();
        int hour = dateTime.getHour();
        int minute = dateTime.getMinute();
        int second = dateTime.getSecond();

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);

        LocalDateTime twoHoursAgo = dateTime.minusHours(2);
        System.out.println("Two Hours Ago: " + twoHoursAgo);

        LocalDateTime twoDaysLater = dateTime.plusDays(2);
        System.out.println("Two Days Later: " + twoDaysLater);
    }
}
