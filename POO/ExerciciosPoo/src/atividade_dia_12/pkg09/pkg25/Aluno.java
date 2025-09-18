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
public class Aluno extends Pessoa_main{
    String matricula;

    public String getMatricula() {
        return matricula;
    }

    private void setMatricula(String matricula) {
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
    
    public void registro(){
       Scanner teclado = new Scanner(System.in);
       Aluno.super.calcIdade();
       
       Testes.titulo("Adicionando a matricula");
       setMatricula(Testes.testString(teclado, "Digite o numero da matricula por extenso", 13));
       System.out.println("Obrigado por registar!");
       Testes.linhas(18, "-", true);
       
       Testes.linhas(34, "-", false);
       System.out.println("| Matricula   | Idade  ");
       System.out.printf("| %s  | %d |\n", getMatricula(), getIdade());
       Testes.linhas(34, "-", true);
       System.out.printf("Obrigado por utilizar o programa %s \n", Aluno.super.getNome());
    }
    
    
}
