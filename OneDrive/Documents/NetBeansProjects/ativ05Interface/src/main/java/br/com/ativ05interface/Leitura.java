/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ativ05interface;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Leitura {
    Scanner scanner = new Scanner(System.in);
    public String entDados(String mensagem){
        System.out.print(mensagem);
        return scanner.next();
    }
}
