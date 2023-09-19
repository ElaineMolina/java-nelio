package com.molina.memoria_arrays_listas;

import com.molina.entities.MaisVelho;

import java.util.Locale;
import java.util.Scanner;

public class ExercMaisVelho {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num, maior, posicaoMaior;
        System.out.print("Quantas pessoas para listar? ");
        num = sc.nextInt();

        MaisVelho[] maisVelho = new MaisVelho[num];

        for ( int i = 0; i < num; i++) {
            sc.nextLine();
            System.out.printf("Entre com o %do nome: ", i + 1);
            String name = sc.nextLine();
            System.out.printf("Entre com a idade da  %da pessoa:  ", i + 1);
            int idade = sc.nextInt();
            maisVelho[i] = new MaisVelho(name, idade);
        }

        maior = maisVelho[0].getIdade();
        posicaoMaior = 0;

        for (int i = 0; i < maisVelho.length; i++) {
            if ( maisVelho[i].getIdade() > maior) {
                maior = maisVelho[i].getIdade();
                posicaoMaior = i;
            }
        }

        System.out.printf("Pessoa mais velha: %s\n", maisVelho[posicaoMaior].getName());
        sc.close();

    }
}
