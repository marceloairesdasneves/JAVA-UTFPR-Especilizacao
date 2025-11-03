/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.atividade04heranca.ativ04heranca;

/**
 *
 * @author Marcelo Aires das Neves
 */
public class Motor {
    private int qtdPist;
    private int potencia;
    
    //Metodo Construtor

    public void Motor(){
    }
    public Motor(){
        this.qtdPist = 0;
        this.potencia = 0;
    }
    public Motor(int qtdPist, int potencia){
        this.qtdPist = qtdPist;
        this.potencia = potencia;
    }
    
    //Metodos Getters e Setters
    public int getQtdPist(){
        return qtdPist;
    }
    public void setQtdPist(int qtdPist){
        this.qtdPist = qtdPist;
    }
    
    public int getPotencia(){
        return potencia;
    }
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }

}       
