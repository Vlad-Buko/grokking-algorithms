package serialization;

import java.io.InvalidClassException;
import java.io.InvalidObjectException;

public class AppMaii {
    public static void main(String[] args) {
        Serializator serializator = new Serializator();


        try {
            Cat cat = serializator.deserealisation();
            System.out.println(cat.getName());
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
    }
}
