package center.kit.runners.homework.lesson9;

import center.kit.app.homework.lesson9.Human;
import center.kit.app.homework.lesson9.WhiteCollar;

public class Lesson9HometaskRunner {
    public static void main(String[] args) {

        humanRun();
        System.out.println();
        whiteCollarRun();

    }

    private static void humanRun(){
        Human human = new Human("Smith", 121);
        System.out.println(human.getAge());
        System.out.println(human.getName());
        human.setAge(0);
        human.setAge(121);
        human.setAge(120);
        System.out.println(human.getAge());
    }

    private static void whiteCollarRun(){
        WhiteCollar whiteCollar = new WhiteCollar("Manager", 25, "Pepsi");
        whiteCollar.setCompany("Cola1");
        whiteCollar.setCompany("Кола");
        whiteCollar.setCompany("Cola!");
        whiteCollar.setCompany("Coca.Cola");
        whiteCollar.setCompany("Coca Cola");
        whiteCollar.setCompany("Coca-cola");
    }

}
