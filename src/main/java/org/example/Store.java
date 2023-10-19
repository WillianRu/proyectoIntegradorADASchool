package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {
    private List<Product> products;

    //Constructor
    public Store() {
        this.products = new ArrayList<>();
    }

    // funcionalidades

    public void addProduct(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del producto: ");
        String productName = scanner.nextLine();

        System.out.println("Ingrese la descripción del producto: ");
        String description = scanner.nextLine();

        System.out.println("Ingrese la categoría del producto: ");
        String category = scanner.nextLine();

        System.out.println("Ingrese la etiqueta del producto: ");
        String label = scanner.nextLine();

        System.out.println("Ingrese la URL de la foto del producto: ");
        String urlPhoto = scanner.nextLine();

        System.out.println("Ingrese el precio del producto: ");
        double price = scanner.nextDouble();

        Product product = new Product(productName, description, category, label, urlPhoto, price);
        products.add(product);

        System.out.println("Producto agregado con éxito.");
    }

    public void displayProducts(Store store){
        if (products.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Productos en el inventario: ");
            for (Product product : products) {
                System.out.println(product.toString());
            }
        }
    }
    // getters
    public List<Product> getProducts() {
        return products;
    }
}
