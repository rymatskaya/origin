package dateTime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Task1 {

    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        Instant instant = zonedDateTime.toInstant();
        System.out.println(instant.toEpochMilli());

        System.out.println(zonedDateTime.plus(3, ChronoUnit.DAYS));
        System.out.println("plusDays="+ zonedDateTime.plusDays(3));
        System.out.println("plus (weeks) = "+ zonedDateTime.plus(3, ChronoUnit.WEEKS));
        System.out.println("plus (years) ="+ zonedDateTime.plus(3, ChronoUnit.YEARS));

        System.out.println("minus (days) = "+ zonedDateTime.minus(3, ChronoUnit.DAYS));
        System.out.println("minusDays ="+ zonedDateTime.minusDays(3));

        System.out.println("Округление до дня ="+ zonedDateTime.truncatedTo(ChronoUnit.DAYS));

        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);
    }
}
