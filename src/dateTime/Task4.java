package dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task4 {
    public static void main(String[] args) {
        String text = "26-03-2023T15:46";
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime parse = LocalDateTime.parse(text, formatter);
        System.out.println(parse);
        System.out.println(parse.plusDays(10));
    }
}
