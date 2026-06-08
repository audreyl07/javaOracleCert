package S17DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatEx {
    public static void main(String[] args) {
        LocalDate customDate = LocalDate.of(2024, 6, 15);
        LocalTime customTime = LocalTime.of(14, 30, 45);
        LocalDateTime customDateTime = LocalDateTime.of(customDate, customTime);
        System.out.println("Custom Date: " + customDate);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMMM, dd, yyyy \nhh:mm:ss");
        System.out.println("Formatted Date and Time: " + dateFormatter.format(customDateTime));

        //ISO Format
        DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println("ISO Formatted Date and Time: " + isoFormatter.format(customDateTime));

        //Local Format
        DateTimeFormatter localFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println("Local Formatted Date: " + localFormatter.format(customDate));


    }
}
