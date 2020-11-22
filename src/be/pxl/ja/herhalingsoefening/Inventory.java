package be.pxl.ja.herhalingsoefening;

import java.util.ArrayList;
import java.util.List;

public class Inventory<E extends Item> {
    private List<E> items = new ArrayList<E>();

    public void add(E dit){
        items.add(dit);
    }

    public List<E> getItems(){
        return items;
    }
}
