package center.kit.runners.homework.lesson8;

import center.kit.app.homework.lesson7.HomeworkArrays;
import center.kit.app.homework.lesson8.ConsoleInputHelper;
import center.kit.app.homework.lesson8.FileHelper;
import center.kit.app.homework.lesson8.PalindromeDefiner;

import java.io.IOException;
import java.util.*;

public class HometaskLesson8FilesRunner {

    private static boolean finish = false;

    public static void main(String[] args) {

        do {
            System.out.println("1.Read array from file/sort/write sorted to file\n" +
                    "2.Define palindromes in file\n" +
                    "3.Write data to file\n" +
                    "4.Properties file\n" +
                    "5.Exit");

            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                switch (choice) {

                    case 1:
                        firstTaskRun(scanner);
                        break;
                    case 2:
                        secondTaskRun(scanner);
                        break;
                    case 3:
                        thirdTaskRun(scanner);
                        break;
                    case 4:
                        fouthTaskRun(scanner);
                        break;
                    case 5:
                        finish = true;
                        break;
                    default:
                        System.out.println("Wrong menu item");
                        break;
                }
            } else if (scanner.hasNext()) {
                System.out.println("Wrong input");
            }
        } while (!finish);
    }

    private static void fouthTaskRun(Scanner scanner) {

        System.out.println("Enter the name of properties file");
        String fileName = ConsoleInputHelper.getString(scanner);


        System.out.println("Enter the prop.name and its value separated with coma and then press enter." +
                "To finish leave the line empty and press enter.");

        Map<String, String> propertiesData = ConsoleInputHelper.getProperties(", ");


        try {
            FileHelper fileHelper = new FileHelper();
            fileHelper.writePropertiesToFile(fileName, propertiesData);
            System.out.println("Properties were writed");
            Properties prop = fileHelper.loadPropertyFile(fileName);

            if (!prop.isEmpty()) {
                Enumeration<?> listOfPropNames = prop.propertyNames();
                while (listOfPropNames.hasMoreElements()) {
                    String key = (String) listOfPropNames.nextElement();
                    String value = prop.getProperty(key);
                    System.out.println(key + "=" + value);
                }
                System.out.println();
            }else{
                System.out.println("Nothing to show");
            }
        }catch(
                IOException ex)
        {
            ex.getMessage();
        }
    }

    private static void thirdTaskRun(Scanner scanner) {
        System.out.println("Enter the file name to write to");
        String writeFileName = ConsoleInputHelper.getString(scanner);

        System.out.println("Enter the data. To finish type *exit*");
        String[] dataToWrite = ConsoleInputHelper.getArrayOfData(scanner, "*exit*");
        try {
            FileHelper fileHelper = new FileHelper();
            fileHelper.writeToFile(writeFileName, dataToWrite);
        } catch (IOException ex) {
            System.out.println("Something happened. " + ex.getMessage());;
        }
        System.out.println("I'ts done");
    }

    private static void secondTaskRun(Scanner scanner) {
        System.out.println("Enter the file name to read from");
        String readFileName = ConsoleInputHelper.getString(scanner);

        try {
            FileHelper fileHelper = new FileHelper();
            String[] dataFromFile = fileHelper.readFromFile(readFileName);

            if (dataFromFile != null) {
                for (int i = 0; i < dataFromFile.length; i ++){
                    if (PalindromeDefiner.isPalindromeCompareBytes(dataFromFile[i])){
                        dataFromFile[i] += " - is polindrome";
                    }
                }
                System.out.println("Enter the file name to write to");
                String writeFileName = ConsoleInputHelper.getString(scanner);
                fileHelper.writeToFile(writeFileName, dataFromFile);
                System.out.println("It's done.");
            } else {
                System.out.println("Can't read data from file");
            }
        } catch (IOException ex) {
            System.out.println("There are some problems with file: " + ex.getMessage());
        } catch (NumberFormatException ex){
            System.out.println("Looks like there are not only numbers in file. " + ex.getMessage());
        }
    }

    private static void firstTaskRun(Scanner scanner){
        System.out.println("Enter the file name to read from");
        String readFileName = ConsoleInputHelper.getString(scanner);
        String[] dataFromFile = null;
        try {
            FileHelper fileHelper = new FileHelper();
            dataFromFile = fileHelper.readFromFile(readFileName);

            if (dataFromFile != null) {
                int[][] arrayOfIntegers = new int[dataFromFile.length][];

                for (int i = 0; i < dataFromFile.length; i++) {

                    int[] arrayOfInts = HomeworkArrays.getArrayOfIntegersFromString(dataFromFile[i], ",");
                    arrayOfIntegers[i] = new int[arrayOfInts.length];
                    for (int j = 0; j < arrayOfInts.length; j++) {
                        arrayOfIntegers[i][j] = arrayOfInts[j];
                    }
                    Arrays.sort(arrayOfIntegers[i]);
                }
                System.out.println("Enter the file name to write to");
                String writeFileName = ConsoleInputHelper.getString(scanner);
                fileHelper.writeToFile(writeFileName, arrayOfIntegers);
                System.out.println("It's done.");
            } else {
                System.out.println("Can't read data from file");
            }
        } catch (IOException ex) {
            System.out.println("There are some problems with file: " + ex.getMessage());
        } catch (NumberFormatException ex){
            System.out.println("Looks like there are not only numbers in file. " + ex.getMessage());
        }
    }

}
