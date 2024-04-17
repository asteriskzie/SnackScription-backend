package id.ac.ui.cs.advprog.snackscription.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
public class Review {
    private String id;
    private int rating;
    @Setter
    private String content;
    @Setter
    private String state;
    private String userId;
    private String subscriptionBoxId;

    public Review(int rating, String content, String state, String userId, String subsciprionBoxId) {
        // id should be generated automatically
        this.id = UUID.randomUUID().toString();
        this.rating = rating;
        this.content = content;
        this.state = state;
        this.userId = userId;
        this.subscriptionBoxId = subsciprionBoxId;
    }

    public void editReview(int rating, String content) {
        this.setRating(rating);
        this.setContent(content);
    }

    public void setRating(int rating) {
        if (rating < 0 || rating > 5) {
            throw new RuntimeException("Rating should be between 0 and 5.");
        }
        this.rating = rating;
    }
}
