package com.molina.memoria_arrays_listas;

import com.molina.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class ExercPensionato {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vectRooms = new Rent[10];

        System.out.print("Quantos quartos irá alugar? ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++ ) {
            System.out.println();
            System.out.println("Aluguel #" + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int roomNumber = sc.nextInt();

//            Rent rent = new Rent(name, email);

            vectRooms[roomNumber] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Quartos Alugados: ");
        for (int i = 0; i < 10; i++) {
            if ( vectRooms[i] != null){
            System.out.println(i + ": " + vectRooms[i]);
            }
        }
        sc.close();
    }
}
