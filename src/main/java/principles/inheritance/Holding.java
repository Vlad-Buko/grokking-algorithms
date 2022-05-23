package principles.inheritance;

import java.util.ArrayList;

/**
 * Created by Vladislav Domaniewski
 * I watch the life of an instance variable of the parent class
 */

public class Holding {
    public ArrayList <String> name = new ArrayList<>();
    public String city = "Minsk";


    public void createApp() {
        System.out.println(name.isEmpty() + " make application in city " + city);
    }

    public void setName(String name) {
        this.name.add(name);
    }

    public void setCity(String city) {
        this.city = city;
    }
}
