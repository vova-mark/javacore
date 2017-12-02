package center.kit.homework.lesson5;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MathFloatRoundMethodTest {

        private Float inputFloatValue;
        private Integer expectedInt;

        public MathFloatRoundMethodTest(Float input, Integer expected ){
            inputFloatValue = input;
            expectedInt = expected;
        }

        @Parameterized.Parameters
        public static Collection testData() {
            Object[][] data = new Object[][]{
                    {2.49f, 2},
                    {2.499f, 2},
                    {2.00f, 2},
                    {2.5f, 3},
                    {2.99f, 3},
                    {2.51f, 3},
                    {0f, 0},
                    {-0.1f, 0},
                    {0.1f, 0},
                    {-2.1f, -2},{2.49f, 2},
                    {-2.499f, -2},
                    {-2.00f, -2},
                    {-2.5f, -2}, //интересное получается округление
                    {-2.99f, -3},
                    {-2.51f, -3}
            };
            return Arrays.asList(data);
        }

        @Test
        public void roundFloatTest(){
            Assert.assertEquals(expectedInt, Math.round(inputFloatValue), 0);
        }

}
