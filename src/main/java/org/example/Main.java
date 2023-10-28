package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Store store = new Store ();
        runMenu(store);
    }

    // Mostrar menu
    public static void runMenu(Store store) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            handleUserChoice(choice, store);
        } while (choice != 8);
    }

    public static void displayMenu() {

        System.out.println("±----------------------------------------±");
        System.out.println("|   Administrador Mi Tienda de Barrio    |");
        System.out.println("±----------------------------------------±");
        System.out.println("1. Agregar producto                      |");
        System.out.println("2. Eliminar producto                     |");
        System.out.println("3. Actualizar producto                   |");
        System.out.println("4. Ver todos los productos               |");
        System.out.println("5. Vender productos                      |");
        System.out.println("6. Salir                                 |");
        System.out.println("±----------------------------------------±");
        System.out.print("   Ingresa tu opción:    (1 - 6)  ");
    }

    public static void handleUserChoice(int choice, Store store) {
        switch (choice) {
            case 1 -> store.addProduct();
            case 2 -> store.removeProduct();
            case 3 -> store.updateProduct();
            case 4 -> store.displayProducts(store);
            case 5 -> System.out.println("Facturando ...");
            case 6 -> System.out.println("Saliendo ...");
            default -> System.out.println("Opción invalida. Por favor intenta de nuevo.");
        }

    }


}