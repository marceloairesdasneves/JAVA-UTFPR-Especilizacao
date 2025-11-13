/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ativinterface.aulatrycacth;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Leitura {
    public String entDados(String rotulo) {
        String ret = "";

        try {
            Scanner leitura = new Scanner(System.in);
            System.out.println(rotulo);
            ret = leitura.nextLine();
            leitura.close();

            } catch (NoSuchElementException | IllegalStateException e) {
                System.out.println("\nERRO ao ler os dados: ");
                
        }
        return ret;
    }
}
