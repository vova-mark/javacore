package center.kit.app.classwork.lesson6;

import java.util.Arrays;

public class ArraysFun {

    public static String printArrayContent(Object[] array){

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        return "done";

    }
}
