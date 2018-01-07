package center.kit.runners.homework.lesson8;

import center.kit.app.homework.lesson10.MenuItemsEnum;

import java.util.Scanner;

import static center.kit.app.homework.lesson10.MenuItemsEnum.*;

public class HomeTasksRunner {

    private static boolean finish = false;

    public static void main(String[] args) {

        do {
            for (MenuItemsEnum item : values()) {
                System.out.println(item.ordinal() + 1 + ". " + item.getFullName());
            }
            HomeTasksRunner.run();

        } while (!finish);

    }

    private static void run() {
        System.out.println("Input number of menu point");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {

            int memberchoise = scanner.nextInt();
            MenuItemsEnum choise = MenuItemsEnum.getValueOf(memberchoise);

            if (choise != null) {
                switch (choise) {

                    case LESSON4:
                        LESSON4.runItem();
                        System.out.println();
                        break;

                    case LESSON6:
                        LESSON6.runItem();
                        System.out.println();
                        break;

                    case LESSON7:
                        LESSON7.runItem();
                        System.out.println();
                        break;

                    case LESSON8:
                        LESSON8.runItem();
                        System.out.println();
                        break;

                    case LESSON10:
                        LESSON10.runItem();
                        System.out.println();
                        break;

                    case EXIT:
                        EXIT.runItem();
                        finish = true;
                        break;
                }
            } else {
                System.out.println("There isn't such number in menu");
            }
        } else if (scanner.hasNext()) {
            System.out.println("Something wrong have been entered");
        }
    }

}
