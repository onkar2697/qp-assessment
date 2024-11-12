package com.example.grocerybookingapi.controller;


import com.example.grocerybookingapi.model.GroceryItem;
import com.example.grocerybookingapi.service.GroceryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private GroceryItemService groceryItemService;

    @PostMapping("/add-item")
    public GroceryItem addItem(@RequestBody GroceryItem item){
        return groceryItemService.addItem(item);
    }

    @GetMapping("/view-items")
    public List<GroceryItem> viewItems(){
        return groceryItemService.getAllItems();
    }

    @DeleteMapping("/remove-item/{id}")
    public void removeItem(@PathVariable int id){
        groceryItemService.deleteItem(id);
    }
    @PutMapping("/update-inventory/{id}")
    public GroceryItem updateInventory(@PathVariable int id, @RequestParam int newInventoryLevel) {
        return groceryItemService.updateInventory(id, newInventoryLevel);
    }

    @PutMapping("/update-item")
    public GroceryItem updateItem(@RequestBody GroceryItem item){
        return groceryItemService.updateItem(item);
    }
}
