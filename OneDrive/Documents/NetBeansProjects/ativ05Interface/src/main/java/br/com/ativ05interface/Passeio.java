/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ativ05interface;

/**
 *
 * @author USER
 */
public final class Passeio extends Veiculo implements Calcular {
    private int qtdPassageiros;
    
    public Passeio(){
        this.qtdPassageiros = 0;
    }
    public Passeio(int qtdPassageiros){
        this.qtdPassageiros = qtdPassageiros;
    }
    public int getQtdPassageiros(){
        return qtdPassageiros;
    }
    public void setQtdPassageiros(int qtdPassageiros){
        this.qtdPassageiros = qtdPassageiros;
    }
    public void Calcular(){
        System.out.println("\nTeste Passeio");
    }
    @Override
    public void calcVel(){
        System.out.println("Velocidade - Passeio: " + getVelocMax() * 1000 +" m/h");
    }

    
    @Override
    public int calcular(){
        int somaLetras = 0;
        somaLetras+=getPlaca().length();
        somaLetras+=getMarca().length();
        somaLetras+=getModelo().length();
        somaLetras+=getCor().length();
        
        return somaLetras;
    }

 


}
