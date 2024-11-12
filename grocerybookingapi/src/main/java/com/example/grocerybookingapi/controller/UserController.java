package com.example.grocerybookingapi.controller;


import com.example.grocerybookingapi.model.Order;
import com.example.grocerybookingapi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/book-order")
    public Order bookOrder(@RequestParam int userId, @RequestBody List<Order> orders){
        return orderService.createOrder(userId,orders);
    }
}
