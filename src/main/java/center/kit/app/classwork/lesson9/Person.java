package center.kit.app.classwork.lesson9;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void printInfo(){
        System.out.println("Person name" + name + " Person age " + age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
