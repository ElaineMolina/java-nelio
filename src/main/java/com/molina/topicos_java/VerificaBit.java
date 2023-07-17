package com.molina.topicos_java;

import java.util.Scanner;

public class VerificaBit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mask = 0b00100000; //é o inteiro 32 e sabemos que o sexto é 1
        int n = sc.nextInt();
        if ((n & mask) != 0) {
            System.out.println("6th bit is true!");
        }
        else {
            System.out.println("6th bit is false");
        }

        sc.close();
    }
}
