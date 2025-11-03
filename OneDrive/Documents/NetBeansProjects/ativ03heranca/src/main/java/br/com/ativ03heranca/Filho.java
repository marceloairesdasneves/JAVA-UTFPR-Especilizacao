/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ativ03heranca;

/**
 *
 * @author Marcelo Aires das Neves
 */
public class Filho {
    private int rgFilho;
    private String nomeFilho;

       
    public void Filho(){//construtor default, nao passa parametros
        this.rgFilho = 0;
        this.nomeFilho = "";
    }
    
    public int getRgFilho(){
        return rgFilho;
    }
    public void setRgFilho(int rgFilho){
        this.rgFilho = rgFilho;
    }
    
    public String getNomeFilho(){
        return nomeFilho;
    }
    public void setNomeFilho(String nomeFilho){
        this.nomeFilho = nomeFilho;
    }
    
    
}
