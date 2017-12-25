package center.kit.runners.classwork.lesson9;

import center.kit.app.classwork.lesson9.Bicycle;

public class BicycleRunner {
    public static void main(String[] args) {

        Bicycle firstbicycle = new Bicycle();
        Bicycle secondBicycle = new Bicycle(26);
        Bicycle thirdbicycle = new Bicycle(27, "black");
        Bicycle fouthBicycle = new Bicycle(28, "yellow", 50);
        Bicycle fifthBicycle = new Bicycle(29, "pink", 35, "holidayRide");

        firstbicycle.printState();
        secondBicycle.printState();
        thirdbicycle.printState();
        fouthBicycle.printState();
        fifthBicycle.printState();

    }
}
