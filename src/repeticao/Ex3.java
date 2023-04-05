package repeticao;

import javax.swing.*;

public class Ex3 {
    /*  leia o nome do usuario e escreva o nome na tela  10 vezes .*/
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        for(int i = 0; i < 10; i++){
            System.out.println("Nome: " + nome);
        }
    }
}
