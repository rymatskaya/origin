package files;

import java.util.Scanner;

public class menuOrders {
    private static Scanner scanner = new Scanner(System.in);

    public static void menuOrders() {
        while (true) {
            String str = """
                     1 - Вывод списка заказов на экран
                     2 - Добавить заказ
                     3 - Удалить заказ
                     0 - Вернуться в главное меню                   
                                        
                    """;
            System.out.println(str);
            System.out.print("Выберите вариант меню: ");
            String step = scanner.nextLine();

            if (step.equals("1")) {
                System.out.println(" Вывод списка заказов");
                //Вызов операции  списка заказов
            } else if (step.equals("2")) {
                System.out.println("Добавить заказ");
                //Вызов операции добавления заказа
            } else if (step.equals("3")) {
                System.out.println("Удалить заказ");
                //Вызов операции удаления заказа
            } else if (step.equals("0")) {
                Menu.start();
                break;
                //Вызов операции удаления товара
            }
        }

    }
}
