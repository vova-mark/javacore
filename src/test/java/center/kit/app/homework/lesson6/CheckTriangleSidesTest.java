package center.kit.app.homework.lesson6;

import center.kit.app.homework.Lesson6.TriangleSides;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(JUnitParamsRunner.class)
public class CheckTriangleSidesTest {

    @Test
    @FileParameters(value = "src/test/resources/triangletruedata.csv", mapper = CsvWithHeaderMapper.class)
    public void checkTriangleSidesTrueTest(float side1, float side2, float side3){

        Assert.assertTrue(TriangleSides.checkTriangleSides(side1, side2, side3));
    }

    @Test
    @FileParameters(value = "src/test/resources/trianglefalsedata.csv", mapper = CsvWithHeaderMapper.class)
    public void checkTriangleSidesFalceTest(float side1, float side2, float side3){

        Assert.assertFalse(TriangleSides.checkTriangleSides(side1, side2, side3));
    }
}
