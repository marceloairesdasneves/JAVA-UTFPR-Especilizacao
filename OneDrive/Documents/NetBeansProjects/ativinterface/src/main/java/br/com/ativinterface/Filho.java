/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ativinterface;

/**
 *
 * @author USER
 */
public class Filho implements Mae{
   
    public void impDados(){
        System.out.println("\nImprime dados do Filho");
    }
    @Override
    public void impDadosMae(){
        System.out.println("\nImplementacao da interface MAE - Metodo Mae");
        System.out.println("Idade " + idade);
    }
}
