
package atividade_dia_28.pkg08.pkg25;
import java.util.Scanner;

/**
 *
 * @author ArthurOliCode
 */

public class Atividade_02 {
    
    Scanner teclado = new Scanner(System.in);
    Atividade_01 prints = new Atividade_01();
    
    
    int idade;
    double tamanho;
    boolean estudante;
    String nome;
    String frase;
    String cidade;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isEstudante() {
        return estudante;
    }

    public void setEstudante(boolean estudante) {
        this.estudante = estudante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
    
    
    
    public void aluno(){
        
        Testes.linhas(40, "_", false);
        prints.msgSaida("Ola, seja bem vindo!");
        setNome(Testes.testString(teclado, "Insira seu nome: ", 3));
        setIdade(Testes.testInt(teclado, "Qual a sua idade: "));
        setTamanho(Testes.testDouble(teclado, "Nos informe seu tamanho em metros: "));
        setCidade(Testes.testString(teclado, "Insira sua cidade: ", 2));
        setFrase(Testes.testFrase(teclado, "Insira uma frase que nao seja vazia: "));
        setEstudante(Testes.estudante(teclado, "Agora iremos avaliar se voce e um estudante: "));

        
        Testes.resultadosEstudante(getIdade(), getTamanho(), isEstudante(), getNome(), getFrase(), getCidade());
        
    }
    
    
    
}
