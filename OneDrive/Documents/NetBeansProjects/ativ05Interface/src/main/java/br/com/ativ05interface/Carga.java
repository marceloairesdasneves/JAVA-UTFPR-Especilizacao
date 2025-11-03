/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ativ05interface;

/**
 *
 * @author USER
 */
public final class Carga extends Veiculo implements Calcular{
    private int cargaMax;
    private int tara;
    
    public Carga(){
        this.cargaMax = 0;
        this.tara = 0;
    }
    public Carga(int cargaMax, int tara){
        this.cargaMax = cargaMax;
        this.tara = tara;
    }
    public int getCargaMax(){
        return cargaMax;
    }
    public void setCargaMax(int cargaMax){
        this.cargaMax = cargaMax;
    }
    public int getTara(){
        return tara;
    }
    public void setTara(int tara){
        this.tara = tara;
    }
    public void Calcular(){
        System.out.println("\nTeste Carga");
    }
    @Override
    public void calcVel(){
        System.out.println("Velocidade - Carga: " + getVelocMax() * 10000 +" cm/h");
    }

    
    @Override
        public int calcular(){
        int somNum = 0;
        somNum+=getMotor().getQtdPist();
        somNum+=getMotor().getPotencia();
        somNum+=getQtdRodas();
        somNum+=getVelocMax();
        somNum+=getTara();
        somNum+=getCargaMax();
        
        return somNum;
    }
}
