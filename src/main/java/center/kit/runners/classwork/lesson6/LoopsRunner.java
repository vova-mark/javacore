package center.kit.runners.classwork.lesson6;

import center.kit.app.classwork.lesson6.LoopsFun;

import java.util.Scanner;

public class LoopsRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input A value");
        int aNumber = scanner.nextInt();
        System.out.println("Input B value");
        int bNumber = scanner.nextInt();

        LoopsFun loopsFun = new LoopsFun();
        loopsFun.checkNumbersAB(aNumber, bNumber);

        loopsFun.printNumbersLoopFor();


    }
}
