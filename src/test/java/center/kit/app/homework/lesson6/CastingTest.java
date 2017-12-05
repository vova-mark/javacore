package center.kit.app.homework.lesson6;

import center.kit.app.classwork.lesson4.NarrowingCasting;
import center.kit.app.classwork.lesson4.WideningCasting;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CastingTest {


    @Test
    public void wideningCastingTest(){
        WideningCasting wCast = new WideningCasting();
        byte value = 127;
        double expected = 127d;
        Assert.assertEquals(expected, wCast.widening(value), 0);

    }

    @Test
    public void narrowingCastingTest(){
        NarrowingCasting nCast = new NarrowingCasting();
        float expected = 123.003f;
        double inputValue = 123.003d;
        nCast.narrowing(inputValue);
        Assert.assertEquals(expected, nCast.float1, 0);
    };
}
