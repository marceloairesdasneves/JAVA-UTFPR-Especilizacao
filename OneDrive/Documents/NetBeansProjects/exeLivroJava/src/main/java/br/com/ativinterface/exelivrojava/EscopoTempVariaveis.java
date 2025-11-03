/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ativinterface.exelivrojava;

/**
 *
 * @author USER
 */
public class EscopoTempVariaveis {
    public static void main(String[] args) {
        int x;
        
        x = 10;
        if(x == 10){
            int y = 20;
            System.out.println("x and y: " + x + " " + y );
            x = y * 2;
        }
        System.out.println("x is " + x);
    }
}
