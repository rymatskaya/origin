package thread.task6;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.stream.Stream;

/**
 *  Кассы, покупатели и очередь
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        List<Cashbox> list = List.of(new Cashbox(), new Cashbox());
        Queue<Cashbox> cashboxes = new ArrayDeque<>(list);
       // BlockingQueue <Cashbox> cashboxes = new ArrayBlockingQueue<Cashbox>(list);

        List<Thread> buyers = Stream.of (
                new Buyer(cashboxes),
                new Buyer(cashboxes),
                new Buyer(cashboxes),
                new Buyer(cashboxes),
                new Buyer(cashboxes),
                new Buyer(cashboxes),
                new Buyer(cashboxes),
                new Buyer(cashboxes),
                new Buyer(cashboxes),
                new Buyer(cashboxes)
        )       .map(Thread::new)
                .peek(t ->t.setDaemon(true)) // поток main может закончится, а поток-демон продолжит выполнение
                .peek(Thread::start)
                .toList();

        for (Thread buyer : buyers) buyer.join();

    }
}
