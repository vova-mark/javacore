package center.kit.runners.homework.lesson4.utils.convertors;

import center.kit.app.homework.lesson4.utils.convertors.PrimitiveConvertor;
import center.kit.app.homework.lesson8.ConsoleInputHelper;

import java.lang.reflect.Executable;
import java.util.Scanner;

public class HometaskLesson4Runner {

    private static boolean finish = false;

    public static void main(String[] args) {

        run();
    }

    //TODO need to fix numeric input after enum been added
    public static void run(){
        do {
            System.out.println("What do you want to do?\n" +
                                "1. Convert int to char\n" +
                                "2. Convert float to char\n" +
                                "3. Convert char to int\n" +
                                "4. Exit.\n" +
                    "Make your choice. Type one, two, three or four in any case and press Enter");

            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNext()){
                PrimitiveConvertor convertor = new PrimitiveConvertor();
                String memberChoice = scanner.next();

                //TODO лучше пробежаться по массиву значений emum'а, а не обрабатывать exception
                try {
                    Lesson4MenuItemsEnum choice = Lesson4MenuItemsEnum.valueOf(memberChoice.toUpperCase());

                    switch (choice){

                        case ONE:
                            System.out.println("Enter integer");
                            int intValue = (int)ConsoleInputHelper.getFloat(scanner);
                            System.out.println("Input int value is: " + intValue + ". Output char value is: " + convertor.intToChar(intValue));
                            break;

                        case TWO:
                            System.out.println("Enter float");
                            float floatValue = ConsoleInputHelper.getFloat(scanner);
                            System.out.println("Input float value is: " + floatValue + ". Output char value is: " + convertor.floatToChar(floatValue));
                            break;

                        case THREE:
                            System.out.println("Enter letter (just one)");
                            char charValue = ConsoleInputHelper.getChar(scanner);
                            System.out.println("Input char value is: " + charValue + ". Output int value is: " + convertor.charToInt(charValue));
                            break;

                        case FOUR:
                            System.out.println("Have a nice day.");
                            finish = true;
                            break;

                        default:
                            System.out.println("There isn't such number in menu");
                            break;
                    }
                } catch (Exception ex) {
                    System.out.println("Input exist menu item. " + ex.getMessage());
                }
            }else {
                System.out.println("Something wrong have been entered. ");
            }
        } while (!finish);

    }
}
