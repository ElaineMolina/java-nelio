package com.molina.entities;

public class MaisVelho {

    private String name;
    private int idade;

    public MaisVelho(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

//    @Override
//    public String toString() {
//        return "MaisVelho{" +
//                "name='" + name + '\'' +
//                ", idade=" + idade +
//                '}';
//    }
}
