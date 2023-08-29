package thread.task6;

public class Cashbox {
    private static int generate = 1;
    private  int id = 0;

    public Cashbox(){
        id = generate++;
    }

    @Override
    public String toString() {
        return "Cashbox{" +
                "id=" + id +
                '}';
    }
}
