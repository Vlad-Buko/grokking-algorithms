package stream;

import java.util.ArrayList;

/**
 * Created by Vladislav Domaniewski
 */

public class Pers {
    public static void main(String[] args) {
        ArrayList<String> pers = new ArrayList<>();
        pers.add("Suz");
        pers.add("Vlad");
        pers.set(10, "Yabaoy");
        System.out.println(pers.size());
    }
}
