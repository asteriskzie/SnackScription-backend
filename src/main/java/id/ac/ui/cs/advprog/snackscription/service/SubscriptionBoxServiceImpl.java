package id.ac.ui.cs.advprog.snackscription.service;

import id.ac.ui.cs.advprog.snackscription.model.SubscriptionBox;
import id.ac.ui.cs.advprog.snackscription.repository.SubscriptionBoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SubscriptionBoxServiceImpl implements SubscriptionBoxService {

    @Autowired
    private  SubscriptionBoxRepository SubscriptionBoxRepository;

    @Override
    public SubscriptionBox create(SubscriptionBox product) {
        SubscriptionBoxRepository.create(product);
        return product;
    }

    @Autowired
    public SubscriptionBoxServiceImpl(SubscriptionBoxRepository subscriptionBoxRepository) {
        this.subscriptionBoxRepository = subscriptionBoxRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public SubscriptionBox findById(String id) {
        return subscriptionBoxRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Subscription box not found: " + id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<SubscriptionBox> findAll() {
        return subscriptionBoxRepository.findAll();
    }

    @Override
    @Transactional
    public SubscriptionBox save(SubscriptionBox subscriptionBox) {
        validateSubscriptionBox(subscriptionBox);
        return subscriptionBoxRepository.save(subscriptionBox);
    }

    @Override
    @Transactional
    public void deleteById(String id) {
        subscriptionBoxRepository.deleteById(id);
    }

}
