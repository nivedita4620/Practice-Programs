package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> cartItems;

    public Cart() {
        cartItems = new ArrayList<>();
    }

    public void addProduct(Product product) {
        cartItems.add(product);
    }

    public void viewCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Your cart:");
            for (Product product : cartItems) {
                System.out.println(product);
            }
        }
    }

    public double checkout() {
        double total = 0.0;
        for (Product product : cartItems) {
            total += product.getPrice() * product.getQuantity();
        }
        cartItems.clear(); // Empty the cart after checkout
        return total;
    }
}
