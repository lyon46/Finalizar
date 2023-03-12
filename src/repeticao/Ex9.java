package repeticao;

import javax.swing.*;

public class Ex9 {
    /*9) Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova. */
    public static void main(String[] args) {
        int idadeMaisNova = 0;
        String nomeMaisNova = "";

        for(int i = 0; i < 10; i++){
            String nome = JOptionPane.showInputDialog("Digite seu nome");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade"));
            if(idade > 0 || idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNova = nome;
            }
        }

        JOptionPane.showMessageDialog(null, "Pessoa mais nova: " + nomeMaisNova + " com: " + idadeMaisNova +" anos");
    }
}
