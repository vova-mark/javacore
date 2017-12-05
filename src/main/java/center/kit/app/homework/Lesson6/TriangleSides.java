package center.kit.app.homework.Lesson6;

import java.util.Scanner;

public class TriangleSides {

    public static boolean checkTriangleSides(float a, float b, float c){

        if ((a*a == (b*b + c*c))||((b*b == (a*a + c*c)))|((c*c == (a*a + b*b)))){

            return true;
        }
        else {

            return false;
        }
    }
}
