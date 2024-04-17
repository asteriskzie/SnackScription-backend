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

    @Test
    void subscriptionBoxShouldHaveAtLeastOneItem() {
        SubscriptionBox subscriptionBox = new SubscriptionBox();
        subscriptionBox.setItems(Arrays.asList(new Item())); // Add at least one item

        assertFalse(subscriptionBox.getItems().isEmpty(), "Items list should not be empty");
    }

    @Test
    void subscriptionBoxPricesShouldHaveFixedSizeOfThree() {
        SubscriptionBox subscriptionBox = new SubscriptionBox();
        subscriptionBox.setPrice(Arrays.asList(100, 200, 300)); // Prices for 1, 3, 6 months subscriptions

        assertEquals(3, subscriptionBox.getPrice().size(), "Price array should have a size of 3");
    }

    @Test
    void subscriptionBoxIdShouldNotBeNull() {
        SubscriptionBox subscriptionBox = new SubscriptionBox();
        subscriptionBox.setId("box123");

        assertNotNull(subscriptionBox.getId(), "ID should not be null");
    }

    @Test
    void subscriptionBoxNameShouldNotBeNull() {
        SubscriptionBox subscriptionBox = new SubscriptionBox();
        subscriptionBox.setName("SnackBox Deluxe");

        assertNotNull(subscriptionBox.getName(), "Name should not be null");
    }

    @Test
    void subscriptionBoxCategoryShouldNotBeNull() {
        SubscriptionBox subscriptionBox = new SubscriptionBox();
        subscriptionBox.setCategory("Food");

        assertNotNull(subscriptionBox.getCategory(), "Category should not be null");
    }

    @Test
    void subscriptionBoxCanHaveNullPhoto() {
        SubscriptionBox subscriptionBox = new SubscriptionBox();
        subscriptionBox.setPhoto(null); // Photo is optional

        assertNull(subscriptionBox.getPhoto(), "Photo can be null");
    }

    // Additional business logic tests

    // Test that SubscriptionBox with empty items list should fail
    @Test
    void subscriptionBoxWithNoItemsShouldFail() {
        SubscriptionBox subscriptionBox = new SubscriptionBox();
        subscriptionBox.setItems(Arrays.asList()); // No items added

        assertThrows(IllegalArgumentException.class, () -> {
            // Insert logic here that throws IllegalArgumentException when items list is empty
            // For example, you might have a method that checks the business rules when setting the items
            checkSubscriptionBoxItems(subscriptionBox.getItems());
        }, "SubscriptionBox with no items should throw an IllegalArgumentException");
    }

    // Test that SubscriptionBox with a price array that does not have a size of 3 should fail
    @Test
    void subscriptionBoxWithInvalidPriceSizeShouldFail() {
        SubscriptionBox subscriptionBox = new SubscriptionBox();
        subscriptionBox.setPrice(Arrays.asList(100, 200)); // Invalid size

        assertThrows(IllegalArgumentException.class, () -> {
            // Insert logic here that throws IllegalArgumentException when price size is not 3
            checkSubscriptionBoxPrices(subscriptionBox.getPrice());
        }, "SubscriptionBox with invalid price size should throw an IllegalArgumentException");
    }

    // Test that SubscriptionBox with null id, name, or category should fail
    @Test
    void subscriptionBoxWithNullIdNameOrCategoryShouldFail() {
        assertAll(
                () -> assertThrows(NullPointerException.class, () -> {
                    SubscriptionBox subscriptionBox = new SubscriptionBox();
                    subscriptionBox.setId(null);
                    checkSubscriptionBoxId(subscriptionBox.getId());
                }, "SubscriptionBox with null ID should throw a NullPointerException"),
                () -> assertThrows(NullPointerException.class, () -> {
                    SubscriptionBox subscriptionBox = new SubscriptionBox();
                    subscriptionBox.setName(null);
                    checkSubscriptionBoxName(subscriptionBox.getName());
                }, "SubscriptionBox with null Name should throw a NullPointerException"),
                () -> assertThrows(NullPointerException.class, () -> {
                    SubscriptionBox subscriptionBox = new SubscriptionBox();
                    subscriptionBox.setCategory(null);
                    checkSubscriptionBoxCategory(subscriptionBox.getCategory());
                }, "SubscriptionBox with null Category should throw a NullPointerException")
        );
    }
}
