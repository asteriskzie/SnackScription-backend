package id.ac.ui.cs.advprog.snackscription.repository;

import id.ac.ui.cs.advprog.snackscription.model.SubscriptionBox;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionBoxRepository {
    private List<SubscriptionBox> carData = new ArrayList<>();
    SubscriptionBox create(SubscriptionBox subscriptionBox);
    List<SubscriptionBox> findAll();
    // Add more methods as needed for your application.
}
