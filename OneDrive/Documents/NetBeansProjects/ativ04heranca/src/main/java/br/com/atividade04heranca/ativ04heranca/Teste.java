///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */C:\Users\USER\OneDrive\Documents\NetBeansProjects\ativ04heranca]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]*
package br.com.atividade04heranca.ativ04heranca;

public class Teste {
    public static void main(String[] args) {
        
        //==============================================Veiculo de Passeio==============================
        
        Passeio p1 = new Passeio(5, "ABC-1234", "Fiat", "Uno", "Vermelho", 180.0f, 4, 75, 5);

        //==============================================Veiculo Carga==============================

        Carga c1 = new Carga("DEF-5678", "Volvo", "FH16", "Branco", (int)120.0f, 6, 540, 16);
        c1.setCargaMax(30000);
        c1.setTara(8000);

        System.out.println("\n========================Carro de Passeio P1=====================");

        System.out.println("Placa: " + p1.getPlaca());
        System.out.println("Marca: " + p1.getMarca());
        System.out.println("Modelo: " + p1.getModelo());
        System.out.println("Cor: " + p1.getCor());
        System.out.println("Velocidade Maxima: " + p1.getVelocMax());
        System.out.println("Quantidade de Rodas: " + p1.getQtdRodas());
        System.out.println("Potencia do Motor: " + p1.getMotor().getPotencia());
        System.out.println("Quantidade de Pistoes do Motor: " + p1.getMotor().getQtdPist());
        System.out.println("Quantidade de Passageiros: " + p1.getQtdPassageiros());
        System.out.println("Velocidade em m/s: " + p1.calcVel());

        System.out.println("\n========================Carro de Carga C1=====================");
        System.out.println("Placa: " + c1.getPlaca());
        System.out.println("Marca: " + c1.getMarca());
        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Cor: " + c1.getCor());
        System.out.println("Velocidade Maxima: " + c1.getVelocMax());
        System.out.println("Quantidade de Rodas: " + c1.getQtdRodas());
        System.out.println("Potencia do Motor: " + c1.getMotor().getPotencia());
        System.out.println("Quantidade de Pistoes do Motor: " + c1.getMotor().getQtdPist());
        System.out.println("Carga Maxima: " + c1.getCargaMax());
        System.out.println("Tara: " + c1.getTara());
        System.out.println("Velocidade em m/s: " + c1.calcVel());
    }
}
