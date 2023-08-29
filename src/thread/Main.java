package thread;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Welcome to " + Thread.currentThread().getName()); // возращает текущий поток

        SimpleThread myThread = new SimpleThread();
        myThread.start(); //для запуска метода run() SimpleThread

        try {
            myThread.join(); // будет выполняться, пока не отработает внешний поток main
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myThread.interrupt(); //остановись при возможности
        myThread.stop(); //жестко останавливает поток deprecated

        System.out.println("Welcome to " + Thread.currentThread().getName()); // возращает текущий поток
    }
}
