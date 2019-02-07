package qtest;

import org.junit.Assert;
import org.junit.Test;

public class SimpleTest {

    @Test
    public void test() {
        String message = "Hola";
        Assert.assertEquals("Hola", message);
    }
}