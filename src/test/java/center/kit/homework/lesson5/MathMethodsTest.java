package center.kit.homework.lesson5;


import org.junit.Assert;
import org.junit.Test;

public class MathMethodsTest {

    @Test
    public void mathSqrtOfZeroTest(){
        double result = Math.sqrt(0);
        Assert.assertEquals(0, result, 0);
    }
    @Test
    public void mathSqrtOfOneTest(){
        double result = Math.sqrt(1);
        Assert.assertEquals(1, result, 0);
    }
    @Test
    public void mathSqrtTest(){
        double result = Math.sqrt(4);
        Assert.assertEquals(2, result, 0);
    }
    @Test
    public void mathPowOfZeroInZeroPowerTest(){
        double result = Math.pow(0, 0);
        Assert.assertEquals(1, result, 0);
    }
    @Test
    public void mathPowOfZeroInOnePowerTest(){
        double result = Math.pow(0, 1);
        Assert.assertEquals(0, result, 0);
    }
    @Test
    public void mathPowOfZeroInTwoPowerTest(){
        double result = Math.pow(0, 2);
        Assert.assertEquals(0, result, 0);
    }
    @Test
    public void mathPowOfOneInZeroPowerTest(){
        double result = Math.pow(1, 0);
        Assert.assertEquals(1, result, 0);
    }
    @Test
    public void mathPowOfOneInOnePowerTest(){
        double result = Math.pow(1, 1);
        Assert.assertEquals(1, result, 0);
    }
    @Test
    public void mathPowOfOneInTwoPowerTest(){
        double result = Math.pow(1, 2);
        Assert.assertEquals(1, result, 0);
    }


}
