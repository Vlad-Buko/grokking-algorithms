package serialization;

import java.io.*;

public class Serializator {
    public boolean serialization(Cat cat) {
        boolean flag = false;

        File file = new File("Users/vladislav_domaniewski/documents");
        ObjectOutputStream coo = null;

        try {
            FileOutputStream os = new FileOutputStream(file);
            if (os != null) {
                coo = new ObjectOutputStream(os);
                coo.writeObject(cat);
                flag = true;
            }
        } catch (FileNotFoundException e ) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (coo != null) {
                try {
                    coo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }
}
