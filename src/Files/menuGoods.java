package Files;

import java.util.Scanner;

public class menuGoods {

    private static Scanner scanner = new Scanner(System.in);

    public static void menuGoods() {
        while (true) {
            String str = """
                     1 - Вывод списка товаров на экран
                     2 - Добавить товар
                     3 - Удалить товар
                     0 - Вернуться в главное меню                   
                                        
                    """;
            System.out.println(str);
            System.out.print("Выберите вариант меню: ");
            String step = scanner.nextLine();

            if (step.equals("1")) {
                System.out.println(" Вывод списка");
                //Вызов операции вывода списка
            } else if (step.equals("2")) {
                System.out.println("Добавить товар");
                //Вызов операции добавления товара
            }  else if (step.equals("3")) {
            System.out.println("Удалить товар");
            //Вызов операции удаления товара
             }
            else if (step.equals("0")) {
                Menu.start();
                break;
                //Вызов операции удаления товара
            }

        }
    }
}
