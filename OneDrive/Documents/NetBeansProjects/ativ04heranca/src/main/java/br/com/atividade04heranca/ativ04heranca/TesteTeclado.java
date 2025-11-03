package br.com.atividade04heranca.ativ04heranca;

import java.util.Scanner;

public class TesteTeclado {
        public static void main(String[] args) {
            char ch;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Press key followed by ENTER: ");
            ch = scanner.next().charAt(0);
            System.out.println("Your key is: " + ch);
        }
}
