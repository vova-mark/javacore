package center.kit.runners.homework.lesson8;

import center.kit.runners.homework.lesson4.utils.convertors.HometaskLesson4Runner;
import center.kit.runners.homework.lesson6.HometaskLesson6Runner;
import center.kit.runners.homework.lesson7.HomeworkArraysRunner;

import java.util.Scanner;

public class HomeTasksRunner {
    private static boolean finish = false;

    public static void main(String[] args) {
        do {
            System.out.println(
                    "1. Hometask - Lesson4\n" +
                    "2. Hometask - Lesson6\n" +
                    "3. Hometask - Lesson7\n" +
                    "4. Hometask - Lesson8\n" +
                    //"5. Hometask - Lesson\n" +
                    "6. Exit\n");

            HomeTasksRunner.run();

        }while(!finish);

    }

    private static void run(){
        System.out.println("Input number of menu point");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            int memberchoice = scanner.nextInt();

            switch (memberchoice){

                case 1:
                    HometaskLesson4Runner.run();
                    System.out.println();
                    break;

                case 2:
                    HometaskLesson6Runner.run();
                    System.out.println();
                    break;

                case 3:
                    HomeworkArraysRunner.main(null);
                    System.out.println();
                    break;

                case 4:
                    HometaskLesson8Runner.run();
                    System.out.println();
                    break;

                case 6:
                    System.out.println("Good night");
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

}
