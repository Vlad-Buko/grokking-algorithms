package principles.polymorphism;

/**
 * Created by Vladislav Domaniewski
 */

public class Vehicle implements Flyable{
    private String name;

    @Override
    public void fly() {
        System.out.println("This flyable!!!");
    }

    public void moving() {
        System.out.println("Our object moving :)");
    }
}
