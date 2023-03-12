package Tipoprimitivo;

import javax.swing.JOptionPane;

public class Leituragui {

    public static void main(String[] args) {
        int idade = 0;
        String aux = JOptionPane.showInputDialog("Insira uma idade");

        idade = Integer.parseInt(aux);

        JOptionPane.showMessageDialog(null, "Idade digitada: " + idade);
    }
}
