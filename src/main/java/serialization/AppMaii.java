package serialization;

public class AppMaii {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Tom");

        Serializator serializator = new Serializator();
        serializator.serialization(cat);
    }
}
