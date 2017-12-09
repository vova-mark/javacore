package center.kit.runners.homework.lesson7;

import center.kit.app.homework.lesson7.HomeworkArrays;

import java.util.Arrays;

public class HomeworkArraysRunner {
    public static void main(String[] args) {

        HomeworkArrays homeworkArrays = new HomeworkArrays();

        System.out.println("task a");
        homeworkArrays.arrayOfEvenNumbersPrint();
        System.out.println();

        System.out.println("task b");
        homeworkArrays.arrayOddNumbersPrint();
        System.out.println();

        System.out.println("task c");
        int[] firstArray = homeworkArrays.getRandomNumbersArray(15, 0, 9);
        System.out.println(Arrays.toString(firstArray));
        int evenNumbersCount = homeworkArrays.countEvenNumbersInArray(firstArray);
        System.out.println("Number of even numbers in array = " + evenNumbersCount);
        System.out.println();

        System.out.println("task d");
        int[] secondArray = homeworkArrays.getRandomNumbersArray(15, 0, 999);
        System.out.println(Arrays.toString(secondArray));
        System.out.println("Max value in array = " + homeworkArrays.findMaxValueInArray(secondArray));
        System.out.println("Min value in array = " + homeworkArrays.findMinValueInArray(secondArray));
        System.out.println();


        System.out.println("task e");
        int[][] thirdArray = homeworkArrays.getMultiDimensionalArray(8, 5, 10, 99);
        for (int i =0; i < thirdArray.length; i++){
            for (int j = 0; j < thirdArray[i].length; j++){
                System.out.print(thirdArray[i][j] + " ");
            }
        }
        System.out.println();

        System.out.println("task f");
        int[][] fouthArray = homeworkArrays.getMultiDimensionalArray(8, 5, 1, 999);
        homeworkArrays.printMatrixMultiDimensionalArrayWithLeftAlign(fouthArray);
        System.out.println();


        System.out.println("task g");
        float result = homeworkArrays.summOfUserInput();
        System.out.println("Summ of input = " + result);
    }
}
