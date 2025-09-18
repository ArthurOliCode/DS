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
    
    public void inserirMatricula(){
       Scanner teclado = new Scanner(System.in);
       Testes.titulo("Adicionando a matricula");
       setMatricula(Testes.testString(teclado, "Digite o numero da matricula por extenso", 13));
       System.out.println("Obrigado por registar!");
       Testes.linhas(18, "-", true);
    }
    
}
