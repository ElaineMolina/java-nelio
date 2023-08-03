package com.molina.poo;

import com.molina.util.CalculatorRadius;
import com.molina.util.CalculatorRadiusStatic;

import java.util.Locale;
import java.util.Scanner;

//• Versão 3: classe Calculator com método estático
public class RadiusVersion3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //CalculatorRadius calc = new CalculatorRadius();
        //não precisamos mais instanciar o objeto para depois chamar, podemos fazer direto com
        //a própria classe

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double c = CalculatorRadiusStatic.circumference(radius);
        double v = CalculatorRadiusStatic.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", CalculatorRadiusStatic.PI);

        sc.close();
    }
}
