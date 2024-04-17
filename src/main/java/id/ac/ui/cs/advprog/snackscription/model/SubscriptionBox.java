package id.ac.ui.cs.advprog.snackscription.model;


import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter@Setter
public class SubscriptionBox {
    private String id;
    private String name;
    private String category;
    private String photo;
    private String price; // or private int[] price; if you have a way to handle int[] with JPA
    private List<Item> items; // Make sure the Item class is annotated properly for JPA as well
    private Date dateCreated;
}
