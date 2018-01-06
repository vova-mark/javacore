package center.kit.app.homework.lesson9;

public class Rose extends Flower {

    public Rose(int lenght, FlowerSorts sort, FlowerColors color, double defaultCostValue) {
        super(lenght, sort, color, defaultCostValue);
        this.setCost(defaultCostValue);
    }

    @Override
    public void setCost(double defaultCostValue) {
        super.setCost(defaultCostValue);
        switch (color){
            case BLACK:
                this.cost = cost + (0.75 * lenght);
                break;
            case BURGUNDY:
                this.cost = cost + (0.60 * lenght);
                break;
            case BLUE:
            case RED:
            case PINK:
            case WHITE:
            case YELLOW:
                this.cost = cost + (0.5 * lenght);
                break;
        }
    }
}
