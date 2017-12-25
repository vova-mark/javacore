package center.kit.runners.classwork.lesson10;

import center.kit.app.classwork.lesson10.FileRd;

public class AbstaractReaderRunner {

    public static void main(String[] args) {

        FileRd fileRd = new FileRd();
        fileRd.source = "D://KIT";
        fileRd.read("LocalReading");
        fileRd.printSourceOfReading();
    }

}

