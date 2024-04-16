import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    void getTotalPrice() {
        ShoppingCart cart = new ShoppingCart();
        cart.add(new Item("cola", 25.90, 1));
        cart.add(new Item("slanina", 32.50, 2));

        assertEquals(90.90, cart.getTotalPrice());

    }

    @Test
    void getTotalPriceWithDiscount() {
        ShoppingCart cart2 = new ShoppingCart();
        cart2.add(new Item("kniha", 25.40, 4));
        cart2.add(new Item("tužka", 3.50, 1));

        assertEquals(94.59, cart2.getTotalPriceWithDiscount(10));


    }
    @Test
    void testGetItemNames() {
        ShoppingCart cart = new ShoppingCart();
        cart.add(new Item("kniha", 25.90, 1));
        cart.add(new Item("diař", 32.50, 2));
        cart.add(new Item("kniha", 25.90, 1));

        List<String> expectedNames = Arrays.asList("kniha", "diař");
        assertEquals(expectedNames, cart.getItemNames());
    }
}