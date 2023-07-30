package animals;

public class Ветеринар  {

    public void treatAnimal(Animal animal) {
        System.out.println("На прием пришло животное, которое ест " + animal.food
                            + " и живет в " + animal.location);
    }
}
