package testTask;

/**
 * Created by Vladislav Domaniewski
 */

public class Person {
    private String name;
    private int age;
    private Pilot pilot;

    public Person(String name, int age, Pilot pilot) {
        this.name = name;
        this.age = age;
        this.pilot = pilot;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pilot=" + pilot +
                '}';
    }
}
