package center.kit.app.classwork.lesson6;

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
}
