package center.kit.runners.classwork.lesson7;

import center.kit.app.classwork.lesson7.Palindrome;

import java.util.Scanner;

public class PalindromeRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the word:");
        String input = scanner.nextLine();


        System.out.println("1. Is input palindrome: " + Palindrome.isPalindrome(input));
    }
}
