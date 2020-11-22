package be.pxl.ja.herhalingsoefening;

import java.util.ArrayList;
import java.util.List;

public class Knapsack<E extends Item> {

    private double maximumCapacity;
    private List<E> items = new ArrayList<E>();

    public Knapsack(double maximumCapacity){
        this.maximumCapacity = maximumCapacity;
    }

    public void add(E dit) throws KnapsackFullException {
        if (dit.getWeight() + getCurrentWeight() <= maximumCapacity){
            items.add(dit);
        }else {
            throw new KnapsackFullException("Maximum weight reached!");
        }
    }

    public double getCurrentWeight(){
        double gewicht = 0;
        for (E item:items){
            gewicht += item.getWeight();
        }
        return gewicht;
    }

    public List<E> getItems(){
        return items;
    }
}
