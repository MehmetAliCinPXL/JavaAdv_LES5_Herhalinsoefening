package be.pxl.ja.herhalingsoefening;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class KnapsackUtil {
    public static <T extends Item & Comparable<T>> void fill(Knapsack<T> knapsack, Inventory<T> shop){
        List<T> items = shop.getItems();
        Collections.sort(items);
        for (T i : items){
            try {
                System.out.println("Adding items" + i);
                knapsack.add(i);
            } catch (KnapsackFullException e) {
                System.out.println("Cannot add item" + i + " cause " + e);
                e.printStackTrace();
            }
        }
    }
}
