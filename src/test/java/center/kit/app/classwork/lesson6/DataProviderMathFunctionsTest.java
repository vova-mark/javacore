package center.kit.app.classwork.lesson6;

import center.kit.app.classwork.lesson5.MathFunc;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class DataProviderMathFunctionsTest {

    @Test
    @FileParameters(value = "src/test/resources/testdata.csv", mapper = CsvWithHeaderMapper.class)
    public void dataProviderTestAdd(int argA, int argB, int expOut){
        Assert.assertEquals(expOut, MathFunc.multiply(argA, argB));
    }

}
