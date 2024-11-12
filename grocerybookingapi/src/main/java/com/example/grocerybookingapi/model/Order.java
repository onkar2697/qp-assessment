package com.example.grocerybookingapi.model;


import jakarta.persistence.*;

@Entity
@Table(name = "grocery_orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int userId;

    @ManyToOne
    @JoinColumn(name = "grocery_item_id", referencedColumnName = "id")
    private GroceryItem groceryItem;

    private Integer quantity;
    private double totalPrice;

    public Order(Integer id, int userId, Integer quantity, double totalPrice, GroceryItem groceryItem) {
        this.id = id;
        this.userId = userId;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.groceryItem = groceryItem;
    }

    public Order() {
    }

    // Getter and Setter methods
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public GroceryItem getGroceryItem() {
        return groceryItem;
    }

    public void setGroceryItem(GroceryItem groceryItem) {
        this.groceryItem = groceryItem;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", groceryItem=" + groceryItem.getName() + // only show the name for simplicity
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                '}';
    }


//@Entity
//public class Order {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//    private int userId;
//
//    @ManyToOne
//    @JoinColumn(name = "grocery_item_id", referencedColumnName = "id")
//    private GroceryItem groceryItem;
//
//    private int groceryItemId;
//    private Integer quantity;
//    private double totalPrice;
//
//    public Order(Integer id, int userId, int groceryItemId, Integer quantity, double totalPrice, GroceryItem groceryItem) {
//        this.id = id;
//        this.userId = userId;
//        this.groceryItemId = groceryItemId;
//        this.quantity = quantity;
//        this.totalPrice = totalPrice;
//        this.groceryItem = groceryItem;
//    }
//
//    public Order() {
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public int getUserId() {
//        return userId;
//    }
//
//    public void setUserId(int userId) {
//        this.userId = userId;
//    }
//
//    public GroceryItem getGroceryItem() {
//        return groceryItem;
//    }
//
//    public void setGroceryItem(GroceryItem groceryItem) {
//        this.groceryItem = groceryItem;
//    }
//
//    public int getGroceryItemId() {
//        return groceryItemId;
//    }
//
//    public void setGroceryItemId(int groceryItemId) {
//        this.groceryItemId = groceryItemId;
//    }
//
//    public Integer getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(Integer quantity) {
//        this.quantity = quantity;
//    }
//
//    public double getTotalPrice() {
//        return totalPrice;
//    }
//
//    public void setTotalPrice(double totalPrice) {
//        this.totalPrice = totalPrice;
//    }
//
//    @Override
//    public String toString() {
//        return "Order{" +
//                "id=" + id +
//                ", userId=" + userId +
//                ", groceryItem=" + groceryItem +
//                ", groceryItemId=" + groceryItemId +
//                ", quantity=" + quantity +
//                ", totalPrice=" + totalPrice +
//                '}';
//    }
}
