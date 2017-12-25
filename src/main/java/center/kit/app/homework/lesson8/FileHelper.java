package center.kit.app.homework.lesson8;

import java.io.*;
import java.util.*;


public class FileHelper {

    String userDir = System.getProperty("user.dir");

    public String[] readFromFile(String fileName) throws IOException{

        File file = new File(userDir, fileName);
        ArrayList<String> dataFromFile = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = reader.readLine()) != null){
                dataFromFile.add(line);
            }
        }
        return dataFromFile.toArray(new String[dataFromFile.size()]);
    }

    public void writeToFile(String fileName, String[] dataToWrite) throws IOException{

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))){
            for (String line  : dataToWrite){
                bufferedWriter.write(line + "\n");
            }
        }
    }

    public void writeToFile(String fileName, String[][] dataToWrite) throws IOException{

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))){
            for (int i = 0; i < dataToWrite.length; i++){
                for (int j = 0; j < dataToWrite[i].length; j++){
                    bufferedWriter.write(dataToWrite[i][j] + " ");
                }
                bufferedWriter.newLine();
            }
        }

    }

    public void writeToFile(String fileName, int[][] dataToWrite) throws IOException{

        File file = new File(userDir, fileName);

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
            for (int i = 0; i < dataToWrite.length; i++){
                for (int j = 0; j < dataToWrite[i].length; j++){
                    bufferedWriter.write(dataToWrite[i][j] + " ");
                }
                bufferedWriter.newLine();
            }
        }

    }

    public Properties loadPropertyFile (String fileName) throws IOException {

        Properties properties = new Properties();
        properties.load(new FileInputStream(fileName));
        return properties;
    }

    public void writePropertiesToFile (String fileName, Map<String, String> dataToWrite) throws IOException{
        Properties properties = new Properties();
        properties.putAll(dataToWrite);
        properties.store(new FileOutputStream(fileName), null);
    }

}
