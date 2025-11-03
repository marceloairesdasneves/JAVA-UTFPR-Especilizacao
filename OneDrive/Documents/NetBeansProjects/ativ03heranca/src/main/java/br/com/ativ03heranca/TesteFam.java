/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ativ03heranca;

/**
 *
 * @author USER
 */
public class TesteFam {
    public static void main(String[] args) {
        //Genitores gen = new Genitores();
        Pai pai = new Pai();
        Mae mae = new Mae();
        
        pai.setRgGens(1);
        pai.setNomeGens("Papai");
        pai.setCorCalca("Azul");
        pai.getFilhoGens().setRgFilho(11);
        pai.getFilhoGens().setNomeFilho("Filho do Pai");
        
        mae.setRgGens(2);
        mae.setNomeGens("Mamae");
        mae.setCorVestido("Rosa");
        mae.getFilhoGens().setRgFilho(22);
        mae.getFilhoGens().setNomeFilho("Filho da Mae");
        
        
        System.out.println("***********************************");
        System.out.println("\t\t\t Dados do Pai");
        System.out.println("***********************************");
        System.out.println("rg do Pai............: " + pai.getRgGens());
        System.out.println("rg Calculado do Pai..: " + pai.calcRg());
        System.out.println("nome do Pai..........: " + pai.getNomeGens());
        System.out.println("cor da Calca do Pai..: " + pai.getCorCalca());
        System.out.println("rg do Filho do Pai...: " + pai.getFilhoGens().getRgFilho());
        System.out.println("nome do Filho do Pai.: " + pai.getFilhoGens().getNomeFilho());

        System.out.println("\n\n***********************************");
        System.out.println("\t\t\t Dados da Mae");
        System.out.println("***********************************");
        System.out.println("rg da Mae............: " + mae.getRgGens());
        System.out.println("rg Calculado da Mae..: " + mae.calcRg());
        System.out.println("nome da Mae..........: " + mae.getNomeGens());
        System.out.println("cor do Vestido da Mae: " + mae.getCorVestido());
        System.out.println("rg do Filho da Mae...: " + mae.getFilhoGens().getRgFilho());
        System.out.println("nome Filho do Pai....: " + mae.getFilhoGens().getNomeFilho());
        
        
    }
    
}
