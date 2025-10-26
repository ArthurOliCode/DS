/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;
import java.util.Scanner;

/**
 *
 * @author ArthurOliCode
 */
public class AumentoSalario {
    double reajuste;
    double salarioI;
    double salarioF;
    Scanner teclado = new Scanner(System.in); 

    public AumentoSalario() {
        TesteEntrada.titulo("Bem vindo ao reajuste de salario!");
        setReajuste();
        setSalarioI();
        setSalarioF();
    }

    public double getReajuste() {
        return reajuste;
    }

    public void setReajuste() {
        double vReajuste = TesteEntrada.testDouble(teclado, "Insira o valor inteiro da porcentagem do reajuste: [Ex: 5 para 5%]");
        if (vReajuste > 0){
            this.reajuste = vReajuste / 100;
        }else{
            System.out.println("Insira um número inteiro valido maior que 0 para o reajuste!");
        }

    }

    public double getSalarioI() {
        return salarioI;
    }

    public void setSalarioI() {
        double vSalario = TesteEntrada.testInt(teclado, "Insira o valor do salario inicial do empregado: ");
        if (vSalario > 0){
           this.salarioI = vSalario;
        }else{
            System.out.println("Insira um número valido maior que 0 para definir o salario!");
        }

    }

    public double getSalarioF() {
        return salarioF;
    }

    public void setSalarioF() {
        double salarioFinal = getSalarioI() + (getReajuste() * getSalarioI());
        this.salarioF = salarioFinal;
    }

    @Override
    public String toString() {
        return "AumentoSalario{" + "reajuste=" + getReajuste() + "\n    salario incial: " + getSalarioI() + "\n    salario final: " + getSalarioF() + "\n   }";
    }
    
    
    
    
}
