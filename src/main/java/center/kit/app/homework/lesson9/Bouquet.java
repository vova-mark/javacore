package center.kit.app.homework.lesson9;

public class Bouquet {

    private Flower[] bouquet;
    private int bouqueteSize;

    public Bouquet (int size){

        this.bouqueteSize = size;
        this.bouquet = new Flower[bouqueteSize];
    }

    public Flower[] getBouquet() {
        return bouquet;
    }

    public Bouquet (Flower ... flowers){

        this.bouquet = new Flower[flowers.length];
        for (int i = 0; i < flowers.length; i++){
            bouquet[i] = flowers[i];
        }
    }

    public double clculateCost (){
        double result = 0.0;
        for (int i = 0; i < bouquet.length; i++){
            result += bouquet[i].getCost();
        }

        return result;
    }

    public int getBouqueteSize() {
        return bouqueteSize;
    }
}
