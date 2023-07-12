package com.molina.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.
public class Exerc6 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
        double pi = 3.14159;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangulo = ((A * C) / 2.0);
        circulo = pi * C * C;
        trapezio = ((A + B) / 2.0 * C);
        quadrado = Math.sqrt(B);
        retangulo = A * B;

        System.out.printf("TRIÂNGULO: %.3f%n", triangulo);
        System.out.printf("CÍRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETÂNGULO: %.3f%n", retangulo);

        sc.close();
    }

}
