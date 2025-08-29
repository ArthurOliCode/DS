/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carro;

/**
 *
 * @author arthu_uhkw4r8
 */
public class Carro extends Automovel{
    protected int combus;
    protected int velocidade;

    public Carro(int combus, int velocidade) {
        this.combus = combus;
        this.velocidade = velocidade;
    }

    public int getCombus() {
        return combus;
    }

    public void setCombus(int combus) {
        this.combus = combus;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    
    public double calcularMenorPreco(double preco1, double preco2, double preco3){
        double menorPreco = preco1;
        if(preco2 < menorPreco){
            menorPreco = preco2;
        }else if(preco3 < menorPreco){
            menorPreco = preco3;
        }
        return menorPreco;
    }
    
    public double calcularMaiorPreco(double preco1, double preco2, double preco3){
        double maiorPreco = preco1;
        if(preco1 > 0 && preco2 > 0 && preco3 > 0){
            if(preco2 > maiorPreco){
            maiorPreco = preco2;
            }else if(preco3 > maiorPreco){
                maiorPreco = preco3;
            }
            return maiorPreco;
        }else{
            System.out.println("Impossivel realizar a operação com precos abaixo ou igual a zero");
            return 0;
        }
        
    }
   
    @Override
    public String toString() {
     return "Carro{" + "marca=" + marca + ", nomeModelo=" + nomeModelo + ", anoOrigem=" 
                + anoOrigem + ", precoAno1=" + precoAno1 + ", precoAno2=" + precoAno2 + ", precoAno3=" 
                + precoAno3 + ", combustivel: "+ combus + ", velocidade" + velocidade + '}' ;
    }
    
    
}
