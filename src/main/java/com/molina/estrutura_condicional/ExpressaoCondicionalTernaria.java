package com.molina.estrutura_condicional;

import java.util.Scanner;

public class ExpressaoCondicionalTernaria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //expressão condicional ternária
        double preco1 = 34.5;
        double desconto1 = (preco1 < 20.0) ? preco1 * 0.1 : preco1 * 0.05;

        System.out.println(desconto1);

//        //método nornmal if
//        double preco = 34.5;
//        double desconto;
//        if (preco < 20.0) {
//            desconto = preco * 0.1;
//        }
//        else {
//            desconto = preco * 0.05;
//        }
//        System.out.println(desconto);
        sc.close();
    }
}
