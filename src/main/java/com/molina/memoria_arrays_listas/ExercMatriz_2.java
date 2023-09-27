package com.molina.memoria_arrays_listas;

import java.util.Locale;
import java.util.Scanner;

public class ExercMatriz_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite os números para Matriz: ");
        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] matriz = new int[M][N];

        for (int i = 0; i < matriz.length; i++) {
            for ( int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("Posição: " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matriz[i-1][j]);
                    }
                    if (j < matriz[i].length-1) {
                        System.out.println("Right: " + matriz[i][j+1]);
                    }
                    if (i < matriz.length-1) {
                        System.out.println("Down: " + matriz[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
