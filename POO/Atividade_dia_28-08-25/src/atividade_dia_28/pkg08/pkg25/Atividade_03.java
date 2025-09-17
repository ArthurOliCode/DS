/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_dia_28.pkg08.pkg25;
import java.util.Scanner;
/**
 *
 * @author ArthurOliCode
 */
public class Atividade_03 {
    
    Scanner teclado = new Scanner(System.in); // Variável para entrada de dados
    int num1;
    int num2;
    int soma;
    int sub;
    int multi;
    double div;
    
    public int getSub() {
        return sub;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }


    public double getDiv() {
        return div;
    }

    public void setDiv(double div) {
        this.div = div;
    }
    
    public int getMulti() {
        return multi;
    }

    public void setMulti(int multi) {
        this.multi = multi;
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }
    
    public void operacoes(){
        String escolha = "";
        
        System.out.println("Você deseja fazer qual operacao? ");
        escolha = teclado.nextLine();
        
        if(escolha.toLowerCase().substring(0, 2).equals("so")){
            Testes.titulo("Bem vindo ao Soma!");
            
            setNum1(Testes.testInt(teclado, "Insira o primeiro numero: "));
            setNum2(Testes.testInt(teclado, "Insira o segundo numero: "));
            setSoma(getNum1() + getNum2());
            Testes.linhas(1, "", false);
            System.out.printf("A soma de %d e %d e igual a %d!", getNum2(), getNum1(), getSoma());
            
        }else
        if(escolha.toLowerCase().substring(0, 1).equals("m")){
            Testes.titulo("Bem vindo a Multiplicacao!");
            
            setNum1(Testes.testInt(teclado, "Insira o primeiro numero: "));
            setNum2(Testes.testInt(teclado, "Insira o segundo numero: "));
            setMulti(num1 * num2);
            Testes.linhas(1, "", false);
            System.out.printf("A multiplicacao de %d e %d e igual a %d!", getNum1(), getNum2(), getMulti());
            
        }else
        if(escolha.toLowerCase().substring(0, 3).equals("div")){
            Testes.titulo("Bem vindo ao Divisao!");
            
            setNum1(Testes.testInt(teclado, "Insira o primeiro numero: "));
            setNum2(Testes.testInt(teclado, "Insira o segundo numero: "));
            if(getNum1() >= getNum2()){
                setDiv(getNum1() / getNum2());
            }else{
                setDiv(getNum2() / getNum1());
            }
            
            Testes.linhas(1, "", false);
            System.out.printf("A divisao de %d e %d e igual a %.3f!", getNum1(), getNum2(), getDiv());
        }else
        if(escolha.toLowerCase().substring(0, 2).equals("su")){
            Testes.titulo("Bem vindo ao Subtracao!");
            
            setNum1(Testes.testInt(teclado, "Insira o primeiro numero: "));
            setNum2(Testes.testInt(teclado, "Insira o segundo numero: "));
            if(getNum1() >= getNum2()){
                setSub(getNum1() - getNum2());
            }else{
                setSub(getNum2() - getNum1());
            }
            System.out.printf("A divisao de %d e %d e igual a %d!", getNum1(), getNum2(), getSub());
        }
        else{
            Testes.titulo("Nenhuma operacao valida");
        }
    }
    
}
