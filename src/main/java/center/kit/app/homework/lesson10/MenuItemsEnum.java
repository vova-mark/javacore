package center.kit.app.homework.lesson10;

import center.kit.runners.homework.lesson10.GuessGameRunner;
import center.kit.runners.homework.lesson4.utils.convertors.HometaskLesson4Runner;
import center.kit.runners.homework.lesson6.HometaskLesson6Runner;
import center.kit.runners.homework.lesson7.HomeworkArraysRunner;
import center.kit.runners.homework.lesson8.HometaskLesson8FilesRunner;
import center.kit.runners.homework.lesson8.HometaskLesson8Runner;

public enum MenuItemsEnum {

    LESSON4("Hometask - Lesson4"){public void runItem(){
        HometaskLesson4Runner.run();}},
    LESSON6("Hometask - Lesson6"){public void runItem(){
        HometaskLesson6Runner.run();}},
    LESSON7("Hometask - Lesson7"){public void runItem(){
        HomeworkArraysRunner.main(null);}},
    LESSON8("Hometask - Lesson8"){public void runItem(){
        HometaskLesson8FilesRunner.main(null);}},
    LESSON10("Hometask - Lesson10 - GuessGame"){public void runItem(){
        GuessGameRunner.runGame();}},
    EXIT("Exit"){public void runItem(){System.out.println("Good night");}};

    private String fullName;

    MenuItemsEnum(String fullName){
        this.fullName = fullName;
    }

    public abstract void runItem();

    public String getFullName() {
        return fullName;
    }

    public static MenuItemsEnum getValueOf (int choise){
        MenuItemsEnum result = null;

        for (MenuItemsEnum item : MenuItemsEnum.values()){
            if (item.ordinal() + 1 == choise){
                result = item;
            }
        }
        return result;
    }
}
