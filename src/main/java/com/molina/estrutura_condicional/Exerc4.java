package com.molina.estrutura_condicional;

import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int inicio = sc.nextInt();
        int termino = sc.nextInt();

        int duracao;

        if (inicio < termino) {
            duracao = termino - inicio;
        }else{
            duracao = 24 - inicio + termino;
        }

        System.out.println("O jogo durou " + duracao + " hora(s)");
        sc.close();
    }
}
