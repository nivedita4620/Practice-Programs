package com.practice;

import java.util.Scanner;

public class Main {
    private static Cart cart = new Cart();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    browseProducts();
                    break;
                case 2:
                    addToCart();
                    break;
                case 3:
                    viewCart();
                    break;
                case 4:
                    checkout();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("E-commerce Application");
        System.out.println("1. Browse Products");
        System.out.println("2. Add Product to Cart");
        System.out.println("3. View Cart");
        System.out.println("4. Checkout");
        System.out.println("5. Exit");
    }

    private static void browseProducts() {
        System.out.println("Available products:");
        System.out.println("1. Product A - $10.0");
        System.out.println("2. Product B - $20.0");
        System.out.println("3. Product C - $30.0");
    }

    private static void addToCart() {
        System.out.print("Enter the product number to add to cart: ");
        int productNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Product product = null;
        switch (productNumber) {
            case 1:
                product = new Product("Product A", 10.0, quantity);
                break;
            case 2:
                product = new Product("Product B", 20.0, quantity);
                break;
            case 3:
                product = new Product("Product C", 30.0, quantity);
                break;
            default:
                System.out.println("Invalid product number. Please try again.");
                return;
        }
        cart.addProduct(product);
        System.out.println("Product added to cart.");
    }

    private static void viewCart() {
        cart.viewCart();
    }

    private static void checkout() {
        double total = cart.checkout();
        System.out.println("Your total is $" + total);
        System.out.println("Thank you for your purchase!");
    }
}
