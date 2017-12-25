package center.kit.app.classwork.lesson9;

public class Student extends Person {
    private String response = "Some response";
    private String faculty;


    public Student(String name, int age, String response, String faculty, String university) {
        super(name, age, university);
        this.faculty = faculty;
        this.response = response;
    }

    public void printInfo (){

        System.out.println("Student name " + getName() + " Student age" + getAge());
    }

    @Override
    public void showDegree() {
        System.out.println("Student's degree");
    }
}

