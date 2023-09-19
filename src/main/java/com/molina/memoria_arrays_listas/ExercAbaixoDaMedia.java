package com.molina.memoria_arrays_listas;

import java.util.Locale;
import java.util.Scanner;

public class ExercAbaixoDaMedia {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num;
        double soma, media;

        System.out.print("Quantos elementos tem o vetor: ");
        num = sc.nextInt();

        double[] nota = new double[num];

        for (int i = 0; i < num; i++) {
            System.out.printf("Digite a %da nota: ", i + 1);
            nota[i] = sc.nextDouble();
        }

        soma = 0;
        for ( int i = 0; i < num; i++) {
            soma += nota[i];
        }

        media = soma / num;

        System.out.printf("\nMédia do Vetor = %.3f\n",  media);
        System.out.println("\nNotas abaixo da média");

        for (int i = 0; i < num; i++ ) {
            if (nota[i] < media) {
                System.out.printf("%.1f\n", nota[i]);
            }
        }
        sc.close();
    }
}
