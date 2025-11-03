/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.atividade04heranca.ativ04heranca;

public final class Carga extends Veiculo {
    private int cargaMax;
    private int tara;
    
    //Metodo construtor default
    public Carga(){
        cargaMax = 0;
        tara = 0;
    }

    @Override
    public float calcVel() {
        return getVelocMax() * 1000;
    }

    //metodo construtor passando parametros
    public Carga(int cargaMax, int tara){
        this.cargaMax = cargaMax;
        this.tara = tara;

    }

    public Carga(String placa1, String marca1, String modelo1, String cor1, int f, int i, int i1, int i2) {
        super(placa1, marca1, modelo1, cor1, f, i, i1, i2);
        this.cargaMax = 0;
        this.tara = 0;
    }

    //metodos Getters e Setters
    public int getCargaMax(){
        return cargaMax;
    }
    public final void setCargaMax(int cargaMax){
        this.cargaMax = cargaMax;
    }
    public int getTara(){
        return tara;
    }
    public final void setTara(int tara){
        this.tara = tara;
    }

}
