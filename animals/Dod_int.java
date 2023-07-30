package animals;

import java.io.Serializable;

public abstract class Dod_int implements Animal_interface, Serializable, Runnable {
    public final void bark() {};

    @Override
    public void eat() {
        System.out.println( "Собака кушает");
    }
    @Override
    public void makeNoise() {
        System.out.println( "Гав!");
    }

    @Override
    public void sleep() {

    }


}
