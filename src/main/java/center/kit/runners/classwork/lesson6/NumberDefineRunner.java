package center.kit.runners.classwork.lesson6;

import center.kit.app.homework.Lesson6.NumberDefine;

import java.util.Scanner;

public class NumberDefineRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number ");
        int number = scanner.nextInt();

        System.out.println("Nuber is "+ NumberDefine.evenOrOdd(number));

    }
}
