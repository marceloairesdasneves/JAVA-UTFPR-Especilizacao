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

public class Janela1 implements ActionListener {

    private static JFrame jan1 = new JFrame("Titulo Inicial");

    private static JLabel rtVal1 = new JLabel("Rotulo Inicial 1");
    private static JLabel rtVal2 = new JLabel("Rotulo Inicial 2");
    private static JLabel rtResult = new JLabel("Rotulo Inicial 3");

    private static JTextField cxVal1 = new JTextField(15);
    private static JTextField cxVal2 = new JTextField(15);
    private static JTextField cxResult = new JTextField(15);

    private static JButton btSomar = new JButton("Somar");
    private static JButton btLimpar = new JButton("Texto Inicial");
    private static JButton btSair = new JButton("Texto Inicial");

    private static Janela1 jn1 = new Janela1();

    public static void main(String[] args) {
        criaJan();
    }

    public static void criaJan() {
        jan1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int larg = 500, alt = 200;
        jan1.setSize(larg, alt);
        jan1.setTitle("Calculadora");

        rtVal1.setText("Valor 1: ");
        cxVal1.setColumns(10);

        rtVal2.setText("Valor 2: ");
        cxVal2.setColumns(10);

        rtResult.setText(" = ");
        cxResult.setColumns(10);

        btLimpar.setText("Limpar");
        btSair.setText("Sair");
        btSomar.setText(" + ");

        jan1.add(rtVal1);
        jan1.add(cxVal1);

        jan1.add(rtVal2);
        jan1.add(cxVal2);

        jan1.add(rtResult);
        jan1.add(cxResult);

        jan1.add(btSomar);
        jan1.add(btLimpar);
        jan1.add(btSair);

        btSomar.addActionListener(jn1);
        btLimpar.addActionListener(jn1);
        btSair.addActionListener(jn1);

        jan1.setLayout(new FlowLayout());
        jan1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource().equals(btSomar)) {
            somar();
        }
        if (evt.getSource().equals(btLimpar)) {
            limpar();
        }
        if (evt.getSource().equals(btSair)) {
            sair();
        }

    }

    public void somar() {
        int a = Integer.parseInt(cxVal1.getText());
        int b = Integer.parseInt(cxVal2.getText());
        int c = (a + b);
        cxResult.setText(Integer.toString(c));
    }

    public void limpar() {
        cxVal1.setText("");
        cxVal2.setText("");
        cxResult.setText("");
        cxVal1.requestFocus();
    }

    public void sair() {
        int resp = JOptionPane.showConfirmDialog(
                null,
                "Deseja sair? ",
                "Confirmacao de saida",
                JOptionPane.YES_NO_OPTION
        );
        if (resp == 0) {
            jan1.dispose();
        }
    }
}
