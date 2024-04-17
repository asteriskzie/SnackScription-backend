package id.ac.ui.cs.advprog.snackscription.model;

public class ReviewStateApproved extends ReviewState {

    ReviewStateApproved(Review review) {
        super(review);
    }

    @Override
    public void approve() {
        throw new RuntimeException("Review already approved.");
    }

    @Override
    public void reject() {
        this.review.setState(new ReviewStateRejected(this.review));
    }

    @Override
    public String toString() {
        return "Approved";
    }
}
