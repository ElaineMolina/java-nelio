package com.molina.estruturas_repetitivas;

import java.util.Scanner;
//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
//exemplo

public class Exerc7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++){

            int inteiro = i;
            int quadrado = i * i;
            int cubo = i * i * i;
            System.out.printf("%d %d %d%n" , inteiro, quadrado, cubo);
        }
        sc.close();
    }
}
