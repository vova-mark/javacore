package center.kit.runners.classwork.lesson9;

import center.kit.app.classwork.lesson9.Lecturer;
import center.kit.app.classwork.lesson9.Person;
import center.kit.app.classwork.lesson9.Student;
import center.kit.app.classwork.lesson9.Teacher;

public class StudentRunner {
    public static void main(String[] args) {
        Person student = new Student("nameS", 20, "resp", "er", "qweqweq");
        Person teacher = new Teacher("tchr", 50, "KPI");

        printPersonInfo(student);
        printPersonInfo(teacher);

        Student student1 = new Student("name23423", 20, "resp", "er", "qweqweq");
        Person person = (Person) student1;

        printPersonInfo(person);

        Person person1 = new Lecturer("Ivanich", 45, "KNUOC", "medicine", "16", "highest");
        Lecturer lecturer = (Lecturer)person1;
        lecturer.printLecturerInfo();

        //cant cast parent to child
        //Lecturer newOne = (Lecturer) new Person("Name", 30, "LKJ");
        //newOne.printLecturerInfo();

        Student student2 = new Student("Max", 18, "resp", "er", "qweqweq");
        Lecturer lecturer1 = new Lecturer("Ivan", 45, "KNUOC", "medicine", "16", "mdl");
        student2.showDegree();
        lecturer1.showDegree();

    }

    public static void printPersonInfo(Person person){
        person.printInfo();
    }
}
