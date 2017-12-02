package center.kit.runners.classwork.lesson6;

import center.kit.app.classwork.lesson6.ArraysFun;

public class ArrayRunner {
    public static void main(String[] args) {

        Integer [] arrayOfInt = {1,2,4,23,23,23,456,455,234,23,234};
        Character [] arrayOfChar = {'H','e','l','l','o',};
        int[][] arayOfArrays= new int[5][5];
        int summ = 0;

        ArraysFun.printArrayContent(arrayOfInt);
        System.out.println();

        ArraysFun.printArrayContent(arrayOfChar);
        System.out.println();

        for (int i = 0; i < arayOfArrays.length; i++){
            for (int k = 0; k < arayOfArrays[i].length; k++){
                arayOfArrays[i][k] = i*k;
                System.out.print(arayOfArrays[i][k] + " ");
            }
            System.out.println();
        }

        for (int arrayElement : arrayOfInt){
            summ +=arrayElement;
        }
        System.out.println(summ);

        System.out.println(java.util.Arrays.toString(arrayOfInt));
    }
}
