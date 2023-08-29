package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    public static int generator = 1;
    private int id;
    private int money;
    private final Lock lock = new ReentrantLock();

    public Lock getLock() {
        return lock;
    }

    public Account(int money) {
        this.id = generator++;
        this.money = money;
    }

    public void add(int money) {
        this.money += money;
    }

    public boolean takeOff(int money) {
        if (this.money>=money) {
            this.money -= money;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", money=" + money +
                '}';
    }
}
