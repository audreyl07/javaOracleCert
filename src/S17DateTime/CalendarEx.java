package S17DateTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarEx {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Months are 0-based
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);
        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        int hour = calendar.get(Calendar.HOUR);
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int miliSecond = calendar.get(Calendar.MILLISECOND);
        Date date = calendar.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy hh.mm");
        String formattedDate = sdf.format(date);

        System.out.println("Current Year: " + year);
        System.out.println("Current Month: " + month);
        System.out.println("Week of Year: " + weekOfYear);
        System.out.println("Week of Month: " + weekOfMonth);
        System.out.println("Day of Year: " + dayOfYear);
        System.out.println("Day of Month: " + dayOfMonth);
        System.out.println("Day of Week: " + dayOfWeek);
        System.out.println("Hour: " + hour);
        System.out.println("Hour of Day: " + hourOfDay);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
        System.out.println("Millisecond: " + miliSecond);
        System.out.println("Formatted Date: " + formattedDate);

        Calendar bday = Calendar.getInstance();
        bday.set(2006, Calendar.JULY, 27);
        System.out.println("Birthday: " + bday.getTime());


    }
}
