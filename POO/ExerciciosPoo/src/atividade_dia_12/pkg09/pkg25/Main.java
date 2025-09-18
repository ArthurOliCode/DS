/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_dia_12.pkg09.pkg25;


/**
 *
 * @author arthu_uhkw4r8
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa_main p [] = new Pessoa_main[10];
        p[0] = new Pessoa_main("Arthur", "321-324-763-23", 2007, 12, 18);
        p[0].calcIdade();
        int idade = p[0].getIdade();
        System.out.printf("A idade e %d\n", idade);
        
    }
    
}
