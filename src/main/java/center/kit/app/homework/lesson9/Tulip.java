package center.kit.app.homework.lesson9;

public class Tulip extends Flower {

    public Tulip(int lenght, FlowerSorts sort, FlowerColors color, double defaultCostValue) {
        super(lenght, sort, color, defaultCostValue);
        setCost(defaultCostValue);
    }

    @Override
    public void setCost(double defaultCostValue) {
        super.setCost(defaultCostValue);
        if (this.color == FlowerColors.BLACK){
            this.cost *= 2.5;
        }
    }
}
