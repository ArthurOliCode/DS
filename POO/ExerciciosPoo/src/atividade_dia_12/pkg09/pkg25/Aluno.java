/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_dia_12.pkg09.pkg25;
import atividade_dia_28.pkg08.pkg25.Testes;

/**
 *
 * @author arthu_uhkw4r8
 */
public class Aluno extends Pessoa_main{
    int matricula;

    public int getMatricula() {
        return matricula;
    }

    private void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
    public Aluno(String nome, String cpf, int ano, int mes, int dia) {
        super(nome, cpf, ano, mes, dia);
    }

    @Override
    public double tirarCopias(int qtd) {
        if(qtd > 0){
            double preco = 0.07 * qtd; 
            return preco;
        }else{
            return 0;
        }
    }
    
    public void inserirMatricula(){
        System.out.println("");
        
    }
    
}
