package center.kit.app.classwork.lesson7;

import java.util.Timer;

public class Palindrome {

    public static boolean isPalindrome (String s) {
        long timeStart = System.currentTimeMillis();
        System.out.println("String lenght is " + s.length());
        boolean isPalindrome = true;
        s = s.toLowerCase();
        for (int i = 0; i < s.length()/2; i++){
            isPalindrome = (isPalindrome && (s.charAt(i) == s.charAt(s.length() - i -1)));
        }
        long timeStop = System.currentTimeMillis();
        System.out.println("TimeMillis " + (timeStop-timeStart));
        return isPalindrome;
    }
}
