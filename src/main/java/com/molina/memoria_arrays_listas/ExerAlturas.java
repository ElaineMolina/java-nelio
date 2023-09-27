package com.molina.memoria_arrays_listas;

import java.util.Locale;
import java.util.Scanner;

public class ExerAlturas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num, menores;
        double totalAltura, mediaAltura, percentualMenores;

        System.out.print("Quantas pessoas? ");
        num = sc.nextInt();

        String[] nomes = new String[num];
        int[] idades = new int[num];
        double[] alturas = new double[num];

        for (int i = 0; i < num; i++) {
            System.out.printf("Dados da %da pessoa:\n" , i + 1);
            System.out.print("Nome:  ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        menores = 0;
        totalAltura = 0;

        for ( int i = 0; i < num; i++) {
            if (idades[i] < 16) {
                menores++;
            }
            totalAltura += alturas[i];
        }

        mediaAltura = totalAltura / num;
        percentualMenores = ((double)menores / num) * 100.0;

        System.out.printf("\nAltura média: %.2f\n" , mediaAltura);
        System.out.printf("\nMenores de 16 anos:  %.1f%%\n" , percentualMenores);

        for(int i=0; i < num; i++) {
            if (idades[i] < 16) {
                System.out.printf("%s\n", nomes[i]);
            }
        }

        sc.close();
    }
}
