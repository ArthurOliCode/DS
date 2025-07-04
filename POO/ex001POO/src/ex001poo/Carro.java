/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex001poo;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author CAMARGO
 */
public class Carro extends Automovel{

    private boolean ligado;
    private int velocidade;
    private int ano;
    private String marca;
    private float combus;
    private int rodas;
    private float peso;
    private float valor;
    private boolean farol;
    private boolean piscaA;
    private String direcao;
    private boolean seta; 
    private boolean portaMalas;
    private boolean arcondicionado;

    private Scanner teclado = new Scanner(System.in);

    public Carro(int velocidade, int ano, String marca, float combus, boolean ingnicao) {
        setVelocidade(velocidade);
        setAno(ano);
        setMarca(marca);
        setLigado(ligado);
        this.combus = combus;
    }

    
    
    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
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

    
    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
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
  
    
    
    public boolean isSeta() {
        return seta;
    }

    public void setSeta(boolean seta) {
        this.seta = seta;
    }
    
    public boolean isPortaMalas() {
        return portaMalas;
    }

    public void setPortaMalas(boolean portaMalas) {
        this.portaMalas = portaMalas;
    }
    
    public boolean isArcondicionado() {
        return arcondicionado;
    }

    public void setArcondicionado(boolean arcondicionado) {
        this.arcondicionado = arcondicionado;
    }
    
    @Override
    public void ligar() {
        setLigado(true);
        System.out.println("\nCarro ligado...\n\n");
    }

    @Override
    public void desligar() {
        setLigado(false);
    }
    
    @Override
    public void acelerar() {
        if (isLigado()){
            int vel = testInt(teclado, "\n\nDigite um valor valido para a aceleracao: ");
            if (getVelocidade() >= 0 && vel > 0){
                setVelocidade(getVelocidade() + vel);
                System.out.printf("\nA velocidade atual é %skm/h\n\n", getVelocidade());
            }
        }else{
            System.out.println("E necessario primeiramente ligar a ingnicao do motor!\n");
        }
        
        
    }

    @Override
    public void desacelerar() {
        if (isLigado()){
            int vel = testInt(teclado, "\n\nDigite um valor valido para desacelerar o carro: ");
            if (getVelocidade() >= 0 && vel > 0){
                if (getVelocidade() - vel >= 0){
                    setVelocidade(getVelocidade() - vel);
                    System.out.printf("\nA velocidade atual é %skm/h\n\n", getVelocidade());
                }else{
                    setVelocidade(0);
                }
            }
        }else{
            System.out.println("E necessario primeiramente ligar a ingnicao do motor!\n");
        }
        
    }
    
    
    @Override
    public void farolLigado() {
        if (isLigado()){
            if (!isFarol()){
                setFarol(true);
                System.out.println("\n\nLigando os farois: \n\n");
                for (int c = 0; c < 2; c++){
                    if(c == 0){
                        System.out.println("      / /");
                    }else{
                        System.out.println("  |   / /");
                    }

                    if(c == 0){
                         System.out.println("---  / /");
                    }else{
                        System.out.println("  |  / /");
                    }
                    System.out.println("  |O - -");
                    if(c == 0){
                        System.out.println("  |  ` `");
                    }else{
                        System.out.println("---  ` `");
                    }
                    if( c == 0){
                        System.out.println("  |   ` `");
                    }else{
                        System.out.println("      ` `");
                    }
                    wait(600);

                }
            }else{
                System.out.println("O farol já esta desligado! \n\n");
            }
        }else{
            System.out.println("E necessario primeiramente ligar a ingnicao do motor!\n\n");
        } 
    }

    @Override
    public void farolDesligado() {
        if(isLigado()){
            if(isFarol()){
                System.out.println("\n\nDesligando os farois: \n\n");
                for(int c = 0; c < 2; c++){
                    if(c == 0){
                        System.out.println("---   /");
                    }else{
                        System.out.println("   |");
                        System.out.println("   |  /");
                    }
                    System.out.println("   |O -");
                    if(c == 0){
                        System.out.println("   |  `");
                    }else{
                        System.out.println("---   `");
                    }
                    wait(600);
                }
            }else{
                System.out.println("O farol ja esta desligado!\n\n");
            }
        }else{
            System.out.println("E necessario primeiramente ligar a ingnicao do motor!\n\n");
        } 
        
    }

