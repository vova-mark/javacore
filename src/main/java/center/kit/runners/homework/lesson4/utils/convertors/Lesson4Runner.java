package center.kit.runners.homework.lesson4.utils.convertors;

import center.kit.app.homework.lesson4.utils.convertors.PrimitiveConvertor;

public class Lesson4Runner {
    public static void main(String[] args) {

        int intValue = 34;
        float floatValue = 33.1231f;
        char charValue = '!';

        PrimitiveConvertor convertor = new PrimitiveConvertor();

        System.out.println("Input int value is: " + intValue + ". Output char value is: " + convertor.intToChar(intValue));
        System.out.println("Input float value is: " + floatValue + ". Output char value is: " + convertor.floatToChar(floatValue));
        System.out.println("Input char value is: " + charValue + ". Output int value is: " + convertor.charToInt(charValue));

    }
}
