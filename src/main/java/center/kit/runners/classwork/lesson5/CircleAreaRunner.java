package center.kit.runners.classwork.lesson5;

import center.kit.app.classwork.lesson5.CircleArea;

import java.util.Scanner;

public class CircleAreaRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first circle radius: ");
        float firstRadius = scanner.nextFloat();

        System.out.println("Enter second circle radius: ");
        float secondRadius = scanner.nextFloat();

        CircleArea.calculateBigger(firstRadius, secondRadius);
    }
}
