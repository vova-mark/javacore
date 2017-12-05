package center.kit.runners.homework.lesson6;

import center.kit.app.classwork.lesson5.CircleArea;
import center.kit.app.homework.Lesson6.NumberDefine;
import center.kit.app.homework.Lesson6.TriangleSides;

import java.util.Scanner;

public class Lesson6Runner {

    private static boolean finish = false;

    public static void main(String[] args) {
        do {
            System.out.println("What would you like to do?\n" +
                    "1. Check if the digits are sides of right-angled triangle.\n" +
                    "2. Compare two circles areas.\n" +
                    "3. Calculate circle area.\n" +
                    "4. Define what number is bigger\n" +
                    "5. Exit\n");

            Lesson6Runner.run();

        }while(!finish);
    }

    private static void run(){
        System.out.println("Input number of menu point");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            int memberchoise = scanner.nextInt();

            switch (memberchoise){

                case 1:
                    defineTriangleSides();
                    System.out.println();
                    break;

                case 2:
                    defineRadii();
                    System.out.println();
                    break;

                case 3:
                    defineCircleArea();
                    System.out.println();
                    break;

                case 4:
                    defineNumbersToCompare();
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Have a nice day.");
                    finish = true;
                    break;

                default:
                    System.out.println("There isn't such number in menu");
                    break;
            }
        }
        else if(scanner.hasNext()){
            System.out.println("Something wrong have been entered");
        }
    }

    private static void defineTriangleSides(){

        System.out.println("Enter the lengths of the sides of the triangle");
        Scanner scanner = new Scanner(System.in);
            float firstSide = getFloat(scanner);
            float secondSide = getFloat(scanner);
            float thirdSide = getFloat(scanner);

        if (TriangleSides.checkTriangleSides(firstSide, secondSide, thirdSide)) {
            System.out.println("This could be the sides of right-angled triangle");;
        } else {
            System.out.println("It's not a right-angled triangle");
        }
    }

    private static void defineRadii(){

        System.out.println("Enter two values of circles radii");
        Scanner scanner = new Scanner(System.in);
        float radius1 = getFloat(scanner);
        float radius2 = getFloat(scanner);
        System.out.println(CircleArea.calculateBigger(radius1, radius2));
    }

    private static void defineNumbersToCompare(){

        System.out.println("Enter two values to compare");
        Scanner scanner = new Scanner(System.in);
        float firstNumber = getFloat(scanner);
        float secondNumber = getFloat(scanner);
        System.out.println(NumberDefine.defineWhosBigger(firstNumber, secondNumber));
    }

    private static void defineCircleArea(){

        System.out.println("Enter circle radius and press enter");
        Scanner scanner = new Scanner(System.in);
        float radius = getFloat(scanner);
        double area = CircleArea.calculateCircleArea(radius);
        System.out.printf("Circle area = %.2f\n",  area);

    }

    private static float getFloat(Scanner scanner) {

        boolean isDone = false;
        float result = 0.0f;
        do {
            if (scanner.hasNextFloat()) {
                isDone = true;
                result = scanner.nextFloat();
            }
            else if (scanner.hasNext()){
                scanner.next();
                System.out.println("Wrong input. Please input numeric value");
            }
        } while (!isDone);
        return result;
    }


}
