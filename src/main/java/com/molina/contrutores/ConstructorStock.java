package com.molina.contrutores;

import com.molina.entities.Product;
import com.molina.entities.StockConstructor;

import java.util.Locale;
import java.util.Scanner;

public class ConstructorStock {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Product name: ");
        String name = sc.nextLine();
        System.out.print("Product price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        StockConstructor stock = new StockConstructor(name, price, quantity);

        System.out.println();
        System.out.println("Product data: " + stock);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        stock.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + stock);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        stock.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + stock);
        sc.close();

    }
}
