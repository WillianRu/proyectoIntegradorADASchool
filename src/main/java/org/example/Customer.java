package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Customer {
    private int customerId;
    private String name;
    private String email;
    private List<Product> products;
    private List<Bill> bills;
    private int currentId;

    public Customer(int customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.products = new ArrayList<>();
        this.bills = new ArrayList<>();
        this.currentId = 1;
    }

    public void inputCustomerData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del cliente: ");
        this.name = scanner.nextLine();

        System.out.println("Ingrese el correo electrónico del cliente: ");
        this.email = scanner.nextLine();
    }

    public void buyProduct(Store store, Bill bill) {
        Scanner scanner = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();

        boolean buying = true;
        while (buying) {
            System.out.println("Ingrese el ID del producto que desea comprar: ");
            int productId = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            System.out.println("Ingrese la cantidad que desea comprar: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            for (Product p : store.getProducts()) {
                if (p.getIdProduct() == productId) {
                    List<Stock> stocks = p.getStocks();
                    for (Stock stock : stocks) {
                        if (stock.getStock() >= quantity) {
                            stock.setStock(stock.getStock() - quantity);
                            Product purchasedProduct = new Product(p.getIdProduct(), p.getProductName(), p.getDescription(), p.getCategory(), p.getLabel(), p.getUrlPhoto(), p.getPrice());
                            Stock purchasedStock = new Stock(purchasedProduct, quantity);
                            purchasedProduct.addStock(purchasedStock);
                            productList.add(purchasedProduct);
                            System.out.println("Producto agregado al carrito.");

                            System.out.println("¿Desea comprar algo más? (Sí/No)");
                            String answer = scanner.nextLine();
                            if (answer.equalsIgnoreCase("No")) {
                                buying = false;
                            }
                        } else {
                            System.out.println("No hay suficiente stock disponible.");
                        }
                    }
                    break;
                } else {
                    System.out.println("Producto no encontrado en el inventario.");
                }
            }
        }
        currentId++;
        bill.setIdBill(currentId);
        bill.setCustomer(this);
        bill.setDateHourSell(new Date());
        bill.setProducts(productList);
        bill.calculateSubtotal();
        bill.calculateTotal();
        bills.add(bill);
    }



    //Getters y Setters


    public String getName() {
        return name;
    }
}
