/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ativinterface.aulatrycacth;

/**
 *
 * @author USER
 */
public class CpfGrdException extends Exception {
    public CpfGrdException(){//metodo construtor
        System.out.println("\nConstrutor: gerou um objeto do tipo CpfGrdException.");
    }
    
    public void printErroCpfGrd(){
        System.out.println("\nO CPF deve ser um numero menor 100.");
    }
}
