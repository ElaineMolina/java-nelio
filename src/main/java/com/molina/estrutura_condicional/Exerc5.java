package com.molina.estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo;
        int qtde;

        codigo = sc.nextInt();
        qtde = sc.nextInt();

        double total = 0;
        if (codigo == 1){
            total = qtde *  4.00;
        } else if (codigo == 2) {
            total = qtde * 4.50;
        } else if (codigo == 3) {
            total = qtde * 5.00;
        } else if (codigo == 4) {
            total = qtde * 2.00;
        } else if (codigo == 5) {
            total = qtde * 1.50;
        }

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }
}
