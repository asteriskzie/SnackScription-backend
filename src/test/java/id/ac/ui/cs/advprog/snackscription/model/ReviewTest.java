package id.ac.ui.cs.advprog.snackscription.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReviewTest {
    Review review;

    @BeforeEach
    void setUp() {
        this.review = new Review(
                5,
                "Bagus bgt dah",
                "Pending",
                "1",
                "111"
        );
    }

    @Test
    void testEditReview() {
        int newRating = 1;
        String newContent = "jelek";
        this.review.editReview(newRating, newContent);
        assertEquals(newRating, this.review.getRating());
        assertEquals(newContent, this.review.getContent());
    }

    @Test
    void testEditReviewInvalid() {
        int newRating = -1;
        String newContent = "jelek";
        assertThrows(RuntimeException.class, () -> {
            this.review.editReview(newRating, newContent);
        });
    }

    @Test
    void testEditState() {
        String newState = "Approved";
        this.review.setState(newState);
        assertEquals(this.review.getState(), newState);
    }
}
