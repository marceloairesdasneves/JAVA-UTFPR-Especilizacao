/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.atividade04heranca.ativ04heranca;

/**
 *
 * @author USER
 */
public final class Passeio extends Veiculo {
    private Motor motor;
    private int qtdPassageiros;
    
    //Metodo construtor default
    public Passeio() {
        qtdPassageiros = 0;
    }
    //Metodo construtor passando parametros
    public Passeio(int qtdPassageiros, String placa, String marca, String modelo, String cor,
                   float velocMax, int qtdRodas, int potencia, int qtdPist) {
        super(placa, marca, modelo, cor, velocMax, qtdRodas, potencia, qtdPist);
        this.qtdPassageiros = qtdPassageiros;
    }
    @Override
    public float calcVel() {
        return getVelocMax() * 1000 / 3600;
    }
    //metodos Getters e Setters
    public int getQtdPassageiros() {
        return qtdPassageiros;
    }
    public final void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }


   
}
