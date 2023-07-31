package Lesson9_Collection;

import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ArrayListExamples();
        LinkedListExample();
        Scanner scanner = new Scanner(System.in);


        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", "PO-15", 3, 1));
        students.add(new Student("Vasia", "PO-11", 3, 3));
        students.add(new Student("Kolia", "PO-10", 2, 4));
        students.add(new Student("Mark", "PO-16", 2, 2));
        students.add(new Student("Petia", "PO-15", 1, 5));
        printList(students);

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getMark() < 3) {
                students.remove(i);
            } else  {
                //students.get(i).course++;
                Student student = students.get(i);
                Integer course = student.getCourse();
                student.setCourse(++course);

            }
        }

        System.out.println("Result after remove");
        printList(students);

        System.out.print("Input course = ");
        Integer course = scanner.nextInt();

        printStudents(students, course);

    }

    private static void printStudents(ArrayList<Student> students, Integer course) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCourse() == course) {
                System.out.println(students.get(i).toString());
            }
        }
    }

    private static void printList(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    private static void LinkedListExample() {
        List<String> list = new LinkedList<>();
        list.add("hello, ");
        list.add("world");
        list.add("!!!!!");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) { // роверяет ли, есть ли этот элемент
            System.out.print(iterator.next());
        }

        list.forEach((it) -> System.out.println(it.toUpperCase(Locale.ROOT)));
    }

    private static void ArrayListExamples() {
        String[] arr = new String[10];

        ArrayList<String> list = new ArrayList<>();
        list.add("hello ");
        list.add("world");


        // проверка на наличие элементов в коллекции
        if (list.size() != 0) {
            System.out.println("Коллекция не является пустой");
        }
        // аналог предыдущего
        if (!list.isEmpty()) {
            System.out.println("Коллекция не является пустой");
        }

        //вывод элементов коллекции
        for (String s : list) {
            System.out.println(s);
        }
        //вариант для использования
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //вывод через лямбда-выражения
        list.forEach((it) -> System.out.println(it));
        list.forEach((it) -> System.out.println(it.toUpperCase(Locale.ROOT)));

        //метод reference
        list.forEach(System.out::println);

        String s = list.get(0);
        // размер коллеции устанавливается по количеству элементов в коллекции
        list.trimToSize();

        // удалит элемент, если найден указанный
        for (String s1 : list) {
            if (s1.equals("world")) {
                System.out.println("Элемент удален");
            }
        }
        // аналог
        //list.removeIf();
    }
}
