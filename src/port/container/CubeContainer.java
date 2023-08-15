package port.container;

public class CubeContainer extends Сontainer implements WaterMass {
    public CubeContainer() { super(); };

    public CubeContainer(int height, int density, int diagonal) {
        super(height, density, diagonal);
    }

    @Override
    public int getWaterMass() {
        return this.getDensity() * calculateVolume();
    }

    @Override
    public int calculateVolume() {
        double sideSquare = this.getDiagonal() / Math.sqrt(2);
        return (int) Math.pow(sideSquare, 3);
    }
}
