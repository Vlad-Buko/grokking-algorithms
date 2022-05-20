package lambdaTwo;

public class Radio implements ElectricityConsumer {
    public void playMusic() {
        System.out.println("Radio is open");
    }

    @Override
    public void electricityOn(Object sender) {
        playMusic();
    }
}
