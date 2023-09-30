package org.example;

public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isOutOfStock() {
        return stock == 0;
    }

    public boolean isPriceGreaterThan(double value) {
        return price > value;
    }

    public boolean isPriceLessThanOrEqual(double value) {
        return price <= value;
    }

    public boolean doesNameContain(String word) {
        return name.toLowerCase().contains(word.toLowerCase());
    }

    @Override
    public String toString() {
        return "{ 'name':" + name + ", price:" + price + ", stock:" + stock + "}";
    }


}


