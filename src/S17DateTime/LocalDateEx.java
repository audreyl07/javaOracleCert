package S17DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

public class LocalDateEx {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println("Current Date: " + date);

        int year = date.getYear();
        int month = date.getMonthValue();
        Month monthName = date.getMonth();
        int day = date.getDayOfMonth();
        int dayOfYear = date.getDayOfYear();
        int dayOfMonth = date.getDayOfMonth();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int dayOfWeekValue = date.getDayOfWeek().getValue();

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Month Name: " + monthName);
        System.out.println("Day: " + day);
        System.out.println("Day of Year: " + dayOfYear);
        System.out.println("Day of Month: " + dayOfMonth);
        System.out.println("Day of Week: " + dayOfWeek);
        System.out.println("Day of Week Value: " + dayOfWeekValue);

        Calendar calendar = Calendar.getInstance();
        System.out.println("Calendar Date: " + calendar.get(Calendar.DAY_OF_WEEK));

        LocalDate twoWeeksAgo = date.minusWeeks(2);
        System.out.println("Two Weeks Ago: " + twoWeeksAgo);

        LocalDate fiveDaysLater = date.plusDays(5);
        System.out.println("Five Days Later: " + fiveDaysLater);

        System.out.println("Current Date: " + date);
        date = date.plusDays(10);
        System.out.println("Current Date after adding 10 days: " + date);




    }
}
