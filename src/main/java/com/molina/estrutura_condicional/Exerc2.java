package com.molina.estrutura_condicional;

import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Digite um número: ");
        num = sc.nextInt();

        if ( num == 0 || num % 2 == 0){
            System.out.println("o número é par");
        }else {
            System.out.println("o número é impar");
        }
        sc.close();
    }

}
