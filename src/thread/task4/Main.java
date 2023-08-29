package thread.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>() ;
        List<Integer> list = Collections.synchronizedList(numbers); //вариант 2
        // CopyOnWriteArrayList // вариант 3
        ListThread listThread1= new ListThread(numbers);
        ListThread listThread2= new ListThread(numbers);
        ListThread listThread3= new ListThread(numbers);
        ListThread listThread4= new ListThread(numbers);

        ListThread listThread5= new ListThread(list);
        ListThread listThread6= new ListThread(list);
        ListThread listThread7= new ListThread(list);
        ListThread listThread8= new ListThread(list);

        listThread1.start();
        listThread2.start();
        listThread3.start();
        listThread4.start();

        listThread5.start();
        listThread6.start();
        listThread7.start();
        listThread8.start();

        try {
            listThread1.join();
            listThread2.join();
            listThread3.join();
            listThread4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            listThread5.join();
            listThread6.join();
            listThread7.join();
            listThread8.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        numbers.forEach(System.out::println);

        list.forEach(System.out::println);

    }
}
