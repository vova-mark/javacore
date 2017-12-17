package center.kit.app.homework.lesson8;

import java.util.Scanner;

public class ConsoleInputHelper {

    public static float getFloat(Scanner scanner) {

        boolean isDone = false;
        float result = 0.0f;
        do {
            if (scanner.hasNextFloat()) {
                isDone = true;
                result = scanner.nextFloat();
            }
            else if (scanner.hasNext()){
                scanner.next();
                System.out.println("Wrong input. Please input numeric value");
            }
        } while (!isDone);
        return result;
    }

    public static char getChar(Scanner scanner) {
        boolean isDone = false;
        char result = '!';
        do {
            if (scanner.hasNext()) {
                String input = scanner.next();
                if (input.length() > 1){
                    System.out.println("Type only one letter");
                }else{
                    result = input.charAt(0);
                    isDone = true;
                }
            }
        } while (!isDone);
        return result;
    }

    public static String getString(Scanner scanner) {
        boolean isDone = false;
        String result = "";
        do {
            if (scanner.hasNext()) {
                result = scanner.next();
                isDone = true;
            }
        } while (!isDone);
        return result;
    }


}
