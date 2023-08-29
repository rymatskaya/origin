package thread;

public class SimpleThread extends Thread{
    @Override
    public void run(){
        setName("my new thread name");
        System.out.println("Hello from " + getName());
    }
}
