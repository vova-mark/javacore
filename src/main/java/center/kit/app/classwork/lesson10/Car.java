package center.kit.app.classwork.lesson10;

public interface Car {

    //переменные в интерфейсе это константа
    String name = "name";

    void changeGear (int shift);

    //дефолтная  реализация метода (такая себе штука)
    default void drive(){
        System.out.println("Cool drive");
        madness();
    }

    //шиза только начинается. private метод в интерфейсе
    private String madness(){
        return "Oracle madness";
    }
}
