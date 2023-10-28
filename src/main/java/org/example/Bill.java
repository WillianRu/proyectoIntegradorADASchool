package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bill {
    private int idBill;
    private Customer customer;
    private List<Product> products;
    private Date dateHourSell;

    public Bill() {
        this.products = new ArrayList<>();
    }

    public void setIdBill(int idBill) {
        this.idBill = idBill;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setDateHourSell(Date dateHourSell) {
        this.dateHourSell = dateHourSell;
    }

    // Calcular el subtotal de los productos
    public double calculateSubtotal() {
        double subtotal = 0;
        for (Product product : products) {
            for (Stock stock : product.getStocks()) {
                subtotal += stock.getStock() * product.getPrice();
            }
        }
        return subtotal;
    }


    // Calcular el total con impuestos
    public double calculateTotal() {
        double subtotal = calculateSubtotal();
        double tax = subtotal * 0.19; // 19% de impuestos
        return subtotal + tax;
    }

    // Resumen de la compra
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Resumen de la compra:\n");
        sb.append("ID de la factura: ").append(idBill).append("\n");
        sb.append("Cliente: ").append(customer.getName()).append("\n");
        sb.append("Productos comprados:\n");
        for (Product product : products) {
            double price = 0;
            int quantity = 0;
            for (Stock stock : product.getStocks()) {
                quantity += stock.getStock();
                price = stock.getStock() * product.getPrice();
            }
            sb.append("  - Nombre del producto: ").append(product.getProductName()).append(", Cantidad: ").append(quantity)
                    .append(", Precio unitario: $").append(product.getPrice()).append(", Precio total: $").append(price).append("\n");
        }
        sb.append("Fecha y hora de la venta: ").append(dateHourSell).append("\n");
        sb.append("Subtotal de los productos: $").append(calculateSubtotal()).append("\n");
        sb.append("Total de los productos (incluyendo impuestos del 19%): $").append(calculateTotal()).append("\n");
        return sb.toString();
    }

}