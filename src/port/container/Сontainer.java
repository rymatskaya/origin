package port.container;

import port.main.Constants;
import port.main.GenerateRandom;

public class Сontainer implements WaterMass {
    private int height;
    private int density;
    private int diagonal;

    public Сontainer() {
        this.height = GenerateRandom.generateHeight();
        this.density = GenerateRandom.generateDensity();
        this.diagonal = GenerateRandom.generateDiagonal();
    }

    public Сontainer(int height, int density, int diagonal) {
        setHeight(height);
        setDensity(density);
        setDiagonal(diagonal);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height >= Constants.MIN_HEIGHT && height <= Constants.MAX_HEIGHT) {
            this.height = height;
        } else {
            if (this.height >= Constants.MIN_HEIGHT && this.height <= Constants.MAX_HEIGHT) {
                System.out.println(Constants.CORRECT_HEIGHT);
            } else {
                System.out.println(Constants.INCORRECT_HEIGHT);
                this.height = GenerateRandom.generateHeight();
            }
        }
    }

    public int getDensity() {
        return density;
    }

    public void setDensity(int density) {
        switch (density) {
            case Constants.DENSITY_HIGH -> this.density = Constants.DENSITY_HIGH;
            case Constants.DENSITY_SMALL -> this.density = Constants.DENSITY_SMALL;
            default -> {
                if (this.density >= Constants.DENSITY_SMALL
                        || this.density <= Constants.DENSITY_HIGH) {
                    System.out.println(Constants.CORRECT_DENSITY);
                } else {
                    System.out.println(Constants.INCORRECT_DENSITY);
                    this.density = GenerateRandom.generateDensity();
                }
            }
        }
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        switch (diagonal) {
            case Constants.DIAGONAL_BIG -> this.diagonal = Constants.DIAGONAL_BIG;
            case Constants.DIAGONAL_SMALL -> this.diagonal = Constants.DIAGONAL_SMALL;
            default -> {
                if (this.diagonal == Constants.DIAGONAL_BIG
                        || this.diagonal == Constants.DIAGONAL_SMALL) {
                    System.out.println(Constants.CORRECT_DIAGONAL);
                } else {
                    System.out.println(Constants.INCORRECT_DIAGONAL);
                    this.diagonal = GenerateRandom.generateDiagonal();
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Контейнер {высота = " + height
                + ", плотность воды в контейнере = " + density
                + ", диагональ основания = " + diagonal + '}';
    }

    @Override
    public int getWaterMass() {
        return this.getDensity() * calculateVolume();
    }

    public int calculateVolume() {
        return 0;
    }
}
