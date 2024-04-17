package id.ac.ui.cs.advprog.snackscription.service;

import id.ac.ui.cs.advprog.snackscription.model.AdminSubscription;
import java.util.List;

public interface AdminService {
    public AdminSubscription create(AdminSubscription adminSubscription);
    public List<AdminSubscription> findAll();
}
