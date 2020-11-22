package be.pxl.ja.herhalingsoefening;

public class Robbery {
    public static void main(String[] args) {
        Knapsack<Product> knapsack = new Knapsack<>(35);
        Shop shop = new Shop();
       /* shop.add(new Product("stereo", 30, 3000));
        shop.add(new Product("laptop", 20, 2000));
        shop.add(new Product("guitar", 15, 1500));*/

        shop.add(new Product("guitar", 15, 1500));
        shop.add(new Product("laptop", 20, 2000));
        shop.add(new Product("stereo", 30, 3000));
        KnapsackUtil.fill(knapsack, shop);

        System.out.println("List of products:");
        for (Product product : knapsack.getItems()) {
            System.out.println(product);
        }
    }
}
