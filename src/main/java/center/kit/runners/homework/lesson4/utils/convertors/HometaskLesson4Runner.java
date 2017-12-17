package center.kit.runners.homework.lesson4.utils.convertors;

import center.kit.app.homework.lesson4.utils.convertors.PrimitiveConvertor;
import center.kit.app.homework.lesson8.ConsoleInputHelper;

import java.util.Scanner;

public class HometaskLesson4Runner {

    private static boolean finish = false;

    public static void main(String[] args) {

        run();
    }

    public static void run(){
        do {
            System.out.println("What do you want to do?\n" +
                                "1. Convert int to char\n" +
                                "2. Convert float to char\n" +
                                "3. Convert char to int\n" +
                                "4. Exit.\n" +
                    "Make your choice");

            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()){
                PrimitiveConvertor convertor = new PrimitiveConvertor();
                int memberChoice = scanner.nextInt();

                switch (memberChoice){

                    case 1:
                        System.out.println("Enter integer");
                        int intValue = (int)ConsoleInputHelper.getFloat(scanner);
                        System.out.println("Input int value is: " + intValue + ". Output char value is: " + convertor.intToChar(intValue));
                        break;

                    case 2:
                        System.out.println("Enter float");
                        float floatValue = ConsoleInputHelper.getFloat(scanner);
                        System.out.println("Input float value is: " + floatValue + ". Output char value is: " + convertor.floatToChar(floatValue));
                        break;

                    case 3:
                        System.out.println("Enter letter (just one)");
                        char charValue = ConsoleInputHelper.getChar(scanner);
                        System.out.println("Input char value is: " + charValue + ". Output int value is: " + convertor.charToInt(charValue));
                        break;

                    case 4:
                        System.out.println("Have a nice day.");
                        finish = true;
                        break;

                    default:
                        System.out.println("There isn't such number in menu");
                        break;
                }

            }else if(scanner.hasNext()){
                System.out.println("Something wrong have been entered");
            }
        } while (!finish);
    }
}
