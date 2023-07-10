package com.molina.estrutura_sequencial;

//    Para ler um texto ATÉ A QUEBRA DE LINHA

import java.util.Scanner;
public class Scanner_lendo_ate {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int x;
            char teste;
            String s1, s2, s3;

            x = sc.nextInt();
            sc.nextLine();

            teste = sc.next().charAt(2);
            sc.nextLine();
            s1 = sc.nextLine();
            s2 = sc.nextLine();
            s3 = sc.nextLine();

            System.out.println("DADOS DIGITADOS:");
            System.out.println(x);
            System.out.println(teste);

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            sc.close();
        }
}
