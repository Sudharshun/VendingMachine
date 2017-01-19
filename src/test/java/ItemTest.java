import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    @Test
    public void createItem_Initialize() {
        Item item = new Item("Candy", 25, 1.50);

        assertEquals("Candy", item.description);
        assertEquals(25, item.quantity);
        assertEquals(1.50, item.price,0.01);

        Item item2 = new Item("Pretzel", 15, 2.50);

        assertEquals("Pretzel", item2.description);
        assertEquals(15, item2.quantity);
        assertEquals(2.50, item2.price,0.01);


    }
}
