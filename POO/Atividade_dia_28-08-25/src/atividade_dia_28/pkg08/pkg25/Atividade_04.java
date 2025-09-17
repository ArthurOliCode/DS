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
public class Atividade_04 {
    int celsius;
    float faren;
    Scanner teclado = new Scanner(System.in);

    public int getCelsius() {
        return celsius;
    }

    public void setCelsius(int celsius) {
        this.celsius = celsius;
    }

    public float getFaren() {
        return faren;
    }

    public void setFaren(float faren) {
        this.faren = faren;
    }


    public void conversao(){
        Testes.titulo("Bem vindo ao Conversor");
        
        setCelsius(Testes.testInt(teclado, "Qual é a temperatura (em celsius) para que convertamos? "));
        setFaren(((getCelsius() * 9)/5 + 32));
        Testes.titulo("Resultados");
        Testes.linhas(34, "-", false);
        System.out.println("| Temperatura: Celsius | Farenheit|");
        System.out.printf("|%14s %6d | %.2f %3s|\n", "", getCelsius(), getFaren(), "");
        Testes.linhas(34, "-", true);
    }
    
}
