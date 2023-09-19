package com.molina.memoria_arrays_listas;

import java.util.Locale;
import java.util.Scanner;

public class ExerSomaVetores {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Quantos valores tem cada vetor? ");
        num = sc.nextInt();

        int[] vetorA = new int[num];
        int[] vetorB = new int[num];
        int[] somaVetor = new int[num];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("Digite o %do número do vetor A: " , i + 1);
            vetorA[i] = sc.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.printf("Digite o %do número do vetor B: " , i + 1);
            vetorB[i] = sc.nextInt();
        }

        for ( int i = 0; i < num; i++ ) {
            somaVetor[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("SOMA DOS VETORES: ");
            for ( int i = 0; i < num; i++) {
                System.out.printf("%d\n", somaVetor[i]);
            }

        sc.close();
    }

}

