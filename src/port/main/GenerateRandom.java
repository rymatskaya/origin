package port.main;

import java.util.Random;

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
}
