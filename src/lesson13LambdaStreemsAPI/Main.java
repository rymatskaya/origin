package lesson13LambdaStreemsAPI;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        extracted();

        Comparator<Integer> comparator = (Integer o1, Integer o2) -> {
            return Integer.compare(o1, o2);
        };
        System.out.println(comparator.compare(25, 100));

        Comparator<Integer> comparator1 = (Integer o1, Integer o2) -> Integer.compare(o1, o2);
        System.out.println(comparator1.compare(25, 100));

        Comparator<Integer> comparator2 = (o1, o2) -> Integer.compare(o1, o2);
        System.out.println(comparator2.compare(25, 100));

        Comparator<Integer> comparator3 = Integer::compare;
        System.out.println(comparator3.compare(25, 100));

        List<String> numbers = List.of("11", "22", "33", "44", "55", "66", "88");

        numbers.stream()
                .map((String value) -> value + value)
                .map(it -> Integer.valueOf(it))
                .filter(it -> {
                    if (it % 2 == 0) {
                        return true;
                    }
                    return false;
                })
                .forEach(it -> System.out.println(it));
        //сокращение
        numbers.stream()
                .map(value -> value + value)
                .map(Integer::valueOf)
                .filter(it -> it % 2 == 0)
                .forEach(System.out::println);

        // сохранение в коллекцию
        Set<Integer> set = numbers.stream()
                .map(value -> value + value)
                .map(Integer::valueOf)
                .filter(it -> it % 2 == 0)
                .collect(Collectors.toSet());

        List<Integer> nn = numbers.stream()
                .map(value -> value + value)
                .map(Integer::valueOf) //преобразует каждый элемент стрима
                .filter(it -> it % 2 == 0)
                .distinct() //убрает дубликаты
                .limit(5) //только 5 элементов попадет в выборку
                .sorted() //работает, если реализует Comparable интерфейс
                .toList();

        nn.forEach(System.out::println);

        Long countNm = numbers.stream()
                .map(value -> value + value)
                .map(Integer::valueOf) //преобразует каждый элемент стрима
                .filter(it -> it % 2 == 0)
                .distinct() //убрает дубликаты
                .limit(5) //только 5 элементов попадет в выборку
                .sorted() //работает, если реализует Comparable интерфейс
                .count();
        System.out.println(countNm);

        for (String value : numbers
        ) {
            String tmp = value + value;
            Integer number = Integer.valueOf(tmp);
            if (number % 2 == 0) {
                System.out.println(tmp);
            }
            ;

            List<Student> students = List.of(
                    new Student("Ivan", 23),
                    new Student("Mark", 24),
                    new Student("kolya", 21),
                    new Student("Vasya", 45)
            );


            // TODO: 01.08.2023  пример для flatMap

            students.stream()
                    .parallel();

        }
    }

    private static void extracted() {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            // модификатор возвращаемый (тип параметры)
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };

        System.out.println(comparator.compare(25, 100));
    }
}
