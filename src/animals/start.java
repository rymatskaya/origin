package animals;

public class start {
    public static void start() {
        Animal dog = new Dog();
        dog.eat();
        dog.setFood("косточки");
        dog.setLocation("будке");
        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
        cat.setFood("рыбку");
        cat.setLocation("кровати");
        Animal horse = new Horse();
        horse.setLocation("конюшне");
        horse.setFood("овес");
        horse.makeNoise();
        Animal[] animals = {dog, cat, horse};
        Ветеринар vet = new Ветеринар();

        for (Animal arr : animals
        ) {
            vet.treatAnimal(arr);
        }

    }
}
