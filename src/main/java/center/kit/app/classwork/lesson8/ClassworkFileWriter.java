package center.kit.app.classwork.lesson8;

import java.io.*;

public class ClassworkFileWriter {

    private void checkFile (File  file) throws IOException {

        if (file.exists()){
            return;
        }else{
            file.createNewFile();
        }

    }

    public void fileWrite(String path, String stringToWrite) throws IOException {

            File fileToWrite = new File(path);
            checkFile(fileToWrite);

            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(fileToWrite)
                    )
            );
            writer.write(stringToWrite);
            writer.newLine();
            writer.close();

    }
}
