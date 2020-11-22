package be.pxl.ja.herhalingsoefening;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertThrows;

public class knapsackTest {

    @Test
    public void ShouldReturnRightWeightOfItems() throws KnapsackFullException {
        Knapsack<Product> zak = new Knapsack(35);
        Product kaas = new Product("kaas", 12, 12);
        Product ham = new Product("ham", 10, 10);
        zak.add(ham);
        zak.add(kaas);

        Assertions.assertEquals(22.0, zak.getCurrentWeight());
    }

    @Test
    public void ShouldThrowNewKnapsackFullException() throws KnapsackFullException{
        Knapsack<Product> zak = new Knapsack(35);
        Product kaas = new Product("kaas", 12, 12);
        Product ham = new Product("ham", 10, 10);
        Product boter = new Product("boter", 40, 1);

        zak.add(ham);
        zak.add(kaas);
        Assertions.assertThrows(KnapsackFullException.class, () -> zak.add(boter));
    }



}
