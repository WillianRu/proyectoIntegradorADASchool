package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {
    private List<Product> products;
    private int currentId;

    //Constructor
    public Store() {
        this.products = new ArrayList<>();
        this.currentId = 1;
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

        Product product = new Product(currentId, productName, description, category, label, urlPhoto, price);
        products.add(product);
        currentId ++;

        System.out.println("Producto agregado con éxito.");
    }

    public void removeProduct(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el ID del producto a eliminar: ");
        int productId = scanner.nextInt();

        for (int i= 0; i<products.size(); i++){
            if(products.get(i).getIdProduct()==productId){
                products.remove(i);
                System.out.println("Producto eliminado con éxito.");
                return;
            }
        }
        System.out.println("Producto no encontrado en el inventario.");
    }

    public void updateProduct(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el ID del producto por actualizar: ");
        int productId = scanner.nextInt();

        for (int i= 0; i<products.size(); i++) {
            if (products.get(i).getIdProduct() == productId) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Ingrese el nombre del producto: ");
                String productName = scan.nextLine();

                System.out.println("Ingrese el precio del producto: ");
                double price = scan.nextDouble();

                Product product = new Product(products.get(i).getIdProduct(), productName, products.get(i).getDescription(), products.get(i).getCategory(), products.get(i).getLabel(), products.get(i).getUrlPhoto(), price);
                products.set(i, product);
                return;
            }
        }
        System.out.println("Producto no encontrado en el inventario.");
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
