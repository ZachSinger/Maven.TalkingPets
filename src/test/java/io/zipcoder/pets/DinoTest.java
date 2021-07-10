package io.zipcoder.pets;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class DinoTest extends TestCase {
    @Test
    public void testSpeak() {
        Dino dino =new Dino(null);
        dino.speak();
        Assert.assertEquals("Roarrrr!!!",dino.speak());
    }
    @Test
    public void NameTest() {
        String expectedName = "Dinoface";
        Dino dino =new Dino(expectedName);
        Assert.assertEquals(expectedName, dino.getName());
    }

}