package center.kit.app.homework.lesson9;

public class CustomBicycle extends Bicycle {

    @Override
    public void ride() {
        System.out.println("Wshhhhhh!");
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("My speed is: " + speed);
    }

    @Override
    public void setGear(int gear) {
        this.gear = gear;
        System.out.println("My gear is: " + gear);
    }
}
