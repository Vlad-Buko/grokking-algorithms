package pl.bel.abstractClass;

public class Application {
    public static void main(String[] args) {
        Flyable flyable = new Flyable() {
            @Override
            public String getModelAir() {
                return super.getModelAir();
            }
        };

    }
}
