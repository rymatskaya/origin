package thread.task4;

import java.util.List;

public class ListThread extends Thread{
    private List<Integer> numbers;

    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
          //  synchronized (numbers) { вариант 1
                numbers.add(i);
        //    }
        }
    }

    public ListThread (List<Integer> numbers) {
        this.numbers = numbers;
    }
}
