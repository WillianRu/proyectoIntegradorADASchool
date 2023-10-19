package org.example;

public class Product {
    private int idProduct;
    private String productName;
    private String description;
    private String category;
    private String label;
    private String urlPhoto;
    private Double price;

    // Constructor
    public Product(String productName, String description, String category, String label, String urlPhoto, Double price) {
        this.productName = productName;
        this.description = description;
        this.category = category;
        this.label = label;
        this.urlPhoto = urlPhoto;
        this.price = price;
    }

    // Buscar producto
    public boolean doesNameContain(String word) {
        return productName.toLowerCase().contains(word.toLowerCase());
    }
}


