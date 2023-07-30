package animals;

public class Cat extends Animal {
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void eat() {
        System.out.println("Кот кушает");
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу!");
    }

    public void sleep() {
        System.out.println("Кот спит");
    }
}
