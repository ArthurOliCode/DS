/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex001poo;

import java.util.Scanner;

/**
 *
 * @author CAMARGO
 */
public class Carro extends Automovel{

    private int velocidade;
    private int ano;
    private String marca;
    private float combus;
    private int rodas;
    private float peso;
    private float valor;
    private boolean farol;
    private boolean piscaA;
    private boolean direcao;
    private boolean seta; 
    private Scanner teclado = new Scanner(System.in);

    public Carro(int velocidade, int ano, String marca, float combus) {
        setVelocidade(velocidade);
        setAno(ano);
        setMarca(marca);
        this.combus = combus;
    }
    
    
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    
    public float getCombus() {
        return combus;
    }

    public void setCombus(float combus) {
        this.combus = combus;
    }

    
    
    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    
    
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    
    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    
    
    public boolean isFarol() {
        return farol;
    }

    public void setFarol(boolean farol) {
        this.farol = farol;
    }

    
    
    public boolean isPiscaA() {
        return piscaA;
    }

    public void setPiscaA(boolean piscaA) {
        this.piscaA = piscaA;
    }

    
    
    public boolean isDirecao() {
        return direcao;
    }

    public void setDirecao(boolean direcao) {
        this.direcao = direcao;
    }

    
    
    public boolean isSeta() {
        return seta;
    }

    public void setSeta(boolean seta) {
        this.seta = seta;
    }
    
    
    
    @Override
    public void acelerar() {
        int vel = testInt(teclado, "Digite um valor para aceleração válido: ");
        if (getVelocidade() >= 0 && vel > 0){
            setVelocidade(getVelocidade() + vel);
        }
        
    }

    @Override
    public void diminuir() {
        int vel = testInt(teclado, "Digite um valor válido para desacelerar o carro: ");
        if(getVelocidade() >= 0 && vel > 0){
            setVelocidade(getVelocidade() + vel);
        }
    }
    
    
    @Override
    public void farolLigado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void farolDesligado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void piscaAlertaLigado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void piscaAlertaDesligado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void virarDirecao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setaLigada() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void buzinar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public static int testInt(Scanner teclado, String msg){
        int num;
        
        while(true){ 
            try{
                System.out.println(msg);
                String entrada = teclado.next();
                
                num = Integer.parseInt(entrada);
                return num;
                
            }catch(NumberFormatException e){
                System.out.println("\n\nEntrada invalida, por favor, insira um numero inteiro valido");
                System.out.println("--------------------------------------------------------\n\n");
            }
        }
    }
}
