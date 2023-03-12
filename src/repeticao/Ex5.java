package repeticao;

import javax.swing.*;

public class Ex5 {
    /*5) Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses
    números. */
    public static void main(String[] args) {
        int soma = 0;
        for(int i = 0; i < 10; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
            soma += num;
        }
        System.out.println("Soma total: " + soma);
    }
}
