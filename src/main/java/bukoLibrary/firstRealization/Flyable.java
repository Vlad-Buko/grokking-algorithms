package bukoLibrary.firstRealization;

public interface Flyable {
    void addFly();
    String getName();
    default String getInstance(String name) {
        String newName = name  + "Hello";
        return newName;
    }
}
