package thread.task3;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        ThreadCounter threadCounter1 = new ThreadCounter(counter);
        ThreadCounter threadCounter2 = new ThreadCounter(counter);
        ThreadCounter threadCounter3 = new ThreadCounter(counter);
        ThreadCounter threadCounter4 = new ThreadCounter(counter);

        threadCounter1.start();
        threadCounter2.start();
        threadCounter3.start();
        threadCounter4.start();

        try {
            threadCounter1.join();
            threadCounter2.join();
            threadCounter3.join();
            threadCounter4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter.getCount());
    }
}
