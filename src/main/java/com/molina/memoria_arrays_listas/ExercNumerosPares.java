package com.molina.memoria_arrays_listas;

import java.util.Locale;
import java.util.Scanner;

public class ExercNumerosPares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num, totalPares;

        System.out.print("Quantos números deseja? ");
        num = sc.nextInt();

        int[] numeros = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.printf("Digite  %do número: ", i + 1);
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros Pares: ");
        totalPares = 0;
        for (int  i = 0; i < num; i++) {
            if ( numeros[i] % 2 == 0) {
                System.out.printf("%d ", numeros[i]);
                totalPares++;
            }
        }

        System.out.printf("\nQuantidade de Pares %d\n ", totalPares);

    }
}
