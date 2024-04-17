package id.ac.ui.cs.advprog.snackscription.service;

import id.ac.ui.cs.advprog.snackscription.model.Items;
import id.ac.ui.cs.advprog.snackscription.repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsRepository itemsRepository;

    @Override
    public Items create(Items items) {
        itemsRepository.create(items);
        return items;
    }

    @Override
    public List<Items> findAll() {
        Iterator<Items> itemsIterator = itemsRepository,findAll();
        List<Items> allItems = new ArrayList<>();
        itemsIterator.forEachRemaining(allItems::add);
        return allItems;
    }
}



