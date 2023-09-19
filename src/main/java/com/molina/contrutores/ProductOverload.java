package com.molina.contrutores;

import com.molina.entities.OverloadProduct;
import com.molina.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProductOverload {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Product name: ");
        String name = sc.nextLine();
        System.out.print("Product price: ");
        double price = sc.nextDouble();
//        System.out.print("Quantity in stock: ");
//        int quantity = sc.nextInt();
        OverloadProduct overload = new OverloadProduct(name, price);
        System.out.println();
        System.out.println("Product data: " + overload);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        overload.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + overload);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        overload.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + overload);
        sc.close();

    }
}
