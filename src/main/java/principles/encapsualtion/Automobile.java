package principles.encapsualtion;

/**
 * Created by Vladislav Domaniewski
 */

public class Automobile {
    private String name;
    private String color;
    private int sizeWheels;
    private double fuel;

    public Automobile() {
    }

    public Automobile(String name, String color, int sizeWheels, double fuel) {
        this.name = name;
        this.color = color;
        this.sizeWheels = sizeWheels;
        this.fuel = fuel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    /**
     * Changed parameters, that our need.
     * Realization will be hidden
     */

    public void setColor(String color) {
        if (color != "Red") {
            this.color = color;
        } else {
            this.color = "UNKNOWN, Please changed your color!";
        }
    }

    public int getSizeWheels() {
        return sizeWheels;
    }

    public void setSizeWheels(int sizeWheels) {
        this.sizeWheels = sizeWheels;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", sizeWheels=" + sizeWheels +
                ", fuel=" + fuel +
                '}';
    }
}
