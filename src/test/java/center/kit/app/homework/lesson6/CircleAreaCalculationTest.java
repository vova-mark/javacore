package center.kit.app.homework.lesson6;

import center.kit.app.classwork.lesson5.CircleArea;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(JUnitParamsRunner.class)
public class CircleAreaCalculationTest {

    @Test
    @FileParameters(value = "src/test/resources/data4circleareacalc.csv", mapper = CsvWithHeaderMapper.class)
    public void calculateCircleAreaTest(float arg, float expOut){

        Assert.assertEquals(expOut, CircleArea.calculateCircleArea(arg), 0);
    }

    @Test
    @FileParameters(value = "src/test/resources/comparecirclesdata.csv", mapper = CsvWithHeaderMapper.class)
    public void calculateBiggerCircleTest(float arg1, float arg2, String expResult){

        Assert.assertEquals(expResult, CircleArea.calculateBigger(arg1, arg2));
    }



}
