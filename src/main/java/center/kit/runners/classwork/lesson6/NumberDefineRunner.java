package center.kit.runners.classwork.lesson6;

import center.kit.app.classwork.lesson6.NumberDefine;

import java.io.BufferedReader;
import java.nio.Buffer;
import java.util.Scanner;

public class NumberDefineRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number ");
        int number = scanner.nextInt();

        System.out.println("Nuber is "+ NumberDefine.evenOrOdd(number));

    }
}
