package center.kit.runners.classwork.lesson8;

import center.kit.app.classwork.lesson7.Palindrome;
import center.kit.app.classwork.lesson8.ClassworkFileReader;
import center.kit.app.classwork.lesson8.ClassworkFileWriter;


import java.io.*;

public class ClassworkFileReadWriteRunner {
    public static void main(String[] args)  {

        String fileToReadPath = "\\inputFile.txt";
        String fileToWritePath = "\\outputFile.txt";
        String currentDir = System.getProperty("user.dir");

        try{
            ClassworkFileReader classworkFileReader = new ClassworkFileReader();
            String valueToCheck = classworkFileReader.fileRead(currentDir + fileToReadPath);

            if (valueToCheck != null){
                if (Palindrome.isPalindrome(valueToCheck)){
                    ClassworkFileWriter classworkFileWriter = new ClassworkFileWriter();
                    classworkFileWriter.fileWrite(currentDir + fileToWritePath, valueToCheck);
                    System.out.println(valueToCheck);
                    System.out.println("Palindrome had been written");
                }
                else{
                    System.out.println("It wasn't palindrome");
                }

            }else {
                System.out.println("Nothing to read and write");
            }

        }catch (IOException e){
            e.printStackTrace();
        }



    }
}
