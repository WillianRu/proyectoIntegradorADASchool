package org.example;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private int idProduct;
    private String productName;
    private String description;
    private String category;
    private String label;
    private String urlPhoto;
    private Double price;
    private List<Stock> stocks;

    // Constructor
    public Product(int idProduct, String productName, String description, String category, String label, String urlPhoto, Double price) {
        this.idProduct = idProduct;
        this.productName = productName;
        this.description = description;
        this.category = category;
        this.label = label;
        this.urlPhoto = urlPhoto;
        this.price = price;
        this.stocks = new ArrayList<>();
    }

    // Buscar producto
    public boolean doesNameContain(String word) {
        return productName.toLowerCase().contains(word.toLowerCase());
    }

    // Agregar producto

    public void addStock(Stock stock) {
        this.stocks.add(stock);
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    // Convertir a texto

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", label='" + label + '\'' +
                ", urlPhoto='" + urlPhoto + '\'' +
                ", price=" + price +
                '}';
    }

    // getters
    public int getIdProduct() {
        return idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getLabel() {
        return label;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public Double getPrice() {
        return price;
    }
}