    @Override
    public void piscaAlertaLigado() {
        if(isLigado()){
            if (!isPiscaA()){
                System.out.println("\n\nLigando o pisca alerta: \n");

                System.out.println("  /\\");
                wait(600);
                System.out.println(" // \\");
                wait(600);
                System.out.println("//   \\");
                wait(600);
                System.out.println("-------");
                setPiscaA(true);
            }
        }else{
            System.out.println("E necessario primeiramente ligar a ingnicao do motor!\n\n");
        } 
        
    }

    @Override
    public void piscaAlertaDesligado() {
        if (isLigado()){
            if (isPiscaA()){
                System.out.println("\n\nDesligando o pisca alerta: \n");

                for(int c = 0; c <= 4; c++){
                    if (c == 0){
                        System.out.println("  /\\");
                        wait(100);
                        System.out.println(" // \\");
                        wait(100);
                        System.out.println("//   \\");
                        wait(100);
                        System.out.println("------- \n");
                    }else if(c == 1){
                        System.out.println("  /\\");
                        wait(100);
                        System.out.println(" // \\");
                        wait(100);
                        System.out.println("//   \\ \n");
                        wait(100);
                    }else if(c == 2){
                        System.out.println("  /\\");
                        wait(100);
                        System.out.println(" // \\ \n");
                        wait(100);
                    }else if(c == 3){
                        System.out.println("  /\\ \n");
                        wait(100);
                    }else{
                        System.out.println("Pisca alerta desligado!\n\n");
                    }

                    setPiscaA(false);
                }
            }
        }else{
            System.out.println("E necessario primeiramente ligar a ingnicao do motor!\n\n");
        } 
        
    }

    @Override
    public void virarDirecao() {
       if (isLigado()){
           System.out.println("\n\nVoce deseja virar para qual direcao: [d: direita] [e: esquerda]");
           String direc = teclado.next().strip().substring(0, 1).toLowerCase();
           if(getDirecao() == null){
               System.out.println("Voce nao acionou a seta antes de virar! Atente-se mais a sinalizacao!!");
           }else if(!direc.equals(getDirecao())) {
               System.out.println("A direcao que você deseja virar, esta diferente da direcao dada pela seta! Tome cuidado!");
           }else while(!getDirecao().equals("d") && !getDirecao().equals("e")){
               System.out.println("\nDigite corretamente a direcao: [d: direita] [e: esquerda]");
               direc = teclado.next().strip().substring(0, 1).toLowerCase();
               setDirecao(direc);
           }
           if (direc.equals("d")){
               System.out.println(" \n\n ");
               System.out.println("Virando para a direita...");
               System.out.println("---------> ");
               wait(1000);
               System.out.println("\n\nVoltando volante...");
               System.out.println("<---------\n\n");
           }else{
               System.out.println("\n\n");
               System.out.println("Virando para a esquerda...");
               System.out.println("<---------");
               wait(1000);
               System.out.println("Voltando volante....");
               System.out.println("--------->\n\n");
           }
       }else{
           System.out.println("E necessario primeiramente ligar a ingnicao do motor!\n");
       }
    }

    @Override
    public void setaLigada() {
        if (isLigado()){
            System.out.println("\n\nQual direcao ira virar: [d: direita] [e: esquerda]");
            String direc = teclado.next().strip().substring(0, 1).toLowerCase();
            setDirecao(direc);
            while (!direc.equals("d") && !direc.equals("e")){
               System.out.println("Digite corretamente a direcao: [d: direita] [e: esquerda]");
               direc = teclado.next();
            }
            if (direc.equals("d")){
                System.out.println(" \n\n ");
                System.out.println("  /");
                System.out.println(" /");
                System.out.println("---> ");
                System.out.println(" `");
                System.out.println("  `");
                wait(1000);
                System.out.println("\n\nDesligando a seta...\n\n");
                wait(800);
           }else{
                System.out.println("\n\n");
                System.out.println("`");
                System.out.println(" `");
                System.out.println("<---");
                System.out.println(" /");
                System.out.println("/");
                wait(1000);
                System.out.println("\n\nDesligando a seta....\n\n");
                wait(800);
           }
        }else{
            System.out.println("E necessario primeiramente ligar a ingnicao do motor!\n\n");
        }
    }

    @Override
    public void buzinar() {
        if (isLigado()){
            int miliSegundos = testInt(teclado, "\n\nQuantos segundos voce deseja continuar buzinando: ") * 1000;
            System.out.println("\nBi-bi!!\n\n");
            wait(miliSegundos);
        }
    }
    
