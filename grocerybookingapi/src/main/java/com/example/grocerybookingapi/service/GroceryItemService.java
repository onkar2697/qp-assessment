package com.example.grocerybookingapi.service;


import com.example.grocerybookingapi.model.GroceryItem;
import com.example.grocerybookingapi.repository.GroceryItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroceryItemService {

    @Autowired
    private GroceryItemRepository groceryItemRepository;

    public List<GroceryItem> getAllItems(){
        return groceryItemRepository.findAll();
    }

    public GroceryItem addItem(GroceryItem item){
        return groceryItemRepository.save(item);
    }

    public void deleteItem(int id){
        groceryItemRepository.deleteById(id);
    }

    public GroceryItem updateItem(GroceryItem item) {
        return groceryItemRepository.save(item);
    }

    public GroceryItem updateInventory(int id, int newInventoryLevel) {
        GroceryItem item = groceryItemRepository.findById(id).orElseThrow();
        item.setInventoryLevel(newInventoryLevel);
        return groceryItemRepository.save(item);
    }
}
