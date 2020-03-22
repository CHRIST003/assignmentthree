package ac.za.cput;

import org.junit.Assert;
import org.junit.Test;

public class BirdsTest {

    private String insects;

    @Test
    public void eat(){
        insects = "ants";
        Assert.assertEquals( insects + " is a type of food birds eat", insects + " is a type of food birds eat");

    }

    @Test
    public void category(){
        Assert.assertEquals("Birds are vertebrates", "Birds are vertebrates");
    }
}
