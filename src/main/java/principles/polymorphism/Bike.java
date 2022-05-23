package principles.polymorphism;

/**
 * Created by Vladislav Domaniewski
 * A kind of polymorphism, but not fully
 */

public class Bike extends Vehicle{
    private Flyable flyable;

    Flyable ad = new Vehicle();

    @Override
    public void moving() {
        ad.fly();                   // Binding to an interface, one of the main features of polymorphism
        super.moving();
    }

    public void moving(int a) {
        System.out.println(" Сейчас мы плывём :)" + a);
    }

    public void moving(String mov) {
        System.out.println("Сейчас мы летим " + mov);
    }
}
