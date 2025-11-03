/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ativ03heranca;

/**
 *
 * @author Marcelo Aires das Neves
 */
public abstract class Genitores { //criado a classe abstract de Genitores para usar no polimorfismo e heranca e sobrecarga
    private int rgGens;//atributo do tipo primitivo int, com o modificador de acesso tipo private
    private String nomeGens;//atributo do tipo referencia, com o modificador de acesso tipo private
    private Filho filhoGens; //atributo do tipo referencia (objeto), com o modificador de acesso tipo private
    
    public Genitores(){//criado o construtor padrao
        this.rgGens = 0;
        this.nomeGens = "";
        this.filhoGens = new Filho();
    }
    //Criando os metodos Getters e Setters
    public int getRgGens(){
        return rgGens;
    }
    public void setRgGens(int rgGens){
        this.rgGens = rgGens;
    }
    
    public String getNomeGens(){
        return nomeGens;
    }
    public void setNomeGens(String nomeGens){
        this.nomeGens = nomeGens;
    }
    
    public Filho getFilhoGens(){
        return filhoGens;
    }
    public void setFilhoGens(Filho filhoGens){
        this.filhoGens = filhoGens;
    }
    //criando o metodo abstract da calcRg, este metodo dever ser implementado na classe FILHAS. 
    //PAI(MULTIPLICAR POR 100) e MAE(MULTIPLICAR POR 1000)
    public abstract int calcRg();
}
