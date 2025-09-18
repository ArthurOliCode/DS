/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_dia_12.pkg09.pkg25;

/**
 *
 * @author arthu_uhkw4r8
 */
public class Professor extends Pessoa_main{
    
    private float salario;
    private String materia;
    
    public Professor(String nome, String cpf, int ano, int mes, int dia) {
        super(nome, cpf, ano, mes, dia);
    }

    public float getSalario() {
        return salario;
    }

    private void setSalario(float salario) {
        this.salario = salario;
    }

    public String getMateria() {
        return materia;
    }

    private void setMateria(String materia) {
        this.materia = materia;
    }
    
    
    
}
