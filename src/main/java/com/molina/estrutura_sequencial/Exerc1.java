package com.molina.estrutura_sequencial;

import java.util.Scanner;

public class Exerc1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y, soma;

        x = sc.nextInt();
        y = sc.nextInt();
        soma = x + y;

        System.out.println("Digite primeiro valor: " + x);
        System.out.println("Digite segundo valor: " + y);
        System.out.println("Soma: " + soma);

        sc.close();

    }


}
