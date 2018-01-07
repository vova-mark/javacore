package center.kit.runners.homework.lesson4.utils.convertors;

import center.kit.app.homework.lesson4.utils.convertors.Lesson4MenuItemsEnum;
import center.kit.app.homework.lesson4.utils.convertors.PrimitiveConvertor;
import center.kit.app.homework.lesson8.ConsoleInputHelper;

import java.util.Scanner;

public class HometaskLesson4Runner {

    private static boolean finish = false;

    public static void main(String[] args) {

        run();
    }

    public static void run() {
        do {
            for (Lesson4MenuItemsEnum item : Lesson4MenuItemsEnum.values()) {
                System.out.println(item.ordinal() + 1 + ". " + item.getFullName());
            }
            System.out.println("Make your choice. Type 'one', 'two', 'three' or 'four' and press Enter");


            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNext()) {
                PrimitiveConvertor convertor = new PrimitiveConvertor();
                String memberChoice = scanner.next();

                if (Lesson4MenuItemsEnum.contains(memberChoice)) {

                    Lesson4MenuItemsEnum choice = Lesson4MenuItemsEnum.valueOf(memberChoice.toUpperCase());
                    switch (choice) {

                        case ONE:
                            System.out.println("Enter integer");
                            int intValue = (int) ConsoleInputHelper.getFloat(scanner);
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
                    }
                } else {
                    System.out.println("Wrong input. Type 'one', 'two', 'three' or 'four' and press Enter");
                }
            }
        } while (!finish);

    }
}
