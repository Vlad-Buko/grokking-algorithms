package pl.bel.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Motorcycle suzuki = new Motorcycle(1, "Suzuki", "Boulevard");
        Motorcycle honda = new Motorcycle(2, "Honda", "Spirit");

        Map<Integer, Motorcycle> listModels = new HashMap<>();
        listModels.put(suzuki.getId(), suzuki);
        listModels.put(honda.getId(), honda);
        listModels.put(suzuki.getId(), honda);
        listModels.put(1, new Motorcycle(1, "Vlad", "Bikes"));

        System.out.println(listModels.get(1));
    }
}
