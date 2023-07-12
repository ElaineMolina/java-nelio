package com.molina.estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exerc8 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor da renda?");
        double renda = sc.nextDouble();
        double imposto;

        if (renda <= 2000.00) {
            imposto = 0.0;
        } else if (renda <= 3000.0) {
            imposto = (renda - 2000.0) * 0.08;
        } else if (renda <= 4500.0) {
            imposto = (renda - 3000.0) * 0.18 + 1000.0 * 0.08;
        } else {
            imposto = (renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }
        if (imposto == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();
    }
}
