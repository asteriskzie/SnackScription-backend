package id.ac.ui.cs.advprog.snackscription.model;

public abstract class ReviewState {
    Review review;
    String state;
    ReviewState(Review review) {
        this.review = review;
    }

    public abstract void  approve();

    public abstract void reject();
}
