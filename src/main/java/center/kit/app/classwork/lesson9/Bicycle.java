package center.kit.app.classwork.lesson9;

public class Bicycle {

    private int wheelSize;
    private String color;
    private int speed;
    private String type;

    public int getWheelSize() {
        return wheelSize;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public String getType() {
        return type;
    }

    public Bicycle(){}

    public Bicycle(int wheelSize){
    this();
    this.wheelSize = wheelSize;
    }

    public Bicycle(int wheelSize, String color){
        this(wheelSize);
        this.color = color;
    }

    public Bicycle(int wheelSize, String color, int speed){
        this(wheelSize, color);
        this.speed = speed;
    }

    public Bicycle(int wheelSize, String color, int speed, String type){
        this(wheelSize, color, speed);
        this.type = type;
    }

    public void printState (){
        System.out.println(this.getClass());
        System.out.println( "Color is: " + this.color + " Wheel size is: " +  this.wheelSize + " Speed is: " + this.speed + " Type is: " + this.type);
    }

}
