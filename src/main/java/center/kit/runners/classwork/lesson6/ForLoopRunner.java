package center.kit.runners.classwork.lesson6;

import center.kit.app.classwork.lesson6.LoopsFun;

public class ForLoopRunner {
    public static void main(String[] args) {

        int endPointArrayNumbers = 20;

        LoopsFun loopsFun = new LoopsFun();
        loopsFun.printNumbersLoopFor();
        System.out.println();
        System.out.println(LoopsFun.countEvenNumbers(endPointArrayNumbers));

    }
}
