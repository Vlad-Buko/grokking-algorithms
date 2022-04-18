package pl.bel.abstractClass;

public class Application {
    public static void main(String[] args) {
        Flyable flyable = new Flyable() {
            @Override
            public String getModelAir() {
                return "hello";
            }
        };

        SomeInterface fly = new SomeInterface() {
            @Override
            public String implVal() {
                return "Vlais";
            }
        };
        System.out.println(flyable.getModelAir());
        System.out.println(fly.implVal());
    }


}
