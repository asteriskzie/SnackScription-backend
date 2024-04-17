package id.ac.ui.cs.advprog.snackscription.repository;

import org.springframework.stereotype.Repository;
import id.ac.ui.cs.advprog.snackscription.model.AdminSubscription;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class AdminRepository {
    private List<AdminSubscription> subscriptionData = new ArrayList<>();

    public AdminSubscription create(AdminSubscription adminSubscription) {
        subscriptionData.add(adminSubscription);
        return adminSubscription;
    }

    public Iterator<AdminSubscription> findAll() {
        return subscriptionData.iterator();
    }
}
