/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ativinterface.exelivrojava;

import java.io.IOException;

/**
 *
 * @author USER
 */
public class LerCaracterTeclado {
    public static void main(String[] args) throws IOException {
        char ch;
        System.out.println("Press key followed by ENTER: ");
        ch = (char) System.in.read();
        System.out.println("Your key is: " + ch);
    }
}
