/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ativinterface.aulatrycacth;

/**
 *
 * @author USER
 */
public class CpfPeqException extends Exception {
    public CpfPeqException(){//metodo construtor
        System.out.println("\nConstrutor: gerou um objeto do tipo CpfPeqException.");
    }
    
    public void printErroCpfPeq(){
        System.out.println("\nO CPF deve ser um numero positivo.");
    }
}
