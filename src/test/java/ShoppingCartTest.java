import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    private ShoppingCart cart;

    @BeforeEach
    public void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    public void testAddItems() {
        cart.addItem("Apple");
        cart.addItem("Banana");
        cart.addItem("Milk");
        assertEquals(3, cart.getItemCount());
    }

    @Test
    public void testRemoveItem() {
        cart.addItem("Apple");
        cart.addItem("Banana");
        cart.addItem("Milk");
        cart.removeItem("Banana");
        assertEquals(2, cart.getItemCount());
    }

    @Test
    public void testClearCart() {
        cart.addItem("Apple");
        cart.addItem("Banana");
        cart.clear();
        assertEquals(0, cart.getItemCount());
    }

    @Test
    public void testRemoveNonExistentItemDoesNotThrow() {
        cart.addItem("Apple");
        assertDoesNotThrow(() -> cart.removeItem("NonExistentItem"));
        assertEquals(1, cart.getItemCount());
    }
}