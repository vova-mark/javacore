package center.kit.app.homework.lesson7;

import java.util.Random;
import java.util.Scanner;

public class HomeworkArrays {

    public void arrayOfEvenNumbersPrint(){

        int [] array = new int[10];

        for (int i = 2, k = 0; i <= 20; i++){
            if (i%2==0){
                array[k] = i;
                k++;
            }
        }

        for (int number : array){
            System.out.print(number + " ");
        }

        System.out.println();

        for (int number : array){
            System.out.print(number + "\n");
        }
    }

    public void arrayOddNumbersPrint(){

        int inputNumber = 99;
        int arrayOfOddNumbersSize = (int)Math.round(inputNumber/2 + 1);
        int[] array = new int[arrayOfOddNumbersSize];

        for (int i = 1, k = 0; i<=inputNumber; i++){
            if (i%2 != 0){
                array[k] = i;
                k++;
            }
        }

        for (int number : array){
            System.out.print(number + " ");
        }

        System.out.println();

        for (int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int[] getRandomNumbersArray(int arraySize, int rangeStart, int rangeStop){

        int[] array = new int[arraySize];
        Random rnd = new Random(System.currentTimeMillis());

        for (int i = 0; i < array.length; i++){

            array[i] = rnd.nextInt(rangeStop - rangeStart + 1) + rangeStart;
        }
        return array;
    }

    public int countEvenNumbersInArray(int[] inputArray){
        int counter = 0;

        for (int number : inputArray){
            if (number %2 == 0){
                counter++;
            }
        }
        return counter;
    }

    public int findMinValueInArray(int[] array){

        int minValue = array[0];

        for (int item : array){
            if(item < minValue){
                minValue = item;
                }
            }
        return minValue;
    }

    public int findMaxValueInArray(int[] array){

        int maxValue = array[0];

        for (int item : array){
            if(item > maxValue){
                maxValue = item;
            }
        }
        return maxValue;
    }

    public int[][] getMultiDimensionalArray(int size1, int size2, int rangeStart, int rangeStop){

        Random rnd = new Random(System.currentTimeMillis());
        int[][] array = new int[size1][size2];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = rnd.nextInt(rangeStop - rangeStart + 1) + rangeStart;
            }
        }
        return array;
    }

    public void printMatrixMultiDimensionalArrayWithLeftAlign(int[][] array){

        for (int i = 0; i <array.length; i++) {
            System.out.print("List " + (i + 1) + ": ");

            for (int j = 0; j < array[i].length; j++) {

                System.out.format("%3d ", array[i][j]);
            }
            System.out.println();
        }
    }

    public float summOfUserInput(){

            float input = 0f;
            boolean exit = false;

            System.out.println("Numbers input (to finish enter \"exit\" )");
            Scanner scanner = new Scanner(System.in);

            do{
                System.out.println("Enter number, then press enter");
                if (scanner.hasNextFloat()){
                    input += scanner.nextFloat();
                }
                else if (scanner.hasNext("exit")){
                    exit = true;
                }
            }while(!exit);

            return input;

    }
}
