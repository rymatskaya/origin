package port.main;

import java.util.Random;
import port.container.Сontainer;

public class GenerateRandom {

    public static int generateHeight() {
        Random random = new Random();
        return random.nextInt(10, 101);
    }

    public static int generateDiagonal() {
        Random random = new Random();
        return random.nextBoolean()
                ? Constants.DIAGONAL_BIG
                : Constants.DIAGONAL_SMALL;
    }

    public static int generateDensity() {
        Random random = new Random();
        return random.nextBoolean()
                ? Constants.DENSITY_SMALL
                : Constants.DENSITY_HIGH;
    }
/*
    public static Сontainer[] generateArrayContainers() {
        Random random = new Random();
        int countContainers = random.nextBoolean() ? 2 : 4;
        return 0;
       // return generateArrayContainers(countContainers);
    }*/
}
