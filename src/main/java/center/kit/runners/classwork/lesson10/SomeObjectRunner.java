package center.kit.runners.classwork.lesson10;

import center.kit.app.classwork.lesson10.SomeObject;

public class SomeObjectRunner {
    public static void main(String[] args) {
        SomeObject obj1 = new SomeObject();
        obj1.setVariable1("FirstVar");
        obj1.setVariable2("SecondVar");

        SomeObject obj2 = new SomeObject();

        System.out.println(obj1.equals(obj2));

        boolean checkHashes = obj1.hashCode() == obj2.hashCode();
        System.out.println("Hashes of two objects are equal: " + checkHashes);

        obj2.setVariable1("FirstVar");
        obj2.setVariable2("SecondVar");
        System.out.println(obj1.equals(obj2));

        checkHashes = obj1.hashCode() == obj2.hashCode();
        System.out.println("Hashes of two objects are equal: " + checkHashes);


    }
}
