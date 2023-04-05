package repeticao;

import javax.swing.JOptionPane;

public class Ex4.1 {
    /*4) Leia o nome um número do usuário um número N e escreva o nome dele na tela N
    vezes. */
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        int numRepeticoes = Integer.parseInt(JOptionPane.showInputDialog("Quantas vezes precisa repertir o nome"));

         for(int i = 0; i < numRepeticoes; i++){
            System.out.println((i + 1) + "- Nome - " + nome);
    }
  }
}