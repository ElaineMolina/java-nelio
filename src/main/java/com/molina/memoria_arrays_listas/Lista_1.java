package com.molina.memoria_arrays_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista_1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Pedro");
        list.add("João");
        list.add("Marcos");

        list.add(2, "Matheus");

        System.out.println(list.size());

//        list.remove("Maria");
//        list.remove(0);

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("_________________________");
//        list.removeIf(x -> x.charAt(0) == 'M');
//        for (String x : list) {
//            System.out.println(x);
//        }
//        System.out.println("_________________________");

        System.out.println("Index of João: " + list.indexOf("Oséias"));

        System.out.println("_________________________");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').toList();
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("_________________________");
        String name = list.stream().filter(x-> x.charAt(0) == 'K').findFirst().orElse(null);
        System.out.println(name);

    }
}
