package files;

import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        while (true) {
            String str = """
                    Добро пожаловать!
                     1 - Работа с товарами
                     2 - Работа с заказами
                     0 - Выход из программы                   
                                        
                    """;
            System.out.println(str);
            System.out.print("Выберите вариант меню: ");
            String step = scanner.nextLine();

            if (step.equals("1")) {
                menuGoods.menuGoods();
                break;
            } else if (step.equals("2")) {
                System.out.println("orders");
                menuOrders.menuOrders();
            } else if (step.equals("0")) {
                return;
            }

        }
    }
}
