package be.pxl.ja.herhalingsoefening;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertThrows;

public class compareToTest {

    @Test
    public void ShouldReturnPositiveNumberWhenThisPriceIsLower() {
        Product kaas = new Product("kaas", 10, 12);
        Product ham = new Product("ham", 10, 10);
        Assertions.assertEquals(2, ham.compareTo(kaas));
    }

    @Test
    public void ShouldReturnNegativeNumberWhenThisPriceIsHigher() {
        Product kaas = new Product("kaas", 10, 10);
        Product ham = new Product("ham", 10, 12);
        Assertions.assertEquals(-2, ham.compareTo(kaas));
    }
}
