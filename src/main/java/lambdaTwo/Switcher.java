package lambdaTwo;

public class Switcher {
    public ElectricityConsumer consumer;
    public void switchOn() {
        System.out.println("Выключатель включен");
        if (consumer != null) {
            consumer.electricityConsumer();
        }
    }
}
