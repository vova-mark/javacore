package center.kit.app.homework.lesson8;

import java.util.*;

public class ConsoleInputHelper {

    public static float getFloat(Scanner scanner) {

        boolean isDone = false;
        float result = 0.0f;
        do {
            if (scanner.hasNextFloat()) {
                isDone = true;
                result = scanner.nextFloat();
            } else if (scanner.hasNext()) {
                scanner.next();
                System.out.println("Wrong input. Please input numeric value");
            }
        } while (!isDone);
        return result;
    }

    public static char getChar(Scanner scanner) {
        boolean isDone = false;
        char result = '!';
        do {
            if (scanner.hasNext()) {
                String input = scanner.next();
                if (input.length() > 1) {
                    System.out.println("Type only one letter");
                } else {
                    result = input.charAt(0);
                    isDone = true;
                }
            }
        } while (!isDone);
        return result;
    }

    public static String getString(Scanner scanner) {
        boolean isDone = false;
        String result = "";
        do {
            if (scanner.hasNext()) {
                result = scanner.next();
                isDone = true;
            }
        } while (!isDone);
        return result;
    }

    public static String[] getArrayOfData(Scanner scanner, String finishWord) {

        ArrayList<String> data = new ArrayList<>();
        boolean isDone = false;
        do {
            if (scanner.hasNext()) {
                String line = scanner.next();
                if (line.contains(finishWord)) {
                    isDone = true;
                    data.add(line.substring(0, line.indexOf(finishWord)));
                    break;
                }
                data.add(line);
            }
        } while (!isDone);
        return data.toArray(new String[data.size()]);
    }

    public static Map<String, String> getProperties(String pattern) {

        Map<String, String> propsMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String line = "";
        do {
            line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            } else if (line.length() > 0) {
                String[] pairs = line.split(pattern);
                if (pairs.length >= 2) {
                    propsMap.put(pairs[0], pairs[1]);
                }
            }
        } while (true);

        return propsMap;
    }

    public static int getInt(Scanner scanner) {
        boolean isDone = false;
        int result = 0;
        do {
            if (scanner.hasNextInt()) {
                isDone = true;
                result = scanner.nextInt();
            } else if (scanner.hasNext()){
                scanner.next();
                System.out.println("Input integer numeric value");
            }
        }while (!isDone);
        return result;
    }

    public static boolean getBoolean(Scanner scanner) {
        boolean isDone = false;
        boolean result = false;
        do {
            if (scanner.hasNextBoolean()) {
                isDone = true;
                result = scanner.nextBoolean();
            } else if (scanner.hasNext()){
                scanner.next();
                System.out.println("Input 'true' or 'false'");
            }
        }while (!isDone);
        return result;
    }

}
