package ac.za.cput;

import org.junit.Assert;
import org.junit.Test;

public class LionTest {

    private String readMeat ="Lamb";


    @Test
    public void eat (){
        Assert.assertEquals(" Lions eat " +readMeat,     " Lions eat " +readMeat);
    }

    @Test
    public void category(){
        Assert.assertEquals(" Lions are mammals"," Lions are mammals");
    }
}
