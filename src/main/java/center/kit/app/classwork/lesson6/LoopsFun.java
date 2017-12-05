package center.kit.app.classwork.lesson6;

public class LoopsFun {

    public boolean numbersChecked = false;
    public boolean numbersPrinted = false;

    public void checkNumbersAB(int a, int b){
        do {
            System.out.println("A = " + a + ". B = " + b);
            a--;
        }while(a >= b);

        this.numbersChecked = true;
    }

    public void printNumbersLoopFor(){
        for (int i = 0; i <=10; i++){
            System.out.print(i + " ");
        }
        this.numbersPrinted = true;
    }
    public static int countEvenNumbers(int number) throws IllegalArgumentException{
        int counter = 0;
        if (number >=0) {
            for (int i = 0; i <= number; i++){
                if (i%2 == 0){
                    counter += 1;
                }
            }
            return counter;
        } else {
            throw new IllegalArgumentException();
        }
    }


}
