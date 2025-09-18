/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_dia_12.pkg09.pkg25;
import atividade_dia_28.pkg08.pkg25.Testes;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author arthu_uhkw4r8
 */
public class Funcionario extends Pessoa_main{
    
    private double salario;
    private String cargo;
    private LocalDate dataAd; // data de admissão

    public double getSalario() {
        return salario;
    }

    private void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    private void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDate getDataAd() {
        return dataAd;
    }

    private void setDataAd(LocalDate dataAd) {
        this.dataAd = dataAd;
    }
    
    public Funcionario(String nome, String cpf, int ano, int mes, int dia) {
        super(nome, cpf, ano, mes, dia);
    }
    
    public void registro(){
        Scanner teclado = new Scanner(System.in);
        Testes.titulo("Bem vindo ao Registro");
        setCargo(Testes.testString(teclado, "Poderia digitar o cargo por favor: ", 5));
        setSalario(Testes.testDouble(teclado, "Poderia digitar o salario?: "));
        setDataAd(Testes.testLocalDate(teclado, "Insira a data de admissao do profissional: "));
        
        Testes.linhas(34, "-", false);
        System.out.println("| Cargo   | Salario  | Data de admissao");
        System.out.printf("|%5s  | %.2f | %s\n", getCargo(), getSalario(), getDataAd());
        Testes.linhas(34, "-", true);
        System.out.printf("Obrigado por utilizar o programa %s \n", Funcionario.super.getNome());
    }
    
}
