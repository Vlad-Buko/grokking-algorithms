package lambdaTwo;

import java.util.ArrayList;
import java.util.List;

public class Switcher {
    private List<ElectricityConsumer> listeners  = new ArrayList<>();
    public void addElectrisityListener(ElectricityConsumer listener){
        listeners.add(listener);
    }

    public void removeElectrisityListener(ElectricityConsumer listener) {
        listeners.remove(listener);
    }

    public void switchOn() {
        System.out.println("Выключатель включен");
//        if (consumer != null) {
//            consumer.electricityOn();
//        }
        for(ElectricityConsumer c : listeners){
            c.electricityOn(this);
        }
    }
}
