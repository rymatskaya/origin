package concurrency;

public class AccountThread extends Thread {

    private final Account accountFrom;
    private final Account accountTo;

    public AccountThread(Account accountFrom, Account accountTo) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
    }

    @Override
    public void run() {

      //  synchronized (accountTo) {
      //      synchronized (accountFrom) {
                for (int i = 0; i < 20; i++) {
                    lockAccounts();
                    try {
                        if (accountFrom.takeOff(10)) {
                            accountTo.add(10);
                        }
                    }
                    finally {
                        accountTo.getLock().unlock();
                        accountFrom.getLock().unlock();
                    }
                }
       //     }
       // }
    }

    private void lockAccounts() {

        while (true) {
            boolean accountFromLock = accountFrom.getLock().tryLock();
            boolean accountToLock = accountTo.getLock().tryLock();
            if (accountFromLock && accountToLock) {
                break;
            }
            if (accountFromLock) {
                accountFrom.getLock().unlock();
            }

            if (accountToLock) {
                accountTo.getLock().unlock();
            }
        }
    }
}
