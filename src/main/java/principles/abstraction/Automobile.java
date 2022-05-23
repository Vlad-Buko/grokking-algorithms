package principles.abstraction;

/**
 * Created by Vladislav Domaniewski
 * I create a class that corresponds only to abstraction,
 * there not encapsulation here.
 */

public class Automobile {
    String nameCar;
    String color;
    String countryManufacturer;
    double mileage;

    public Automobile(String nameCar, String color, String countryManufacturer, double mileage) {
        this.nameCar = nameCar;
        this.color = color;
        this.countryManufacturer = countryManufacturer;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "'" + nameCar + '\'' +
                ",'" + color + '\'' +
                ",'" + countryManufacturer + '\'' +
                ", " + mileage +
                '}';
    }
}
