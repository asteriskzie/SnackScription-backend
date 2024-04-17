package id.ac.ui.cs.advprog.snackscription.repository;

import org.springframework.stereotype.Repository;
import id.ac.ui.cs.advprog.snackscription.model.SubscriptionBox;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class SubscriptionBoxRepository {
    private List<SubscriptionBox> carData = new ArrayList<>();

    public static SubscriptionBox create(SubscriptionBox subscriptionBox) {
        return null;
    }

    public List<SubscriptionBox> findAll() {
        return null;
    }

    public void deleteById(String id) {
    }

    public Optional<Object> findById(String id) {
        return null;
    }
    // Add more methods as needed for your application.
}
