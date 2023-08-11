package dateTime;

import java.time.LocalDateTime;

public class Task2 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2022,5,31,19,47);
        LocalDateTime plusMonths = dateTime.plusMonths(3);
        System.out.println(dateTime.toLocalDate());
        System.out.println(plusMonths.toLocalDate());
    }
}
