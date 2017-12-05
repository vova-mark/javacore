package center.kit.app.homework.lesson6;

import center.kit.app.homework.lesson4.utils.convertors.PrimitiveConvertor;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

//@RunWith()
public class PrimitiveConvertorsTest {

    PrimitiveConvertor converter = new PrimitiveConvertor();

    @Test
    public void floatToCharMethodTest(){
        Assert.assertEquals('!', converter.floatToChar(33.45684f));
    }

    @Test
    public void intToCharMethodTest(){
        Assert.assertEquals('!', converter.intToChar(33));
    }

    @Test
    public void charToIntMethodTest(){
        Assert.assertEquals(33, converter.charToInt('!'));
    }
}
