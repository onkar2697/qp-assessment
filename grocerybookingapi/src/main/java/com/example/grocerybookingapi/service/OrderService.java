package com.example.grocerybookingapi.service;


import com.example.grocerybookingapi.model.GroceryItem;
import com.example.grocerybookingapi.model.Order;
import com.example.grocerybookingapi.repository.GroceryItemRepository;
import com.example.grocerybookingapi.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private GroceryItemRepository groceryItemRepository;

    public Order createOrder(int userId, List<Order> orders) {
        double totalPrice = 0;

        for (Order order : orders) {

            GroceryItem item = order.getGroceryItem();
            if (item == null) {
                throw new IllegalArgumentException("Invalid grocery item for order");
            }


            totalPrice += item.getPrice() * order.getQuantity();
        }


        Order newOrder = new Order();
        newOrder.setUserId(userId);
        newOrder.setTotalPrice(totalPrice);

        return orderRepository.save(newOrder);
    }
}

//@Service
//public class OrderService {
//
//    @Autowired
//    private OrderRepository orderRepository;
//
//    @Autowired
//    private GroceryItemRepository groceryItemRepository;
//
//    public Order createOrder(int userId, List<Order> orders){
//        double totalPrice =0;
//        for(Order order : orders){
//            GroceryItem item = groceryItemRepository.findById(order.getGroceryItemId()).orElseThrow();
//            totalPrice += item.getPrice() * order.getQuantity();
//        }
//
//        Order newOrder=new Order();
//        newOrder.setUserId(userId);
//        newOrder.setTotalPrice(totalPrice);
//
//        return orderRepository.save(newOrder);
//    }

