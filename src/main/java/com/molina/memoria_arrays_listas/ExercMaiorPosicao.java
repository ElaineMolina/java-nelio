package com.molina.memoria_arrays_listas;

import java.util.Locale;
import java.util.Scanner;

public class ExercMaiorPosicao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num, maiorPosicao;
        double maiorValor;

        System.out.print("Quantos números deseja? ");
        num = sc.nextInt();

        double[] posicao = new double[num];

        for ( int i = 0; i < num; i++) {
            System.out.printf("Digite o %do número: ", i + 1);
            posicao[i] = sc.nextDouble();
        }

        maiorValor = posicao[0];
        maiorPosicao = 0;

        for ( int i = 1; i < num; i++) {
            if (posicao[i] > maiorValor) {
                maiorValor = posicao[i];
                maiorPosicao = i;
            }
        }

        System.out.printf("Maior valor:  %.1f\n", maiorValor );
        System.out.printf("Posição do maior valor: %d\n", maiorPosicao );

    }
}
