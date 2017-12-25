package center.kit.app.classwork.lesson9;

public class Student extends Person {
    private String response = "Some response";
    private String faculty;
    private String university = "default";

    public Student(String name, int age, String response, String faculty,String university) {
        super(name, age);
        this.faculty = faculty;
        this.response = response;
        this.university = university;
    }

    public void printInfo (){

        System.out.println("Student name " + getName() + " Student age" + getAge());
    }
}

