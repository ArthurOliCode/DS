/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_dia_12.pkg09.pkg25;


/**
 *
 * @author arthu_uhkw4r8
 */
public class EscolaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Pessoa_main p [] = new Pessoa_main[10];
        p[0] = new Pessoa_main("Arthur", "321-324-763-23", 2007, 12, 18);
        p[0].calcIdade();
        int idade = p[0].getIdade();
        
       
        
        Aluno alunos [] = new Aluno[10];
        alunos[0] = new Aluno("Arthur", "121-357-963-14", 2007, 12, 18);
        alunos[0].calcIdade();
        alunos[0].registro();
        System.out.printf("%s a impressao de 100 copias ficaria %.2f\n\n", alunos[0].getNome() ,alunos[0].tirarCopias(100));
        
        

        Funcionario funcionarios [] = new Funcionario[10];
        funcionarios[0] = new Funcionario("Fabio", "983-173-753-48", 2005, 1, 28);
        funcionarios[0].calcIdade();
        funcionarios[0].registro();
        System.out.printf("%s a impressao de 100 copias ficaria %.2f\n\n", funcionarios[0].getNome() , funcionarios[0].tirarCopias(100));
        
        
        Professor profs[] = new Professor[10];
        profs[0] = new Professor("Antonio", "732-531-083-43", 1993, 5, 30);
        profs[0].calcIdade();
        profs[0].registro();
        System.out.printf("%s a impressao de 100 copias ficaria %.2f\n\n", profs[0].getNome() , profs[0].tirarCopias(100));

    }
    
}
