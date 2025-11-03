/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ativ03heranca;

/**
 *
 * @author Marcelo Aires das Neves
 */
public class Pai extends Genitores {
    private String corCalca;
    
    public void Pai(){
        this.corCalca = "";
    }
    public String getCorCalca(){
        return corCalca;
    }
    public void setCorCalca(String corCalca){
        this.corCalca = corCalca;
    }
    @Override
    public int calcRg(){
        return this.getRgGens() * 100;
    }
   
    
}
