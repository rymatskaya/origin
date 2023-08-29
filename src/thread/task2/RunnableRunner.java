package thread.task2;

public class RunnableRunner {
    public static void main(String[] args) {
        RunnableThread runnableThread = new RunnableThread();
        Thread thread = new Thread(runnableThread);
        System.out.println(thread.getState());

        thread.start();
        System.out.println(thread.getName()+ ' ' + thread.getState());

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName() + ' ' +
                Thread.currentThread().getState()); // возращает текущий поток

        System.out.println(thread.getName()+ ' ' + thread.getState());

    }
}
