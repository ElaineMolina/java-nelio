package com.molina.poo;

import java.util.Locale;
import java.util.Scanner;

public class ExercTriangleSemOO {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xa, xb, xc, ya, yb, yc;

        System.out.println("Enter the measures of triangle X");
        xa = sc.nextDouble();
        xb = sc.nextDouble();
        xc = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y");
        ya = sc.nextDouble();
        yb = sc.nextDouble();
        yc = sc.nextDouble();

        double p = (xa + xb + xc) /2.0;
        double areax = Math.sqrt(p * (p - xa) * (p - xb) * (p - xc));

        p = (ya + yb+ yc) /2.0;
        double areay = Math.sqrt(p * (p - ya) * (p - yb) * (p - yc));

        System.out.printf("Triangle X area: %.4f%n ", areax);
        System.out.printf("Triangle Y area: %.4f%n ", areay);

        if( areax >  areax){
            System.out.println("Larger area: X");
        }else{
            System.out.println("Larger area: Y");
        }

        sc.close();
    }


}
