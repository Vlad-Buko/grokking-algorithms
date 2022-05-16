package domaniewski.javalearn;

import org.junit.Assert;
import org.junit.Test;

public class Singletone {

    @Test
    public void checkOneInstance() {
        patterns.Singletone one = patterns.Singletone.getInstance("Mary");
        patterns.Singletone two = patterns.Singletone.getInstance("Olga");
        Assert.assertTrue(one == two);
    }

}
