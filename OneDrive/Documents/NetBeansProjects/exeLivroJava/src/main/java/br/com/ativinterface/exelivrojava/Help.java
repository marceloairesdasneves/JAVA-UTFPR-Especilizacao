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
public class Help {
    public static void main(String[] args) {
        System.out.println("Help on: ");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.print("\nChoose one: ");
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);
        
        switch(choice){
            case '1':
                System.out.println("\nYour choice is `if`");
                System.out.println("\nif (condition) statement");
                break;
            case '2': 
                System.out.println("Your choice is `switch` "); 
                System.out.println("switch (expression)");
                System.out.println(" case constant: ");
                break;
            default:
                System.out.println("Selection not found. ");
            
        }
    }
}
