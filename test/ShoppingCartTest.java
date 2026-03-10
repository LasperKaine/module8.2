import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    public void testAddItem() {
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);

        assertEquals(2, cart.getItemCount());
    }

    @Test
    public void testRemoveItem() {
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.removeItem("Apple");

        assertEquals(1, cart.getItemCount());
    }

    @Test
    public void testCalculateTotal() {
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.addItem("Orange", 0.75);

        assertEquals(2.25, cart.calculateTotal(), 0.01);
    }

    @Test
    public void testEmptyCart() {
        assertEquals(0, cart.getItemCount());
        assertEquals(0.0, cart.calculateTotal(), 0.01);
    }

    @Test
    public void testRemoveNonExistentItem() {
        cart.addItem("Apple", 1.0);
        cart.removeItem("Banana");

        assertEquals(1, cart.getItemCount());
        assertEquals(1.0, cart.calculateTotal(), 0.01);
    }

    @Test
    public void testAddAndRemoveAllItems() {
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.removeItem("Apple");
        cart.removeItem("Banana");

        assertEquals(0, cart.getItemCount());
        assertEquals(0.0, cart.calculateTotal(), 0.01);
    }

    @Test
    public void testCalculateTotalAfterRemoval() {
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.addItem("Orange", 0.75);
        cart.removeItem("Banana");

        assertEquals(1.75, cart.calculateTotal(), 0.01);
        assertEquals(2, cart.getItemCount());
    }
}

