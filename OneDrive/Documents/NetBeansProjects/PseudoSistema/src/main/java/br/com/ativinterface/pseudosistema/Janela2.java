package br.com.ativinterface.pseudosistema;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Janela2 {

    private static JFrame jan2 = new JFrame("Titulo Inicial");

    private static JLabel rtVal1 = new JLabel("Rotulo Inicial 1");
    private static JLabel rtVal2 = new JLabel("Rotulo Inicial 2");
    private static JLabel rtResult = new JLabel("Rotulo Inicial 3");

    private static JTextField cxVal1 = new JTextField(15);
    private static JTextField cxVal2 = new JTextField(15);
    private static JTextField cxResult = new JTextField(15);

    private static JButton btSomar = new JButton("Somar");
    private static JButton btLimpar = new JButton("Texto Inicial");
    private static JButton btSair = new JButton("Texto Inicial");

    public static void main(String[] args) {
        criaJan();
    }

    public static void criaJan() {
        jan2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int larg = 500, alt = 200;
        jan2.setSize(larg, alt);
        jan2.setTitle("Calculadora");

        rtVal1.setText("Valor 1: ");
        cxVal1.setColumns(10);

        rtVal2.setText("Valor 2: ");
        cxVal2.setColumns(10);

        rtResult.setText(" = ");
        cxResult.setColumns(10);

        btLimpar.setText("Limpar");
        btSair.setText("Sair");
        btSomar.setText(" + ");

        jan2.add(rtVal1);
        jan2.add(cxVal1);

        jan2.add(rtVal2);
        jan2.add(cxVal2);

        jan2.add(rtResult);
        jan2.add(cxResult);

        jan2.add(btSomar);
        jan2.add(btLimpar);
        jan2.add(btSair);

        jan2.setLayout(new FlowLayout());
        jan2.setVisible(true);

        btSomar.addActionListener((ActionEvent evt) -> {
            somar();
        });//usei o lambda para implementar a ActionListener
        btLimpar.addActionListener((ActionEvent evt) -> {
            limpar();
        });
        btSair.addActionListener((ActionEvent evt) -> {
            sair();
        });
    }

    public static void somar() {
        int a = Integer.parseInt(cxVal1.getText());
        int b = Integer.parseInt(cxVal2.getText());
        int c = (a + b);
        cxResult.setText(Integer.toString(c));
    }

    public static void limpar() {
        cxVal1.setText("");
        cxVal2.setText("");
        cxResult.setText("");
        cxVal1.requestFocus();
    }

    public static void sair() {
        int resp = JOptionPane.showConfirmDialog(
                null,
                "Deseja sair? ",
                "Confirmacao de saida",
                JOptionPane.YES_NO_OPTION
        );
        if (resp == 0) {
            jan2.dispose();
        }
    }
}
