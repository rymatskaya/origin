package port.container;

public class ConeContainer extends Сontainer implements WaterMass{
    public ConeContainer() {
        super();
    }

    public ConeContainer(int height, int waterDensity, int diagonal) {
        super(height, waterDensity, diagonal);
    }

    @Override
    public int getWaterMass() {
        return this.getDensity() * calculateVolume();
    }

    @Override
    public int calculateVolume() {
        double radius = this.getDiagonal() >> 1;
        return (int) (radius * radius * this.getHeight() * Math.PI / 3);
    }
}
