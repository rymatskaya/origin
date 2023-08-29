package thread.task6;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;

public class Buyer implements Runnable {
    private Queue<Cashbox> cashboxes;
    //private BlockingQueue<Cashbox> cashboxes;

    @Override
    public void run() {
//        try {
//            Cashbox cashbox = cashboxes.take();
//            System.out.println(Thread.currentThread().getName() + " обслуживается в кассе "
//                    + cashbox);
//            Thread.sleep(5L);
//            System.out.println(Thread.currentThread().getName() + " освобождает кассу "
//                    + cashbox);
//            cashboxes.add(cashbox);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        extracted();
    }

    private void extracted() {
        synchronized (cashboxes) {
            try {
                while (true) {
                    if (!cashboxes.isEmpty()) {
                        Cashbox cashbox = cashboxes.remove();
                        System.out.println(Thread.currentThread().getName() + " обслуживается в кассе "
                                + cashbox);
                        Thread.sleep(5L);
                        //cashboxes.wait(10L);
                        System.out.println(Thread.currentThread().getName() + " освобождает кассу "
                                + cashbox);
                        cashboxes.add(cashbox);
                        //cashboxes.notify(); будит только один поток
                        //cashboxes.notifyAll(); // будит все потоки
                    } else {
                        System.out.println(Thread.currentThread().getName() + " ожидает кассу ");
                        //Thread.sleep(5L);
                        cashboxes.wait();
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

//    public Buyer(BlockingQueue<Cashbox> cashboxes) {
//        this.cashboxes = cashboxes;
//    }

    public Buyer(Queue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }
}
