/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ativinterface.aulatrycacth;

/**
 *
 * @author USER
 */
public class TstTratExc {

    public static void main(String[] args) throws CpfPeqException {
        Leitura l = new Leitura();
        Pessoa p1 = new Pessoa();
        boolean vai = true;
        //while (vai) {
            try {
                p1.setCpf(Integer.parseInt(l.entDados("\nCPF.....: ")));
                System.out.println("\nCPF....: " + p1.getCpf());
            } catch (CpfPeqException cpe) {
                cpe.printErroCpfPeq();
            } catch (NumberFormatException ncpe) {
                System.out.println("\nO valor do CPF deve ser um numero inteiro.");
            }
            catch (CpfGrdException cge) {
                cge.printErroCpfGrd();
            }
            //finally {
                //System.out.println("Executou o FINALLY.");
            //}
        //}
        //vai = false;
    }
}
