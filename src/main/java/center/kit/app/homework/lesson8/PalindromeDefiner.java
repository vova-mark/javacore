package center.kit.app.homework.lesson8;

public class PalindromeDefiner {

    private static String reverseStringWithCharArray (String s){
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++){
            result[i] = s.charAt(s.length()-i - 1);
        }
        return new String(result);
    }

    private static String reverseString (String s){
        String reverseString = "";
        for (int i = 0; i < s.length(); i++){
            reverseString += s.charAt(s.length()-1-i);
        }
        return reverseString;
    }


    public static boolean isPalindromeCompareBytes (String s){
        boolean result = true;
        s = s.toLowerCase();
        byte[] original = s.getBytes();

        for (int i =0; i < original.length/2; i++){
            if (original[i] != original[original.length - 1 - i]){
                result = false;
            }
        }
        return result;
    }

    public static boolean isPalindromeStringReverseWithChars(String s){

        String reverseString = reverseStringWithCharArray(s);
        return s.equalsIgnoreCase(reverseString);
    }

    public static boolean isPalindromeWithHashCodes(String s){

        s = s.toLowerCase();
        String reverse = reverseString(s);
        if (s.hashCode() == reverse.hashCode()){
            return true;
        }else {
            return false;
        }
    }

}
