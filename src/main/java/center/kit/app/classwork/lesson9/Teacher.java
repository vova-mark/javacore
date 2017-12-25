package center.kit.app.classwork.lesson9;

public class Teacher extends Person {

    public Teacher(String name, int age, String university) {
        super(name, age, university);
    }

    public final void printInfo(){
        System.out.println("Teacher name  " + getName() + " Teacher age " + getAge());
    }


}
