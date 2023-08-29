package thread.task3;

public class ThreadCounter extends Thread {
    private Counter counter;

    public  ThreadCounter(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}
