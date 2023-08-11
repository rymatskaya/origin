package dateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task6 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate postDate = LocalDate.of(2018,7,7);

        LocalDateTime localDateTime = currentDate.atStartOfDay(); //начало дня
        LocalDateTime localDateTime1 = LocalDateTime.of(postDate, LocalTime.MIDNIGHT);

        Duration between = Duration.between(localDateTime1, localDateTime);
        System.out.println(between.getSeconds());
    }
}
