package principles.inheritance;

import java.util.ArrayList;

/**
 * Created by Vladislav Domaniewski
 */

public class AppUse {
    public static void main(String[] args) {
        Holding hold = new Holding();
        hold.setCity("Minsk");
        hold.setName("Vlad");
        hold.createApp();

        Transition tr = new Transition();
        tr.createApp();
    }
}
