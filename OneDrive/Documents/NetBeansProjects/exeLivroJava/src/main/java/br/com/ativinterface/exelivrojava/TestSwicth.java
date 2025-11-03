/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ativinterface.exelivrojava;

/**
 *
 * @author USER
 */
public class TestSwicth {
    public static void main(String[] args) {
        int i;
        
        for (i = 0; i <= 5; i++){
            
            switch(i){
                case 0 -> System.out.println("print one");
                case 1 -> System.out.println("print two");
                case 2 -> System.out.println("print three");
                case 3 -> System.out.println("print four");
                case 4 -> System.out.println("print five");
                default -> System.out.println("is more");
            }
        }   
    }
}
