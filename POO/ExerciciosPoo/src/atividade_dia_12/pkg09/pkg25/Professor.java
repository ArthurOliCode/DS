/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_dia_12.pkg09.pkg25;

import atividade_dia_28.pkg08.pkg25.Testes;
import java.util.Scanner;

/**
 *
 * @author arthu_uhkw4r8
 */
public class Professor extends Pessoa_main{
    
    private double salario;
    private String materia;
    
    public Professor(String nome, String cpf, int ano, int mes, int dia) {
        super(nome, cpf, ano, mes, dia);
    }

    public double getSalario() {
        return salario;
    }

    private void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMateria() {
        return materia;
    }

    private void setMateria(String materia) {
        this.materia = materia;
    }
    
    public void registro(){
        Testes.titulo("bem vindo ao registro professor");
        
        Scanner teclado = new Scanner(System.in);
        
        setMateria(Testes.testString(teclado, "Informe a disciplina que o professor exerce:", 3));
        setSalario(Testes.testDouble(teclado, "Insira o salario que este professor recebe:"));
        
        Testes.linhas(34, "-", false);
        System.out.println("| Materia   | Salario  ");
        System.out.printf("| %5s  | %.2f |\n", getMateria(), getSalario());
        Testes.linhas(34, "-", true);
        System.out.printf("Obrigado por utilizar o programa %s \n\n", Professor.super.getNome());
    }
    
}
