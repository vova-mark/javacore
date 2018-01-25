package center.kit.runners.homework.lesson12;

import center.kit.app.homework.lesson12.ArraySorterGenerics;

import java.util.Arrays;

public class GenericsRunner {
    public static void main(String[] args) {

        Integer[] array = {1,3,2,4,2,1,2,5,6,4,3,2,1,6,7,8,9,0};

        ArraySorterGenerics.sort(array);

        System.out.println(Arrays.toString(array));

        Integer[] arr = {1,22,3,3,3,4,6,5,32,1,23,12,243,34,45,2,23,1,1,12,3,3,4,34,6,23,35,46};

        ArraySorterGenerics<Integer>  instance = new ArraySorterGenerics<>(arr);

        System.out.println(Arrays.toString(instance.getInnerArray()));

        instance.sort();

        System.out.println(Arrays.toString(instance.getInnerArray()));


    }
}
