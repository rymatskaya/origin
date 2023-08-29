package thread.task5;

public class Main {
    /**
     * [RAM flag = false]
     * 1 -- [ flag = false] захэшировал в свою память
     * 2 -- [ flag = true] записал в RAM память
     */
    private volatile static boolean flag = false; //обязует поток ходить в память
    public static void main(String[] args) {

        Thread thread1 = new Thread(
                () -> {
                   while (!flag) {
                       System.out.println("Still false");
                   }
                }
        );
        thread1.start();

        try {
            Thread.sleep(1/1000000000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Thread thread2 = new Thread(
                () -> {
                    flag = true;
                    System.out.println("Already true");
                }
        );
        thread2.start();
    }


}
