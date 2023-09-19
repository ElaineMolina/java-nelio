package com.molina.memoria_arrays_listas;

import com.molina.entities.Dados_pessoas;

import java.util.Locale;
import java.util.Scanner;

public class ExercDadosPessoas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num, homens, mulheres ;
        double maiorAltura, menorAltura, mediaAlturaMulheres, alturaMulheresTotal;

        System.out.println("Quantas pessoas? ");
        num = sc.nextInt();

        Dados_pessoas[] dados = new Dados_pessoas[num];

        for (int i = 0; i < dados.length; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            double altura = sc.nextDouble();
            System.out.printf("Gênero %da pessoa:", i + 1 );
            char genero = sc.next().charAt(0);

            dados[i] = new Dados_pessoas(altura,  genero);
        }

        maiorAltura = dados[0].getAltura();
        menorAltura = dados[0].getAltura();

        for (int i = 0; i < num; i++) {
            if (dados[i].getAltura() > maiorAltura) {
                maiorAltura = dados[i].getAltura();
            }
            if (dados[i].getAltura() < menorAltura) {
                menorAltura = dados[i].getAltura();
            }
        }

        homens = 0;
        mulheres = 0;
        alturaMulheresTotal =0;

        for (int i = 0; i < num; i++) {
            if (dados[i].getGenero() == 'M') {
                homens++;
            }else{
                mulheres++;
                alturaMulheresTotal = alturaMulheresTotal + dados[i].getAltura();
            }
        }

        mediaAlturaMulheres =  alturaMulheresTotal / mulheres;


        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaMulheres);
        System.out.printf("Numero de homens = %d\n", homens);

        sc.close();
    }
}
