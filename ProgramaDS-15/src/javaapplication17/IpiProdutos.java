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
public class IpiProdutos {
     double ipi; // Imposto sobre Produtos Industrializados
    int qtdTipo; // Quantidade de tipos diferentes de produto
    int qtdProduto;
    int codigoP;
    double valorProduto;
    double valorF;
    Scanner teclado = new Scanner(System.in);

    public IpiProdutos() {
        TesteEntrada.titulo("Bem vindo ao Imposto IPI!");
        setValorF();
    }

        
    public int getQtdTipo() {
        return qtdTipo;
    }

    public void setQtdTipo() {
        int qtdT = TesteEntrada.testInt(teclado, "Insira a quantidade de produtos diferentes que deseja cadastrar: ");
        if(qtdT > 0){
            this.qtdTipo = qtdT;
        }else{
            System.out.println("Insira um numero de quantidades validas maior que zero!");
        }

    }

    public double getIpi() {
        return ipi;
    }

    public void setIpi() {
        double taxa = TesteEntrada.testDouble(teclado, "Insira o valor inteiro entre 0% e 30% da taxa IPI do seu produto: [Ex: 5 para 5%]");
        if(taxa >= 0 && taxa <= 30){
            this.ipi = taxa / 100 + 1;
        }else{
            System.out.println("Digite um valor válido entre 0% e 30%!");
        }

    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto() {
        int qtd = TesteEntrada.testInt(teclado, "Insira a quantidade de unidades desse produto: ");
        if(qtd >= 0){
            this.qtdProduto = qtd;
        }else{
            System.out.println("Insira um numero de quantidades validas maior ou equivalente a zero!");
        }

    }

    public int getCodigoP() {
        return codigoP;
    }

    public void setCodigoP() {
        int cod = TesteEntrada.testInt(teclado, "Insira o codigo do seu produto: ");
        if(cod >= 0){
            this.codigoP = cod;
        }else{
            System.out.println("insira um numero equivalente ou maior que zero!");
        }

    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto() {
        double valor = TesteEntrada.testDouble(teclado, "Insira o valor do seu produto: ");
        if(valor >= 0){
            this.valorProduto = valor;
        }else{
            System.out.println("Digite um valor maior ou equivalente a zero!");
        }
    }

    public double getValorF() {
        return valorF;
    }

    public void setValorF() {
        int contTipos = 0; // Variável de controle para o loop de diferentes produtos
        double somaPrecos = 0;
        setQtdTipo();
        setIpi();

        
        
        while(contTipos < getQtdTipo()){
            setValorProduto();
            setQtdProduto();
            setCodigoP();
            
            double valorPorQtd = getValorProduto() * getQtdProduto();
            somaPrecos += valorPorQtd;
            contTipos++;
        }
        double valorFinal = somaPrecos * getIpi();
        this.valorF = valorFinal;
    }

    @Override
    public String toString() {
        return "IpiProdutos{" + "ipi=" + ipi + ", qtdTipo=" + qtdTipo + ", qtdProduto=" + qtdProduto + ", codigoP=" + codigoP + ", valorProduto=" + valorProduto + ", valorF=" + valorF + '}';
    }
    
    
}
