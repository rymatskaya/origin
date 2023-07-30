package animals;

public final class Horse extends Animal {

    private String color;

    @Override
    public void eat() {
        System.out.println( "Лошадь кушает");
    }

    @Override
    public void makeNoise() {
        System.out.println( "Иго-го!");
    }

    public void sleep() {
        System.out.println( "Лошадь спит");
    }
}
