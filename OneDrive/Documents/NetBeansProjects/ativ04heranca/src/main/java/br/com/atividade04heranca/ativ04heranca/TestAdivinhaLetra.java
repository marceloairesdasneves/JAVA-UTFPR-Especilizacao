package br.com.atividade04heranca.ativ04heranca;
import static java.lang.StringTemplate.STR;
import java.util.Scanner;

public class TestAdivinhaLetra {
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
            }
        }
}

