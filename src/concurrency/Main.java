package concurrency;

import sun.misc.Unsafe;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Integer x=10;

        AtomicInteger y = new AtomicInteger(10);

        y.incrementAndGet();

        //объекты работают напрямую с памятью, можно убравлять памятью
//        Unsafe unsafe= Unsafe.getUnsafe();
//        unsafe.addressSize();

        Account account1 = new Account(20000);
        Account account2 = new Account(20000);

        AccountThread  accountThread1 = new AccountThread(account1, account2);
        AccountThread  accountThread2 = new AccountThread(account2, account1);

        accountThread1.start();
        accountThread2.start();

        try {
            accountThread1.join();
            accountThread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(account1);
        System.out.println(account2);


    }
}
