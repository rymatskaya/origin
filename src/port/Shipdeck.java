package port;

import port.container.Сontainer;
import port.container.WaterMass;
import port.main.Constants;
import port.main.GenerateRandom;

public class Shipdeck // implements WaterMass
{
   /* private Сontainer[] containers;

    public Shipdeck() {
        this.containers = GenerateRandom.generateArrayContainers();
    }

    public Shipdeck(int count) {
        this.containers = GenerateRandom.generateArrayContainers(count);
    }

    public Shipdeck(Container container1, Container container2) {
        if (container1.getDiagonal() != Constants.DIAGONAL_BIG
                || container2.getDiagonal() != Constants.DIAGONAL_BIG) {
            System.out.println(Constants.INCORRECT_BIG_CONTAINER);
            containers = new Container[]{container1, container2};
            for (Container container : containers) {
                container.setDiagonal(Constants.DIAGONAL_BIG);
            }
        } else {
            containers = new Container[]{container1, container2};
        }
    }

    public Shipdeck(Container container1, Container container2, Container container3, Container container4) {
        if (container1.getDiagonal() != Constants.DIAGONAL_SMALL
                || container2.getDiagonal() != Constants.DIAGONAL_SMALL
                || container3.getDiagonal() != Constants.DIAGONAL_SMALL
                || container4.getDiagonal() != Constants.DIAGONAL_SMALL) {
            System.out.println(Constants.INCORRECT_SMALL_CONTAINER);
            containers = new Container[]{container1, container2, container3, container4};
            for (Container container : containers) {
                container.setDiagonal(Constants.DIAGONAL_SMALL);
            }
        } else {
            containers = new Container[]{container1, container2, container3, container4};
        }
    }

    public Shipdeck(Container[] containers) {
        boolean isCorrectContainers = isCorrectContainers(containers);
        if (isCorrectContainers) {
            this.containers = containers;
        } else {
            System.out.println(Constants.INCORRECT_CONTAINERS_ARRAY);
            this.containers = GenerateRandom.generateArrayContainers();
        }
    }

    public Container[] getContainers() {
        return containers;
    }

    public void setContainers(Container[] containers) {
        boolean isCorrectContainers = isCorrectContainers(containers);
        if (isCorrectContainers) {
            this.containers = containers;
        } else {
            isCorrectContainers = isCorrectContainers(this.containers);
            if (isCorrectContainers) {
                System.out.println(Constants.CORRECT_CONTAINERS_ARRAY);
            } else {
                System.out.println(Constants.INCORRECT_CONTAINERS_ARRAY);
                this.containers = GenerateRandom.generateArrayContainers();
            }
        }
    }

    private boolean isCorrectContainers(Container[] containers) {
        boolean isCorrectContainers = false;
        if (containers == null) {
            return isCorrectContainers;
        }
        for (Container container : containers) {
            if (container == null) {
                return isCorrectContainers;
            }
        }
        if (containers.length == 2) {
            isCorrectContainers = containers[0].getDiagonal()
                    + containers[1].getDiagonal() == Constants.DIAGONAL_BIG * 2;
        } else if (containers.length == 4) {
            isCorrectContainers = containers[0].getDiagonal()
                    + containers[1].getDiagonal() + containers[2].getDiagonal()
                    + containers[3].getDiagonal() == Constants.DIAGONAL_SMALL * 4;
        }
        return isCorrectContainers;
    }

    @Override
    public int getWaterMass() {
        int waterMass = 0;
        for (Container container : containers) {
            waterMass += container.getWaterMass();
        }
        return waterMass;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Container container : containers) {
            stringBuilder.append(container).append("\n");
        }
        return stringBuilder.toString();
    }*/
}
