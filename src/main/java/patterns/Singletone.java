package patterns;

public class Singletone {
    private String value;
    private static Singletone instance;

    public String getValue() {
        return value;
    }

    private Singletone (String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singletone getInstance(String value){
        if (instance == null) {
            instance = new Singletone(value);
        }
        return instance;
    }

}
