package animals;

public abstract class Animal {
    protected String food;
    protected String location;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public abstract void eat();

    public abstract void makeNoise();

    /*
    2.	Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
     Метод makeNoise, например, может выводить на консоль "Такое-то животное спит".*/
}
