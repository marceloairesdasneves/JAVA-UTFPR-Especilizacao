/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ativinterface.exelivrojava;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class AdivinhaLetra {
    public static void main(String[] args) {
        char ch, answer = 'K';
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Insert the LETTER: ");
            ch = scanner.next().charAt(0);
            int cont =+ i+1;
        
                if(ch == answer){
                    System.out.println("You win");
                }else{
                    System.out.println("You lost");
                }
            System.out.println("End!!! " + "You try " + cont);
        }
    }
}
