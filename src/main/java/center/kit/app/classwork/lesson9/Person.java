package center.kit.app.classwork.lesson9;

public class Person {

    private String name, university;

    private int age;


    public String getUniversity() {
        return university;
    }

    public Person(String name, int age, String university) {
        this.age = age;
        this.name = name;
        this.university = university;
    }

    public void printInfo(){
        System.out.println("Person name" + name +
                            " Person age " + age +
                            " Person university " + university);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void showDegree(){
        System.out.println("General degree");
    }
}
