package dateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Task5 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate postDate = LocalDate.of(2018,7,7);

        Period period = Period.between(currentDate, postDate);
        System.out.println(period);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());

        long between = ChronoUnit.DAYS.between(currentDate, postDate);
        System.out.println(between);
    }
}
