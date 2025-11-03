/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.atividade3heranca.atividade04heranca;

/**
 *
 * @author Marcelo Aires das Neves
 */
public class Motor {//inicio da definicao da estrutura que representa um motor
    private int qtdPist;//atributos do tipo private, que garante que sera acessado somente pela propria classe
    private int potencia;//atributos do tipo private, que garante que sera acessado somente pela propria classe
    
    //Metodo Construtor

    public Motor(){//construtor sem parametros com valores padroes zero para os atributos.
        this.qtdPist = 0;
        this.potencia = 0;
    }
    public Motor(int qtdPist, int potencia){//Construtor com parametros que permite criar um objeto com valores definido
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
