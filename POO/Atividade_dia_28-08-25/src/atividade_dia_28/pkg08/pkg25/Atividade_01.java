/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_dia_28.pkg08.pkg25;

/**
 *
 * @author arthu_uhkw4r8
 */

public class Atividade_01 {
    
    public void HelloWord(){
        Testes.linhas(24, "-", false);
        String frase = "Hello Word";
        System.out.printf("%4s %s %n", "",frase);
        Testes.linhas(24, "-", true);
    }
    
    public void msgSaida(String entrada){
        Testes.linhas((entrada.length() * 2), "-", false);
        
        String frase = entrada;
        System.out.println("");
        System.out.printf("%10s %s %n", "",frase);
        Testes.linhas((entrada.length() * 2), "-", true);
        System.out.println("");
    }
}
