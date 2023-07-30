package animals;

public interface Animal_interface {
    String NAME = "";

    void eat();

    void makeNoise();

    void sleep();
    default void play() {
        System.out.println( "Дай лапу!");
        test();
    }

    static void test() {

    }
}
