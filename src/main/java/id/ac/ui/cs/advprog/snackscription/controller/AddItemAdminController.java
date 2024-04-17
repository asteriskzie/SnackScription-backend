package id.ac.ui.cs.advprog.snackscription.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/add-item-admin")
public class AddItemAdminController {
    @GetMapping("")
    public String addItemAdminPage() {return "additem";}
}

