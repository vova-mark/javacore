package center.kit.app.homework.lesson9;

public class Chrysanthemum extends Flower {

    public Chrysanthemum(int lenght, FlowerSorts sort, FlowerColors color, double defaultCostValue) {
        super(lenght, sort, color, defaultCostValue);
    }

    @Override
    protected void setCost(double defaultValue) {
        super.setCost(defaultValue);
        switch (color){
            case YELLOW:
                this.cost *= 1.1;
                break;
            case WHITE:
                this.cost *= 1.2;
                break;
            case RED:
                this.cost *= 1.3;
                break;
            case BLUE:
                this.cost *= 1.4;
                break;
            case PINK:
                this.cost *= 1.5;
                break;
            case BLACK:
                this.cost *= 1.6;
                break;
            case BURGUNDY:
                this.cost *= 1.7;
                break;
        }
    }
}
