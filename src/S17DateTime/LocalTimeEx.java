package S17DateTime;

import java.time.LocalTime;

public class LocalTimeEx {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);

        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();

        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);

        LocalTime twoHoursAgo = time.minusHours(2);
        System.out.println("Two Hours Ago: " + twoHoursAgo);

    }
}
