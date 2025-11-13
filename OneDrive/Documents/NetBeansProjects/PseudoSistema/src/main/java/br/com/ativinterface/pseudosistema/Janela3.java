package br.com.ativinterface.pseudosistema;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Janela3 implements ActionListener {

    private static JFrame jan3 = new JFrame("Titulo Inicial");

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
        Janela3 janela3 = new Janela3();
    }

    public Janela3() {//metodo construtor para chamar a referencia no this.
        jan3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int larg = 500, alt = 200;
        jan3.setSize(larg, alt);
        jan3.setTitle("Calculadora");

        rtVal1.setText("Valor 1: ");
        cxVal1.setColumns(10);

        rtVal2.setText("Valor 2: ");
        cxVal2.setColumns(10);

        rtResult.setText(" = ");
        cxResult.setColumns(10);

        btLimpar.setText("Limpar");
        btSair.setText("Sair");
        btSomar.setText(" + ");

        jan3.add(rtVal1);
        jan3.add(cxVal1);

        jan3.add(rtVal2);
        jan3.add(cxVal2);

        jan3.add(rtResult);
        jan3.add(cxResult);

        jan3.add(btSomar);
        jan3.add(btLimpar);
        jan3.add(btSair);

        btSomar.addActionListener(this);
        btLimpar.addActionListener(this);
        btSair.addActionListener(this);

        jan3.setLayout(new FlowLayout());
        jan3.setVisible(true);
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
            jan3.dispose();
        }
    }
}
