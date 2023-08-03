package lesson10HashMap;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Person ivan = new Person(UUID.randomUUID(), "Ivan", 24);
        Person nikita = new Person(UUID.randomUUID(), "Nikita", 24);

        System.out.println(ivan.hashCode());
        System.out.println(nikita.hashCode());

        List<String> list = new LinkedList<>();
        list.add("Hello");
        Integer x = 10;
        x.hashCode();

        Map<Integer, String> map = new HashMap<>(25, 0.9F);
        map.put(1, "one");
        map.put(2, "two");
        map.put(1, "three"); //перетрет первое значение
        map.put(x, "ten");

        System.out.println(map.get(10));

        Map.Entry[] entry = new Map.Entry[16];

        Person Ivan = new Person("Ivan", 24);
        Person Sveta = new Person("Sveta", 26);

        Map<String, Person> people = new HashMap<>();
        people.put("ivan", Ivan);
        people.put("sveta", Sveta);
        people.put("jon", new Person("Jon", 15));

        people.keySet().forEach(System.out::println);

        for (Person value : people.values()) {
            if (value.getAge() > 20) {
                System.out.println(value.getName());
            }
        }

        for (Map.Entry<String,Person> s : people.entrySet()) {
            System.out.println(s.getKey());
            System.out.println(s.getValue());
        }

        Person person = people.getOrDefault("Jon", new Person("default",0));
        System.out.println(person.getName());

        System.out.println("HashSet:");
        Set<Integer> numbers = new HashSet<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(5);
        numbers.add(1);
        numbers.add(20);

        numbers.forEach(System.out::println);
        System.out.println("TreeSet:");
        Set<Integer> numbers1 = new TreeSet<>(); //отсортированное множество
        numbers1.add(20);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(1);
        numbers1.add(20);
        numbers1.forEach(System.out::println);

        List<String> lists = new ArrayList<>();
        Set<String> setNumbers = new HashSet<>(list);
        setNumbers.forEach(System.out::println);

    }
}
