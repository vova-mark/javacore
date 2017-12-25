package center.kit.app.classwork.lesson9;

public class Teacher extends Person {

    public Teacher(String name, int age) {
        super(name, age);
    }

    public final void printInfo(){
        System.out.println("Teacher name  " + getName() + " Teacher age " + getAge());
    }


}
