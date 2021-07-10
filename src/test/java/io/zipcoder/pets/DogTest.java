package io.zipcoder.pets;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class DogTest extends TestCase {
    @Test
    public void testSpeak() {
        Dog dog =new Dog(null);
        dog.speak();
        Assert.assertEquals("Woof!",dog.speak());
    }
    @Test
    public void NameTest() {

        String expectedName = "Woofsey";
        Dog dog =new Dog(expectedName);
        Assert.assertEquals(expectedName, dog.getName());
    }

}