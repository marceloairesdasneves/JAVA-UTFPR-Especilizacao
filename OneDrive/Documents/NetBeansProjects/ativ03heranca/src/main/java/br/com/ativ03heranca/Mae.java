/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ativ03heranca;

/**
 *
 * @author USER
 */
public class Mae extends Genitores{
    private String corVestido;
    
    public void Mae(){
        this.corVestido = "";
    }
    public String getCorVestido(){
        return corVestido;
    }
    public void setCorVestido(String corVestido){
        this.corVestido = corVestido;
    }
    @Override
    public int calcRg(){
        return this.getRgGens() * 1000;
    }
   
    
}
