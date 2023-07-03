package Cat;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int i = 0;
        System.out.println("Используем цикл while:");
        while (i < 10) {
            Cat cat = new Cat();
            System.out.println(i + 1 + ": Имя: " + cat.name + ", возраст: " + cat.age);
            i++;
        }
        System.out.println("Используем цикл for:");
        for (i = 0; i < 10; i++) {
            Cat cat = new Cat();
            cat.setAge(rand.nextInt(28) + 1);
            System.out.println("Возраст " + (i + 1) + "-го кота: " + cat.getAge());
        }
        System.out.println("Используем цикл do ... while:");
        i = 0;
        int age;
        String name;
        do {
            Cat cat = new Cat(Generate_name(), rand.nextInt(28) + 1);
            System.out.println(i + 1 + ": Имя: " + cat.getName() + ", возраст: " + cat.getAge());
            i++;
        } while (i < 10);
        System.out.println("Используем цикл foreach:");
        int[] counter = {1, 2, 3, 4, 5};
        for (int k:
             counter) {
            Cat cat = new Cat(Generate_name(), rand.nextInt(28) + 1);
            System.out.println((k + 1) +": " + cat.toString());
        }
        System.out.println("Метод equals:");
        Cat Cat1 = new Cat( "Шрэк",1);
        Cat Cat2 = new Cat("Шрэк",1);
        Cat Cat3 = new Cat("Симба",1);
        boolean equals = Cat1.equals(Cat2);
        System.out.println(Compare(equals));
        equals = Cat1.equals(Cat3);
        System.out.println(Compare(equals));
    }
    public static String Compare(boolean equals)
    {
        if (equals)
        {
          return "Одинаковые коты";
        }
        else
        {
            return "Разные коты";
        }
    }
    public static String Generate_name() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();
        String upper_case_line = "";
        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(random.nextInt(10) +3)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        Scanner lineScan = new Scanner(generatedString);
        while(lineScan.hasNext()) {
            String word = lineScan.next();
            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) ;
        }
        return upper_case_line;
    }
}
