package center.kit.app.classwork.lesson5;

import java.util.Scanner;

public class CircleArea {

    public static float calculateCircleArea(float radius){
        float circleArea = (float)Math.PI * (float)Math.pow(radius, 2);
        return circleArea;
    }

    public static String calculateBigger(float radius1, float radius2){

        double area1 = CircleArea.calculateCircleArea(radius1);
        double area2 = CircleArea.calculateCircleArea(radius2);

        if ((radius1 > radius2)||(area1 > area2)){
            return "Area of first circle is bigger";
        }
        else if ((radius1 == radius2)||(area1 == area2)){
            return "Areas are equal";
        }
        else {
            return "Area of second circle is bigger";
        }
    }
}
