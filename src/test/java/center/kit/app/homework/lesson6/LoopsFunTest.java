package center.kit.app.homework.lesson6;

import center.kit.app.classwork.lesson6.LoopsFun;
import org.junit.*;

import java.lang.management.GarbageCollectorMXBean;

public class LoopsFunTest {

    LoopsFun loopsInstance;

    @Before
    public void intialize(){
        this.loopsInstance = new LoopsFun();
    }

    @Test
    public void countEvenNumbers_From_0_To_20_Test(){
        Assert.assertEquals(11, LoopsFun.countEvenNumbers(20));
    }

    @Test
    public void countEvenNumbers_In_0_Test(){
        Assert.assertEquals(1, LoopsFun.countEvenNumbers(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void countEvenNumbersInNegativeNumberTest(){
        Assert.assertEquals(0, LoopsFun.countEvenNumbers(-20));
    }

    @Test
    public void method_CheckNumbersAB_Test(){
        loopsInstance.checkNumbersAB(20, 10);
        Assert.assertTrue(loopsInstance.numbersChecked);
    }

    @Test
    public void method_printNumbersLoopFor_Test(){
        loopsInstance.printNumbersLoopFor();
        Assert.assertTrue(loopsInstance.numbersPrinted);
    }

}
