package com.programads16;

import static java.lang.StringTemplate.STR;

public class Main {
    public static void main(String[] args){
        Testes.titulo("Bem vindo ao Projeto Clientes");

        Clientes cliente[] = new Clientes[4];
        cliente[0] = new Clientes();
        cliente[0].nascimento();
        cliente[0].idadePessoa();
        cliente[0].setSaldoAtual();
        cliente[0].saque();
        
        String saldo = STR."Saldo: \{cliente[0].getSaldo()}";
        System.out.println(saldo);
        
        cliente[0].depositar();
        
        saldo = STR."Saldo: \{cliente[0].getSaldo()}";
        System.out.println(saldo);
        
        cliente[0].voto();
        cliente[0].setCpf();
    }
}
