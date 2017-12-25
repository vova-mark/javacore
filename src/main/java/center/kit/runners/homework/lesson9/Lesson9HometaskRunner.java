package center.kit.runners.homework.lesson9;

import center.kit.app.homework.lesson9.Human;

public class Lesson9HometaskRunner {
    public static void main(String[] args) {

        Human human = new Human("Smith", 121);
        System.out.println(human.getAge());
        System.out.println(human.getName());
        human.setAge(0);
        human.setAge(121);
        human.setAge(120);
        System.out.println(human.getAge());
    }
}
