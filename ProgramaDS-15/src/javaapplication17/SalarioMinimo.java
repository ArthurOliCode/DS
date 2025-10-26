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
public class SalarioMinimo {
   double salarioI;
   double salarioM;
   double salarioF;
   Scanner teclado = new Scanner(System.in);
   
    public SalarioMinimo() {
        TesteEntrada.titulo("Bem vindo ao sistema de comparacao de salario");
        setSalarioF();
    }

    public double getSalarioI() {
        return salarioI;
    }

    public void setSalarioI() {
        double salario = TesteEntrada.testDouble(teclado, "Insira o salario incial do individuo: ");
        if (salario > 0){
            this.salarioI = salario;
        }else{
            System.out.println("Insira um valor valido maior que zero para o salario!");
        }

    }

    public double getSalarioM() {
        return salarioM;
    }

    public void setSalarioM() {
        double sMinimo = TesteEntrada.testDouble(teclado, "Digite o valor do salario minimo como referencia: [R$ 1.518 - 2025]");
        if (sMinimo > 0) {
            this.salarioM = sMinimo;
        }else{
            System.out.println("Insira um valor valido maior que zero para o salario!");
        }

    }

    public double getSalarioF() {
        return salarioF;
    }

    public void setSalarioF() {
        setSalarioI();
        setSalarioM();
        
        double valorF = getSalarioI() / getSalarioM();
        
        this.salarioF = valorF;
    }

    @Override
    public String toString() {
        return "SalarioMinimo{" + "salario Inicial:" + salarioI + ", salario Minimo:" + salarioM + ", qunatidade de Salarios Minimos: " + salarioF + '}';
    }
   
   
    
}
