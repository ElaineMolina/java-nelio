package com.molina.estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
public class Exerc6 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número entre 0 e 100 para descobrir seu intervalo");
        double num = sc.nextDouble();

        if (num > 0.0 && num <= 25.0) {
            System.out.println("Intervalo [0,25]");
        } else if (num > 25.0 && num <= 50.0) {
            System.out.println("Intervalo [25,50]");
        } else if (num > 50.0 && num <= 75.0) {
            System.out.println("Intervalo [50,75]");
        } else if (num > 75.0 && num <= 100.0) {
            System.out.println("Intervalo [75,100]");
        } else if (num < 0.0 || num > 100.0){
            System.out.println("Fora de intervalo");
        }

        sc.close();
    }
}


