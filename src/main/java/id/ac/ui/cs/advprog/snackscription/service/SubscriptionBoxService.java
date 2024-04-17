package id.ac.ui.cs.advprog.snackscription.service;

import id.ac.ui.cs.advprog.snackscription.model.SubscriptionBox;

import java.util.List;

public interface SubscriptionBoxService {
    SubscriptionBox create(SubscriptionBox subscriptionBox);
    SubscriptionBox findById(String id);
    List<SubscriptionBox> findAll();
    SubscriptionBox save(SubscriptionBox subscriptionBox);
    void deleteById(String id);
    // Add any other service methods required by your application.
}
