package lambdaTwo;

public class Lamp implements ElectricityConsumer {

    public void lightOn() {
        System.out.println("Лампа работает");
    }

    @Override
    public void electricityOn(Object sender) {
        lightOn();
    }
}
