/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex001poo;

/**
 *
 * @author CAMARGO
 */
public abstract class Automovel {
    //Definindo encapsulamento e herança com uma classe autmóvel
    //Exemplo de Programação orientada a objeto POO
    
    
    protected int velocidade;
    protected int ano;
    protected String marca;
    protected float combus;
    protected int rodas;
    protected float peso;
    protected float valor;
    protected boolean farol;
    protected boolean piscaA;
    protected boolean direcao;
    protected boolean seta; 
    
    public abstract void acelerar();
    public abstract void diminuir();
    public abstract void farolLigado();
    public abstract void farolDesligado();
    public abstract void piscaAlertaLigado();
    public abstract void piscaAlertaDesligado();
    public abstract void virarDirecao();
    public abstract void setaLigada();
    public abstract void buzinar();

    
    
}
