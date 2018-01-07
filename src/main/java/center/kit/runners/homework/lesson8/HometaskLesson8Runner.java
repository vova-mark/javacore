package center.kit.runners.homework.lesson8;

import center.kit.app.homework.lesson8.ConsoleInputHelper;
import center.kit.app.homework.lesson8.PalindromeDefiner;


import java.util.Scanner;

public class HometaskLesson8Runner {
    private static boolean finish = false;

    public static void main(String[] args) {
        run();
    }

    public static void run() {

        do {
            System.out.println("Enter string to define palindrome. (type \"exit\" to stop it)");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNext()) {
                if (scanner.hasNext("exit")) {
                    finish = true;
                } else {
                    String input = ConsoleInputHelper.getString(scanner);
                    System.out.println("One Is palindrome: " + PalindromeDefiner.isPalindromeCompareBytes(input));
                    System.out.println("Two Is palindrome: " + PalindromeDefiner.isPalindromeStringReverseWithChars(input));
                    System.out.println("Three Is palindrome: " + PalindromeDefiner.isPalindromeWithHashCodes(input));
                }
            }
        } while (!finish);

    }
}
