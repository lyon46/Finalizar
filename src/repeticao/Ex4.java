package repeticao;

import javax.swing.*;

public class Ex4 {
    /*4) Leia o nome um número do usuário um número N e escreva o nome dele na tela N
    vezes. */

    public static void main(String[] args) {
        try{
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        int numRepeticoes = Integer.parseInt(JOptionPane.showInputDialog("Deseja repetir seu nome quantas vezes?"));
        for(int i = 0; i < numRepeticoes; i++){
            System.out.println((i + 1) + "- Nome - " + nome);
        }
    } catch (NumberFormatException e) {
     JOptionPane.showInputDialog("Digitou o nome errado");
    }
}
}