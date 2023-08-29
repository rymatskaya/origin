package port;

import port.container.WaterMass;
import port.main.Constants;
import port.main.GenerateRandom;

public class Port //implements WaterMass
{
    private Ship[] ships = new Ship[10];
    private int size = 0;

    public int size() {
        return size;
    }

    public Ship[] getShips() {
        return ships;
    }

    public void setShips(Ship[] ships) {
        if (ships.length > 10) {
            System.out.println(Constants.MAX_SHIPS);
        }  /*else {
          Port seaport = new Port(ships);
            this.ships = seaport.ships;
            size = seaport.size();

        }*/
    }

}
