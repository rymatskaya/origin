package Orders;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            Menu.menu();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }




}
