package principles.abstraction;

import java.util.ArrayList;

/**
 * Created by Vladislav Domaniewski
 */

public class AppUse {
    public static void main(String[] args) {
        ArrayList <Automobile> listCar = new ArrayList<>();
        Automobile opel = new Automobile("Opel", "Red", "Germany", 127.689);
        Automobile volkswagen = new Automobile("Volkswagen", "Green", "Germany", 540.555);
        listCar.add(volkswagen);
        listCar.add(opel);
    }
}
