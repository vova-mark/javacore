package center.kit.runners.homework.lesson6;

import center.kit.app.classwork.lesson5.CircleArea;
import center.kit.app.homework.Lesson6.NumberDefine;
import center.kit.app.homework.Lesson6.TriangleSides;
import center.kit.app.homework.lesson8.ConsoleInputHelper;

import java.util.Scanner;

public class HometaskLesson6Runner {

    private static boolean finish = false;

    public static void main(String[] args) {

        HometaskLesson6Runner.run();
    }

    public static void run(){
        do {
            System.out.println("What would you like to do?\n" +
                    "1. Check if the digits are sides of right-angled triangle.\n" +
                    "2. Compare two circles areas.\n" +
                    "3. Calculate circle area.\n" +
                    "4. Define what number is bigger\n" +
                    "5. Exit\n");
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
        } while (!finish);
    }

    private static void defineTriangleSides(){

        System.out.println("Enter the lengths of the sides of the triangle");
        Scanner scanner = new Scanner(System.in);
            float firstSide = ConsoleInputHelper.getFloat(scanner);
            float secondSide = ConsoleInputHelper.getFloat(scanner);
            float thirdSide = ConsoleInputHelper.getFloat(scanner);

        if (TriangleSides.checkTriangleSides(firstSide, secondSide, thirdSide)) {
            System.out.println("This could be the sides of right-angled triangle");;
        } else {
            System.out.println("It's not a right-angled triangle");
        }
    }

    private static void defineRadii(){

        System.out.println("Enter two values of circles radii");
        Scanner scanner = new Scanner(System.in);
        float radius1 = ConsoleInputHelper.getFloat(scanner);
        float radius2 = ConsoleInputHelper.getFloat(scanner);
        System.out.println(CircleArea.calculateBigger(radius1, radius2));
    }

    private static void defineNumbersToCompare(){

        System.out.println("Enter two values to compare");
        Scanner scanner = new Scanner(System.in);
        float firstNumber = ConsoleInputHelper.getFloat(scanner);
        float secondNumber = ConsoleInputHelper.getFloat(scanner);
        System.out.println(NumberDefine.defineWhosBigger(firstNumber, secondNumber));
    }

    private static void defineCircleArea(){

        System.out.println("Enter circle radius and press enter");
        Scanner scanner = new Scanner(System.in);
        float radius = ConsoleInputHelper.getFloat(scanner);
        double area = CircleArea.calculateCircleArea(radius);
        System.out.printf("Circle area = %.2f\n",  area);

    }



}
