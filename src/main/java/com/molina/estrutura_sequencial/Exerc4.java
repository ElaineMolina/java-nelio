package com.molina.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {
//        Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//        decimais.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numFunc;
        double horaTrabalho;
        double valorHoraTrabalho;
        double calcHoraTrab;

        numFunc = sc.nextInt();
        horaTrabalho = sc.nextDouble();
        valorHoraTrabalho = sc.nextDouble();

        calcHoraTrab = horaTrabalho * valorHoraTrabalho;

        System.out.println("Número do funcionário: " + numFunc);
        System.out.println("Horas trabalhadas do funcionário: " + horaTrabalho);
        System.out.printf("Salário do funcionário: U$ %.2f%n" , calcHoraTrab);
        sc.close();
    }
}
