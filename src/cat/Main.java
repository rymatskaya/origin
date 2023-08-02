package cat;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printWhile();
        printFor();
        printDoWhile();
        printForEach();
        isCompareCats();
    }

    private static void isCompareCats() {
        System.out.println("Метод equals:");
        Cat Cat1 = new Cat("Шрэк", 1);
        Cat Cat2 = new Cat("Шрэк", 1);
        Cat Cat3 = new Cat("Симба", 1);
        Cat1.toString();
        Cat2.toString();
        Cat3.toString();
        boolean equals = Cat1.equals(Cat2);
        System.out.println(Compare(equals));
        equals = Cat1.equals(Cat3);
        System.out.println(Compare(equals));
    }

    private static void printForEach() {
        Random RANDOM=new Random();
        System.out.println("Используем цикл foreach:");
        int[] counter = {1, 2, 3, 4, 5};
        for (int k :
                counter) {
            Cat cat = new Cat(Generate_name(), RANDOM.nextInt(28) + 1);
            System.out.println(k + ": " + cat.toString());
        }
    }

    private static void printDoWhile() {
        Random rand=new Random();
        System.out.println("Используем цикл do ... while:");
        int i = 0;
        do {
            Cat cat = new Cat(Generate_name(), rand.nextInt(28) + 1);
            System.out.println(i + 1 + ": Имя: " + cat.getName() + ", возраст: " + cat.getAge());
            i++;
        } while (i < 10);
    }

    private static void printFor() {
        Random rand=new Random();
        System.out.println("Используем цикл for:");
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
            cat.setAge(rand.nextInt(28) + 1);
            System.out.println("Возраст " + (i + 1) + "-го кота: " + cat.getAge());
        }
    }

    private static void printWhile() {
        int i = 0;
        System.out.println("Используем цикл while:");
        while (i < 10) {
            Cat cat = new Cat();
            System.out.println(i + 1 + ": Имя: " + cat.getName() + ", возраст: " + cat.getAge());
            i++;
        }
    }

    public static String Compare(boolean equals) {
        return equals ? "Одинаковые коты" : "Разные коты";

    }

    public static String Generate_name() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();
        String upper_case_line = "";
        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(random.nextInt(10) + 3)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        Scanner lineScan = new Scanner(generatedString);
        while (lineScan.hasNext()) {
            String word = lineScan.next();
            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1);
        }
        return upper_case_line;
    }
}
