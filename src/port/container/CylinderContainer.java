package port.container;

public class CylinderContainer extends Сontainer implements WaterMass {
    public CylinderContainer() {
        super();
    }

    public CylinderContainer(int height, int waterDensity, int diagonal) {
        super(height, waterDensity, diagonal);
    }

    @Override
    public int getWaterMass() {
        return this.getDensity() * calculateVolume();
    }

    @Override
    public int calculateVolume() {
        double radius = this.getDiagonal() /2;
        return (int) (Math.PI * Math.pow(radius, 2) * this.getHeight());
    }
}
