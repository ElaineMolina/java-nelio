package com.molina.memoria_arrays_listas;

import java.util.Locale;
import java.util.Scanner;

public class ExerNegativos {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("De 0 a 10, quantos números você irá digitar? ");

        num = sc.nextInt();

        int[] vetor = new int[num];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Números Negativos: ");

        for ( int i = 0; i < num; i++) {
            if ( vetor[i] < 0) {
                System.out.printf("%d\n" , vetor[i]);
            }
        }

        sc.close();
    }
}
