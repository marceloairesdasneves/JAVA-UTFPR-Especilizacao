package br.com.ativinterface.exelivrojava;

public class ExeLivroJava {
    public static void main(String[] args) {
        int j;
        for (j = 0; j <= 10; j++){
            switch(j){
                case 0:
                    System.out.println("i is zero");
                    break;
                case 1:
                    System.out.println("i is one");
                    break;
                case 2:
                    System.out.println("i is two");
                    break;
                case 3:
                    System.out.println("i is three");
                    break;
                case 4:
                    System.out.println("i is four");
                    break;
                default:
                    System.out.println("i is five or more");
            }
        }    
    }
}
