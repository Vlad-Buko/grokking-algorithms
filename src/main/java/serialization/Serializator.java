package serialization;

import java.io.*;

public class Serializator {
    public boolean serialization(Cat cat) {
        boolean flag = false;

        File file = new File("src/Cat.data");
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

    public Cat deserealisation () throws InvalidObjectException {
        File file = new File("src/Cat.data");

        ObjectInputStream objectInputStream = null;

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            if (fileInputStream != null) {
                objectInputStream = new ObjectInputStream(fileInputStream);
                Cat cat = (Cat) objectInputStream.readObject();
                return cat;
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
         } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        throw new InvalidObjectException("sf") ;
    }
}
