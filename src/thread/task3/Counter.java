package thread.task3;

/**
 * 1. Число считывается
 * 2. Число изменяется
 * 3. Записывается
 * <p>
 * --8 -> 1 + 8 -> count = 9
 * <p>
 * --9 -> 1 + 9 -> count = 10
 */
public class Counter {
    private int count;
    private static String desription;

    public static void init() {
        synchronized (Counter.class) {
            if (desription == null) {
                desription = "описание";
            }
        }
    }

    public int getCount() {
        return count;
    }
    // монитор - это специальный объект, который будет захвачен текущем объектом

    // вариант 1 public synchronized int increment()
    // вариант 2 предпочтительнее
    public int increment() { // монитор будет захвачен, благодаря synchronized

        //логика

        synchronized (this) {
            return count++;
        }

        //логика
    }

    public int decrement() {
        return count--;
    }

}
