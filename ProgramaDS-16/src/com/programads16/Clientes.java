package com.programads16;

import java.util.Scanner;
import java.time.LocalDate;

public class Clientes extends Pessoa{
    Scanner teclado = new Scanner(System.in);
    LocalDate dataAtual = LocalDate.now();

    int mesNascimento;
    int diaNascimento;

    @Override
    public void nascimento() {
        this.AnoMascimento = Testes.testInt(teclado, "Qual o seu ano de nascimento: ");
         mesNascimento = Testes.testInt(teclado, "Digite seu mes de aniversario: ");

        while(mesNascimento < 1 || mesNascimento > 12){
            System.out.println("\n\nErro, digite um mes valido entre 1 e 12!\n");
            mesNascimento = Testes.testInt(teclado, "Digite seu mes de aniversario: ");
        }

         diaNascimento = Testes.testInt(teclado, "Digite o seu dia de nascimento: ");

        while(diaNascimento < 1 || diaNascimento > 31){
            System.out.println("\n\nErro, digite um dia valido entre 1 e 31!\n");
            diaNascimento = Testes.testInt(teclado, "Digite o seu dia de nascimento: ");
        }

    }

    @Override
    public void aniversario() {
        if((dataAtual.getMonth().equals(mesNascimento)) && (dataAtual.getDayOfMonth() == diaNascimento)){
            Testes.titulo("Parabéns");
            setIdade(getIdade() + 1);
        }
    }

    @Override
    public void idadePessoa() {
        int ano = dataAtual.getYear();
        if (getAnoMascimento() > 0){
            this.idade = getAnoMascimento() - ano;
        }
    }

    @Override
    public void setCpf() {

    }

    @Override
    public void voto() {

    }
}
