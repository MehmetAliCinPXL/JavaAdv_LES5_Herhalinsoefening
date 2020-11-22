package be.pxl.ja.herhalingsoefening;

public class Product implements Item, Comparable<Product>{

    private String name;
    private double weight;
    private double price;

    public Product(String n, double w, double p){
        setWeight(w);
        setPrice(p);
        setName(n);
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public int compareTo(Product o) {
        return  (int)(o.getPrice() - this.price);
    }


    @Override
    public String toString() {
        return name + "" + weight + "" + price;
    }

}
