package center.kit.app.homework.lesson7;


import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;


@RunWith(JUnitParamsRunner.class)
public class HomeworkArraysTest {

    HomeworkArrays instance = new HomeworkArrays();

    private int[] methodStringToIntArray(String string) {
        int[] result = new int[string.length()];
        for (int i = 0; i < string.length(); i++) {
            result[i] = Character.digit(string.charAt(i), 10);
        }
        return result;
    }

    private boolean checkNumber(int value, int min, int max) {
        if ((value >= min) && (value <= max)) {
            return true;
        } else {
            return false;
        }
    }

    @Test
    @FileParameters(value = "src/test/resources/testdatafiles/ArraysTestData1.csv", mapper = CsvWithHeaderMapper.class)
    public void getRandomNumbersArrayTest(int arraySize, int rangeStart, int rangeStop) {

        int[] array = instance.getRandomNumbersArray(arraySize, rangeStart, rangeStop);

        Assert.assertNotNull(array);
        Assert.assertEquals(arraySize, array.length);

        for (int element : array) {
            Assert.assertTrue(checkNumber(element, rangeStart, rangeStop));
        }
    }

    @Test
    @FileParameters(value = "src/test/resources/testdatafiles/ArraysTestData2.csv", mapper = CsvWithHeaderMapper.class)
    public void countEvenNumbersInArrayTest(String input, int expected) {
        int[] array = methodStringToIntArray(input);
        Assert.assertEquals(expected, instance.countEvenNumbersInArray(array));
    }

    @Test
    @FileParameters(value = "src/test/resources/testdatafiles/ArraysTestData3.csv", mapper = CsvWithHeaderMapper.class)
    public void findMinValueInArrayTest(String input, int expected) {
        int[] array = methodStringToIntArray(input);
        Assert.assertEquals(expected, instance.findMinValueInArray(array));
    }

    @Test
    @FileParameters(value = "src/test/resources/testdatafiles/ArraysTestData4.csv", mapper = CsvWithHeaderMapper.class)
    public void findMaxValueInArrayTest(String input, int expected) {
        int[] array = methodStringToIntArray(input);
        Assert.assertEquals(expected, instance.findMaxValueInArray(array));
    }

    @Test
    @FileParameters(value = "src/test/resources/testdatafiles/ArraysTestData5.csv", mapper = CsvWithHeaderMapper.class)
    public void getMultipleDimensionArrayTest(int size1, int size2, int rangeStart, int rangeStop) {

        int[][] array = instance.getMultiDimensionalArray(size1, size2, rangeStart, rangeStop);

        Assert.assertNotNull(array);
        Assert.assertEquals(size1, array.length);
        for (int[] innerArray : array) {
            Assert.assertEquals(innerArray.length, size2);
        }

        for (int[] element : array) {
            for (int number : element) {
                Assert.assertTrue(checkNumber(number, rangeStart, rangeStop));
            }
        }
    }

}
