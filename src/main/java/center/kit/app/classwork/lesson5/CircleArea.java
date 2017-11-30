package center.kit.app.classwork.lesson5;

import java.util.Scanner;

public class CircleArea {

    public static double calculate(double radius){

        double circleArea = Math.PI * Math.pow(radius, 2);
        return circleArea;
    }

    public static void compareAreas(double area1, double area2){

        if (area1 > area2){
            System.out.println("First area is bigger");
        }
        else if (area1 == area2){
            System.out.println("Areas are equal");
        }
        else {
            System.out.println("Second area is bigger");
        }
    }
}
