package center.kit.app.classwork.lesson10;

public class FileRd extends Reader {

    @Override
    public void read(String location) {
        System.out.println("Reading from hard disk. " + "Location is " + location);
    }
}
