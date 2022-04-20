package pl.bel.abstractClass;

public interface SomeInterface {
    String implVal();
    default String listenMusic() {
        return "Hello";
    }
}
