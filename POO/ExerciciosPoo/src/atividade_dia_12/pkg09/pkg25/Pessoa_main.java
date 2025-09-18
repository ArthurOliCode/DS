/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_dia_12.pkg09.pkg25;

import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author arthu_uhkw4r8
 */
public class Pessoa_main {
    private String nome;
    private int idade;
    private String cpf;
    private LocalDate data; 
    
    
    public Pessoa_main(String nome, String cpf, int ano, int mes, int dia) {
        // this.nome = nome;
        setNome(nome);
        // this.cpf = cpf;
        setCpf(cpf);
        // this.nascimento = nascimento;
        this.data = LocalDate.of(ano, mes, dia);
    }
    
    
    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Setters e Getters para data
    private void setDataAno(int ano) {
        this.data = this.data.withYear(ano);
    }
    
    private void setDataMes(int mes) {
        this.data = this.data.withMonth(mes);
    }
    
    private void setDataDia(int dia) {
        this.data = this.data.withDayOfMonth(dia);
    }
    
    public int getAno(){
        return this.data.getYear();
    }
    
    public int getMes(){
        return this.data.getMonthValue();
    }
    
    public int getDia(){
        return this.data.getDayOfMonth();
    }
    
    public LocalDate getData(){
        return this.data;
    }
   
    
    public void calcIdade(){
        LocalDate dataAtual = LocalDate.now();
        if((getData() != null) && (dataAtual != null)){
            setIdade(Period.between(getData(), dataAtual).getYears());
        }else{
            setIdade(0);
        }
    }
    
    public double tirarCopias(int qtd){
        if(qtd > 0){
            double preco = 0.10 * qtd; 
            return preco;
        }else{
            return 0;
        }
    }
}
