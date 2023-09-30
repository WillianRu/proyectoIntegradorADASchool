package org.example;
import java.util.Scanner;
//import Product.java;

public class Main {
    public static void main(String[] args) {
        String name;
        String description;
        String category;
        String label;
        int price;

        //runMenu();

        //Prueba funciones
        Product productOne = new Product("Leche entera Alpina", 3100, 5);
        name=productOne.getName();
        System.out.println(name);

        boolean searchMatch = productOne.doesNameContain("caja");
        System.out.println(searchMatch);

        boolean outOfStock = productOne.isOutOfStock();
        System.out.println(outOfStock);

        boolean priceIsBetter = productOne.isPriceGreaterThan(3000);
        System.out.println(priceIsBetter);

        boolean priceLessOrEqual = productOne.isPriceLessThanOrEqual(3000);
        System.out.println(priceLessOrEqual);
    }

    public static void runMenu() {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            handleUserChoice(choice);
        } while (choice != 8);
    }

    public static void handleUserChoice(int choice) {
        switch (choice) {
            case 1 -> addProduct();
            case 2 -> removeProduct();
            case 3 -> updateProduct();
            case 4 -> System.out.println("Saliendo...");
            default -> System.out.println("Opción invalida. Por favor intenta de nuevo.");
        }

    }

    public static void addProduct(){
        System.out.println("Producto agregado");
    }

    public static void removeProduct(){
        System.out.println("Producto eliminado");
    }

    public static void updateProduct(){
        System.out.println("Producto actualizado");
    }

    public static void displayMenu() {

        System.out.println(
                """
                        |o|                         /////////////\\\\\\
                        |o|                        (((((((((((((   \\\\\\
                        |o|                        ))) ~~      ~~   (((
                        |o|                        ((( (*)     (*)  )))
                        |o|                        )))     <        (((\s
                        |o|                        ((( '\\______/`   )))\s
                        |o|                        )))\\___________/(((\s
                        |o|                        (((   _)  (_    )))\s\s
                        |o|                              /\\__/\\""");
        System.out.println("±----------------------------------------±");
        System.out.println("|   Administrador Mi Tienda de Barrio    |");
        System.out.println("±----------------------------------------±");
        System.out.println("1. Agregar producto                      |");
        System.out.println("2. Eliminar producto                     |");
        System.out.println("3. Actualizar producto                   |");
        System.out.println("4. Ver todos los productos               |");
        System.out.println("5. Salir                                  |");
        System.out.println("±----------------------------------------±");
        System.out.print("   Ingresa tu opción:    (1 - 5)  ");
    }



}