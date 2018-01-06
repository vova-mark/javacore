package center.kit.runners.homework.lesson9;

import center.kit.app.homework.lesson9.*;

import java.text.DecimalFormat;
import java.text.Format;

public class Lesson9HometaskFlowersRunner {
    public static void main(String[] args) {

        Flower rose1 = new Rose(50, FlowerSorts.ONE, FlowerColors.RED, 1);
        Flower rose2 = new Rose(70, FlowerSorts.TWO, FlowerColors.BURGUNDY, 1.2);
        Flower rose3 = new Rose(100, FlowerSorts.ELITE, FlowerColors.BLACK, 1.5);
        Flower carnation = new Carnation(35, FlowerSorts.ONE, FlowerColors.RED, 0.75);
        Flower chrysanthemum = new Chrysanthemum(50, FlowerSorts.ELITE, FlowerColors.WHITE, 1);
        Flower tulip1 = new Tulip(30, FlowerSorts.ONE, FlowerColors.BLACK, 0.8);
        Flower tulip2 = new Tulip(30, FlowerSorts.ONE, FlowerColors.YELLOW, 0.8);

        Bouquet bouquet = new Bouquet(rose1, rose2, rose3, carnation, chrysanthemum, tulip1, tulip2);

        for (Flower flower : bouquet.getBouquet()){
            System.out.println(
                    "Lenght: " + flower.getLenght()
                    + " Sort: "+ flower.getSort()
                    + " Color: " + flower.getColor()
                    + " Cost: " + flower.getCost());
        }

        double cost = bouquet.clculateCost();
        System.out.printf("Cost of bouquet: %.2f",  cost);
    }
}