    public void abrirPortaMalas(){
        if(!isPortaMalas()){
            setPortaMalas(true);
            System.out.println("Abrindo porta-malas...");
            for (int i = 0; i < 3; i++) {
                System.out.println("  _______________");
                System.out.println(" |               |");
                System.out.println(" |               |");
                if (i == 0){
                    System.out.println(" |  __________   |");
                }
                if (i == 1){
                    System.out.println(" |  |        |   |");
                }
                if (i == 2){
                    System.out.println(" |  | ABERTO |   |");
                }
                System.out.println(" |__|________|__|");
                wait(500);
            }
            System.out.println("Porta-malas aberto!\n\n\n");
        }else{
            System.out.println("Nao foi possivel abrir porta-malas, pois ele ja esta aberto!");
        }
    }
    
    
    public void fecharPortaMalas() {
        if(isPortaMalas()){
            System.out.println("Fechando porta-malas...");

            String[] frames = {
                // Frame 1: Porta-malas totalmente aberto
                "  _______________\n" +
                " |               |\n" +
                " |               |\n" +
                " |  __________  |\n" +
                " |  |        |  |\n" +
                " |  | ABERTO |  |\n" +
                " |  |        |  |\n" +
                " |__|________|__|",

                // Frame 2: Início do fechamento (45°)
                "  _______________\n" +
                " |               |\n" +
                " |               |\n" +
                " |  __________  / \n" +
                " |  |        | /  \n" +
                " |  | FECHAN |/   \n" +
                " |  |        |    \n" +
                " |__|________|    ",

                // Frame 3: Meio fechado (70°)
                "  _______________\n" +
                " |               |\n" +
                " |               |\n" +
                " |  __________  | \n" +
                " |  |        |-'  \n" +
                " |  | FECHAN |    \n" +
                " |  |        |    \n" +
                " |__|________|    ",

                // Frame 4: Quase fechado (85°)
                "  _______________\n" +
                " |               |\n" +
                " |               |\n" +
                " |  __________  | \n" +
                " |  |        | |  \n" +
                " |  | FECHAN | |  \n" +
                " |  |________|/   \n" +
                " |__|________|    ",

                // Frame 5: Totalmente fechado
                "  _______________\n" +
                " |               |\n" +
                " |               |\n" +
                " |  __________  | \n" +
                " |  |        | |  \n" +
                " |  | FECHAD | |  \n" +
                " |  |________| |  \n" +
                " |__|________|_|  \n"
            };

            for (String frame : frames) {
                System.out.println(frame);
                wait(400);  // Tempo entre quadros
            }
            System.out.println("Porta-malas fechado com seguranca! 🔒\n\n\n");
        }else{
            System.out.println("Nao foi possivel fechar o porta-malas, justamente porque ele ja esta fechado.");
        }
    }
    
    public void ligarArCondicionado() {
        if(isLigado() && !isArcondicionado()){
            setArcondicionado(true);
            System.out.println("Ligando ar condicionado...");
            for (int i = 0; i < 5; i++) {
                System.out.println("  _________");
                System.out.println(" |  AR-15°C |");
                System.out.println(" |---------|");
                System.out.print(" |");
                for (int j = 0; j < i; j++) {
                    System.out.print("❄️");
                }
                System.out.println("|");
                System.out.println(" |_________|");
                wait(300);
            }
            System.out.println("Ar condicionado ligado!");
        }else{
            System.out.println("Nao foi possivel ligar o ar condicionado, pois, o motor deve estar ligado primeiramente!");
        }
    }
    
    
     public void desligarArCondicionado() {
        if(isLigado() && isArcondicionado()){
            System.out.println("Desligando ar condicionado...");
            for (int i = 0; i < 5; i++) {
                System.out.println("  _________");
                System.out.println(" |  AR- --°C |");
                System.out.println(" |---------|");
                System.out.print(" |");
                for (int j = 0; j < i; j++) {
                    System.out.print("-️");
                }
                System.out.println("|");
                System.out.println(" |_________|");
                wait(300);
            }
            System.out.println("Ar condicionado desligado!");
        }else if(!isLigado()){
            System.out.println("Nao foi possivel ligar o ar condicionado, pois, o motor deve estar ligado primeiramente!");
        }else if(!isArcondicionado()){
            System.out.println("O ar condicionado já está desligado!");
        }
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
    
    public static void wait(int miliSegundos){
        try {
            Thread.sleep(miliSegundos);
            } catch (InterruptedException ex) {    
                Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    

    
    
    

}
