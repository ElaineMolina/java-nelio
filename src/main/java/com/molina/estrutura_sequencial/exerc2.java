package com.molina.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exerc2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x;
        double raio;
        double pi = 3.14159;

        raio = sc.nextDouble();
        x = pi * raio * raio;

        System.out.printf("%.4f%n" , x);
    }
}
