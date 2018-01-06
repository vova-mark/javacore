package center.kit.app.homework.lesson9;

import java.lang.reflect.Type;
import java.text.DecimalFormat;

public abstract class Flower {

    protected int lenght;
    protected FlowerSorts sort;
    protected FlowerColors color;
    protected double cost;

    public int getLenght() {
        return lenght;
    }

    public FlowerSorts getSort() {
        return sort;
    }

    public FlowerColors getColor() {
        return color;
    }

    public double getDefaultCost() {
        return defaultCost;
    }

    private double defaultCost;

    public void setLenght(int lenght) {
        this.lenght = lenght;
        this.setCost(defaultCost);
    }

    public void setSort(FlowerSorts sort) {
        this.sort = sort;
        this.setCost(defaultCost);
    }

    public void setColor(FlowerColors color) {
        this.color = color;
        this.setCost(defaultCost);
    }

    public Flower(int lenght, FlowerSorts sort, FlowerColors color, double defaultCostValue){
        this.lenght = lenght;
        this.sort = sort;
        this.color = color;
        this.defaultCost = defaultCostValue;
        setCost(defaultCostValue);

    }

    protected void setCost(double defaultValue) {

        switch (sort){
            case ELITE:
                this.cost = defaultValue * 1.2;
                break;
            case ONE:
                this.cost = defaultValue * 1.1;
                break;
            case TWO:
                this.cost = defaultValue;
                break;
        }
    }

    public double getCost() {
        return cost;
    }
}

