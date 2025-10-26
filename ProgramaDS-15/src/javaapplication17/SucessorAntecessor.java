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
public class SucessorAntecessor {
    int num;
    int ant; // antecessor ao número fornecido
    int suces; // sucessor do número fornecido
    Scanner teclado = new Scanner(System.in);

    public SucessorAntecessor() {
        TesteEntrada.titulo("Calculadora de Antecessores e Sucessores");
        setNum();
    }

    public int getNum() {
        return num;
    }

    public void setNum() {
        int valor = TesteEntrada.testInt(teclado, "Insira o numero inteiro incial: [Ex: 1, 2 ...]");
        this.num = valor;
        
        setAnt(getNum());
        setSuces(getNum());
    }

    public int getAnt() {
        return ant;
    }

    public void setAnt(int num) {
        int antecessor = num - 1;
        this.ant = antecessor;
    }

    public int getSuces() {
        return suces;
    }

    public void setSuces(int num) {
        int sucessor = num + 1;
        this.suces = sucessor;
    }

    @Override
    public String toString() {
        return "SucessorAntecessor{" + "numero: " + num + ", seu antecessor: " + ant + ", seu sucessor: " + suces + '}';
    }
    
    
    
}
