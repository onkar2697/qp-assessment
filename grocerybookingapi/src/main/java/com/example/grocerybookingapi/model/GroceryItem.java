package com.example.grocerybookingapi.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class GroceryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private int inventoryLevel;

    public GroceryItem(int id, String name, double price, int inventoryLevel) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inventoryLevel = inventoryLevel;
    }

    public GroceryItem() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInventoryLevel() {
        return inventoryLevel;
    }

    public void setInventoryLevel(int inventoryLevel) {
        this.inventoryLevel = inventoryLevel;
    }

    @Override
    public String toString() {
        return "GroceryItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", inventoryLevel=" + inventoryLevel +
                '}';
    }
}

//
//@Entity
//public class GroceryItem {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    private String name;
//    private double price;
//    private int inventoryLevel;
//
//    public GroceryItem(int id, String name, double price, int inventoryLevel) {
//        this.id = id;
//        this.name = name;
//        this.price = price;
//        this.inventoryLevel = inventoryLevel;
//    }
//
//    public GroceryItem() {
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public int getInventoryLevel() {
//        return inventoryLevel;
//    }
//
//    public void setInventoryLevel(int inventoryLevel) {
//        this.inventoryLevel = inventoryLevel;
//    }
//
//    @Override
//    public String toString() {
//        return "GroceryItem{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", price=" + price +
//                ", inventoryLevel=" + inventoryLevel +
//                '}';

