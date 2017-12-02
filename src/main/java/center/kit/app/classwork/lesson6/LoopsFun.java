package center.kit.app.classwork.lesson6;

public class LoopsFun {
    public static void checkNumbersAB(int a, int b){
        do {
            System.out.println("A = " + a + ". B = " + b);
            a--;
        }while(a >= b);
    }

    public static void printNumbersLoopFor(){
        for (int i = 0; i <=10; i++){
            System.out.print(i + " ");
        }
    }
    public static int countEvenNumbers(int number){
        int counter = 0;
        for (int i = 0; i <= number; i++){
            if (i%2 == 0){
                counter += 1;
            }
        }
        return counter;
    }
}
