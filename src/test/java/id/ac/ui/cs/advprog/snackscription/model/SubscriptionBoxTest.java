package id.ac.ui.cs.advprog.snackscription.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubscriptionBoxTest {

    private SubscriptionBox subscriptionBox;

    @BeforeEach
    void setUp() {
        subscriptionBox = new SubscriptionBox();
        subscriptionBox.setId("box123");
        subscriptionBox.setName("SnackBox Deluxe");
        subscriptionBox.setCategory("Food");
        subscriptionBox.setPhoto("path/to/photo");
        subscriptionBox.setPrice(Arrays.asList(100, 200, 300)); // Example prices for 1, 3, 6 months
        subscriptionBox.setItems(Arrays.asList(new Item(), new Item())); // Assuming Item is another model class
        subscriptionBox.setDateCreated(new Date());
    }

    @Test
    void testGetId() {
        assertEquals("box123", subscriptionBox.getId());
    }

    @Test
    void testGetName() {
        assertEquals("SnackBox Deluxe", subscriptionBox.getName());
    }

    @Test
    void testGetCategory() {
        assertEquals("Food", subscriptionBox.getCategory());
    }

    @Test
    void testGetPhoto() {
        assertEquals("path/to/photo", subscriptionBox.getPhoto());
    }

    @Test
    void testGetPrice() {
        List<Integer> prices = subscriptionBox.getPrice();
        assertNotNull(prices);
        assertEquals(3, prices.size());
        assertEquals(100, prices.get(0));
        assertEquals(200, prices.get(1));
        assertEquals(300, prices.get(2));
    }

    @Test
    void testGetItems() {
        List<Item> items = subscriptionBox.getItems();
        assertNotNull(items);
        assertEquals(2, items.size());
    }

    @Test
    void testGetDateCreated() {
        assertNotNull(subscriptionBox.getDateCreated());
    }
}
