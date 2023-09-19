package com.molina.memoria_arrays_listas;

import java.util.Locale;
import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of people: ");
        int n = sc.nextInt();
        double vetor[] = new double[n];

        System.out.println("Enter the height of the person: ");
        for(int i = 0; i < n; i++){
            vetor[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for(int  i = 0; i < n; i++){
            sum += vetor[i];
        }

        double avg = sum / n;
        System.out.printf("AVERAGE HEIGHT:  %.2f%n"  ,  avg);
        sc.close();
    }
}
