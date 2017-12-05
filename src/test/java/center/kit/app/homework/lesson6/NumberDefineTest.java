package center.kit.app.homework.lesson6;

import center.kit.app.homework.Lesson6.NumberDefine;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class NumberDefineTest {

    @Test
    @FileParameters(value = "src/test/resources/oddevennumberdata.csv", mapper = CsvWithHeaderMapper.class)
    public void evenOrOddTest(int arg, String expected){

        Assert.assertEquals(expected, NumberDefine.evenOrOdd(arg));
    }

    @Test
    @FileParameters(value = "src/test/resources/comparenumbersdata.csv", mapper = CsvWithHeaderMapper.class)
    public void compareNumbersTest(float number1, float number2, String expected){

        Assert.assertEquals(expected, NumberDefine.defineWhosBigger(number1, number2));
    }
}
