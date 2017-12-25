package center.kit.runners.classwork.lesson9;

import center.kit.app.classwork.lesson9.Person;
import center.kit.app.classwork.lesson9.Student;
import center.kit.app.classwork.lesson9.Teacher;

public class StudentRunner {
    public static void main(String[] args) {
        Person student = new Student("nameS", 20, "resp", "er", "qweqweq");
        Person teacher = new Teacher("tchr", 50);

        printPersonInfo(student);
        printPersonInfo(teacher);

        Student student1 = new Student("name23423", 20, "resp", "er", "qweqweq");
        Person person = (Person) student1;

        printPersonInfo(person);
    }

    public static void printPersonInfo(Person person){
        person.printInfo();
    }
}
