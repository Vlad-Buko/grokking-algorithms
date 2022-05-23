package principles.encapsualtion;

/**
 * Created by Vladislav Domaniewski
 * In order to preserve the encapsulation,
 * it was necessary to introduce a restriction in the constructor,
 * but here the main thing is that we see everything perfectly
 */

public class AppUseEnc {
    public static void main(String[] args) {
        Automobile automobile = new Automobile("Opel", "Red", 15, 7.9);
        System.out.println(automobile);
        System.out.println(automobile.getName());
        automobile.setColor("Blue");
        System.out.println(automobile);
        automobile.setColor("Red");
        System.out.println(automobile);
    }
}
