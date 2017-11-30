package center.kit.runners.classwork.lesson5;

import center.kit.app.classwork.lesson5.CircleArea;

import java.util.Scanner;

public class CircleAreaRunner {

    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first circle radius: ");
        double firstRadius = scanner.nextDouble();
        double firstArea = CircleArea.calculate(firstRadius);
        System.out.println("Area of first circle:" + firstArea);

        System.out.println("Enter second circle radius: ");
        double secondRadius = scanner.nextDouble();
        double secondArea = CircleArea.calculate(secondRadius);
        System.out.println("Area of second circle:" + secondArea);

        CircleArea.compareAreas(firstArea, secondArea);
    }
}
