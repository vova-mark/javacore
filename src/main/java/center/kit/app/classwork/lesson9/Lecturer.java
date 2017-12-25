package center.kit.app.classwork.lesson9;

public class Lecturer extends Person {
    private String faculty, experience, degree;

    public Lecturer (String name, int age, String university, String faculty, String experience, String degree){
        super(name, age, university);
        this.faculty = faculty;
        this.experience = experience;
        this.degree = degree;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getExperience() {
        return experience;
    }

    public String getDegree() {
        return degree;
    }

    public void printLecturerInfo(){
        System.out.println("Name: " + getName() +
                            " Age " + getAge()  +
                            " Faculty: " + getFaculty() +
                            " Experience " + getExperience() +
                            " Degree" + getDegree() +
                            " University " + getUniversity());
    }

    @Override
    public void showDegree() {
        System.out.println("Lecturer degree");
    }
}
