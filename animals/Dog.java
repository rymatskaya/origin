package animals;

public class Dog extends Animal {
    private String breed;

    @Override
    public void eat() {
        System.out.println( "Собака кушает");
    }
    @Override
    public void makeNoise() {
        System.out.println( "Гав!");
    }

    public void sleep() {
        System.out.println( "Собака спит");
    }
}
