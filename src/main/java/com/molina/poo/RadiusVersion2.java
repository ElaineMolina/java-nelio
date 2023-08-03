package com.molina.poo;

import com.molina.util.CalculatorRadius;

import java.util.Locale;
import java.util.Scanner;

// Versão 2: classe Calculator com membros de instância
// utilizando delegação
public class RadiusVersion2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CalculatorRadius calc = new CalculatorRadius();

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius);
        double v = calc.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calc.PI);

        sc.close();
    }

}
