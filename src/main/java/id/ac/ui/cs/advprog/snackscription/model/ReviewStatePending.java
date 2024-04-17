package id.ac.ui.cs.advprog.snackscription.model;

public class ReviewStatePending extends ReviewState {

    ReviewStatePending(Review review) {
        super(review);
    }

    @Override
    public void approve() {
        this.review.setState(new ReviewStateApproved(this.review));
    }

    @Override
    public void reject() {
        this.review.setState(new ReviewStateRejected(this.review));
    }

    @Override
    public String toString() {
        return "Pending";
    }
}
