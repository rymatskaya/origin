// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package Main;
import Rainbow.Rainbow;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Rainbow rainbow = new Rainbow();
        rainbow.setColor(5);
        System.out.println(rainbow.getColor());
        System.out.println("Введите тон радуги? (от 0 до 6)");
        int color = in.nextInt();
        System.out.println("Введите полутон радуги? (от 0 до 6)");
        int ton = in.nextInt();

        System.out.println("Основной тон:");
        System.out.println(rainbow.getColor(color));
        System.out.println("Основной с оттенком:");

        System.out.println(rainbow.getColor(ton,color));

        /*
        * Создать два класса (в разных пакетах), первый - только для запуска второй класс - Радуга.
        * Класс Радуга должен уметь выводить названия цветов по введенным номерам цветов.
        * (сопоставление цвет-номер на ваше усмотрение).
        * Класс Радуга может выводить не только основные цвета но еще и полуцвета
        * (например, желто-зеленый);
        * Способ задания номеров цвета придумать самостоятельно.
        * Использовать для решения задачи if и switch.
        * Методы можно вызывать друг из друга. Постарайтесь уменьшить дублирование кода.
        *  Обратить внимание на именование методов, классов, переменных и констант.
        */


    }
}