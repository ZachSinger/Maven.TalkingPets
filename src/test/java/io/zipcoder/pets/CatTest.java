package io.zipcoder.pets;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CatTest extends TestCase {
    @Test
    public void testSpeak() {
        Cat cat =new Cat(null);
        cat.speak();
        Assert.assertEquals("Meowww",cat.speak());
    }
    @Test
    public void NameTest() {
        String expectedName = "Kittykens";
        Integer expectedAge = 0;
        Cat cat =new Cat(expectedName);
        Assert.assertEquals(expectedName, cat.getName());
    }

}