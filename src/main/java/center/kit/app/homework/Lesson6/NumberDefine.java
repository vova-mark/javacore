package center.kit.app.homework.Lesson6;

public class NumberDefine {

    public static String evenOrOdd(int number){

        if (number == 0){
            return "zero";
        }
        else if (number%2 == 0){
            return "even";
        }
        else {
            return  "odd";
        }
    }

    public static String defineWhosBigger(float firstNumber, float secondNumber){

        if (firstNumber == secondNumber){
            return "Numbers are equal";
        }
        else if (firstNumber > secondNumber){
            return  "First is bigger";
        }
        else {
            return  "Second is bigger";
        }
    }
}
