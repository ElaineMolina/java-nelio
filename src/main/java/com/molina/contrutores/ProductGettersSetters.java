package com.molina.contrutores;

import com.molina.entities.GettersSettersProduct;
import com.molina.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProductGettersSetters {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Product name: ");
        String name = sc.nextLine();
        System.out.print("Product price: ");
        double price = sc.nextDouble();

        GettersSettersProduct gsp = new GettersSettersProduct(name, price);

        gsp.setName("Computer");
        System.out.println("Updated name: " +  gsp.getName());
        gsp.setPrice(1400.0);
        System.out.println("Updated price: " + gsp.getPrice());

        System.out.println();
        System.out.println("Product data: " + gsp);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        gsp.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + gsp);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        gsp.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + gsp);
        sc.close();

    }
}
