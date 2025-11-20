package com.programads16;

import static java.lang.StringTemplate.STR;
import java.util.Scanner;
import java.time.LocalDate;

public class Clientes extends Pessoa{
    Scanner teclado = new Scanner(System.in);
    LocalDate dataAtual = LocalDate.now();

    int mesNascimento;
    int diaNascimento;
    int num_conta;
    float saldo;
    

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
        String msg, frase;
        int ano = dataAtual.getYear();
        int mes = dataAtual.getMonthValue();
        
        if (mes >= this.mesNascimento){
            this.idade = ano - getAnoNascimento();
        }else{
            this.idade = ano - getAnoNascimento() - 1;
        }
        msg = "Idade atual do cliente: ";
        frase = STR."\{msg} \{getIdade()}";
        System.out.println(frase);
    }

    @Override
    public void setCpf() {
        double cpfEntrada = Testes.testDouble(teclado, "Insira o cpf do cliente: ");
        this.cpf = cpfEntrada;
}

    @Override
    public void voto() {
        String voto = "", frase = "";
        
        if(getIdade() < 16){
            voto = "invalido";
        }else if(getIdade() < 18 || getIdade() > 64){
            voto = "opcional";
        }else{
            voto = "obrigatorio";
        }
        frase = STR."O voto do cliente e \{voto}!";
        System.out.println(frase);
    }

    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldoAtual(){
        Testes.titulo("Definir Saldo");
        float saldoEntrada = Testes.testFloat(teclado, "Qual é o saldo inicial do cliente: ");
        if (saldoEntrada >= 0){
            setSaldo(saldoEntrada);
        }
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void saque(){
        String motivo, fraseErro;
        
        Testes.titulo("Saque de Dinheiro");
        float saque = Testes.testFloat(teclado, "QuaL e o valor do saque a ser realizado: ");
        if (saque >= 0){
            if(getSaldo() > 0){
                if (saque <= getSaldo()){
                   setSaldo(getSaldo() - saque);
                }else{
                    motivo = "saldo insuficiente para resgate";
                    fraseErro = STR."Erro, \{motivo}";
                    System.out.println(fraseErro);
                }
            }
        }else{
            motivo = "saldo com valor inferior a zero";
            fraseErro = STR."Erro, \{motivo}!";
            System.out.println(fraseErro);
        }
    }
    
    public void depositar(){
        String motivo, fraseErro;
    
        String frase = "";
        float deposito = Testes.testFloat(teclado, "Qual sera o valor do deposito a ser realizado: ");
         if (deposito >= 0){
             Testes.titulo("Deposito no Saldo");

             frase = STR."O saldo atual do cliente e: \{getSaldo()}";
             System.out.println(frase);

             frase = STR."O deposito a ser realizado sera R$ \{deposito}";
             System.out.println(frase);

             float saldoFinal = getSaldo() + deposito;
             setSaldo(saldoFinal);
         }else{
             motivo = "deposito com valor invalido";
             fraseErro = STR."Erro, \{motivo}!";
             System.out.println(fraseErro);
         }
    }
    
    
}
