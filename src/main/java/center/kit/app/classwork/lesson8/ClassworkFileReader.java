package center.kit.app.classwork.lesson8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ClassworkFileReader {

    public String fileRead(String path) throws IOException {
        String result = "";

            BufferedReader reader =  new BufferedReader(new FileReader(path));
            try (reader){
                result += reader.readLine();
                return result;
            }


        //in java before v.9.0.....
        /*BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("d:\\Kit\\Temp.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        }catch (FileNotFoundException ex){
            ex.printStackTrace();

        }catch (IOException e) {
            e.printStackTrace();

        }finally {
            System.out.println("Finally Done!!!!!");
        }*/
    }
}
