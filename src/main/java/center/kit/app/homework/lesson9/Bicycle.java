package center.kit.app.homework.lesson9;

public abstract class Bicycle {
    protected int speed;
    protected int gear;

    public void ride() {
        System.out.println("Wroom!!!");
    }

    public abstract void setSpeed(int speed);
    public abstract void setGear(int gear);
}
