package com.programads16;

public abstract class Pessoa {
    int idade;
    int AnoMascimento;
    double cpf;
    String nome;

    public int getIdade() {
        return idade;
    }

    public double getCpf() {
        return cpf;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAnoNascimento() {
        return AnoMascimento;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void nascimento();
    public abstract void aniversario();
    public abstract void idadePessoa();
    public abstract void setCpf();
    public abstract void voto();
}
