package com.molina.entities;

public class Alunos_aprovados {

    private String nome;
    private double sem1;
    private double sem2;

    public Alunos_aprovados(String nome, double sem1, double sem2) {
        this.nome = nome;
        this.sem1 = sem1;
        this.sem2 = sem2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSem1() {
        return sem1;
    }

    public void setSem1(int sem1) {
        this.sem1 = sem1;
    }

    public double getSem2() {
        return sem2;
    }

    public void setSem2(int sem2) {
        this.sem2 = sem2;
    }
}
