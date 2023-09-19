package com.molina.memoria_arrays_listas;

import java.util.Locale;
import java.util.Scanner;

public class ExercMediaPares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num, soma = 0, pares = 0;
        double media;

        System.out.print("Quantos elementos tem o vetor: ");
        num = sc.nextInt();

        int[] vetor = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.printf("Digite %do número:  ", i + 1);
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < num; i++) {
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
                pares++;
            }
        }

        if (pares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            media = (double) soma / pares;

            System.out.printf("MEDIA DOS PARES = %.1f\n", media);
        }

        sc.close();
    }
}
