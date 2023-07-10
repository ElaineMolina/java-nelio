package com.molina.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

//      Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

public class exerc5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo, codigo1;
        int qtde, qtde1;
        double valor, valor1, valorTotal;

        codigo = sc.nextInt();
        qtde = sc.nextInt();
        valor = sc.nextDouble();

        codigo1 = sc.nextInt();
        qtde1 = sc.nextInt();
        valor1 = sc.nextDouble();

        valorTotal = qtde * valor + qtde1 * valor1;

        System.out.printf("Valor a pagar: R$ %.2f%n" , valorTotal);

        sc.close();
    }
}
