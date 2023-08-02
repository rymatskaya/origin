package orders;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
import java.util.stream.Collectors;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);


    public static void menu() throws IOException {
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
                menuGoods();
                break;
            } else if (step.equals("2")) {
                System.out.println("orders");
                menuOrders();
            } else if (step.equals("0")) {
                return;
            }
        }
    }

    public static void menuGoods() throws IOException {
        ArrayList<Good> goods = new ArrayList<>();

        goods.add(new Good(UUID.randomUUID(), "Мороженое", "01-07-2023"));
        goods.add(new Good(UUID.randomUUID(), "Пироженое", "05-07-2023"));
        goods.add(new Good(UUID.randomUUID(), "Печенье", "07-06-2023"));

        File file = Path.of("resource", "Goods.txt").toFile();
        getBufferedWriter(goods, file);

        while (true) {
            String str = """
                     1 - Вывод списка товаров на экран
                     2 - Добавить товар
                     3 - Удалить товар
                     0 - Вернуться в главное меню                   
                                        
                    """;
            System.out.println(str);
            System.out.println("Выберите вариант меню: ");
            String step = scanner.nextLine();

            if (step.equals("1")) {
                System.out.println(" Вывод списка");
                printInfo(file);
                //Вызов операции вывода списка
            } else if (step.equals("2")) {

                UUID id = UUID.randomUUID();
                System.out.println("Введите наименование товара: ");
                String nameGood = scanner.nextLine();
                System.out.println("Введите дату изготовления товара: ");
                String dateCreate = scanner.nextLine();
                goods.add(new Good(id, nameGood, dateCreate));
                getBufferedWriter(goods, file);

                //Вызов операции добавления товара
            } else if (step.equals("3")) {

                System.out.println("Удалить товар");
                System.out.print("Введите наименование товара: ");
                String nameGood = scanner.nextLine();

                for (int i = 0; i < goods.size(); i++) {
                    String s = goods.get(i).getNameGood();
                    if (s.equals(nameGood)) {
                        goods.remove(i);
                    }
                }
                getBufferedWriter(goods, file);

                //Вызов операции удаления товара
            } else if (step.equals("0")) {
                menu();
                break;
                //Вызов операции удаления товара
            }
        }

    }

    private static void getBufferedWriter(ArrayList<Good> goods, File file) {
        // BufferedWriter writer = null;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {

            for (Good good : goods) {
                writer.append(good.toString());
                writer.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void menuOrders() throws IOException {
        ArrayList<Good> goods1 = new ArrayList<>();

        goods1.add(new Good(UUID.randomUUID(), "Мороженое", "01-07-2023"));
        goods1.add(new Good(UUID.randomUUID(), "Пироженое", "05-07-2023"));

        ArrayList<Good> goods2 = new ArrayList<>();
        goods2.add(new Good(UUID.randomUUID(), "Печенье", "07-06-2023"));

        ArrayList<Order> orders = new ArrayList<>();

        orders.add(new Order(UUID.randomUUID(), goods1, "15-07-2023"));
        orders.add(new Order(UUID.randomUUID(), goods2, "16-07-2023"));

        File file = Path.of("resource", "Orders.txt").toFile();
        getBufferedWriterOrders(orders, file);

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
                printInfo(file);
                //Вызов операции  списка заказов

            } else if (step.equals("2")) {
                System.out.println("Добавить заказ");
                UUID id = UUID.randomUUID();
                ArrayList<Good> goods = new ArrayList<>();

                while (true) {

                    System.out.println("Введите наименование товара: ");
                    String nameGood = scanner.nextLine();
                    System.out.println("Введите дату изготовления товара: ");
                    String dateGood = scanner.nextLine();
                    System.out.println("Для выхода нажмите 0 ");
                    String inputEnd = scanner.nextLine();
                    goods.add(new Good(UUID.randomUUID(), nameGood, dateGood));

                    if (inputEnd.equals("0")) {
                        break;
                        //Вызов операции удаления товара
                    }

                }
                System.out.println("Введите дату заказа: ");
                String dateCreate = scanner.nextLine();
                orders.add(new Order(id, goods, dateCreate));
                getBufferedWriterOrders(orders, file);

            } else if (step.equals("3")) {
                System.out.println("Удалить заказ");
                System.out.println("Введите дату заказа: ");
                String dateOrder = scanner.nextLine();

                for (int i = 0; i < orders.size(); i++) {
                    String s = orders.get(i).getDateOrder();
                    if (s.equals(dateOrder)) {
                        orders.remove(i);
                    }
                }
                getBufferedWriterOrders(orders, file);
                //Вызов операции удаления заказа

            } else if (step.equals("0")) {
                menu();
                break;
                //Вызов операции удаления товара
            }
        }
    }

    private static void getBufferedWriterOrders(ArrayList<Order> orders, File file) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {

            for (Order order : orders) {
                writer.append(order.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void printInfo(File file) {

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            //функциональный поток для чтения информации
            String text = reader
                    .lines()
                    .collect(Collectors.joining(System.lineSeparator()));
            System.out.println(text);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
