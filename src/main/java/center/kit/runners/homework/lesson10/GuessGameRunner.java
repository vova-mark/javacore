package center.kit.runners.homework.lesson10;

import center.kit.app.homework.lesson10.FamousPeople;
import center.kit.app.homework.lesson8.ConsoleInputHelper;

import java.util.Random;
import java.util.Scanner;

public class GuessGameRunner {
    public static void main(String[] args) {
        runGame();
    }

    public static void runGame() {

        boolean isFinish = false;
        Random rnd = new Random(System.currentTimeMillis());
        FamousPeople[] peoples = FamousPeople.values();
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int prevRnd = -1;
        System.out.println("I want to play a game..." +
                "It will be over after three guessed people");

        do {
            int rndInt = rnd.nextInt(FamousPeople.values().length);
            if (rndInt != prevRnd) {
                prevRnd = rndInt;
                System.out.println("Guess age of: " + peoples[rndInt].getFirstName() + " " + peoples[rndInt].getLastName() + "  " + peoples[rndInt].getAge());
                int input = ConsoleInputHelper.getInt(scanner);
                if (input == peoples[rndInt].getAge()) {
                    System.out.println("You guessed age. Is he|she alive?");
                    boolean isAlive = ConsoleInputHelper.getBoolean(scanner);
                    if (isAlive == peoples[rndInt].isAlive()) {
                        System.out.println("Exactly");
                        counter++;
                    } else {
                        System.out.println("Sorry..");
                    }
                    if (counter == 3) {
                        isFinish = true;
                        System.out.println("You win");
                    }
                } else {
                    System.out.println("Try again");
                }
            }
        } while (!isFinish);
    }
}
