package br.com.ativinterface.pseudosistema;

import javax.swing.JOptionPane;

public class CxDialog {

    public static void main(String args[]) {

        JOptionPane.showMessageDialog(
                null,
                "Cadastro de Pessoas",
                "Sistema de Cadastro", //titulo da caixa
                JOptionPane.INFORMATION_MESSAGE //icone 
        );

        String nome = JOptionPane.showInputDialog(
                null,
                "Informe um nome: ",
                "Entrada de Dados",
                JOptionPane.QUESTION_MESSAGE
        );

        JOptionPane.showMessageDialog(
                null,
                "O nome informado foi: \n" + nome,
                "Sistema de Cadastro", //titulo da caixa
                JOptionPane.INFORMATION_MESSAGE //icone 
        );

        int resp = JOptionPane.showConfirmDialog( //retorna um int, que pode ser 0 yes, 1 no, 2 cancel
                null,
                "Confirma o nome digitado? \n" + nome,
                "Confirmacao de Dados",
                JOptionPane.YES_NO_CANCEL_OPTION
        );
        switch (resp) {
            case 0 ->
                JOptionPane.showMessageDialog(
                        null,
                        "Confirmou o nome: \n" + nome,
                        "Sistema de Cadastro", //titulo da caixa
                        JOptionPane.INFORMATION_MESSAGE //icone
                );
            case 1 ->
                JOptionPane.showMessageDialog(
                        null,
                        "Nao Confirmou o nome: \n",
                        "Sistema de Cadastro", //titulo da caixa
                        JOptionPane.ERROR_MESSAGE //icone
                );
            default ->
                JOptionPane.showMessageDialog(
                        null,
                        "Cancelou a operacao \n",
                        "Sistema de Cadastro", //titulo da caixa
                        JOptionPane.INFORMATION_MESSAGE //icone
                );
        }
    }
}
