package com.molina.memoria_arrays_listas;

import com.molina.entities.Array_product;

import java.util.Locale;
import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the quantity of products:  ");
        int n = sc.nextInt();
        Array_product[] vetor = new Array_product[n];

        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            System.out.print("Enter the product name:  ");
            String name = sc.nextLine();
            System.out.print("Enter the product price:  ");
            double price = sc.nextDouble();
            vetor[i] = new Array_product(name, price);
        }

        double sum = 0.0;
        for (Array_product arrayProduct : vetor) {
            sum += arrayProduct.getPrice();
        }

        double avg = sum / vetor.length;
        System.out.printf("AVERAGE PRICE:  %.2f%n", avg);
        sc.close();
    }

}
