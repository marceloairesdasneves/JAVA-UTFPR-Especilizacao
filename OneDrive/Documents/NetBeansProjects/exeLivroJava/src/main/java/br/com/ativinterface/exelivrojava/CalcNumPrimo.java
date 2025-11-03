package br.com.ativinterface.exelivrojava;

public class CalcNumPrimo {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if(i < 2){
                System.out.println("");
            }
            else if(i % 2 == 0 || (Math.sqrt(i ) / i == 0)){
                System.out.println("");
            }else
                System.out.println("" + i + " PRIMO");
        }
    }
}
