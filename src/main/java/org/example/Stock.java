package org.example;

public class Stock {
    private Product product;
    private int stock;

    public Stock(Product product, int stock) {
        this.product = product;
        this.stock = stock;
    }

    public Product getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "product=" + product.getProductName() +
                ", stock=" + stock +
                '}';
    }
}

