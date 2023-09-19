package com.molina.memoria_arrays_listas;

import com.molina.entities.Alunos_aprovados;

import java.util.Locale;
import java.util.Scanner;

public class ExercAprovados {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num, soma;
        double media;

        System.out.print("Quantos alunos sõo? ");
        num = sc.nextInt();

        Alunos_aprovados[] alunos = new Alunos_aprovados[num];


        for (int i = 0; i < num; i++) {
            sc.nextLine();
            System.out.printf("Digite nome, primeira e segunda do %do aluno: \n", i + 1);
            String aluno = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2= sc.nextDouble();

            alunos[i] = new Alunos_aprovados(aluno, nota1, nota2);
        }

        System.out.println("Alunos aprovados:  ");

        for (int i = 0; i < num; i++) {
        media = (alunos[i].getSem1() + alunos[i].getSem2()) / 2;
            if (media >= 6) {
                System.out.printf("\n%s ", alunos[i].getNome());
            }
        }
    }
}
