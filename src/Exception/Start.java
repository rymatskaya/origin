package Exception;

import java.util.Scanner;

public class Start {
    public static void start() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите делимое " );
        long x = in.nextLong();
        System.out.println("Введите делитель " );
        long y = in.nextLong();
        try {
            // Эта строка будет выполнена
            valid(x, y);
            System.out.println(Divide.divide(x, y));
        } catch (NullPointerException e) {
            System.out.println("Деление " + x + " на " + y + ". Проверьте входны е данные. ");
        }  catch (ArithmeticException e) {
            System.out.println("Ошибка при делении " + x + " на " + y);
        }   catch (MyException e) {
                  e.printStackTrace();
        }

    }

    private static void valid(long x, long y) throws MyException {
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE
                || y > Integer.MAX_VALUE || y < Integer.MIN_VALUE)
        {
            throw new MyException("Ошибка!!!");
        }
    }
}
