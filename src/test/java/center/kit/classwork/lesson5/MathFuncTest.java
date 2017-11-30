package center.kit.classwork.lesson5;

import center.kit.app.classwork.lesson5.MathFunc;
import org.junit.Assert;
import org.junit.Test;


public class MathFuncTest {

        @Test
        public void multiplyTest(){
            int a = 1, b = 2, expRes = 2;
            Assert.assertEquals(expRes, MathFunc.multiply(a, b));
        }

        @Test
        public void addTest(){
        int a = 1, b = 2, expRes = 3;
        Assert.assertEquals(expRes, MathFunc.add(a, b));
        }

        @Test
        public void divisionTest(){
        int a = 4, b = 2;
        float expRes = 2.0f;
        Assert.assertEquals(expRes, MathFunc.division(a, b), 2);
        }
}
